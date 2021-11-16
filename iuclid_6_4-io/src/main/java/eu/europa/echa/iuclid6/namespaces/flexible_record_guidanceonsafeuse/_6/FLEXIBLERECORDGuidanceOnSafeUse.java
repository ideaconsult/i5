
package eu.europa.echa.iuclid6.namespaces.flexible_record_guidanceonsafeuse._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
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
 *                             &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N64" minOccurs="0"/>
 *                             &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N78" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FirstAidMeasures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FirstAidMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FireFightingMeasures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FireFightingMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccidentalReleaseMeasures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccidentalReleaseMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HandlingAndStorage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HandlingAndStorage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransportInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LandTransport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                             &lt;element name="Shipping" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
 *                                                 &lt;element name="Language" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;element name="Class" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CompatibilityGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PackagingGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="SpecialProvisions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="InlandWaterwayTransport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                             &lt;element name="Shipping" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
 *                                                 &lt;element name="Language" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;element name="Class" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CompatibilityGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PackagingGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Remarks" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="MarineTransport" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                             &lt;element name="Shipping" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
 *                                                 &lt;element name="Language" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;element name="Class" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CompatibilityGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PackagingGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="EmsNumber" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_MARINE_EMS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="MarinePollutant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="Remarks" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="AirTransportIcaoIata" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                             &lt;element name="Shipping" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
 *                                                 &lt;element name="Language" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *                             &lt;element name="Class" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CompatibilityGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PackagingGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
 *                                       &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Remarks" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="AdditionalTransportInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SpecialProvisions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="ExposureControlsPersonalProtection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExposureControlsPersonalProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StabilityAndReactivity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StabilityAndReactivity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisposalConsiderations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DisposalConsiderations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
    "firstAidMeasures",
    "fireFightingMeasures",
    "accidentalReleaseMeasures",
    "handlingAndStorage",
    "transportInformation",
    "exposureControlsPersonalProtection",
    "stabilityAndReactivity",
    "disposalConsiderations"
})
@XmlRootElement(name = "FLEXIBLE_RECORD.GuidanceOnSafeUse")
public class FLEXIBLERECORDGuidanceOnSafeUse {

    @XmlElement(name = "AdministrativeData")
    protected FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData administrativeData;
    @XmlElement(name = "FirstAidMeasures")
    protected FLEXIBLERECORDGuidanceOnSafeUse.FirstAidMeasures firstAidMeasures;
    @XmlElement(name = "FireFightingMeasures")
    protected FLEXIBLERECORDGuidanceOnSafeUse.FireFightingMeasures fireFightingMeasures;
    @XmlElement(name = "AccidentalReleaseMeasures")
    protected FLEXIBLERECORDGuidanceOnSafeUse.AccidentalReleaseMeasures accidentalReleaseMeasures;
    @XmlElement(name = "HandlingAndStorage")
    protected FLEXIBLERECORDGuidanceOnSafeUse.HandlingAndStorage handlingAndStorage;
    @XmlElement(name = "TransportInformation")
    protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation transportInformation;
    @XmlElement(name = "ExposureControlsPersonalProtection")
    protected FLEXIBLERECORDGuidanceOnSafeUse.ExposureControlsPersonalProtection exposureControlsPersonalProtection;
    @XmlElement(name = "StabilityAndReactivity")
    protected FLEXIBLERECORDGuidanceOnSafeUse.StabilityAndReactivity stabilityAndReactivity;
    @XmlElement(name = "DisposalConsiderations")
    protected FLEXIBLERECORDGuidanceOnSafeUse.DisposalConsiderations disposalConsiderations;

    /**
     * Gets the value of the administrativeData property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData getAdministrativeData() {
        return administrativeData;
    }

    /**
     * Sets the value of the administrativeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData }
     *     
     */
    public void setAdministrativeData(FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData value) {
        this.administrativeData = value;
    }

    /**
     * Gets the value of the firstAidMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.FirstAidMeasures }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.FirstAidMeasures getFirstAidMeasures() {
        return firstAidMeasures;
    }

    /**
     * Sets the value of the firstAidMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.FirstAidMeasures }
     *     
     */
    public void setFirstAidMeasures(FLEXIBLERECORDGuidanceOnSafeUse.FirstAidMeasures value) {
        this.firstAidMeasures = value;
    }

    /**
     * Gets the value of the fireFightingMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.FireFightingMeasures }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.FireFightingMeasures getFireFightingMeasures() {
        return fireFightingMeasures;
    }

    /**
     * Sets the value of the fireFightingMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.FireFightingMeasures }
     *     
     */
    public void setFireFightingMeasures(FLEXIBLERECORDGuidanceOnSafeUse.FireFightingMeasures value) {
        this.fireFightingMeasures = value;
    }

