
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2;

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
 *         &lt;element name="SacrificeAndPathology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="CellViabilities" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="HumoralImmunityExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SpecificCellMediatedImmunity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="NonSpecificCellMediatedImmunity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherFunctionalActivityAssays" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "sacrificeAndPathology",
    "cellViabilities",
    "humoralImmunityExaminations",
    "specificCellMediatedImmunity",
    "nonSpecificCellMediatedImmunity",
    "otherFunctionalActivityAssays",
    "otherExaminations",
    "positiveControl",
    "statistics"
})
public class Examinations {

    @XmlElement(name = "ObservationsAndClinicalExaminationsPerformedAndFrequency", required = true)
    protected String observationsAndClinicalExaminationsPerformedAndFrequency;
    @XmlElement(name = "SacrificeAndPathology", required = true)
    protected String sacrificeAndPathology;
    @XmlElement(name = "CellViabilities", required = true)
    protected String cellViabilities;
    @XmlElement(name = "HumoralImmunityExaminations", required = true)
    protected String humoralImmunityExaminations;
    @XmlElement(name = "SpecificCellMediatedImmunity", required = true)
    protected String specificCellMediatedImmunity;
    @XmlElement(name = "NonSpecificCellMediatedImmunity", required = true)
    protected String nonSpecificCellMediatedImmunity;
    @XmlElement(name = "OtherFunctionalActivityAssays", required = true)
    protected String otherFunctionalActivityAssays;
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
     * Gets the value of the sacrificeAndPathology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSacrificeAndPathology() {
        return sacrificeAndPathology;
    }

    /**
     * Sets the value of the sacrificeAndPathology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSacrificeAndPathology(String value) {
        this.sacrificeAndPathology = value;
    }

    /**
     * Gets the value of the cellViabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellViabilities() {
        return cellViabilities;
    }

    /**
     * Sets the value of the cellViabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellViabilities(String value) {
        this.cellViabilities = value;
    }

    /**
     * Gets the value of the humoralImmunityExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumoralImmunityExaminations() {
        return humoralImmunityExaminations;
    }

    /**
     * Sets the value of the humoralImmunityExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumoralImmunityExaminations(String value) {
        this.humoralImmunityExaminations = value;
    }

    /**
     * Gets the value of the specificCellMediatedImmunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificCellMediatedImmunity() {
        return specificCellMediatedImmunity;
    }

    /**
     * Sets the value of the specificCellMediatedImmunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificCellMediatedImmunity(String value) {
        this.specificCellMediatedImmunity = value;
    }

    /**
     * Gets the value of the nonSpecificCellMediatedImmunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonSpecificCellMediatedImmunity() {
        return nonSpecificCellMediatedImmunity;
    }

    /**
     * Sets the value of the nonSpecificCellMediatedImmunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonSpecificCellMediatedImmunity(String value) {
        this.nonSpecificCellMediatedImmunity = value;
    }

    /**
     * Gets the value of the otherFunctionalActivityAssays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFunctionalActivityAssays() {
        return otherFunctionalActivityAssays;
    }

    /**
     * Sets the value of the otherFunctionalActivityAssays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFunctionalActivityAssays(String value) {
        this.otherFunctionalActivityAssays = value;
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
