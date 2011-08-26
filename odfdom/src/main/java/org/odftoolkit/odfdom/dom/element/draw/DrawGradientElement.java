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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawDisplayNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStyleAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCxAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCyAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawAngleAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawBorderAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStartColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawEndColorAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStartIntensityAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawEndIntensityAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element draw:gradient}.
 *
 */
public abstract class DrawGradientElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DRAW, "gradient" );

	/**
	 * The value set of {@odf.attribute draw:style}.
	 */
	 public enum DrawStyleAttributeValue {
	 
	 AXIAL( DrawStyleAttribute.Value.AXIAL.toString() ), ELLIPSOID( DrawStyleAttribute.Value.ELLIPSOID.toString() ), LINEAR( DrawStyleAttribute.Value.LINEAR.toString() ), RADIAL( DrawStyleAttribute.Value.RADIAL.toString() ), RECTANGULAR( DrawStyleAttribute.Value.RECTANGULAR.toString() ), SQUARE( DrawStyleAttribute.Value.SQUARE.toString() );
              
		private String mValue;
	 	
		DrawStyleAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static DrawStyleAttributeValue enumValueOf( String value )
	    {
	        for( DrawStyleAttributeValue aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}

	/**
	 * Create the instance of <code>DrawGradientElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawGradientElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:gradient}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawGradientElement}
	 *
     * @param drawStyleAttributeValue  The mandatory attribute {@odf.attribute  draw:style}"
     *
	 */
	public void init(String drawStyleAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawNameAttribute()
	{
		DrawNameAttribute attr = (DrawNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawNameAttribute</code> , See {@odf.attribute draw:name}
	 *
	 * @param drawNameValue   The type is <code>String</code>
	 */
	public void setDrawNameAttribute( String drawNameValue )
	{
		DrawNameAttribute attr =  new DrawNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawDisplayNameAttribute()
	{
		DrawDisplayNameAttribute attr = (DrawDisplayNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "display-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawDisplayNameAttribute</code> , See {@odf.attribute draw:display-name}
	 *
	 * @param drawDisplayNameValue   The type is <code>String</code>
	 */
	public void setDrawDisplayNameAttribute( String drawDisplayNameValue )
	{
		DrawDisplayNameAttribute attr =  new DrawDisplayNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawDisplayNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStyleAttribute()
	{
		DrawStyleAttribute attr = (DrawStyleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "style" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStyleAttribute</code> , See {@odf.attribute draw:style}
	 *
	 * @param drawStyleValue   The type is <code>String</code>
	 */
	public void setDrawStyleAttribute( String drawStyleValue )
	{
		DrawStyleAttribute attr =  new DrawStyleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawStyleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCxAttribute</code> , See {@odf.attribute draw:cx}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCxAttribute()
	{
		DrawCxAttribute attr = (DrawCxAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "cx" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCxAttribute</code> , See {@odf.attribute draw:cx}
	 *
	 * @param drawCxValue   The type is <code>String</code>
	 */
	public void setDrawCxAttribute( String drawCxValue )
	{
		DrawCxAttribute attr =  new DrawCxAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawCxValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCyAttribute</code> , See {@odf.attribute draw:cy}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCyAttribute()
	{
		DrawCyAttribute attr = (DrawCyAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "cy" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCyAttribute</code> , See {@odf.attribute draw:cy}
	 *
	 * @param drawCyValue   The type is <code>String</code>
	 */
	public void setDrawCyAttribute( String drawCyValue )
	{
		DrawCyAttribute attr =  new DrawCyAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawCyValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawAngleAttribute</code> , See {@odf.attribute draw:angle}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawAngleAttribute()
	{
		DrawAngleAttribute attr = (DrawAngleAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "angle" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawAngleAttribute</code> , See {@odf.attribute draw:angle}
	 *
	 * @param drawAngleValue   The type is <code>String</code>
	 */
	public void setDrawAngleAttribute( String drawAngleValue )
	{
		DrawAngleAttribute attr =  new DrawAngleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawAngleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawBorderAttribute</code> , See {@odf.attribute draw:border}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawBorderAttribute()
	{
		DrawBorderAttribute attr = (DrawBorderAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "border" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawBorderAttribute</code> , See {@odf.attribute draw:border}
	 *
	 * @param drawBorderValue   The type is <code>String</code>
	 */
	public void setDrawBorderAttribute( String drawBorderValue )
	{
		DrawBorderAttribute attr =  new DrawBorderAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawBorderValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStartColorAttribute</code> , See {@odf.attribute draw:start-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStartColorAttribute()
	{
		DrawStartColorAttribute attr = (DrawStartColorAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "start-color" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStartColorAttribute</code> , See {@odf.attribute draw:start-color}
	 *
	 * @param drawStartColorValue   The type is <code>String</code>
	 */
	public void setDrawStartColorAttribute( String drawStartColorValue )
	{
		DrawStartColorAttribute attr =  new DrawStartColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawStartColorValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawEndColorAttribute</code> , See {@odf.attribute draw:end-color}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawEndColorAttribute()
	{
		DrawEndColorAttribute attr = (DrawEndColorAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "end-color" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawEndColorAttribute</code> , See {@odf.attribute draw:end-color}
	 *
	 * @param drawEndColorValue   The type is <code>String</code>
	 */
	public void setDrawEndColorAttribute( String drawEndColorValue )
	{
		DrawEndColorAttribute attr =  new DrawEndColorAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawEndColorValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStartIntensityAttribute</code> , See {@odf.attribute draw:start-intensity}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStartIntensityAttribute()
	{
		DrawStartIntensityAttribute attr = (DrawStartIntensityAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "start-intensity" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStartIntensityAttribute</code> , See {@odf.attribute draw:start-intensity}
	 *
	 * @param drawStartIntensityValue   The type is <code>String</code>
	 */
	public void setDrawStartIntensityAttribute( String drawStartIntensityValue )
	{
		DrawStartIntensityAttribute attr =  new DrawStartIntensityAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawStartIntensityValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawEndIntensityAttribute</code> , See {@odf.attribute draw:end-intensity}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawEndIntensityAttribute()
	{
		DrawEndIntensityAttribute attr = (DrawEndIntensityAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "end-intensity" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawEndIntensityAttribute</code> , See {@odf.attribute draw:end-intensity}
	 *
	 * @param drawEndIntensityValue   The type is <code>String</code>
	 */
	public void setDrawEndIntensityAttribute( String drawEndIntensityValue )
	{
		DrawEndIntensityAttribute attr =  new DrawEndIntensityAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawEndIntensityValue );
	}

}
