
package eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2;

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
 *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                   &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                   &lt;element name="ProportionTypical" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityHalfBoundedField"/>
 *                   &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                   &lt;element name="Function" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="DetailsOfFunctionInComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="RelevantForClassificationLabeling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
    "entry"
})
public class Additives {

    protected List<AdditivesEntry> entry;

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
     * {@link AdditivesEntry }
     * 
     * 
     */
    public List<AdditivesEntry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<AdditivesEntry>();
        }
        return this.entry;
    }

}