    /**
     * Gets the value of the accidentalReleaseMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.AccidentalReleaseMeasures }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.AccidentalReleaseMeasures getAccidentalReleaseMeasures() {
        return accidentalReleaseMeasures;
    }

    /**
     * Sets the value of the accidentalReleaseMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.AccidentalReleaseMeasures }
     *     
     */
    public void setAccidentalReleaseMeasures(FLEXIBLERECORDGuidanceOnSafeUse.AccidentalReleaseMeasures value) {
        this.accidentalReleaseMeasures = value;
    }

    /**
     * Gets the value of the handlingAndStorage property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.HandlingAndStorage }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.HandlingAndStorage getHandlingAndStorage() {
        return handlingAndStorage;
    }

    /**
     * Sets the value of the handlingAndStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.HandlingAndStorage }
     *     
     */
    public void setHandlingAndStorage(FLEXIBLERECORDGuidanceOnSafeUse.HandlingAndStorage value) {
        this.handlingAndStorage = value;
    }

    /**
     * Gets the value of the transportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation getTransportInformation() {
        return transportInformation;
    }

    /**
     * Sets the value of the transportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation }
     *     
     */
    public void setTransportInformation(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation value) {
        this.transportInformation = value;
    }

    /**
     * Gets the value of the exposureControlsPersonalProtection property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.ExposureControlsPersonalProtection }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.ExposureControlsPersonalProtection getExposureControlsPersonalProtection() {
        return exposureControlsPersonalProtection;
    }

    /**
     * Sets the value of the exposureControlsPersonalProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.ExposureControlsPersonalProtection }
     *     
     */
    public void setExposureControlsPersonalProtection(FLEXIBLERECORDGuidanceOnSafeUse.ExposureControlsPersonalProtection value) {
        this.exposureControlsPersonalProtection = value;
    }

    /**
     * Gets the value of the stabilityAndReactivity property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.StabilityAndReactivity }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.StabilityAndReactivity getStabilityAndReactivity() {
        return stabilityAndReactivity;
    }

    /**
     * Sets the value of the stabilityAndReactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.StabilityAndReactivity }
     *     
     */
    public void setStabilityAndReactivity(FLEXIBLERECORDGuidanceOnSafeUse.StabilityAndReactivity value) {
        this.stabilityAndReactivity = value;
    }

    /**
     * Gets the value of the disposalConsiderations property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.DisposalConsiderations }
     *     
     */
    public FLEXIBLERECORDGuidanceOnSafeUse.DisposalConsiderations getDisposalConsiderations() {
        return disposalConsiderations;
    }

