
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_agglomerationaggregation._6;

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
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60328" minOccurs="0"/>
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
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM13" minOccurs="0"/>
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
 *                   &lt;element name="OtherQualityAssurance" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60008" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MethodType" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM14" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DetailsOnMethodsAndDataEvaluation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Sampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TestMaterials" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                             &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudyConfidential" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ReferenceMaterial" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ReferenceMaterialNanomaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                                                 &lt;element name="SampleIdentificationNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
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
 *                   &lt;element name="DataGathering" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Instruments" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Calibration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Reproducibility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="AgglomerationAggregationDiameter" minOccurs="0">
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
 *                                       &lt;element name="MeanDiameter" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
 *                                       &lt;element name="StDev" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
 *                                                 &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Ph" minOccurs="0">
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
 *                                       &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="RemarksOnResults" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
 *                   &lt;element name="AgglomerationAggregationSize" minOccurs="0">
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
 *                                       &lt;element name="Percentile" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}P28" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Mean" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
 *                                       &lt;element name="StDev" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
 *                                                 &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Ph" minOccurs="0">
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
 *                                       &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="RemarksOnResults" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
 *                   &lt;element name="DistributionDifferentPassages" minOccurs="0">
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
 *                                       &lt;element name="SequenceNumber" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM17" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Size" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
 *                                       &lt;element name="Distribution" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM19" minOccurs="0"/>
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
 *                                       &lt;element name="RemarksOnResults" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
 *                   &lt;element name="Index" minOccurs="0">
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
 *                                       &lt;element name="Mean" minOccurs="0">
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
 *                                       &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                                       &lt;element name="Ph" minOccurs="0">
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
 *                                       &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="RemarksOnResults" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.AgglomerationAggregation")
public class ENDPOINTSTUDYRECORDAgglomerationAggregation {

