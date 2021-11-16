
package eu.europa.echa.iuclid6.namespaces.reference_substance._6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePhysicalQuantityRangeField;
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
 *         &lt;element name="DataProtection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
 *                 &lt;sequence>
 *                   &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
 *                   &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
 *         &lt;element name="ReferenceSubstanceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IupacName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Inventory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InventoryEntry" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}inventoryEntry" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InventoryEntryJustification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                           &lt;sequence>
 *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N95" minOccurs="0"/>
 *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CASNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *                   &lt;element name="CASName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Synonyms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Synonyms" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
 *                                                 &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
 *                                                           &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                       &lt;element name="Identifier" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MolecularStructuralInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataProtection" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
 *                           &lt;sequence>
 *                             &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
 *                             &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
 *                   &lt;element name="MolecularFormula" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                   &lt;element name="MolecularWeightRange" minOccurs="0">
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
 *                   &lt;element name="SmilesNotation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                   &lt;element name="InChl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *                   &lt;element name="StructuralFormula" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ChemicalStructureFiles" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="StructureFile" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *                                       &lt;element name="RemarksChemStruct" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="RelatedSubstances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedSubstances" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Identifier" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
 *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="Relation" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                               &lt;sequence>
 *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N05" minOccurs="0"/>
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
 *                   &lt;element name="GroupCategoryInfo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
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
    "referenceSubstanceName",
    "iupacName",
    "description",
    "inventory",
    "synonyms",
    "molecularStructuralInfo",
    "relatedSubstances"
})
@XmlRootElement(name = "REFERENCE_SUBSTANCE")
public class REFERENCESUBSTANCE {

    @XmlElement(name = "DataProtection")
    protected REFERENCESUBSTANCE.DataProtection dataProtection;
    @XmlElement(name = "ReferenceSubstanceName", required = true)
    protected String referenceSubstanceName;
    @XmlElement(name = "IupacName")
    protected String iupacName;
    @XmlElement(name = "Description")
    protected List<MultilingualTextFieldLarge> description;
    @XmlElement(name = "Inventory")
    protected REFERENCESUBSTANCE.Inventory inventory;
    @XmlElement(name = "Synonyms")
    protected REFERENCESUBSTANCE.SynonymSet synonyms;
    @XmlElement(name = "MolecularStructuralInfo")
    protected REFERENCESUBSTANCE.MolecularStructuralInfo molecularStructuralInfo;
    @XmlElement(name = "RelatedSubstances")
    protected REFERENCESUBSTANCE.RelatedSubstancesSet relatedSubstances;

