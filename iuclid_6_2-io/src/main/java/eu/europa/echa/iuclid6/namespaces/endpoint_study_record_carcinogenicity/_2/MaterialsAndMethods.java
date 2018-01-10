
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2;

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
 *         &lt;element name="Guideline">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *         &lt;element name="MethodNoGuideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="GLPComplianceStatement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="TestMaterials">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TestAnimals">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Strain" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnSpeciesStrainSelection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdministrationExposure">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RouteOfAdministration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="TypeOfInhalationExposureIfApplicable" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="MassMedianAerodynamicDiameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                   &lt;element name="GeometricStandardDeviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="DetailsOnExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="AnalyticalVerificationOfDosesOrConcentrations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnAnalyticalVerificationOfDosesOrConcentrations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="DurationOfTreatmentExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="FrequencyOfTreatment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="PostExposurePeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="DosesConcentrations">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DoseConc" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value=""/>
 *                                                       &lt;enumeration value="2087"/>
 *                                                       &lt;enumeration value="2086"/>
 *                                                       &lt;enumeration value="2085"/>
 *                                                       &lt;enumeration value="2090"/>
 *                                                       &lt;enumeration value="2102"/>
 *                                                       &lt;enumeration value="2082"/>
 *                                                       &lt;enumeration value="2099"/>
 *                                                       &lt;enumeration value="2101"/>
 *                                                       &lt;enumeration value="2100"/>
 *                                                       &lt;enumeration value="2104"/>
 *                                                       &lt;enumeration value="2106"/>
 *                                                       &lt;enumeration value="2105"/>
 *                                                       &lt;enumeration value="2283"/>
 *                                                       &lt;enumeration value="2285"/>
 *                                                       &lt;enumeration value="2284"/>
 *                                                       &lt;enumeration value="1342"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="unitOther" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="255"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="value" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
 *                   &lt;element name="NoOfAnimalsPerSexPerDose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="ControlAnimals" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="PositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Examinations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ObservationsAndExaminationsPerformedAndFrequency" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="SacrificeAndPathology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="OtherExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AnyOtherInformationOnMaterialsAndMethodsInclTables">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
    "guideline",
    "methodNoGuideline",
    "glpComplianceStatement",
    "testMaterials",
    "testAnimals",
    "administrationExposure",
    "examinations",
    "anyOtherInformationOnMaterialsAndMethodsInclTables"
})
public class MaterialsAndMethods {

    @XmlElement(name = "Guideline", required = true)
    protected Guideline guideline;
    @XmlElement(name = "MethodNoGuideline", required = true)
    protected String methodNoGuideline;
    @XmlElement(name = "GLPComplianceStatement", required = true)
    protected PicklistFieldWithSmallTextRemarks glpComplianceStatement;
    @XmlElement(name = "TestMaterials", required = true)
    protected TestMaterials testMaterials;
    @XmlElement(name = "TestAnimals", required = true)
    protected TestAnimals testAnimals;
    @XmlElement(name = "AdministrationExposure", required = true)
    protected AdministrationExposure administrationExposure;
    @XmlElement(name = "Examinations", required = true)
    protected Examinations examinations;
    @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables", required = true)
    protected AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

    /**
     * Gets the value of the guideline property.
     * 
     * @return
     *     possible object is
     *     {@link Guideline }
     *     
     */
    public Guideline getGuideline() {
        return guideline;
    }

    /**
     * Sets the value of the guideline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Guideline }
     *     
     */
    public void setGuideline(Guideline value) {
        this.guideline = value;
    }

    /**
     * Gets the value of the methodNoGuideline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodNoGuideline() {
        return methodNoGuideline;
    }

    /**
     * Sets the value of the methodNoGuideline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodNoGuideline(String value) {
        this.methodNoGuideline = value;
    }

    /**
     * Gets the value of the glpComplianceStatement property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getGLPComplianceStatement() {
        return glpComplianceStatement;
    }

    /**
     * Sets the value of the glpComplianceStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setGLPComplianceStatement(PicklistFieldWithSmallTextRemarks value) {
        this.glpComplianceStatement = value;
    }

    /**
     * Gets the value of the testMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link TestMaterials }
     *     
     */
    public TestMaterials getTestMaterials() {
        return testMaterials;
    }

    /**
     * Sets the value of the testMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestMaterials }
     *     
     */
    public void setTestMaterials(TestMaterials value) {
        this.testMaterials = value;
    }

    /**
     * Gets the value of the testAnimals property.
     * 
     * @return
     *     possible object is
     *     {@link TestAnimals }
     *     
     */
    public TestAnimals getTestAnimals() {
        return testAnimals;
    }

    /**
     * Sets the value of the testAnimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestAnimals }
     *     
     */
    public void setTestAnimals(TestAnimals value) {
        this.testAnimals = value;
    }

    /**
     * Gets the value of the administrationExposure property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrationExposure }
     *     
     */
    public AdministrationExposure getAdministrationExposure() {
        return administrationExposure;
    }

    /**
     * Sets the value of the administrationExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrationExposure }
     *     
     */
    public void setAdministrationExposure(AdministrationExposure value) {
        this.administrationExposure = value;
    }

    /**
     * Gets the value of the examinations property.
     * 
     * @return
     *     possible object is
     *     {@link Examinations }
     *     
     */
    public Examinations getExaminations() {
        return examinations;
    }

    /**
     * Sets the value of the examinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Examinations }
     *     
     */
    public void setExaminations(Examinations value) {
        this.examinations = value;
    }

    /**
     * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherInformationOnMaterialsAndMethodsInclTables }
     *     
     */
    public AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
        return anyOtherInformationOnMaterialsAndMethodsInclTables;
    }

    /**
     * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherInformationOnMaterialsAndMethodsInclTables }
     *     
     */
    public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
        this.anyOtherInformationOnMaterialsAndMethodsInclTables = value;
    }

}
