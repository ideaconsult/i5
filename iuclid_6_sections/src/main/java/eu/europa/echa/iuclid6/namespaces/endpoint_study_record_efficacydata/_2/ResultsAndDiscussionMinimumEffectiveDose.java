
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

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
 *                   &lt;element name="MinimumEffectiveDose" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                           &lt;sequence>
 *                             &lt;element name="unitCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value=""/>
 *                                   &lt;enumeration value="2507"/>
 *                                   &lt;enumeration value="4521"/>
 *                                   &lt;enumeration value="2506"/>
 *                                   &lt;enumeration value="2505"/>
 *                                   &lt;enumeration value="4523"/>
 *                                   &lt;enumeration value="1929"/>
 *                                   &lt;enumeration value="2022"/>
 *                                   &lt;enumeration value="1930"/>
 *                                   &lt;enumeration value="2020"/>
 *                                   &lt;enumeration value="2118"/>
 *                                   &lt;enumeration value="2495"/>
 *                                   &lt;enumeration value="2155"/>
 *                                   &lt;enumeration value="2500"/>
 *                                   &lt;enumeration value="2098"/>
 *                                   &lt;enumeration value="1935"/>
 *                                   &lt;enumeration value="2504"/>
 *                                   &lt;enumeration value="2123"/>
 *                                   &lt;enumeration value="2127"/>
 *                                   &lt;enumeration value="2077"/>
 *                                   &lt;enumeration value="2081"/>
 *                                   &lt;enumeration value="2090"/>
 *                                   &lt;enumeration value="2154"/>
 *                                   &lt;enumeration value="2499"/>
 *                                   &lt;enumeration value="2093"/>
 *                                   &lt;enumeration value="2095"/>
 *                                   &lt;enumeration value="1933"/>
 *                                   &lt;enumeration value="2282"/>
 *                                   &lt;enumeration value="2283"/>
 *                                   &lt;enumeration value="1342"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="unitOther" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="value" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TimeToProduceEffect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                   &lt;element name="Treatment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="InterferingSubstances" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
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
public class ResultsAndDiscussionMinimumEffectiveDose {

    protected List<Entry> entry;

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
     * {@link Entry }
     * 
     * 
     */
    public List<Entry> getEntry() {
        if (entry == null) {
            entry = new ArrayList<Entry>();
        }
        return this.entry;
    }

}
