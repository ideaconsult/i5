
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithMultiLineTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
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
 *         &lt;element name="MinimumEffectiveDose" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="2507"/>
 *                         &lt;enumeration value="4521"/>
 *                         &lt;enumeration value="2506"/>
 *                         &lt;enumeration value="2505"/>
 *                         &lt;enumeration value="4523"/>
 *                         &lt;enumeration value="1929"/>
 *                         &lt;enumeration value="2022"/>
 *                         &lt;enumeration value="1930"/>
 *                         &lt;enumeration value="2020"/>
 *                         &lt;enumeration value="2118"/>
 *                         &lt;enumeration value="2495"/>
 *                         &lt;enumeration value="2155"/>
 *                         &lt;enumeration value="2500"/>
 *                         &lt;enumeration value="2098"/>
 *                         &lt;enumeration value="1935"/>
 *                         &lt;enumeration value="2504"/>
 *                         &lt;enumeration value="2123"/>
 *                         &lt;enumeration value="2127"/>
 *                         &lt;enumeration value="2077"/>
 *                         &lt;enumeration value="2081"/>
 *                         &lt;enumeration value="2090"/>
 *                         &lt;enumeration value="2154"/>
 *                         &lt;enumeration value="2499"/>
 *                         &lt;enumeration value="2093"/>
 *                         &lt;enumeration value="2095"/>
 *                         &lt;enumeration value="1933"/>
 *                         &lt;enumeration value="2282"/>
 *                         &lt;enumeration value="2283"/>
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
 *         &lt;element name="TimeToProduceEffect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="Treatment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="InterferingSubstances" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
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
    "minimumEffectiveDose",
    "timeToProduceEffect",
    "treatment",
    "interferingSubstances",
    "remarksOnResults"
})
public class Entry
    extends RepeatableEntryType
{

    @XmlElement(name = "MinimumEffectiveDose")
    protected MinimumEffectiveDose minimumEffectiveDose;
    @XmlElement(name = "TimeToProduceEffect", required = true)
    protected PhysicalQuantityRangeField timeToProduceEffect;
    @XmlElement(name = "Treatment", required = true)
    protected String treatment;
    @XmlElement(name = "InterferingSubstances", required = true)
    protected PicklistFieldWithSmallTextRemarks interferingSubstances;
    @XmlElement(name = "RemarksOnResults", required = true)
    protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

    /**
     * Gets the value of the minimumEffectiveDose property.
     * 
     * @return
     *     possible object is
     *     {@link MinimumEffectiveDose }
     *     
     */
    public MinimumEffectiveDose getMinimumEffectiveDose() {
        return minimumEffectiveDose;
    }

    /**
     * Sets the value of the minimumEffectiveDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumEffectiveDose }
     *     
     */
    public void setMinimumEffectiveDose(MinimumEffectiveDose value) {
        this.minimumEffectiveDose = value;
    }

    /**
     * Gets the value of the timeToProduceEffect property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getTimeToProduceEffect() {
        return timeToProduceEffect;
    }

    /**
     * Sets the value of the timeToProduceEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setTimeToProduceEffect(PhysicalQuantityRangeField value) {
        this.timeToProduceEffect = value;
    }

    /**
     * Gets the value of the treatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatment() {
        return treatment;
    }

    /**
     * Sets the value of the treatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatment(String value) {
        this.treatment = value;
    }

    /**
     * Gets the value of the interferingSubstances property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getInterferingSubstances() {
        return interferingSubstances;
    }

    /**
     * Sets the value of the interferingSubstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setInterferingSubstances(PicklistFieldWithSmallTextRemarks value) {
        this.interferingSubstances = value;
    }

    /**
     * Gets the value of the remarksOnResults property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithMultiLineTextRemarks }
     *     
     */
    public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
        return remarksOnResults;
    }

    /**
     * Sets the value of the remarksOnResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithMultiLineTextRemarks }
     *     
     */
    public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
        this.remarksOnResults = value;
    }

}
