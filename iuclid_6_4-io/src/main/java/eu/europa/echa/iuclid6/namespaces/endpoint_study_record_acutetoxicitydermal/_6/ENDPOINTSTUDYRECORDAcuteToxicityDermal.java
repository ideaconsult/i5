
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_acutetoxicitydermal._6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.AttachmentListField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldMultiLine;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldSmall;
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
 *         &lt;element name="AdministrativeData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProtection" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
 *                           &lt;sequence>
 *                             &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N64" minOccurs="0"/>
 *                             &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N78" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Endpoint" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60296" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="StudyResultType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z05" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PurposeFlag" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Y14_3" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Reliability" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A36" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RationalReliability" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60013" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataWaiving" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z02" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataWaivingJustification" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60297" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AttachedJustification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *                                       &lt;element name="ReasonPurpose" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60009" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="CrossReference" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ReasonPurpose" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60010" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="DataSource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *                   &lt;element name="DataAccess" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z03" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataProtectionClaimed" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z30" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="MaterialsAndMethods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Guideline" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Qualifier" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z06" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Guideline" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T09" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Deviation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z08" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="MethodNoGuideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GLPComplianceStatement" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z40" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TestType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T171" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LimitTest" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z38" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TestMaterials" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                             &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudyConfidential" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TestAnimals" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Species" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T02_2" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Strain" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T23_123456" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Sex" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdministrationExposure" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TypeOfCoverage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T50" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Vehicle" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T48" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DetailsOnDermalExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DurationOfExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Doses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="NoOfAnimalsPerSexPerDose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                             &lt;element name="ControlAnimals" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T27_2" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AnyOtherInformationOnMaterialsAndMethodsInclTables" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="ResultsAndDiscussion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Preliminary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EffectLevels" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                                       &lt;element name="Sex" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Endpoint" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T01" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="EffectLevel" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T04" minOccurs="0"/>
 *                                                 &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BasedOn" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}E105" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="cl" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RemarksOnResults" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60298" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="Mortality" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ClinicalSigns" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="BodyWeight" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="GrossPathology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OtherFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AnyOtherInformationOnResultsInclTables" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="OverallRemarksAttachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AttachedBackgroundMaterial" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField" minOccurs="0"/>
 *                   &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *                   &lt;element name="AttachedSanitisedDocsForPublication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicantSummaryAndConclusion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InterpretationOfResults" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T124" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.AcuteToxicityDermal")
public class ENDPOINTSTUDYRECORDAcuteToxicityDermal {

