
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2;

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
 *         &lt;element name="NumberOfAbortions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityNumberOfAbortions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="PreAndPostImplantationLoss" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityPreAndPostImplantationLoss" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="TotalLitterLossesByResorption" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityTotalLitterLossesByResorption" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="EffectsOnPregnancyDuration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityEffectsOnPregnancyDuration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="EarlyOrLateResorptions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityEarlyOrLateResorptions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="DeadFetuses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityDeadFetuses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ChangesInPregnancyDuration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityChangesInPregnancyDuration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ChangesInNumberOfPregnant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityChangesInNumberOfPregnant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityOtherEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ResultsDetailsMaternal" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "numberOfAbortions",
    "descriptionIncidenceAndSeverityNumberOfAbortions",
    "preAndPostImplantationLoss",
    "descriptionIncidenceAndSeverityPreAndPostImplantationLoss",
    "totalLitterLossesByResorption",
    "descriptionIncidenceAndSeverityTotalLitterLossesByResorption",
    "effectsOnPregnancyDuration",
    "descriptionIncidenceAndSeverityEffectsOnPregnancyDuration",
    "earlyOrLateResorptions",
    "descriptionIncidenceAndSeverityEarlyOrLateResorptions",
    "deadFetuses",
    "descriptionIncidenceAndSeverityDeadFetuses",
    "changesInPregnancyDuration",
    "descriptionIncidenceAndSeverityChangesInPregnancyDuration",
    "changesInNumberOfPregnant",
    "descriptionIncidenceAndSeverityChangesInNumberOfPregnant",
    "otherEffects",
    "descriptionIncidenceAndSeverityOtherEffects",
    "resultsDetailsMaternal"
})
public class MaternalDevelopmentalToxicity {

    @XmlElement(name = "NumberOfAbortions", required = true)
    protected PicklistField numberOfAbortions;
    @XmlElement(name = "DescriptionIncidenceAndSeverityNumberOfAbortions", required = true)
    protected String descriptionIncidenceAndSeverityNumberOfAbortions;
    @XmlElement(name = "PreAndPostImplantationLoss", required = true)
    protected PicklistField preAndPostImplantationLoss;
    @XmlElement(name = "DescriptionIncidenceAndSeverityPreAndPostImplantationLoss", required = true)
    protected String descriptionIncidenceAndSeverityPreAndPostImplantationLoss;
    @XmlElement(name = "TotalLitterLossesByResorption", required = true)
    protected PicklistField totalLitterLossesByResorption;
    @XmlElement(name = "DescriptionIncidenceAndSeverityTotalLitterLossesByResorption", required = true)
    protected String descriptionIncidenceAndSeverityTotalLitterLossesByResorption;
    @XmlElement(name = "EffectsOnPregnancyDuration", required = true)
    protected PicklistField effectsOnPregnancyDuration;
    @XmlElement(name = "DescriptionIncidenceAndSeverityEffectsOnPregnancyDuration", required = true)
    protected String descriptionIncidenceAndSeverityEffectsOnPregnancyDuration;
    @XmlElement(name = "EarlyOrLateResorptions", required = true)
    protected PicklistField earlyOrLateResorptions;
    @XmlElement(name = "DescriptionIncidenceAndSeverityEarlyOrLateResorptions", required = true)
    protected String descriptionIncidenceAndSeverityEarlyOrLateResorptions;
    @XmlElement(name = "DeadFetuses", required = true)
    protected PicklistField deadFetuses;
    @XmlElement(name = "DescriptionIncidenceAndSeverityDeadFetuses", required = true)
    protected String descriptionIncidenceAndSeverityDeadFetuses;
    @XmlElement(name = "ChangesInPregnancyDuration", required = true)
    protected PicklistField changesInPregnancyDuration;
    @XmlElement(name = "DescriptionIncidenceAndSeverityChangesInPregnancyDuration", required = true)
    protected String descriptionIncidenceAndSeverityChangesInPregnancyDuration;
    @XmlElement(name = "ChangesInNumberOfPregnant", required = true)
    protected PicklistField changesInNumberOfPregnant;
    @XmlElement(name = "DescriptionIncidenceAndSeverityChangesInNumberOfPregnant", required = true)
    protected String descriptionIncidenceAndSeverityChangesInNumberOfPregnant;
    @XmlElement(name = "OtherEffects", required = true)
    protected PicklistField otherEffects;
    @XmlElement(name = "DescriptionIncidenceAndSeverityOtherEffects", required = true)
    protected String descriptionIncidenceAndSeverityOtherEffects;
    @XmlElement(name = "ResultsDetailsMaternal", required = true)
    protected String resultsDetailsMaternal;

