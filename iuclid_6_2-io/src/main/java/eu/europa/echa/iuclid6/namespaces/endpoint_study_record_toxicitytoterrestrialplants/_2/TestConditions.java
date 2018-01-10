
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;


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
 *         &lt;element name="TestTemperature" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Moisture" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="DetailsOnTestConditions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="NominalAndMeasuredConcentrations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="ReferenceSubstancePositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
    "testTemperature",
    "ph",
    "moisture",
    "detailsOnTestConditions",
    "nominalAndMeasuredConcentrations",
    "referenceSubstancePositiveControl"
})
public class TestConditions {

    @XmlElement(name = "TestTemperature", required = true)
    protected String testTemperature;
    @XmlElement(name = "Ph", required = true)
    protected String ph;
    @XmlElement(name = "Moisture", required = true)
    protected String moisture;
    @XmlElement(name = "DetailsOnTestConditions", required = true)
    protected String detailsOnTestConditions;
    @XmlElement(name = "NominalAndMeasuredConcentrations", required = true)
    protected String nominalAndMeasuredConcentrations;
    @XmlElement(name = "ReferenceSubstancePositiveControl", required = true)
    protected PicklistFieldWithSmallTextRemarks referenceSubstancePositiveControl;

    /**
     * Gets the value of the testTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestTemperature() {
        return testTemperature;
    }

    /**
     * Sets the value of the testTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestTemperature(String value) {
        this.testTemperature = value;
    }

    /**
     * Gets the value of the ph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPh() {
        return ph;
    }

    /**
     * Sets the value of the ph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPh(String value) {
        this.ph = value;
    }

    /**
     * Gets the value of the moisture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoisture() {
        return moisture;
    }

    /**
     * Sets the value of the moisture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoisture(String value) {
        this.moisture = value;
    }

    /**
     * Gets the value of the detailsOnTestConditions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnTestConditions() {
        return detailsOnTestConditions;
    }

    /**
     * Sets the value of the detailsOnTestConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnTestConditions(String value) {
        this.detailsOnTestConditions = value;
    }

    /**
     * Gets the value of the nominalAndMeasuredConcentrations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalAndMeasuredConcentrations() {
        return nominalAndMeasuredConcentrations;
    }

    /**
     * Sets the value of the nominalAndMeasuredConcentrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalAndMeasuredConcentrations(String value) {
        this.nominalAndMeasuredConcentrations = value;
    }

    /**
     * Gets the value of the referenceSubstancePositiveControl property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getReferenceSubstancePositiveControl() {
        return referenceSubstancePositiveControl;
    }

    /**
     * Sets the value of the referenceSubstancePositiveControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setReferenceSubstancePositiveControl(PicklistFieldWithSmallTextRemarks value) {
        this.referenceSubstancePositiveControl = value;
    }

}