    @XmlElement(name = "AdministrativeData")
    protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource")
    protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods")
    protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "ResultsAndDiscussion")
    protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion resultsAndDiscussion;
    @XmlElement(name = "OverallRemarksAttachments")
    protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion")
    protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the resultsAndDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion }
     *     
     */
    public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion getResultsAndDiscussion() {
        return resultsAndDiscussion;
    }

    /**
     * Sets the value of the resultsAndDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion }
     *     
     */
    public void setResultsAndDiscussion(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion value) {
        this.resultsAndDiscussion = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion value) {
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
     *         &lt;element name="DataProtection" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
     *                 &lt;sequence>
     *                   &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N64" minOccurs="0"/>
     *                   &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N78" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Endpoint" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60296" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="StudyResultType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z05" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PurposeFlag" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Y14_3" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Reliability" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A36" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RationalReliability" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60013" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataWaiving" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z02" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataWaivingJustification" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60297" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AttachedJustification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
     *                             &lt;element name="ReasonPurpose" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60009" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="CrossReference" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="ReasonPurpose" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60010" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(name = "DataProtection")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection dataProtection;
        @XmlElement(name = "Endpoint")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Endpoint endpoint;
        @XmlElement(name = "StudyResultType")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.StudyResultType studyResultType;
        @XmlElement(name = "PurposeFlag")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.PurposeFlag purposeFlag;
        @XmlElementRef(name = "RobustStudy", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AcuteToxicityDermal/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> robustStudy;
        @XmlElementRef(name = "UsedForClassification", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AcuteToxicityDermal/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForClassification;
        @XmlElementRef(name = "UsedForMSDS", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AcuteToxicityDermal/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForMSDS;
        @XmlElement(name = "StudyPeriod")
        protected List<MultilingualTextFieldSmall> studyPeriod;
        @XmlElement(name = "Reliability")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Reliability reliability;
        @XmlElement(name = "RationalReliability")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.RationalReliability rationalReliability;
        @XmlElement(name = "DataWaiving")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaiving dataWaiving;
        @XmlElement(name = "DataWaivingJustification")
        protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaivingJustification> dataWaivingJustification;
        @XmlElement(name = "JustificationForTypeOfInformation")
        protected List<MultilingualTextFieldLarge> justificationForTypeOfInformation;
        @XmlElement(name = "AttachedJustification")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference crossReference;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection }
         *     
         */
        public void setDataProtection(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Endpoint }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Endpoint getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Endpoint }
         *     
         */
        public void setEndpoint(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Endpoint value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.StudyResultType }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.StudyResultType getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.StudyResultType }
         *     
         */
        public void setStudyResultType(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.StudyResultType value) {
            this.studyResultType = value;
        }

        /**
         * Gets the value of the purposeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.PurposeFlag }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.PurposeFlag getPurposeFlag() {
            return purposeFlag;
        }

        /**
         * Sets the value of the purposeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.PurposeFlag }
         *     
         */
        public void setPurposeFlag(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.PurposeFlag value) {
            this.purposeFlag = value;
        }

        /**
         * Gets the value of the robustStudy property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getRobustStudy() {
            return robustStudy;
        }

        /**
         * Sets the value of the robustStudy property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setRobustStudy(JAXBElement<Boolean> value) {
            this.robustStudy = value;
        }

        /**
         * Gets the value of the usedForClassification property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getUsedForClassification() {
            return usedForClassification;
        }

        /**
         * Sets the value of the usedForClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setUsedForClassification(JAXBElement<Boolean> value) {
            this.usedForClassification = value;
        }

        /**
         * Gets the value of the usedForMSDS property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getUsedForMSDS() {
            return usedForMSDS;
        }

        /**
         * Sets the value of the usedForMSDS property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setUsedForMSDS(JAXBElement<Boolean> value) {
            this.usedForMSDS = value;
        }

        /**
         * Gets the value of the studyPeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studyPeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudyPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldSmall }
         * 
         * 
         */
        public List<MultilingualTextFieldSmall> getStudyPeriod() {
            if (studyPeriod == null) {
                studyPeriod = new ArrayList<MultilingualTextFieldSmall>();
            }
            return this.studyPeriod;
        }

        /**
         * Gets the value of the reliability property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Reliability }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Reliability getReliability() {
            return reliability;
        }

        /**
         * Sets the value of the reliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Reliability }
         *     
         */
        public void setReliability(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.Reliability value) {
            this.reliability = value;
        }

        /**
         * Gets the value of the rationalReliability property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.RationalReliability }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.RationalReliability getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.RationalReliability }
         *     
         */
        public void setRationalReliability(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.RationalReliability value) {
            this.rationalReliability = value;
        }

        /**
         * Gets the value of the dataWaiving property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaiving }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaiving getDataWaiving() {
            return dataWaiving;
        }

        /**
         * Sets the value of the dataWaiving property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaiving }
         *     
         */
        public void setDataWaiving(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaiving value) {
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
         * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaivingJustification }
         * 
         * 
         */
        public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaivingJustification> getDataWaivingJustification() {
            if (dataWaivingJustification == null) {
                dataWaivingJustification = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataWaivingJustification>();
            }
            return this.dataWaivingJustification;
        }

        /**
         * Gets the value of the justificationForTypeOfInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the justificationForTypeOfInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJustificationForTypeOfInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getJustificationForTypeOfInformation() {
            if (justificationForTypeOfInformation == null) {
                justificationForTypeOfInformation = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.justificationForTypeOfInformation;
        }

        /**
         * Gets the value of the attachedJustification property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference value) {
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
         *                   &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
         *                   &lt;element name="ReasonPurpose" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60009" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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

            protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry>();
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
             *         &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
             *         &lt;element name="ReasonPurpose" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60009" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
                "attachedJustification",
                "reasonPurpose"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "AttachedJustification")
                protected String attachedJustification;
                @XmlElement(name = "ReasonPurpose")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry.ReasonPurpose reasonPurpose;

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
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.AttachedJustification.Entry.ReasonPurpose value) {
                    this.reasonPurpose = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60009" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "remarks"
                })
                public static class ReasonPurpose
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextField> remarks;

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

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remarks property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemarks().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextField }
                     * 
                     * 
                     */
                    public List<MultilingualTextField> getRemarks() {
                        if (remarks == null) {
                            remarks = new ArrayList<MultilingualTextField>();
                        }
                        return this.remarks;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="ReasonPurpose" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60010" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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

            protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry>();
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
             *         &lt;element name="ReasonPurpose" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60010" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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

                @XmlElement(name = "ReasonPurpose")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry.ReasonPurpose reasonPurpose;
                @XmlElement(name = "RelatedInformation")
                protected String relatedInformation;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldLarge> remarks;

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.CrossReference.Entry.ReasonPurpose value) {
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
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldLarge }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldLarge> getRemarks() {
                    if (remarks == null) {
                        remarks = new ArrayList<MultilingualTextFieldLarge>();
                    }
                    return this.remarks;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60010" minOccurs="0"/>
                 *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "other",
                    "remarks"
                })
                public static class ReasonPurpose
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextFieldSmall> other;
                    protected List<MultilingualTextField> remarks;

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

                    /**
                     * Gets the value of the other property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the other property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOther().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getOther() {
                        if (other == null) {
                            other = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.other;
                    }

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remarks property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemarks().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextField }
                     * 
                     * 
                     */
                    public List<MultilingualTextField> getRemarks() {
                        if (remarks == null) {
                            remarks = new ArrayList<MultilingualTextField>();
                        }
                        return this.remarks;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
         *       &lt;sequence>
         *         &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N64" minOccurs="0"/>
         *         &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N78" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "confidentiality",
            "justification",
            "legislation"
        })
        public static class DataProtection
            extends BaseDataProtectionField
        {

            protected String confidentiality;
            protected List<MultilingualTextField> justification;
            protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection.Legislation> legislation;

            /**
             * Gets the value of the confidentiality property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfidentiality() {
                return confidentiality;
            }

            /**
             * Sets the value of the confidentiality property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfidentiality(String value) {
                this.confidentiality = value;
            }

            /**
             * Gets the value of the justification property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the justification property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJustification().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getJustification() {
                if (justification == null) {
                    justification = new ArrayList<MultilingualTextField>();
                }
                return this.justification;
            }

            /**
             * Gets the value of the legislation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the legislation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLegislation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection.Legislation }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.AdministrativeData.DataProtection.Legislation>();
                }
                return this.legislation;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N78" minOccurs="0"/>
             *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                "value",
                "other"
            })
            public static class Legislation {

                protected String value;
                protected List<MultilingualTextFieldSmall> other;

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

                /**
                 * Gets the value of the other property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the other property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOther().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getOther() {
                    if (other == null) {
                        other = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.other;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z02" minOccurs="0"/>
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
            "value"
        })
        public static class DataWaiving
            extends BasePicklistField
        {

            protected String value;

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60297" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other",
            "remarks"
        })
        public static class DataWaivingJustification
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60296" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "remarks"
        })
        public static class Endpoint
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Y14_3" minOccurs="0"/>
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
            "value"
        })
        public static class PurposeFlag
            extends BasePicklistField
        {

            protected String value;

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60013" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other",
            "remarks"
        })
        public static class RationalReliability
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A36" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other"
        })
        public static class Reliability
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z05" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other",
            "remarks"
        })
        public static class StudyResultType
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
     *         &lt;element name="InterpretationOfResults" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T124" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
        "interpretationOfResults",
        "conclusions",
        "executiveSummary"
    })
    public static class ApplicantSummaryAndConclusion {

        @XmlElement(name = "InterpretationOfResults")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion.InterpretationOfResults interpretationOfResults;
        @XmlElement(name = "Conclusions")
        protected List<MultilingualTextFieldLarge> conclusions;
        @XmlElement(name = "ExecutiveSummary")
        protected List<MultilingualTextField> executiveSummary;

        /**
         * Gets the value of the interpretationOfResults property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion.InterpretationOfResults }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion.InterpretationOfResults getInterpretationOfResults() {
            return interpretationOfResults;
        }

        /**
         * Sets the value of the interpretationOfResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion.InterpretationOfResults }
         *     
         */
        public void setInterpretationOfResults(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ApplicantSummaryAndConclusion.InterpretationOfResults value) {
            this.interpretationOfResults = value;
        }

        /**
         * Gets the value of the conclusions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conclusions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConclusions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getConclusions() {
            if (conclusions == null) {
                conclusions = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.conclusions;
        }

        /**
         * Gets the value of the executiveSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the executiveSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExecutiveSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getExecutiveSummary() {
            if (executiveSummary == null) {
                executiveSummary = new ArrayList<MultilingualTextField>();
            }
            return this.executiveSummary;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T124" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other",
            "remarks"
        })
        public static class InterpretationOfResults
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
     *         &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
     *         &lt;element name="DataAccess" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z03" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataProtectionClaimed" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z30" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
        "reference",
        "dataAccess",
        "dataProtectionClaimed"
    })
    public static class DataSource {

        @XmlElement(name = "Reference")
        protected DocumentReferenceMultipleField reference;
        @XmlElement(name = "DataAccess")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataAccess dataAccess;
        @XmlElement(name = "DataProtectionClaimed")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataProtectionClaimed dataProtectionClaimed;

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
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataAccess }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataAccess getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataAccess }
         *     
         */
        public void setDataAccess(ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataAccess value) {
            this.dataAccess = value;
        }

        /**
         * Gets the value of the dataProtectionClaimed property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataProtectionClaimed }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataProtectionClaimed getDataProtectionClaimed() {
            return dataProtectionClaimed;
        }

        /**
         * Sets the value of the dataProtectionClaimed property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataProtectionClaimed }
         *     
         */
        public void setDataProtectionClaimed(ENDPOINTSTUDYRECORDAcuteToxicityDermal.DataSource.DataProtectionClaimed value) {
            this.dataProtectionClaimed = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z03" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other",
            "remarks"
        })
        public static class DataAccess
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z30" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "remarks"
        })
        public static class DataProtectionClaimed
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
     *         &lt;element name="Guideline" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Qualifier" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z06" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Guideline" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T09" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Deviation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z08" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="MethodNoGuideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GLPComplianceStatement" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z40" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TestType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T171" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LimitTest" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z38" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TestMaterials" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudyConfidential" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TestAnimals" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Species" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T02_2" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Strain" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T23_123456" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Sex" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdministrationExposure" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TypeOfCoverage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T50" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Vehicle" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T48" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DetailsOnDermalExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DurationOfExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Doses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="NoOfAnimalsPerSexPerDose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *                   &lt;element name="ControlAnimals" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T27_2" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AnyOtherInformationOnMaterialsAndMethodsInclTables" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
        "testType",
        "limitTest",
        "testMaterials",
        "testAnimals",
        "administrationExposure",
        "anyOtherInformationOnMaterialsAndMethodsInclTables"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "Guideline")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines guideline;
        @XmlElement(name = "MethodNoGuideline")
        protected List<MultilingualTextFieldLarge> methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.GLPComplianceStatement glpComplianceStatement;
        @XmlElement(name = "TestType")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestType testType;
        @XmlElement(name = "LimitTest")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.LimitTest limitTest;
        @XmlElement(name = "TestMaterials")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestMaterials testMaterials;
        @XmlElement(name = "TestAnimals")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals testAnimals;
        @XmlElement(name = "AdministrationExposure")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure administrationExposure;
        @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines value) {
            this.guideline = value;
        }

        /**
         * Gets the value of the methodNoGuideline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the methodNoGuideline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethodNoGuideline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getMethodNoGuideline() {
            if (methodNoGuideline == null) {
                methodNoGuideline = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.methodNoGuideline;
        }

        /**
         * Gets the value of the glpComplianceStatement property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.GLPComplianceStatement getGLPComplianceStatement() {
            return glpComplianceStatement;
        }

        /**
         * Sets the value of the glpComplianceStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public void setGLPComplianceStatement(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.GLPComplianceStatement value) {
            this.glpComplianceStatement = value;
        }

        /**
         * Gets the value of the testType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestType }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestType getTestType() {
            return testType;
        }

        /**
         * Sets the value of the testType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestType }
         *     
         */
        public void setTestType(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestType value) {
            this.testType = value;
        }

        /**
         * Gets the value of the limitTest property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.LimitTest }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.LimitTest getLimitTest() {
            return limitTest;
        }

        /**
         * Sets the value of the limitTest property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.LimitTest }
         *     
         */
        public void setLimitTest(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.LimitTest value) {
            this.limitTest = value;
        }

        /**
         * Gets the value of the testMaterials property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestMaterials }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestMaterials getTestMaterials() {
            return testMaterials;
        }

        /**
         * Sets the value of the testMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestMaterials }
         *     
         */
        public void setTestMaterials(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestMaterials value) {
            this.testMaterials = value;
        }

        /**
         * Gets the value of the testAnimals property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals getTestAnimals() {
            return testAnimals;
        }

        /**
         * Sets the value of the testAnimals property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals }
         *     
         */
        public void setTestAnimals(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals value) {
            this.testAnimals = value;
        }

        /**
         * Gets the value of the administrationExposure property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure getAdministrationExposure() {
            return administrationExposure;
        }

        /**
         * Sets the value of the administrationExposure property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure }
         *     
         */
        public void setAdministrationExposure(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure value) {
            this.administrationExposure = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
            return anyOtherInformationOnMaterialsAndMethodsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
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
         *         &lt;element name="TypeOfCoverage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T50" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Vehicle" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T48" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DetailsOnDermalExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DurationOfExposure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Doses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="NoOfAnimalsPerSexPerDose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
         *         &lt;element name="ControlAnimals" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T27_2" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
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
            "typeOfCoverage",
            "vehicle",
            "detailsOnDermalExposure",
            "durationOfExposure",
            "doses",
            "noOfAnimalsPerSexPerDose",
            "controlAnimals",
            "detailsOnStudyDesign",
            "statistics"
        })
        public static class AdministrationExposure {

            @XmlElement(name = "TypeOfCoverage")
            protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.TypeOfCoverage typeOfCoverage;
            @XmlElement(name = "Vehicle")
            protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.Vehicle vehicle;
            @XmlElement(name = "DetailsOnDermalExposure")
            protected List<MultilingualTextFieldLarge> detailsOnDermalExposure;
            @XmlElement(name = "DurationOfExposure")
            protected List<MultilingualTextFieldMultiLine> durationOfExposure;
            @XmlElement(name = "Doses")
            protected List<MultilingualTextFieldLarge> doses;
            @XmlElement(name = "NoOfAnimalsPerSexPerDose")
            protected String noOfAnimalsPerSexPerDose;
            @XmlElement(name = "ControlAnimals")
            protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.ControlAnimals controlAnimals;
            @XmlElement(name = "DetailsOnStudyDesign")
            protected List<MultilingualTextFieldLarge> detailsOnStudyDesign;
            @XmlElement(name = "Statistics")
            protected List<MultilingualTextFieldMultiLine> statistics;

            /**
             * Gets the value of the typeOfCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.TypeOfCoverage }
             *     
             */
            public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.TypeOfCoverage getTypeOfCoverage() {
                return typeOfCoverage;
            }

            /**
             * Sets the value of the typeOfCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.TypeOfCoverage }
             *     
             */
            public void setTypeOfCoverage(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.TypeOfCoverage value) {
                this.typeOfCoverage = value;
            }

            /**
             * Gets the value of the vehicle property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.Vehicle }
             *     
             */
            public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.Vehicle getVehicle() {
                return vehicle;
            }

            /**
             * Sets the value of the vehicle property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.Vehicle }
             *     
             */
            public void setVehicle(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.Vehicle value) {
                this.vehicle = value;
            }

            /**
             * Gets the value of the detailsOnDermalExposure property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailsOnDermalExposure property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailsOnDermalExposure().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDetailsOnDermalExposure() {
                if (detailsOnDermalExposure == null) {
                    detailsOnDermalExposure = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.detailsOnDermalExposure;
            }

            /**
             * Gets the value of the durationOfExposure property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the durationOfExposure property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDurationOfExposure().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getDurationOfExposure() {
                if (durationOfExposure == null) {
                    durationOfExposure = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.durationOfExposure;
            }

            /**
             * Gets the value of the doses property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the doses property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDoses().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDoses() {
                if (doses == null) {
                    doses = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.doses;
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
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.ControlAnimals }
             *     
             */
            public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.ControlAnimals getControlAnimals() {
                return controlAnimals;
            }

            /**
             * Sets the value of the controlAnimals property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.ControlAnimals }
             *     
             */
            public void setControlAnimals(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.AdministrationExposure.ControlAnimals value) {
                this.controlAnimals = value;
            }

            /**
             * Gets the value of the detailsOnStudyDesign property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailsOnStudyDesign property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailsOnStudyDesign().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDetailsOnStudyDesign() {
                if (detailsOnStudyDesign == null) {
                    detailsOnStudyDesign = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.detailsOnStudyDesign;
            }

            /**
             * Gets the value of the statistics property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the statistics property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStatistics().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getStatistics() {
                if (statistics == null) {
                    statistics = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.statistics;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T27_2" minOccurs="0"/>
             *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                "value",
                "other",
                "remarks"
            })
            public static class ControlAnimals
                extends BasePicklistField
            {

                protected String value;
                protected List<MultilingualTextFieldSmall> other;
                protected List<MultilingualTextField> remarks;

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

                /**
                 * Gets the value of the other property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the other property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOther().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getOther() {
                    if (other == null) {
                        other = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.other;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextField }
                 * 
                 * 
                 */
                public List<MultilingualTextField> getRemarks() {
                    if (remarks == null) {
                        remarks = new ArrayList<MultilingualTextField>();
                    }
                    return this.remarks;
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T50" minOccurs="0"/>
             *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                "value",
                "other"
            })
            public static class TypeOfCoverage
                extends BasePicklistField
            {

                protected String value;
                protected List<MultilingualTextFieldSmall> other;

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

                /**
                 * Gets the value of the other property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the other property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOther().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getOther() {
                    if (other == null) {
                        other = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.other;
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T48" minOccurs="0"/>
             *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                "value",
                "other",
                "remarks"
            })
            public static class Vehicle
                extends BasePicklistField
            {

                protected String value;
                protected List<MultilingualTextFieldSmall> other;
                protected List<MultilingualTextField> remarks;

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

                /**
                 * Gets the value of the other property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the other property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOther().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getOther() {
                    if (other == null) {
                        other = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.other;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextField }
                 * 
                 * 
                 */
                public List<MultilingualTextField> getRemarks() {
                    if (remarks == null) {
                        remarks = new ArrayList<MultilingualTextField>();
                    }
                    return this.remarks;
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
         *         &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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

            @XmlElement(name = "OtherInformation")
            protected List<MultilingualTextField> otherInformation;

            /**
             * Gets the value of the otherInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getOtherInformation() {
                if (otherInformation == null) {
                    otherInformation = new ArrayList<MultilingualTextField>();
                }
                return this.otherInformation;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z40" minOccurs="0"/>
         *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "remarks"
        })
        public static class GLPComplianceStatement
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextField> remarks;

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

            /**
             * Gets the value of the remarks property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remarks property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemarks().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getRemarks() {
                if (remarks == null) {
                    remarks = new ArrayList<MultilingualTextField>();
                }
                return this.remarks;
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
         *                   &lt;element name="Qualifier" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z06" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Guideline" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T09" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Deviation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z08" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        public static class Guidelines {

            protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry>();
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
             *         &lt;element name="Qualifier" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z06" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Guideline" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T09" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="VersionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Deviation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z08" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
                "qualifier",
                "guideline",
                "versionRemarks",
                "deviation"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Qualifier")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Qualifier qualifier;
                @XmlElement(name = "Guideline")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Guideline guideline;
                @XmlElement(name = "VersionRemarks")
                protected List<MultilingualTextFieldMultiLine> versionRemarks;
                @XmlElement(name = "Deviation")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Deviation deviation;

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Qualifier getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public void setQualifier(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Qualifier value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the guideline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Guideline getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public void setGuideline(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Guideline value) {
                    this.guideline = value;
                }

                /**
                 * Gets the value of the versionRemarks property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the versionRemarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVersionRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldMultiLine }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldMultiLine> getVersionRemarks() {
                    if (versionRemarks == null) {
                        versionRemarks = new ArrayList<MultilingualTextFieldMultiLine>();
                    }
                    return this.versionRemarks;
                }

                /**
                 * Gets the value of the deviation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Deviation getDeviation() {
                    return deviation;
                }

                /**
                 * Sets the value of the deviation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public void setDeviation(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.Guidelines.Entry.Deviation value) {
                    this.deviation = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z08" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "remarks"
                })
                public static class Deviation
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextField> remarks;

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

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remarks property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemarks().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextField }
                     * 
                     * 
                     */
                    public List<MultilingualTextField> getRemarks() {
                        if (remarks == null) {
                            remarks = new ArrayList<MultilingualTextField>();
                        }
                        return this.remarks;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T09" minOccurs="0"/>
                 *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "other"
                })
                public static class Guideline
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextFieldSmall> other;

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

                    /**
                     * Gets the value of the other property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the other property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOther().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getOther() {
                        if (other == null) {
                            other = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.other;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z06" minOccurs="0"/>
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
                    "value"
                })
                public static class Qualifier
                    extends BasePicklistField
                {

                    protected String value;

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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z38" minOccurs="0"/>
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
            "value"
        })
        public static class LimitTest
            extends BasePicklistField
        {

            protected String value;

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
         *         &lt;element name="Species" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T02_2" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Strain" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T23_123456" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Sex" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "sex",
            "organismDetails"
        })
        public static class TestAnimals {

            @XmlElement(name = "Species")
            protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Species species;
            @XmlElement(name = "Strain")
            protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Strain strain;
            @XmlElement(name = "Sex")
            protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Sex sex;
            @XmlElement(name = "OrganismDetails")
            protected List<MultilingualTextFieldLarge> organismDetails;

            /**
             * Gets the value of the species property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Species }
             *     
             */
            public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Species getSpecies() {
                return species;
            }

            /**
             * Sets the value of the species property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Species }
             *     
             */
            public void setSpecies(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Species value) {
                this.species = value;
            }

            /**
             * Gets the value of the strain property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Strain }
             *     
             */
            public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Strain getStrain() {
                return strain;
            }

            /**
             * Sets the value of the strain property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Strain }
             *     
             */
            public void setStrain(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Strain value) {
                this.strain = value;
            }

            /**
             * Gets the value of the sex property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Sex }
             *     
             */
            public ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Sex getSex() {
                return sex;
            }

            /**
             * Sets the value of the sex property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Sex }
             *     
             */
            public void setSex(ENDPOINTSTUDYRECORDAcuteToxicityDermal.MaterialsAndMethods.TestAnimals.Sex value) {
                this.sex = value;
            }

            /**
             * Gets the value of the organismDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the organismDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrganismDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getOrganismDetails() {
                if (organismDetails == null) {
                    organismDetails = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.organismDetails;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
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
                "value"
            })
            public static class Sex
                extends BasePicklistField
            {

                protected String value;

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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T02_2" minOccurs="0"/>
             *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                "value",
                "other"
            })
            public static class Species
                extends BasePicklistField
            {

                protected String value;
                protected List<MultilingualTextFieldSmall> other;

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

                /**
                 * Gets the value of the other property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the other property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOther().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getOther() {
                    if (other == null) {
                        other = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.other;
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T23_123456" minOccurs="0"/>
             *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                "value",
                "other",
                "remarks"
            })
            public static class Strain
                extends BasePicklistField
            {

                protected String value;
                protected List<MultilingualTextFieldSmall> other;
                protected List<MultilingualTextField> remarks;

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

                /**
                 * Gets the value of the other property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the other property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOther().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getOther() {
                    if (other == null) {
                        other = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.other;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextField }
                 * 
                 * 
                 */
                public List<MultilingualTextField> getRemarks() {
                    if (remarks == null) {
                        remarks = new ArrayList<MultilingualTextField>();
                    }
                    return this.remarks;
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
         *         &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *         &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudyConfidential" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "specificDetailsOnTestMaterialUsedForTheStudyConfidential"
        })
        public static class TestMaterials {

            @XmlElement(name = "TestMaterialInformation")
            protected String testMaterialInformation;
            @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudy")
            protected List<MultilingualTextFieldLarge> specificDetailsOnTestMaterialUsedForTheStudy;
            @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudyConfidential")
            protected List<MultilingualTextFieldLarge> specificDetailsOnTestMaterialUsedForTheStudyConfidential;

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
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specificDetailsOnTestMaterialUsedForTheStudy property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecificDetailsOnTestMaterialUsedForTheStudy().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getSpecificDetailsOnTestMaterialUsedForTheStudy() {
                if (specificDetailsOnTestMaterialUsedForTheStudy == null) {
                    specificDetailsOnTestMaterialUsedForTheStudy = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.specificDetailsOnTestMaterialUsedForTheStudy;
            }

            /**
             * Gets the value of the specificDetailsOnTestMaterialUsedForTheStudyConfidential property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specificDetailsOnTestMaterialUsedForTheStudyConfidential property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecificDetailsOnTestMaterialUsedForTheStudyConfidential().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getSpecificDetailsOnTestMaterialUsedForTheStudyConfidential() {
                if (specificDetailsOnTestMaterialUsedForTheStudyConfidential == null) {
                    specificDetailsOnTestMaterialUsedForTheStudyConfidential = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.specificDetailsOnTestMaterialUsedForTheStudyConfidential;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T171" minOccurs="0"/>
         *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
            "value",
            "other"
        })
        public static class TestType
            extends BasePicklistField
        {

            protected String value;
            protected List<MultilingualTextFieldSmall> other;

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

            /**
             * Gets the value of the other property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the other property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOther().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldSmall }
             * 
             * 
             */
            public List<MultilingualTextFieldSmall> getOther() {
                if (other == null) {
                    other = new ArrayList<MultilingualTextFieldSmall>();
                }
                return this.other;
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
     *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AttachedBackgroundMaterial" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField" minOccurs="0"/>
     *         &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
     *         &lt;element name="AttachedSanitisedDocsForPublication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField" minOccurs="0"/>
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
        "illustrationPicGraph",
        "attachedSanitisedDocsForPublication"
    })
    public static class OverallRemarksAttachments {

        @XmlElement(name = "RemarksOnResults")
        protected List<MultilingualTextField> remarksOnResults;
        @XmlElement(name = "AttachedBackgroundMaterial")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
        @XmlElement(name = "AttachedStudyReport")
        protected AttachmentListField attachedStudyReport;
        @XmlElement(name = "IllustrationPicGraph")
        protected String illustrationPicGraph;
        @XmlElement(name = "AttachedSanitisedDocsForPublication")
        protected AttachmentListField attachedSanitisedDocsForPublication;

        /**
         * Gets the value of the remarksOnResults property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remarksOnResults property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemarksOnResults().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getRemarksOnResults() {
            if (remarksOnResults == null) {
                remarksOnResults = new ArrayList<MultilingualTextField>();
            }
            return this.remarksOnResults;
        }

        /**
         * Gets the value of the attachedBackgroundMaterial property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
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
         * Gets the value of the attachedSanitisedDocsForPublication property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListField }
         *     
         */
        public AttachmentListField getAttachedSanitisedDocsForPublication() {
            return attachedSanitisedDocsForPublication;
        }

        /**
         * Sets the value of the attachedSanitisedDocsForPublication property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListField }
         *     
         */
        public void setAttachedSanitisedDocsForPublication(AttachmentListField value) {
            this.attachedSanitisedDocsForPublication = value;
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
         *                   &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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

            protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
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
             *         &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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

                @XmlElement(name = "AttachedDocument")
                protected String attachedDocument;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldSmall> remarks;

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
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getRemarks() {
                    if (remarks == null) {
                        remarks = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.remarks;
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
     *         &lt;element name="Preliminary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EffectLevels" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                             &lt;element name="Sex" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Endpoint" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T01" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="EffectLevel" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T04" minOccurs="0"/>
     *                                       &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BasedOn" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}E105" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="cl" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RemarksOnResults" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60298" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="Mortality" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ClinicalSigns" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="BodyWeight" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="GrossPathology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OtherFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AnyOtherInformationOnResultsInclTables" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
        "preliminary",
        "effectLevels",
        "mortality",
        "clinicalSigns",
        "bodyWeight",
        "grossPathology",
        "otherFindings",
        "anyOtherInformationOnResultsInclTables"
    })
    public static class ResultsAndDiscussion {

        @XmlElement(name = "Preliminary")
        protected List<MultilingualTextFieldMultiLine> preliminary;
        @XmlElement(name = "EffectLevels")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels effectLevels;
        @XmlElement(name = "Mortality")
        protected List<MultilingualTextFieldMultiLine> mortality;
        @XmlElement(name = "ClinicalSigns")
        protected List<MultilingualTextFieldMultiLine> clinicalSigns;
        @XmlElement(name = "BodyWeight")
        protected List<MultilingualTextFieldMultiLine> bodyWeight;
        @XmlElement(name = "GrossPathology")
        protected List<MultilingualTextFieldMultiLine> grossPathology;
        @XmlElement(name = "OtherFindings")
        protected List<MultilingualTextFieldLarge> otherFindings;
        @XmlElement(name = "AnyOtherInformationOnResultsInclTables")
        protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

        /**
         * Gets the value of the preliminary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the preliminary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPreliminary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getPreliminary() {
            if (preliminary == null) {
                preliminary = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.preliminary;
        }

        /**
         * Gets the value of the effectLevels property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels getEffectLevels() {
            return effectLevels;
        }

        /**
         * Sets the value of the effectLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels }
         *     
         */
        public void setEffectLevels(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels value) {
            this.effectLevels = value;
        }

        /**
         * Gets the value of the mortality property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mortality property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMortality().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getMortality() {
            if (mortality == null) {
                mortality = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.mortality;
        }

        /**
         * Gets the value of the clinicalSigns property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clinicalSigns property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClinicalSigns().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getClinicalSigns() {
            if (clinicalSigns == null) {
                clinicalSigns = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.clinicalSigns;
        }

        /**
         * Gets the value of the bodyWeight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bodyWeight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBodyWeight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getBodyWeight() {
            if (bodyWeight == null) {
                bodyWeight = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.bodyWeight;
        }

        /**
         * Gets the value of the grossPathology property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the grossPathology property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGrossPathology().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getGrossPathology() {
            if (grossPathology == null) {
                grossPathology = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.grossPathology;
        }

        /**
         * Gets the value of the otherFindings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherFindings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherFindings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getOtherFindings() {
            if (otherFindings == null) {
                otherFindings = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.otherFindings;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
            return anyOtherInformationOnResultsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public void setAnyOtherInformationOnResultsInclTables(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables value) {
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
         *         &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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

            @XmlElement(name = "OtherInformation")
            protected List<MultilingualTextField> otherInformation;

            /**
             * Gets the value of the otherInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextField }
             * 
             * 
             */
            public List<MultilingualTextField> getOtherInformation() {
                if (otherInformation == null) {
                    otherInformation = new ArrayList<MultilingualTextField>();
                }
                return this.otherInformation;
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
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *                   &lt;element name="Sex" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Endpoint" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T01" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="EffectLevel" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T04" minOccurs="0"/>
         *                             &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BasedOn" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}E105" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="cl" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RemarksOnResults" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60298" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        public static class EffectLevels {

            protected List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry>();
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
             *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
             *         &lt;element name="Sex" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Endpoint" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T01" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="EffectLevel" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T04" minOccurs="0"/>
             *                   &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BasedOn" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}E105" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="cl" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RemarksOnResults" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60298" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
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
                "keyResult",
                "sex",
                "endpoint",
                "effectLevel",
                "basedOn",
                "cl",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElementRef(name = "KeyResult", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AcuteToxicityDermal/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> keyResult;
                @XmlElement(name = "Sex")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Sex sex;
                @XmlElement(name = "Endpoint")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Endpoint endpoint;
                @XmlElement(name = "EffectLevel")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.EffectLevel effectLevel;
                @XmlElement(name = "BasedOn")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.BasedOn basedOn;
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Cl cl;
                @XmlElement(name = "RemarksOnResults")
                protected ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.RemarksOnResults remarksOnResults;

                /**
                 * Gets the value of the keyResult property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public JAXBElement<Boolean> getKeyResult() {
                    return keyResult;
                }

                /**
                 * Sets the value of the keyResult property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
                 *     
                 */
                public void setKeyResult(JAXBElement<Boolean> value) {
                    this.keyResult = value;
                }

                /**
                 * Gets the value of the sex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Sex }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Sex getSex() {
                    return sex;
                }

                /**
                 * Sets the value of the sex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Sex }
                 *     
                 */
                public void setSex(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Sex value) {
                    this.sex = value;
                }

                /**
                 * Gets the value of the endpoint property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Endpoint }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Endpoint getEndpoint() {
                    return endpoint;
                }

                /**
                 * Sets the value of the endpoint property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Endpoint }
                 *     
                 */
                public void setEndpoint(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Endpoint value) {
                    this.endpoint = value;
                }

                /**
                 * Gets the value of the effectLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.EffectLevel }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.EffectLevel getEffectLevel() {
                    return effectLevel;
                }

                /**
                 * Sets the value of the effectLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.EffectLevel }
                 *     
                 */
                public void setEffectLevel(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.EffectLevel value) {
                    this.effectLevel = value;
                }

                /**
                 * Gets the value of the basedOn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.BasedOn }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.BasedOn getBasedOn() {
                    return basedOn;
                }

                /**
                 * Sets the value of the basedOn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.BasedOn }
                 *     
                 */
                public void setBasedOn(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.BasedOn value) {
                    this.basedOn = value;
                }

                /**
                 * Gets the value of the cl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Cl }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Cl getCl() {
                    return cl;
                }

                /**
                 * Sets the value of the cl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Cl }
                 *     
                 */
                public void setCl(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.Cl value) {
                    this.cl = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.RemarksOnResults }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.RemarksOnResults getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.RemarksOnResults }
                 *     
                 */
                public void setRemarksOnResults(ENDPOINTSTUDYRECORDAcuteToxicityDermal.ResultsAndDiscussion.EffectLevels.Entry.RemarksOnResults value) {
                    this.remarksOnResults = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}E105" minOccurs="0"/>
                 *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "other",
                    "remarks"
                })
                public static class BasedOn
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextFieldSmall> other;
                    protected List<MultilingualTextField> remarks;

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

                    /**
                     * Gets the value of the other property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the other property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOther().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getOther() {
                        if (other == null) {
                            other = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.other;
                    }

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remarks property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemarks().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextField }
                     * 
                     * 
                     */
                    public List<MultilingualTextField> getRemarks() {
                        if (remarks == null) {
                            remarks = new ArrayList<MultilingualTextField>();
                        }
                        return this.remarks;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *       &lt;sequence>
                 *         &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *         &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *         &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    "lowerQualifier",
                    "upperQualifier",
                    "lowerValue",
                    "upperValue"
                })
                public static class Cl
                    extends BasePhysicalQuantityRangeField
                {

                    protected String lowerQualifier;
                    protected String upperQualifier;
                    protected BigDecimal lowerValue;
                    protected BigDecimal upperValue;

                    /**
                     * Gets the value of the lowerQualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLowerQualifier() {
                        return lowerQualifier;
                    }

                    /**
                     * Sets the value of the lowerQualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLowerQualifier(String value) {
                        this.lowerQualifier = value;
                    }

                    /**
                     * Gets the value of the upperQualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUpperQualifier() {
                        return upperQualifier;
                    }

                    /**
                     * Sets the value of the upperQualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUpperQualifier(String value) {
                        this.upperQualifier = value;
                    }

                    /**
                     * Gets the value of the lowerValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getLowerValue() {
                        return lowerValue;
                    }

                    /**
                     * Sets the value of the lowerValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setLowerValue(BigDecimal value) {
                        this.lowerValue = value;
                    }

                    /**
                     * Gets the value of the upperValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getUpperValue() {
                        return upperValue;
                    }

                    /**
                     * Sets the value of the upperValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setUpperValue(BigDecimal value) {
                        this.upperValue = value;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T04" minOccurs="0"/>
                 *         &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *         &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *         &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    "lowerQualifier",
                    "upperQualifier",
                    "lowerValue",
                    "upperValue"
                })
                public static class EffectLevel
                    extends BasePhysicalQuantityRangeField
                {

                    protected String unitCode;
                    protected List<MultilingualTextFieldSmall> unitOther;
                    protected String lowerQualifier;
                    protected String upperQualifier;
                    protected BigDecimal lowerValue;
                    protected BigDecimal upperValue;

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
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the unitOther property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getUnitOther().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getUnitOther() {
                        if (unitOther == null) {
                            unitOther = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.unitOther;
                    }

                    /**
                     * Gets the value of the lowerQualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLowerQualifier() {
                        return lowerQualifier;
                    }

                    /**
                     * Sets the value of the lowerQualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLowerQualifier(String value) {
                        this.lowerQualifier = value;
                    }

                    /**
                     * Gets the value of the upperQualifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUpperQualifier() {
                        return upperQualifier;
                    }

                    /**
                     * Sets the value of the upperQualifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUpperQualifier(String value) {
                        this.upperQualifier = value;
                    }

                    /**
                     * Gets the value of the lowerValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getLowerValue() {
                        return lowerValue;
                    }

                    /**
                     * Sets the value of the lowerValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setLowerValue(BigDecimal value) {
                        this.lowerValue = value;
                    }

                    /**
                     * Gets the value of the upperValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getUpperValue() {
                        return upperValue;
                    }

                    /**
                     * Sets the value of the upperValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setUpperValue(BigDecimal value) {
                        this.upperValue = value;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T01" minOccurs="0"/>
                 *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "other",
                    "remarks"
                })
                public static class Endpoint
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextFieldSmall> other;
                    protected List<MultilingualTextField> remarks;

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

                    /**
                     * Gets the value of the other property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the other property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOther().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getOther() {
                        if (other == null) {
                            other = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.other;
                    }

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remarks property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemarks().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextField }
                     * 
                     * 
                     */
                    public List<MultilingualTextField> getRemarks() {
                        if (remarks == null) {
                            remarks = new ArrayList<MultilingualTextField>();
                        }
                        return this.remarks;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60298" minOccurs="0"/>
                 *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
                    "value",
                    "other",
                    "remarks"
                })
                public static class RemarksOnResults
                    extends BasePicklistField
                {

                    protected String value;
                    protected List<MultilingualTextFieldSmall> other;
                    protected List<MultilingualTextField> remarks;

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

                    /**
                     * Gets the value of the other property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the other property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOther().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getOther() {
                        if (other == null) {
                            other = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.other;
                    }

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the remarks property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRemarks().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextField }
                     * 
                     * 
                     */
                    public List<MultilingualTextField> getRemarks() {
                        if (remarks == null) {
                            remarks = new ArrayList<MultilingualTextField>();
                        }
                        return this.remarks;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *       &lt;sequence>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}T24" minOccurs="0"/>
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
                    "value"
                })
                public static class Sex
                    extends BasePicklistField
                {

                    protected String value;

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

}
