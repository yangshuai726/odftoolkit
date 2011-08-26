/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2009, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/
package schema2template.model;

import com.sun.msv.grammar.AttributeExp;
import com.sun.msv.grammar.DataExp;
import com.sun.msv.grammar.ElementExp;
import com.sun.msv.grammar.Expression;
import com.sun.msv.grammar.NameClassAndExpression;
import com.sun.msv.grammar.ValueExp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * One of the following RelaxNG definitions of an Element, Attribute, Value or Datatype.
 *
 * <p>Each PuzzlePiece encapsulates one MSV Expression. Two PuzzlePiece can share
 * the same MSV Expression (RelaxNG pattern:
 * &lt;element&gt;&lt;choice&gt;&lt;name&gt;aName&lt;/name&gt;&lt;name&gt;anotherName&lt;/name&gt;&lt;/choice&gt;&lt;/element&gt;)
 * </p>
 * <p>Conventions: <ul>
 * <li>hashCode uses the hashCode from the encapsulated Expressions. So two Definitions (rarely) can
 * have the same hashCode. Equals uses Name _and_ hashCode.</li>
 * <li>Sorting is done by ns:local tag names as first key and hashCode as second key.</li>
 * <li>All returned PuzzlePieceSet objects are immutable to protect them against
 * naive usage in velocity templates</li></ul></p>
 */
public class PuzzlePiece implements Comparable<PuzzlePiece>, QNamedPuzzleComponent {

    private static MSVExpressionVisitorType TYPE_VISITOR = new MSVExpressionVisitorType();
    private static MSVNameClassVisitorList NAME_VISITOR = new MSVNameClassVisitorList();
    private Expression mExpression;

    // all multiples of this tagname (contains only this if there are no multiples)
    private PuzzlePieceSet mMultiples = new PuzzlePieceSet();
    // definitions of elements which can have this as children
    private PuzzlePieceSet mParents = new PuzzlePieceSet();
    
    // DEFINITION CONTENT

    // ns:local tagname
    private String mName;

    /* Properties for PuzzlePiece of Type.ELEMENT */
    private PuzzlePieceSet mChildElements = new PuzzlePieceSet();
    private HashSet<String> mMandatoryChildElementNames = new HashSet<String>();
    private PuzzlePieceSet mAttributes = new PuzzlePieceSet();
    private HashSet<String> mMandatoryChildAttributeNames = new HashSet<String>();
    private boolean mCanHaveText = false;
    private Set<Expression> mSingletonChildExpressions;
    private Set<Expression> mMultipleChildExpressions;

    /* Properties for PuzzlePiece of Type.ATTRIBUTE */
    // Values like "left", "centered", "right"
    private PuzzlePieceSet mValues = new PuzzlePieceSet();
    // generic Data Types like "string", "countryCode", ...
    private PuzzlePieceSet mDatatypes = new PuzzlePieceSet();

    private PuzzlePiece(Expression exp, String name) {
        mExpression = exp;
        mName = name;
    }

    private PuzzlePiece(Expression exp) {
        mExpression = exp;
        MSVExpressionType type = (MSVExpressionType) exp.visit(TYPE_VISITOR);
        if (type == MSVExpressionType.ATTRIBUTE || type == MSVExpressionType.ELEMENT) {
            List<String> names = (List<String>) ((NameClassAndExpression) exp).getNameClass().visit(NAME_VISITOR);
            if (names == null || names.size()!=1) {
                throw new RuntimeException("Definition: ELEMENT or ATTRIBUTE expression exp with none or more than one name is only allowed in this(exp, name)");
            }
            mName = names.get(0);
        }
        if (type == MSVExpressionType.VALUE) {
            mName = ((ValueExp) exp).value.toString();
        }
        if (type == MSVExpressionType.DATA) {
            mName = ((DataExp) exp).getName().localName;
        }
    }

