
package eu.europa.echa.iuclid6.namespaces.reference_substance._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="entry" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}inventoryEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "entry"
})
public class InventoryEntry {

    protected List<eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry> entry;

    /**
     * Gets the value of the entry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry }
     * 
     * 
     */
    public List<eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry>();
        }
        return this.entry;
    }

}
