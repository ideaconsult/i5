//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 07:09:20 PM EEST 
//


package eu.europa.echa.iuclid6.namespaces.reference_substance._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="InventoryEntry">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}inventoryEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "inventoryEntry"
})
public class Inventory {

    @XmlElement(name = "InventoryEntry", required = true)
    protected InventoryEntry inventoryEntry;

    /**
     * Gets the value of the inventoryEntry property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryEntry }
     *     
     */
    public InventoryEntry getInventoryEntry() {
        return inventoryEntry;
    }

    /**
     * Sets the value of the inventoryEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryEntry }
     *     
     */
    public void setInventoryEntry(InventoryEntry value) {
        this.inventoryEntry = value;
    }

}
