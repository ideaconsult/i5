
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2;

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
 *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="Abnormalities" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Localisation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DescriptionIncidenceAndSeverity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
public class MaternalAbnormalities2 {

    protected List<MaternalAbnormalitiesEntry> entry;

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
     * {@link MaternalAbnormalitiesEntry }
     * 
     * 
     */
    public List<MaternalAbnormalitiesEntry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<MaternalAbnormalitiesEntry>();
        }
        return this.entry;
    }

}