    /**
     * Sets the value of the disposalConsiderations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.DisposalConsiderations }
     *     
     */
    public void setDisposalConsiderations(FLEXIBLERECORDGuidanceOnSafeUse.DisposalConsiderations value) {
        this.disposalConsiderations = value;
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
     *         &lt;element name="AccidentalReleaseMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "accidentalReleaseMeasures"
    })
    public static class AccidentalReleaseMeasures {

        @XmlElement(name = "AccidentalReleaseMeasures")
        protected List<MultilingualTextFieldLarge> accidentalReleaseMeasures;

        /**
         * Gets the value of the accidentalReleaseMeasures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accidentalReleaseMeasures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccidentalReleaseMeasures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getAccidentalReleaseMeasures() {
            if (accidentalReleaseMeasures == null) {
                accidentalReleaseMeasures = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.accidentalReleaseMeasures;
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
     *         &lt;element name="DataProtection" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
     *                 &lt;sequence>
     *                   &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N64" minOccurs="0"/>
     *                   &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N78" minOccurs="0"/>
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
        "dataProtection"
    })
    public static class AdministrativeData {

        @XmlElement(name = "DataProtection")
        protected FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection dataProtection;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection }
         *     
         */
        public FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection }
         *     
         */
        public void setDataProtection(FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection value) {
            this.dataProtection = value;
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
         *         &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N64" minOccurs="0"/>
         *         &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N78" minOccurs="0"/>
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
            protected List<FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection.Legislation> legislation;

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
             * {@link FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection.Legislation }
             * 
             * 
             */
            public List<FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.AdministrativeData.DataProtection.Legislation>();
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N78" minOccurs="0"/>
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
     *         &lt;element name="DisposalConsiderations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "disposalConsiderations"
    })
    public static class DisposalConsiderations {

        @XmlElement(name = "DisposalConsiderations")
        protected List<MultilingualTextFieldLarge> disposalConsiderations;

        /**
         * Gets the value of the disposalConsiderations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disposalConsiderations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisposalConsiderations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getDisposalConsiderations() {
            if (disposalConsiderations == null) {
                disposalConsiderations = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.disposalConsiderations;
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
     *         &lt;element name="ExposureControlsPersonalProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "exposureControlsPersonalProtection"
    })
    public static class ExposureControlsPersonalProtection {

        @XmlElement(name = "ExposureControlsPersonalProtection")
        protected List<MultilingualTextFieldLarge> exposureControlsPersonalProtection;

        /**
         * Gets the value of the exposureControlsPersonalProtection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exposureControlsPersonalProtection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExposureControlsPersonalProtection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getExposureControlsPersonalProtection() {
            if (exposureControlsPersonalProtection == null) {
                exposureControlsPersonalProtection = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.exposureControlsPersonalProtection;
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
     *         &lt;element name="FireFightingMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "fireFightingMeasures"
    })
    public static class FireFightingMeasures {

        @XmlElement(name = "FireFightingMeasures")
        protected List<MultilingualTextFieldLarge> fireFightingMeasures;

        /**
         * Gets the value of the fireFightingMeasures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fireFightingMeasures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFireFightingMeasures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getFireFightingMeasures() {
            if (fireFightingMeasures == null) {
                fireFightingMeasures = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.fireFightingMeasures;
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
     *         &lt;element name="FirstAidMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "firstAidMeasures"
    })
    public static class FirstAidMeasures {

        @XmlElement(name = "FirstAidMeasures")
        protected List<MultilingualTextFieldLarge> firstAidMeasures;

        /**
         * Gets the value of the firstAidMeasures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firstAidMeasures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFirstAidMeasures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getFirstAidMeasures() {
            if (firstAidMeasures == null) {
                firstAidMeasures = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.firstAidMeasures;
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
     *         &lt;element name="HandlingAndStorage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "handlingAndStorage"
    })
    public static class HandlingAndStorage {

        @XmlElement(name = "HandlingAndStorage")
        protected List<MultilingualTextFieldLarge> handlingAndStorage;

        /**
         * Gets the value of the handlingAndStorage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the handlingAndStorage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHandlingAndStorage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getHandlingAndStorage() {
            if (handlingAndStorage == null) {
                handlingAndStorage = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.handlingAndStorage;
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
     *         &lt;element name="StabilityAndReactivity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "stabilityAndReactivity"
    })
    public static class StabilityAndReactivity {

        @XmlElement(name = "StabilityAndReactivity")
        protected List<MultilingualTextFieldLarge> stabilityAndReactivity;

        /**
         * Gets the value of the stabilityAndReactivity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stabilityAndReactivity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStabilityAndReactivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getStabilityAndReactivity() {
            if (stabilityAndReactivity == null) {
                stabilityAndReactivity = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.stabilityAndReactivity;
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
     *         &lt;element name="LandTransport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *                   &lt;element name="Shipping" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
     *                                       &lt;element name="Language" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="Class" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CompatibilityGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PackagingGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="SpecialProvisions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="InlandWaterwayTransport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *                   &lt;element name="Shipping" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
     *                                       &lt;element name="Language" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="Class" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CompatibilityGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PackagingGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Remarks" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="MarineTransport" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *                   &lt;element name="Shipping" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
     *                                       &lt;element name="Language" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="Class" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CompatibilityGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PackagingGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="EmsNumber" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_MARINE_EMS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="MarinePollutant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="Remarks" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="AirTransportIcaoIata" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *                   &lt;element name="Shipping" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
     *                                       &lt;element name="Language" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
     *                   &lt;element name="Class" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CompatibilityGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PackagingGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
     *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Remarks" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
     *         &lt;element name="AdditionalTransportInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SpecialProvisions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "landTransport",
        "inlandWaterwayTransport",
        "marineTransport",
        "airTransportIcaoIata",
        "additionalTransportInformation"
    })
    public static class TransportInformation {

        @XmlElement(name = "LandTransport")
        protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport landTransport;
        @XmlElement(name = "InlandWaterwayTransport")
        protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport inlandWaterwayTransport;
        @XmlElement(name = "MarineTransport")
        protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport marineTransport;
        @XmlElement(name = "AirTransportIcaoIata")
        protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata airTransportIcaoIata;
        @XmlElement(name = "AdditionalTransportInformation")
        protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation additionalTransportInformation;

        /**
         * Gets the value of the landTransport property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport }
         *     
         */
        public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport getLandTransport() {
            return landTransport;
        }

        /**
         * Sets the value of the landTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport }
         *     
         */
        public void setLandTransport(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport value) {
            this.landTransport = value;
        }

        /**
         * Gets the value of the inlandWaterwayTransport property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport }
         *     
         */
        public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport getInlandWaterwayTransport() {
            return inlandWaterwayTransport;
        }

        /**
         * Sets the value of the inlandWaterwayTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport }
         *     
         */
        public void setInlandWaterwayTransport(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport value) {
            this.inlandWaterwayTransport = value;
        }

        /**
         * Gets the value of the marineTransport property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport }
         *     
         */
        public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport getMarineTransport() {
            return marineTransport;
        }

        /**
         * Sets the value of the marineTransport property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport }
         *     
         */
        public void setMarineTransport(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport value) {
            this.marineTransport = value;
        }

        /**
         * Gets the value of the airTransportIcaoIata property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata }
         *     
         */
        public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata getAirTransportIcaoIata() {
            return airTransportIcaoIata;
        }

        /**
         * Sets the value of the airTransportIcaoIata property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata }
         *     
         */
        public void setAirTransportIcaoIata(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata value) {
            this.airTransportIcaoIata = value;
        }

        /**
         * Gets the value of the additionalTransportInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation }
         *     
         */
        public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation getAdditionalTransportInformation() {
            return additionalTransportInformation;
        }

        /**
         * Sets the value of the additionalTransportInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation }
         *     
         */
        public void setAdditionalTransportInformation(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation value) {
            this.additionalTransportInformation = value;
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
         *         &lt;element name="SpecialProvisions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "specialProvisions"
        })
        public static class AdditionalTransportInformation {

            @XmlElement(name = "SpecialProvisions")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions specialProvisions;

            /**
             * Gets the value of the specialProvisions property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions getSpecialProvisions() {
                return specialProvisions;
            }

            /**
             * Sets the value of the specialProvisions property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions }
             *     
             */
            public void setSpecialProvisions(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions value) {
                this.specialProvisions = value;
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
             *                   &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class SpecialProvisions {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AdditionalTransportInformation.SpecialProvisions.Entry>();
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
                 *         &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
                    "specialProvisions"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "SpecialProvisions")
                    protected List<MultilingualTextFieldLarge> specialProvisions;

                    /**
                     * Gets the value of the specialProvisions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialProvisions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialProvisions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getSpecialProvisions() {
                        if (specialProvisions == null) {
                            specialProvisions = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.specialProvisions;
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
         *         &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
         *         &lt;element name="Shipping" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
         *                             &lt;element name="Language" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
         *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="Class" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CompatibilityGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PackagingGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Remarks" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "unNumber",
            "shipping",
            "clazz",
            "compatibilityGroup",
            "subsidiaryHazardS",
            "packagingGroup",
            "labels",
            "remarks"
        })
        public static class AirTransportIcaoIata {

            @XmlElement(name = "UnNumber")
            protected String unNumber;
            @XmlElement(name = "Shipping")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping shipping;
            @XmlElement(name = "Class")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Class clazz;
            @XmlElement(name = "CompatibilityGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.CompatibilityGroup compatibilityGroup;
            @XmlElement(name = "SubsidiaryHazardS")
            protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.SubsidiaryHazardS> subsidiaryHazardS;
            @XmlElement(name = "PackagingGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.PackagingGroup packagingGroup;
            @XmlElement(name = "Labels")
            protected List<MultilingualTextFieldMultiLine> labels;
            @XmlElement(name = "Remarks")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks remarks;

            /**
             * Gets the value of the unNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnNumber() {
                return unNumber;
            }

            /**
             * Sets the value of the unNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnNumber(String value) {
                this.unNumber = value;
            }

            /**
             * Gets the value of the shipping property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping getShipping() {
                return shipping;
            }

            /**
             * Sets the value of the shipping property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping }
             *     
             */
            public void setShipping(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping value) {
                this.shipping = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Class }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Class getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Class }
             *     
             */
            public void setClazz(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Class value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the compatibilityGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.CompatibilityGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.CompatibilityGroup getCompatibilityGroup() {
                return compatibilityGroup;
            }

            /**
             * Sets the value of the compatibilityGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.CompatibilityGroup }
             *     
             */
            public void setCompatibilityGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.CompatibilityGroup value) {
                this.compatibilityGroup = value;
            }

            /**
             * Gets the value of the subsidiaryHazardS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subsidiaryHazardS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubsidiaryHazardS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.SubsidiaryHazardS }
             * 
             * 
             */
            public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.SubsidiaryHazardS> getSubsidiaryHazardS() {
                if (subsidiaryHazardS == null) {
                    subsidiaryHazardS = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.SubsidiaryHazardS>();
                }
                return this.subsidiaryHazardS;
            }

            /**
             * Gets the value of the packagingGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.PackagingGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.PackagingGroup getPackagingGroup() {
                return packagingGroup;
            }

            /**
             * Sets the value of the packagingGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.PackagingGroup }
             *     
             */
            public void setPackagingGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.PackagingGroup value) {
                this.packagingGroup = value;
            }

            /**
             * Gets the value of the labels property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the labels property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLabels().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getLabels() {
                if (labels == null) {
                    labels = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.labels;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks getRemarks() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks }
             *     
             */
            public void setRemarks(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks value) {
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class Class
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
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
            public static class CompatibilityGroup
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
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
            public static class PackagingGroup
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
             *                   &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Remarks {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Remarks.Entry>();
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
                 *         &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
                    "specialProvisions",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "SpecialProvisions")
                    protected List<MultilingualTextFieldLarge> specialProvisions;
                    @XmlElement(name = "Remarks")
                    protected List<MultilingualTextFieldLarge> remarks;

                    /**
                     * Gets the value of the specialProvisions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialProvisions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialProvisions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getSpecialProvisions() {
                        if (specialProvisions == null) {
                            specialProvisions = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.specialProvisions;
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
             *                   &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
             *                   &lt;element name="Language" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
             *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Shipping {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry>();
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
                 *         &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
                 *         &lt;element name="Language" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
                 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "properShippingNameAndDescription",
                    "chemicalName",
                    "language"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ProperShippingNameAndDescription")
                    protected List<MultilingualTextFieldLarge> properShippingNameAndDescription;
                    @XmlElement(name = "ChemicalName")
                    protected String chemicalName;
                    @XmlElement(name = "Language")
                    protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry.Language language;

                    /**
                     * Gets the value of the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProperShippingNameAndDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getProperShippingNameAndDescription() {
                        if (properShippingNameAndDescription == null) {
                            properShippingNameAndDescription = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.properShippingNameAndDescription;
                    }

                    /**
                     * Gets the value of the chemicalName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChemicalName() {
                        return chemicalName;
                    }

                    /**
                     * Sets the value of the chemicalName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChemicalName(String value) {
                        this.chemicalName = value;
                    }

                    /**
                     * Gets the value of the language property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry.Language }
                     *     
                     */
                    public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry.Language getLanguage() {
                        return language;
                    }

                    /**
                     * Sets the value of the language property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry.Language }
                     *     
                     */
                    public void setLanguage(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.AirTransportIcaoIata.Shipping.Entry.Language value) {
                        this.language = value;
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
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
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
                    public static class Language
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class SubsidiaryHazardS
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
         *         &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
         *         &lt;element name="Shipping" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
         *                             &lt;element name="Language" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
         *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="Class" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CompatibilityGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PackagingGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Remarks" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "unNumber",
            "shipping",
            "clazz",
            "compatibilityGroup",
            "subsidiaryHazardS",
            "packagingGroup",
            "labels",
            "remarks"
        })
        public static class InlandWaterwayTransport {

            @XmlElement(name = "UnNumber")
            protected String unNumber;
            @XmlElement(name = "Shipping")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping shipping;
            @XmlElement(name = "Class")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Class clazz;
            @XmlElement(name = "CompatibilityGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.CompatibilityGroup compatibilityGroup;
            @XmlElement(name = "SubsidiaryHazardS")
            protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.SubsidiaryHazardS> subsidiaryHazardS;
            @XmlElement(name = "PackagingGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.PackagingGroup packagingGroup;
            @XmlElement(name = "Labels")
            protected List<MultilingualTextFieldMultiLine> labels;
            @XmlElement(name = "Remarks")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks remarks;

            /**
             * Gets the value of the unNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnNumber() {
                return unNumber;
            }

            /**
             * Sets the value of the unNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnNumber(String value) {
                this.unNumber = value;
            }

            /**
             * Gets the value of the shipping property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping getShipping() {
                return shipping;
            }

            /**
             * Sets the value of the shipping property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping }
             *     
             */
            public void setShipping(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping value) {
                this.shipping = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Class }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Class getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Class }
             *     
             */
            public void setClazz(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Class value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the compatibilityGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.CompatibilityGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.CompatibilityGroup getCompatibilityGroup() {
                return compatibilityGroup;
            }

            /**
             * Sets the value of the compatibilityGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.CompatibilityGroup }
             *     
             */
            public void setCompatibilityGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.CompatibilityGroup value) {
                this.compatibilityGroup = value;
            }

            /**
             * Gets the value of the subsidiaryHazardS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subsidiaryHazardS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubsidiaryHazardS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.SubsidiaryHazardS }
             * 
             * 
             */
            public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.SubsidiaryHazardS> getSubsidiaryHazardS() {
                if (subsidiaryHazardS == null) {
                    subsidiaryHazardS = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.SubsidiaryHazardS>();
                }
                return this.subsidiaryHazardS;
            }

            /**
             * Gets the value of the packagingGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.PackagingGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.PackagingGroup getPackagingGroup() {
                return packagingGroup;
            }

            /**
             * Sets the value of the packagingGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.PackagingGroup }
             *     
             */
            public void setPackagingGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.PackagingGroup value) {
                this.packagingGroup = value;
            }

            /**
             * Gets the value of the labels property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the labels property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLabels().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getLabels() {
                if (labels == null) {
                    labels = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.labels;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks getRemarks() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks }
             *     
             */
            public void setRemarks(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks value) {
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class Class
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
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
            public static class CompatibilityGroup
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
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
            public static class PackagingGroup
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
             *                   &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Remarks {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Remarks.Entry>();
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
                 *         &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
                    "specialProvisions",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "SpecialProvisions")
                    protected List<MultilingualTextFieldLarge> specialProvisions;
                    @XmlElement(name = "Remarks")
                    protected List<MultilingualTextFieldLarge> remarks;

                    /**
                     * Gets the value of the specialProvisions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialProvisions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialProvisions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getSpecialProvisions() {
                        if (specialProvisions == null) {
                            specialProvisions = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.specialProvisions;
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
             *                   &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
             *                   &lt;element name="Language" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
             *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Shipping {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry>();
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
                 *         &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
                 *         &lt;element name="Language" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
                 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "properShippingNameAndDescription",
                    "chemicalName",
                    "language"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ProperShippingNameAndDescription")
                    protected List<MultilingualTextFieldLarge> properShippingNameAndDescription;
                    @XmlElement(name = "ChemicalName")
                    protected String chemicalName;
                    @XmlElement(name = "Language")
                    protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry.Language language;

                    /**
                     * Gets the value of the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProperShippingNameAndDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getProperShippingNameAndDescription() {
                        if (properShippingNameAndDescription == null) {
                            properShippingNameAndDescription = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.properShippingNameAndDescription;
                    }

                    /**
                     * Gets the value of the chemicalName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChemicalName() {
                        return chemicalName;
                    }

                    /**
                     * Sets the value of the chemicalName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChemicalName(String value) {
                        this.chemicalName = value;
                    }

                    /**
                     * Gets the value of the language property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry.Language }
                     *     
                     */
                    public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry.Language getLanguage() {
                        return language;
                    }

                    /**
                     * Sets the value of the language property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry.Language }
                     *     
                     */
                    public void setLanguage(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.InlandWaterwayTransport.Shipping.Entry.Language value) {
                        this.language = value;
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
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
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
                    public static class Language
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class SubsidiaryHazardS
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
         *         &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
         *         &lt;element name="Shipping" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
         *                             &lt;element name="Language" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
         *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="Class" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CompatibilityGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PackagingGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="SpecialProvisions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "unNumber",
            "shipping",
            "clazz",
            "compatibilityGroup",
            "subsidiaryHazardS",
            "packagingGroup",
            "labels",
            "specialProvisions"
        })
        public static class LandTransport {

            @XmlElement(name = "UnNumber")
            protected String unNumber;
            @XmlElement(name = "Shipping")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping shipping;
            @XmlElement(name = "Class")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Class clazz;
            @XmlElement(name = "CompatibilityGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.CompatibilityGroup compatibilityGroup;
            @XmlElement(name = "SubsidiaryHazardS")
            protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SubsidiaryHazardS> subsidiaryHazardS;
            @XmlElement(name = "PackagingGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.PackagingGroup packagingGroup;
            @XmlElement(name = "Labels")
            protected List<MultilingualTextFieldMultiLine> labels;
            @XmlElement(name = "SpecialProvisions")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions specialProvisions;

            /**
             * Gets the value of the unNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnNumber() {
                return unNumber;
            }

            /**
             * Sets the value of the unNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnNumber(String value) {
                this.unNumber = value;
            }

            /**
             * Gets the value of the shipping property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping getShipping() {
                return shipping;
            }

            /**
             * Sets the value of the shipping property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping }
             *     
             */
            public void setShipping(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping value) {
                this.shipping = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Class }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Class getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Class }
             *     
             */
            public void setClazz(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Class value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the compatibilityGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.CompatibilityGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.CompatibilityGroup getCompatibilityGroup() {
                return compatibilityGroup;
            }

            /**
             * Sets the value of the compatibilityGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.CompatibilityGroup }
             *     
             */
            public void setCompatibilityGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.CompatibilityGroup value) {
                this.compatibilityGroup = value;
            }

            /**
             * Gets the value of the subsidiaryHazardS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subsidiaryHazardS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubsidiaryHazardS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SubsidiaryHazardS }
             * 
             * 
             */
            public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SubsidiaryHazardS> getSubsidiaryHazardS() {
                if (subsidiaryHazardS == null) {
                    subsidiaryHazardS = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SubsidiaryHazardS>();
                }
                return this.subsidiaryHazardS;
            }

            /**
             * Gets the value of the packagingGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.PackagingGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.PackagingGroup getPackagingGroup() {
                return packagingGroup;
            }

            /**
             * Sets the value of the packagingGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.PackagingGroup }
             *     
             */
            public void setPackagingGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.PackagingGroup value) {
                this.packagingGroup = value;
            }

            /**
             * Gets the value of the labels property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the labels property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLabels().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getLabels() {
                if (labels == null) {
                    labels = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.labels;
            }

            /**
             * Gets the value of the specialProvisions property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions getSpecialProvisions() {
                return specialProvisions;
            }

            /**
             * Sets the value of the specialProvisions property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions }
             *     
             */
            public void setSpecialProvisions(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions value) {
                this.specialProvisions = value;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class Class
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
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
            public static class CompatibilityGroup
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
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
            public static class PackagingGroup
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
             *                   &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
             *                   &lt;element name="Language" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
             *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Shipping {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry>();
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
                 *         &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
                 *         &lt;element name="Language" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
                 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "properShippingNameAndDescription",
                    "chemicalName",
                    "language"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ProperShippingNameAndDescription")
                    protected List<MultilingualTextFieldLarge> properShippingNameAndDescription;
                    @XmlElement(name = "ChemicalName")
                    protected String chemicalName;
                    @XmlElement(name = "Language")
                    protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry.Language language;

                    /**
                     * Gets the value of the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProperShippingNameAndDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getProperShippingNameAndDescription() {
                        if (properShippingNameAndDescription == null) {
                            properShippingNameAndDescription = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.properShippingNameAndDescription;
                    }

                    /**
                     * Gets the value of the chemicalName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChemicalName() {
                        return chemicalName;
                    }

                    /**
                     * Sets the value of the chemicalName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChemicalName(String value) {
                        this.chemicalName = value;
                    }

                    /**
                     * Gets the value of the language property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry.Language }
                     *     
                     */
                    public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry.Language getLanguage() {
                        return language;
                    }

                    /**
                     * Sets the value of the language property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry.Language }
                     *     
                     */
                    public void setLanguage(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.Shipping.Entry.Language value) {
                        this.language = value;
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
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
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
                    public static class Language
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
             *                   &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class SpecialProvisions {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.LandTransport.SpecialProvisions.Entry>();
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
                 *         &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
                    "specialProvisions",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "SpecialProvisions")
                    protected List<MultilingualTextFieldLarge> specialProvisions;
                    @XmlElement(name = "Remarks")
                    protected List<MultilingualTextFieldLarge> remarks;

                    /**
                     * Gets the value of the specialProvisions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialProvisions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialProvisions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getSpecialProvisions() {
                        if (specialProvisions == null) {
                            specialProvisions = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.specialProvisions;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class SubsidiaryHazardS
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
         *         &lt;element name="UnNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
         *         &lt;element name="Shipping" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
         *                             &lt;element name="Language" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
         *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="Class" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CompatibilityGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SubsidiaryHazardS" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PackagingGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="EmsNumber" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_MARINE_EMS" minOccurs="0"/>
         *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Labels" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="MarinePollutant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="Remarks" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "unNumber",
            "shipping",
            "clazz",
            "compatibilityGroup",
            "subsidiaryHazardS",
            "packagingGroup",
            "emsNumber",
            "labels",
            "marinePollutant",
            "remarks"
        })
        public static class MarineTransport {

            @XmlElement(name = "UnNumber")
            protected String unNumber;
            @XmlElement(name = "Shipping")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping shipping;
            @XmlElement(name = "Class")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Class clazz;
            @XmlElement(name = "CompatibilityGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.CompatibilityGroup compatibilityGroup;
            @XmlElement(name = "SubsidiaryHazardS")
            protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.SubsidiaryHazardS> subsidiaryHazardS;
            @XmlElement(name = "PackagingGroup")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.PackagingGroup packagingGroup;
            @XmlElement(name = "EmsNumber")
            protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.EmsNumber> emsNumber;
            @XmlElement(name = "Labels")
            protected List<MultilingualTextFieldMultiLine> labels;
            @XmlElementRef(name = "MarinePollutant", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-GuidanceOnSafeUse/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> marinePollutant;
            @XmlElement(name = "Remarks")
            protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks remarks;

            /**
             * Gets the value of the unNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnNumber() {
                return unNumber;
            }

            /**
             * Sets the value of the unNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnNumber(String value) {
                this.unNumber = value;
            }

            /**
             * Gets the value of the shipping property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping getShipping() {
                return shipping;
            }

            /**
             * Sets the value of the shipping property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping }
             *     
             */
            public void setShipping(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping value) {
                this.shipping = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Class }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Class getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Class }
             *     
             */
            public void setClazz(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Class value) {
                this.clazz = value;
            }

            /**
             * Gets the value of the compatibilityGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.CompatibilityGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.CompatibilityGroup getCompatibilityGroup() {
                return compatibilityGroup;
            }

            /**
             * Sets the value of the compatibilityGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.CompatibilityGroup }
             *     
             */
            public void setCompatibilityGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.CompatibilityGroup value) {
                this.compatibilityGroup = value;
            }

            /**
             * Gets the value of the subsidiaryHazardS property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subsidiaryHazardS property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubsidiaryHazardS().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.SubsidiaryHazardS }
             * 
             * 
             */
            public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.SubsidiaryHazardS> getSubsidiaryHazardS() {
                if (subsidiaryHazardS == null) {
                    subsidiaryHazardS = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.SubsidiaryHazardS>();
                }
                return this.subsidiaryHazardS;
            }

            /**
             * Gets the value of the packagingGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.PackagingGroup }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.PackagingGroup getPackagingGroup() {
                return packagingGroup;
            }

            /**
             * Sets the value of the packagingGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.PackagingGroup }
             *     
             */
            public void setPackagingGroup(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.PackagingGroup value) {
                this.packagingGroup = value;
            }

            /**
             * Gets the value of the emsNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the emsNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmsNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.EmsNumber }
             * 
             * 
             */
            public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.EmsNumber> getEmsNumber() {
                if (emsNumber == null) {
                    emsNumber = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.EmsNumber>();
                }
                return this.emsNumber;
            }

            /**
             * Gets the value of the labels property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the labels property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLabels().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getLabels() {
                if (labels == null) {
                    labels = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.labels;
            }

            /**
             * Gets the value of the marinePollutant property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getMarinePollutant() {
                return marinePollutant;
            }

            /**
             * Sets the value of the marinePollutant property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setMarinePollutant(JAXBElement<Boolean> value) {
                this.marinePollutant = value;
            }

            /**
             * Gets the value of the remarks property.
             * 
             * @return
             *     possible object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks }
             *     
             */
            public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks getRemarks() {
                return remarks;
            }

            /**
             * Sets the value of the remarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks }
             *     
             */
            public void setRemarks(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks value) {
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class Class
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_COMPATIBILITY" minOccurs="0"/>
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
            public static class CompatibilityGroup
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_MARINE_EMS" minOccurs="0"/>
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
            public static class EmsNumber
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_PACKING" minOccurs="0"/>
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
            public static class PackagingGroup
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
             *                   &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Remarks {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Remarks.Entry>();
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
                 *         &lt;element name="SpecialProvisions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
                    "specialProvisions",
                    "remarks"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "SpecialProvisions")
                    protected List<MultilingualTextFieldLarge> specialProvisions;
                    @XmlElement(name = "Remarks")
                    protected List<MultilingualTextFieldLarge> remarks;

                    /**
                     * Gets the value of the specialProvisions property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialProvisions property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialProvisions().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getSpecialProvisions() {
                        if (specialProvisions == null) {
                            specialProvisions = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.specialProvisions;
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
             *                   &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
             *                   &lt;element name="Language" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
             *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class Shipping {

                protected List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry> entry;

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
                 * {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry }
                 * 
                 * 
                 */
                public List<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry> getEntry() {
                    if (entry == null) {
                        entry = new ArrayList<FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry>();
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
                 *         &lt;element name="ProperShippingNameAndDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="ChemicalName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
                 *         &lt;element name="Language" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
                 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                    "properShippingNameAndDescription",
                    "chemicalName",
                    "language"
                })
                public static class Entry
                    extends RepeatableEntryType
                {

                    @XmlElement(name = "ProperShippingNameAndDescription")
                    protected List<MultilingualTextFieldLarge> properShippingNameAndDescription;
                    @XmlElement(name = "ChemicalName")
                    protected String chemicalName;
                    @XmlElement(name = "Language")
                    protected FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry.Language language;

                    /**
                     * Gets the value of the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the properShippingNameAndDescription property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getProperShippingNameAndDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultilingualTextFieldLarge }
                     * 
                     * 
                     */
                    public List<MultilingualTextFieldLarge> getProperShippingNameAndDescription() {
                        if (properShippingNameAndDescription == null) {
                            properShippingNameAndDescription = new ArrayList<MultilingualTextFieldLarge>();
                        }
                        return this.properShippingNameAndDescription;
                    }

                    /**
                     * Gets the value of the chemicalName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChemicalName() {
                        return chemicalName;
                    }

                    /**
                     * Sets the value of the chemicalName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChemicalName(String value) {
                        this.chemicalName = value;
                    }

                    /**
                     * Gets the value of the language property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry.Language }
                     *     
                     */
                    public FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry.Language getLanguage() {
                        return language;
                    }

                    /**
                     * Sets the value of the language property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry.Language }
                     *     
                     */
                    public void setLanguage(FLEXIBLERECORDGuidanceOnSafeUse.TransportInformation.MarineTransport.Shipping.Entry.Language value) {
                        this.language = value;
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
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N06" minOccurs="0"/>
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
                    public static class Language
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
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}UNRTDG_CLASS" minOccurs="0"/>
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
            public static class SubsidiaryHazardS
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

}
