
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *       &lt;sequence>
 *         &lt;element name="DoseConc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="2087"/>
 *                         &lt;enumeration value="2086"/>
 *                         &lt;enumeration value="2085"/>
 *                         &lt;enumeration value="2090"/>
 *                         &lt;enumeration value="2102"/>
 *                         &lt;enumeration value="2082"/>
 *                         &lt;enumeration value="2099"/>
 *                         &lt;enumeration value="2101"/>
 *                         &lt;enumeration value="2100"/>
 *                         &lt;enumeration value="2104"/>
 *                         &lt;enumeration value="2106"/>
 *                         &lt;enumeration value="2105"/>
 *                         &lt;enumeration value="2283"/>
 *                         &lt;enumeration value="2285"/>
 *                         &lt;enumeration value="2284"/>
 *                         &lt;enumeration value="1342"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="unitOther" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doseConc",
    "remarks"
})
public class DosesConcentrationsEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "DoseConc")
    protected DoseConc doseConc;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;

    /**
     * Gets the value of the doseConc property.
     * 
     * @return
     *     possible object is
     *     {@link DoseConc }
     *     
     */
    public DoseConc getDoseConc() {
        return doseConc;
    }

    /**
     * Sets the value of the doseConc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoseConc }
     *     
     */
    public void setDoseConc(DoseConc value) {
        this.doseConc = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