    @XmlElement(name = "AdministrativeData")
    protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource")
    protected ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods")
    protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "ResultsAndDiscussion")
    protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion resultsAndDiscussion;
    @XmlElement(name = "OverallRemarksAttachments")
    protected ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion")
    protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the resultsAndDiscussion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion }
     *     
     */
    public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion getResultsAndDiscussion() {
        return resultsAndDiscussion;
    }

    /**
     * Sets the value of the resultsAndDiscussion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion }
     *     
     */
    public void setResultsAndDiscussion(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion value) {
        this.resultsAndDiscussion = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDAgglomerationAggregation.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDAgglomerationAggregation.ApplicantSummaryAndConclusion value) {
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
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60328" minOccurs="0"/>
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
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection dataProtection;
        @XmlElement(name = "Endpoint")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Endpoint endpoint;
        @XmlElement(name = "StudyResultType")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.StudyResultType studyResultType;
        @XmlElement(name = "PurposeFlag")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.PurposeFlag purposeFlag;
        @XmlElementRef(name = "RobustStudy", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> robustStudy;
        @XmlElementRef(name = "UsedForClassification", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForClassification;
        @XmlElementRef(name = "UsedForMSDS", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> usedForMSDS;
        @XmlElement(name = "StudyPeriod")
        protected List<MultilingualTextFieldSmall> studyPeriod;
        @XmlElement(name = "Reliability")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Reliability reliability;
        @XmlElement(name = "RationalReliability")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.RationalReliability rationalReliability;
        @XmlElement(name = "DataWaiving")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaiving dataWaiving;
        @XmlElement(name = "DataWaivingJustification")
        protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaivingJustification> dataWaivingJustification;
        @XmlElement(name = "JustificationForTypeOfInformation")
        protected List<MultilingualTextFieldLarge> justificationForTypeOfInformation;
        @XmlElement(name = "AttachedJustification")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification attachedJustification;
        @XmlElement(name = "CrossReference")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference crossReference;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection }
         *     
         */
        public void setDataProtection(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the endpoint property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Endpoint }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Endpoint getEndpoint() {
            return endpoint;
        }

        /**
         * Sets the value of the endpoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Endpoint }
         *     
         */
        public void setEndpoint(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Endpoint value) {
            this.endpoint = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.StudyResultType }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.StudyResultType getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.StudyResultType }
         *     
         */
        public void setStudyResultType(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.StudyResultType value) {
            this.studyResultType = value;
        }

        /**
         * Gets the value of the purposeFlag property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.PurposeFlag }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.PurposeFlag getPurposeFlag() {
            return purposeFlag;
        }

        /**
         * Sets the value of the purposeFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.PurposeFlag }
         *     
         */
        public void setPurposeFlag(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.PurposeFlag value) {
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
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Reliability }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Reliability getReliability() {
            return reliability;
        }

        /**
         * Sets the value of the reliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Reliability }
         *     
         */
        public void setReliability(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.Reliability value) {
            this.reliability = value;
        }

        /**
         * Gets the value of the rationalReliability property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.RationalReliability }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.RationalReliability getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.RationalReliability }
         *     
         */
        public void setRationalReliability(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.RationalReliability value) {
            this.rationalReliability = value;
        }

        /**
         * Gets the value of the dataWaiving property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaiving }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaiving getDataWaiving() {
            return dataWaiving;
        }

        /**
         * Sets the value of the dataWaiving property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaiving }
         *     
         */
        public void setDataWaiving(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaiving value) {
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
         * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaivingJustification }
         * 
         * 
         */
        public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaivingJustification> getDataWaivingJustification() {
            if (dataWaivingJustification == null) {
                dataWaivingJustification = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataWaivingJustification>();
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
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification getAttachedJustification() {
            return attachedJustification;
        }

        /**
         * Sets the value of the attachedJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification }
         *     
         */
        public void setAttachedJustification(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification value) {
            this.attachedJustification = value;
        }

        /**
         * Gets the value of the crossReference property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference getCrossReference() {
            return crossReference;
        }

        /**
         * Sets the value of the crossReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference }
         *     
         */
        public void setCrossReference(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference value) {
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

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry>();
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
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry.ReasonPurpose reasonPurpose;

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
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.AttachedJustification.Entry.ReasonPurpose value) {
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

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry>();
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
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry.ReasonPurpose reasonPurpose;
                @XmlElement(name = "RelatedInformation")
                protected String relatedInformation;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldLarge> remarks;

                /**
                 * Gets the value of the reasonPurpose property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry.ReasonPurpose getReasonPurpose() {
                    return reasonPurpose;
                }

                /**
                 * Sets the value of the reasonPurpose property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry.ReasonPurpose }
                 *     
                 */
                public void setReasonPurpose(ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.CrossReference.Entry.ReasonPurpose value) {
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
            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection.Legislation> legislation;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection.Legislation }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.AdministrativeData.DataProtection.Legislation>();
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60328" minOccurs="0"/>
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
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataAccess dataAccess;
        @XmlElement(name = "DataProtectionClaimed")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataProtectionClaimed dataProtectionClaimed;

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
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataAccess }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataAccess getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataAccess }
         *     
         */
        public void setDataAccess(ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataAccess value) {
            this.dataAccess = value;
        }

        /**
         * Gets the value of the dataProtectionClaimed property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataProtectionClaimed }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataProtectionClaimed getDataProtectionClaimed() {
            return dataProtectionClaimed;
        }

        /**
         * Sets the value of the dataProtectionClaimed property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataProtectionClaimed }
         *     
         */
        public void setDataProtectionClaimed(ENDPOINTSTUDYRECORDAgglomerationAggregation.DataSource.DataProtectionClaimed value) {
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
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM13" minOccurs="0"/>
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
     *         &lt;element name="OtherQualityAssurance" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60008" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MethodType" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM14" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DetailsOnMethodsAndDataEvaluation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Sampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TestMaterials" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudyConfidential" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ReferenceMaterial" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ReferenceMaterialNanomaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                                       &lt;element name="SampleIdentificationNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
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
     *         &lt;element name="DataGathering" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Instruments" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Calibration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Reproducibility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "otherQualityAssurance",
        "methodType",
        "detailsOnMethodsAndDataEvaluation",
        "sampling",
        "testMaterials",
        "dataGathering",
        "anyOtherInformationOnMaterialsAndMethodsInclTables"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "Guideline")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines guideline;
        @XmlElement(name = "MethodNoGuideline")
        protected List<MultilingualTextFieldLarge> methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.GLPComplianceStatement glpComplianceStatement;
        @XmlElement(name = "OtherQualityAssurance")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.OtherQualityAssurance otherQualityAssurance;
        @XmlElement(name = "MethodType")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.MethodType methodType;
        @XmlElement(name = "DetailsOnMethodsAndDataEvaluation")
        protected List<MultilingualTextFieldLarge> detailsOnMethodsAndDataEvaluation;
        @XmlElement(name = "Sampling")
        protected List<MultilingualTextFieldLarge> sampling;
        @XmlElement(name = "TestMaterials")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials testMaterials;
        @XmlElement(name = "DataGathering")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.DataGathering dataGathering;
        @XmlElement(name = "AnyOtherInformationOnMaterialsAndMethodsInclTables")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables anyOtherInformationOnMaterialsAndMethodsInclTables;

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines value) {
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
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.GLPComplianceStatement getGLPComplianceStatement() {
            return glpComplianceStatement;
        }

        /**
         * Sets the value of the glpComplianceStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.GLPComplianceStatement }
         *     
         */
        public void setGLPComplianceStatement(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.GLPComplianceStatement value) {
            this.glpComplianceStatement = value;
        }

        /**
         * Gets the value of the otherQualityAssurance property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.OtherQualityAssurance }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.OtherQualityAssurance getOtherQualityAssurance() {
            return otherQualityAssurance;
        }

        /**
         * Sets the value of the otherQualityAssurance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.OtherQualityAssurance }
         *     
         */
        public void setOtherQualityAssurance(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.OtherQualityAssurance value) {
            this.otherQualityAssurance = value;
        }

        /**
         * Gets the value of the methodType property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.MethodType }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.MethodType getMethodType() {
            return methodType;
        }

        /**
         * Sets the value of the methodType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.MethodType }
         *     
         */
        public void setMethodType(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.MethodType value) {
            this.methodType = value;
        }

        /**
         * Gets the value of the detailsOnMethodsAndDataEvaluation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsOnMethodsAndDataEvaluation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailsOnMethodsAndDataEvaluation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getDetailsOnMethodsAndDataEvaluation() {
            if (detailsOnMethodsAndDataEvaluation == null) {
                detailsOnMethodsAndDataEvaluation = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.detailsOnMethodsAndDataEvaluation;
        }

        /**
         * Gets the value of the sampling property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sampling property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSampling().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getSampling() {
            if (sampling == null) {
                sampling = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.sampling;
        }

        /**
         * Gets the value of the testMaterials property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials getTestMaterials() {
            return testMaterials;
        }

        /**
         * Sets the value of the testMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials }
         *     
         */
        public void setTestMaterials(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials value) {
            this.testMaterials = value;
        }

        /**
         * Gets the value of the dataGathering property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.DataGathering }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.DataGathering getDataGathering() {
            return dataGathering;
        }

        /**
         * Sets the value of the dataGathering property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.DataGathering }
         *     
         */
        public void setDataGathering(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.DataGathering value) {
            this.dataGathering = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables getAnyOtherInformationOnMaterialsAndMethodsInclTables() {
            return anyOtherInformationOnMaterialsAndMethodsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnMaterialsAndMethodsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables }
         *     
         */
        public void setAnyOtherInformationOnMaterialsAndMethodsInclTables(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.AnyOtherInformationOnMaterialsAndMethodsInclTables value) {
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
         *         &lt;element name="Instruments" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Calibration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Reproducibility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "instruments",
            "calibration",
            "reproducibility"
        })
        public static class DataGathering {

            @XmlElement(name = "Instruments")
            protected List<MultilingualTextFieldLarge> instruments;
            @XmlElement(name = "Calibration")
            protected List<MultilingualTextFieldLarge> calibration;
            @XmlElement(name = "Reproducibility")
            protected List<MultilingualTextFieldLarge> reproducibility;

            /**
             * Gets the value of the instruments property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the instruments property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInstruments().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getInstruments() {
                if (instruments == null) {
                    instruments = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.instruments;
            }

            /**
             * Gets the value of the calibration property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the calibration property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCalibration().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getCalibration() {
                if (calibration == null) {
                    calibration = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.calibration;
            }

            /**
             * Gets the value of the reproducibility property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reproducibility property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReproducibility().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getReproducibility() {
                if (reproducibility == null) {
                    reproducibility = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.reproducibility;
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
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM13" minOccurs="0"/>
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

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry>();
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
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM13" minOccurs="0"/>
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
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Qualifier qualifier;
                @XmlElement(name = "Guideline")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Guideline guideline;
                @XmlElement(name = "VersionRemarks")
                protected List<MultilingualTextFieldMultiLine> versionRemarks;
                @XmlElement(name = "Deviation")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Deviation deviation;

                /**
                 * Gets the value of the qualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Qualifier getQualifier() {
                    return qualifier;
                }

                /**
                 * Sets the value of the qualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Qualifier }
                 *     
                 */
                public void setQualifier(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Qualifier value) {
                    this.qualifier = value;
                }

                /**
                 * Gets the value of the guideline property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Guideline getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Guideline }
                 *     
                 */
                public void setGuideline(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Guideline value) {
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
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Deviation getDeviation() {
                    return deviation;
                }

                /**
                 * Sets the value of the deviation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Deviation }
                 *     
                 */
                public void setDeviation(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.Guidelines.Entry.Deviation value) {
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM13" minOccurs="0"/>
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM14" minOccurs="0"/>
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
        public static class MethodType
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60008" minOccurs="0"/>
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
        public static class OtherQualityAssurance
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
         *         &lt;element name="ReferenceMaterial" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ReferenceMaterialNanomaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *                             &lt;element name="SampleIdentificationNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
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
            "testMaterialInformation",
            "specificDetailsOnTestMaterialUsedForTheStudy",
            "specificDetailsOnTestMaterialUsedForTheStudyConfidential",
            "referenceMaterial"
        })
        public static class TestMaterials {

            @XmlElement(name = "TestMaterialInformation")
            protected String testMaterialInformation;
            @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudy")
            protected List<MultilingualTextFieldLarge> specificDetailsOnTestMaterialUsedForTheStudy;
            @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudyConfidential")
            protected List<MultilingualTextFieldLarge> specificDetailsOnTestMaterialUsedForTheStudyConfidential;
            @XmlElement(name = "ReferenceMaterial")
            protected ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial referenceMaterial;

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

            /**
             * Gets the value of the referenceMaterial property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial }
             *     
             */
            public ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial getReferenceMaterial() {
                return referenceMaterial;
            }

            /**
             * Sets the value of the referenceMaterial property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial }
             *     
             */
            public void setReferenceMaterial(ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial value) {
                this.referenceMaterial = value;
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
             *                   &lt;element name="ReferenceMaterialNanomaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
             *                   &lt;element name="SampleIdentificationNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
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
            public static class ReferenceMaterial {

                protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.MaterialsAndMethods.TestMaterials.ReferenceMaterial.Entry>();
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
                 *         &lt;element name="ReferenceMaterialNanomaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
                 *         &lt;element name="SampleIdentificationNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
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
                    "referenceMaterialNanomaterial",
                    "sampleIdentificationNumber"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ReferenceMaterialNanomaterial")
                    protected String referenceMaterialNanomaterial;
                    @XmlElement(name = "SampleIdentificationNumber")
                    protected String sampleIdentificationNumber;

                    /**
                     * Gets the value of the referenceMaterialNanomaterial property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReferenceMaterialNanomaterial() {
                        return referenceMaterialNanomaterial;
                    }

                    /**
                     * Sets the value of the referenceMaterialNanomaterial property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReferenceMaterialNanomaterial(String value) {
                        this.referenceMaterialNanomaterial = value;
                    }

                    /**
                     * Gets the value of the sampleIdentificationNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSampleIdentificationNumber() {
                        return sampleIdentificationNumber;
                    }

                    /**
                     * Sets the value of the sampleIdentificationNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSampleIdentificationNumber(String value) {
                        this.sampleIdentificationNumber = value;
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
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
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
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
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

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
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
     *         &lt;element name="AgglomerationAggregationDiameter" minOccurs="0">
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
     *                             &lt;element name="MeanDiameter" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
     *                             &lt;element name="StDev" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
     *                                       &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Ph" minOccurs="0">
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
     *                             &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="RemarksOnResults" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
     *         &lt;element name="AgglomerationAggregationSize" minOccurs="0">
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
     *                             &lt;element name="Percentile" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}P28" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Mean" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
     *                             &lt;element name="StDev" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
     *                                       &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Ph" minOccurs="0">
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
     *                             &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="RemarksOnResults" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
     *         &lt;element name="DistributionDifferentPassages" minOccurs="0">
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
     *                             &lt;element name="SequenceNumber" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM17" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Size" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
     *                             &lt;element name="Distribution" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                                     &lt;sequence>
     *                                       &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM19" minOccurs="0"/>
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
     *                             &lt;element name="RemarksOnResults" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
     *         &lt;element name="Index" minOccurs="0">
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
     *                             &lt;element name="Mean" minOccurs="0">
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
     *                             &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *                             &lt;element name="Ph" minOccurs="0">
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
     *                             &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="RemarksOnResults" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
        "agglomerationAggregationDiameter",
        "agglomerationAggregationSize",
        "distributionDifferentPassages",
        "index",
        "anyOtherInformationOnResultsInclTables"
    })
    public static class ResultsAndDiscussion {

        @XmlElement(name = "AgglomerationAggregationDiameter")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter agglomerationAggregationDiameter;
        @XmlElement(name = "AgglomerationAggregationSize")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize agglomerationAggregationSize;
        @XmlElement(name = "DistributionDifferentPassages")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages distributionDifferentPassages;
        @XmlElement(name = "Index")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index index;
        @XmlElement(name = "AnyOtherInformationOnResultsInclTables")
        protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

        /**
         * Gets the value of the agglomerationAggregationDiameter property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter getAgglomerationAggregationDiameter() {
            return agglomerationAggregationDiameter;
        }

        /**
         * Sets the value of the agglomerationAggregationDiameter property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter }
         *     
         */
        public void setAgglomerationAggregationDiameter(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter value) {
            this.agglomerationAggregationDiameter = value;
        }

        /**
         * Gets the value of the agglomerationAggregationSize property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize getAgglomerationAggregationSize() {
            return agglomerationAggregationSize;
        }

        /**
         * Sets the value of the agglomerationAggregationSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize }
         *     
         */
        public void setAgglomerationAggregationSize(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize value) {
            this.agglomerationAggregationSize = value;
        }

        /**
         * Gets the value of the distributionDifferentPassages property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages getDistributionDifferentPassages() {
            return distributionDifferentPassages;
        }

        /**
         * Sets the value of the distributionDifferentPassages property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages }
         *     
         */
        public void setDistributionDifferentPassages(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages value) {
            this.distributionDifferentPassages = value;
        }

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index }
         *     
         */
        public void setIndex(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index value) {
            this.index = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
            return anyOtherInformationOnResultsInclTables;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsInclTables property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables }
         *     
         */
        public void setAnyOtherInformationOnResultsInclTables(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AnyOtherInformationOnResultsInclTables value) {
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *                   &lt;element name="MeanDiameter" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
         *                   &lt;element name="StDev" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
         *                             &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Ph" minOccurs="0">
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
         *                   &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="RemarksOnResults" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
        public static class AgglomerationAggregationDiameter {

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry>();
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
             *         &lt;element name="MeanDiameter" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
             *         &lt;element name="StDev" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
             *                   &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Ph" minOccurs="0">
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
             *         &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="RemarksOnResults" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                "meanDiameter",
                "stDev",
                "ph",
                "medium",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElementRef(name = "KeyResult", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> keyResult;
                @XmlElement(name = "MeanDiameter")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.MeanDiameter meanDiameter;
                @XmlElement(name = "StDev")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.StDev stDev;
                @XmlElement(name = "Ph")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.Ph ph;
                @XmlElement(name = "Medium")
                protected List<MultilingualTextFieldLarge> medium;
                @XmlElement(name = "RemarksOnResults")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.RemarksOnResults remarksOnResults;

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
                 * Gets the value of the meanDiameter property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.MeanDiameter }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.MeanDiameter getMeanDiameter() {
                    return meanDiameter;
                }

                /**
                 * Sets the value of the meanDiameter property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.MeanDiameter }
                 *     
                 */
                public void setMeanDiameter(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.MeanDiameter value) {
                    this.meanDiameter = value;
                }

                /**
                 * Gets the value of the stDev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.StDev }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.StDev getStDev() {
                    return stDev;
                }

                /**
                 * Sets the value of the stDev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.StDev }
                 *     
                 */
                public void setStDev(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.StDev value) {
                    this.stDev = value;
                }

                /**
                 * Gets the value of the ph property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.Ph }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.Ph getPh() {
                    return ph;
                }

                /**
                 * Sets the value of the ph property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.Ph }
                 *     
                 */
                public void setPh(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.Ph value) {
                    this.ph = value;
                }

                /**
                 * Gets the value of the medium property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the medium property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMedium().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldLarge }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldLarge> getMedium() {
                    if (medium == null) {
                        medium = new ArrayList<MultilingualTextFieldLarge>();
                    }
                    return this.medium;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.RemarksOnResults }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.RemarksOnResults getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.RemarksOnResults }
                 *     
                 */
                public void setRemarksOnResults(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationDiameter.Entry.RemarksOnResults value) {
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
                public static class MeanDiameter
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
                public static class Ph
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
                 *         &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "unitOther",
                    "value"
                })
                public static class StDev
                    extends BasePhysicalQuantityField
                {

                    protected String unitCode;
                    protected List<MultilingualTextFieldSmall> unitOther;
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
         *                   &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *                   &lt;element name="Percentile" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}P28" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Mean" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
         *                   &lt;element name="StDev" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
         *                             &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Ph" minOccurs="0">
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
         *                   &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="RemarksOnResults" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
        public static class AgglomerationAggregationSize {

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry>();
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
             *         &lt;element name="Percentile" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}P28" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Mean" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
             *         &lt;element name="StDev" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
             *                   &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Ph" minOccurs="0">
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
             *         &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="RemarksOnResults" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                "percentile",
                "mean",
                "stDev",
                "ph",
                "medium",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElementRef(name = "KeyResult", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> keyResult;
                @XmlElement(name = "Percentile")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Percentile percentile;
                @XmlElement(name = "Mean")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Mean mean;
                @XmlElement(name = "StDev")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.StDev stDev;
                @XmlElement(name = "Ph")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Ph ph;
                @XmlElement(name = "Medium")
                protected List<MultilingualTextFieldLarge> medium;
                @XmlElement(name = "RemarksOnResults")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.RemarksOnResults remarksOnResults;

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
                 * Gets the value of the percentile property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Percentile }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Percentile getPercentile() {
                    return percentile;
                }

                /**
                 * Sets the value of the percentile property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Percentile }
                 *     
                 */
                public void setPercentile(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Percentile value) {
                    this.percentile = value;
                }

                /**
                 * Gets the value of the mean property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Mean }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Mean getMean() {
                    return mean;
                }

                /**
                 * Sets the value of the mean property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Mean }
                 *     
                 */
                public void setMean(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Mean value) {
                    this.mean = value;
                }

                /**
                 * Gets the value of the stDev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.StDev }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.StDev getStDev() {
                    return stDev;
                }

                /**
                 * Sets the value of the stDev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.StDev }
                 *     
                 */
                public void setStDev(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.StDev value) {
                    this.stDev = value;
                }

                /**
                 * Gets the value of the ph property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Ph }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Ph getPh() {
                    return ph;
                }

                /**
                 * Sets the value of the ph property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Ph }
                 *     
                 */
                public void setPh(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.Ph value) {
                    this.ph = value;
                }

                /**
                 * Gets the value of the medium property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the medium property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMedium().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldLarge }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldLarge> getMedium() {
                    if (medium == null) {
                        medium = new ArrayList<MultilingualTextFieldLarge>();
                    }
                    return this.medium;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.RemarksOnResults }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.RemarksOnResults getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.RemarksOnResults }
                 *     
                 */
                public void setRemarksOnResults(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.AgglomerationAggregationSize.Entry.RemarksOnResults value) {
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
                public static class Mean
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}P28" minOccurs="0"/>
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
                public static class Percentile
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
                public static class Ph
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
                 *         &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "unitOther",
                    "value"
                })
                public static class StDev
                    extends BasePhysicalQuantityField
                {

                    protected String unitCode;
                    protected List<MultilingualTextFieldSmall> unitOther;
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
         *                   &lt;element name="SequenceNumber" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM17" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Size" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
         *                   &lt;element name="Distribution" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *                           &lt;sequence>
         *                             &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM19" minOccurs="0"/>
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
         *                   &lt;element name="RemarksOnResults" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
        public static class DistributionDifferentPassages {

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry>();
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
             *         &lt;element name="SequenceNumber" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM17" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Size" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
             *         &lt;element name="Distribution" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
             *                 &lt;sequence>
             *                   &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM19" minOccurs="0"/>
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
             *         &lt;element name="RemarksOnResults" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                "sequenceNumber",
                "size",
                "distribution",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElementRef(name = "KeyResult", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> keyResult;
                @XmlElement(name = "SequenceNumber")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.SequenceNumber sequenceNumber;
                @XmlElement(name = "Size")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Size size;
                @XmlElement(name = "Distribution")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Distribution distribution;
                @XmlElement(name = "RemarksOnResults")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.RemarksOnResults remarksOnResults;

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
                 * Gets the value of the sequenceNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.SequenceNumber }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.SequenceNumber getSequenceNumber() {
                    return sequenceNumber;
                }

                /**
                 * Sets the value of the sequenceNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.SequenceNumber }
                 *     
                 */
                public void setSequenceNumber(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.SequenceNumber value) {
                    this.sequenceNumber = value;
                }

                /**
                 * Gets the value of the size property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Size }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Size getSize() {
                    return size;
                }

                /**
                 * Sets the value of the size property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Size }
                 *     
                 */
                public void setSize(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Size value) {
                    this.size = value;
                }

                /**
                 * Gets the value of the distribution property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Distribution }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Distribution getDistribution() {
                    return distribution;
                }

                /**
                 * Sets the value of the distribution property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Distribution }
                 *     
                 */
                public void setDistribution(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.Distribution value) {
                    this.distribution = value;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.RemarksOnResults }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.RemarksOnResults getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.RemarksOnResults }
                 *     
                 */
                public void setRemarksOnResults(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.DistributionDifferentPassages.Entry.RemarksOnResults value) {
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
                 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
                 *       &lt;sequence>
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM19" minOccurs="0"/>
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
                public static class Distribution
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM17" minOccurs="0"/>
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
                public static class SequenceNumber
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
                 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}NM15" minOccurs="0"/>
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
                public static class Size
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
         *                   &lt;element name="Mean" minOccurs="0">
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
         *                   &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
         *                   &lt;element name="Ph" minOccurs="0">
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
         *                   &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="RemarksOnResults" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
        public static class Index {

            protected List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry>();
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
             *         &lt;element name="Mean" minOccurs="0">
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
             *         &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
             *         &lt;element name="Ph" minOccurs="0">
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
             *         &lt;element name="Medium" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="RemarksOnResults" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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
                "mean",
                "stDev",
                "ph",
                "medium",
                "remarksOnResults"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElementRef(name = "KeyResult", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<Boolean> keyResult;
                @XmlElement(name = "Mean")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Mean mean;
                @XmlElementRef(name = "StDev", namespace = "http://iuclid6.echa.europa.eu/namespaces/ENDPOINT_STUDY_RECORD-AgglomerationAggregation/6.0", type = JAXBElement.class, required = false)
                protected JAXBElement<BigDecimal> stDev;
                @XmlElement(name = "Ph")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Ph ph;
                @XmlElement(name = "Medium")
                protected List<MultilingualTextFieldLarge> medium;
                @XmlElement(name = "RemarksOnResults")
                protected ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.RemarksOnResults remarksOnResults;

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
                 * Gets the value of the mean property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Mean }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Mean getMean() {
                    return mean;
                }

                /**
                 * Sets the value of the mean property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Mean }
                 *     
                 */
                public void setMean(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Mean value) {
                    this.mean = value;
                }

                /**
                 * Gets the value of the stDev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *     
                 */
                public JAXBElement<BigDecimal> getStDev() {
                    return stDev;
                }

                /**
                 * Sets the value of the stDev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
                 *     
                 */
                public void setStDev(JAXBElement<BigDecimal> value) {
                    this.stDev = value;
                }

                /**
                 * Gets the value of the ph property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Ph }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Ph getPh() {
                    return ph;
                }

                /**
                 * Sets the value of the ph property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Ph }
                 *     
                 */
                public void setPh(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.Ph value) {
                    this.ph = value;
                }

                /**
                 * Gets the value of the medium property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the medium property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMedium().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldLarge }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldLarge> getMedium() {
                    if (medium == null) {
                        medium = new ArrayList<MultilingualTextFieldLarge>();
                    }
                    return this.medium;
                }

                /**
                 * Gets the value of the remarksOnResults property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.RemarksOnResults }
                 *     
                 */
                public ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.RemarksOnResults getRemarksOnResults() {
                    return remarksOnResults;
                }

                /**
                 * Sets the value of the remarksOnResults property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.RemarksOnResults }
                 *     
                 */
                public void setRemarksOnResults(ENDPOINTSTUDYRECORDAgglomerationAggregation.ResultsAndDiscussion.Index.Entry.RemarksOnResults value) {
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
                public static class Mean
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
                public static class Ph
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/oecd/v6}PG6_60038" minOccurs="0"/>
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

            }

        }

    }

}
