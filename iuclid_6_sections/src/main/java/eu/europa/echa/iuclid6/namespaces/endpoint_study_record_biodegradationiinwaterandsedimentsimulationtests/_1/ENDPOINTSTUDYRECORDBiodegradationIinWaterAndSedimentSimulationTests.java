
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_biodegradationiinwaterandsedimentsimulationtests._1;

import java.math.BigDecimal;
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
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *                   &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
 *                   &lt;element name="DataAccess" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="DataProtectionClaimed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="CrossRefSameStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
 *                                       &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TestMaterials">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Indicator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Identity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
 *                   &lt;element name="Form" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Details" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="ConfidentialDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="OtherInfo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                   &lt;element name="Radiolabelling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnProperties" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="StudyDesign">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OxygenConditions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="Inoculum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="SurfacewaterDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="SedimentDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="InoculumDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="DurationOfTest" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="InitialTestSubstanceConcentration">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="InitialConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                                 &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                             &lt;element name="ParameterFollowed">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ParameterBiodegradation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                             &lt;element name="AnalytMethodDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="StudydesignDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="ReferenceSubstance">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResultsAndDiscussions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TestPerformance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="MaterialMassBalance">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InWater" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                             &lt;element name="InWaterStDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                             &lt;element name="InSedimet" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                             &lt;element name="InSedimetStDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                             &lt;element name="Degradation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Degr" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                                 &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                                 &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                                 &lt;element name="SamplingTime" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value=""/>
 *                                                                 &lt;enumeration value="2113"/>
 *                                                                 &lt;enumeration value="1976"/>
 *                                                                 &lt;enumeration value="1839"/>
 *                                                                 &lt;enumeration value="2468"/>
 *                                                                 &lt;enumeration value="2133"/>
 *                                                                 &lt;enumeration value="2477"/>
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
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                             &lt;element name="HalfLifeOfParentCompound">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Compartment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="HalfLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                                 &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                                                 &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="Temp" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="unitCode" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;enumeration value=""/>
 *                                                                 &lt;enumeration value="2493"/>
 *                                                                 &lt;enumeration value="3887"/>
 *                                                                 &lt;enumeration value="3888"/>
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
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                             &lt;element name="MineralizationRate" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                     &lt;sequence>
 *                                       &lt;element name="unitCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="8321"/>
 *                                             &lt;enumeration value="1833"/>
 *                                             &lt;enumeration value="1953"/>
 *                                             &lt;enumeration value="2109"/>
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
 *                             &lt;element name="OtherKineticParameters">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="OtherKineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *                             &lt;element name="TransformationProducts" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="IdentityTransformation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="No" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                   &lt;element name="TransfProductsDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="EvaporationOfParentCompound" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="VolatileMetabolites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="Residues" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="ResultsWithReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="AnyOtherInformationOnResultsIncl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
 *                   &lt;element name="CrossReferenceOtherStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="ValidityCriteriaFulfilled" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
    "testMaterials",
    "resultsAndDiscussions",
    "overallRemarksAttachments",
    "applicantSummaryAndConclusion"
})
@XmlRootElement(name = "ENDPOINT_STUDY_RECORD.BiodegradationIinWaterAndSedimentSimulationTests")
public class ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests {

