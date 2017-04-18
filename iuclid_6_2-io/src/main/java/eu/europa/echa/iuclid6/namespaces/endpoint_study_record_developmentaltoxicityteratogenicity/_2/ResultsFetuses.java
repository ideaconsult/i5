
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
 *         &lt;element name="FetalBodyWeightChanges" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ReductionInNumberOfLiveOffspring" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ChangesInSexRatio" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityChangesInSexRatio" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="FetalPupBodyWeightChanges" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityFetalPupBodyWeightChanges" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ChangesInLitterSizeAndWeights" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityChangesInLitterSizeAndWeights" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ChangesInPostnatalSurvival" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityChangesInPostnatalSurvival" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ExternalMalformations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityExternalMalformations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SkeletalMalformations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeveritySkeletalMalformations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="VisceralMalformations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityVisceralMalformations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityOtherEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ResultsDetailsDevelop" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="EffectLevelsFetuses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Efflevel">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="EffectLevel" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Basis" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FetalAbnormalities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FetalAbnormalities">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="Abnormalities" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Localisation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="DescriptionIncidenceAndSeverity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
    "fetalBodyWeightChanges",
    "descriptionIncidenceAndSeverity",
    "reductionInNumberOfLiveOffspring",
    "descriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring",
    "changesInSexRatio",
    "descriptionIncidenceAndSeverityChangesInSexRatio",
    "fetalPupBodyWeightChanges",
    "descriptionIncidenceAndSeverityFetalPupBodyWeightChanges",
    "changesInLitterSizeAndWeights",
    "descriptionIncidenceAndSeverityChangesInLitterSizeAndWeights",
    "changesInPostnatalSurvival",
    "descriptionIncidenceAndSeverityChangesInPostnatalSurvival",
    "externalMalformations",
    "descriptionIncidenceAndSeverityExternalMalformations",
    "skeletalMalformations",
    "descriptionIncidenceAndSeveritySkeletalMalformations",
    "visceralMalformations",
    "descriptionIncidenceAndSeverityVisceralMalformations",
    "otherEffects",
    "descriptionIncidenceAndSeverityOtherEffects",
    "resultsDetailsDevelop",
    "effectLevelsFetuses",
    "fetalAbnormalities"
})
public class ResultsFetuses {

    @XmlElement(name = "FetalBodyWeightChanges", required = true)
    protected PicklistField fetalBodyWeightChanges;
    @XmlElement(name = "DescriptionIncidenceAndSeverity", required = true)
    protected String descriptionIncidenceAndSeverity;
    @XmlElement(name = "ReductionInNumberOfLiveOffspring", required = true)
    protected PicklistField reductionInNumberOfLiveOffspring;
    @XmlElement(name = "DescriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring", required = true)
    protected String descriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring;
    @XmlElement(name = "ChangesInSexRatio", required = true)
    protected PicklistField changesInSexRatio;
    @XmlElement(name = "DescriptionIncidenceAndSeverityChangesInSexRatio", required = true)
    protected String descriptionIncidenceAndSeverityChangesInSexRatio;
    @XmlElement(name = "FetalPupBodyWeightChanges", required = true)
    protected PicklistField fetalPupBodyWeightChanges;
    @XmlElement(name = "DescriptionIncidenceAndSeverityFetalPupBodyWeightChanges", required = true)
    protected String descriptionIncidenceAndSeverityFetalPupBodyWeightChanges;
    @XmlElement(name = "ChangesInLitterSizeAndWeights", required = true)
    protected PicklistField changesInLitterSizeAndWeights;
    @XmlElement(name = "DescriptionIncidenceAndSeverityChangesInLitterSizeAndWeights", required = true)
    protected String descriptionIncidenceAndSeverityChangesInLitterSizeAndWeights;
    @XmlElement(name = "ChangesInPostnatalSurvival", required = true)
    protected PicklistField changesInPostnatalSurvival;
    @XmlElement(name = "DescriptionIncidenceAndSeverityChangesInPostnatalSurvival", required = true)
    protected String descriptionIncidenceAndSeverityChangesInPostnatalSurvival;
    @XmlElement(name = "ExternalMalformations", required = true)
    protected PicklistField externalMalformations;
    @XmlElement(name = "DescriptionIncidenceAndSeverityExternalMalformations", required = true)
    protected String descriptionIncidenceAndSeverityExternalMalformations;
    @XmlElement(name = "SkeletalMalformations", required = true)
    protected PicklistField skeletalMalformations;
    @XmlElement(name = "DescriptionIncidenceAndSeveritySkeletalMalformations", required = true)
    protected String descriptionIncidenceAndSeveritySkeletalMalformations;
    @XmlElement(name = "VisceralMalformations", required = true)
    protected PicklistField visceralMalformations;
    @XmlElement(name = "DescriptionIncidenceAndSeverityVisceralMalformations", required = true)
    protected String descriptionIncidenceAndSeverityVisceralMalformations;
    @XmlElement(name = "OtherEffects", required = true)
    protected PicklistField otherEffects;
    @XmlElement(name = "DescriptionIncidenceAndSeverityOtherEffects", required = true)
    protected String descriptionIncidenceAndSeverityOtherEffects;
    @XmlElement(name = "ResultsDetailsDevelop", required = true)
    protected String resultsDetailsDevelop;
    @XmlElement(name = "EffectLevelsFetuses", required = true)
    protected EffectLevelsFetuses effectLevelsFetuses;
    @XmlElement(name = "FetalAbnormalities", required = true)
    protected FetalAbnormalities fetalAbnormalities;

