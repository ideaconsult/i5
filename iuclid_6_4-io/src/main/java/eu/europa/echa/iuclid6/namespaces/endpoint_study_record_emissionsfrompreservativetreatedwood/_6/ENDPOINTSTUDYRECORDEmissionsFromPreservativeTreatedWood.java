
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._6;

import java.math.BigDecimal;
import java.math.BigInteger;
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
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePhysicalQuantityField;
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
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60427" minOccurs="0"/>
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
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z52" minOccurs="0"/>
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
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE20" minOccurs="0"/>
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
 *                   &lt;element name="StudyType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE90" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CompanyStudyNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                   &lt;element name="ReportDate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TestWater" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE10" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="WoodPreservative" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SupplierPreserv" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                             &lt;element name="TypeFormulation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE30" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Preservative" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE40" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ActiveIngredients" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE50" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Composition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                             &lt;element name="Coformulants" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Retention" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE60" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="Application" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ApplicationMethod" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE70" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TreatFacility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Registrant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DetailMethod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ApplicationDate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="FormulaRetention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ConditionProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="EndSealant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="SubsTreat" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TestSpecimens" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TestSpecimens" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="WoodSpecies" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE80" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="SourceWood" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Density" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
 *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="GrowthRate" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Dimensionx" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                 &lt;element name="Dimensiony" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                 &lt;element name="Dimensionz" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                 &lt;element name="MoistureContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
 *                             &lt;element name="WaterSamples" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                 &lt;element name="MeanTemp" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A102" minOccurs="0"/>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                             &lt;element name="LoadingConditions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="WoodWeightPerWaterVolume" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="WoodSurfacePerWaterVolume" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE250" minOccurs="0"/>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                   &lt;element name="Retention" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ReplicateNumber" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="Retention" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE260" minOccurs="0"/>
 *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="RetentionStddev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                       &lt;element name="RetentionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="Leaching" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Time" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C113" minOccurs="0"/>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ActiveIngredient" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="TypeOfSpecimen" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE270" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SpecimenNumber" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="EmissionRate" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE280" minOccurs="0"/>
 *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="ValidityCritFulfilled" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}F102" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="QualityCriteria" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="KineticEvaluation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField" minOccurs="0"/>
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
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.EmissionsFromPreservativeTreatedWood")
public class ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood {

