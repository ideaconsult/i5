
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_basictoxicokinetics._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.AttachmentListField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityField;
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
 *         &lt;element name="DataSource">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField"/>
 *                   &lt;element name="DataAccess" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DataProtectionClaimed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaterialsAndMethods">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ObjectiveOfStudyPick" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Guideline">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                                       &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                   &lt;element name="MethodNoGuideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="GLPComplianceStatement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="TestMaterials">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                             &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="Radiolabelling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TestAnimals">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Strain" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="DetailsOnSpeciesStrainSelection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdministrationExposure">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RouteOfAdministration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="DetailsOnExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="DurationAndFrequencyOfTreatmentExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="DosesConcentrations">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DoseConc" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value=""/>
 *                                                                 &lt;enumeration value="2087"/>
 *                                                                 &lt;enumeration value="2086"/>
 *                                                                 &lt;enumeration value="2085"/>
 *                                                                 &lt;enumeration value="2090"/>
 *                                                                 &lt;enumeration value="2102"/>
 *                                                                 &lt;enumeration value="2082"/>
 *                                                                 &lt;enumeration value="2099"/>
 *                                                                 &lt;enumeration value="2101"/>
 *                                                                 &lt;enumeration value="2100"/>
 *                                                                 &lt;enumeration value="2104"/>
 *                                                                 &lt;enumeration value="2106"/>
 *                                                                 &lt;enumeration value="2105"/>
 *                                                                 &lt;enumeration value="2283"/>
 *                                                                 &lt;enumeration value="2285"/>
 *                                                                 &lt;enumeration value="2284"/>
 *                                                                 &lt;enumeration value="1342"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="unitOther" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="255"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="value" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
 *                             &lt;element name="NoOfAnimalsPerSexPerDose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="ControlAnimals" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="PositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="DetailsOnDosingAndSampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnyOtherInformationOnMaterialsAndMethodsInclTables">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
 *         &lt;element name="ResultsAndDiscussion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreliminaryStudies" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="MainAdmeResults">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                   &lt;element name="PharmacokineticStudies">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailsOnAbsorption" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="DetailsOnDistribution" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="TransferIntoOrgans">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                                 &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="TransferType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                                 &lt;element name="Observation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                             &lt;element name="DetailsOnExcretion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="ToxicokineticParameters">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                                 &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="ToxicokineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                   &lt;element name="MetaboliteCharacterisationStudies">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="MetabolitesIdentified" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="DetailsOnMetabolites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Bioaccessibility">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BioaccessibilityTestingResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnyOtherInformationOnResultsInclTables">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
    "dataSource",
    "materialsAndMethods",
    "resultsAndDiscussion",
    "overallRemarksAttachments",
    "applicantSummaryAndConclusion"
})
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.BasicToxicokinetics")
public class ENDPOINTSTUDYRECORDBasicToxicokinetics {