    @XmlElement(name = "AdministrativeData", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.AdministrativeData administrativeData;
    @XmlElement(name = "DataSource", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.DataSource dataSource;
    @XmlElement(name = "MaterialsAndMethods", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods materialsAndMethods;
    @XmlElement(name = "TestMaterials", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials testMaterials;
    @XmlElement(name = "ResultsAndDiscussions", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions resultsAndDiscussions;
    @XmlElement(name = "OverallRemarksAttachments", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments overallRemarksAttachments;
    @XmlElement(name = "ApplicantSummaryAndConclusion", required = true)
    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ApplicantSummaryAndConclusion applicantSummaryAndConclusion;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.AdministrativeData }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.AdministrativeData }
     *     
     */
    public void setAdministrativeData(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.DataSource }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.DataSource getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.DataSource }
     *     
     */
    public void setDataSource(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.DataSource value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the materialsAndMethods property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods getMaterialsAndMethods() {
        return materialsAndMethods;
    }

    /**
     * Sets the value of the materialsAndMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods }
     *     
     */
    public void setMaterialsAndMethods(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods value) {
        this.materialsAndMethods = value;
    }

    /**
     * Gets the value of the testMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials getTestMaterials() {
        return testMaterials;
    }

    /**
     * Sets the value of the testMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials }
     *     
     */
    public void setTestMaterials(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials value) {
        this.testMaterials = value;
    }

    /**
     * Gets the value of the resultsAndDiscussions property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions getResultsAndDiscussions() {
        return resultsAndDiscussions;
    }

    /**
     * Sets the value of the resultsAndDiscussions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions }
     *     
     */
    public void setResultsAndDiscussions(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions value) {
        this.resultsAndDiscussions = value;
    }

    /**
     * Gets the value of the overallRemarksAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments getOverallRemarksAttachments() {
        return overallRemarksAttachments;
    }

    /**
     * Sets the value of the overallRemarksAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments }
     *     
     */
    public void setOverallRemarksAttachments(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments value) {
        this.overallRemarksAttachments = value;
    }

    /**
     * Gets the value of the applicantSummaryAndConclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ApplicantSummaryAndConclusion }
     *     
     */
    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ApplicantSummaryAndConclusion getApplicantSummaryAndConclusion() {
        return applicantSummaryAndConclusion;
    }

    /**
     * Sets the value of the applicantSummaryAndConclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ApplicantSummaryAndConclusion }
     *     
     */
    public void setApplicantSummaryAndConclusion(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ApplicantSummaryAndConclusion value) {
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
     *         &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
        "purposeFlag",
        "robustStudy",
        "usedForClassification",
        "usedForMSDS",
        "dataWaiving",
        "dataWaivingJustification",
        "studyResultType",
        "studyPeriod",
        "reliability",
        "rationalReliability"
    })
    public static class AdministrativeData {

        @XmlElement(name = "DataProtection", required = true)
        protected DataProtectionField dataProtection;
        @XmlElement(name = "PurposeFlag", required = true)
        protected PicklistField purposeFlag;
        @XmlElement(name = "RobustStudy", required = true, type = Boolean.class, nillable = true)
        protected Boolean robustStudy;
        @XmlElement(name = "UsedForClassification", required = true, type = Boolean.class, nillable = true)
        protected Boolean usedForClassification;
        @XmlElement(name = "UsedForMSDS", required = true, type = Boolean.class, nillable = true)
        protected Boolean usedForMSDS;
        @XmlElement(name = "DataWaiving", required = true)
        protected PicklistField dataWaiving;
        @XmlElement(name = "DataWaivingJustification", required = true)
        protected String dataWaivingJustification;
        @XmlElement(name = "StudyResultType", required = true)
        protected PicklistField studyResultType;
        @XmlElement(name = "StudyPeriod", required = true)
        protected String studyPeriod;
        @XmlElement(name = "Reliability", required = true)
        protected PicklistField reliability;
        @XmlElement(name = "RationalReliability", required = true)
        protected String rationalReliability;

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
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataWaivingJustification() {
            return dataWaivingJustification;
        }

        /**
         * Sets the value of the dataWaivingJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataWaivingJustification(String value) {
            this.dataWaivingJustification = value;
        }

        /**
         * Gets the value of the studyResultType property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getStudyResultType() {
            return studyResultType;
        }

        /**
         * Sets the value of the studyResultType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setStudyResultType(PicklistField value) {
            this.studyResultType = value;
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
         *     {@link String }
         *     
         */
        public String getRationalReliability() {
            return rationalReliability;
        }

        /**
         * Sets the value of the rationalReliability property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRationalReliability(String value) {
            this.rationalReliability = value;
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
     *         &lt;element name="CrossReferenceOtherStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="ValidityCriteriaFulfilled" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
        "executiveSummary",
        "crossReferenceOtherStudy",
        "validityCriteriaFulfilled"
    })
    public static class ApplicantSummaryAndConclusion {

        @XmlElement(name = "Conclusions", required = true)
        protected String conclusions;
        @XmlElement(name = "ExecutiveSummary", required = true)
        protected String executiveSummary;
        @XmlElement(name = "CrossReferenceOtherStudy", required = true)
        protected String crossReferenceOtherStudy;
        @XmlElement(name = "ValidityCriteriaFulfilled", required = true)
        protected PicklistFieldWithSmallTextRemarks validityCriteriaFulfilled;

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

        /**
         * Gets the value of the crossReferenceOtherStudy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrossReferenceOtherStudy() {
            return crossReferenceOtherStudy;
        }

        /**
         * Sets the value of the crossReferenceOtherStudy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrossReferenceOtherStudy(String value) {
            this.crossReferenceOtherStudy = value;
        }

        /**
         * Gets the value of the validityCriteriaFulfilled property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getValidityCriteriaFulfilled() {
            return validityCriteriaFulfilled;
        }

        /**
         * Sets the value of the validityCriteriaFulfilled property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setValidityCriteriaFulfilled(PicklistFieldWithSmallTextRemarks value) {
            this.validityCriteriaFulfilled = value;
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
     *         &lt;element name="DataAccess" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="DataProtectionClaimed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="CrossRefSameStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
        "dataProtectionClaimed",
        "crossRefSameStudy"
    })
    public static class DataSource {

        @XmlElement(name = "Reference", required = true)
        protected DocumentReferenceMultipleField reference;
        @XmlElement(name = "DataAccess", required = true)
        protected PicklistField dataAccess;
        @XmlElement(name = "DataProtectionClaimed", required = true)
        protected PicklistFieldWithSmallTextRemarks dataProtectionClaimed;
        @XmlElement(name = "CrossRefSameStudy", required = true)
        protected String crossRefSameStudy;

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
         *     {@link PicklistField }
         *     
         */
        public PicklistField getDataAccess() {
            return dataAccess;
        }

        /**
         * Sets the value of the dataAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setDataAccess(PicklistField value) {
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

        /**
         * Gets the value of the crossRefSameStudy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrossRefSameStudy() {
            return crossRefSameStudy;
        }

        /**
         * Sets the value of the crossRefSameStudy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrossRefSameStudy(String value) {
            this.crossRefSameStudy = value;
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
     *                             &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
        "glpComplianceStatement"
    })
    public static class MaterialsAndMethods {

        @XmlElement(name = "Guideline", required = true)
        protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline guideline;
        @XmlElement(name = "MethodNoGuideline", required = true)
        protected String methodNoGuideline;
        @XmlElement(name = "GLPComplianceStatement", required = true)
        protected PicklistFieldWithSmallTextRemarks glpComplianceStatement;

        /**
         * Gets the value of the guideline property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline }
         *     
         */
        public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline getGuideline() {
            return guideline;
        }

        /**
         * Sets the value of the guideline property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline }
         *     
         */
        public void setGuideline(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline value) {
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
         *                   &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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

            protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.MaterialsAndMethods.Guideline.Entry>();
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
             *         &lt;element name="Guideline" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                "deviation"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Qualifier", required = true)
                protected PicklistField qualifier;
                @XmlElement(name = "Guideline", required = true)
                protected PicklistFieldWithSmallTextRemarks guideline;
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
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public PicklistFieldWithSmallTextRemarks getGuideline() {
                    return guideline;
                }

                /**
                 * Sets the value of the guideline property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistFieldWithSmallTextRemarks }
                 *     
                 */
                public void setGuideline(PicklistFieldWithSmallTextRemarks value) {
                    this.guideline = value;
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
        protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial attachedBackgroundMaterial;
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
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
            return attachedBackgroundMaterial;
        }

        /**
         * Sets the value of the attachedBackgroundMaterial property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial }
         *     
         */
        public void setAttachedBackgroundMaterial(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial value) {
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

            protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry>();
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
     *         &lt;element name="TestPerformance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *         &lt;element name="MaterialMassBalance">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InWater" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                   &lt;element name="InWaterStDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                   &lt;element name="InSedimet" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                   &lt;element name="InSedimetStDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *                   &lt;element name="Degradation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Degr" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                                       &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                                       &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                                       &lt;element name="SamplingTime" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="unitCode" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value=""/>
     *                                                       &lt;enumeration value="2113"/>
     *                                                       &lt;enumeration value="1976"/>
     *                                                       &lt;enumeration value="1839"/>
     *                                                       &lt;enumeration value="2468"/>
     *                                                       &lt;enumeration value="2133"/>
     *                                                       &lt;enumeration value="2477"/>
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
     *                   &lt;element name="HalfLifeOfParentCompound">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Compartment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                                       &lt;element name="HalfLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                                       &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
     *                                       &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                                       &lt;element name="Temp" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="unitCode" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;enumeration value=""/>
     *                                                       &lt;enumeration value="2493"/>
     *                                                       &lt;enumeration value="3887"/>
     *                                                       &lt;enumeration value="3888"/>
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
     *                   &lt;element name="MineralizationRate" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
     *                           &lt;sequence>
     *                             &lt;element name="unitCode" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value=""/>
     *                                   &lt;enumeration value="8321"/>
     *                                   &lt;enumeration value="1833"/>
     *                                   &lt;enumeration value="1953"/>
     *                                   &lt;enumeration value="2109"/>
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
     *                   &lt;element name="OtherKineticParameters">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="OtherKineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *                   &lt;element name="TransformationProducts" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                   &lt;element name="IdentityTransformation">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="No" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                                       &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                                       &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
     *         &lt;element name="TransfProductsDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="EvaporationOfParentCompound" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="VolatileMetabolites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="Residues" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="DetailsOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="ResultsWithReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *         &lt;element name="AnyOtherInformationOnResultsIncl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
        "testPerformance",
        "materialMassBalance",
        "transfProductsDetails",
        "evaporationOfParentCompound",
        "volatileMetabolites",
        "residues",
        "detailsOnResults",
        "resultsWithReferenceSubstance",
        "anyOtherInformationOnResultsIncl"
    })
    public static class ResultsAndDiscussions {

        @XmlElement(name = "TestPerformance", required = true)
        protected String testPerformance;
        @XmlElement(name = "MaterialMassBalance", required = true)
        protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance materialMassBalance;
        @XmlElement(name = "TransfProductsDetails", required = true)
        protected String transfProductsDetails;
        @XmlElement(name = "EvaporationOfParentCompound", required = true)
        protected PicklistFieldWithSmallTextRemarks evaporationOfParentCompound;
        @XmlElement(name = "VolatileMetabolites", required = true)
        protected PicklistFieldWithSmallTextRemarks volatileMetabolites;
        @XmlElement(name = "Residues", required = true)
        protected PicklistFieldWithSmallTextRemarks residues;
        @XmlElement(name = "DetailsOnResults", required = true)
        protected String detailsOnResults;
        @XmlElement(name = "ResultsWithReferenceSubstance", required = true)
        protected String resultsWithReferenceSubstance;
        @XmlElement(name = "AnyOtherInformationOnResultsIncl", required = true)
        protected String anyOtherInformationOnResultsIncl;

        /**
         * Gets the value of the testPerformance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTestPerformance() {
            return testPerformance;
        }

        /**
         * Sets the value of the testPerformance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTestPerformance(String value) {
            this.testPerformance = value;
        }

        /**
         * Gets the value of the materialMassBalance property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance }
         *     
         */
        public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance getMaterialMassBalance() {
            return materialMassBalance;
        }

        /**
         * Sets the value of the materialMassBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance }
         *     
         */
        public void setMaterialMassBalance(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance value) {
            this.materialMassBalance = value;
        }

        /**
         * Gets the value of the transfProductsDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransfProductsDetails() {
            return transfProductsDetails;
        }

        /**
         * Sets the value of the transfProductsDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransfProductsDetails(String value) {
            this.transfProductsDetails = value;
        }

        /**
         * Gets the value of the evaporationOfParentCompound property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getEvaporationOfParentCompound() {
            return evaporationOfParentCompound;
        }

        /**
         * Sets the value of the evaporationOfParentCompound property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setEvaporationOfParentCompound(PicklistFieldWithSmallTextRemarks value) {
            this.evaporationOfParentCompound = value;
        }

        /**
         * Gets the value of the volatileMetabolites property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getVolatileMetabolites() {
            return volatileMetabolites;
        }

        /**
         * Sets the value of the volatileMetabolites property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setVolatileMetabolites(PicklistFieldWithSmallTextRemarks value) {
            this.volatileMetabolites = value;
        }

        /**
         * Gets the value of the residues property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getResidues() {
            return residues;
        }

        /**
         * Sets the value of the residues property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setResidues(PicklistFieldWithSmallTextRemarks value) {
            this.residues = value;
        }

        /**
         * Gets the value of the detailsOnResults property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailsOnResults() {
            return detailsOnResults;
        }

        /**
         * Sets the value of the detailsOnResults property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailsOnResults(String value) {
            this.detailsOnResults = value;
        }

        /**
         * Gets the value of the resultsWithReferenceSubstance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResultsWithReferenceSubstance() {
            return resultsWithReferenceSubstance;
        }

        /**
         * Sets the value of the resultsWithReferenceSubstance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResultsWithReferenceSubstance(String value) {
            this.resultsWithReferenceSubstance = value;
        }

        /**
         * Gets the value of the anyOtherInformationOnResultsIncl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnyOtherInformationOnResultsIncl() {
            return anyOtherInformationOnResultsIncl;
        }

        /**
         * Sets the value of the anyOtherInformationOnResultsIncl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnyOtherInformationOnResultsIncl(String value) {
            this.anyOtherInformationOnResultsIncl = value;
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
         *         &lt;element name="InWater" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *         &lt;element name="InWaterStDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *         &lt;element name="InSedimet" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *         &lt;element name="InSedimetStDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
         *         &lt;element name="Degradation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="Degr" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                             &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                             &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *                             &lt;element name="SamplingTime" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
         *                                     &lt;sequence>
         *                                       &lt;element name="unitCode" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value=""/>
         *                                             &lt;enumeration value="2113"/>
         *                                             &lt;enumeration value="1976"/>
         *                                             &lt;enumeration value="1839"/>
         *                                             &lt;enumeration value="2468"/>
         *                                             &lt;enumeration value="2133"/>
         *                                             &lt;enumeration value="2477"/>
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
         *         &lt;element name="HalfLifeOfParentCompound">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="Compartment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                             &lt;element name="HalfLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                             &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
         *                             &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                             &lt;element name="Temp" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
         *                                     &lt;sequence>
         *                                       &lt;element name="unitCode" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;enumeration value=""/>
         *                                             &lt;enumeration value="2493"/>
         *                                             &lt;enumeration value="3887"/>
         *                                             &lt;enumeration value="3888"/>
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
         *         &lt;element name="MineralizationRate" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
         *                 &lt;sequence>
         *                   &lt;element name="unitCode" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value=""/>
         *                         &lt;enumeration value="8321"/>
         *                         &lt;enumeration value="1833"/>
         *                         &lt;enumeration value="1953"/>
         *                         &lt;enumeration value="2109"/>
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
         *         &lt;element name="OtherKineticParameters">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="OtherKineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
         *         &lt;element name="TransformationProducts" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *         &lt;element name="IdentityTransformation">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="No" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                             &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                             &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
            "inWater",
            "inWaterStDev",
            "inSedimet",
            "inSedimetStDev",
            "remarks",
            "degradation",
            "halfLifeOfParentCompound",
            "mineralizationRate",
            "otherKineticParameters",
            "transformationProducts",
            "identityTransformation"
        })
        public static class MaterialMassBalance {

            @XmlElement(name = "InWater", required = true, nillable = true)
            protected BigDecimal inWater;
            @XmlElement(name = "InWaterStDev", required = true, nillable = true)
            protected BigDecimal inWaterStDev;
            @XmlElement(name = "InSedimet", required = true, nillable = true)
            protected BigDecimal inSedimet;
            @XmlElement(name = "InSedimetStDev", required = true, nillable = true)
            protected BigDecimal inSedimetStDev;
            @XmlElement(name = "Remarks", required = true)
            protected String remarks;
            @XmlElement(name = "Degradation", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation degradation;
            @XmlElement(name = "HalfLifeOfParentCompound", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound halfLifeOfParentCompound;
            @XmlElement(name = "MineralizationRate")
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.MineralizationRate mineralizationRate;
            @XmlElement(name = "OtherKineticParameters", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters otherKineticParameters;
            @XmlElement(name = "TransformationProducts", required = true)
            protected PicklistFieldWithSmallTextRemarks transformationProducts;
            @XmlElement(name = "IdentityTransformation", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation identityTransformation;

            /**
             * Gets the value of the inWater property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInWater() {
                return inWater;
            }

            /**
             * Sets the value of the inWater property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInWater(BigDecimal value) {
                this.inWater = value;
            }

            /**
             * Gets the value of the inWaterStDev property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInWaterStDev() {
                return inWaterStDev;
            }

            /**
             * Sets the value of the inWaterStDev property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInWaterStDev(BigDecimal value) {
                this.inWaterStDev = value;
            }

            /**
             * Gets the value of the inSedimet property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInSedimet() {
                return inSedimet;
            }

            /**
             * Sets the value of the inSedimet property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInSedimet(BigDecimal value) {
                this.inSedimet = value;
            }

            /**
             * Gets the value of the inSedimetStDev property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getInSedimetStDev() {
                return inSedimetStDev;
            }

            /**
             * Sets the value of the inSedimetStDev property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setInSedimetStDev(BigDecimal value) {
                this.inSedimetStDev = value;
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
             * Gets the value of the degradation property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation getDegradation() {
                return degradation;
            }

            /**
             * Sets the value of the degradation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation }
             *     
             */
            public void setDegradation(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation value) {
                this.degradation = value;
            }

            /**
             * Gets the value of the halfLifeOfParentCompound property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound getHalfLifeOfParentCompound() {
                return halfLifeOfParentCompound;
            }

            /**
             * Sets the value of the halfLifeOfParentCompound property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound }
             *     
             */
            public void setHalfLifeOfParentCompound(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound value) {
                this.halfLifeOfParentCompound = value;
            }

            /**
             * Gets the value of the mineralizationRate property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.MineralizationRate }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.MineralizationRate getMineralizationRate() {
                return mineralizationRate;
            }

            /**
             * Sets the value of the mineralizationRate property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.MineralizationRate }
             *     
             */
            public void setMineralizationRate(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.MineralizationRate value) {
                this.mineralizationRate = value;
            }

            /**
             * Gets the value of the otherKineticParameters property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters getOtherKineticParameters() {
                return otherKineticParameters;
            }

            /**
             * Sets the value of the otherKineticParameters property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters }
             *     
             */
            public void setOtherKineticParameters(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters value) {
                this.otherKineticParameters = value;
            }

            /**
             * Gets the value of the transformationProducts property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public PicklistFieldWithSmallTextRemarks getTransformationProducts() {
                return transformationProducts;
            }

            /**
             * Sets the value of the transformationProducts property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public void setTransformationProducts(PicklistFieldWithSmallTextRemarks value) {
                this.transformationProducts = value;
            }

            /**
             * Gets the value of the identityTransformation property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation getIdentityTransformation() {
                return identityTransformation;
            }

            /**
             * Sets the value of the identityTransformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation }
             *     
             */
            public void setIdentityTransformation(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation value) {
                this.identityTransformation = value;
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
             *                   &lt;element name="Degr" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *                   &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *                   &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
             *                   &lt;element name="SamplingTime" minOccurs="0">
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
             *                                   &lt;enumeration value="2477"/>
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
            public static class Degradation {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry>();
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
                 *         &lt;element name="Degr" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
                 *         &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
                 *         &lt;element name="Parameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
                 *         &lt;element name="SamplingTime" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value=""/>
                 *                         &lt;enumeration value="2113"/>
                 *                         &lt;enumeration value="1976"/>
                 *                         &lt;enumeration value="1839"/>
                 *                         &lt;enumeration value="2468"/>
                 *                         &lt;enumeration value="2133"/>
                 *                         &lt;enumeration value="2477"/>
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
                    "degr",
                    "stDev",
                    "parameter",
                    "samplingTime",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "Degr", required = true)
                    protected PhysicalQuantityRangeField degr;
                    @XmlElement(name = "StDev", required = true, nillable = true)
                    protected BigDecimal stDev;
                    @XmlElement(name = "Parameter", required = true)
                    protected PicklistFieldWithSmallTextRemarks parameter;
                    @XmlElement(name = "SamplingTime")
                    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry.SamplingTime samplingTime;
                    @XmlElement(name = "Remarks", required = true)
                    protected String remarks;

                    /**
                     * Gets the value of the degr property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PhysicalQuantityRangeField }
                     *     
                     */
                    public PhysicalQuantityRangeField getDegr() {
                        return degr;
                    }

                    /**
                     * Sets the value of the degr property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PhysicalQuantityRangeField }
                     *     
                     */
                    public void setDegr(PhysicalQuantityRangeField value) {
                        this.degr = value;
                    }

                    /**
                     * Gets the value of the stDev property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getStDev() {
                        return stDev;
                    }

                    /**
                     * Sets the value of the stDev property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setStDev(BigDecimal value) {
                        this.stDev = value;
                    }

                    /**
                     * Gets the value of the parameter property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getParameter() {
                        return parameter;
                    }

                    /**
                     * Sets the value of the parameter property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setParameter(PicklistFieldWithSmallTextRemarks value) {
                        this.parameter = value;
                    }

                    /**
                     * Gets the value of the samplingTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry.SamplingTime }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry.SamplingTime getSamplingTime() {
                        return samplingTime;
                    }

                    /**
                     * Sets the value of the samplingTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry.SamplingTime }
                     *     
                     */
                    public void setSamplingTime(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.Degradation.Entry.SamplingTime value) {
                        this.samplingTime = value;
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
                     *               &lt;enumeration value="2113"/>
                     *               &lt;enumeration value="1976"/>
                     *               &lt;enumeration value="1839"/>
                     *               &lt;enumeration value="2468"/>
                     *               &lt;enumeration value="2133"/>
                     *               &lt;enumeration value="2477"/>
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
                    public static class SamplingTime
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
             *                   &lt;element name="Compartment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *                   &lt;element name="HalfLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *                   &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
             *                   &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *                   &lt;element name="Temp" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
             *                           &lt;sequence>
             *                             &lt;element name="unitCode" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;enumeration value=""/>
             *                                   &lt;enumeration value="2493"/>
             *                                   &lt;enumeration value="3887"/>
             *                                   &lt;enumeration value="3888"/>
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
            public static class HalfLifeOfParentCompound {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry>();
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
                 *         &lt;element name="Compartment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
                 *         &lt;element name="HalfLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
                 *         &lt;element name="StDev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
                 *         &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
                 *         &lt;element name="Temp" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
                 *                 &lt;sequence>
                 *                   &lt;element name="unitCode" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;enumeration value=""/>
                 *                         &lt;enumeration value="2493"/>
                 *                         &lt;enumeration value="3887"/>
                 *                         &lt;enumeration value="3888"/>
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
                    "compartment",
                    "halfLife",
                    "stDev",
                    "type",
                    "temp",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "Compartment", required = true)
                    protected PicklistField compartment;
                    @XmlElement(name = "HalfLife", required = true)
                    protected PhysicalQuantityRangeField halfLife;
                    @XmlElement(name = "StDev", required = true, nillable = true)
                    protected BigDecimal stDev;
                    @XmlElement(name = "Type", required = true)
                    protected PicklistField type;
                    @XmlElement(name = "Temp")
                    protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry.Temp temp;
                    @XmlElement(name = "Remarks", required = true)
                    protected String remarks;

                    /**
                     * Gets the value of the compartment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistField }
                     *     
                     */
                    public PicklistField getCompartment() {
                        return compartment;
                    }

                    /**
                     * Sets the value of the compartment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistField }
                     *     
                     */
                    public void setCompartment(PicklistField value) {
                        this.compartment = value;
                    }

                    /**
                     * Gets the value of the halfLife property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PhysicalQuantityRangeField }
                     *     
                     */
                    public PhysicalQuantityRangeField getHalfLife() {
                        return halfLife;
                    }

                    /**
                     * Sets the value of the halfLife property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PhysicalQuantityRangeField }
                     *     
                     */
                    public void setHalfLife(PhysicalQuantityRangeField value) {
                        this.halfLife = value;
                    }

                    /**
                     * Gets the value of the stDev property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getStDev() {
                        return stDev;
                    }

                    /**
                     * Sets the value of the stDev property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setStDev(BigDecimal value) {
                        this.stDev = value;
                    }

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
                     * Gets the value of the temp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry.Temp }
                     *     
                     */
                    public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry.Temp getTemp() {
                        return temp;
                    }

                    /**
                     * Sets the value of the temp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry.Temp }
                     *     
                     */
                    public void setTemp(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.HalfLifeOfParentCompound.Entry.Temp value) {
                        this.temp = value;
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
                     *               &lt;enumeration value="2493"/>
                     *               &lt;enumeration value="3887"/>
                     *               &lt;enumeration value="3888"/>
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
                    public static class Temp
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
             *                   &lt;element name="No" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *                   &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *                   &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
            public static class IdentityTransformation {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.IdentityTransformation.Entry>();
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
                 *         &lt;element name="No" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
                 *         &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
                 *         &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
                    "no",
                    "identifier",
                    "identity"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "No", required = true)
                    protected PicklistField no;
                    @XmlElement(name = "Identifier", required = true)
                    protected PicklistField identifier;
                    @XmlElement(name = "Identity", required = true)
                    protected String identity;

                    /**
                     * Gets the value of the no property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistField }
                     *     
                     */
                    public PicklistField getNo() {
                        return no;
                    }

                    /**
                     * Sets the value of the no property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistField }
                     *     
                     */
                    public void setNo(PicklistField value) {
                        this.no = value;
                    }

                    /**
                     * Gets the value of the identifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistField }
                     *     
                     */
                    public PicklistField getIdentifier() {
                        return identifier;
                    }

                    /**
                     * Sets the value of the identifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistField }
                     *     
                     */
                    public void setIdentifier(PicklistField value) {
                        this.identifier = value;
                    }

                    /**
                     * Gets the value of the identity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIdentity() {
                        return identity;
                    }

                    /**
                     * Sets the value of the identity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIdentity(String value) {
                        this.identity = value;
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
             *       &lt;sequence>
             *         &lt;element name="unitCode" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value=""/>
             *               &lt;enumeration value="8321"/>
             *               &lt;enumeration value="1833"/>
             *               &lt;enumeration value="1953"/>
             *               &lt;enumeration value="2109"/>
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
            public static class MineralizationRate
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
             *                   &lt;element name="OtherKineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            public static class OtherKineticParameters {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.ResultsAndDiscussions.MaterialMassBalance.OtherKineticParameters.Entry>();
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
                 *         &lt;element name="OtherKineticParameters" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                    "otherKineticParameters"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "OtherKineticParameters", required = true)
                    protected PicklistFieldWithSmallTextRemarks otherKineticParameters;

                    /**
                     * Gets the value of the otherKineticParameters property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getOtherKineticParameters() {
                        return otherKineticParameters;
                    }

                    /**
                     * Sets the value of the otherKineticParameters property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setOtherKineticParameters(PicklistFieldWithSmallTextRemarks value) {
                        this.otherKineticParameters = value;
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
     *         &lt;element name="Indicator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="Identity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
     *         &lt;element name="Form" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="Details" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="ConfidentialDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="OtherInfo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
     *         &lt;element name="Radiolabelling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="DetailsOnProperties" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *         &lt;element name="StudyDesign">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OxygenConditions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *                   &lt;element name="Inoculum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="SurfacewaterDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="SedimentDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="InoculumDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="DurationOfTest" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                   &lt;element name="InitialTestSubstanceConcentration">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="InitialConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                                       &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *                   &lt;element name="ParameterFollowed">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ParameterBiodegradation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
     *                   &lt;element name="AnalytMethodDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="StudydesignDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="ReferenceSubstance">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
        "indicator",
        "identity",
        "form",
        "details",
        "confidentialDetails",
        "otherInfo",
        "radiolabelling",
        "detailsOnProperties",
        "studyDesign"
    })
    public static class TestMaterials {

        @XmlElement(name = "Indicator", required = true)
        protected PicklistField indicator;
        @XmlElement(name = "Identity", required = true)
        protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity identity;
        @XmlElement(name = "Form", required = true)
        protected PicklistField form;
        @XmlElement(name = "Details", required = true)
        protected String details;
        @XmlElement(name = "ConfidentialDetails", required = true)
        protected String confidentialDetails;
        @XmlElement(name = "OtherInfo", required = true)
        protected String otherInfo;
        @XmlElement(name = "Radiolabelling", required = true)
        protected PicklistFieldWithSmallTextRemarks radiolabelling;
        @XmlElement(name = "DetailsOnProperties", required = true)
        protected String detailsOnProperties;
        @XmlElement(name = "StudyDesign", required = true)
        protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign studyDesign;

        /**
         * Gets the value of the indicator property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getIndicator() {
            return indicator;
        }

        /**
         * Sets the value of the indicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setIndicator(PicklistField value) {
            this.indicator = value;
        }

        /**
         * Gets the value of the identity property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity }
         *     
         */
        public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity getIdentity() {
            return identity;
        }

        /**
         * Sets the value of the identity property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity }
         *     
         */
        public void setIdentity(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity value) {
            this.identity = value;
        }

        /**
         * Gets the value of the form property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getForm() {
            return form;
        }

        /**
         * Sets the value of the form property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setForm(PicklistField value) {
            this.form = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetails(String value) {
            this.details = value;
        }

        /**
         * Gets the value of the confidentialDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConfidentialDetails() {
            return confidentialDetails;
        }

        /**
         * Sets the value of the confidentialDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConfidentialDetails(String value) {
            this.confidentialDetails = value;
        }

        /**
         * Gets the value of the otherInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherInfo() {
            return otherInfo;
        }

        /**
         * Sets the value of the otherInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherInfo(String value) {
            this.otherInfo = value;
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

        /**
         * Gets the value of the detailsOnProperties property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailsOnProperties() {
            return detailsOnProperties;
        }

        /**
         * Sets the value of the detailsOnProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailsOnProperties(String value) {
            this.detailsOnProperties = value;
        }

        /**
         * Gets the value of the studyDesign property.
         * 
         * @return
         *     possible object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign }
         *     
         */
        public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign getStudyDesign() {
            return studyDesign;
        }

        /**
         * Sets the value of the studyDesign property.
         * 
         * @param value
         *     allowed object is
         *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign }
         *     
         */
        public void setStudyDesign(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign value) {
            this.studyDesign = value;
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
         *                   &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
        public static class Identity {

            protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity.Entry> entry;

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
             * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity.Entry }
             * 
             * 
             */
            public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.Identity.Entry>();
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
             *         &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
                "identifier",
                "id"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Identifier", required = true)
                protected PicklistField identifier;
                @XmlElement(name = "Id", required = true)
                protected String id;

                /**
                 * Gets the value of the identifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getIdentifier() {
                    return identifier;
                }

                /**
                 * Sets the value of the identifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setIdentifier(PicklistField value) {
                    this.identifier = value;
                }

                /**
                 * Gets the value of the id property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
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
         *         &lt;element name="OxygenConditions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
         *         &lt;element name="Inoculum" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="SurfacewaterDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="SedimentDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="InoculumDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="DurationOfTest" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *         &lt;element name="InitialTestSubstanceConcentration">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="InitialConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                             &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
         *         &lt;element name="ParameterFollowed">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ParameterBiodegradation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
         *         &lt;element name="AnalytMethodDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="StudydesignDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="ReferenceSubstance">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            "oxygenConditions",
            "inoculum",
            "surfacewaterDetails",
            "sedimentDetails",
            "inoculumDetails",
            "durationOfTest",
            "initialTestSubstanceConcentration",
            "parameterFollowed",
            "analytMethodDetails",
            "studydesignDetails",
            "referenceSubstance"
        })
        public static class StudyDesign {

            @XmlElement(name = "OxygenConditions", required = true)
            protected PicklistFieldWithSmallTextRemarks oxygenConditions;
            @XmlElement(name = "Inoculum", required = true)
            protected PicklistField inoculum;
            @XmlElement(name = "SurfacewaterDetails", required = true)
            protected String surfacewaterDetails;
            @XmlElement(name = "SedimentDetails", required = true)
            protected String sedimentDetails;
            @XmlElement(name = "InoculumDetails", required = true)
            protected String inoculumDetails;
            @XmlElement(name = "DurationOfTest", required = true)
            protected PhysicalQuantityRangeField durationOfTest;
            @XmlElement(name = "InitialTestSubstanceConcentration", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration initialTestSubstanceConcentration;
            @XmlElement(name = "ParameterFollowed", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed parameterFollowed;
            @XmlElement(name = "AnalytMethodDetails", required = true)
            protected String analytMethodDetails;
            @XmlElement(name = "StudydesignDetails", required = true)
            protected String studydesignDetails;
            @XmlElement(name = "ReferenceSubstance", required = true)
            protected ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance referenceSubstance;

            /**
             * Gets the value of the oxygenConditions property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public PicklistFieldWithSmallTextRemarks getOxygenConditions() {
                return oxygenConditions;
            }

            /**
             * Sets the value of the oxygenConditions property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithSmallTextRemarks }
             *     
             */
            public void setOxygenConditions(PicklistFieldWithSmallTextRemarks value) {
                this.oxygenConditions = value;
            }

            /**
             * Gets the value of the inoculum property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getInoculum() {
                return inoculum;
            }

            /**
             * Sets the value of the inoculum property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setInoculum(PicklistField value) {
                this.inoculum = value;
            }

            /**
             * Gets the value of the surfacewaterDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurfacewaterDetails() {
                return surfacewaterDetails;
            }

            /**
             * Sets the value of the surfacewaterDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurfacewaterDetails(String value) {
                this.surfacewaterDetails = value;
            }

            /**
             * Gets the value of the sedimentDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSedimentDetails() {
                return sedimentDetails;
            }

            /**
             * Sets the value of the sedimentDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSedimentDetails(String value) {
                this.sedimentDetails = value;
            }

            /**
             * Gets the value of the inoculumDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInoculumDetails() {
                return inoculumDetails;
            }

            /**
             * Sets the value of the inoculumDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInoculumDetails(String value) {
                this.inoculumDetails = value;
            }

            /**
             * Gets the value of the durationOfTest property.
             * 
             * @return
             *     possible object is
             *     {@link PhysicalQuantityRangeField }
             *     
             */
            public PhysicalQuantityRangeField getDurationOfTest() {
                return durationOfTest;
            }

            /**
             * Sets the value of the durationOfTest property.
             * 
             * @param value
             *     allowed object is
             *     {@link PhysicalQuantityRangeField }
             *     
             */
            public void setDurationOfTest(PhysicalQuantityRangeField value) {
                this.durationOfTest = value;
            }

            /**
             * Gets the value of the initialTestSubstanceConcentration property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration getInitialTestSubstanceConcentration() {
                return initialTestSubstanceConcentration;
            }

            /**
             * Sets the value of the initialTestSubstanceConcentration property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration }
             *     
             */
            public void setInitialTestSubstanceConcentration(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration value) {
                this.initialTestSubstanceConcentration = value;
            }

            /**
             * Gets the value of the parameterFollowed property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed getParameterFollowed() {
                return parameterFollowed;
            }

            /**
             * Sets the value of the parameterFollowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed }
             *     
             */
            public void setParameterFollowed(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed value) {
                this.parameterFollowed = value;
            }

            /**
             * Gets the value of the analytMethodDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnalytMethodDetails() {
                return analytMethodDetails;
            }

            /**
             * Sets the value of the analytMethodDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnalytMethodDetails(String value) {
                this.analytMethodDetails = value;
            }

            /**
             * Gets the value of the studydesignDetails property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudydesignDetails() {
                return studydesignDetails;
            }

            /**
             * Sets the value of the studydesignDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudydesignDetails(String value) {
                this.studydesignDetails = value;
            }

            /**
             * Gets the value of the referenceSubstance property.
             * 
             * @return
             *     possible object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance }
             *     
             */
            public ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance getReferenceSubstance() {
                return referenceSubstance;
            }

            /**
             * Sets the value of the referenceSubstance property.
             * 
             * @param value
             *     allowed object is
             *     {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance }
             *     
             */
            public void setReferenceSubstance(ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance value) {
                this.referenceSubstance = value;
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
             *                   &lt;element name="InitialConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *                   &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            public static class InitialTestSubstanceConcentration {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.InitialTestSubstanceConcentration.Entry>();
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
                 *         &lt;element name="InitialConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
                 *         &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                    "initialConc",
                    "basedOn"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "InitialConc", required = true)
                    protected PhysicalQuantityRangeField initialConc;
                    @XmlElement(name = "BasedOn", required = true)
                    protected PicklistFieldWithSmallTextRemarks basedOn;

                    /**
                     * Gets the value of the initialConc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PhysicalQuantityRangeField }
                     *     
                     */
                    public PhysicalQuantityRangeField getInitialConc() {
                        return initialConc;
                    }

                    /**
                     * Sets the value of the initialConc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PhysicalQuantityRangeField }
                     *     
                     */
                    public void setInitialConc(PhysicalQuantityRangeField value) {
                        this.initialConc = value;
                    }

                    /**
                     * Gets the value of the basedOn property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getBasedOn() {
                        return basedOn;
                    }

                    /**
                     * Sets the value of the basedOn property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setBasedOn(PicklistFieldWithSmallTextRemarks value) {
                        this.basedOn = value;
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
             *                   &lt;element name="ParameterBiodegradation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            public static class ParameterFollowed {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ParameterFollowed.Entry>();
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
                 *         &lt;element name="ParameterBiodegradation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                    "parameterBiodegradation"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ParameterBiodegradation", required = true)
                    protected PicklistFieldWithSmallTextRemarks parameterBiodegradation;

                    /**
                     * Gets the value of the parameterBiodegradation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getParameterBiodegradation() {
                        return parameterBiodegradation;
                    }

                    /**
                     * Sets the value of the parameterBiodegradation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setParameterBiodegradation(PicklistFieldWithSmallTextRemarks value) {
                        this.parameterBiodegradation = value;
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
             *                   &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
            public static class ReferenceSubstance {

                protected List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance.Entry> entry;

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
                 * {@link ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance.Entry }
                 * 
                 * 
                 */
                public List<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<ENDPOINTSTUDYRECORDBiodegradationIinWaterAndSedimentSimulationTests.TestMaterials.StudyDesign.ReferenceSubstance.Entry>();
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
                 *         &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
                    "referenceSubstance"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ReferenceSubstance", required = true)
                    protected PicklistFieldWithSmallTextRemarks referenceSubstance;

                    /**
                     * Gets the value of the referenceSubstance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public PicklistFieldWithSmallTextRemarks getReferenceSubstance() {
                        return referenceSubstance;
                    }

                    /**
                     * Sets the value of the referenceSubstance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PicklistFieldWithSmallTextRemarks }
                     *     
                     */
                    public void setReferenceSubstance(PicklistFieldWithSmallTextRemarks value) {
                        this.referenceSubstance = value;
                    }

                }

            }

        }

    }

}
