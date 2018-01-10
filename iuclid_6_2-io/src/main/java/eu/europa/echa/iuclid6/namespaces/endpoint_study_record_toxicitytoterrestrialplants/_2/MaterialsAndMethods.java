
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
 *         &lt;element name="SamplingAndAnalysis">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AnalyticalMonitoring" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnSampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="DetailsOnAnalyticalMethods" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TestSubstrate">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnPreparationAndApplicationOfTestSubstrate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TestOrganisms">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestOrganisms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="PlantGroup" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="DetailsOnTestOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
 *         &lt;element name="StudyDesign">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="StudyType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="SubstrateType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="LimitTest" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="TotalExposureDuration" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                           &lt;sequence>
 *                             &lt;element name="unitCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value=""/>
 *                                   &lt;enumeration value="2113"/>
 *                                   &lt;enumeration value="1976"/>
 *                                   &lt;enumeration value="1839"/>
 *                                   &lt;enumeration value="2468"/>
 *                                   &lt;enumeration value="2133"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="unitOther" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="value" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="PostExposureObservationPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="JustificationForExposureDuration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TestConditions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestTemperature" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="Moisture" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="DetailsOnTestConditions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="NominalAndMeasuredConcentrations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="ReferenceSubstancePositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
    "samplingAndAnalysis",
    "testSubstrate",
    "testOrganisms",
    "studyDesign",
    "testConditions",
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
    @XmlElement(name = "SamplingAndAnalysis", required = true)
    protected SamplingAndAnalysis samplingAndAnalysis;
    @XmlElement(name = "TestSubstrate", required = true)
    protected TestSubstrate testSubstrate;
    @XmlElement(name = "TestOrganisms", required = true)
    protected TestOrganisms testOrganisms;
    @XmlElement(name = "StudyDesign", required = true)
    protected StudyDesign studyDesign;
    @XmlElement(name = "TestConditions", required = true)
    protected TestConditions testConditions;
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
     * Gets the value of the samplingAndAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingAndAnalysis }
     *     
     */
    public SamplingAndAnalysis getSamplingAndAnalysis() {
        return samplingAndAnalysis;
    }

    /**
     * Sets the value of the samplingAndAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingAndAnalysis }
     *     
     */
    public void setSamplingAndAnalysis(SamplingAndAnalysis value) {
        this.samplingAndAnalysis = value;
    }

    /**
     * Gets the value of the testSubstrate property.
     * 
     * @return
     *     possible object is
     *     {@link TestSubstrate }
     *     
     */
    public TestSubstrate getTestSubstrate() {
        return testSubstrate;
    }

    /**
     * Sets the value of the testSubstrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSubstrate }
     *     
     */
    public void setTestSubstrate(TestSubstrate value) {
        this.testSubstrate = value;
    }

    /**
     * Gets the value of the testOrganisms property.
     * 
     * @return
     *     possible object is
     *     {@link TestOrganisms }
     *     
     */
    public TestOrganisms getTestOrganisms() {
        return testOrganisms;
    }

    /**
     * Sets the value of the testOrganisms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOrganisms }
     *     
     */
    public void setTestOrganisms(TestOrganisms value) {
        this.testOrganisms = value;
    }

    /**
     * Gets the value of the studyDesign property.
     * 
     * @return
     *     possible object is
     *     {@link StudyDesign }
     *     
     */
    public StudyDesign getStudyDesign() {
        return studyDesign;
    }

    /**
     * Sets the value of the studyDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudyDesign }
     *     
     */
    public void setStudyDesign(StudyDesign value) {
        this.studyDesign = value;
    }

    /**
     * Gets the value of the testConditions property.
     * 
     * @return
     *     possible object is
     *     {@link TestConditions }
     *     
     */
    public TestConditions getTestConditions() {
        return testConditions;
    }

    /**
     * Sets the value of the testConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestConditions }
     *     
     */
    public void setTestConditions(TestConditions value) {
        this.testConditions = value;
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
