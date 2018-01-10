
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
 *         &lt;element name="ComplianceWithQualityStandards" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="TestMaterials">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="FormulationType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="AnalyticalMonitoring" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnSamplingAndAnalyticalMethods" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PestTargetOrganismsToBeControlled">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestTargetOrganisms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                   &lt;element name="DetailsOnTestTargetOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrganismsToBeProtectedOrTreatedMaterials" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
 *                   &lt;element name="TotalExposureDurationContactTime" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="ModeOfEfficacyAssessment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="MethodOfApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "complianceWithQualityStandards",
    "testMaterials",
    "pestTargetOrganismsToBeControlled",
    "productsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy",
    "studyDesign",
    "anyOtherInformationOnMaterialsAndMethodsInclTables"
})
public class MaterialsAndMethods {

    @XmlElement(name = "Guideline", required = true)
    protected Guideline guideline;
    @XmlElement(name = "MethodNoGuideline", required = true)
    protected String methodNoGuideline;
    @XmlElement(name = "GLPComplianceStatement", required = true)
    protected PicklistFieldWithSmallTextRemarks glpComplianceStatement;
    @XmlElement(name = "ComplianceWithQualityStandards", required = true)
    protected PicklistFieldWithSmallTextRemarks complianceWithQualityStandards;
    @XmlElement(name = "TestMaterials", required = true)
    protected TestMaterials testMaterials;
    @XmlElement(name = "PestTargetOrganismsToBeControlled", required = true)
    protected PestTargetOrganismsToBeControlled pestTargetOrganismsToBeControlled;
    @XmlElement(name = "ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy", required = true)
    protected ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy productsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy;
    @XmlElement(name = "StudyDesign", required = true)
    protected StudyDesign studyDesign;
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
     * Gets the value of the complianceWithQualityStandards property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getComplianceWithQualityStandards() {
        return complianceWithQualityStandards;
    }

    /**
     * Sets the value of the complianceWithQualityStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setComplianceWithQualityStandards(PicklistFieldWithSmallTextRemarks value) {
        this.complianceWithQualityStandards = value;
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
     * Gets the value of the pestTargetOrganismsToBeControlled property.
     * 
     * @return
     *     possible object is
     *     {@link PestTargetOrganismsToBeControlled }
     *     
     */
    public PestTargetOrganismsToBeControlled getPestTargetOrganismsToBeControlled() {
        return pestTargetOrganismsToBeControlled;
    }

    /**
     * Sets the value of the pestTargetOrganismsToBeControlled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PestTargetOrganismsToBeControlled }
     *     
     */
    public void setPestTargetOrganismsToBeControlled(PestTargetOrganismsToBeControlled value) {
        this.pestTargetOrganismsToBeControlled = value;
    }

    /**
     * Gets the value of the productsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy }
     *     
     */
    public ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy getProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy() {
        return productsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy;
    }

    /**
     * Sets the value of the productsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy }
     *     
     */
    public void setProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy(ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy value) {
        this.productsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy = value;
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
