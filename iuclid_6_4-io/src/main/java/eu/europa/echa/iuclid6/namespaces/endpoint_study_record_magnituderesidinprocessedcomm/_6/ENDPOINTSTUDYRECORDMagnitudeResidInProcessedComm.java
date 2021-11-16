
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_magnituderesidinprocessedcomm._6;

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
import javax.xml.datatype.XMLGregorianCalendar;
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
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60493" minOccurs="0"/>
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
 *                   &lt;element name="ProductType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C111_2" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60495" minOccurs="0"/>
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
 *                   &lt;element name="StudyDesign" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BulkRawAgriculturalCommodity" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60560" minOccurs="0"/>
 *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DetailsOnTestCommodity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="SampleProcessing" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="FurtherDetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SamplingAndAnalyticalMethodology" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetailsOnSampleCollection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DetailsOnSampleHandlingAndPreparation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DetailsOnAnalyticalMethodology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="StorageStabilityOfResiduesSampleIntegrity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ResiduesInRACPriorToProcessing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BulkRACSubSampleSampleNo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DateOfSubSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                 &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="AnalyteMeasured" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                                                                     &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                                     &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                                     &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="CorrectionByStorageStability" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                                     &lt;element name="CorrectionByRecovery" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="ResidueLevelMeasured" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelCalculated" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/extension>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
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
 *                   &lt;element name="ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProcessingInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ProcessedFraction" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ProcessedFractionPFSample" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60497" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/extension>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="PFSampleNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                 &lt;element name="DateOfProcessing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                 &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="AnalyteMeasured" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                                                                     &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                                     &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                                     &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="CorrectionByStorageStability" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                                     &lt;element name="CorrectionByRecovery" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="ResidueLevelMeasured" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelCalculated" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/extension>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
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
 *                             &lt;element name="AspiratedGrainFractionsAGFSample" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AGFAnalysisSample" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="DateOfAGFSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                 &lt;element name="AnalyteMeasured" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                                                                     &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                                     &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                                                                     &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                                     &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="CorrectionByStorageStability" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                                                     &lt;element name="CorrectionByRecovery" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelMeasured" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelCalculated" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
 *                                                                               &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                                                                               &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/extension>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/extension>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
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
 *                             &lt;element name="DistributionOfResidues" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.MagnitudeResidInProcessedComm")
public class ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm {

    @XmlElement(name = "AdministrativeData")
    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource")
    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods")
    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "ResultsAndDiscussion")
    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion resultsAndDiscussion;
    @XmlElement(name = "OverallRemarksAttachments")
    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion")
    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the resultsAndDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion }
     *     
     */
    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion getResultsAndDiscussion() {
        return resultsAndDiscussion;
    }

    /**
     * Sets the value of the resultsAndDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion }
     *     
     */
    public void setResultsAndDiscussion(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion value) {
        this.resultsAndDiscussion = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ApplicantSummaryAndConclusion value) {
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
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60493" minOccurs="0"/>
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
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection dataProtection;
        @XmlElement(name = "Endpoint")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Endpoint endpoint;
        @XmlElement(name = "StudyResultType")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.StudyResultType studyResultType;
        @XmlElement(name = "PurposeFlag")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.PurposeFlag purposeFlag;
        @XmlElementRef(name = "RobustStudy", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> robustStudy;
        @XmlElementRef(name = "UsedForClassification", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForClassification;
        @XmlElementRef(name = "UsedForMSDS", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForMSDS;
        @XmlElement(name = "StudyPeriod")
        protected List<MultilingualTextFieldSmall> studyPeriod;
        @XmlElement(name = "Reliability")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Reliability reliability;
        @XmlElement(name = "RationalReliability")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.RationalReliability rationalReliability;
        @XmlElement(name = "DataWaiving")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaiving dataWaiving;
        @XmlElement(name = "DataWaivingJustification")
        protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaivingJustification> dataWaivingJustification;
        @XmlElement(name = "JustificationForTypeOfInformation")
        protected List<MultilingualTextFieldLarge> justificationForTypeOfInformation;
        @XmlElement(name = "AttachedJustification")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference crossReference;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection }
         *     
         */
        public void setDataProtection(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Endpoint }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Endpoint getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Endpoint }
         *     
         */
        public void setEndpoint(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Endpoint value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.StudyResultType }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.StudyResultType getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.StudyResultType }
         *     
         */
        public void setStudyResultType(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.StudyResultType value) {
            this.studyResultType = value;
        }

        /**
         * Gets the value of the purposeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.PurposeFlag }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.PurposeFlag getPurposeFlag() {
            return purposeFlag;
        }

        /**
         * Sets the value of the purposeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.PurposeFlag }
         *     
         */
        public void setPurposeFlag(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.PurposeFlag value) {
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
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Reliability }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Reliability getReliability() {
            return reliability;
        }

        /**
         * Sets the value of the reliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Reliability }
         *     
         */
        public void setReliability(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.Reliability value) {
            this.reliability = value;
        }

        /**
         * Gets the value of the rationalReliability property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.RationalReliability }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.RationalReliability getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.RationalReliability }
         *     
         */
        public void setRationalReliability(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.RationalReliability value) {
            this.rationalReliability = value;
        }

        /**
         * Gets the value of the dataWaiving property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaiving }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaiving getDataWaiving() {
            return dataWaiving;
        }

        /**
         * Sets the value of the dataWaiving property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaiving }
         *     
         */
        public void setDataWaiving(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaiving value) {
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
         * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaivingJustification }
         * 
         * 
         */
        public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaivingJustification> getDataWaivingJustification() {
            if (dataWaivingJustification == null) {
                dataWaivingJustification = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataWaivingJustification>();
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
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference value) {
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

            protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry>();
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
                protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry.ReasonPurpose reasonPurpose;

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
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.AttachedJustification.Entry.ReasonPurpose value) {
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

            protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry>();
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
                protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry.ReasonPurpose reasonPurpose;
                @XmlElement(name = "RelatedInformation")
                protected String relatedInformation;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldLarge> remarks;

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.CrossReference.Entry.ReasonPurpose value) {
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
            protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection.Legislation> legislation;

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
             * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection.Legislation }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.AdministrativeData.DataProtection.Legislation>();
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60493" minOccurs="0"/>
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
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataAccess dataAccess;
        @XmlElement(name = "DataProtectionClaimed")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataProtectionClaimed dataProtectionClaimed;

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
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataAccess }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataAccess getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataAccess }
         *     
         */
        public void setDataAccess(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataAccess value) {
            this.dataAccess = value;
        }

        /**
         * Gets the value of the dataProtectionClaimed property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataProtectionClaimed }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataProtectionClaimed getDataProtectionClaimed() {
            return dataProtectionClaimed;
        }

        /**
         * Sets the value of the dataProtectionClaimed property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataProtectionClaimed }
         *     
         */
        public void setDataProtectionClaimed(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.DataSource.DataProtectionClaimed value) {
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
     *         &lt;element name="ProductType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C111_2" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60495" minOccurs="0"/>
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
     *         &lt;element name="StudyDesign" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BulkRawAgriculturalCommodity" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60560" minOccurs="0"/>
     *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DetailsOnTestCommodity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="SampleProcessing" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="FurtherDetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SamplingAndAnalyticalMethodology" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetailsOnSampleCollection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DetailsOnSampleHandlingAndPreparation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DetailsOnAnalyticalMethodology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "productType",
        "guideline",
        "methodNoGuideline",
        "glpComplianceStatement",
        "testMaterials",
        "studyDesign",
        "samplingAndAnalyticalMethodology",
        "anyOtherInformationOnMaterialsAndMethodsInclTables"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "ProductType")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.ProductType productType;
        @XmlElement(name = "Guideline")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines guideline;
        @XmlElement(name = "MethodNoGuideline")
        protected List<MultilingualTextFieldLarge> methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.GLPComplianceStatement glpComplianceStatement;
        @XmlElement(name = "TestMaterials")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.TestMaterials testMaterials;
        @XmlElement(name = "StudyDesign")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign studyDesign;
        @XmlElement(name = "SamplingAndAnalyticalMethodology")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.SamplingAndAnalyticalMethodology samplingAndAnalyticalMethodology;
        @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

        /**
         * Gets the value of the productType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.ProductType }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.ProductType getProductType() {
            return productType;
        }

        /**
         * Sets the value of the productType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.ProductType }
         *     
         */
        public void setProductType(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.ProductType value) {
            this.productType = value;
        }

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines value) {
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
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.GLPComplianceStatement getGLPComplianceStatement() {
            return glpComplianceStatement;
        }

        /**
         * Sets the value of the glpComplianceStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public void setGLPComplianceStatement(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.GLPComplianceStatement value) {
            this.glpComplianceStatement = value;
        }

        /**
         * Gets the value of the testMaterials property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.TestMaterials }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.TestMaterials getTestMaterials() {
            return testMaterials;
        }

        /**
         * Sets the value of the testMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.TestMaterials }
         *     
         */
        public void setTestMaterials(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.TestMaterials value) {
            this.testMaterials = value;
        }

        /**
         * Gets the value of the studyDesign property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign getStudyDesign() {
            return studyDesign;
        }

        /**
         * Sets the value of the studyDesign property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign }
         *     
         */
        public void setStudyDesign(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign value) {
            this.studyDesign = value;
        }

        /**
         * Gets the value of the samplingAndAnalyticalMethodology property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.SamplingAndAnalyticalMethodology }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.SamplingAndAnalyticalMethodology getSamplingAndAnalyticalMethodology() {
            return samplingAndAnalyticalMethodology;
        }

        /**
         * Sets the value of the samplingAndAnalyticalMethodology property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.SamplingAndAnalyticalMethodology }
         *     
         */
        public void setSamplingAndAnalyticalMethodology(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.SamplingAndAnalyticalMethodology value) {
            this.samplingAndAnalyticalMethodology = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
            return anyOtherInformationOnMaterialsAndMethodsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
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
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60495" minOccurs="0"/>
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

            protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry>();
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
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60495" minOccurs="0"/>
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
                protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Qualifier qualifier;
                @XmlElement(name = "Guideline")
                protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Guideline guideline;
                @XmlElement(name = "VersionRemarks")
                protected List<MultilingualTextFieldMultiLine> versionRemarks;
                @XmlElement(name = "Deviation")
                protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Deviation deviation;

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Qualifier getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public void setQualifier(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Qualifier value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the guideline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Guideline getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public void setGuideline(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Guideline value) {
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
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Deviation getDeviation() {
                    return deviation;
                }

                /**
                 * Sets the value of the deviation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public void setDeviation(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.Guidelines.Entry.Deviation value) {
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60495" minOccurs="0"/>
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}C111_2" minOccurs="0"/>
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
        public static class ProductType
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
         *         &lt;element name="DetailsOnSampleCollection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DetailsOnSampleHandlingAndPreparation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DetailsOnAnalyticalMethodology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "detailsOnSampleCollection",
            "detailsOnSampleHandlingAndPreparation",
            "detailsOnAnalyticalMethodology"
        })
        public static class SamplingAndAnalyticalMethodology {

            @XmlElement(name = "DetailsOnSampleCollection")
            protected List<MultilingualTextFieldLarge> detailsOnSampleCollection;
            @XmlElement(name = "DetailsOnSampleHandlingAndPreparation")
            protected List<MultilingualTextFieldLarge> detailsOnSampleHandlingAndPreparation;
            @XmlElement(name = "DetailsOnAnalyticalMethodology")
            protected List<MultilingualTextFieldLarge> detailsOnAnalyticalMethodology;

            /**
             * Gets the value of the detailsOnSampleCollection property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailsOnSampleCollection property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailsOnSampleCollection().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDetailsOnSampleCollection() {
                if (detailsOnSampleCollection == null) {
                    detailsOnSampleCollection = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.detailsOnSampleCollection;
            }

            /**
             * Gets the value of the detailsOnSampleHandlingAndPreparation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailsOnSampleHandlingAndPreparation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailsOnSampleHandlingAndPreparation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDetailsOnSampleHandlingAndPreparation() {
                if (detailsOnSampleHandlingAndPreparation == null) {
                    detailsOnSampleHandlingAndPreparation = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.detailsOnSampleHandlingAndPreparation;
            }

            /**
             * Gets the value of the detailsOnAnalyticalMethodology property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailsOnAnalyticalMethodology property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailsOnAnalyticalMethodology().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDetailsOnAnalyticalMethodology() {
                if (detailsOnAnalyticalMethodology == null) {
                    detailsOnAnalyticalMethodology = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.detailsOnAnalyticalMethodology;
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
         *         &lt;element name="BulkRawAgriculturalCommodity" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60560" minOccurs="0"/>
         *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DetailsOnTestCommodity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="SampleProcessing" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="FurtherDetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "bulkRawAgriculturalCommodity",
            "detailsOnTestCommodity",
            "sampleProcessing",
            "furtherDetailsOnStudyDesign"
        })
        public static class StudyDesign {

            @XmlElement(name = "BulkRawAgriculturalCommodity")
            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign.BulkRawAgriculturalCommodity bulkRawAgriculturalCommodity;
            @XmlElement(name = "DetailsOnTestCommodity")
            protected List<MultilingualTextFieldLarge> detailsOnTestCommodity;
            @XmlElement(name = "SampleProcessing")
            protected List<MultilingualTextFieldLarge> sampleProcessing;
            @XmlElement(name = "FurtherDetailsOnStudyDesign")
            protected List<MultilingualTextFieldLarge> furtherDetailsOnStudyDesign;

            /**
             * Gets the value of the bulkRawAgriculturalCommodity property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign.BulkRawAgriculturalCommodity }
             *     
             */
            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign.BulkRawAgriculturalCommodity getBulkRawAgriculturalCommodity() {
                return bulkRawAgriculturalCommodity;
            }

            /**
             * Sets the value of the bulkRawAgriculturalCommodity property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign.BulkRawAgriculturalCommodity }
             *     
             */
            public void setBulkRawAgriculturalCommodity(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.MaterialsAndMethods.StudyDesign.BulkRawAgriculturalCommodity value) {
                this.bulkRawAgriculturalCommodity = value;
            }

            /**
             * Gets the value of the detailsOnTestCommodity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detailsOnTestCommodity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetailsOnTestCommodity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDetailsOnTestCommodity() {
                if (detailsOnTestCommodity == null) {
                    detailsOnTestCommodity = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.detailsOnTestCommodity;
            }

            /**
             * Gets the value of the sampleProcessing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the sampleProcessing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSampleProcessing().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getSampleProcessing() {
                if (sampleProcessing == null) {
                    sampleProcessing = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.sampleProcessing;
            }

            /**
             * Gets the value of the furtherDetailsOnStudyDesign property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the furtherDetailsOnStudyDesign property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFurtherDetailsOnStudyDesign().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getFurtherDetailsOnStudyDesign() {
                if (furtherDetailsOnStudyDesign == null) {
                    furtherDetailsOnStudyDesign = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.furtherDetailsOnStudyDesign;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60560" minOccurs="0"/>
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
            public static class BulkRawAgriculturalCommodity
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
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
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
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
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

            protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
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
     *         &lt;element name="StorageStabilityOfResiduesSampleIntegrity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ResiduesInRACPriorToProcessing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BulkRACSubSampleSampleNo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DateOfSubSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                       &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="AnalyteMeasured" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                                                           &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                                           &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                                           &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="CorrectionByStorageStability" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                                           &lt;element name="CorrectionByRecovery" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="ResidueLevelMeasured" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelCalculated" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/extension>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
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
     *         &lt;element name="ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProcessingInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ProcessedFraction" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProcessedFractionPFSample" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60497" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/extension>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="PFSampleNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                       &lt;element name="DateOfProcessing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                       &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="AnalyteMeasured" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                                                           &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                                           &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                                           &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="CorrectionByStorageStability" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                                           &lt;element name="CorrectionByRecovery" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="ResidueLevelMeasured" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelCalculated" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/extension>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
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
     *                   &lt;element name="AspiratedGrainFractionsAGFSample" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AGFAnalysisSample" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="DateOfAGFSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                       &lt;element name="AnalyteMeasured" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                                                           &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                           &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *                                                           &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                                           &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="CorrectionByStorageStability" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                                                           &lt;element name="CorrectionByRecovery" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelMeasured" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelCalculated" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
     *                                                                     &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                                                                     &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/extension>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/extension>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
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
     *                   &lt;element name="DistributionOfResidues" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "storageStabilityOfResiduesSampleIntegrity",
        "residuesInRACPriorToProcessing",
        "residuesInProcessedFractionsPFAndAspiratedGrainFractionsAGF",
        "anyOtherInformationOnResultsInclTables"
    })
    public static class ResultsAndDiscussion {

        @XmlElement(name = "StorageStabilityOfResiduesSampleIntegrity")
        protected List<MultilingualTextFieldLarge> storageStabilityOfResiduesSampleIntegrity;
        @XmlElement(name = "ResiduesInRACPriorToProcessing")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing residuesInRACPriorToProcessing;
        @XmlElement(name = "ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF residuesInProcessedFractionsPFAndAspiratedGrainFractionsAGF;
        @XmlElement(name = "AnyOtherInformationOnResultsInclTables")
        protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

        /**
         * Gets the value of the storageStabilityOfResiduesSampleIntegrity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the storageStabilityOfResiduesSampleIntegrity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStorageStabilityOfResiduesSampleIntegrity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getStorageStabilityOfResiduesSampleIntegrity() {
            if (storageStabilityOfResiduesSampleIntegrity == null) {
                storageStabilityOfResiduesSampleIntegrity = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.storageStabilityOfResiduesSampleIntegrity;
        }

        /**
         * Gets the value of the residuesInRACPriorToProcessing property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing getResiduesInRACPriorToProcessing() {
            return residuesInRACPriorToProcessing;
        }

        /**
         * Sets the value of the residuesInRACPriorToProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing }
         *     
         */
        public void setResiduesInRACPriorToProcessing(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing value) {
            this.residuesInRACPriorToProcessing = value;
        }

        /**
         * Gets the value of the residuesInProcessedFractionsPFAndAspiratedGrainFractionsAGF property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF getResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF() {
            return residuesInProcessedFractionsPFAndAspiratedGrainFractionsAGF;
        }

        /**
         * Sets the value of the residuesInProcessedFractionsPFAndAspiratedGrainFractionsAGF property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF }
         *     
         */
        public void setResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF value) {
            this.residuesInProcessedFractionsPFAndAspiratedGrainFractionsAGF = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
            return anyOtherInformationOnResultsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public void setAnyOtherInformationOnResultsInclTables(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables value) {
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
         *         &lt;element name="ProcessingInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ProcessedFraction" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ProcessedFractionPFSample" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60497" minOccurs="0"/>
         *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/extension>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="PFSampleNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                             &lt;element name="DateOfProcessing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                             &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="AnalyteMeasured" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *                                                 &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                                                 &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                                                 &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="CorrectionByStorageStability" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                                                 &lt;element name="CorrectionByRecovery" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="ResidueLevelMeasured" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelCalculated" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AspiratedGrainFractionsAGFSample" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="AGFAnalysisSample" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="DateOfAGFSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                             &lt;element name="AnalyteMeasured" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *                                                 &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                                                 &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                                                 &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="CorrectionByStorageStability" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                                                 &lt;element name="CorrectionByRecovery" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelMeasured" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelCalculated" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DistributionOfResidues" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "processingInformation",
            "processedFraction",
            "aspiratedGrainFractionsAGFSample",
            "distributionOfResidues"
        })
        public static class ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF {

            @XmlElement(name = "ProcessingInformation")
            protected List<MultilingualTextFieldMultiLine> processingInformation;
            @XmlElement(name = "ProcessedFraction")
            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction processedFraction;
            @XmlElement(name = "AspiratedGrainFractionsAGFSample")
            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample aspiratedGrainFractionsAGFSample;
            @XmlElement(name = "DistributionOfResidues")
            protected List<MultilingualTextFieldLarge> distributionOfResidues;

            /**
             * Gets the value of the processingInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the processingInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProcessingInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getProcessingInformation() {
                if (processingInformation == null) {
                    processingInformation = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.processingInformation;
            }

            /**
             * Gets the value of the processedFraction property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction }
             *     
             */
            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction getProcessedFraction() {
                return processedFraction;
            }

            /**
             * Sets the value of the processedFraction property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction }
             *     
             */
            public void setProcessedFraction(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction value) {
                this.processedFraction = value;
            }

            /**
             * Gets the value of the aspiratedGrainFractionsAGFSample property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample }
             *     
             */
            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample getAspiratedGrainFractionsAGFSample() {
                return aspiratedGrainFractionsAGFSample;
            }

            /**
             * Sets the value of the aspiratedGrainFractionsAGFSample property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample }
             *     
             */
            public void setAspiratedGrainFractionsAGFSample(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample value) {
                this.aspiratedGrainFractionsAGFSample = value;
            }

            /**
             * Gets the value of the distributionOfResidues property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the distributionOfResidues property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDistributionOfResidues().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getDistributionOfResidues() {
                if (distributionOfResidues == null) {
                    distributionOfResidues = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.distributionOfResidues;
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
             *                   &lt;element name="AGFAnalysisSample" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="DateOfAGFSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                   &lt;element name="AnalyteMeasured" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *                                     &lt;sequence>
             *                                       &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
             *                                       &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                                       &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                                       &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="CorrectionByStorageStability" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                                       &lt;element name="CorrectionByRecovery" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelMeasured" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelCalculated" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            public static class AspiratedGrainFractionsAGFSample {

                protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2> entry;

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
                 * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2>();
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
                 *         &lt;element name="AGFAnalysisSample" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="DateOfAGFSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *         &lt;element name="AnalyteMeasured" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
                 *                           &lt;sequence>
                 *                             &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                 *                             &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *                             &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *                             &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="CorrectionByStorageStability" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *                             &lt;element name="CorrectionByRecovery" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelMeasured" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelCalculated" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "agfAnalysisSample",
                    "dateOfAGFSample",
                    "analysisSampleID",
                    "analyteMeasured"
                })
                public static class EntrySet2
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "AGFAnalysisSample")
                    protected List<MultilingualTextFieldSmall> agfAnalysisSample;
                    @XmlElementRef(name = "DateOfAGFSample", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> dateOfAGFSample;
                    @XmlElement(name = "AnalysisSampleID")
                    protected String analysisSampleID;
                    @XmlElement(name = "AnalyteMeasured")
                    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured analyteMeasured;

                    /**
                     * Gets the value of the agfAnalysisSample property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the agfAnalysisSample property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAGFAnalysisSample().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getAGFAnalysisSample() {
                        if (agfAnalysisSample == null) {
                            agfAnalysisSample = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.agfAnalysisSample;
                    }

                    /**
                     * Gets the value of the dateOfAGFSample property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getDateOfAGFSample() {
                        return dateOfAGFSample;
                    }

                    /**
                     * Sets the value of the dateOfAGFSample property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setDateOfAGFSample(JAXBElement<XMLGregorianCalendar> value) {
                        this.dateOfAGFSample = value;
                    }

                    /**
                     * Gets the value of the analysisSampleID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnalysisSampleID() {
                        return analysisSampleID;
                    }

                    /**
                     * Sets the value of the analysisSampleID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnalysisSampleID(String value) {
                        this.analysisSampleID = value;
                    }

                    /**
                     * Gets the value of the analyteMeasured property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured getAnalyteMeasured() {
                        return analyteMeasured;
                    }

                    /**
                     * Sets the value of the analyteMeasured property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured }
                     *     
                     */
                    public void setAnalyteMeasured(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured value) {
                        this.analyteMeasured = value;
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
                     *                   &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                     *                   &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                     *                   &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                     *                   &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="CorrectionByStorageStability" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                     *                   &lt;element name="CorrectionByRecovery" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelMeasured" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelCalculated" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    public static class AnalyteMeasured {

                        protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry> entry;

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
                         * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry }
                         * 
                         * 
                         */
                        public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry> getEntry() {
                            if (entry == null) {
                                entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry>();
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
                         *         &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                         *         &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                         *         &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                         *         &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="CorrectionByStorageStability" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                         *         &lt;element name="CorrectionByRecovery" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelMeasured" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelCalculated" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                            "analyteIdentity",
                            "extractionDate",
                            "analysisDate",
                            "methodID",
                            "storageStabilityFactor",
                            "useOfFactor",
                            "correctionByStorageStability",
                            "recovery",
                            "correctionByRecovery",
                            "residueLevelMeasured",
                            "residueLevelCalculated",
                            "residueLevelCalculatedAndCorrected"
                        })
                        public static class Entry
                            extends RepeatableEntryType
                        {

                            @XmlElement(name = "AnalyteIdentity")
                            protected String analyteIdentity;
                            @XmlElementRef(name = "ExtractionDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<XMLGregorianCalendar> extractionDate;
                            @XmlElementRef(name = "AnalysisDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<XMLGregorianCalendar> analysisDate;
                            @XmlElement(name = "MethodID")
                            protected String methodID;
                            @XmlElementRef(name = "StorageStabilityFactor", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<BigDecimal> storageStabilityFactor;
                            @XmlElement(name = "UseOfFactor")
                            protected List<MultilingualTextFieldSmall> useOfFactor;
                            @XmlElement(name = "CorrectionByStorageStability")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByStorageStability correctionByStorageStability;
                            @XmlElementRef(name = "Recovery", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<BigDecimal> recovery;
                            @XmlElement(name = "CorrectionByRecovery")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByRecovery correctionByRecovery;
                            @XmlElement(name = "ResidueLevelMeasured")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelMeasured residueLevelMeasured;
                            @XmlElement(name = "ResidueLevelCalculated")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculated residueLevelCalculated;
                            @XmlElement(name = "ResidueLevelCalculatedAndCorrected")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected residueLevelCalculatedAndCorrected;

                            /**
                             * Gets the value of the analyteIdentity property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAnalyteIdentity() {
                                return analyteIdentity;
                            }

                            /**
                             * Sets the value of the analyteIdentity property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAnalyteIdentity(String value) {
                                this.analyteIdentity = value;
                            }

                            /**
                             * Gets the value of the extractionDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public JAXBElement<XMLGregorianCalendar> getExtractionDate() {
                                return extractionDate;
                            }

                            /**
                             * Sets the value of the extractionDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public void setExtractionDate(JAXBElement<XMLGregorianCalendar> value) {
                                this.extractionDate = value;
                            }

                            /**
                             * Gets the value of the analysisDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public JAXBElement<XMLGregorianCalendar> getAnalysisDate() {
                                return analysisDate;
                            }

                            /**
                             * Sets the value of the analysisDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public void setAnalysisDate(JAXBElement<XMLGregorianCalendar> value) {
                                this.analysisDate = value;
                            }

                            /**
                             * Gets the value of the methodID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMethodID() {
                                return methodID;
                            }

                            /**
                             * Sets the value of the methodID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMethodID(String value) {
                                this.methodID = value;
                            }

                            /**
                             * Gets the value of the storageStabilityFactor property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public JAXBElement<BigDecimal> getStorageStabilityFactor() {
                                return storageStabilityFactor;
                            }

                            /**
                             * Sets the value of the storageStabilityFactor property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public void setStorageStabilityFactor(JAXBElement<BigDecimal> value) {
                                this.storageStabilityFactor = value;
                            }

                            /**
                             * Gets the value of the useOfFactor property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the useOfFactor property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getUseOfFactor().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link MultilingualTextFieldSmall }
                             * 
                             * 
                             */
                            public List<MultilingualTextFieldSmall> getUseOfFactor() {
                                if (useOfFactor == null) {
                                    useOfFactor = new ArrayList<MultilingualTextFieldSmall>();
                                }
                                return this.useOfFactor;
                            }

                            /**
                             * Gets the value of the correctionByStorageStability property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByStorageStability }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByStorageStability getCorrectionByStorageStability() {
                                return correctionByStorageStability;
                            }

                            /**
                             * Sets the value of the correctionByStorageStability property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByStorageStability }
                             *     
                             */
                            public void setCorrectionByStorageStability(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByStorageStability value) {
                                this.correctionByStorageStability = value;
                            }

                            /**
                             * Gets the value of the recovery property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public JAXBElement<BigDecimal> getRecovery() {
                                return recovery;
                            }

                            /**
                             * Sets the value of the recovery property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public void setRecovery(JAXBElement<BigDecimal> value) {
                                this.recovery = value;
                            }

                            /**
                             * Gets the value of the correctionByRecovery property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByRecovery }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByRecovery getCorrectionByRecovery() {
                                return correctionByRecovery;
                            }

                            /**
                             * Sets the value of the correctionByRecovery property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByRecovery }
                             *     
                             */
                            public void setCorrectionByRecovery(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.CorrectionByRecovery value) {
                                this.correctionByRecovery = value;
                            }

                            /**
                             * Gets the value of the residueLevelMeasured property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelMeasured }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelMeasured getResidueLevelMeasured() {
                                return residueLevelMeasured;
                            }

                            /**
                             * Sets the value of the residueLevelMeasured property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelMeasured }
                             *     
                             */
                            public void setResidueLevelMeasured(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelMeasured value) {
                                this.residueLevelMeasured = value;
                            }

                            /**
                             * Gets the value of the residueLevelCalculated property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculated }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculated getResidueLevelCalculated() {
                                return residueLevelCalculated;
                            }

                            /**
                             * Sets the value of the residueLevelCalculated property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculated }
                             *     
                             */
                            public void setResidueLevelCalculated(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculated value) {
                                this.residueLevelCalculated = value;
                            }

                            /**
                             * Gets the value of the residueLevelCalculatedAndCorrected property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected getResidueLevelCalculatedAndCorrected() {
                                return residueLevelCalculatedAndCorrected;
                            }

                            /**
                             * Sets the value of the residueLevelCalculatedAndCorrected property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected }
                             *     
                             */
                            public void setResidueLevelCalculatedAndCorrected(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.AspiratedGrainFractionsAGFSample.EntrySet2 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected value) {
                                this.residueLevelCalculatedAndCorrected = value;
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
                             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
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
                            public static class CorrectionByRecovery
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
                             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
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
                            public static class CorrectionByStorageStability
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
                             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                             *       &lt;sequence>
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelCalculated
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
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelCalculatedAndCorrected
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
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelMeasured
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
             *                   &lt;element name="ProcessedFractionPFSample" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60497" minOccurs="0"/>
             *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/extension>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="PFSampleNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                   &lt;element name="DateOfProcessing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                   &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="AnalyteMeasured" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *                                     &lt;sequence>
             *                                       &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
             *                                       &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                                       &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                                       &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="CorrectionByStorageStability" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                                       &lt;element name="CorrectionByRecovery" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="ResidueLevelMeasured" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelCalculated" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            public static class ProcessedFraction {

                protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1> entry;

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
                 * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1>();
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
                 *         &lt;element name="ProcessedFractionPFSample" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60497" minOccurs="0"/>
                 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/extension>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PFSampleNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *         &lt;element name="DateOfProcessing" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *         &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="AnalyteMeasured" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
                 *                           &lt;sequence>
                 *                             &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                 *                             &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *                             &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *                             &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="CorrectionByStorageStability" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *                             &lt;element name="CorrectionByRecovery" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="ResidueLevelMeasured" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelCalculated" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "processedFractionPFSample",
                    "pfSampleNo",
                    "dateOfProcessing",
                    "analysisSampleID",
                    "analysisSampleDescription",
                    "analyteMeasured"
                })
                public static class EntrySet1
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ProcessedFractionPFSample")
                    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .ProcessedFractionPFSample processedFractionPFSample;
                    @XmlElement(name = "PFSampleNo")
                    protected String pfSampleNo;
                    @XmlElementRef(name = "DateOfProcessing", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> dateOfProcessing;
                    @XmlElement(name = "AnalysisSampleID")
                    protected String analysisSampleID;
                    @XmlElement(name = "AnalysisSampleDescription")
                    protected List<MultilingualTextFieldSmall> analysisSampleDescription;
                    @XmlElement(name = "AnalyteMeasured")
                    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured analyteMeasured;

                    /**
                     * Gets the value of the processedFractionPFSample property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .ProcessedFractionPFSample }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .ProcessedFractionPFSample getProcessedFractionPFSample() {
                        return processedFractionPFSample;
                    }

                    /**
                     * Sets the value of the processedFractionPFSample property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .ProcessedFractionPFSample }
                     *     
                     */
                    public void setProcessedFractionPFSample(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .ProcessedFractionPFSample value) {
                        this.processedFractionPFSample = value;
                    }

                    /**
                     * Gets the value of the pfSampleNo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPFSampleNo() {
                        return pfSampleNo;
                    }

                    /**
                     * Sets the value of the pfSampleNo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPFSampleNo(String value) {
                        this.pfSampleNo = value;
                    }

                    /**
                     * Gets the value of the dateOfProcessing property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getDateOfProcessing() {
                        return dateOfProcessing;
                    }

                    /**
                     * Sets the value of the dateOfProcessing property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setDateOfProcessing(JAXBElement<XMLGregorianCalendar> value) {
                        this.dateOfProcessing = value;
                    }

                    /**
                     * Gets the value of the analysisSampleID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnalysisSampleID() {
                        return analysisSampleID;
                    }

                    /**
                     * Sets the value of the analysisSampleID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnalysisSampleID(String value) {
                        this.analysisSampleID = value;
                    }

                    /**
                     * Gets the value of the analysisSampleDescription property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the analysisSampleDescription property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAnalysisSampleDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getAnalysisSampleDescription() {
                        if (analysisSampleDescription == null) {
                            analysisSampleDescription = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.analysisSampleDescription;
                    }

                    /**
                     * Gets the value of the analyteMeasured property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured getAnalyteMeasured() {
                        return analyteMeasured;
                    }

                    /**
                     * Sets the value of the analyteMeasured property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured }
                     *     
                     */
                    public void setAnalyteMeasured(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured value) {
                        this.analyteMeasured = value;
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
                     *                   &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                     *                   &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                     *                   &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                     *                   &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="CorrectionByStorageStability" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                     *                   &lt;element name="CorrectionByRecovery" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="ResidueLevelMeasured" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelCalculated" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    public static class AnalyteMeasured {

                        protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry> entry;

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
                         * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry }
                         * 
                         * 
                         */
                        public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry> getEntry() {
                            if (entry == null) {
                                entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry>();
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
                         *         &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                         *         &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                         *         &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                         *         &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="CorrectionByStorageStability" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                         *         &lt;element name="CorrectionByRecovery" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="ResidueLevelMeasured" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelCalculated" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                            "analyteIdentity",
                            "extractionDate",
                            "analysisDate",
                            "methodID",
                            "storageStabilityFactor",
                            "useOfFactor",
                            "correctionByStorageStability",
                            "recovery",
                            "correctionByRecovery",
                            "referencePortion",
                            "residueLevelMeasured",
                            "residueLevelCalculated",
                            "residueLevelCalculatedAndCorrected"
                        })
                        public static class Entry
                            extends RepeatableEntryType
                        {

                            @XmlElement(name = "AnalyteIdentity")
                            protected String analyteIdentity;
                            @XmlElementRef(name = "ExtractionDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<XMLGregorianCalendar> extractionDate;
                            @XmlElementRef(name = "AnalysisDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<XMLGregorianCalendar> analysisDate;
                            @XmlElement(name = "MethodID")
                            protected String methodID;
                            @XmlElementRef(name = "StorageStabilityFactor", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<BigDecimal> storageStabilityFactor;
                            @XmlElement(name = "UseOfFactor")
                            protected List<MultilingualTextFieldSmall> useOfFactor;
                            @XmlElement(name = "CorrectionByStorageStability")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByStorageStability correctionByStorageStability;
                            @XmlElementRef(name = "Recovery", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<BigDecimal> recovery;
                            @XmlElement(name = "CorrectionByRecovery")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByRecovery correctionByRecovery;
                            @XmlElement(name = "ReferencePortion")
                            protected List<MultilingualTextFieldMultiLine> referencePortion;
                            @XmlElement(name = "ResidueLevelMeasured")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelMeasured residueLevelMeasured;
                            @XmlElement(name = "ResidueLevelCalculated")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculated residueLevelCalculated;
                            @XmlElement(name = "ResidueLevelCalculatedAndCorrected")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected residueLevelCalculatedAndCorrected;

                            /**
                             * Gets the value of the analyteIdentity property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAnalyteIdentity() {
                                return analyteIdentity;
                            }

                            /**
                             * Sets the value of the analyteIdentity property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAnalyteIdentity(String value) {
                                this.analyteIdentity = value;
                            }

                            /**
                             * Gets the value of the extractionDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public JAXBElement<XMLGregorianCalendar> getExtractionDate() {
                                return extractionDate;
                            }

                            /**
                             * Sets the value of the extractionDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public void setExtractionDate(JAXBElement<XMLGregorianCalendar> value) {
                                this.extractionDate = value;
                            }

                            /**
                             * Gets the value of the analysisDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public JAXBElement<XMLGregorianCalendar> getAnalysisDate() {
                                return analysisDate;
                            }

                            /**
                             * Sets the value of the analysisDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public void setAnalysisDate(JAXBElement<XMLGregorianCalendar> value) {
                                this.analysisDate = value;
                            }

                            /**
                             * Gets the value of the methodID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMethodID() {
                                return methodID;
                            }

                            /**
                             * Sets the value of the methodID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMethodID(String value) {
                                this.methodID = value;
                            }

                            /**
                             * Gets the value of the storageStabilityFactor property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public JAXBElement<BigDecimal> getStorageStabilityFactor() {
                                return storageStabilityFactor;
                            }

                            /**
                             * Sets the value of the storageStabilityFactor property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public void setStorageStabilityFactor(JAXBElement<BigDecimal> value) {
                                this.storageStabilityFactor = value;
                            }

                            /**
                             * Gets the value of the useOfFactor property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the useOfFactor property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getUseOfFactor().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link MultilingualTextFieldSmall }
                             * 
                             * 
                             */
                            public List<MultilingualTextFieldSmall> getUseOfFactor() {
                                if (useOfFactor == null) {
                                    useOfFactor = new ArrayList<MultilingualTextFieldSmall>();
                                }
                                return this.useOfFactor;
                            }

                            /**
                             * Gets the value of the correctionByStorageStability property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByStorageStability }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByStorageStability getCorrectionByStorageStability() {
                                return correctionByStorageStability;
                            }

                            /**
                             * Sets the value of the correctionByStorageStability property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByStorageStability }
                             *     
                             */
                            public void setCorrectionByStorageStability(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByStorageStability value) {
                                this.correctionByStorageStability = value;
                            }

                            /**
                             * Gets the value of the recovery property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public JAXBElement<BigDecimal> getRecovery() {
                                return recovery;
                            }

                            /**
                             * Sets the value of the recovery property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public void setRecovery(JAXBElement<BigDecimal> value) {
                                this.recovery = value;
                            }

                            /**
                             * Gets the value of the correctionByRecovery property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByRecovery }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByRecovery getCorrectionByRecovery() {
                                return correctionByRecovery;
                            }

                            /**
                             * Sets the value of the correctionByRecovery property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByRecovery }
                             *     
                             */
                            public void setCorrectionByRecovery(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.CorrectionByRecovery value) {
                                this.correctionByRecovery = value;
                            }

                            /**
                             * Gets the value of the referencePortion property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the referencePortion property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getReferencePortion().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link MultilingualTextFieldMultiLine }
                             * 
                             * 
                             */
                            public List<MultilingualTextFieldMultiLine> getReferencePortion() {
                                if (referencePortion == null) {
                                    referencePortion = new ArrayList<MultilingualTextFieldMultiLine>();
                                }
                                return this.referencePortion;
                            }

                            /**
                             * Gets the value of the residueLevelMeasured property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelMeasured }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelMeasured getResidueLevelMeasured() {
                                return residueLevelMeasured;
                            }

                            /**
                             * Sets the value of the residueLevelMeasured property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelMeasured }
                             *     
                             */
                            public void setResidueLevelMeasured(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelMeasured value) {
                                this.residueLevelMeasured = value;
                            }

                            /**
                             * Gets the value of the residueLevelCalculated property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculated }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculated getResidueLevelCalculated() {
                                return residueLevelCalculated;
                            }

                            /**
                             * Sets the value of the residueLevelCalculated property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculated }
                             *     
                             */
                            public void setResidueLevelCalculated(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculated value) {
                                this.residueLevelCalculated = value;
                            }

                            /**
                             * Gets the value of the residueLevelCalculatedAndCorrected property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected getResidueLevelCalculatedAndCorrected() {
                                return residueLevelCalculatedAndCorrected;
                            }

                            /**
                             * Sets the value of the residueLevelCalculatedAndCorrected property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected }
                             *     
                             */
                            public void setResidueLevelCalculatedAndCorrected(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInProcessedFractionsPFAndAspiratedGrainFractionsAGF.ProcessedFraction.EntrySet1 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected value) {
                                this.residueLevelCalculatedAndCorrected = value;
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
                             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
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
                            public static class CorrectionByRecovery
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
                             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
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
                            public static class CorrectionByStorageStability
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
                             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                             *       &lt;sequence>
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelCalculated
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
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelCalculatedAndCorrected
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
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelMeasured
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
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60497" minOccurs="0"/>
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
                    public static class ProcessedFractionPFSample
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
         *         &lt;element name="BulkRACSubSampleSampleNo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="DateOfSubSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                             &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="AnalyteMeasured" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *                                                 &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                                 &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
         *                                                 &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                                                 &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="CorrectionByStorageStability" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                                                 &lt;element name="CorrectionByRecovery" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="ResidueLevelMeasured" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelCalculated" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/extension>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
         *                                                           &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *                                                           &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *                                                           &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "bulkRACSubSampleSampleNo"
        })
        public static class ResiduesInRACPriorToProcessing {

            @XmlElement(name = "BulkRACSubSampleSampleNo")
            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo bulkRACSubSampleSampleNo;

            /**
             * Gets the value of the bulkRACSubSampleSampleNo property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo }
             *     
             */
            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo getBulkRACSubSampleSampleNo() {
                return bulkRACSubSampleSampleNo;
            }

            /**
             * Sets the value of the bulkRACSubSampleSampleNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo }
             *     
             */
            public void setBulkRACSubSampleSampleNo(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo value) {
                this.bulkRACSubSampleSampleNo = value;
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
             *                   &lt;element name="DateOfSubSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                   &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="AnalyteMeasured" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *                                     &lt;sequence>
             *                                       &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
             *                                       &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                                       &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
             *                                       &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                                       &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="CorrectionByStorageStability" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *                                       &lt;element name="CorrectionByRecovery" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="ResidueLevelMeasured" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelCalculated" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/extension>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                                               &lt;sequence>
             *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
             *                                                 &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
             *                                                 &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
             *                                                 &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            public static class BulkRACSubSampleSampleNo {

                protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3> entry;

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
                 * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3>();
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
                 *         &lt;element name="DateOfSubSample" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="AnalysisSampleID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *         &lt;element name="AnalysisSampleDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="AnalyteMeasured" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
                 *                           &lt;sequence>
                 *                             &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                 *                             &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                             &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                 *                             &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *                             &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="CorrectionByStorageStability" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                 *                             &lt;element name="CorrectionByRecovery" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="ResidueLevelMeasured" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelCalculated" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/extension>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                 *                                       &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                 *                                       &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                 *                                       &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "dateOfSubSample",
                    "analysisSampleID",
                    "analysisSampleDescription",
                    "analyteMeasured"
                })
                public static class EntrySet3
                    extends RepeatableEntryType
                {

                    @XmlElementRef(name = "DateOfSubSample", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> dateOfSubSample;
                    @XmlElement(name = "AnalysisSampleID")
                    protected String analysisSampleID;
                    @XmlElement(name = "AnalysisSampleDescription")
                    protected List<MultilingualTextFieldSmall> analysisSampleDescription;
                    @XmlElement(name = "AnalyteMeasured")
                    protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured analyteMeasured;

                    /**
                     * Gets the value of the dateOfSubSample property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getDateOfSubSample() {
                        return dateOfSubSample;
                    }

                    /**
                     * Sets the value of the dateOfSubSample property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setDateOfSubSample(JAXBElement<XMLGregorianCalendar> value) {
                        this.dateOfSubSample = value;
                    }

                    /**
                     * Gets the value of the analysisSampleID property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAnalysisSampleID() {
                        return analysisSampleID;
                    }

                    /**
                     * Sets the value of the analysisSampleID property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAnalysisSampleID(String value) {
                        this.analysisSampleID = value;
                    }

                    /**
                     * Gets the value of the analysisSampleDescription property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the analysisSampleDescription property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAnalysisSampleDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldSmall }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldSmall> getAnalysisSampleDescription() {
                        if (analysisSampleDescription == null) {
                            analysisSampleDescription = new ArrayList<MultilingualTextFieldSmall>();
                        }
                        return this.analysisSampleDescription;
                    }

                    /**
                     * Gets the value of the analyteMeasured property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured getAnalyteMeasured() {
                        return analyteMeasured;
                    }

                    /**
                     * Sets the value of the analyteMeasured property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured }
                     *     
                     */
                    public void setAnalyteMeasured(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured value) {
                        this.analyteMeasured = value;
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
                     *                   &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                     *                   &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *                   &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                     *                   &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                     *                   &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="CorrectionByStorageStability" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                     *                   &lt;element name="CorrectionByRecovery" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="ResidueLevelMeasured" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelCalculated" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/extension>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                     *                           &lt;sequence>
                     *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                     *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                     *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                     *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                    public static class AnalyteMeasured {

                        protected List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry> entry;

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
                         * {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry }
                         * 
                         * 
                         */
                        public List<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry> getEntry() {
                            if (entry == null) {
                                entry = new ArrayList<ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry>();
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
                         *         &lt;element name="AnalyteIdentity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                         *         &lt;element name="ExtractionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                         *         &lt;element name="MethodID" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
                         *         &lt;element name="StorageStabilityFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                         *         &lt;element name="UseOfFactor" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="CorrectionByStorageStability" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="Recovery" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
                         *         &lt;element name="CorrectionByRecovery" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ReferencePortion" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="ResidueLevelMeasured" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelCalculated" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/extension>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ResidueLevelCalculatedAndCorrected" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                         *                 &lt;sequence>
                         *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
                         *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
                         *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
                         *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
                            "analyteIdentity",
                            "extractionDate",
                            "analysisDate",
                            "methodID",
                            "storageStabilityFactor",
                            "useOfFactor",
                            "correctionByStorageStability",
                            "recovery",
                            "correctionByRecovery",
                            "referencePortion",
                            "residueLevelMeasured",
                            "residueLevelCalculated",
                            "residueLevelCalculatedAndCorrected"
                        })
                        public static class Entry
                            extends RepeatableEntryType
                        {

                            @XmlElement(name = "AnalyteIdentity")
                            protected String analyteIdentity;
                            @XmlElementRef(name = "ExtractionDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<XMLGregorianCalendar> extractionDate;
                            @XmlElementRef(name = "AnalysisDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<XMLGregorianCalendar> analysisDate;
                            @XmlElement(name = "MethodID")
                            protected String methodID;
                            @XmlElementRef(name = "StorageStabilityFactor", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<BigDecimal> storageStabilityFactor;
                            @XmlElement(name = "UseOfFactor")
                            protected List<MultilingualTextFieldSmall> useOfFactor;
                            @XmlElement(name = "CorrectionByStorageStability")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByStorageStability correctionByStorageStability;
                            @XmlElementRef(name = "Recovery", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-MagnitudeResidInProcessedComm/6.0", type = JAXBElement.class, required = false)
                            protected JAXBElement<BigDecimal> recovery;
                            @XmlElement(name = "CorrectionByRecovery")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByRecovery correctionByRecovery;
                            @XmlElement(name = "ReferencePortion")
                            protected List<MultilingualTextFieldMultiLine> referencePortion;
                            @XmlElement(name = "ResidueLevelMeasured")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelMeasured residueLevelMeasured;
                            @XmlElement(name = "ResidueLevelCalculated")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculated residueLevelCalculated;
                            @XmlElement(name = "ResidueLevelCalculatedAndCorrected")
                            protected ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected residueLevelCalculatedAndCorrected;

                            /**
                             * Gets the value of the analyteIdentity property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getAnalyteIdentity() {
                                return analyteIdentity;
                            }

                            /**
                             * Sets the value of the analyteIdentity property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setAnalyteIdentity(String value) {
                                this.analyteIdentity = value;
                            }

                            /**
                             * Gets the value of the extractionDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public JAXBElement<XMLGregorianCalendar> getExtractionDate() {
                                return extractionDate;
                            }

                            /**
                             * Sets the value of the extractionDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public void setExtractionDate(JAXBElement<XMLGregorianCalendar> value) {
                                this.extractionDate = value;
                            }

                            /**
                             * Gets the value of the analysisDate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public JAXBElement<XMLGregorianCalendar> getAnalysisDate() {
                                return analysisDate;
                            }

                            /**
                             * Sets the value of the analysisDate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                             *     
                             */
                            public void setAnalysisDate(JAXBElement<XMLGregorianCalendar> value) {
                                this.analysisDate = value;
                            }

                            /**
                             * Gets the value of the methodID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getMethodID() {
                                return methodID;
                            }

                            /**
                             * Sets the value of the methodID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setMethodID(String value) {
                                this.methodID = value;
                            }

                            /**
                             * Gets the value of the storageStabilityFactor property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public JAXBElement<BigDecimal> getStorageStabilityFactor() {
                                return storageStabilityFactor;
                            }

                            /**
                             * Sets the value of the storageStabilityFactor property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public void setStorageStabilityFactor(JAXBElement<BigDecimal> value) {
                                this.storageStabilityFactor = value;
                            }

                            /**
                             * Gets the value of the useOfFactor property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the useOfFactor property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getUseOfFactor().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link MultilingualTextFieldSmall }
                             * 
                             * 
                             */
                            public List<MultilingualTextFieldSmall> getUseOfFactor() {
                                if (useOfFactor == null) {
                                    useOfFactor = new ArrayList<MultilingualTextFieldSmall>();
                                }
                                return this.useOfFactor;
                            }

                            /**
                             * Gets the value of the correctionByStorageStability property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByStorageStability }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByStorageStability getCorrectionByStorageStability() {
                                return correctionByStorageStability;
                            }

                            /**
                             * Sets the value of the correctionByStorageStability property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByStorageStability }
                             *     
                             */
                            public void setCorrectionByStorageStability(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByStorageStability value) {
                                this.correctionByStorageStability = value;
                            }

                            /**
                             * Gets the value of the recovery property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public JAXBElement<BigDecimal> getRecovery() {
                                return recovery;
                            }

                            /**
                             * Sets the value of the recovery property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                             *     
                             */
                            public void setRecovery(JAXBElement<BigDecimal> value) {
                                this.recovery = value;
                            }

                            /**
                             * Gets the value of the correctionByRecovery property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByRecovery }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByRecovery getCorrectionByRecovery() {
                                return correctionByRecovery;
                            }

                            /**
                             * Sets the value of the correctionByRecovery property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByRecovery }
                             *     
                             */
                            public void setCorrectionByRecovery(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.CorrectionByRecovery value) {
                                this.correctionByRecovery = value;
                            }

                            /**
                             * Gets the value of the referencePortion property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the referencePortion property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getReferencePortion().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link MultilingualTextFieldMultiLine }
                             * 
                             * 
                             */
                            public List<MultilingualTextFieldMultiLine> getReferencePortion() {
                                if (referencePortion == null) {
                                    referencePortion = new ArrayList<MultilingualTextFieldMultiLine>();
                                }
                                return this.referencePortion;
                            }

                            /**
                             * Gets the value of the residueLevelMeasured property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelMeasured }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelMeasured getResidueLevelMeasured() {
                                return residueLevelMeasured;
                            }

                            /**
                             * Sets the value of the residueLevelMeasured property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelMeasured }
                             *     
                             */
                            public void setResidueLevelMeasured(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelMeasured value) {
                                this.residueLevelMeasured = value;
                            }

                            /**
                             * Gets the value of the residueLevelCalculated property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculated }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculated getResidueLevelCalculated() {
                                return residueLevelCalculated;
                            }

                            /**
                             * Sets the value of the residueLevelCalculated property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculated }
                             *     
                             */
                            public void setResidueLevelCalculated(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculated value) {
                                this.residueLevelCalculated = value;
                            }

                            /**
                             * Gets the value of the residueLevelCalculatedAndCorrected property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected }
                             *     
                             */
                            public ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected getResidueLevelCalculatedAndCorrected() {
                                return residueLevelCalculatedAndCorrected;
                            }

                            /**
                             * Sets the value of the residueLevelCalculatedAndCorrected property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected }
                             *     
                             */
                            public void setResidueLevelCalculatedAndCorrected(ENDPOINTSTUDYRECORDMagnitudeResidInProcessedComm.ResultsAndDiscussion.ResiduesInRACPriorToProcessing.BulkRACSubSampleSampleNo.EntrySet3 .AnalyteMeasured.Entry.ResidueLevelCalculatedAndCorrected value) {
                                this.residueLevelCalculatedAndCorrected = value;
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
                             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
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
                            public static class CorrectionByRecovery
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
                             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}N21" minOccurs="0"/>
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
                            public static class CorrectionByStorageStability
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
                             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                             *       &lt;sequence>
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelCalculated
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
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelCalculatedAndCorrected
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
                             *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60496_2" minOccurs="0"/>
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
                            public static class ResidueLevelMeasured
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

                }

            }

        }

    }

}
