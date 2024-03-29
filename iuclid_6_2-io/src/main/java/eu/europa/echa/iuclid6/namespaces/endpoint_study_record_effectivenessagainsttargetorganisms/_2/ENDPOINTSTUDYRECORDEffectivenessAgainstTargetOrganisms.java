
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_effectivenessagainsttargetorganisms._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.AttachmentListField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithLargeTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


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
 *         &lt;element name="AdministrativeData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                   &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks"/>
 *                   &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="AttachedJustification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                                       &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                   &lt;element name="CrossReference">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
 *         &lt;element name="GeneralInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BackgroundInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="PestTargetOrganismsToBeControlled">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TargetOrganisms">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                                 &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                                 &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProductsOrganismsOrObjectsToBeProtectedUnderStudy">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OrganismsToBeProtectedOrTreatedMaterials" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InformationOnIntendedUseAndApplication">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FunctionAddressed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ProductType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="FieldOfUseEnvisagedUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InformationOnApplicationOfBiocidalProduct">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MethodOfApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DetailsOnApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GeneralInformationOnEffectiveness">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="EffectsOnTargetOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="ModeAction" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="DetailsOnModeOfAction" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="PossibleOccurrenceOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="ManagementStrategiesToAvoidResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="AnyOtherKnownLimitationsAndManagementStrategies" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
 *         &lt;element name="OverallRemarksAttachments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                   &lt;element name="AttachedBackgroundMaterial">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                   &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField"/>
 *                   &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicantSummaryAndConclusion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
    "administrativeData",
    "generalInformation",
    "overallRemarksAttachments",
    "applicantSummaryAndConclusion"
})
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.EffectivenessAgainstTargetOrganisms")
public class ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms {

    @XmlElement(name = "AdministrativeData", required = true)
    protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData administrativeData;
    @XmlElement(name = "GeneralInformation", required = true)
    protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation generalInformation;
    @XmlElement(name = "OverallRemarksAttachments", required = true)
    protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion", required = true)
    protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the generalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation }
     *     
     */
    public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation getGeneralInformation() {
        return generalInformation;
    }

    /**
     * Sets the value of the generalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation }
     *     
     */
    public void setGeneralInformation(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation value) {
        this.generalInformation = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.ApplicantSummaryAndConclusion value) {
        this.applicantSummaryAndConclusion = value;
    }


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
     *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *         &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks"/>
     *         &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="AttachedJustification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
     *                             &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *         &lt;element name="CrossReference">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                             &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
        "dataProtection",
        "endpoint",
        "studyResultType",
        "purposeFlag",
        "robustStudy",
        "usedForClassification",
        "usedForMSDS",
        "studyPeriod",
        "reliability",
        "rationalReliability",
        "dataWaiving",
        "dataWaivingJustification",
        "justificationForTypeOfInformation",
        "attachedJustification",
        "crossReference"
    })
    public static class AdministrativeData {

        @XmlElement(name = "DataProtection", required = true)
        protected DataProtectionField dataProtection;
        @XmlElement(name = "Endpoint", required = true)
        protected PicklistFieldWithSmallTextRemarks endpoint;
        @XmlElement(name = "StudyResultType", required = true)
        protected PicklistFieldWithSmallTextRemarks studyResultType;
        @XmlElement(name = "PurposeFlag", required = true)
        protected PicklistField purposeFlag;
        @XmlElement(name = "RobustStudy", required = true, type = Boolean.class, nillable = true)
        protected Boolean robustStudy;
        @XmlElement(name = "UsedForClassification", required = true, type = Boolean.class, nillable = true)
        protected Boolean usedForClassification;
        @XmlElement(name = "UsedForMSDS", required = true, type = Boolean.class, nillable = true)
        protected Boolean usedForMSDS;
        @XmlElement(name = "StudyPeriod", required = true)
        protected String studyPeriod;
        @XmlElement(name = "Reliability", required = true)
        protected PicklistField reliability;
        @XmlElement(name = "RationalReliability", required = true)
        protected PicklistFieldWithLargeTextRemarks rationalReliability;
        @XmlElement(name = "DataWaiving", required = true)
        protected PicklistField dataWaiving;
        @XmlElement(name = "DataWaivingJustification")
        protected List<PicklistFieldWithLargeTextRemarks> dataWaivingJustification;
        @XmlElement(name = "JustificationForTypeOfInformation", required = true)
        protected String justificationForTypeOfInformation;
        @XmlElement(name = "AttachedJustification", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference crossReference;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link DataProtectionField }
         *     
         */
        public DataProtectionField getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataProtectionField }
         *     
         */
        public void setDataProtection(DataProtectionField value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setEndpoint(PicklistFieldWithSmallTextRemarks value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setStudyResultType(PicklistFieldWithSmallTextRemarks value) {
            this.studyResultType = value;
        }

        /**
         * Gets the value of the purposeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getPurposeFlag() {
            return purposeFlag;
        }

        /**
         * Sets the value of the purposeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setPurposeFlag(PicklistField value) {
            this.purposeFlag = value;
        }

        /**
         * Gets the value of the robustStudy property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getRobustStudy() {
            return robustStudy;
        }

        /**
         * Sets the value of the robustStudy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRobustStudy(Boolean value) {
            this.robustStudy = value;
        }

        /**
         * Gets the value of the usedForClassification property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getUsedForClassification() {
            return usedForClassification;
        }

        /**
         * Sets the value of the usedForClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUsedForClassification(Boolean value) {
            this.usedForClassification = value;
        }

        /**
         * Gets the value of the usedForMSDS property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getUsedForMSDS() {
            return usedForMSDS;
        }

        /**
         * Sets the value of the usedForMSDS property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUsedForMSDS(Boolean value) {
            this.usedForMSDS = value;
        }

        /**
         * Gets the value of the studyPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudyPeriod() {
            return studyPeriod;
        }

        /**
         * Sets the value of the studyPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudyPeriod(String value) {
            this.studyPeriod = value;
        }

        /**
         * Gets the value of the reliability property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getReliability() {
            return reliability;
        }

        /**
         * Sets the value of the reliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setReliability(PicklistField value) {
            this.reliability = value;
        }

        /**
         * Gets the value of the rationalReliability property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithLargeTextRemarks }
         *     
         */
        public PicklistFieldWithLargeTextRemarks getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithLargeTextRemarks }
         *     
         */
        public void setRationalReliability(PicklistFieldWithLargeTextRemarks value) {
            this.rationalReliability = value;
        }

        /**
         * Gets the value of the dataWaiving property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getDataWaiving() {
            return dataWaiving;
        }

        /**
         * Sets the value of the dataWaiving property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setDataWaiving(PicklistField value) {
            this.dataWaiving = value;
        }

        /**
         * Gets the value of the dataWaivingJustification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataWaivingJustification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataWaivingJustification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PicklistFieldWithLargeTextRemarks }
         * 
         * 
         */
        public List<PicklistFieldWithLargeTextRemarks> getDataWaivingJustification() {
            if (dataWaivingJustification == null) {
                dataWaivingJustification = new ArrayList<PicklistFieldWithLargeTextRemarks>();
            }
            return this.dataWaivingJustification;
        }

        /**
         * Gets the value of the justificationForTypeOfInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificationForTypeOfInformation() {
            return justificationForTypeOfInformation;
        }

        /**
         * Sets the value of the justificationForTypeOfInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificationForTypeOfInformation(String value) {
            this.justificationForTypeOfInformation = value;
        }

        /**
         * Gets the value of the attachedJustification property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference value) {
            this.crossReference = value;
        }


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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
         *                   &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "entry"
        })
        public static class AttachedJustification {

            protected List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.AttachedJustification.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
             *         &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attachedJustification",
                "reasonPurpose"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "AttachedJustification", required = true)
                protected String attachedJustification;
                @XmlElement(name = "ReasonPurpose", required = true)
                protected PicklistFieldWithSmallTextRemarks reasonPurpose;

                /**
                 * Gets the value of the attachedJustification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttachedJustification() {
                    return attachedJustification;
                }

                /**
                 * Sets the value of the attachedJustification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttachedJustification(String value) {
                    this.attachedJustification = value;
                }

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setReasonPurpose(PicklistFieldWithSmallTextRemarks value) {
                    this.reasonPurpose = value;
                }

            }

        }


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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                   &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "entry"
        })
        public static class CrossReference {

            protected List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.AdministrativeData.CrossReference.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *         &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reasonPurpose",
                "relatedInformation",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "ReasonPurpose", required = true)
                protected PicklistFieldWithSmallTextRemarks reasonPurpose;
                @XmlElement(name = "RelatedInformation", required = true)
                protected String relatedInformation;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setReasonPurpose(PicklistFieldWithSmallTextRemarks value) {
                    this.reasonPurpose = value;
                }

                /**
                 * Gets the value of the relatedInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRelatedInformation() {
                    return relatedInformation;
                }

                /**
                 * Sets the value of the relatedInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRelatedInformation(String value) {
                    this.relatedInformation = value;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemarks() {
                    return remarks;
                }

                /**
                 * Sets the value of the remarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemarks(String value) {
                    this.remarks = value;
                }

            }

        }

    }


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
     *         &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
        "conclusions",
        "executiveSummary"
    })
    public static class ApplicantSummaryAndConclusion {

        @XmlElement(name = "Conclusions", required = true)
        protected String conclusions;
        @XmlElement(name = "ExecutiveSummary", required = true)
        protected String executiveSummary;

        /**
         * Gets the value of the conclusions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConclusions() {
            return conclusions;
        }

        /**
         * Sets the value of the conclusions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConclusions(String value) {
            this.conclusions = value;
        }

        /**
         * Gets the value of the executiveSummary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExecutiveSummary() {
            return executiveSummary;
        }

        /**
         * Sets the value of the executiveSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExecutiveSummary(String value) {
            this.executiveSummary = value;
        }

    }


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
     *         &lt;element name="BackgroundInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *         &lt;element name="PestTargetOrganismsToBeControlled">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TargetOrganisms">
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
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProductsOrganismsOrObjectsToBeProtectedUnderStudy">
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
     *         &lt;element name="InformationOnIntendedUseAndApplication">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FunctionAddressed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ProductType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="FieldOfUseEnvisagedUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InformationOnApplicationOfBiocidalProduct">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MethodOfApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DetailsOnApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GeneralInformationOnEffectiveness">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="EffectsOnTargetOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="ModeAction" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                   &lt;element name="DetailsOnModeOfAction" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="PossibleOccurrenceOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="ManagementStrategiesToAvoidResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="AnyOtherKnownLimitationsAndManagementStrategies" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
        "backgroundInformation",
        "pestTargetOrganismsToBeControlled",
        "productsOrganismsOrObjectsToBeProtectedUnderStudy",
        "informationOnIntendedUseAndApplication",
        "informationOnApplicationOfBiocidalProduct",
        "generalInformationOnEffectiveness"
    })
    public static class GeneralInformation {

        @XmlElement(name = "BackgroundInformation", required = true)
        protected String backgroundInformation;
        @XmlElement(name = "PestTargetOrganismsToBeControlled", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled pestTargetOrganismsToBeControlled;
        @XmlElement(name = "ProductsOrganismsOrObjectsToBeProtectedUnderStudy", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.ProductsOrganismsOrObjectsToBeProtectedUnderStudy productsOrganismsOrObjectsToBeProtectedUnderStudy;
        @XmlElement(name = "InformationOnIntendedUseAndApplication", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnIntendedUseAndApplication informationOnIntendedUseAndApplication;
        @XmlElement(name = "InformationOnApplicationOfBiocidalProduct", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnApplicationOfBiocidalProduct informationOnApplicationOfBiocidalProduct;
        @XmlElement(name = "GeneralInformationOnEffectiveness", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.GeneralInformationOnEffectiveness generalInformationOnEffectiveness;

        /**
         * Gets the value of the backgroundInformation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBackgroundInformation() {
            return backgroundInformation;
        }

        /**
         * Sets the value of the backgroundInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBackgroundInformation(String value) {
            this.backgroundInformation = value;
        }

        /**
         * Gets the value of the pestTargetOrganismsToBeControlled property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled getPestTargetOrganismsToBeControlled() {
            return pestTargetOrganismsToBeControlled;
        }

        /**
         * Sets the value of the pestTargetOrganismsToBeControlled property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled }
         *     
         */
        public void setPestTargetOrganismsToBeControlled(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled value) {
            this.pestTargetOrganismsToBeControlled = value;
        }

        /**
         * Gets the value of the productsOrganismsOrObjectsToBeProtectedUnderStudy property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.ProductsOrganismsOrObjectsToBeProtectedUnderStudy }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.ProductsOrganismsOrObjectsToBeProtectedUnderStudy getProductsOrganismsOrObjectsToBeProtectedUnderStudy() {
            return productsOrganismsOrObjectsToBeProtectedUnderStudy;
        }

        /**
         * Sets the value of the productsOrganismsOrObjectsToBeProtectedUnderStudy property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.ProductsOrganismsOrObjectsToBeProtectedUnderStudy }
         *     
         */
        public void setProductsOrganismsOrObjectsToBeProtectedUnderStudy(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.ProductsOrganismsOrObjectsToBeProtectedUnderStudy value) {
            this.productsOrganismsOrObjectsToBeProtectedUnderStudy = value;
        }

        /**
         * Gets the value of the informationOnIntendedUseAndApplication property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnIntendedUseAndApplication }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnIntendedUseAndApplication getInformationOnIntendedUseAndApplication() {
            return informationOnIntendedUseAndApplication;
        }

        /**
         * Sets the value of the informationOnIntendedUseAndApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnIntendedUseAndApplication }
         *     
         */
        public void setInformationOnIntendedUseAndApplication(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnIntendedUseAndApplication value) {
            this.informationOnIntendedUseAndApplication = value;
        }

        /**
         * Gets the value of the informationOnApplicationOfBiocidalProduct property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnApplicationOfBiocidalProduct }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnApplicationOfBiocidalProduct getInformationOnApplicationOfBiocidalProduct() {
            return informationOnApplicationOfBiocidalProduct;
        }

        /**
         * Sets the value of the informationOnApplicationOfBiocidalProduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnApplicationOfBiocidalProduct }
         *     
         */
        public void setInformationOnApplicationOfBiocidalProduct(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.InformationOnApplicationOfBiocidalProduct value) {
            this.informationOnApplicationOfBiocidalProduct = value;
        }

        /**
         * Gets the value of the generalInformationOnEffectiveness property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.GeneralInformationOnEffectiveness }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.GeneralInformationOnEffectiveness getGeneralInformationOnEffectiveness() {
            return generalInformationOnEffectiveness;
        }

        /**
         * Sets the value of the generalInformationOnEffectiveness property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.GeneralInformationOnEffectiveness }
         *     
         */
        public void setGeneralInformationOnEffectiveness(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.GeneralInformationOnEffectiveness value) {
            this.generalInformationOnEffectiveness = value;
        }


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
         *         &lt;element name="EffectsOnTargetOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="ModeAction" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *         &lt;element name="DetailsOnModeOfAction" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="PossibleOccurrenceOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="ManagementStrategiesToAvoidResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="AnyOtherKnownLimitationsAndManagementStrategies" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "effectsOnTargetOrganisms",
            "modeAction",
            "detailsOnModeOfAction",
            "possibleOccurrenceOfResistance",
            "managementStrategiesToAvoidResistance",
            "anyOtherKnownLimitationsAndManagementStrategies"
        })
        public static class GeneralInformationOnEffectiveness {

            @XmlElement(name = "EffectsOnTargetOrganisms", required = true)
            protected String effectsOnTargetOrganisms;
            @XmlElement(name = "ModeAction", required = true)
            protected PicklistFieldWithSmallTextRemarks modeAction;
            @XmlElement(name = "DetailsOnModeOfAction", required = true)
            protected String detailsOnModeOfAction;
            @XmlElement(name = "PossibleOccurrenceOfResistance", required = true)
            protected String possibleOccurrenceOfResistance;
            @XmlElement(name = "ManagementStrategiesToAvoidResistance", required = true)
            protected String managementStrategiesToAvoidResistance;
            @XmlElement(name = "AnyOtherKnownLimitationsAndManagementStrategies", required = true)
            protected String anyOtherKnownLimitationsAndManagementStrategies;

            /**
             * Gets the value of the effectsOnTargetOrganisms property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEffectsOnTargetOrganisms() {
                return effectsOnTargetOrganisms;
            }

            /**
             * Sets the value of the effectsOnTargetOrganisms property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEffectsOnTargetOrganisms(String value) {
                this.effectsOnTargetOrganisms = value;
            }

            /**
             * Gets the value of the modeAction property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public PicklistFieldWithSmallTextRemarks getModeAction() {
                return modeAction;
            }

            /**
             * Sets the value of the modeAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public void setModeAction(PicklistFieldWithSmallTextRemarks value) {
                this.modeAction = value;
            }

            /**
             * Gets the value of the detailsOnModeOfAction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnModeOfAction() {
                return detailsOnModeOfAction;
            }

            /**
             * Sets the value of the detailsOnModeOfAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnModeOfAction(String value) {
                this.detailsOnModeOfAction = value;
            }

            /**
             * Gets the value of the possibleOccurrenceOfResistance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPossibleOccurrenceOfResistance() {
                return possibleOccurrenceOfResistance;
            }

            /**
             * Sets the value of the possibleOccurrenceOfResistance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPossibleOccurrenceOfResistance(String value) {
                this.possibleOccurrenceOfResistance = value;
            }

            /**
             * Gets the value of the managementStrategiesToAvoidResistance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getManagementStrategiesToAvoidResistance() {
                return managementStrategiesToAvoidResistance;
            }

            /**
             * Sets the value of the managementStrategiesToAvoidResistance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setManagementStrategiesToAvoidResistance(String value) {
                this.managementStrategiesToAvoidResistance = value;
            }

            /**
             * Gets the value of the anyOtherKnownLimitationsAndManagementStrategies property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnyOtherKnownLimitationsAndManagementStrategies() {
                return anyOtherKnownLimitationsAndManagementStrategies;
            }

            /**
             * Sets the value of the anyOtherKnownLimitationsAndManagementStrategies property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnyOtherKnownLimitationsAndManagementStrategies(String value) {
                this.anyOtherKnownLimitationsAndManagementStrategies = value;
            }

        }


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
         *         &lt;element name="MethodOfApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DetailsOnApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "methodOfApplication",
            "detailsOnApplication"
        })
        public static class InformationOnApplicationOfBiocidalProduct {

            @XmlElement(name = "MethodOfApplication")
            protected List<PicklistFieldWithSmallTextRemarks> methodOfApplication;
            @XmlElement(name = "DetailsOnApplication", required = true)
            protected String detailsOnApplication;

            /**
             * Gets the value of the methodOfApplication property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the methodOfApplication property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMethodOfApplication().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PicklistFieldWithSmallTextRemarks }
             * 
             * 
             */
            public List<PicklistFieldWithSmallTextRemarks> getMethodOfApplication() {
                if (methodOfApplication == null) {
                    methodOfApplication = new ArrayList<PicklistFieldWithSmallTextRemarks>();
                }
                return this.methodOfApplication;
            }

            /**
             * Gets the value of the detailsOnApplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnApplication() {
                return detailsOnApplication;
            }

            /**
             * Sets the value of the detailsOnApplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnApplication(String value) {
                this.detailsOnApplication = value;
            }

        }


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
         *         &lt;element name="FunctionAddressed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ProductType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="FieldOfUseEnvisagedUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "functionAddressed",
            "productType",
            "fieldOfUseEnvisagedUser"
        })
        public static class InformationOnIntendedUseAndApplication {

            @XmlElement(name = "FunctionAddressed")
            protected List<PicklistFieldWithSmallTextRemarks> functionAddressed;
            @XmlElement(name = "ProductType", required = true)
            protected PicklistField productType;
            @XmlElement(name = "FieldOfUseEnvisagedUser", required = true)
            protected String fieldOfUseEnvisagedUser;

            /**
             * Gets the value of the functionAddressed property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the functionAddressed property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFunctionAddressed().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PicklistFieldWithSmallTextRemarks }
             * 
             * 
             */
            public List<PicklistFieldWithSmallTextRemarks> getFunctionAddressed() {
                if (functionAddressed == null) {
                    functionAddressed = new ArrayList<PicklistFieldWithSmallTextRemarks>();
                }
                return this.functionAddressed;
            }

            /**
             * Gets the value of the productType property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getProductType() {
                return productType;
            }

            /**
             * Sets the value of the productType property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setProductType(PicklistField value) {
                this.productType = value;
            }

            /**
             * Gets the value of the fieldOfUseEnvisagedUser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFieldOfUseEnvisagedUser() {
                return fieldOfUseEnvisagedUser;
            }

            /**
             * Sets the value of the fieldOfUseEnvisagedUser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFieldOfUseEnvisagedUser(String value) {
                this.fieldOfUseEnvisagedUser = value;
            }

        }


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
         *         &lt;element name="TargetOrganisms">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                             &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                             &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            "targetOrganisms"
        })
        public static class PestTargetOrganismsToBeControlled {

            @XmlElement(name = "TargetOrganisms", required = true)
            protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms targetOrganisms;

            /**
             * Gets the value of the targetOrganisms property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms }
             *     
             */
            public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms getTargetOrganisms() {
                return targetOrganisms;
            }

            /**
             * Sets the value of the targetOrganisms property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms }
             *     
             */
            public void setTargetOrganisms(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms value) {
                this.targetOrganisms = value;
            }


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
             *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *                 &lt;sequence>
             *                   &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *                   &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *                   &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
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
                "entry"
            })
            public static class TargetOrganisms {

                protected List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms.Entry> entry;

                /**
                 * Gets the value of the entry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the entry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.GeneralInformation.PestTargetOrganismsToBeControlled.TargetOrganisms.Entry>();
                    }
                    return this.entry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
                 *       &lt;sequence>
                 *         &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
                 *         &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
                 *         &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "scientificName",
                    "commonName",
                    "developmentalStage"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ScientificName", required = true)
                    protected PicklistFieldWithSmallTextRemarks scientificName;
                    @XmlElement(name = "CommonName", required = true)
                    protected PicklistFieldWithSmallTextRemarks commonName;
                    @XmlElement(name = "DevelopmentalStage", required = true)
                    protected PicklistFieldWithSmallTextRemarks developmentalStage;

                    /**
                     * Gets the value of the scientificName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getScientificName() {
                        return scientificName;
                    }

                    /**
                     * Sets the value of the scientificName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setScientificName(PicklistFieldWithSmallTextRemarks value) {
                        this.scientificName = value;
                    }

                    /**
                     * Gets the value of the commonName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getCommonName() {
                        return commonName;
                    }

                    /**
                     * Sets the value of the commonName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setCommonName(PicklistFieldWithSmallTextRemarks value) {
                        this.commonName = value;
                    }

                    /**
                     * Gets the value of the developmentalStage property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getDevelopmentalStage() {
                        return developmentalStage;
                    }

                    /**
                     * Sets the value of the developmentalStage property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setDevelopmentalStage(PicklistFieldWithSmallTextRemarks value) {
                        this.developmentalStage = value;
                    }

                }

            }

        }


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
         *         &lt;element name="OrganismsToBeProtectedOrTreatedMaterials" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
            "organismsToBeProtectedOrTreatedMaterials"
        })
        public static class ProductsOrganismsOrObjectsToBeProtectedUnderStudy {

            @XmlElement(name = "OrganismsToBeProtectedOrTreatedMaterials", required = true)
            protected String organismsToBeProtectedOrTreatedMaterials;

            /**
             * Gets the value of the organismsToBeProtectedOrTreatedMaterials property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrganismsToBeProtectedOrTreatedMaterials() {
                return organismsToBeProtectedOrTreatedMaterials;
            }

            /**
             * Sets the value of the organismsToBeProtectedOrTreatedMaterials property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrganismsToBeProtectedOrTreatedMaterials(String value) {
                this.organismsToBeProtectedOrTreatedMaterials = value;
            }

        }

    }


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
     *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
     *         &lt;element name="AttachedBackgroundMaterial">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
     *         &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField"/>
     *         &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
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
        "remarksOnResults",
        "attachedBackgroundMaterial",
        "attachedStudyReport",
        "illustrationPicGraph"
    })
    public static class OverallRemarksAttachments {

        @XmlElement(name = "RemarksOnResults", required = true)
        protected String remarksOnResults;
        @XmlElement(name = "AttachedBackgroundMaterial", required = true)
        protected ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
        @XmlElement(name = "AttachedStudyReport", required = true)
        protected AttachmentListField attachedStudyReport;
        @XmlElement(name = "IllustrationPicGraph", required = true)
        protected String illustrationPicGraph;

        /**
         * Gets the value of the remarksOnResults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarksOnResults() {
            return remarksOnResults;
        }

        /**
         * Sets the value of the remarksOnResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarksOnResults(String value) {
            this.remarksOnResults = value;
        }

        /**
         * Gets the value of the attachedBackgroundMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
            this.attachedBackgroundMaterial = value;
        }

        /**
         * Gets the value of the attachedStudyReport property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListField }
         *     
         */
        public AttachmentListField getAttachedStudyReport() {
            return attachedStudyReport;
        }

        /**
         * Sets the value of the attachedStudyReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListField }
         *     
         */
        public void setAttachedStudyReport(AttachmentListField value) {
            this.attachedStudyReport = value;
        }

        /**
         * Gets the value of the illustrationPicGraph property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIllustrationPicGraph() {
            return illustrationPicGraph;
        }

        /**
         * Sets the value of the illustrationPicGraph property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIllustrationPicGraph(String value) {
            this.illustrationPicGraph = value;
        }


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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "entry"
        })
        public static class AttachedBackgroundMaterial {

            protected List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEffectivenessAgainstTargetOrganisms.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "attachedDocument",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "AttachedDocument", required = true)
                protected String attachedDocument;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

                /**
                 * Gets the value of the attachedDocument property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttachedDocument() {
                    return attachedDocument;
                }

                /**
                 * Sets the value of the attachedDocument property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttachedDocument(String value) {
                    this.attachedDocument = value;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemarks() {
                    return remarks;
                }

                /**
                 * Sets the value of the remarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemarks(String value) {
                    this.remarks = value;
                }

            }

        }

    }

}
