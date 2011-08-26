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

package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.script.ScriptLanguageAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element office:script}.
 *
 */
public abstract class OfficeScriptElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.OFFICE, "script" );


	/**
	 * Create the instance of <code>OfficeScriptElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeScriptElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:script}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  OfficeScriptElement}
	 *
     * @param scriptLanguageAttributeValue  The mandatory attribute {@odf.attribute  script:language}"
     *
	 */
	public void init(String scriptLanguageAttributeValue)
	{
		setScriptLanguageAttribute( scriptLanguageAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ScriptLanguageAttribute</code> , See {@odf.attribute script:language}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getScriptLanguageAttribute()
	{
		ScriptLanguageAttribute attr = (ScriptLanguageAttribute) getOdfAttribute( OdfName.newName( OdfNamespace.newNamespace(OdfNamespaceNames.SCRIPT), "language" ) );
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ScriptLanguageAttribute</code> , See {@odf.attribute script:language}
	 *
	 * @param scriptLanguageValue   The type is <code>String</code>
	 */
	public void setScriptLanguageAttribute( String scriptLanguageValue )
	{
		ScriptLanguageAttribute attr =  new ScriptLanguageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( scriptLanguageValue );
	}

}
