
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inventoryEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventoryEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inventoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberInInventory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventoryEntry", propOrder = {
    "inventoryCode",
    "numberInInventory"
})
public class InventoryEntry {

    @XmlElement(required = true)
    protected String inventoryCode;
    @XmlElement(required = true)
    protected String numberInInventory;

    /**
     * Gets the value of the inventoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryCode() {
        return inventoryCode;
    }

    /**
     * Sets the value of the inventoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryCode(String value) {
        this.inventoryCode = value;
    }

    /**
     * Gets the value of the numberInInventory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberInInventory() {
        return numberInInventory;
    }

    /**
     * Sets the value of the numberInInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberInInventory(String value) {
        this.numberInInventory = value;
    }

}