    /**
     * Gets the value of the dataProtection property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCESUBSTANCE.DataProtection }
     *     
     */
    public REFERENCESUBSTANCE.DataProtection getDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCESUBSTANCE.DataProtection }
     *     
     */
    public void setDataProtection(REFERENCESUBSTANCE.DataProtection value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the referenceSubstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSubstanceName() {
        return referenceSubstanceName;
    }

    /**
     * Sets the value of the referenceSubstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSubstanceName(String value) {
        this.referenceSubstanceName = value;
    }

    /**
     * Gets the value of the iupacName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIupacName() {
        return iupacName;
    }

    /**
     * Sets the value of the iupacName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIupacName(String value) {
        this.iupacName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextFieldLarge }
     * 
     * 
     */
    public List<MultilingualTextFieldLarge> getDescription() {
        if (description == null) {
            description = new ArrayList<MultilingualTextFieldLarge>();
        }
        return this.description;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCESUBSTANCE.Inventory }
     *     
     */
    public REFERENCESUBSTANCE.Inventory getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCESUBSTANCE.Inventory }
     *     
     */
    public void setInventory(REFERENCESUBSTANCE.Inventory value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the synonyms property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCESUBSTANCE.SynonymSet }
     *     
     */
    public REFERENCESUBSTANCE.SynonymSet getSynonyms() {
        return synonyms;
    }

    /**
     * Sets the value of the synonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCESUBSTANCE.SynonymSet }
     *     
     */
    public void setSynonyms(REFERENCESUBSTANCE.SynonymSet value) {
        this.synonyms = value;
    }

    /**
     * Gets the value of the molecularStructuralInfo property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo }
     *     
     */
    public REFERENCESUBSTANCE.MolecularStructuralInfo getMolecularStructuralInfo() {
        return molecularStructuralInfo;
    }

    /**
     * Sets the value of the molecularStructuralInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo }
     *     
     */
    public void setMolecularStructuralInfo(REFERENCESUBSTANCE.MolecularStructuralInfo value) {
        this.molecularStructuralInfo = value;
    }

    /**
     * Gets the value of the relatedSubstances property.
     * 
     * @return
     *     possible object is
     *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet }
     *     
     */
    public REFERENCESUBSTANCE.RelatedSubstancesSet getRelatedSubstances() {
        return relatedSubstances;
    }

    /**
     * Sets the value of the relatedSubstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet }
     *     
     */
    public void setRelatedSubstances(REFERENCESUBSTANCE.RelatedSubstancesSet value) {
        this.relatedSubstances = value;
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
     *         &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
     *         &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
        protected List<REFERENCESUBSTANCE.DataProtection.Legislation> legislation;

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
         * {@link REFERENCESUBSTANCE.DataProtection.Legislation }
         * 
         * 
         */
        public List<REFERENCESUBSTANCE.DataProtection.Legislation> getLegislation() {
            if (legislation == null) {
                legislation = new ArrayList<REFERENCESUBSTANCE.DataProtection.Legislation>();
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="InventoryEntry" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}inventoryEntry" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InventoryEntryJustification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                 &lt;sequence>
     *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N95" minOccurs="0"/>
     *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CASNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
     *         &lt;element name="CASName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
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
        "inventoryEntry",
        "inventoryEntryJustification",
        "casNumber",
        "casName"
    })
    public static class Inventory {

        @XmlElement(name = "InventoryEntry")
        protected REFERENCESUBSTANCE.Inventory.InventoryEntry inventoryEntry;
        @XmlElement(name = "InventoryEntryJustification")
        protected REFERENCESUBSTANCE.Inventory.InventoryEntryJustification inventoryEntryJustification;
        @XmlElement(name = "CASNumber")
        protected String casNumber;
        @XmlElement(name = "CASName")
        protected String casName;

        /**
         * Gets the value of the inventoryEntry property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.Inventory.InventoryEntry }
         *     
         */
        public REFERENCESUBSTANCE.Inventory.InventoryEntry getInventoryEntry() {
            return inventoryEntry;
        }

        /**
         * Sets the value of the inventoryEntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.Inventory.InventoryEntry }
         *     
         */
        public void setInventoryEntry(REFERENCESUBSTANCE.Inventory.InventoryEntry value) {
            this.inventoryEntry = value;
        }

        /**
         * Gets the value of the inventoryEntryJustification property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.Inventory.InventoryEntryJustification }
         *     
         */
        public REFERENCESUBSTANCE.Inventory.InventoryEntryJustification getInventoryEntryJustification() {
            return inventoryEntryJustification;
        }

        /**
         * Sets the value of the inventoryEntryJustification property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.Inventory.InventoryEntryJustification }
         *     
         */
        public void setInventoryEntryJustification(REFERENCESUBSTANCE.Inventory.InventoryEntryJustification value) {
            this.inventoryEntryJustification = value;
        }

        /**
         * Gets the value of the casNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCASNumber() {
            return casNumber;
        }

        /**
         * Sets the value of the casNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCASNumber(String value) {
            this.casNumber = value;
        }

        /**
         * Gets the value of the casName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCASName() {
            return casName;
        }

        /**
         * Sets the value of the casName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCASName(String value) {
            this.casName = value;
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
         *         &lt;element name="entry" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}inventoryEntry" maxOccurs="unbounded" minOccurs="0"/>
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
        public static class InventoryEntry {

            protected List<eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry> entry;

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
             * {@link eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry }
             * 
             * 
             */
            public List<eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<eu.europa.echa.iuclid6.namespaces.platform_fields.v1.InventoryEntry>();
                }
                return this.entry;
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
         *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N95" minOccurs="0"/>
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
        public static class InventoryEntryJustification
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
     *         &lt;element name="DataProtection" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
     *                 &lt;sequence>
     *                   &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
     *                   &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
     *         &lt;element name="MolecularFormula" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *         &lt;element name="MolecularWeightRange" minOccurs="0">
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
     *         &lt;element name="SmilesNotation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *         &lt;element name="InChl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
     *         &lt;element name="StructuralFormula" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
     *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ChemicalStructureFiles" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="StructureFile" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
     *                             &lt;element name="RemarksChemStruct" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
        "molecularFormula",
        "molecularWeightRange",
        "smilesNotation",
        "inChl",
        "structuralFormula",
        "remarks",
        "chemicalStructureFiles"
    })
    public static class MolecularStructuralInfo {

        @XmlElement(name = "DataProtection")
        protected REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection dataProtection;
        @XmlElement(name = "MolecularFormula")
        protected String molecularFormula;
        @XmlElement(name = "MolecularWeightRange")
        protected REFERENCESUBSTANCE.MolecularStructuralInfo.MolecularWeightRange molecularWeightRange;
        @XmlElement(name = "SmilesNotation")
        protected String smilesNotation;
        @XmlElement(name = "InChl")
        protected String inChl;
        @XmlElement(name = "StructuralFormula")
        protected String structuralFormula;
        @XmlElement(name = "Remarks")
        protected List<MultilingualTextFieldLarge> remarks;
        @XmlElement(name = "ChemicalStructureFiles")
        protected REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles chemicalStructureFiles;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection }
         *     
         */
        public REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection }
         *     
         */
        public void setDataProtection(REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection value) {
            this.dataProtection = value;
        }

        /**
         * Gets the value of the molecularFormula property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMolecularFormula() {
            return molecularFormula;
        }

        /**
         * Sets the value of the molecularFormula property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMolecularFormula(String value) {
            this.molecularFormula = value;
        }

        /**
         * Gets the value of the molecularWeightRange property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo.MolecularWeightRange }
         *     
         */
        public REFERENCESUBSTANCE.MolecularStructuralInfo.MolecularWeightRange getMolecularWeightRange() {
            return molecularWeightRange;
        }

        /**
         * Sets the value of the molecularWeightRange property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo.MolecularWeightRange }
         *     
         */
        public void setMolecularWeightRange(REFERENCESUBSTANCE.MolecularStructuralInfo.MolecularWeightRange value) {
            this.molecularWeightRange = value;
        }

        /**
         * Gets the value of the smilesNotation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmilesNotation() {
            return smilesNotation;
        }

        /**
         * Sets the value of the smilesNotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmilesNotation(String value) {
            this.smilesNotation = value;
        }

        /**
         * Gets the value of the inChl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInChl() {
            return inChl;
        }

        /**
         * Sets the value of the inChl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInChl(String value) {
            this.inChl = value;
        }

        /**
         * Gets the value of the structuralFormula property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStructuralFormula() {
            return structuralFormula;
        }

        /**
         * Sets the value of the structuralFormula property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStructuralFormula(String value) {
            this.structuralFormula = value;
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
         * Gets the value of the chemicalStructureFiles property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles }
         *     
         */
        public REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles getChemicalStructureFiles() {
            return chemicalStructureFiles;
        }

        /**
         * Sets the value of the chemicalStructureFiles property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles }
         *     
         */
        public void setChemicalStructureFiles(REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles value) {
            this.chemicalStructureFiles = value;
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
         *                   &lt;element name="StructureFile" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
         *                   &lt;element name="RemarksChemStruct" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
        public static class ChemicalStructureFiles {

            protected List<REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles.Entry> entry;

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
             * {@link REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles.Entry }
             * 
             * 
             */
            public List<REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<REFERENCESUBSTANCE.MolecularStructuralInfo.ChemicalStructureFiles.Entry>();
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
             *         &lt;element name="StructureFile" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
             *         &lt;element name="RemarksChemStruct" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
                "structureFile",
                "remarksChemStruct"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "StructureFile")
                protected String structureFile;
                @XmlElement(name = "RemarksChemStruct")
                protected List<MultilingualTextFieldSmall> remarksChemStruct;

                /**
                 * Gets the value of the structureFile property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStructureFile() {
                    return structureFile;
                }

                /**
                 * Sets the value of the structureFile property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStructureFile(String value) {
                    this.structureFile = value;
                }

                /**
                 * Gets the value of the remarksChemStruct property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the remarksChemStruct property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRemarksChemStruct().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MultilingualTextFieldSmall }
                 * 
                 * 
                 */
                public List<MultilingualTextFieldSmall> getRemarksChemStruct() {
                    if (remarksChemStruct == null) {
                        remarksChemStruct = new ArrayList<MultilingualTextFieldSmall>();
                    }
                    return this.remarksChemStruct;
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
         *         &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
         *         &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
            protected List<REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection.Legislation> legislation;

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
             * {@link REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection.Legislation }
             * 
             * 
             */
            public List<REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<REFERENCESUBSTANCE.MolecularStructuralInfo.DataProtection.Legislation>();
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
        public static class MolecularWeightRange
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
     *         &lt;element name="RelatedSubstances" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Identifier" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="Relation" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N05" minOccurs="0"/>
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
     *         &lt;element name="GroupCategoryInfo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
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
        "relatedSubstances",
        "groupCategoryInfo"
    })
    public static class RelatedSubstancesSet {

        @XmlElement(name = "RelatedSubstances")
        protected REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances relatedSubstances;
        @XmlElement(name = "GroupCategoryInfo")
        protected List<MultilingualTextFieldMultiLine> groupCategoryInfo;

        /**
         * Gets the value of the relatedSubstances property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances }
         *     
         */
        public REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances getRelatedSubstances() {
            return relatedSubstances;
        }

        /**
         * Sets the value of the relatedSubstances property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances }
         *     
         */
        public void setRelatedSubstances(REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances value) {
            this.relatedSubstances = value;
        }

        /**
         * Gets the value of the groupCategoryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupCategoryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupCategoryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getGroupCategoryInfo() {
            if (groupCategoryInfo == null) {
                groupCategoryInfo = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.groupCategoryInfo;
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
         *                   &lt;element name="Identifier" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="Relation" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N05" minOccurs="0"/>
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
        public static class RelatedSubstances {

            protected List<REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry> entry;

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
             * {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry }
             * 
             * 
             */
            public List<REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry>();
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
             *         &lt;element name="Identifier" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="Relation" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N05" minOccurs="0"/>
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
                "identifier",
                "identity",
                "remarks",
                "relation"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Identifier")
                protected REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Identifier identifier;
                @XmlElement(name = "Identity")
                protected String identity;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldSmall> remarks;
                @XmlElement(name = "Relation")
                protected REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Relation relation;

                /**
                 * Gets the value of the identifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Identifier }
                 *     
                 */
                public REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Identifier getIdentifier() {
                    return identifier;
                }

                /**
                 * Sets the value of the identifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Identifier }
                 *     
                 */
                public void setIdentifier(REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Identifier value) {
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

                /**
                 * Gets the value of the relation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Relation }
                 *     
                 */
                public REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Relation getRelation() {
                    return relation;
                }

                /**
                 * Sets the value of the relation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Relation }
                 *     
                 */
                public void setRelation(REFERENCESUBSTANCE.RelatedSubstancesSet.RelatedSubstances.Entry.Relation value) {
                    this.relation = value;
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
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
                public static class Identifier
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N05" minOccurs="0"/>
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
                public static class Relation
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
     *         &lt;element name="Synonyms" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="DataProtection" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
     *                                     &lt;sequence>
     *                                       &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
     *                                       &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
     *                                                 &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
     *                             &lt;element name="Identifier" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                                     &lt;sequence>
     *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
     *                                       &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
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
        "synonyms"
    })
    public static class SynonymSet {

        @XmlElement(name = "Synonyms")
        protected REFERENCESUBSTANCE.SynonymSet.Synonyms synonyms;

        /**
         * Gets the value of the synonyms property.
         * 
         * @return
         *     possible object is
         *     {@link REFERENCESUBSTANCE.SynonymSet.Synonyms }
         *     
         */
        public REFERENCESUBSTANCE.SynonymSet.Synonyms getSynonyms() {
            return synonyms;
        }

        /**
         * Sets the value of the synonyms property.
         * 
         * @param value
         *     allowed object is
         *     {@link REFERENCESUBSTANCE.SynonymSet.Synonyms }
         *     
         */
        public void setSynonyms(REFERENCESUBSTANCE.SynonymSet.Synonyms value) {
            this.synonyms = value;
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
         *                   &lt;element name="DataProtection" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
         *                           &lt;sequence>
         *                             &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
         *                             &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
         *                   &lt;element name="Identifier" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                           &lt;sequence>
         *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
         *                             &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
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
        public static class Synonyms {

            protected List<REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry> entry;

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
             * {@link REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry }
             * 
             * 
             */
            public List<REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry>();
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
             *         &lt;element name="DataProtection" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}baseDataProtectionField">
             *                 &lt;sequence>
             *                   &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
             *                   &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
             *         &lt;element name="Identifier" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
             *                 &lt;sequence>
             *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
             *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge" minOccurs="0"/>
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
                "dataProtection",
                "identifier",
                "name",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "DataProtection")
                protected REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection dataProtection;
                @XmlElement(name = "Identifier")
                protected REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.Identifier identifier;
                @XmlElement(name = "Name")
                protected String name;
                @XmlElement(name = "Remarks")
                protected List<MultilingualTextFieldSmall> remarks;

                /**
                 * Gets the value of the dataProtection property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection }
                 *     
                 */
                public REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection getDataProtection() {
                    return dataProtection;
                }

                /**
                 * Sets the value of the dataProtection property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection }
                 *     
                 */
                public void setDataProtection(REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection value) {
                    this.dataProtection = value;
                }

                /**
                 * Gets the value of the identifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.Identifier }
                 *     
                 */
                public REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.Identifier getIdentifier() {
                    return identifier;
                }

                /**
                 * Sets the value of the identifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.Identifier }
                 *     
                 */
                public void setIdentifier(REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.Identifier value) {
                    this.identifier = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
                 *         &lt;element name="confidentiality" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N64" minOccurs="0"/>
                 *         &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element name="legislation" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
                    protected List<REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection.Legislation> legislation;

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
                     * {@link REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection.Legislation }
                     * 
                     * 
                     */
                    public List<REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection.Legislation> getLegislation() {
                        if (legislation == null) {
                            legislation = new ArrayList<REFERENCESUBSTANCE.SynonymSet.Synonyms.Entry.DataProtection.Legislation>();
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
                     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
                 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}PG6_60192" minOccurs="0"/>
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
                public static class Identifier
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

}
