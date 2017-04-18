
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2;

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
 *         &lt;element name="ObservClinSigns" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservClinSigns" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservDermalIrritationIfDermalStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservMortality" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceMortality" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservBodyweight" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservBodyweight" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservFoodConsum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservFoodConsum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservFoodEfficiency" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservFoodEfficiency" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservWaterConsum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservWaterConsum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservOphthalm" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservOphthalm" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservHaematol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservHaematol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservClinChem" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservClinChem" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservUrin" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservUrin" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservNeurobehaviour" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservNeurobehaviour" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ImmunologicalFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityImmunologicalFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservOrganWeights" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservOrganWeights" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservGrpathol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservGrpathol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservNeuropathol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservNeuropathol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservHistopathol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservHistopathol" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservHistopatholNeoplastic" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservHistopatholNeoplastic" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityOtherEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="DetailsOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="RelevanceOfCarcinogenicEffectsPotential" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "observClinSigns",
    "descriptionIncidenceAndSeverityObservClinSigns",
    "observDermalIrritationIfDermalStudy",
    "descriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy",
    "observMortality",
    "descriptionIncidenceMortality",
    "observBodyweight",
    "descriptionIncidenceAndSeverityObservBodyweight",
    "observFoodConsum",
    "descriptionIncidenceAndSeverityObservFoodConsum",
    "observFoodEfficiency",
    "descriptionIncidenceAndSeverityObservFoodEfficiency",
    "observWaterConsum",
    "descriptionIncidenceAndSeverityObservWaterConsum",
    "observOphthalm",
    "descriptionIncidenceAndSeverityObservOphthalm",
    "observHaematol",
    "descriptionIncidenceAndSeverityObservHaematol",
    "observClinChem",
    "descriptionIncidenceAndSeverityObservClinChem",
    "observUrin",
    "descriptionIncidenceAndSeverityObservUrin",
    "observNeurobehaviour",
    "descriptionIncidenceAndSeverityObservNeurobehaviour",
    "immunologicalFindings",
    "descriptionIncidenceAndSeverityImmunologicalFindings",
    "observOrganWeights",
    "descriptionIncidenceAndSeverityObservOrganWeights",
    "observGrpathol",
    "descriptionIncidenceAndSeverityObservGrpathol",
    "observNeuropathol",
    "descriptionIncidenceAndSeverityObservNeuropathol",
    "observHistopathol",
    "descriptionIncidenceAndSeverityObservHistopathol",
    "observHistopatholNeoplastic",
    "descriptionIncidenceAndSeverityObservHistopatholNeoplastic",
    "otherEffects",
    "descriptionIncidenceAndSeverityOtherEffects",
    "detailsOnResults",
    "relevanceOfCarcinogenicEffectsPotential"
})
public class ResultsOfExaminations {