    /**
     * Uses the name and the wrapped MSV Expression to test for equality.
     *
     * @param b Another object
     * @return Whether both objects equal
     */
    @Override
    public boolean equals(Object b) {
        if (b instanceof PuzzlePiece) {
            PuzzlePiece d = (PuzzlePiece) b;
            if (d.mName.equals(mName) && d.mExpression.equals(mExpression)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Uses the wrapped MSV Expression for the hashCode. MSV Expressions are numbered consecutively by a distinct Hash Code.
     */
    @Override
    public int hashCode() {
        return mExpression.hashCode();
    }

    /**
     * Uses the ns:local name of the wrapped MSV Expression as first key and the hashCode as second key.
     * If o1.equals(o2) this method will return 0 (since both must share the same Expression and name).
     *
     * @param o Other Object
     * @return Comparison
     */
    @Override
    public int compareTo(PuzzlePiece o) {
        int retval = mName.compareTo(o.mName);
        if (retval != 0) {
            return retval;
        }
        return hashCode() - o.hashCode();
    }

    /*
     * Return whether the content of this and of another PuzzlePiece are equal.
     *
     * Content is everything that's inside a RelaxNG definition block. So child
     * elements, attributes, data types, name, definition type are all content.
     * Parent elements or multiples are no content information as they're
     * outside the RelaxNG definition block.
     *
     * This method is useful for reduction of Multiples with identical
     * definition content.
     *
     * No recursive checking: E.g. the child element DefinitionSets have to be really
     * equal to let this.contentEquals(other) be true. So PuzzlePiece reduction
     * has to be bottom up (VALUES, DATATYPES -> ATTRIBUTES -> ELEMENTS) and reduction
     * of ELEMENT definitions is not really possible (how to go bottom up in
     * ELEMENT tree?)
     */
    protected boolean contentEquals(PuzzlePiece other) {
        if (!mName.equals(other.mName)) return false;
        if (!getType().equals(other.getType())) return false;
        if (mCanHaveText != other.mCanHaveText) return false;
        if (!mChildElements.equals(other.mChildElements)) return false;
        if (!mAttributes.equals(other.mAttributes)) return false;
        if (!mMandatoryChildElementNames.equals(other.mMandatoryChildElementNames)) return false;
        if (!mMandatoryChildAttributeNames.equals(other.mMandatoryChildAttributeNames)) return false;
        if (!mValues.equals(other.mValues)) return false;
        if (!mDatatypes.equals(other.mDatatypes)) return false;
        return true;
    }

    /**
     * Gets the ns:local tag name of this PuzzlePiece
     *
     * @return The tag name
     */
    @Override
    public String getQName() {
        return mName;
    }

    @Override
    public String getLocalName() {
        return XMLModel.extractLocalname(mName);
    }

    @Override
    public String getNamespace() {
        return XMLModel.extractNamespace(mName);
    }

    /**
     * <p>Returns String representation (convenient method for getQName())</p>
     *
     * <p>Template Usage: Just use $aDefinition as you would use a string variable.</p>
     */
    @Override
    public String toString() {
        return getQName();
    }

    /**
     * Gets the type of this (ELEMENT, ATTRIBUTE, DATA, VALUE)
     *
     * @return The ExpressionType of this PuzzlePiece
     */
    @Override
    public MSVExpressionType getType() {
        return (MSVExpressionType) mExpression.visit(TYPE_VISITOR);
    }

    /**
     * Gets the wrapped Expression
     *
     * @return The Expression wrapped by this.
     */
    public Expression getExpression() {
        return mExpression;
    }

    /**
     * Determines whether this Element can have a text node as child
     */
    @Override
    public boolean canHaveText() {
        return mCanHaveText;
    }

    @Override
    public boolean isSingleton(PuzzleComponent child) {
        for (PuzzlePiece element : child.getCollection()) {
            if (mMultipleChildExpressions.contains(element.getExpression())) {
                return false;
            }
            if (!mSingletonChildExpressions.contains(element.getExpression())) {
                throw new RuntimeException("Definition.isSingleton: Unknown child element.");
            }
        }
        return true;
    }

    @Override
    public Collection<PuzzlePiece> getCollection() {
        return Collections.singletonList(this);
    }

    /**
     * Gets the List of Definitions which share the same tag name, but are defined multiple times in the schema.
     * The list is type specific, i.e. an ATTRIBUTE can never be a multiple of an ELEMENT.
     *
     * @return The list of Definitions which share the same tag name.
     */
    public PuzzlePieceSet withMultiples() {
        return mMultiples;
    }

    /**
     * Gets the index of 'this' in the List of Definitions returned by withMultiples()
     *
     * @return Index of this PuzzlePiece object in the PuzzlePieceSet returned by withMultiples()
     */
    public int getMultipleNumber() {
        int retval = 0;
        Iterator<PuzzlePiece> iter = mMultiples.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(this)) {
                return retval;
            }
            retval++;
        }
        throw new RuntimeException("aDefinition.getMultipleNumber: Internal error");
    }

    /**
     * Gets the Parents which can contain this PuzzlePiece as a child
     *
     * @return The parent Definitions
     */
    @Override
    public PuzzlePieceSet getParents() {
        return mParents;
    }

    /**
     * Gets the child elements of this PuzzlePiece. Please note that only Definitions of type ELEMENT can have child elements.
     *
     * @return The child Definitions of type ELEMENT
     */
    @Override
    public PuzzlePieceSet getChildElements() {
        return mChildElements;
    }

    @Override
    public boolean isMandatory(QNamedPuzzleComponent child) {
        switch (child.getType()) {
            case ATTRIBUTE:
                if (mMandatoryChildAttributeNames.contains(child.getQName())) {
                    return true;
                }
                break;
            case ELEMENT:
                if (mMandatoryChildElementNames.contains(child.getQName())) {
                    return true;
                }
                break;
        }
        return false;
    }

    /**
     * Gets the Attributes of this PuzzlePiece. Please note that only Definitions of type ELEMENT can have attributes.
     *
     * @return The child Definitions of type ATTRIBUTE
     */
    @Override
    public PuzzlePieceSet getAttributes() {
        return mAttributes;
    }

    /**
     * Gets the defined constant values. Please note that only Definitions of type ATTRIBUTE can have values.
     *
     * @return The constant values
     */
    @Override
    public PuzzlePieceSet getValues() {
        return mValues;
    }

    /**
     * Gets the defined datatypes. Please note that only Definitions of type ATTRIBUTE can have datatypes.
     *
     * @return The datatypes
     */
    @Override
    public PuzzlePieceSet getDatatypes() {
        return mDatatypes;
    }


    /*
     * ---------------------------------------------------------------------------
     *  PuzzlePiece Factory
     * ---------------------------------------------------------------------------
     */
    /**
     * Creates all PuzzlePiece objects from MSV root tree.
     *
     * The PuzzlePiece objects are all made immutable to protect them
     * against changes by naive template usage. Note that the Sets of all elements/attributes
     * can only be made immutable by the caller after this method run.
     *
     * @param root MSV root Expression
     * @param emptyElementSet empty Set. Will be filled with Definitions of Type.ELEMENT
     * @param emptyAttributeSet empty Set. Will be filled with Definitions of Type.ATTRIBUTE
     */
    public static void extractPuzzlePieces(Expression root, PuzzlePieceSet emptyElementSet, PuzzlePieceSet emptyAttributeSet) {
        extractTypedPuzzlePieces(root, emptyElementSet, ElementExp.class);
        extractTypedPuzzlePieces(root, emptyAttributeSet, AttributeExp.class);
        configureProperties(emptyElementSet, emptyAttributeSet);
        reduceDatatypes(emptyAttributeSet);
        reduceValues(emptyAttributeSet);
        reduceAttributes(emptyElementSet, emptyAttributeSet);
        makePuzzlePiecesImmutable(emptyElementSet);
        makePuzzlePiecesImmutable(emptyAttributeSet);
    }

    // Extracts all Definitions of Type [ATTRIBUTE, ELEMENT] from MSV tree.
    private static void extractTypedPuzzlePieces(Expression root, PuzzlePieceSet setToBeFilled, Class superclass) {
        MSVExpressionIterator iter = new MSVExpressionIterator(root, superclass);
        HashMap<String, List<PuzzlePiece>> multipleMap = new HashMap<String, List<PuzzlePiece>>();

        while (iter.hasNext()) {
            Expression exp = iter.next();

            // If there is more than one name for this expression, create more than one PuzzlePiece
            List<String> names = (List<String>) ((NameClassAndExpression) exp).getNameClass().visit(NAME_VISITOR);

            for (String name : names) {
                if (name.length() == 0) {
                    throw new RuntimeException("Unnamed ELEMENT or ATTRIBUTE expression.");
                }

                // Create and store new definition
                PuzzlePiece newDefinition = new PuzzlePiece(exp, name);

                setToBeFilled.add(newDefinition);

                // Check for multiples
                List<PuzzlePiece> multiples = multipleMap.get(name);
                if (multiples != null) {
                    multiples.add(newDefinition);
                } else {
                    multiples = new ArrayList<PuzzlePiece>(1);
                    multiples.add(newDefinition);
                    multipleMap.put(name, multiples);
                }
            }

        }

        // Fills multiple information
        Iterator<PuzzlePiece> defIter = setToBeFilled.iterator();
        while (defIter.hasNext()) {
            PuzzlePiece def = defIter.next();
            def.mMultiples = new PuzzlePieceSet(multipleMap.get(def.getQName()));
        }
    }

    // Builds Map Expression->List<PuzzlePiece>
    private static Map<Expression, List<PuzzlePiece>> buildReverseMap(PuzzlePieceSet defs) {
        Map<Expression, List<PuzzlePiece>> retval = new HashMap<Expression, List<PuzzlePiece>>();
        Iterator<PuzzlePiece> iter = defs.iterator();
        while (iter.hasNext()) {
            PuzzlePiece def = iter.next();
            List<PuzzlePiece> list = retval.get(def.getExpression());
            if (list == null) {
                list = new ArrayList<PuzzlePiece>();
                retval.put(def.getExpression(), list);
            }
            list.add(def);
        }
        return retval;
    }

    // Builds Map Name->List<Expression>
    private static Map<String, List<Expression>> buildNameExpressionsMap(PuzzlePieceSet defs) {
        Map<String, List<Expression>> retval = new HashMap<String, List<Expression>>();
        Iterator<PuzzlePiece> iter = defs.iterator();
        while (iter.hasNext()) {
            PuzzlePiece def = iter.next();
            List<Expression> list = retval.get(def.getQName());
            if (list == null) {
                list = new ArrayList<Expression>();
                retval.put(def.getQName(), list);
            }
            list.add(def.getExpression());
        }
        return retval;
    }


    // Unite Value Definitions with equal content. Has to be last step (after Value Definitions have been assigned to Attributes)
    private static void reduceValues(PuzzlePieceSet attributes) {
        PuzzlePieceSet values = new PuzzlePieceSet();
        for (PuzzlePiece attr : attributes) {
            values.addAll(attr.getValues());
        }
        Map<PuzzlePiece, PuzzlePiece> lostToSurvived = values.uniteDefinitionsWithEqualContent();
        for (PuzzlePiece attr : attributes) {
            PuzzlePieceSet attributeValues = attr.getValues();
            PuzzlePieceSet immutable = new PuzzlePieceSet(attributeValues);
            for (PuzzlePiece value : immutable) {
                if (lostToSurvived.containsKey(value)) {
                    // Replace lost with survived
                    attributeValues.remove(value);
                    attributeValues.add(lostToSurvived.get(value));
                }
            }
        }
    }

    // Unite Datatype Definitions with equal content. Has to be last step (after Datatype Definitions have been assigned to Attributes).
    // Has to be even after reduceValues and reduceDatatypes, otherwise some attributes do not seem to have equal content
    private static void reduceDatatypes(PuzzlePieceSet attributes) {
        PuzzlePieceSet datatypes = new PuzzlePieceSet();
        for (PuzzlePiece attr : attributes) {
            datatypes.addAll(attr.getDatatypes());
        }
        Map<PuzzlePiece, PuzzlePiece> lostToSurvived = datatypes.uniteDefinitionsWithEqualContent();
        for (PuzzlePiece attr : attributes) {
            PuzzlePieceSet attributeDatatypes = attr.getValues();
            PuzzlePieceSet immutable = new PuzzlePieceSet(attributeDatatypes);
            for (PuzzlePiece datatype : immutable) {
                if (lostToSurvived.containsKey(datatype)) {
                    // Replace lost with survived
                    attributeDatatypes.remove(datatype);
                    attributeDatatypes.add(lostToSurvived.get(datatype));
                }
            }
        }
    }

    // Unite Attribute Definitions with equal content. Has to be last step (after Attribute Definitions have been assigned to Elements)
    private static void reduceAttributes(PuzzlePieceSet elements, PuzzlePieceSet attributes) {
        Map<PuzzlePiece, PuzzlePiece> lostToSurvived = attributes.uniteDefinitionsWithEqualContent();
        for (PuzzlePiece el : elements) {
            PuzzlePieceSet elementAttributes = el.getAttributes();
            PuzzlePieceSet immutable = new PuzzlePieceSet(elementAttributes);
            for (PuzzlePiece attribute : immutable) {
                if (lostToSurvived.containsKey(attribute)) {
                    // Replace lost with survived
                    elementAttributes.remove(attribute);
                    elementAttributes.add(lostToSurvived.get(attribute));
                }
            }
        }
    }

    // Sets Children, Attributes and Parents.
    private static void configureProperties(PuzzlePieceSet elements, PuzzlePieceSet attributes) {
        Map<Expression, List<PuzzlePiece>> reverseElementMap = buildReverseMap(elements);
        Map<Expression, List<PuzzlePiece>> reverseAttributeMap = buildReverseMap(attributes);

        // Handle Element Definitions
        Iterator<PuzzlePiece> iter = elements.iterator();
        while (iter.hasNext()) {
            PuzzlePiece def = iter.next();
            MSVExpressionIterator childFinder = new MSVExpressionIterator(def.getExpression(), NameClassAndExpression.class, MSVExpressionIterator.DIRECT_CHILDREN_ONLY);
            while (childFinder.hasNext()) {
                Expression child_exp = childFinder.next();
                List<PuzzlePiece> child_defs = null;
                PuzzlePieceSet whereToAdd = null;
                if (child_exp instanceof ElementExp) {
                    child_defs = reverseElementMap.get(child_exp);
                    whereToAdd = def.mChildElements;
                } else if (child_exp instanceof AttributeExp) {
                    child_defs = reverseAttributeMap.get(child_exp);
                    whereToAdd = def.mAttributes;
                }
                if (child_defs != null) {
                    whereToAdd.addAll(child_defs);
                    for (PuzzlePiece child_def : child_defs) {
                        child_def.mParents.add(def);
                    }
                }
            }
            MSVExpressionInformation elementInfo = new MSVExpressionInformation(def.getExpression());
            def.mCanHaveText = elementInfo.canHaveText();

            Map<String, List<Expression>> atnameToDefs = buildNameExpressionsMap(def.mAttributes);
            for (String name : atnameToDefs.keySet()) {
                if (elementInfo.isMandatory(atnameToDefs.get(name))) {
                    def.mMandatoryChildAttributeNames.add(name);
                }
            }

            Map<String, List<Expression>> elnameToDefs = buildNameExpressionsMap(def.mChildElements);
            for (String name : elnameToDefs.keySet()) {
                if (elementInfo.isMandatory(elnameToDefs.get(name))) {
                    def.mMandatoryChildElementNames.add(name);
                }
            }

            def.mSingletonChildExpressions = elementInfo.getSingletons();
            def.mMultipleChildExpressions = elementInfo.getMultiples();

        }

        // Handle Attribute Definitions
        Iterator<PuzzlePiece> aiter = attributes.iterator();
        while (aiter.hasNext()) {
            PuzzlePiece def = aiter.next();

            MSVExpressionIterator datatypeFinder = new MSVExpressionIterator(def.getExpression(), DataExp.class, MSVExpressionIterator.DIRECT_CHILDREN_ONLY);
            while (datatypeFinder.hasNext()) {
                DataExp data_exp = (DataExp) datatypeFinder.next();
                def.mDatatypes.add(new PuzzlePiece(data_exp));
            }

            MSVExpressionIterator valueFinder = new MSVExpressionIterator(def.getExpression(), ValueExp.class, MSVExpressionIterator.DIRECT_CHILDREN_ONLY);
            while (valueFinder.hasNext()) {
                ValueExp value_exp = (ValueExp) valueFinder.next();
                if (value_exp.getName().localName.equals("token")) {
                    def.mValues.add(new PuzzlePiece(value_exp));
                }
            }

        }

    }

    // Makes all Definitions unmodifiable
    private static void makePuzzlePiecesImmutable(PuzzlePieceSet defs) {
        Iterator<PuzzlePiece> iter = defs.iterator();
        while (iter.hasNext()) {
            PuzzlePiece def = iter.next();
            def.mAttributes.makeImmutable();
            def.mChildElements.makeImmutable();
            def.mMultiples.makeImmutable();
            def.mParents.makeImmutable();
            def.mValues.makeImmutable();
            def.mDatatypes.makeImmutable();
        }
        defs.makeImmutable();
    }
}
