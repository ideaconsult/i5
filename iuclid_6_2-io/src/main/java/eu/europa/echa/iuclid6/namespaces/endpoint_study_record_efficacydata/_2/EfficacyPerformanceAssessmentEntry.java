
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *         &lt;element name="EfficacyParameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Efficacy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
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
    "efficacyParameter",
    "efficacy",
    "timeToProduceEffect",
    "treatment",
    "interferingSubstances",
    "remarksOnResults"
})
public class EfficacyPerformanceAssessmentEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "EfficacyParameter", required = true)
    protected PicklistField efficacyParameter;
    @XmlElement(name = "Efficacy", required = true)
    protected PhysicalQuantityRangeField efficacy;
    @XmlElement(name = "TimeToProduceEffect", required = true)
    protected PhysicalQuantityRangeField timeToProduceEffect;
    @XmlElement(name = "Treatment", required = true)
    protected String treatment;
    @XmlElement(name = "InterferingSubstances", required = true)
    protected PicklistFieldWithSmallTextRemarks interferingSubstances;
    @XmlElement(name = "RemarksOnResults", required = true)
    protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

    /**
     * Gets the value of the efficacyParameter property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getEfficacyParameter() {
        return efficacyParameter;
    }

    /**
     * Sets the value of the efficacyParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setEfficacyParameter(PicklistField value) {
        this.efficacyParameter = value;
    }

    /**
     * Gets the value of the efficacy property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getEfficacy() {
        return efficacy;
    }

    /**
     * Sets the value of the efficacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setEfficacy(PhysicalQuantityRangeField value) {
        this.efficacy = value;
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