    @XmlElement(name = "ObservClinSigns", required = true)
    protected PicklistField observClinSigns;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservClinSigns", required = true)
    protected String descriptionIncidenceAndSeverityObservClinSigns;
    @XmlElement(name = "ObservDermalIrritationIfDermalStudy", required = true)
    protected PicklistField observDermalIrritationIfDermalStudy;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy", required = true)
    protected String descriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy;
    @XmlElement(name = "ObservMortality", required = true)
    protected PicklistField observMortality;
    @XmlElement(name = "DescriptionIncidenceMortality", required = true)
    protected String descriptionIncidenceMortality;
    @XmlElement(name = "ObservBodyweight", required = true)
    protected PicklistField observBodyweight;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservBodyweight", required = true)
    protected String descriptionIncidenceAndSeverityObservBodyweight;
    @XmlElement(name = "ObservFoodConsum", required = true)
    protected PicklistField observFoodConsum;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservFoodConsum", required = true)
    protected String descriptionIncidenceAndSeverityObservFoodConsum;
    @XmlElement(name = "ObservFoodEfficiency", required = true)
    protected PicklistField observFoodEfficiency;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservFoodEfficiency", required = true)
    protected String descriptionIncidenceAndSeverityObservFoodEfficiency;
    @XmlElement(name = "ObservWaterConsum", required = true)
    protected PicklistField observWaterConsum;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservWaterConsum", required = true)
    protected String descriptionIncidenceAndSeverityObservWaterConsum;
    @XmlElement(name = "ObservOphthalm", required = true)
    protected PicklistField observOphthalm;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservOphthalm", required = true)
    protected String descriptionIncidenceAndSeverityObservOphthalm;
    @XmlElement(name = "ObservHaematol", required = true)
    protected PicklistField observHaematol;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservHaematol", required = true)
    protected String descriptionIncidenceAndSeverityObservHaematol;
    @XmlElement(name = "ObservClinChem", required = true)
    protected PicklistField observClinChem;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservClinChem", required = true)
    protected String descriptionIncidenceAndSeverityObservClinChem;
    @XmlElement(name = "ObservUrin", required = true)
    protected PicklistField observUrin;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservUrin", required = true)
    protected String descriptionIncidenceAndSeverityObservUrin;
    @XmlElement(name = "ObservNeurobehaviour", required = true)
    protected PicklistField observNeurobehaviour;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservNeurobehaviour", required = true)
    protected String descriptionIncidenceAndSeverityObservNeurobehaviour;
    @XmlElement(name = "ImmunologicalFindings", required = true)
    protected PicklistField immunologicalFindings;
    @XmlElement(name = "DescriptionIncidenceAndSeverityImmunologicalFindings", required = true)
    protected String descriptionIncidenceAndSeverityImmunologicalFindings;
    @XmlElement(name = "ObservOrganWeights", required = true)
    protected PicklistField observOrganWeights;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservOrganWeights", required = true)
    protected String descriptionIncidenceAndSeverityObservOrganWeights;
    @XmlElement(name = "ObservGrpathol", required = true)
    protected PicklistField observGrpathol;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservGrpathol", required = true)
    protected String descriptionIncidenceAndSeverityObservGrpathol;
    @XmlElement(name = "ObservNeuropathol", required = true)
    protected PicklistField observNeuropathol;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservNeuropathol", required = true)
    protected String descriptionIncidenceAndSeverityObservNeuropathol;
    @XmlElement(name = "ObservHistopathol", required = true)
    protected PicklistField observHistopathol;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservHistopathol", required = true)
    protected String descriptionIncidenceAndSeverityObservHistopathol;
    @XmlElement(name = "ObservHistopatholNeoplastic", required = true)
    protected PicklistField observHistopatholNeoplastic;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservHistopatholNeoplastic", required = true)
    protected String descriptionIncidenceAndSeverityObservHistopatholNeoplastic;
    @XmlElement(name = "OtherEffects", required = true)
    protected PicklistField otherEffects;
    @XmlElement(name = "DescriptionIncidenceAndSeverityOtherEffects", required = true)
    protected String descriptionIncidenceAndSeverityOtherEffects;
    @XmlElement(name = "DetailsOnResults", required = true)
    protected String detailsOnResults;
    @XmlElement(name = "RelevanceOfCarcinogenicEffectsPotential", required = true)
    protected String relevanceOfCarcinogenicEffectsPotential;