    @XmlElement(name = "AdministrativeData")
    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource")
    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods")
    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "ResultsAndDiscussion")
    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion resultsAndDiscussion;
    @XmlElement(name = "OverallRemarksAttachments")
    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion")
    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the resultsAndDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion }
     *     
     */
    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion getResultsAndDiscussion() {
        return resultsAndDiscussion;
    }

    /**
     * Sets the value of the resultsAndDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion }
     *     
     */
    public void setResultsAndDiscussion(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion value) {
        this.resultsAndDiscussion = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ApplicantSummaryAndConclusion value) {
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
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60427" minOccurs="0"/>
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
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z52" minOccurs="0"/>
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
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection dataProtection;
        @XmlElement(name = "Endpoint")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Endpoint endpoint;
        @XmlElement(name = "StudyResultType")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.StudyResultType studyResultType;
        @XmlElement(name = "PurposeFlag")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.PurposeFlag purposeFlag;
        @XmlElementRef(name = "RobustStudy", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> robustStudy;
        @XmlElementRef(name = "UsedForClassification", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForClassification;
        @XmlElementRef(name = "UsedForMSDS", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForMSDS;
        @XmlElement(name = "StudyPeriod")
        protected List<MultilingualTextFieldSmall> studyPeriod;
        @XmlElement(name = "Reliability")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Reliability reliability;
        @XmlElement(name = "RationalReliability")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.RationalReliability rationalReliability;
        @XmlElement(name = "DataWaiving")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaiving dataWaiving;
        @XmlElement(name = "DataWaivingJustification")
        protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaivingJustification> dataWaivingJustification;
        @XmlElement(name = "JustificationForTypeOfInformation")
        protected List<MultilingualTextFieldLarge> justificationForTypeOfInformation;
        @XmlElement(name = "AttachedJustification")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference crossReference;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection }
         *     
         */
        public void setDataProtection(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Endpoint }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Endpoint getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Endpoint }
         *     
         */
        public void setEndpoint(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Endpoint value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.StudyResultType }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.StudyResultType getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.StudyResultType }
         *     
         */
        public void setStudyResultType(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.StudyResultType value) {
            this.studyResultType = value;
        }

        /**
         * Gets the value of the purposeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.PurposeFlag }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.PurposeFlag getPurposeFlag() {
            return purposeFlag;
        }

        /**
         * Sets the value of the purposeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.PurposeFlag }
         *     
         */
        public void setPurposeFlag(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.PurposeFlag value) {
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
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Reliability }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Reliability getReliability() {
            return reliability;
        }

        /**
         * Sets the value of the reliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Reliability }
         *     
         */
        public void setReliability(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.Reliability value) {
            this.reliability = value;
        }

        /**
         * Gets the value of the rationalReliability property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.RationalReliability }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.RationalReliability getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.RationalReliability }
         *     
         */
        public void setRationalReliability(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.RationalReliability value) {
            this.rationalReliability = value;
        }

        /**
         * Gets the value of the dataWaiving property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaiving }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaiving getDataWaiving() {
            return dataWaiving;
        }

        /**
         * Sets the value of the dataWaiving property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaiving }
         *     
         */
        public void setDataWaiving(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaiving value) {
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
         * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaivingJustification }
         * 
         * 
         */
        public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaivingJustification> getDataWaivingJustification() {
            if (dataWaivingJustification == null) {
                dataWaivingJustification = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataWaivingJustification>();
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
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference value) {
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

            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry>();
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
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry.ReasonPurpose reasonPurpose;

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
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.AttachedJustification.Entry.ReasonPurpose value) {
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

            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry>();
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
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry.ReasonPurpose reasonPurpose;
                @XmlElement(name = "RelatedInformation")
                protected String relatedInformation;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldLarge> remarks;

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.CrossReference.Entry.ReasonPurpose value) {
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
            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection.Legislation> legislation;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection.Legislation }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.AdministrativeData.DataProtection.Legislation>();
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}Z52" minOccurs="0"/>
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60427" minOccurs="0"/>
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
        "conclusions",
        "executiveSummary"
    })
    public static class ApplicantSummaryAndConclusion {

        @XmlElement(name = "Conclusions")
        protected List<MultilingualTextFieldLarge> conclusions;
        @XmlElement(name = "ExecutiveSummary")
        protected List<MultilingualTextField> executiveSummary;

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
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataAccess dataAccess;
        @XmlElement(name = "DataProtectionClaimed")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataProtectionClaimed dataProtectionClaimed;

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
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataAccess }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataAccess getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataAccess }
         *     
         */
        public void setDataAccess(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataAccess value) {
            this.dataAccess = value;
        }

        /**
         * Gets the value of the dataProtectionClaimed property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataProtectionClaimed }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataProtectionClaimed getDataProtectionClaimed() {
            return dataProtectionClaimed;
        }

        /**
         * Sets the value of the dataProtectionClaimed property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataProtectionClaimed }
         *     
         */
        public void setDataProtectionClaimed(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.DataSource.DataProtectionClaimed value) {
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
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE20" minOccurs="0"/>
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
     *         &lt;element name="StudyType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE90" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CompanyStudyNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *         &lt;element name="ReportDate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TestWater" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE10" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="WoodPreservative" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SupplierPreserv" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *                   &lt;element name="TypeFormulation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE30" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Preservative" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE40" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ActiveIngredients" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE50" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Composition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                   &lt;element name="Coformulants" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Retention" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE60" minOccurs="0"/>
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
     *         &lt;element name="Application" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ApplicationMethod" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE70" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TreatFacility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Registrant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DetailMethod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ApplicationDate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="FormulaRetention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ConditionProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="EndSealant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="SubsTreat" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TestSpecimens" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TestSpecimens" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="WoodSpecies" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE80" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="SourceWood" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="Density" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
     *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="GrowthRate" minOccurs="0">
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
     *                                       &lt;element name="Dimensionx" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                       &lt;element name="Dimensiony" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                       &lt;element name="Dimensionz" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                       &lt;element name="MoistureContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
     *                   &lt;element name="WaterSamples" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                       &lt;element name="MeanTemp" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A102" minOccurs="0"/>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
     *                   &lt;element name="LoadingConditions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="WoodWeightPerWaterVolume" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="WoodSurfacePerWaterVolume" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE250" minOccurs="0"/>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
        "studyType",
        "companyStudyNo",
        "reportDate",
        "testWater",
        "testMaterials",
        "woodPreservative",
        "application",
        "testSpecimens",
        "anyOtherInformationOnMaterialsAndMethodsInclTables"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "Guideline")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines guideline;
        @XmlElement(name = "MethodNoGuideline")
        protected List<MultilingualTextFieldLarge> methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.GLPComplianceStatement glpComplianceStatement;
        @XmlElement(name = "StudyType")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.StudyType studyType;
        @XmlElement(name = "CompanyStudyNo")
        protected String companyStudyNo;
        @XmlElement(name = "ReportDate")
        protected List<MultilingualTextFieldSmall> reportDate;
        @XmlElement(name = "TestWater")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestWater testWater;
        @XmlElement(name = "TestMaterials")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestMaterials testMaterials;
        @XmlElement(name = "WoodPreservative")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative woodPreservative;
        @XmlElement(name = "Application")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application application;
        @XmlElement(name = "TestSpecimens")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet testSpecimens;
        @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines value) {
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
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.GLPComplianceStatement getGLPComplianceStatement() {
            return glpComplianceStatement;
        }

        /**
         * Sets the value of the glpComplianceStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public void setGLPComplianceStatement(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.GLPComplianceStatement value) {
            this.glpComplianceStatement = value;
        }

        /**
         * Gets the value of the studyType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.StudyType }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.StudyType getStudyType() {
            return studyType;
        }

        /**
         * Sets the value of the studyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.StudyType }
         *     
         */
        public void setStudyType(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.StudyType value) {
            this.studyType = value;
        }

        /**
         * Gets the value of the companyStudyNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyStudyNo() {
            return companyStudyNo;
        }

        /**
         * Sets the value of the companyStudyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyStudyNo(String value) {
            this.companyStudyNo = value;
        }

        /**
         * Gets the value of the reportDate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reportDate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReportDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldSmall }
         * 
         * 
         */
        public List<MultilingualTextFieldSmall> getReportDate() {
            if (reportDate == null) {
                reportDate = new ArrayList<MultilingualTextFieldSmall>();
            }
            return this.reportDate;
        }

        /**
         * Gets the value of the testWater property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestWater }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestWater getTestWater() {
            return testWater;
        }

        /**
         * Sets the value of the testWater property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestWater }
         *     
         */
        public void setTestWater(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestWater value) {
            this.testWater = value;
        }

        /**
         * Gets the value of the testMaterials property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestMaterials }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestMaterials getTestMaterials() {
            return testMaterials;
        }

        /**
         * Sets the value of the testMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestMaterials }
         *     
         */
        public void setTestMaterials(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestMaterials value) {
            this.testMaterials = value;
        }

        /**
         * Gets the value of the woodPreservative property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative getWoodPreservative() {
            return woodPreservative;
        }

        /**
         * Sets the value of the woodPreservative property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative }
         *     
         */
        public void setWoodPreservative(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative value) {
            this.woodPreservative = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application }
         *     
         */
        public void setApplication(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application value) {
            this.application = value;
        }

        /**
         * Gets the value of the testSpecimens property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet getTestSpecimens() {
            return testSpecimens;
        }

        /**
         * Sets the value of the testSpecimens property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet }
         *     
         */
        public void setTestSpecimens(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet value) {
            this.testSpecimens = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
            return anyOtherInformationOnMaterialsAndMethodsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ApplicationMethod" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE70" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TreatFacility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Registrant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DetailMethod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ApplicationDate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="FormulaRetention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ConditionProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="EndSealant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="SubsTreat" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
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
            "applicationMethod",
            "treatFacility",
            "registrant",
            "detailMethod",
            "applicationDate",
            "formulaRetention",
            "conditionProcedure",
            "endSealant",
            "subsTreat"
        })
        public static class Application {

            @XmlElement(name = "ApplicationMethod")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application.ApplicationMethod applicationMethod;
            @XmlElement(name = "TreatFacility")
            protected List<MultilingualTextFieldMultiLine> treatFacility;
            @XmlElement(name = "Registrant")
            protected List<MultilingualTextFieldMultiLine> registrant;
            @XmlElement(name = "DetailMethod")
            protected List<MultilingualTextFieldMultiLine> detailMethod;
            @XmlElement(name = "ApplicationDate")
            protected List<MultilingualTextFieldMultiLine> applicationDate;
            @XmlElement(name = "FormulaRetention")
            protected List<MultilingualTextFieldMultiLine> formulaRetention;
            @XmlElement(name = "ConditionProcedure")
            protected List<MultilingualTextFieldMultiLine> conditionProcedure;
            @XmlElement(name = "EndSealant")
            protected List<MultilingualTextFieldMultiLine> endSealant;
            @XmlElement(name = "SubsTreat")
            protected List<MultilingualTextFieldMultiLine> subsTreat;

            /**
             * Gets the value of the applicationMethod property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application.ApplicationMethod }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application.ApplicationMethod getApplicationMethod() {
                return applicationMethod;
            }

            /**
             * Sets the value of the applicationMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application.ApplicationMethod }
             *     
             */
            public void setApplicationMethod(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Application.ApplicationMethod value) {
                this.applicationMethod = value;
            }

            /**
             * Gets the value of the treatFacility property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the treatFacility property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTreatFacility().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getTreatFacility() {
                if (treatFacility == null) {
                    treatFacility = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.treatFacility;
            }

            /**
             * Gets the value of the registrant property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the registrant property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegistrant().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getRegistrant() {
                if (registrant == null) {
                    registrant = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.registrant;
            }

            /**
             * Gets the value of the detailMethod property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailMethod property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailMethod().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getDetailMethod() {
                if (detailMethod == null) {
                    detailMethod = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.detailMethod;
            }

            /**
             * Gets the value of the applicationDate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationDate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplicationDate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getApplicationDate() {
                if (applicationDate == null) {
                    applicationDate = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.applicationDate;
            }

            /**
             * Gets the value of the formulaRetention property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the formulaRetention property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFormulaRetention().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getFormulaRetention() {
                if (formulaRetention == null) {
                    formulaRetention = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.formulaRetention;
            }

            /**
             * Gets the value of the conditionProcedure property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the conditionProcedure property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getConditionProcedure().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getConditionProcedure() {
                if (conditionProcedure == null) {
                    conditionProcedure = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.conditionProcedure;
            }

            /**
             * Gets the value of the endSealant property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the endSealant property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEndSealant().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getEndSealant() {
                if (endSealant == null) {
                    endSealant = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.endSealant;
            }

            /**
             * Gets the value of the subsTreat property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subsTreat property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubsTreat().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getSubsTreat() {
                if (subsTreat == null) {
                    subsTreat = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.subsTreat;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE70" minOccurs="0"/>
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
            public static class ApplicationMethod
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
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE20" minOccurs="0"/>
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

            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry>();
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
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE20" minOccurs="0"/>
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
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Qualifier qualifier;
                @XmlElement(name = "Guideline")
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Guideline guideline;
                @XmlElement(name = "VersionRemarks")
                protected List<MultilingualTextFieldMultiLine> versionRemarks;
                @XmlElement(name = "Deviation")
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Deviation deviation;

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Qualifier getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public void setQualifier(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Qualifier value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the guideline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Guideline getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public void setGuideline(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Guideline value) {
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
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Deviation getDeviation() {
                    return deviation;
                }

                /**
                 * Sets the value of the deviation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public void setDeviation(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.Guidelines.Entry.Deviation value) {
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE20" minOccurs="0"/>
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE90" minOccurs="0"/>
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
        public static class StudyType
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TestSpecimens" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="WoodSpecies" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE80" minOccurs="0"/>
         *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="SourceWood" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="Density" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                     &lt;sequence>
         *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
         *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="GrowthRate" minOccurs="0">
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
         *                             &lt;element name="Dimensionx" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                             &lt;element name="Dimensiony" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                             &lt;element name="Dimensionz" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                             &lt;element name="MoistureContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
         *         &lt;element name="WaterSamples" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                             &lt;element name="MeanTemp" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
         *                                     &lt;sequence>
         *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A102" minOccurs="0"/>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
         *         &lt;element name="LoadingConditions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="WoodWeightPerWaterVolume" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
         *                                     &lt;sequence>
         *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="WoodSurfacePerWaterVolume" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
         *                                     &lt;sequence>
         *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE250" minOccurs="0"/>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
            "testSpecimens",
            "waterSamples",
            "loadingConditions"
        })
        public static class TestSpecimensSet {

            @XmlElement(name = "TestSpecimens")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens testSpecimens;
            @XmlElement(name = "WaterSamples")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples waterSamples;
            @XmlElement(name = "LoadingConditions")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions loadingConditions;

            /**
             * Gets the value of the testSpecimens property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens getTestSpecimens() {
                return testSpecimens;
            }

            /**
             * Sets the value of the testSpecimens property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens }
             *     
             */
            public void setTestSpecimens(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens value) {
                this.testSpecimens = value;
            }

            /**
             * Gets the value of the waterSamples property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples getWaterSamples() {
                return waterSamples;
            }

            /**
             * Sets the value of the waterSamples property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples }
             *     
             */
            public void setWaterSamples(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples value) {
                this.waterSamples = value;
            }

            /**
             * Gets the value of the loadingConditions property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions getLoadingConditions() {
                return loadingConditions;
            }

            /**
             * Sets the value of the loadingConditions property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions }
             *     
             */
            public void setLoadingConditions(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions value) {
                this.loadingConditions = value;
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
             *                   &lt;element name="WoodWeightPerWaterVolume" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
             *                           &lt;sequence>
             *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="WoodSurfacePerWaterVolume" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
             *                           &lt;sequence>
             *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE250" minOccurs="0"/>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
            public static class LoadingConditions {

                protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry>();
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
                 *         &lt;element name="WoodWeightPerWaterVolume" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="WoodSurfacePerWaterVolume" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE250" minOccurs="0"/>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
                    "woodWeightPerWaterVolume",
                    "woodSurfacePerWaterVolume"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "WoodWeightPerWaterVolume")
                    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodWeightPerWaterVolume woodWeightPerWaterVolume;
                    @XmlElement(name = "WoodSurfacePerWaterVolume")
                    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodSurfacePerWaterVolume woodSurfacePerWaterVolume;

                    /**
                     * Gets the value of the woodWeightPerWaterVolume property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodWeightPerWaterVolume }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodWeightPerWaterVolume getWoodWeightPerWaterVolume() {
                        return woodWeightPerWaterVolume;
                    }

                    /**
                     * Sets the value of the woodWeightPerWaterVolume property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodWeightPerWaterVolume }
                     *     
                     */
                    public void setWoodWeightPerWaterVolume(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodWeightPerWaterVolume value) {
                        this.woodWeightPerWaterVolume = value;
                    }

                    /**
                     * Gets the value of the woodSurfacePerWaterVolume property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodSurfacePerWaterVolume }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodSurfacePerWaterVolume getWoodSurfacePerWaterVolume() {
                        return woodSurfacePerWaterVolume;
                    }

                    /**
                     * Sets the value of the woodSurfacePerWaterVolume property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodSurfacePerWaterVolume }
                     *     
                     */
                    public void setWoodSurfacePerWaterVolume(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.LoadingConditions.Entry.WoodSurfacePerWaterVolume value) {
                        this.woodSurfacePerWaterVolume = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                     *       &lt;sequence>
                     *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE250" minOccurs="0"/>
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
                        "value"
                    })
                    public static class WoodSurfacePerWaterVolume
                        extends BasePhysicalQuantityField
                    {

                        protected String unitCode;
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
                     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                     *       &lt;sequence>
                     *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
                        "value"
                    })
                    public static class WoodWeightPerWaterVolume
                        extends BasePhysicalQuantityField
                    {

                        protected String unitCode;
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *                 &lt;sequence>
             *                   &lt;element name="WoodSpecies" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE80" minOccurs="0"/>
             *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="SourceWood" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="Density" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                           &lt;sequence>
             *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
             *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="GrowthRate" minOccurs="0">
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
             *                   &lt;element name="Dimensionx" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                   &lt;element name="Dimensiony" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                   &lt;element name="Dimensionz" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                   &lt;element name="MoistureContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
            public static class TestSpecimens {

                protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry>();
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
                 *         &lt;element name="WoodSpecies" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE80" minOccurs="0"/>
                 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="SourceWood" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="Density" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
                 *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="GrowthRate" minOccurs="0">
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
                 *         &lt;element name="Dimensionx" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *         &lt;element name="Dimensiony" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *         &lt;element name="Dimensionz" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *         &lt;element name="MoistureContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
                    "woodSpecies",
                    "sourceWood",
                    "density",
                    "growthRate",
                    "dimensionx",
                    "dimensiony",
                    "dimensionz",
                    "moistureContent"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "WoodSpecies")
                    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.WoodSpecies woodSpecies;
                    @XmlElement(name = "SourceWood")
                    protected List<MultilingualTextFieldMultiLine> sourceWood;
                    @XmlElement(name = "Density")
                    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.Density density;
                    @XmlElement(name = "GrowthRate")
                    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.GrowthRate growthRate;
                    @XmlElementRef(name = "Dimensionx", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> dimensionx;
                    @XmlElementRef(name = "Dimensiony", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> dimensiony;
                    @XmlElementRef(name = "Dimensionz", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> dimensionz;
                    @XmlElementRef(name = "MoistureContent", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> moistureContent;

                    /**
                     * Gets the value of the woodSpecies property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.WoodSpecies }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.WoodSpecies getWoodSpecies() {
                        return woodSpecies;
                    }

                    /**
                     * Sets the value of the woodSpecies property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.WoodSpecies }
                     *     
                     */
                    public void setWoodSpecies(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.WoodSpecies value) {
                        this.woodSpecies = value;
                    }

                    /**
                     * Gets the value of the sourceWood property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the sourceWood property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSourceWood().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldMultiLine }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldMultiLine> getSourceWood() {
                        if (sourceWood == null) {
                            sourceWood = new ArrayList<MultilingualTextFieldMultiLine>();
                        }
                        return this.sourceWood;
                    }

                    /**
                     * Gets the value of the density property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.Density }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.Density getDensity() {
                        return density;
                    }

                    /**
                     * Sets the value of the density property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.Density }
                     *     
                     */
                    public void setDensity(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.Density value) {
                        this.density = value;
                    }

                    /**
                     * Gets the value of the growthRate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.GrowthRate }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.GrowthRate getGrowthRate() {
                        return growthRate;
                    }

                    /**
                     * Sets the value of the growthRate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.GrowthRate }
                     *     
                     */
                    public void setGrowthRate(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.TestSpecimens.Entry.GrowthRate value) {
                        this.growthRate = value;
                    }

                    /**
                     * Gets the value of the dimensionx property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getDimensionx() {
                        return dimensionx;
                    }

                    /**
                     * Sets the value of the dimensionx property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setDimensionx(JAXBElement<BigDecimal> value) {
                        this.dimensionx = value;
                    }

                    /**
                     * Gets the value of the dimensiony property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getDimensiony() {
                        return dimensiony;
                    }

                    /**
                     * Sets the value of the dimensiony property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setDimensiony(JAXBElement<BigDecimal> value) {
                        this.dimensiony = value;
                    }

                    /**
                     * Gets the value of the dimensionz property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getDimensionz() {
                        return dimensionz;
                    }

                    /**
                     * Sets the value of the dimensionz property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setDimensionz(JAXBElement<BigDecimal> value) {
                        this.dimensionz = value;
                    }

                    /**
                     * Gets the value of the moistureContent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getMoistureContent() {
                        return moistureContent;
                    }

                    /**
                     * Sets the value of the moistureContent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setMoistureContent(JAXBElement<BigDecimal> value) {
                        this.moistureContent = value;
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
                     *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE240" minOccurs="0"/>
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
                        "lowerQualifier",
                        "upperQualifier",
                        "lowerValue",
                        "upperValue"
                    })
                    public static class Density
                        extends BasePhysicalQuantityRangeField
                    {

                        protected String unitCode;
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
                    public static class GrowthRate
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
                     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *       &lt;sequence>
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE80" minOccurs="0"/>
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
                    public static class WoodSpecies
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
             *                   &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                   &lt;element name="MeanTemp" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
             *                           &lt;sequence>
             *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A102" minOccurs="0"/>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
            public static class WaterSamples {

                protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry>();
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
                 *         &lt;element name="Ph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *         &lt;element name="MeanTemp" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A102" minOccurs="0"/>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
                    "ph",
                    "meanTemp"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElementRef(name = "Ph", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<BigDecimal> ph;
                    @XmlElement(name = "MeanTemp")
                    protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry.MeanTemp meanTemp;

                    /**
                     * Gets the value of the ph property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public JAXBElement<BigDecimal> getPh() {
                        return ph;
                    }

                    /**
                     * Sets the value of the ph property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                     *     
                     */
                    public void setPh(JAXBElement<BigDecimal> value) {
                        this.ph = value;
                    }

                    /**
                     * Gets the value of the meanTemp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry.MeanTemp }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry.MeanTemp getMeanTemp() {
                        return meanTemp;
                    }

                    /**
                     * Sets the value of the meanTemp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry.MeanTemp }
                     *     
                     */
                    public void setMeanTemp(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.TestSpecimensSet.WaterSamples.Entry.MeanTemp value) {
                        this.meanTemp = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                     *       &lt;sequence>
                     *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}A102" minOccurs="0"/>
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
                        "value"
                    })
                    public static class MeanTemp
                        extends BasePhysicalQuantityField
                    {

                        protected String unitCode;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *       &lt;sequence>
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE10" minOccurs="0"/>
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
        public static class TestWater
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SupplierPreserv" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
         *         &lt;element name="TypeFormulation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE30" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Preservative" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE40" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ActiveIngredients" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE50" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Composition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *         &lt;element name="Coformulants" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Retention" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE60" minOccurs="0"/>
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
            "supplierPreserv",
            "typeFormulation",
            "preservative",
            "activeIngredients",
            "composition",
            "coformulants",
            "retention"
        })
        public static class WoodPreservative {

            @XmlElement(name = "SupplierPreserv")
            protected String supplierPreserv;
            @XmlElement(name = "TypeFormulation")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.TypeFormulation typeFormulation;
            @XmlElement(name = "Preservative")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Preservative preservative;
            @XmlElement(name = "ActiveIngredients")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.ActiveIngredients activeIngredients;
            @XmlElementRef(name = "Composition", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> composition;
            @XmlElement(name = "Coformulants")
            protected List<MultilingualTextFieldLarge> coformulants;
            @XmlElement(name = "Retention")
            protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Retention retention;

            /**
             * Gets the value of the supplierPreserv property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSupplierPreserv() {
                return supplierPreserv;
            }

            /**
             * Sets the value of the supplierPreserv property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSupplierPreserv(String value) {
                this.supplierPreserv = value;
            }

            /**
             * Gets the value of the typeFormulation property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.TypeFormulation }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.TypeFormulation getTypeFormulation() {
                return typeFormulation;
            }

            /**
             * Sets the value of the typeFormulation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.TypeFormulation }
             *     
             */
            public void setTypeFormulation(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.TypeFormulation value) {
                this.typeFormulation = value;
            }

            /**
             * Gets the value of the preservative property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Preservative }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Preservative getPreservative() {
                return preservative;
            }

            /**
             * Sets the value of the preservative property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Preservative }
             *     
             */
            public void setPreservative(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Preservative value) {
                this.preservative = value;
            }

            /**
             * Gets the value of the activeIngredients property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.ActiveIngredients }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.ActiveIngredients getActiveIngredients() {
                return activeIngredients;
            }

            /**
             * Sets the value of the activeIngredients property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.ActiveIngredients }
             *     
             */
            public void setActiveIngredients(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.ActiveIngredients value) {
                this.activeIngredients = value;
            }

            /**
             * Gets the value of the composition property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getComposition() {
                return composition;
            }

            /**
             * Sets the value of the composition property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setComposition(JAXBElement<BigDecimal> value) {
                this.composition = value;
            }

            /**
             * Gets the value of the coformulants property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coformulants property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoformulants().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getCoformulants() {
                if (coformulants == null) {
                    coformulants = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.coformulants;
            }

            /**
             * Gets the value of the retention property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Retention }
             *     
             */
            public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Retention getRetention() {
                return retention;
            }

            /**
             * Sets the value of the retention property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Retention }
             *     
             */
            public void setRetention(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.MaterialsAndMethods.WoodPreservative.Retention value) {
                this.retention = value;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE50" minOccurs="0"/>
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
            public static class ActiveIngredients
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE40" minOccurs="0"/>
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
            public static class Preservative
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE60" minOccurs="0"/>
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
            public static class Retention
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE30" minOccurs="0"/>
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
            public static class TypeFormulation
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
     *         &lt;element name="KineticEvaluation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField" minOccurs="0"/>
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
        "attachedSanitisedDocsForPublication",
        "kineticEvaluation"
    })
    public static class OverallRemarksAttachments {

        @XmlElement(name = "RemarksOnResults")
        protected List<MultilingualTextField> remarksOnResults;
        @XmlElement(name = "AttachedBackgroundMaterial")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
        @XmlElement(name = "AttachedStudyReport")
        protected AttachmentListField attachedStudyReport;
        @XmlElement(name = "IllustrationPicGraph")
        protected String illustrationPicGraph;
        @XmlElement(name = "AttachedSanitisedDocsForPublication")
        protected AttachmentListField attachedSanitisedDocsForPublication;
        @XmlElement(name = "KineticEvaluation")
        protected AttachmentListField kineticEvaluation;

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
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
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
         * Gets the value of the kineticEvaluation property.
         * 
         * @return
         *     possible object is
         *     {@link AttachmentListField }
         *     
         */
        public AttachmentListField getKineticEvaluation() {
            return kineticEvaluation;
        }

        /**
         * Sets the value of the kineticEvaluation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttachmentListField }
         *     
         */
        public void setKineticEvaluation(AttachmentListField value) {
            this.kineticEvaluation = value;
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

            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
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
     *         &lt;element name="Retention" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="ReplicateNumber" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="Retention" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE260" minOccurs="0"/>
     *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="RetentionStddev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                             &lt;element name="RetentionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="Leaching" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Time" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C113" minOccurs="0"/>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ActiveIngredient" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="TypeOfSpecimen" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE270" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SpecimenNumber" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="EmissionRate" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE280" minOccurs="0"/>
     *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *         &lt;element name="ValidityCritFulfilled" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}F102" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="QualityCriteria" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
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
        "retention",
        "leaching",
        "validityCritFulfilled",
        "qualityCriteria",
        "anyOtherInformationOnResultsInclTables"
    })
    public static class ResultsAndDiscussion {

        @XmlElement(name = "Retention")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet retention;
        @XmlElement(name = "Leaching")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching leaching;
        @XmlElement(name = "ValidityCritFulfilled")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.ValidityCritFulfilled validityCritFulfilled;
        @XmlElement(name = "QualityCriteria")
        protected List<MultilingualTextFieldMultiLine> qualityCriteria;
        @XmlElement(name = "AnyOtherInformationOnResultsInclTables")
        protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

        /**
         * Gets the value of the retention property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet getRetention() {
            return retention;
        }

        /**
         * Sets the value of the retention property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet }
         *     
         */
        public void setRetention(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet value) {
            this.retention = value;
        }

        /**
         * Gets the value of the leaching property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching getLeaching() {
            return leaching;
        }

        /**
         * Sets the value of the leaching property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching }
         *     
         */
        public void setLeaching(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching value) {
            this.leaching = value;
        }

        /**
         * Gets the value of the validityCritFulfilled property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.ValidityCritFulfilled }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.ValidityCritFulfilled getValidityCritFulfilled() {
            return validityCritFulfilled;
        }

        /**
         * Sets the value of the validityCritFulfilled property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.ValidityCritFulfilled }
         *     
         */
        public void setValidityCritFulfilled(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.ValidityCritFulfilled value) {
            this.validityCritFulfilled = value;
        }

        /**
         * Gets the value of the qualityCriteria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the qualityCriteria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQualityCriteria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getQualityCriteria() {
            if (qualityCriteria == null) {
                qualityCriteria = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.qualityCriteria;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
            return anyOtherInformationOnResultsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public void setAnyOtherInformationOnResultsInclTables(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables value) {
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
         *                   &lt;element name="Time" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C113" minOccurs="0"/>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ActiveIngredient" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="TypeOfSpecimen" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE270" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SpecimenNumber" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="EmissionRate" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE280" minOccurs="0"/>
         *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
        public static class Leaching {

            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry>();
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
             *         &lt;element name="Time" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C113" minOccurs="0"/>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ActiveIngredient" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="TypeOfSpecimen" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE270" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SpecimenNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="EmissionRate" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE280" minOccurs="0"/>
             *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "time",
                "activeIngredient",
                "typeOfSpecimen",
                "specimenNumber",
                "emissionRate",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Time")
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.Time time;
                @XmlElement(name = "ActiveIngredient")
                protected List<MultilingualTextFieldLarge> activeIngredient;
                @XmlElement(name = "TypeOfSpecimen")
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.TypeOfSpecimen typeOfSpecimen;
                @XmlElementRef(name = "SpecimenNumber", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<BigInteger> specimenNumber;
                @XmlElement(name = "EmissionRate")
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.EmissionRate emissionRate;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldLarge> remarks;

                /**
                 * Gets the value of the time property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.Time }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.Time getTime() {
                    return time;
                }

                /**
                 * Sets the value of the time property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.Time }
                 *     
                 */
                public void setTime(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.Time value) {
                    this.time = value;
                }

                /**
                 * Gets the value of the activeIngredient property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the activeIngredient property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getActiveIngredient().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldLarge }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldLarge> getActiveIngredient() {
                    if (activeIngredient == null) {
                        activeIngredient = new ArrayList<MultilingualTextFieldLarge>();
                    }
                    return this.activeIngredient;
                }

                /**
                 * Gets the value of the typeOfSpecimen property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.TypeOfSpecimen }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.TypeOfSpecimen getTypeOfSpecimen() {
                    return typeOfSpecimen;
                }

                /**
                 * Sets the value of the typeOfSpecimen property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.TypeOfSpecimen }
                 *     
                 */
                public void setTypeOfSpecimen(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.TypeOfSpecimen value) {
                    this.typeOfSpecimen = value;
                }

                /**
                 * Gets the value of the specimenNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 *     
                 */
                public JAXBElement<BigInteger> getSpecimenNumber() {
                    return specimenNumber;
                }

                /**
                 * Sets the value of the specimenNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 *     
                 */
                public void setSpecimenNumber(JAXBElement<BigInteger> value) {
                    this.specimenNumber = value;
                }

                /**
                 * Gets the value of the emissionRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.EmissionRate }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.EmissionRate getEmissionRate() {
                    return emissionRate;
                }

                /**
                 * Sets the value of the emissionRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.EmissionRate }
                 *     
                 */
                public void setEmissionRate(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.Leaching.Entry.EmissionRate value) {
                    this.emissionRate = value;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE280" minOccurs="0"/>
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
                    "lowerQualifier",
                    "upperQualifier",
                    "lowerValue",
                    "upperValue"
                })
                public static class EmissionRate
                    extends BasePhysicalQuantityRangeField
                {

                    protected String unitCode;
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C113" minOccurs="0"/>
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
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
                    "value"
                })
                public static class Time
                    extends BasePhysicalQuantityField
                {

                    protected String unitCode;
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE270" minOccurs="0"/>
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
                public static class TypeOfSpecimen
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="ReplicateNumber" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="Retention" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE260" minOccurs="0"/>
         *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="RetentionStddev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                   &lt;element name="RetentionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        public static class RetentionSet {

            protected List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry>();
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
             *         &lt;element name="ReplicateNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="Retention" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE260" minOccurs="0"/>
             *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="RetentionStddev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *         &lt;element name="RetentionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
                "replicateNumber",
                "retention",
                "retentionStddev",
                "retentionRemarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElementRef(name = "ReplicateNumber", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<BigInteger> replicateNumber;
                @XmlElement(name = "Retention")
                protected ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry.Retention retention;
                @XmlElementRef(name = "RetentionStddev", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-EmissionsFromPreservativeTreatedWood/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> retentionStddev;
                @XmlElement(name = "RetentionRemarks")
                protected List<MultilingualTextFieldLarge> retentionRemarks;

                /**
                 * Gets the value of the replicateNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 *     
                 */
                public JAXBElement<BigInteger> getReplicateNumber() {
                    return replicateNumber;
                }

                /**
                 * Sets the value of the replicateNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 *     
                 */
                public void setReplicateNumber(JAXBElement<BigInteger> value) {
                    this.replicateNumber = value;
                }

                /**
                 * Gets the value of the retention property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry.Retention }
                 *     
                 */
                public ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry.Retention getRetention() {
                    return retention;
                }

                /**
                 * Sets the value of the retention property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry.Retention }
                 *     
                 */
                public void setRetention(ENDPOINTSTUDYRECORDEmissionsFromPreservativeTreatedWood.ResultsAndDiscussion.RetentionSet.Entry.Retention value) {
                    this.retention = value;
                }

                /**
                 * Gets the value of the retentionStddev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *     
                 */
                public JAXBElement<BigDecimal> getRetentionStddev() {
                    return retentionStddev;
                }

                /**
                 * Sets the value of the retentionStddev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *     
                 */
                public void setRetentionStddev(JAXBElement<BigDecimal> value) {
                    this.retentionStddev = value;
                }

                /**
                 * Gets the value of the retentionRemarks property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the retentionRemarks property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRetentionRemarks().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldLarge }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldLarge> getRetentionRemarks() {
                    if (retentionRemarks == null) {
                        retentionRemarks = new ArrayList<MultilingualTextFieldLarge>();
                    }
                    return this.retentionRemarks;
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
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}OE260" minOccurs="0"/>
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
                    "lowerQualifier",
                    "upperQualifier",
                    "lowerValue",
                    "upperValue"
                })
                public static class Retention
                    extends BasePhysicalQuantityRangeField
                {

                    protected String unitCode;
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}F102" minOccurs="0"/>
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
        public static class ValidityCritFulfilled
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
