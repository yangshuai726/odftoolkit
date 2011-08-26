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

package org.odftoolkit.odfdom.dom.element.svg;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgOffsetAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgStopColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgStopOpacityAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element svg:stop}.
 *
 */
public abstract class SvgStopElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.SVG, "stop" );


	/**
	 * Create the instance of <code>SvgStopElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public SvgStopElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element svg:stop}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  SvgStopElement}
	 *
     * @param svgOffsetAttributeValue  The mandatory attribute {@odf.attribute  svg:offset}"
     *
	 */
	public void init(String svgOffsetAttributeValue)
	{
		setSvgOffsetAttribute( svgOffsetAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgOffsetAttribute</code> , See {@odf.attribute svg:offset}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgOffsetAttribute()
	{
		SvgOffsetAttribute attr = (SvgOffsetAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "offset" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgOffsetAttribute</code> , See {@odf.attribute svg:offset}
	 *
	 * @param svgOffsetValue   The type is <code>String</code>
	 */
	public void setSvgOffsetAttribute( String svgOffsetValue )
	{
		SvgOffsetAttribute attr =  new SvgOffsetAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgOffsetValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgStopColorAttribute</code> , See {@odf.attribute svg:stop-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgStopColorAttribute()
	{
		SvgStopColorAttribute attr = (SvgStopColorAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "stop-color" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgStopColorAttribute</code> , See {@odf.attribute svg:stop-color}
	 *
	 * @param svgStopColorValue   The type is <code>String</code>
	 */
	public void setSvgStopColorAttribute( String svgStopColorValue )
	{
		SvgStopColorAttribute attr =  new SvgStopColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgStopColorValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgStopOpacityAttribute</code> , See {@odf.attribute svg:stop-opacity}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getSvgStopOpacityAttribute()
	{
		SvgStopOpacityAttribute attr = (SvgStopOpacityAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "stop-opacity" ) );
		if( attr != null ){
			return Double.valueOf( attr.doubleValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgStopOpacityAttribute</code> , See {@odf.attribute svg:stop-opacity}
	 *
	 * @param svgStopOpacityValue   The type is <code>Double</code>
	 */
	public void setSvgStopOpacityAttribute( Double svgStopOpacityValue )
	{
		SvgStopOpacityAttribute attr =  new SvgStopOpacityAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setDoubleValue( svgStopOpacityValue.doubleValue() );
	}

}