    /**
     * Gets the value of the observClinSigns property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservClinSigns() {
        return observClinSigns;
    }

    /**
     * Sets the value of the observClinSigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservClinSigns(PicklistField value) {
        this.observClinSigns = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservClinSigns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservClinSigns() {
        return descriptionIncidenceAndSeverityObservClinSigns;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservClinSigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservClinSigns(String value) {
        this.descriptionIncidenceAndSeverityObservClinSigns = value;
    }

    /**
     * Gets the value of the observDermalIrritationIfDermalStudy property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservDermalIrritationIfDermalStudy() {
        return observDermalIrritationIfDermalStudy;
    }

    /**
     * Sets the value of the observDermalIrritationIfDermalStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservDermalIrritationIfDermalStudy(PicklistField value) {
        this.observDermalIrritationIfDermalStudy = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy() {
        return descriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy(String value) {
        this.descriptionIncidenceAndSeverityObservDermalIrritationIfDermalStudy = value;
    }

    /**
     * Gets the value of the observMortality property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservMortality() {
        return observMortality;
    }

    /**
     * Sets the value of the observMortality property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservMortality(PicklistField value) {
        this.observMortality = value;
    }

    /**
     * Gets the value of the descriptionIncidenceMortality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceMortality() {
        return descriptionIncidenceMortality;
    }

    /**
     * Sets the value of the descriptionIncidenceMortality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceMortality(String value) {
        this.descriptionIncidenceMortality = value;
    }

    /**
     * Gets the value of the observBodyweight property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservBodyweight() {
        return observBodyweight;
    }

    /**
     * Sets the value of the observBodyweight property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservBodyweight(PicklistField value) {
        this.observBodyweight = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservBodyweight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservBodyweight() {
        return descriptionIncidenceAndSeverityObservBodyweight;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservBodyweight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservBodyweight(String value) {
        this.descriptionIncidenceAndSeverityObservBodyweight = value;
    }

    /**
     * Gets the value of the observFoodConsum property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservFoodConsum() {
        return observFoodConsum;
    }

    /**
     * Sets the value of the observFoodConsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservFoodConsum(PicklistField value) {
        this.observFoodConsum = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservFoodConsum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservFoodConsum() {
        return descriptionIncidenceAndSeverityObservFoodConsum;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservFoodConsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservFoodConsum(String value) {
        this.descriptionIncidenceAndSeverityObservFoodConsum = value;
    }

    /**
     * Gets the value of the observFoodEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservFoodEfficiency() {
        return observFoodEfficiency;
    }

    /**
     * Sets the value of the observFoodEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservFoodEfficiency(PicklistField value) {
        this.observFoodEfficiency = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservFoodEfficiency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservFoodEfficiency() {
        return descriptionIncidenceAndSeverityObservFoodEfficiency;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservFoodEfficiency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservFoodEfficiency(String value) {
        this.descriptionIncidenceAndSeverityObservFoodEfficiency = value;
    }

    /**
     * Gets the value of the observWaterConsum property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservWaterConsum() {
        return observWaterConsum;
    }

    /**
     * Sets the value of the observWaterConsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservWaterConsum(PicklistField value) {
        this.observWaterConsum = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservWaterConsum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservWaterConsum() {
        return descriptionIncidenceAndSeverityObservWaterConsum;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservWaterConsum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservWaterConsum(String value) {
        this.descriptionIncidenceAndSeverityObservWaterConsum = value;
    }

    /**
     * Gets the value of the observOphthalm property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservOphthalm() {
        return observOphthalm;
    }

    /**
     * Sets the value of the observOphthalm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservOphthalm(PicklistField value) {
        this.observOphthalm = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservOphthalm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservOphthalm() {
        return descriptionIncidenceAndSeverityObservOphthalm;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservOphthalm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservOphthalm(String value) {
        this.descriptionIncidenceAndSeverityObservOphthalm = value;
    }

    /**
     * Gets the value of the observHaematol property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservHaematol() {
        return observHaematol;
    }

    /**
     * Sets the value of the observHaematol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservHaematol(PicklistField value) {
        this.observHaematol = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservHaematol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservHaematol() {
        return descriptionIncidenceAndSeverityObservHaematol;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservHaematol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservHaematol(String value) {
        this.descriptionIncidenceAndSeverityObservHaematol = value;
    }

    /**
     * Gets the value of the observClinChem property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservClinChem() {
        return observClinChem;
    }

    /**
     * Sets the value of the observClinChem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservClinChem(PicklistField value) {
        this.observClinChem = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservClinChem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservClinChem() {
        return descriptionIncidenceAndSeverityObservClinChem;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservClinChem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservClinChem(String value) {
        this.descriptionIncidenceAndSeverityObservClinChem = value;
    }

    /**
     * Gets the value of the observUrin property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservUrin() {
        return observUrin;
    }

    /**
     * Sets the value of the observUrin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservUrin(PicklistField value) {
        this.observUrin = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservUrin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservUrin() {
        return descriptionIncidenceAndSeverityObservUrin;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservUrin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservUrin(String value) {
        this.descriptionIncidenceAndSeverityObservUrin = value;
    }

    /**
     * Gets the value of the observNeurobehaviour property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservNeurobehaviour() {
        return observNeurobehaviour;
    }

    /**
     * Sets the value of the observNeurobehaviour property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservNeurobehaviour(PicklistField value) {
        this.observNeurobehaviour = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservNeurobehaviour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservNeurobehaviour() {
        return descriptionIncidenceAndSeverityObservNeurobehaviour;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservNeurobehaviour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservNeurobehaviour(String value) {
        this.descriptionIncidenceAndSeverityObservNeurobehaviour = value;
    }

    /**
     * Gets the value of the immunologicalFindings property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getImmunologicalFindings() {
        return immunologicalFindings;
    }

    /**
     * Sets the value of the immunologicalFindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setImmunologicalFindings(PicklistField value) {
        this.immunologicalFindings = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityImmunologicalFindings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityImmunologicalFindings() {
        return descriptionIncidenceAndSeverityImmunologicalFindings;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityImmunologicalFindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityImmunologicalFindings(String value) {
        this.descriptionIncidenceAndSeverityImmunologicalFindings = value;
    }

    /**
     * Gets the value of the observOrganWeights property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservOrganWeights() {
        return observOrganWeights;
    }

    /**
     * Sets the value of the observOrganWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservOrganWeights(PicklistField value) {
        this.observOrganWeights = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservOrganWeights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservOrganWeights() {
        return descriptionIncidenceAndSeverityObservOrganWeights;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservOrganWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservOrganWeights(String value) {
        this.descriptionIncidenceAndSeverityObservOrganWeights = value;
    }

    /**
     * Gets the value of the observGrpathol property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservGrpathol() {
        return observGrpathol;
    }

    /**
     * Sets the value of the observGrpathol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservGrpathol(PicklistField value) {
        this.observGrpathol = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservGrpathol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservGrpathol() {
        return descriptionIncidenceAndSeverityObservGrpathol;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservGrpathol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservGrpathol(String value) {
        this.descriptionIncidenceAndSeverityObservGrpathol = value;
    }

    /**
     * Gets the value of the observNeuropathol property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservNeuropathol() {
        return observNeuropathol;
    }

    /**
     * Sets the value of the observNeuropathol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservNeuropathol(PicklistField value) {
        this.observNeuropathol = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservNeuropathol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservNeuropathol() {
        return descriptionIncidenceAndSeverityObservNeuropathol;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservNeuropathol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservNeuropathol(String value) {
        this.descriptionIncidenceAndSeverityObservNeuropathol = value;
    }

    /**
     * Gets the value of the observHistopathol property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservHistopathol() {
        return observHistopathol;
    }

    /**
     * Sets the value of the observHistopathol property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservHistopathol(PicklistField value) {
        this.observHistopathol = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservHistopathol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservHistopathol() {
        return descriptionIncidenceAndSeverityObservHistopathol;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservHistopathol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservHistopathol(String value) {
        this.descriptionIncidenceAndSeverityObservHistopathol = value;
    }

    /**
     * Gets the value of the observHistopatholNeoplastic property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservHistopatholNeoplastic() {
        return observHistopatholNeoplastic;
    }

    /**
     * Sets the value of the observHistopatholNeoplastic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservHistopatholNeoplastic(PicklistField value) {
        this.observHistopatholNeoplastic = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservHistopatholNeoplastic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservHistopatholNeoplastic() {
        return descriptionIncidenceAndSeverityObservHistopatholNeoplastic;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservHistopatholNeoplastic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservHistopatholNeoplastic(String value) {
        this.descriptionIncidenceAndSeverityObservHistopatholNeoplastic = value;
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
     * Gets the value of the detailsOnResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnResults() {
        return detailsOnResults;
    }

    /**
     * Sets the value of the detailsOnResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnResults(String value) {
        this.detailsOnResults = value;
    }

    /**
     * Gets the value of the relevanceOfCarcinogenicEffectsPotential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanceOfCarcinogenicEffectsPotential() {
        return relevanceOfCarcinogenicEffectsPotential;
    }

    /**
     * Sets the value of the relevanceOfCarcinogenicEffectsPotential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanceOfCarcinogenicEffectsPotential(String value) {
        this.relevanceOfCarcinogenicEffectsPotential = value;
    }

}
