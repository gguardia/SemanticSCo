/*******************************************************************************
 * Copyright 2016 Gabriela D. A. Guardia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *    http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.01 at 02:14:05 PM BRST 
//

package jaxbClasses.getlabels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OntologyUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RootConcept" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ontologyUri",
    "rootConcept"
})
@XmlRootElement(name = "GetLabelsRequest")
public class GetLabelsRequest {

    @XmlElement(name = "OntologyUri", required = true)
    protected String ontologyUri;
    @XmlElement(name = "RootConcept", required = true)
    protected String rootConcept;

    /**
     * Gets the value of the ontologyUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyUri() {
        return ontologyUri;
    }

    /**
     * Sets the value of the ontologyUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyUri(String value) {
        this.ontologyUri = value;
    }

    /**
     * Gets the value of the rootConcept property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootConcept() {
        return rootConcept;
    }

    /**
     * Sets the value of the rootConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootConcept(String value) {
        this.rootConcept = value;
    }

}
