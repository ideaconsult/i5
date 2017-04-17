
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *         &lt;element name="RouteOfAdministration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="TypeOfInhalationExposureIfApplicable" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="MassMedianAerodynamicDiameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="GeometricStandardDeviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *         &lt;element name="RemarksOnMMAD" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="DetailsOnMatingProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="AnalyticalVerificationOfDosesOrConcentrations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnAnalyticalVerificationOfDosesOrConcentrations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="DurationOfTreatmentExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="FrequencyOfTreatment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="DetailsOnStudySchedule" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="DosesConcentrations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="DoseConc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                     &lt;sequence>
 *                                       &lt;element name="unitCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="2087"/>
 *                                             &lt;enumeration value="2086"/>
 *                                             &lt;enumeration value="2085"/>
 *                                             &lt;enumeration value="2090"/>
 *                                             &lt;enumeration value="2102"/>
 *                                             &lt;enumeration value="2082"/>
 *                                             &lt;enumeration value="2099"/>
 *                                             &lt;enumeration value="2101"/>
 *                                             &lt;enumeration value="2100"/>
 *                                             &lt;enumeration value="2104"/>
 *                                             &lt;enumeration value="2106"/>
 *                                             &lt;enumeration value="2105"/>
 *                                             &lt;enumeration value="2283"/>
 *                                             &lt;enumeration value="2285"/>
 *                                             &lt;enumeration value="2284"/>
 *                                             &lt;enumeration value="1342"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="unitOther" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="value" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NoOfAnimalsPerSexPerDose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="ControlAnimals" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="PositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "routeOfAdministration",
    "typeOfInhalationExposureIfApplicable",
    "massMedianAerodynamicDiameter",
    "geometricStandardDeviation",
    "remarksOnMMAD",
    "vehicle",
    "detailsOnExposure",
    "detailsOnMatingProcedure",
    "analyticalVerificationOfDosesOrConcentrations",
    "detailsOnAnalyticalVerificationOfDosesOrConcentrations",
    "durationOfTreatmentExposure",
    "frequencyOfTreatment",
    "detailsOnStudySchedule",
    "dosesConcentrations",
    "noOfAnimalsPerSexPerDose",
    "controlAnimals",
    "detailsOnStudyDesign",
    "positiveControl"
})
public class AdministrationExposure {

    @XmlElement(name = "RouteOfAdministration", required = true)
    protected PicklistField routeOfAdministration;
    @XmlElement(name = "TypeOfInhalationExposureIfApplicable", required = true)
    protected PicklistFieldWithSmallTextRemarks typeOfInhalationExposureIfApplicable;
    @XmlElement(name = "MassMedianAerodynamicDiameter", required = true)
    protected PhysicalQuantityRangeField massMedianAerodynamicDiameter;
    @XmlElement(name = "GeometricStandardDeviation", required = true, nillable = true)
    protected BigDecimal geometricStandardDeviation;
    @XmlElement(name = "RemarksOnMMAD", required = true)
    protected String remarksOnMMAD;
    @XmlElement(name = "Vehicle", required = true)
    protected PicklistFieldWithSmallTextRemarks vehicle;
    @XmlElement(name = "DetailsOnExposure", required = true)
    protected String detailsOnExposure;
    @XmlElement(name = "DetailsOnMatingProcedure", required = true)
    protected String detailsOnMatingProcedure;
    @XmlElement(name = "AnalyticalVerificationOfDosesOrConcentrations", required = true)
    protected PicklistFieldWithSmallTextRemarks analyticalVerificationOfDosesOrConcentrations;
    @XmlElement(name = "DetailsOnAnalyticalVerificationOfDosesOrConcentrations", required = true)
    protected String detailsOnAnalyticalVerificationOfDosesOrConcentrations;
    @XmlElement(name = "DurationOfTreatmentExposure", required = true)
    protected String durationOfTreatmentExposure;
    @XmlElement(name = "FrequencyOfTreatment", required = true)
    protected String frequencyOfTreatment;
    @XmlElement(name = "DetailsOnStudySchedule", required = true)
    protected String detailsOnStudySchedule;
    @XmlElement(name = "DosesConcentrations", required = true)
    protected DosesConcentrations dosesConcentrations;
    @XmlElement(name = "NoOfAnimalsPerSexPerDose", required = true)
    protected String noOfAnimalsPerSexPerDose;
    @XmlElement(name = "ControlAnimals")
    protected List<PicklistFieldWithSmallTextRemarks> controlAnimals;
    @XmlElement(name = "DetailsOnStudyDesign", required = true)
    protected String detailsOnStudyDesign;
    @XmlElement(name = "PositiveControl", required = true)
    protected String positiveControl;