    /**
     * Gets the value of the fetalBodyWeightChanges property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getFetalBodyWeightChanges() {
        return fetalBodyWeightChanges;
    }

    /**
     * Sets the value of the fetalBodyWeightChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setFetalBodyWeightChanges(PicklistField value) {
        this.fetalBodyWeightChanges = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverity() {
        return descriptionIncidenceAndSeverity;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverity(String value) {
        this.descriptionIncidenceAndSeverity = value;
    }

    /**
     * Gets the value of the reductionInNumberOfLiveOffspring property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getReductionInNumberOfLiveOffspring() {
        return reductionInNumberOfLiveOffspring;
    }

    /**
     * Sets the value of the reductionInNumberOfLiveOffspring property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setReductionInNumberOfLiveOffspring(PicklistField value) {
        this.reductionInNumberOfLiveOffspring = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring() {
        return descriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring(String value) {
        this.descriptionIncidenceAndSeverityReductionInNumberOfLiveOffspring = value;
    }

    /**
     * Gets the value of the changesInSexRatio property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getChangesInSexRatio() {
        return changesInSexRatio;
    }

    /**
     * Sets the value of the changesInSexRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setChangesInSexRatio(PicklistField value) {
        this.changesInSexRatio = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityChangesInSexRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityChangesInSexRatio() {
        return descriptionIncidenceAndSeverityChangesInSexRatio;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityChangesInSexRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityChangesInSexRatio(String value) {
        this.descriptionIncidenceAndSeverityChangesInSexRatio = value;
    }

    /**
     * Gets the value of the fetalPupBodyWeightChanges property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getFetalPupBodyWeightChanges() {
        return fetalPupBodyWeightChanges;
    }

    /**
     * Sets the value of the fetalPupBodyWeightChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setFetalPupBodyWeightChanges(PicklistField value) {
        this.fetalPupBodyWeightChanges = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityFetalPupBodyWeightChanges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityFetalPupBodyWeightChanges() {
        return descriptionIncidenceAndSeverityFetalPupBodyWeightChanges;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityFetalPupBodyWeightChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityFetalPupBodyWeightChanges(String value) {
        this.descriptionIncidenceAndSeverityFetalPupBodyWeightChanges = value;
    }

    /**
     * Gets the value of the changesInLitterSizeAndWeights property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getChangesInLitterSizeAndWeights() {
        return changesInLitterSizeAndWeights;
    }

    /**
     * Sets the value of the changesInLitterSizeAndWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setChangesInLitterSizeAndWeights(PicklistField value) {
        this.changesInLitterSizeAndWeights = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityChangesInLitterSizeAndWeights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityChangesInLitterSizeAndWeights() {
        return descriptionIncidenceAndSeverityChangesInLitterSizeAndWeights;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityChangesInLitterSizeAndWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityChangesInLitterSizeAndWeights(String value) {
        this.descriptionIncidenceAndSeverityChangesInLitterSizeAndWeights = value;
    }

    /**
     * Gets the value of the changesInPostnatalSurvival property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getChangesInPostnatalSurvival() {
        return changesInPostnatalSurvival;
    }

    /**
     * Sets the value of the changesInPostnatalSurvival property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setChangesInPostnatalSurvival(PicklistField value) {
        this.changesInPostnatalSurvival = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityChangesInPostnatalSurvival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityChangesInPostnatalSurvival() {
        return descriptionIncidenceAndSeverityChangesInPostnatalSurvival;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityChangesInPostnatalSurvival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityChangesInPostnatalSurvival(String value) {
        this.descriptionIncidenceAndSeverityChangesInPostnatalSurvival = value;
    }

    /**
     * Gets the value of the externalMalformations property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getExternalMalformations() {
        return externalMalformations;
    }

    /**
     * Sets the value of the externalMalformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setExternalMalformations(PicklistField value) {
        this.externalMalformations = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityExternalMalformations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityExternalMalformations() {
        return descriptionIncidenceAndSeverityExternalMalformations;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityExternalMalformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityExternalMalformations(String value) {
        this.descriptionIncidenceAndSeverityExternalMalformations = value;
    }

    /**
     * Gets the value of the skeletalMalformations property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSkeletalMalformations() {
        return skeletalMalformations;
    }

    /**
     * Sets the value of the skeletalMalformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSkeletalMalformations(PicklistField value) {
        this.skeletalMalformations = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeveritySkeletalMalformations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeveritySkeletalMalformations() {
        return descriptionIncidenceAndSeveritySkeletalMalformations;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeveritySkeletalMalformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeveritySkeletalMalformations(String value) {
        this.descriptionIncidenceAndSeveritySkeletalMalformations = value;
    }

    /**
     * Gets the value of the visceralMalformations property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getVisceralMalformations() {
        return visceralMalformations;
    }

    /**
     * Sets the value of the visceralMalformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setVisceralMalformations(PicklistField value) {
        this.visceralMalformations = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityVisceralMalformations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityVisceralMalformations() {
        return descriptionIncidenceAndSeverityVisceralMalformations;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityVisceralMalformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityVisceralMalformations(String value) {
        this.descriptionIncidenceAndSeverityVisceralMalformations = value;
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
     * Gets the value of the resultsDetailsDevelop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsDetailsDevelop() {
        return resultsDetailsDevelop;
    }

    /**
     * Sets the value of the resultsDetailsDevelop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsDetailsDevelop(String value) {
        this.resultsDetailsDevelop = value;
    }

    /**
     * Gets the value of the effectLevelsFetuses property.
     * 
     * @return
     *     possible object is
     *     {@link EffectLevelsFetuses }
     *     
     */
    public EffectLevelsFetuses getEffectLevelsFetuses() {
        return effectLevelsFetuses;
    }

    /**
     * Sets the value of the effectLevelsFetuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectLevelsFetuses }
     *     
     */
    public void setEffectLevelsFetuses(EffectLevelsFetuses value) {
        this.effectLevelsFetuses = value;
    }

    /**
     * Gets the value of the fetalAbnormalities property.
     * 
     * @return
     *     possible object is
     *     {@link FetalAbnormalities }
     *     
     */
    public FetalAbnormalities getFetalAbnormalities() {
        return fetalAbnormalities;
    }

    /**
     * Sets the value of the fetalAbnormalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FetalAbnormalities }
     *     
     */
    public void setFetalAbnormalities(FetalAbnormalities value) {
        this.fetalAbnormalities = value;
    }

}
