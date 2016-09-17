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
// Generated on: 2016.04.05 at 03:08:21 PM BRT 
//

package jaxbClasses.basictypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContextValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ValueID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceOutputValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextValue", propOrder = {
    "valueID",
    "serviceOutputValue",
    "serviceID"
})
public class ContextValue {

    @XmlElement(name = "ValueID", required = true)
    protected String valueID;
    @XmlElement(name = "ServiceOutputValue", required = true)
    protected String serviceOutputValue;
    @XmlElement(name = "ServiceID", required = true)
    protected String serviceID;

    /**
     * Gets the value of the valueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueID() {
        return valueID;
    }

    /**
     * Sets the value of the valueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueID(String value) {
        this.valueID = value;
    }

    /**
     * Gets the value of the serviceOutputValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOutputValue() {
        return serviceOutputValue;
    }

    /**
     * Sets the value of the serviceOutputValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOutputValue(String value) {
        this.serviceOutputValue = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

}