    /**
     * Gets the value of the routeOfAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getRouteOfAdministration() {
        return routeOfAdministration;
    }

    /**
     * Sets the value of the routeOfAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setRouteOfAdministration(PicklistField value) {
        this.routeOfAdministration = value;
    }

    /**
     * Gets the value of the typeOfInhalationExposureIfApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getTypeOfInhalationExposureIfApplicable() {
        return typeOfInhalationExposureIfApplicable;
    }

    /**
     * Sets the value of the typeOfInhalationExposureIfApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setTypeOfInhalationExposureIfApplicable(PicklistFieldWithSmallTextRemarks value) {
        this.typeOfInhalationExposureIfApplicable = value;
    }

    /**
     * Gets the value of the massMedianAerodynamicDiameter property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getMassMedianAerodynamicDiameter() {
        return massMedianAerodynamicDiameter;
    }

    /**
     * Sets the value of the massMedianAerodynamicDiameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setMassMedianAerodynamicDiameter(PhysicalQuantityRangeField value) {
        this.massMedianAerodynamicDiameter = value;
    }

    /**
     * Gets the value of the geometricStandardDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGeometricStandardDeviation() {
        return geometricStandardDeviation;
    }

    /**
     * Sets the value of the geometricStandardDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGeometricStandardDeviation(BigDecimal value) {
        this.geometricStandardDeviation = value;
    }

    /**
     * Gets the value of the remarksOnMMAD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnMMAD() {
        return remarksOnMMAD;
    }

    /**
     * Sets the value of the remarksOnMMAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnMMAD(String value) {
        this.remarksOnMMAD = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setVehicle(PicklistFieldWithSmallTextRemarks value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the detailsOnExposure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnExposure() {
        return detailsOnExposure;
    }

    /**
     * Sets the value of the detailsOnExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnExposure(String value) {
        this.detailsOnExposure = value;
    }

    /**
     * Gets the value of the detailsOnMatingProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnMatingProcedure() {
        return detailsOnMatingProcedure;
    }

    /**
     * Sets the value of the detailsOnMatingProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnMatingProcedure(String value) {
        this.detailsOnMatingProcedure = value;
    }

    /**
     * Gets the value of the analyticalVerificationOfDosesOrConcentrations property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getAnalyticalVerificationOfDosesOrConcentrations() {
        return analyticalVerificationOfDosesOrConcentrations;
    }

    /**
     * Sets the value of the analyticalVerificationOfDosesOrConcentrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setAnalyticalVerificationOfDosesOrConcentrations(PicklistFieldWithSmallTextRemarks value) {
        this.analyticalVerificationOfDosesOrConcentrations = value;
    }

    /**
     * Gets the value of the detailsOnAnalyticalVerificationOfDosesOrConcentrations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnAnalyticalVerificationOfDosesOrConcentrations() {
        return detailsOnAnalyticalVerificationOfDosesOrConcentrations;
    }

    /**
     * Sets the value of the detailsOnAnalyticalVerificationOfDosesOrConcentrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnAnalyticalVerificationOfDosesOrConcentrations(String value) {
        this.detailsOnAnalyticalVerificationOfDosesOrConcentrations = value;
    }

    /**
     * Gets the value of the durationOfTreatmentExposure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationOfTreatmentExposure() {
        return durationOfTreatmentExposure;
    }

    /**
     * Sets the value of the durationOfTreatmentExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationOfTreatmentExposure(String value) {
        this.durationOfTreatmentExposure = value;
    }

    /**
     * Gets the value of the frequencyOfTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequencyOfTreatment() {
        return frequencyOfTreatment;
    }

    /**
     * Sets the value of the frequencyOfTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequencyOfTreatment(String value) {
        this.frequencyOfTreatment = value;
    }

    /**
     * Gets the value of the detailsOnStudySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnStudySchedule() {
        return detailsOnStudySchedule;
    }

    /**
     * Sets the value of the detailsOnStudySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnStudySchedule(String value) {
        this.detailsOnStudySchedule = value;
    }

    /**
     * Gets the value of the dosesConcentrations property.
     * 
     * @return
     *     possible object is
     *     {@link DosesConcentrations }
     *     
     */
    public DosesConcentrations getDosesConcentrations() {
        return dosesConcentrations;
    }

    /**
     * Sets the value of the dosesConcentrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DosesConcentrations }
     *     
     */
    public void setDosesConcentrations(DosesConcentrations value) {
        this.dosesConcentrations = value;
    }

    /**
     * Gets the value of the noOfAnimalsPerSexPerDose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfAnimalsPerSexPerDose() {
        return noOfAnimalsPerSexPerDose;
    }

    /**
     * Sets the value of the noOfAnimalsPerSexPerDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfAnimalsPerSexPerDose(String value) {
        this.noOfAnimalsPerSexPerDose = value;
    }

    /**
     * Gets the value of the controlAnimals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlAnimals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlAnimals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistFieldWithSmallTextRemarks }
     * 
     * 
     */
    public List<PicklistFieldWithSmallTextRemarks> getControlAnimals() {
        if (controlAnimals == null) {
            controlAnimals = new ArrayList<PicklistFieldWithSmallTextRemarks>();
        }
        return this.controlAnimals;
    }

    /**
     * Gets the value of the detailsOnStudyDesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnStudyDesign() {
        return detailsOnStudyDesign;
    }

    /**
     * Sets the value of the detailsOnStudyDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnStudyDesign(String value) {
        this.detailsOnStudyDesign = value;
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

}
