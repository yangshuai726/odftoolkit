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
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgX1Attribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgY1Attribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStartShapeAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawStartGluePointAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgX2Attribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgY2Attribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawEndShapeAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawEndGluePointAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLineSkewAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgDAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawLayerAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTransformAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawTextStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgViewBoxAttribute;

import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:connector}.
 *
 */
public abstract class DrawConnectorElement extends DrawShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.DRAW, "connector" );

	/**
	 * The value set of {@odf.attribute draw:type}.
	 */
	 public enum DrawTypeAttributeValue {
	 
	 CURVE( DrawTypeAttribute.Value.CURVE.toString() ), LINE( DrawTypeAttribute.Value.LINE.toString() ), LINES( DrawTypeAttribute.Value.LINES.toString() ), STANDARD( DrawTypeAttribute.Value.STANDARD.toString() );
              
		private String mValue;
	 	
		DrawTypeAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static DrawTypeAttributeValue enumValueOf( String value )
	    {
	        for( DrawTypeAttributeValue aIter : values() )
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
	 * Create the instance of <code>DrawConnectorElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawConnectorElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:connector}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DrawConnectorElement}
	 *
     * @param svgViewBoxAttributeValue  The mandatory attribute {@odf.attribute  svg:viewBox}"
     *
	 */
	public void init(String svgViewBoxAttributeValue)
	{
		setSvgViewBoxAttribute( svgViewBoxAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawTypeAttribute</code> , See {@odf.attribute draw:type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTypeAttribute()
	{
		DrawTypeAttribute attr = (DrawTypeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "type" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTypeAttribute</code> , See {@odf.attribute draw:type}
	 *
	 * @param drawTypeValue   The type is <code>String</code>
	 */
	public void setDrawTypeAttribute( String drawTypeValue )
	{
		DrawTypeAttribute attr =  new DrawTypeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawTypeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgX1Attribute</code> , See {@odf.attribute svg:x1}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgX1Attribute()
	{
		SvgX1Attribute attr = (SvgX1Attribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "x1" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgX1Attribute</code> , See {@odf.attribute svg:x1}
	 *
	 * @param svgX1Value   The type is <code>String</code>
	 */
	public void setSvgX1Attribute( String svgX1Value )
	{
		SvgX1Attribute attr =  new SvgX1Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgX1Value );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgY1Attribute</code> , See {@odf.attribute svg:y1}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgY1Attribute()
	{
		SvgY1Attribute attr = (SvgY1Attribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "y1" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgY1Attribute</code> , See {@odf.attribute svg:y1}
	 *
	 * @param svgY1Value   The type is <code>String</code>
	 */
	public void setSvgY1Attribute( String svgY1Value )
	{
		SvgY1Attribute attr =  new SvgY1Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgY1Value );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStartShapeAttribute</code> , See {@odf.attribute draw:start-shape}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawStartShapeAttribute()
	{
		DrawStartShapeAttribute attr = (DrawStartShapeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "start-shape" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStartShapeAttribute</code> , See {@odf.attribute draw:start-shape}
	 *
	 * @param drawStartShapeValue   The type is <code>String</code>
	 */
	public void setDrawStartShapeAttribute( String drawStartShapeValue )
	{
		DrawStartShapeAttribute attr =  new DrawStartShapeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawStartShapeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawStartGluePointAttribute</code> , See {@odf.attribute draw:start-glue-point}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawStartGluePointAttribute()
	{
		DrawStartGluePointAttribute attr = (DrawStartGluePointAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "start-glue-point" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawStartGluePointAttribute</code> , See {@odf.attribute draw:start-glue-point}
	 *
	 * @param drawStartGluePointValue   The type is <code>Integer</code>
	 */
	public void setDrawStartGluePointAttribute( Integer drawStartGluePointValue )
	{
		DrawStartGluePointAttribute attr =  new DrawStartGluePointAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( drawStartGluePointValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgX2Attribute</code> , See {@odf.attribute svg:x2}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgX2Attribute()
	{
		SvgX2Attribute attr = (SvgX2Attribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "x2" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgX2Attribute</code> , See {@odf.attribute svg:x2}
	 *
	 * @param svgX2Value   The type is <code>String</code>
	 */
	public void setSvgX2Attribute( String svgX2Value )
	{
		SvgX2Attribute attr =  new SvgX2Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgX2Value );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgY2Attribute</code> , See {@odf.attribute svg:y2}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgY2Attribute()
	{
		SvgY2Attribute attr = (SvgY2Attribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "y2" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgY2Attribute</code> , See {@odf.attribute svg:y2}
	 *
	 * @param svgY2Value   The type is <code>String</code>
	 */
	public void setSvgY2Attribute( String svgY2Value )
	{
		SvgY2Attribute attr =  new SvgY2Attribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgY2Value );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawEndShapeAttribute</code> , See {@odf.attribute draw:end-shape}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawEndShapeAttribute()
	{
		DrawEndShapeAttribute attr = (DrawEndShapeAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "end-shape" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawEndShapeAttribute</code> , See {@odf.attribute draw:end-shape}
	 *
	 * @param drawEndShapeValue   The type is <code>String</code>
	 */
	public void setDrawEndShapeAttribute( String drawEndShapeValue )
	{
		DrawEndShapeAttribute attr =  new DrawEndShapeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawEndShapeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawEndGluePointAttribute</code> , See {@odf.attribute draw:end-glue-point}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getDrawEndGluePointAttribute()
	{
		DrawEndGluePointAttribute attr = (DrawEndGluePointAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "end-glue-point" ) );
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawEndGluePointAttribute</code> , See {@odf.attribute draw:end-glue-point}
	 *
	 * @param drawEndGluePointValue   The type is <code>Integer</code>
	 */
	public void setDrawEndGluePointAttribute( Integer drawEndGluePointValue )
	{
		DrawEndGluePointAttribute attr =  new DrawEndGluePointAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( drawEndGluePointValue.intValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawLineSkewAttribute</code> , See {@odf.attribute draw:line-skew}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawLineSkewAttribute()
	{
		DrawLineSkewAttribute attr = (DrawLineSkewAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "line-skew" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawLineSkewAttribute</code> , See {@odf.attribute draw:line-skew}
	 *
	 * @param drawLineSkewValue   The type is <code>String</code>
	 */
	public void setDrawLineSkewAttribute( String drawLineSkewValue )
	{
		DrawLineSkewAttribute attr =  new DrawLineSkewAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawLineSkewValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgDAttribute</code> , See {@odf.attribute svg:d}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgDAttribute()
	{
		SvgDAttribute attr = (SvgDAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "d" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgDAttribute</code> , See {@odf.attribute svg:d}
	 *
	 * @param svgDValue   The type is <code>String</code>
	 */
	public void setSvgDAttribute( String svgDValue )
	{
		SvgDAttribute attr =  new SvgDAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgDValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawLayerAttribute</code> , See {@odf.attribute draw:layer}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawLayerAttribute()
	{
		DrawLayerAttribute attr = (DrawLayerAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "layer" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawLayerAttribute</code> , See {@odf.attribute draw:layer}
	 *
	 * @param drawLayerValue   The type is <code>String</code>
	 */
	public void setDrawLayerAttribute( String drawLayerValue )
	{
		DrawLayerAttribute attr =  new DrawLayerAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawLayerValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawTransformAttribute</code> , See {@odf.attribute draw:transform}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTransformAttribute()
	{
		DrawTransformAttribute attr = (DrawTransformAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "transform" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTransformAttribute</code> , See {@odf.attribute draw:transform}
	 *
	 * @param drawTransformValue   The type is <code>String</code>
	 */
	public void setDrawTransformAttribute( String drawTransformValue )
	{
		DrawTransformAttribute attr =  new DrawTransformAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawTransformValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See {@odf.attribute draw:text-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawTextStyleNameAttribute()
	{
		DrawTextStyleNameAttribute attr = (DrawTextStyleNameAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "text-style-name" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawTextStyleNameAttribute</code> , See {@odf.attribute draw:text-style-name}
	 *
	 * @param drawTextStyleNameValue   The type is <code>String</code>
	 */
	public void setDrawTextStyleNameAttribute( String drawTextStyleNameValue )
	{
		DrawTextStyleNameAttribute attr =  new DrawTextStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawTextStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCaptionIdAttribute()
	{
		DrawCaptionIdAttribute attr = (DrawCaptionIdAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.DRAW), "caption-id" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @param drawCaptionIdValue   The type is <code>String</code>
	 */
	public void setDrawCaptionIdAttribute( String drawCaptionIdValue )
	{
		DrawCaptionIdAttribute attr =  new DrawCaptionIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawCaptionIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgViewBoxAttribute</code> , See {@odf.attribute svg:viewBox}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgViewBoxAttribute()
	{
		SvgViewBoxAttribute attr = (SvgViewBoxAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SVG), "viewBox" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgViewBoxAttribute</code> , See {@odf.attribute svg:viewBox}
	 *
	 * @param svgViewBoxValue   The type is <code>String</code>
	 */
	public void setSvgViewBoxAttribute( String svgViewBoxValue )
	{
		SvgViewBoxAttribute attr =  new SvgViewBoxAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgViewBoxValue );
	}

	/**
	 * Create child element {@odf.element svg:title}.
	 *
	 * @return   return  the element {@odf.element svg:title}
	 * DifferentQName 
	 */
	public SvgTitleElement newSvgTitleElement()
	{
		SvgTitleElement  svgTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgTitleElement.class);
		this.appendChild( svgTitle);
		return  svgTitle;
	}                   
               
	/**
	 * Create child element {@odf.element svg:desc}.
	 *
	 * @return   return  the element {@odf.element svg:desc}
	 * DifferentQName 
	 */
	public SvgDescElement newSvgDescElement()
	{
		SvgDescElement  svgDesc = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgDescElement.class);
		this.appendChild( svgDesc);
		return  svgDesc;
	}                   
               
	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return   return  the element {@odf.element office:event-listeners}
	 * DifferentQName 
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement()
	{
		OfficeEventListenersElement  officeEventListeners = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild( officeEventListeners);
		return  officeEventListeners;
	}                   
               
	/**
	 * Create child element {@odf.element draw:glue-point}.
	 *
     * @param drawEscapeDirectionAttributeValue  the <code>String</code> value of <code>DrawEscapeDirectionAttribute</code>, see {@odf.attribute  draw:escape-direction} at specification
	 * @param drawIdAttributeValue  the <code>String</code> value of <code>DrawIdAttribute</code>, see {@odf.attribute  draw:id} at specification
	 * @param svgXAttributeValue  the <code>String</code> value of <code>SvgXAttribute</code>, see {@odf.attribute  svg:x} at specification
	 * @param svgYAttributeValue  the <code>String</code> value of <code>SvgYAttribute</code>, see {@odf.attribute  svg:y} at specification
	 * @return   return  the element {@odf.element draw:glue-point}
	 * DifferentQName 
	 */
    
	public DrawGluePointElement newDrawGluePointElement(String drawEscapeDirectionAttributeValue, String drawIdAttributeValue, String svgXAttributeValue, String svgYAttributeValue)
	{
		DrawGluePointElement  drawGluePoint = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawGluePointElement.class);
		drawGluePoint.setDrawEscapeDirectionAttribute( drawEscapeDirectionAttributeValue );
		drawGluePoint.setDrawIdAttribute( drawIdAttributeValue );
		drawGluePoint.setSvgXAttribute( svgXAttributeValue );
		drawGluePoint.setSvgYAttribute( svgYAttributeValue );
		this.appendChild( drawGluePoint);
		return  drawGluePoint;      
	}
    
	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return   return  the element {@odf.element text:p}
	 * DifferentQName 
	 */
	public TextPElement newTextPElement()
	{
		TextPElement  textP = ((OdfFileDom)this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild( textP);
		return  textP;
	}                   
               
	/**
	 * Create child element {@odf.element text:list}.
	 *
	 * @return   return  the element {@odf.element text:list}
	 * DifferentQName 
	 */
	public TextListElement newTextListElement()
	{
		TextListElement  textList = ((OdfFileDom)this.ownerDocument).newOdfElement(TextListElement.class);
		this.appendChild( textList);
		return  textList;
	}                   
               
}
