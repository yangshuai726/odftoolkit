/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    
package org.odftoolkit.odfdom.dom.attribute.form;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.element.form.FormButtonElement;
import org.odftoolkit.odfdom.dom.element.form.FormCheckboxElement;
import org.odftoolkit.odfdom.dom.element.form.FormComboboxElement;
import org.odftoolkit.odfdom.dom.element.form.FormDateElement;
import org.odftoolkit.odfdom.dom.element.form.FormFileElement;
import org.odftoolkit.odfdom.dom.element.form.FormFormattedTextElement;
import org.odftoolkit.odfdom.dom.element.form.FormHiddenElement;
import org.odftoolkit.odfdom.dom.element.form.FormImageElement;
import org.odftoolkit.odfdom.dom.element.form.FormNumberElement;
import org.odftoolkit.odfdom.dom.element.form.FormOptionElement;
import org.odftoolkit.odfdom.dom.element.form.FormPasswordElement;
import org.odftoolkit.odfdom.dom.element.form.FormRadioElement;
import org.odftoolkit.odfdom.dom.element.form.FormTextElement;
import org.odftoolkit.odfdom.dom.element.form.FormTextareaElement;
import org.odftoolkit.odfdom.dom.element.form.FormTimeElement;
import org.odftoolkit.odfdom.dom.element.form.FormValueRangeElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute form:value}.
 *
 */
public class FormValueAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.newName( OdfNamespaceNames.FORM, "value" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute form:value}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public FormValueAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute form:value}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 * @throws IllegalArgumentException If the provided attribute value is invalid
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof FormButtonElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormCheckboxElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormComboboxElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormDateElement ){
					//2DO: need validate value against Date
					super.setValue(attrValue);
				}else if( parentElement instanceof FormFileElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormFormattedTextElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormHiddenElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormImageElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormNumberElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormOptionElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormPasswordElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormRadioElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormTextElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormTextareaElement ){
					super.setValue(attrValue);
				}else if( parentElement instanceof FormTimeElement ){
					//2DO: need validate value against Time
					super.setValue(attrValue);
				}else if( parentElement instanceof FormValueRangeElement ){
					super.setValue(attrValue);
				}			
			} catch (NullPointerException e) {
				// TODO: validation handling/logging
				throw new IllegalArgumentException(e);
			}
			  catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof FormButtonElement ){
					return super.getValue();
				}else if( parentElement instanceof FormCheckboxElement ){
					return super.getValue();
				}else if( parentElement instanceof FormComboboxElement ){
					return super.getValue();
				}else if( parentElement instanceof FormDateElement ){
					//2DO: need validate value against Date
					return super.getValue();
				}else if( parentElement instanceof FormFileElement ){
					return super.getValue();
				}else if( parentElement instanceof FormFormattedTextElement ){
					return super.getValue();
				}else if( parentElement instanceof FormHiddenElement ){
					return super.getValue();
				}else if( parentElement instanceof FormImageElement ){
					return super.getValue();
				}else if( parentElement instanceof FormNumberElement ){
					
					return super.getValue();
				}else if( parentElement instanceof FormOptionElement ){
					return super.getValue();
				}else if( parentElement instanceof FormPasswordElement ){
					return super.getValue();
				}else if( parentElement instanceof FormRadioElement ){
					return super.getValue();
				}else if( parentElement instanceof FormTextElement ){
					return super.getValue();
				}else if( parentElement instanceof FormTextareaElement ){
					return super.getValue();
				}else if( parentElement instanceof FormTimeElement ){
					//2DO: need validate value against Time
					return super.getValue();
				}else if( parentElement instanceof FormValueRangeElement ){
					return super.getValue();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of form:value is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	
	/**
	 * Returns the default value of {@odf.attribute form:value}.
	 * 
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}
	
	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if {@odf.attribute form:value} has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
