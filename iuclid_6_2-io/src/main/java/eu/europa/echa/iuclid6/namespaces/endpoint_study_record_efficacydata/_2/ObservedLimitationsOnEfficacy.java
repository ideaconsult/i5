
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

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
 *         &lt;element name="IndicationOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnDevelopmentOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="UndesirableOrUnintendedSideEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnUndesirableOrUnintendedSideEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherLimitationsObserved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="RelevanceOfStudyResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "indicationOfResistance",
    "detailsOnDevelopmentOfResistance",
    "undesirableOrUnintendedSideEffects",
    "detailsOnUndesirableOrUnintendedSideEffects",
    "otherLimitationsObserved",
    "relevanceOfStudyResults"
})
public class ObservedLimitationsOnEfficacy {

    @XmlElement(name = "IndicationOfResistance", required = true)
    protected PicklistFieldWithSmallTextRemarks indicationOfResistance;
    @XmlElement(name = "DetailsOnDevelopmentOfResistance", required = true)
    protected String detailsOnDevelopmentOfResistance;
    @XmlElement(name = "UndesirableOrUnintendedSideEffects", required = true)
    protected PicklistFieldWithSmallTextRemarks undesirableOrUnintendedSideEffects;
    @XmlElement(name = "DetailsOnUndesirableOrUnintendedSideEffects", required = true)
    protected String detailsOnUndesirableOrUnintendedSideEffects;
    @XmlElement(name = "OtherLimitationsObserved", required = true)
    protected String otherLimitationsObserved;
    @XmlElement(name = "RelevanceOfStudyResults", required = true)
    protected String relevanceOfStudyResults;

    /**
     * Gets the value of the indicationOfResistance property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getIndicationOfResistance() {
        return indicationOfResistance;
    }

    /**
     * Sets the value of the indicationOfResistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setIndicationOfResistance(PicklistFieldWithSmallTextRemarks value) {
        this.indicationOfResistance = value;
    }

    /**
     * Gets the value of the detailsOnDevelopmentOfResistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnDevelopmentOfResistance() {
        return detailsOnDevelopmentOfResistance;
    }

    /**
     * Sets the value of the detailsOnDevelopmentOfResistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnDevelopmentOfResistance(String value) {
        this.detailsOnDevelopmentOfResistance = value;
    }

    /**
     * Gets the value of the undesirableOrUnintendedSideEffects property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getUndesirableOrUnintendedSideEffects() {
        return undesirableOrUnintendedSideEffects;
    }

    /**
     * Sets the value of the undesirableOrUnintendedSideEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setUndesirableOrUnintendedSideEffects(PicklistFieldWithSmallTextRemarks value) {
        this.undesirableOrUnintendedSideEffects = value;
    }

    /**
     * Gets the value of the detailsOnUndesirableOrUnintendedSideEffects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnUndesirableOrUnintendedSideEffects() {
        return detailsOnUndesirableOrUnintendedSideEffects;
    }

    /**
     * Sets the value of the detailsOnUndesirableOrUnintendedSideEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnUndesirableOrUnintendedSideEffects(String value) {
        this.detailsOnUndesirableOrUnintendedSideEffects = value;
    }

    /**
     * Gets the value of the otherLimitationsObserved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLimitationsObserved() {
        return otherLimitationsObserved;
    }

    /**
     * Sets the value of the otherLimitationsObserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLimitationsObserved(String value) {
        this.otherLimitationsObserved = value;
    }

    /**
     * Gets the value of the relevanceOfStudyResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanceOfStudyResults() {
        return relevanceOfStudyResults;
    }

    /**
     * Sets the value of the relevanceOfStudyResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanceOfStudyResults(String value) {
        this.relevanceOfStudyResults = value;
    }

}