    /**
     * Gets the value of the numberOfAbortions property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getNumberOfAbortions() {
        return numberOfAbortions;
    }

    /**
     * Sets the value of the numberOfAbortions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setNumberOfAbortions(PicklistField value) {
        this.numberOfAbortions = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityNumberOfAbortions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityNumberOfAbortions() {
        return descriptionIncidenceAndSeverityNumberOfAbortions;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityNumberOfAbortions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityNumberOfAbortions(String value) {
        this.descriptionIncidenceAndSeverityNumberOfAbortions = value;
    }

    /**
     * Gets the value of the preAndPostImplantationLoss property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getPreAndPostImplantationLoss() {
        return preAndPostImplantationLoss;
    }

    /**
     * Sets the value of the preAndPostImplantationLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setPreAndPostImplantationLoss(PicklistField value) {
        this.preAndPostImplantationLoss = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityPreAndPostImplantationLoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityPreAndPostImplantationLoss() {
        return descriptionIncidenceAndSeverityPreAndPostImplantationLoss;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityPreAndPostImplantationLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityPreAndPostImplantationLoss(String value) {
        this.descriptionIncidenceAndSeverityPreAndPostImplantationLoss = value;
    }

    /**
     * Gets the value of the totalLitterLossesByResorption property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getTotalLitterLossesByResorption() {
        return totalLitterLossesByResorption;
    }

    /**
     * Sets the value of the totalLitterLossesByResorption property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setTotalLitterLossesByResorption(PicklistField value) {
        this.totalLitterLossesByResorption = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityTotalLitterLossesByResorption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityTotalLitterLossesByResorption() {
        return descriptionIncidenceAndSeverityTotalLitterLossesByResorption;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityTotalLitterLossesByResorption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityTotalLitterLossesByResorption(String value) {
        this.descriptionIncidenceAndSeverityTotalLitterLossesByResorption = value;
    }

    /**
     * Gets the value of the effectsOnPregnancyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getEffectsOnPregnancyDuration() {
        return effectsOnPregnancyDuration;
    }

    /**
     * Sets the value of the effectsOnPregnancyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setEffectsOnPregnancyDuration(PicklistField value) {
        this.effectsOnPregnancyDuration = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityEffectsOnPregnancyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityEffectsOnPregnancyDuration() {
        return descriptionIncidenceAndSeverityEffectsOnPregnancyDuration;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityEffectsOnPregnancyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityEffectsOnPregnancyDuration(String value) {
        this.descriptionIncidenceAndSeverityEffectsOnPregnancyDuration = value;
    }

    /**
     * Gets the value of the earlyOrLateResorptions property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getEarlyOrLateResorptions() {
        return earlyOrLateResorptions;
    }

    /**
     * Sets the value of the earlyOrLateResorptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setEarlyOrLateResorptions(PicklistField value) {
        this.earlyOrLateResorptions = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityEarlyOrLateResorptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityEarlyOrLateResorptions() {
        return descriptionIncidenceAndSeverityEarlyOrLateResorptions;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityEarlyOrLateResorptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityEarlyOrLateResorptions(String value) {
        this.descriptionIncidenceAndSeverityEarlyOrLateResorptions = value;
    }

    /**
     * Gets the value of the deadFetuses property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getDeadFetuses() {
        return deadFetuses;
    }

    /**
     * Sets the value of the deadFetuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setDeadFetuses(PicklistField value) {
        this.deadFetuses = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityDeadFetuses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityDeadFetuses() {
        return descriptionIncidenceAndSeverityDeadFetuses;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityDeadFetuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityDeadFetuses(String value) {
        this.descriptionIncidenceAndSeverityDeadFetuses = value;
    }

    /**
     * Gets the value of the changesInPregnancyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getChangesInPregnancyDuration() {
        return changesInPregnancyDuration;
    }

    /**
     * Sets the value of the changesInPregnancyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setChangesInPregnancyDuration(PicklistField value) {
        this.changesInPregnancyDuration = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityChangesInPregnancyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityChangesInPregnancyDuration() {
        return descriptionIncidenceAndSeverityChangesInPregnancyDuration;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityChangesInPregnancyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityChangesInPregnancyDuration(String value) {
        this.descriptionIncidenceAndSeverityChangesInPregnancyDuration = value;
    }

    /**
     * Gets the value of the changesInNumberOfPregnant property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getChangesInNumberOfPregnant() {
        return changesInNumberOfPregnant;
    }

    /**
     * Sets the value of the changesInNumberOfPregnant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setChangesInNumberOfPregnant(PicklistField value) {
        this.changesInNumberOfPregnant = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityChangesInNumberOfPregnant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityChangesInNumberOfPregnant() {
        return descriptionIncidenceAndSeverityChangesInNumberOfPregnant;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityChangesInNumberOfPregnant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityChangesInNumberOfPregnant(String value) {
        this.descriptionIncidenceAndSeverityChangesInNumberOfPregnant = value;
    }

    /**
     * Gets the value of the otherEffects property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getOtherEffects() {
        return otherEffects;
    }

    /**
     * Sets the value of the otherEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setOtherEffects(PicklistField value) {
        this.otherEffects = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityOtherEffects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityOtherEffects() {
        return descriptionIncidenceAndSeverityOtherEffects;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityOtherEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityOtherEffects(String value) {
        this.descriptionIncidenceAndSeverityOtherEffects = value;
    }

    /**
     * Gets the value of the resultsDetailsMaternal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsDetailsMaternal() {
        return resultsDetailsMaternal;
    }

    /**
     * Sets the value of the resultsDetailsMaternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsDetailsMaternal(String value) {
        this.resultsDetailsMaternal = value;
    }

}
