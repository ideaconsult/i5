
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2;

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
 *         &lt;element name="ObservationsAndClinicalExaminationsPerformedAndFrequency" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SpecificBiochemicalExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="NeurobehaviouralExaminationsPerformedAndFrequency" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SacrificeAndHistoPathology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="PositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "observationsAndClinicalExaminationsPerformedAndFrequency",
    "specificBiochemicalExaminations",
    "neurobehaviouralExaminationsPerformedAndFrequency",
    "sacrificeAndHistoPathology",
    "otherExaminations",
    "positiveControl",
    "statistics"
})
public class Examinations {

    @XmlElement(name = "ObservationsAndClinicalExaminationsPerformedAndFrequency", required = true)
    protected String observationsAndClinicalExaminationsPerformedAndFrequency;
    @XmlElement(name = "SpecificBiochemicalExaminations", required = true)
    protected String specificBiochemicalExaminations;
    @XmlElement(name = "NeurobehaviouralExaminationsPerformedAndFrequency", required = true)
    protected String neurobehaviouralExaminationsPerformedAndFrequency;
    @XmlElement(name = "SacrificeAndHistoPathology", required = true)
    protected String sacrificeAndHistoPathology;
    @XmlElement(name = "OtherExaminations", required = true)
    protected String otherExaminations;
    @XmlElement(name = "PositiveControl", required = true)
    protected String positiveControl;
    @XmlElement(name = "Statistics", required = true)
    protected String statistics;

    /**
     * Gets the value of the observationsAndClinicalExaminationsPerformedAndFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationsAndClinicalExaminationsPerformedAndFrequency() {
        return observationsAndClinicalExaminationsPerformedAndFrequency;
    }

    /**
     * Sets the value of the observationsAndClinicalExaminationsPerformedAndFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationsAndClinicalExaminationsPerformedAndFrequency(String value) {
        this.observationsAndClinicalExaminationsPerformedAndFrequency = value;
    }

    /**
     * Gets the value of the specificBiochemicalExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificBiochemicalExaminations() {
        return specificBiochemicalExaminations;
    }

    /**
     * Sets the value of the specificBiochemicalExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificBiochemicalExaminations(String value) {
        this.specificBiochemicalExaminations = value;
    }

    /**
     * Gets the value of the neurobehaviouralExaminationsPerformedAndFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeurobehaviouralExaminationsPerformedAndFrequency() {
        return neurobehaviouralExaminationsPerformedAndFrequency;
    }

    /**
     * Sets the value of the neurobehaviouralExaminationsPerformedAndFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeurobehaviouralExaminationsPerformedAndFrequency(String value) {
        this.neurobehaviouralExaminationsPerformedAndFrequency = value;
    }

    /**
     * Gets the value of the sacrificeAndHistoPathology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSacrificeAndHistoPathology() {
        return sacrificeAndHistoPathology;
    }

    /**
     * Sets the value of the sacrificeAndHistoPathology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSacrificeAndHistoPathology(String value) {
        this.sacrificeAndHistoPathology = value;
    }

    /**
     * Gets the value of the otherExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherExaminations() {
        return otherExaminations;
    }

    /**
     * Sets the value of the otherExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherExaminations(String value) {
        this.otherExaminations = value;
    }

    /**
     * Gets the value of the positiveControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositiveControl() {
        return positiveControl;
    }

    /**
     * Sets the value of the positiveControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositiveControl(String value) {
        this.positiveControl = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatistics(String value) {
        this.statistics = value;
    }

}
