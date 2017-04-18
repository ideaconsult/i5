
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;


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
 *         &lt;element name="CellViabilities" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityCellViabilities" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="HumoralImmunityExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityHumoralImmunityExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SpecificCellMediatedImmunity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeveritySpecificCellMediatedImmunity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="NonSpecificCellMediatedImmunity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherFunctionalActivityAssays" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityOtherFunctionalActivityAssays" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityOtherFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "cellViabilities",
    "descriptionIncidenceAndSeverityCellViabilities",
    "humoralImmunityExaminations",
    "descriptionIncidenceAndSeverityHumoralImmunityExaminations",
    "specificCellMediatedImmunity",
    "descriptionIncidenceAndSeveritySpecificCellMediatedImmunity",
    "nonSpecificCellMediatedImmunity",
    "descriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity",
    "otherFunctionalActivityAssays",
    "descriptionIncidenceAndSeverityOtherFunctionalActivityAssays",
    "otherFindings",
    "descriptionIncidenceAndSeverityOtherFindings"
})
public class SpecificImmunotoxicExaminations {

    @XmlElement(name = "CellViabilities", required = true)
    protected PicklistField cellViabilities;
    @XmlElement(name = "DescriptionIncidenceAndSeverityCellViabilities", required = true)
    protected String descriptionIncidenceAndSeverityCellViabilities;
    @XmlElement(name = "HumoralImmunityExaminations", required = true)
    protected PicklistField humoralImmunityExaminations;
    @XmlElement(name = "DescriptionIncidenceAndSeverityHumoralImmunityExaminations", required = true)
    protected String descriptionIncidenceAndSeverityHumoralImmunityExaminations;
    @XmlElement(name = "SpecificCellMediatedImmunity", required = true)
    protected PicklistField specificCellMediatedImmunity;
    @XmlElement(name = "DescriptionIncidenceAndSeveritySpecificCellMediatedImmunity", required = true)
    protected String descriptionIncidenceAndSeveritySpecificCellMediatedImmunity;
    @XmlElement(name = "NonSpecificCellMediatedImmunity", required = true)
    protected PicklistField nonSpecificCellMediatedImmunity;
    @XmlElement(name = "DescriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity", required = true)
    protected String descriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity;
    @XmlElement(name = "OtherFunctionalActivityAssays", required = true)
    protected PicklistField otherFunctionalActivityAssays;
    @XmlElement(name = "DescriptionIncidenceAndSeverityOtherFunctionalActivityAssays", required = true)
    protected String descriptionIncidenceAndSeverityOtherFunctionalActivityAssays;
    @XmlElement(name = "OtherFindings", required = true)
    protected PicklistField otherFindings;
    @XmlElement(name = "DescriptionIncidenceAndSeverityOtherFindings", required = true)
    protected String descriptionIncidenceAndSeverityOtherFindings;

    /**
     * Gets the value of the cellViabilities property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getCellViabilities() {
        return cellViabilities;
    }

    /**
     * Sets the value of the cellViabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setCellViabilities(PicklistField value) {
        this.cellViabilities = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityCellViabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityCellViabilities() {
        return descriptionIncidenceAndSeverityCellViabilities;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityCellViabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityCellViabilities(String value) {
        this.descriptionIncidenceAndSeverityCellViabilities = value;
    }

    /**
     * Gets the value of the humoralImmunityExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getHumoralImmunityExaminations() {
        return humoralImmunityExaminations;
    }

    /**
     * Sets the value of the humoralImmunityExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setHumoralImmunityExaminations(PicklistField value) {
        this.humoralImmunityExaminations = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityHumoralImmunityExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityHumoralImmunityExaminations() {
        return descriptionIncidenceAndSeverityHumoralImmunityExaminations;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityHumoralImmunityExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityHumoralImmunityExaminations(String value) {
        this.descriptionIncidenceAndSeverityHumoralImmunityExaminations = value;
    }

    /**
     * Gets the value of the specificCellMediatedImmunity property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSpecificCellMediatedImmunity() {
        return specificCellMediatedImmunity;
    }

    /**
     * Sets the value of the specificCellMediatedImmunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSpecificCellMediatedImmunity(PicklistField value) {
        this.specificCellMediatedImmunity = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeveritySpecificCellMediatedImmunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeveritySpecificCellMediatedImmunity() {
        return descriptionIncidenceAndSeveritySpecificCellMediatedImmunity;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeveritySpecificCellMediatedImmunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeveritySpecificCellMediatedImmunity(String value) {
        this.descriptionIncidenceAndSeveritySpecificCellMediatedImmunity = value;
    }

    /**
     * Gets the value of the nonSpecificCellMediatedImmunity property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getNonSpecificCellMediatedImmunity() {
        return nonSpecificCellMediatedImmunity;
    }

    /**
     * Sets the value of the nonSpecificCellMediatedImmunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setNonSpecificCellMediatedImmunity(PicklistField value) {
        this.nonSpecificCellMediatedImmunity = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity() {
        return descriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity(String value) {
        this.descriptionIncidenceAndSeverityNonSpecificCellMediatedImmunity = value;
    }

    /**
     * Gets the value of the otherFunctionalActivityAssays property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getOtherFunctionalActivityAssays() {
        return otherFunctionalActivityAssays;
    }

    /**
     * Sets the value of the otherFunctionalActivityAssays property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setOtherFunctionalActivityAssays(PicklistField value) {
        this.otherFunctionalActivityAssays = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityOtherFunctionalActivityAssays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityOtherFunctionalActivityAssays() {
        return descriptionIncidenceAndSeverityOtherFunctionalActivityAssays;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityOtherFunctionalActivityAssays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityOtherFunctionalActivityAssays(String value) {
        this.descriptionIncidenceAndSeverityOtherFunctionalActivityAssays = value;
    }

    /**
     * Gets the value of the otherFindings property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getOtherFindings() {
        return otherFindings;
    }

    /**
     * Sets the value of the otherFindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setOtherFindings(PicklistField value) {
        this.otherFindings = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityOtherFindings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityOtherFindings() {
        return descriptionIncidenceAndSeverityOtherFindings;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityOtherFindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityOtherFindings(String value) {
        this.descriptionIncidenceAndSeverityOtherFindings = value;
    }

}