    @XmlElement(name = "AdministrativeData", required = true)
    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource", required = true)
    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods", required = true)
    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "ResultsAndDiscussion", required = true)
    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion resultsAndDiscussion;
    @XmlElement(name = "OverallRemarksAttachments", required = true)
    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion", required = true)
    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDBasicToxicokinetics.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDBasicToxicokinetics.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the resultsAndDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion }
     *     
     */
    public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion getResultsAndDiscussion() {
        return resultsAndDiscussion;
    }

    /**
     * Sets the value of the resultsAndDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion }
     *     
     */
    public void setResultsAndDiscussion(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion value) {
        this.resultsAndDiscussion = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDBasicToxicokinetics.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDBasicToxicokinetics.ApplicantSummaryAndConclusion value) {
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
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference crossReference;

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
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference value) {
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

            protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.AttachedJustification.Entry>();
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

            protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.AdministrativeData.CrossReference.Entry>();
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
     *         &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField"/>
     *         &lt;element name="DataAccess" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="DataProtectionClaimed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
        "reference",
        "dataAccess",
        "dataProtectionClaimed"
    })
    public static class DataSource {

        @XmlElement(name = "Reference", required = true)
        protected DocumentReferenceMultipleField reference;
        @XmlElement(name = "DataAccess", required = true)
        protected PicklistFieldWithSmallTextRemarks dataAccess;
        @XmlElement(name = "DataProtectionClaimed", required = true)
        protected PicklistFieldWithSmallTextRemarks dataProtectionClaimed;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentReferenceMultipleField }
         *     
         */
        public DocumentReferenceMultipleField getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentReferenceMultipleField }
         *     
         */
        public void setReference(DocumentReferenceMultipleField value) {
            this.reference = value;
        }

        /**
         * Gets the value of the dataAccess property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setDataAccess(PicklistFieldWithSmallTextRemarks value) {
            this.dataAccess = value;
        }

        /**
         * Gets the value of the dataProtectionClaimed property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getDataProtectionClaimed() {
            return dataProtectionClaimed;
        }

        /**
         * Sets the value of the dataProtectionClaimed property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setDataProtectionClaimed(PicklistFieldWithSmallTextRemarks value) {
            this.dataProtectionClaimed = value;
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
     *         &lt;element name="ObjectiveOfStudyPick" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="Radiolabelling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *                   &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                   &lt;element name="DetailsOnExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="DurationAndFrequencyOfTreatmentExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
     *                   &lt;element name="PositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *                   &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="DetailsOnDosingAndSampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
        "objectiveOfStudyPick",
        "guideline",
        "methodNoGuideline",
        "glpComplianceStatement",
        "testMaterials",
        "testAnimals",
        "administrationExposure",
        "anyOtherInformationOnMaterialsAndMethodsInclTables"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "ObjectiveOfStudyPick")
        protected List<PicklistField> objectiveOfStudyPick;
        @XmlElement(name = "Guideline", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline guideline;
        @XmlElement(name = "MethodNoGuideline", required = true)
        protected String methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement", required = true)
        protected PicklistFieldWithSmallTextRemarks glpComplianceStatement;
        @XmlElement(name = "TestMaterials", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestMaterials testMaterials;
        @XmlElement(name = "TestAnimals", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestAnimals testAnimals;
        @XmlElement(name = "AdministrationExposure", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure administrationExposure;
        @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

        /**
         * Gets the value of the objectiveOfStudyPick property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectiveOfStudyPick property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObjectiveOfStudyPick().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PicklistField }
         * 
         * 
         */
        public List<PicklistField> getObjectiveOfStudyPick() {
            if (objectiveOfStudyPick == null) {
                objectiveOfStudyPick = new ArrayList<PicklistField>();
            }
            return this.objectiveOfStudyPick;
        }

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline value) {
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
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestMaterials }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestMaterials getTestMaterials() {
            return testMaterials;
        }

        /**
         * Sets the value of the testMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestMaterials }
         *     
         */
        public void setTestMaterials(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestMaterials value) {
            this.testMaterials = value;
        }

        /**
         * Gets the value of the testAnimals property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestAnimals }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestAnimals getTestAnimals() {
            return testAnimals;
        }

        /**
         * Sets the value of the testAnimals property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestAnimals }
         *     
         */
        public void setTestAnimals(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.TestAnimals value) {
            this.testAnimals = value;
        }

        /**
         * Gets the value of the administrationExposure property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure getAdministrationExposure() {
            return administrationExposure;
        }

        /**
         * Sets the value of the administrationExposure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure }
         *     
         */
        public void setAdministrationExposure(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure value) {
            this.administrationExposure = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
            return anyOtherInformationOnMaterialsAndMethodsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
            this.anyOtherInformationOnMaterialsAndMethodsInclTables = value;
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
         *         &lt;element name="RouteOfAdministration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *         &lt;element name="DetailsOnExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="DurationAndFrequencyOfTreatmentExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
         *         &lt;element name="PositiveControl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
         *         &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="DetailsOnDosingAndSampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
            "vehicle",
            "detailsOnExposure",
            "durationAndFrequencyOfTreatmentExposure",
            "dosesConcentrations",
            "noOfAnimalsPerSexPerDose",
            "controlAnimals",
            "positiveControl",
            "detailsOnStudyDesign",
            "detailsOnDosingAndSampling",
            "statistics"
        })
        public static class AdministrationExposure {

            @XmlElement(name = "RouteOfAdministration", required = true)
            protected PicklistField routeOfAdministration;
            @XmlElement(name = "Vehicle", required = true)
            protected PicklistFieldWithSmallTextRemarks vehicle;
            @XmlElement(name = "DetailsOnExposure", required = true)
            protected String detailsOnExposure;
            @XmlElement(name = "DurationAndFrequencyOfTreatmentExposure", required = true)
            protected String durationAndFrequencyOfTreatmentExposure;
            @XmlElement(name = "DosesConcentrations", required = true)
            protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations dosesConcentrations;
            @XmlElement(name = "NoOfAnimalsPerSexPerDose", required = true)
            protected String noOfAnimalsPerSexPerDose;
            @XmlElement(name = "ControlAnimals")
            protected List<PicklistFieldWithSmallTextRemarks> controlAnimals;
            @XmlElement(name = "PositiveControl", required = true)
            protected String positiveControl;
            @XmlElement(name = "DetailsOnStudyDesign", required = true)
            protected String detailsOnStudyDesign;
            @XmlElement(name = "DetailsOnDosingAndSampling", required = true)
            protected String detailsOnDosingAndSampling;
            @XmlElement(name = "Statistics", required = true)
            protected String statistics;

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
             * Gets the value of the durationAndFrequencyOfTreatmentExposure property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDurationAndFrequencyOfTreatmentExposure() {
                return durationAndFrequencyOfTreatmentExposure;
            }

            /**
             * Sets the value of the durationAndFrequencyOfTreatmentExposure property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDurationAndFrequencyOfTreatmentExposure(String value) {
                this.durationAndFrequencyOfTreatmentExposure = value;
            }

            /**
             * Gets the value of the dosesConcentrations property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations }
             *     
             */
            public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations getDosesConcentrations() {
                return dosesConcentrations;
            }

            /**
             * Sets the value of the dosesConcentrations property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations }
             *     
             */
            public void setDosesConcentrations(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations value) {
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
             * Gets the value of the detailsOnDosingAndSampling property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnDosingAndSampling() {
                return detailsOnDosingAndSampling;
            }

            /**
             * Sets the value of the detailsOnDosingAndSampling property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnDosingAndSampling(String value) {
                this.detailsOnDosingAndSampling = value;
            }

            /**
             * Gets the value of the statistics property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatistics() {
                return statistics;
            }

            /**
             * Sets the value of the statistics property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatistics(String value) {
                this.statistics = value;
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
             *                   &lt;element name="DoseConc" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
             *                           &lt;sequence>
             *                             &lt;element name="unitCode" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;enumeration value=""/>
             *                                   &lt;enumeration value="2087"/>
             *                                   &lt;enumeration value="2086"/>
             *                                   &lt;enumeration value="2085"/>
             *                                   &lt;enumeration value="2090"/>
             *                                   &lt;enumeration value="2102"/>
             *                                   &lt;enumeration value="2082"/>
             *                                   &lt;enumeration value="2099"/>
             *                                   &lt;enumeration value="2101"/>
             *                                   &lt;enumeration value="2100"/>
             *                                   &lt;enumeration value="2104"/>
             *                                   &lt;enumeration value="2106"/>
             *                                   &lt;enumeration value="2105"/>
             *                                   &lt;enumeration value="2283"/>
             *                                   &lt;enumeration value="2285"/>
             *                                   &lt;enumeration value="2284"/>
             *                                   &lt;enumeration value="1342"/>
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
             *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
            public static class DosesConcentrations {

                protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry>();
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
                 *         &lt;element name="DoseConc" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value=""/>
                 *                         &lt;enumeration value="2087"/>
                 *                         &lt;enumeration value="2086"/>
                 *                         &lt;enumeration value="2085"/>
                 *                         &lt;enumeration value="2090"/>
                 *                         &lt;enumeration value="2102"/>
                 *                         &lt;enumeration value="2082"/>
                 *                         &lt;enumeration value="2099"/>
                 *                         &lt;enumeration value="2101"/>
                 *                         &lt;enumeration value="2100"/>
                 *                         &lt;enumeration value="2104"/>
                 *                         &lt;enumeration value="2106"/>
                 *                         &lt;enumeration value="2105"/>
                 *                         &lt;enumeration value="2283"/>
                 *                         &lt;enumeration value="2285"/>
                 *                         &lt;enumeration value="2284"/>
                 *                         &lt;enumeration value="1342"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="unitOther" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="255"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="value" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
                    "doseConc",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "DoseConc")
                    protected ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry.DoseConc doseConc;
                    @XmlElement(name = "Remarks", required = true)
                    protected String remarks;

                    /**
                     * Gets the value of the doseConc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry.DoseConc }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry.DoseConc getDoseConc() {
                        return doseConc;
                    }

                    /**
                     * Sets the value of the doseConc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry.DoseConc }
                     *     
                     */
                    public void setDoseConc(ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.AdministrationExposure.DosesConcentrations.Entry.DoseConc value) {
                        this.doseConc = value;
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


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                     *       &lt;sequence>
                     *         &lt;element name="unitCode" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;enumeration value=""/>
                     *               &lt;enumeration value="2087"/>
                     *               &lt;enumeration value="2086"/>
                     *               &lt;enumeration value="2085"/>
                     *               &lt;enumeration value="2090"/>
                     *               &lt;enumeration value="2102"/>
                     *               &lt;enumeration value="2082"/>
                     *               &lt;enumeration value="2099"/>
                     *               &lt;enumeration value="2101"/>
                     *               &lt;enumeration value="2100"/>
                     *               &lt;enumeration value="2104"/>
                     *               &lt;enumeration value="2106"/>
                     *               &lt;enumeration value="2105"/>
                     *               &lt;enumeration value="2283"/>
                     *               &lt;enumeration value="2285"/>
                     *               &lt;enumeration value="2284"/>
                     *               &lt;enumeration value="1342"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="unitOther" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="255"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="value" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
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
                        "unitCode",
                        "unitOther",
                        "value"
                    })
                    public static class DoseConc
                        extends PhysicalQuantityField
                    {

                        protected String unitCode;
                        protected String unitOther;
                        protected String value;

                        /**
                         * Gets the value of the unitCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnitCode() {
                            return unitCode;
                        }

                        /**
                         * Sets the value of the unitCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnitCode(String value) {
                            this.unitCode = value;
                        }

                        /**
                         * Gets the value of the unitOther property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnitOther() {
                            return unitOther;
                        }

                        /**
                         * Sets the value of the unitOther property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnitOther(String value) {
                            this.unitOther = value;
                        }

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

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
         *         &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
            "otherInformation"
        })
        public static class AnyOtherInformationOnMaterialsAndMethodsInclTables {

            @XmlElement(name = "OtherInformation", required = true)
            protected String otherInformation;

            /**
             * Gets the value of the otherInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherInformation() {
                return otherInformation;
            }

            /**
             * Sets the value of the otherInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherInformation(String value) {
                this.otherInformation = value;
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
         *                   &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
         *                   &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
        public static class Guideline {

            protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.MaterialsAndMethods.Guideline.Entry>();
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
             *         &lt;element name="Qualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
             *         &lt;element name="Deviation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                "qualifier",
                "guideline",
                "versionRemarks",
                "deviation"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Qualifier", required = true)
                protected PicklistField qualifier;
                @XmlElement(name = "Guideline", required = true)
                protected PicklistField guideline;
                @XmlElement(name = "VersionRemarks", required = true)
                protected String versionRemarks;
                @XmlElement(name = "Deviation", required = true)
                protected PicklistFieldWithSmallTextRemarks deviation;

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setQualifier(PicklistField value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the guideline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setGuideline(PicklistField value) {
                    this.guideline = value;
                }

                /**
                 * Gets the value of the versionRemarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersionRemarks() {
                    return versionRemarks;
                }

                /**
                 * Sets the value of the versionRemarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersionRemarks(String value) {
                    this.versionRemarks = value;
                }

                /**
                 * Gets the value of the deviation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getDeviation() {
                    return deviation;
                }

                /**
                 * Sets the value of the deviation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setDeviation(PicklistFieldWithSmallTextRemarks value) {
                    this.deviation = value;
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
         *         &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Strain" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *         &lt;element name="DetailsOnSpeciesStrainSelection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
         *         &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "species",
            "strain",
            "detailsOnSpeciesStrainSelection",
            "sex",
            "organismDetails"
        })
        public static class TestAnimals {

            @XmlElement(name = "Species", required = true)
            protected PicklistField species;
            @XmlElement(name = "Strain", required = true)
            protected PicklistFieldWithSmallTextRemarks strain;
            @XmlElement(name = "DetailsOnSpeciesStrainSelection", required = true)
            protected String detailsOnSpeciesStrainSelection;
            @XmlElement(name = "Sex", required = true)
            protected PicklistField sex;
            @XmlElement(name = "OrganismDetails", required = true)
            protected String organismDetails;

            /**
             * Gets the value of the species property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getSpecies() {
                return species;
            }

            /**
             * Sets the value of the species property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setSpecies(PicklistField value) {
                this.species = value;
            }

            /**
             * Gets the value of the strain property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public PicklistFieldWithSmallTextRemarks getStrain() {
                return strain;
            }

            /**
             * Sets the value of the strain property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public void setStrain(PicklistFieldWithSmallTextRemarks value) {
                this.strain = value;
            }

            /**
             * Gets the value of the detailsOnSpeciesStrainSelection property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnSpeciesStrainSelection() {
                return detailsOnSpeciesStrainSelection;
            }

            /**
             * Sets the value of the detailsOnSpeciesStrainSelection property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnSpeciesStrainSelection(String value) {
                this.detailsOnSpeciesStrainSelection = value;
            }

            /**
             * Gets the value of the sex property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getSex() {
                return sex;
            }

            /**
             * Sets the value of the sex property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setSex(PicklistField value) {
                this.sex = value;
            }

            /**
             * Gets the value of the organismDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrganismDetails() {
                return organismDetails;
            }

            /**
             * Sets the value of the organismDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrganismDetails(String value) {
                this.organismDetails = value;
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
         *         &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
         *         &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="Radiolabelling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            "testMaterialInformation",
            "specificDetailsOnTestMaterialUsedForTheStudy",
            "radiolabelling"
        })
        public static class TestMaterials {

            @XmlElement(name = "TestMaterialInformation", required = true)
            protected String testMaterialInformation;
            @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudy", required = true)
            protected String specificDetailsOnTestMaterialUsedForTheStudy;
            @XmlElement(name = "Radiolabelling", required = true)
            protected PicklistFieldWithSmallTextRemarks radiolabelling;

            /**
             * Gets the value of the testMaterialInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTestMaterialInformation() {
                return testMaterialInformation;
            }

            /**
             * Sets the value of the testMaterialInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTestMaterialInformation(String value) {
                this.testMaterialInformation = value;
            }

            /**
             * Gets the value of the specificDetailsOnTestMaterialUsedForTheStudy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecificDetailsOnTestMaterialUsedForTheStudy() {
                return specificDetailsOnTestMaterialUsedForTheStudy;
            }

            /**
             * Sets the value of the specificDetailsOnTestMaterialUsedForTheStudy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecificDetailsOnTestMaterialUsedForTheStudy(String value) {
                this.specificDetailsOnTestMaterialUsedForTheStudy = value;
            }

            /**
             * Gets the value of the radiolabelling property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public PicklistFieldWithSmallTextRemarks getRadiolabelling() {
                return radiolabelling;
            }

            /**
             * Sets the value of the radiolabelling property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public void setRadiolabelling(PicklistFieldWithSmallTextRemarks value) {
                this.radiolabelling = value;
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
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
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
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
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

            protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
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
     *         &lt;element name="PreliminaryStudies" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="MainAdmeResults">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
     *         &lt;element name="PharmacokineticStudies">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailsOnAbsorption" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="DetailsOnDistribution" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="TransferIntoOrgans">
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
     *                                       &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                                       &lt;element name="TransferType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                                       &lt;element name="Observation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *                   &lt;element name="DetailsOnExcretion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="ToxicokineticParameters">
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
     *                                       &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                                       &lt;element name="ToxicokineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *         &lt;element name="MetaboliteCharacterisationStudies">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="MetabolitesIdentified" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                   &lt;element name="DetailsOnMetabolites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Bioaccessibility">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BioaccessibilityTestingResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AnyOtherInformationOnResultsInclTables">
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
        "preliminaryStudies",
        "mainAdmeResults",
        "pharmacokineticStudies",
        "metaboliteCharacterisationStudies",
        "bioaccessibility",
        "anyOtherInformationOnResultsInclTables"
    })
    public static class ResultsAndDiscussion {

        @XmlElement(name = "PreliminaryStudies", required = true)
        protected String preliminaryStudies;
        @XmlElement(name = "MainAdmeResults", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults mainAdmeResults;
        @XmlElement(name = "PharmacokineticStudies", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies pharmacokineticStudies;
        @XmlElement(name = "MetaboliteCharacterisationStudies", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MetaboliteCharacterisationStudies metaboliteCharacterisationStudies;
        @XmlElement(name = "Bioaccessibility", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.Bioaccessibility bioaccessibility;
        @XmlElement(name = "AnyOtherInformationOnResultsInclTables", required = true)
        protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

        /**
         * Gets the value of the preliminaryStudies property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreliminaryStudies() {
            return preliminaryStudies;
        }

        /**
         * Sets the value of the preliminaryStudies property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreliminaryStudies(String value) {
            this.preliminaryStudies = value;
        }

        /**
         * Gets the value of the mainAdmeResults property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults getMainAdmeResults() {
            return mainAdmeResults;
        }

        /**
         * Sets the value of the mainAdmeResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults }
         *     
         */
        public void setMainAdmeResults(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults value) {
            this.mainAdmeResults = value;
        }

        /**
         * Gets the value of the pharmacokineticStudies property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies getPharmacokineticStudies() {
            return pharmacokineticStudies;
        }

        /**
         * Sets the value of the pharmacokineticStudies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies }
         *     
         */
        public void setPharmacokineticStudies(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies value) {
            this.pharmacokineticStudies = value;
        }

        /**
         * Gets the value of the metaboliteCharacterisationStudies property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MetaboliteCharacterisationStudies }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MetaboliteCharacterisationStudies getMetaboliteCharacterisationStudies() {
            return metaboliteCharacterisationStudies;
        }

        /**
         * Sets the value of the metaboliteCharacterisationStudies property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MetaboliteCharacterisationStudies }
         *     
         */
        public void setMetaboliteCharacterisationStudies(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MetaboliteCharacterisationStudies value) {
            this.metaboliteCharacterisationStudies = value;
        }

        /**
         * Gets the value of the bioaccessibility property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.Bioaccessibility }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.Bioaccessibility getBioaccessibility() {
            return bioaccessibility;
        }

        /**
         * Sets the value of the bioaccessibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.Bioaccessibility }
         *     
         */
        public void setBioaccessibility(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.Bioaccessibility value) {
            this.bioaccessibility = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
            return anyOtherInformationOnResultsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public void setAnyOtherInformationOnResultsInclTables(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables value) {
            this.anyOtherInformationOnResultsInclTables = value;
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
         *         &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
            "otherInformation"
        })
        public static class AnyOtherInformationOnResultsInclTables {

            @XmlElement(name = "OtherInformation", required = true)
            protected String otherInformation;

            /**
             * Gets the value of the otherInformation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherInformation() {
                return otherInformation;
            }

            /**
             * Sets the value of the otherInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherInformation(String value) {
                this.otherInformation = value;
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
         *         &lt;element name="BioaccessibilityTestingResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "bioaccessibilityTestingResults"
        })
        public static class Bioaccessibility {

            @XmlElement(name = "BioaccessibilityTestingResults", required = true)
            protected String bioaccessibilityTestingResults;

            /**
             * Gets the value of the bioaccessibilityTestingResults property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBioaccessibilityTestingResults() {
                return bioaccessibilityTestingResults;
            }

            /**
             * Sets the value of the bioaccessibilityTestingResults property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBioaccessibilityTestingResults(String value) {
                this.bioaccessibilityTestingResults = value;
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
         *                   &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
        public static class MainAdmeResults {

            protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.MainAdmeResults.Entry>();
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
             *         &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="Results" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
                "type",
                "results"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Type", required = true)
                protected PicklistField type;
                @XmlElement(name = "Results", required = true)
                protected String results;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setType(PicklistField value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the results property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResults() {
                    return results;
                }

                /**
                 * Sets the value of the results property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResults(String value) {
                    this.results = value;
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
         *         &lt;element name="MetabolitesIdentified" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *         &lt;element name="DetailsOnMetabolites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "metabolitesIdentified",
            "detailsOnMetabolites"
        })
        public static class MetaboliteCharacterisationStudies {

            @XmlElement(name = "MetabolitesIdentified", required = true)
            protected PicklistFieldWithSmallTextRemarks metabolitesIdentified;
            @XmlElement(name = "DetailsOnMetabolites", required = true)
            protected String detailsOnMetabolites;

            /**
             * Gets the value of the metabolitesIdentified property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public PicklistFieldWithSmallTextRemarks getMetabolitesIdentified() {
                return metabolitesIdentified;
            }

            /**
             * Sets the value of the metabolitesIdentified property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public void setMetabolitesIdentified(PicklistFieldWithSmallTextRemarks value) {
                this.metabolitesIdentified = value;
            }

            /**
             * Gets the value of the detailsOnMetabolites property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnMetabolites() {
                return detailsOnMetabolites;
            }

            /**
             * Sets the value of the detailsOnMetabolites property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnMetabolites(String value) {
                this.detailsOnMetabolites = value;
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
         *         &lt;element name="DetailsOnAbsorption" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="DetailsOnDistribution" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="TransferIntoOrgans">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                             &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                             &lt;element name="TransferType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                             &lt;element name="Observation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
         *         &lt;element name="DetailsOnExcretion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="ToxicokineticParameters">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
         *                             &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                             &lt;element name="ToxicokineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            "detailsOnAbsorption",
            "detailsOnDistribution",
            "transferIntoOrgans",
            "detailsOnExcretion",
            "toxicokineticParameters"
        })
        public static class PharmacokineticStudies {

            @XmlElement(name = "DetailsOnAbsorption", required = true)
            protected String detailsOnAbsorption;
            @XmlElement(name = "DetailsOnDistribution", required = true)
            protected String detailsOnDistribution;
            @XmlElement(name = "TransferIntoOrgans", required = true)
            protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans transferIntoOrgans;
            @XmlElement(name = "DetailsOnExcretion", required = true)
            protected String detailsOnExcretion;
            @XmlElement(name = "ToxicokineticParameters", required = true)
            protected ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters toxicokineticParameters;

            /**
             * Gets the value of the detailsOnAbsorption property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnAbsorption() {
                return detailsOnAbsorption;
            }

            /**
             * Sets the value of the detailsOnAbsorption property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnAbsorption(String value) {
                this.detailsOnAbsorption = value;
            }

            /**
             * Gets the value of the detailsOnDistribution property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnDistribution() {
                return detailsOnDistribution;
            }

            /**
             * Sets the value of the detailsOnDistribution property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnDistribution(String value) {
                this.detailsOnDistribution = value;
            }

            /**
             * Gets the value of the transferIntoOrgans property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans }
             *     
             */
            public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans getTransferIntoOrgans() {
                return transferIntoOrgans;
            }

            /**
             * Sets the value of the transferIntoOrgans property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans }
             *     
             */
            public void setTransferIntoOrgans(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans value) {
                this.transferIntoOrgans = value;
            }

            /**
             * Gets the value of the detailsOnExcretion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnExcretion() {
                return detailsOnExcretion;
            }

            /**
             * Sets the value of the detailsOnExcretion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnExcretion(String value) {
                this.detailsOnExcretion = value;
            }

            /**
             * Gets the value of the toxicokineticParameters property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters }
             *     
             */
            public ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters getToxicokineticParameters() {
                return toxicokineticParameters;
            }

            /**
             * Sets the value of the toxicokineticParameters property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters }
             *     
             */
            public void setToxicokineticParameters(ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters value) {
                this.toxicokineticParameters = value;
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
             *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *                   &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *                   &lt;element name="ToxicokineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            public static class ToxicokineticParameters {

                protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.ToxicokineticParameters.Entry>();
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
                 *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
                 *         &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
                 *         &lt;element name="ToxicokineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                    "keyResult",
                    "testNo",
                    "toxicokineticParameters"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                    protected Boolean keyResult;
                    @XmlElement(name = "TestNo", required = true)
                    protected PicklistField testNo;
                    @XmlElement(name = "ToxicokineticParameters", required = true)
                    protected PicklistFieldWithSmallTextRemarks toxicokineticParameters;

                    /**
                     * Gets the value of the keyResult property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean getKeyResult() {
                        return keyResult;
                    }

                    /**
                     * Sets the value of the keyResult property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setKeyResult(Boolean value) {
                        this.keyResult = value;
                    }

                    /**
                     * Gets the value of the testNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistField }
                     *     
                     */
                    public PicklistField getTestNo() {
                        return testNo;
                    }

                    /**
                     * Sets the value of the testNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistField }
                     *     
                     */
                    public void setTestNo(PicklistField value) {
                        this.testNo = value;
                    }

                    /**
                     * Gets the value of the toxicokineticParameters property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getToxicokineticParameters() {
                        return toxicokineticParameters;
                    }

                    /**
                     * Sets the value of the toxicokineticParameters property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setToxicokineticParameters(PicklistFieldWithSmallTextRemarks value) {
                        this.toxicokineticParameters = value;
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
             *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
             *                   &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *                   &lt;element name="TransferType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *                   &lt;element name="Observation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            public static class TransferIntoOrgans {

                protected List<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBasicToxicokinetics.ResultsAndDiscussion.PharmacokineticStudies.TransferIntoOrgans.Entry>();
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
                 *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
                 *         &lt;element name="TestNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
                 *         &lt;element name="TransferType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
                 *         &lt;element name="Observation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                    "keyResult",
                    "testNo",
                    "transferType",
                    "observation"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
                    protected Boolean keyResult;
                    @XmlElement(name = "TestNo", required = true)
                    protected PicklistField testNo;
                    @XmlElement(name = "TransferType", required = true)
                    protected PicklistFieldWithSmallTextRemarks transferType;
                    @XmlElement(name = "Observation", required = true)
                    protected PicklistFieldWithSmallTextRemarks observation;

                    /**
                     * Gets the value of the keyResult property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean getKeyResult() {
                        return keyResult;
                    }

                    /**
                     * Sets the value of the keyResult property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setKeyResult(Boolean value) {
                        this.keyResult = value;
                    }

                    /**
                     * Gets the value of the testNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistField }
                     *     
                     */
                    public PicklistField getTestNo() {
                        return testNo;
                    }

                    /**
                     * Sets the value of the testNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistField }
                     *     
                     */
                    public void setTestNo(PicklistField value) {
                        this.testNo = value;
                    }

                    /**
                     * Gets the value of the transferType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getTransferType() {
                        return transferType;
                    }

                    /**
                     * Sets the value of the transferType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setTransferType(PicklistFieldWithSmallTextRemarks value) {
                        this.transferType = value;
                    }

                    /**
                     * Gets the value of the observation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getObservation() {
                        return observation;
                    }

                    /**
                     * Sets the value of the observation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setObservation(PicklistFieldWithSmallTextRemarks value) {
                        this.observation = value;
                    }

                }

            }

        }

    }

}
