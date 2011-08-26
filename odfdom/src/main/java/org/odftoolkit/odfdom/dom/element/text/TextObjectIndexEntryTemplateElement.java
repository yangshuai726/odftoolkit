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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextStyleNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:object-index-entry-template}.
 *
 */
public abstract class TextObjectIndexEntryTemplateElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TEXT, "object-index-entry-template" );


	/**
	 * Create the instance of <code>TextObjectIndexEntryTemplateElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextObjectIndexEntryTemplateElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.Paragraph, OdfName.newName(OdfNamespaceNames.TEXT, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:object-index-entry-template}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextObjectIndexEntryTemplateElement}
	 *
     * @param textStyleNameAttributeValue  The mandatory attribute {@odf.attribute  text:style-name}"
     *
	 */
	public void init(String textStyleNameAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStyleNameAttribute()
	{
		TextStyleNameAttribute attr = (TextStyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.TEXT), "style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStyleNameAttribute</code> , See {@odf.attribute text:style-name}
	 *
	 * @param textStyleNameValue   The type is <code>String</code>
	 */
	public void setTextStyleNameAttribute( String textStyleNameValue )
	{
		TextStyleNameAttribute attr =  new TextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStyleNameValue );
	}

	/**
	 * Create child element {@odf.element text:index-entry-chapter}.
	 *
	 * @return   return  the element {@odf.element text:index-entry-chapter}
	 * DifferentQName 
	 */
	public TextIndexEntryChapterElement newTextIndexEntryChapterElement()
	{
		TextIndexEntryChapterElement  textIndexEntryChapter = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexEntryChapterElement.class);
		this.appendChild( textIndexEntryChapter);
		return  textIndexEntryChapter;
	}                   
               
	/**
	 * Create child element {@odf.element text:index-entry-page-number}.
	 *
	 * @return   return  the element {@odf.element text:index-entry-page-number}
	 * DifferentQName 
	 */
	public TextIndexEntryPageNumberElement newTextIndexEntryPageNumberElement()
	{
		TextIndexEntryPageNumberElement  textIndexEntryPageNumber = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexEntryPageNumberElement.class);
		this.appendChild( textIndexEntryPageNumber);
		return  textIndexEntryPageNumber;
	}                   
               
	/**
	 * Create child element {@odf.element text:index-entry-text}.
	 *
	 * @return   return  the element {@odf.element text:index-entry-text}
	 * DifferentQName 
	 */
	public TextIndexEntryTextElement newTextIndexEntryTextElement()
	{
		TextIndexEntryTextElement  textIndexEntryText = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexEntryTextElement.class);
		this.appendChild( textIndexEntryText);
		return  textIndexEntryText;
	}                   
               
	/**
	 * Create child element {@odf.element text:index-entry-span}.
	 *
	 * @return   return  the element {@odf.element text:index-entry-span}
	 * DifferentQName 
	 */
	public TextIndexEntrySpanElement newTextIndexEntrySpanElement()
	{
		TextIndexEntrySpanElement  textIndexEntrySpan = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexEntrySpanElement.class);
		this.appendChild( textIndexEntrySpan);
		return  textIndexEntrySpan;
	}                   
               
	/**
	 * Create child element {@odf.element text:index-entry-tab-stop}.
	 *
     * @param styleTypeAttributeValue  the <code>String</code> value of <code>StyleTypeAttribute</code>, see {@odf.attribute  style:type} at specification
	 * @return   return  the element {@odf.element text:index-entry-tab-stop}
	 * DifferentQName 
	 */
    
	public TextIndexEntryTabStopElement newTextIndexEntryTabStopElement(String styleTypeAttributeValue)
	{
		TextIndexEntryTabStopElement  textIndexEntryTabStop = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexEntryTabStopElement.class);
		textIndexEntryTabStop.setStyleTypeAttribute( styleTypeAttributeValue );
		this.appendChild( textIndexEntryTabStop);
		return  textIndexEntryTabStop;      
	}
    
	/**
	 * Create child element {@odf.element text:index-entry-tab-stop}.
	 *
     * @param stylePositionAttributeValue  the <code>String</code> value of <code>StylePositionAttribute</code>, see {@odf.attribute  style:position} at specification
	 * @param styleTypeAttributeValue  the <code>String</code> value of <code>StyleTypeAttribute</code>, see {@odf.attribute  style:type} at specification
	 * @return   return  the element {@odf.element text:index-entry-tab-stop}
	 * DifferentQName 
	 */
    
	public TextIndexEntryTabStopElement newTextIndexEntryTabStopElement(String stylePositionAttributeValue, String styleTypeAttributeValue)
	{
		TextIndexEntryTabStopElement  textIndexEntryTabStop = ((OdfFileDom)this.ownerDocument).newOdfElement(TextIndexEntryTabStopElement.class);
		textIndexEntryTabStop.setStylePositionAttribute( stylePositionAttributeValue );
		textIndexEntryTabStop.setStyleTypeAttribute( styleTypeAttributeValue );
		this.appendChild( textIndexEntryTabStop);
		return  textIndexEntryTabStop;      
	}
    
}
