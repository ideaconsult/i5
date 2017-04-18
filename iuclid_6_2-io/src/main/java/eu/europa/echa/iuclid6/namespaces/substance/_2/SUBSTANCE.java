
package eu.europa.echa.iuclid6.namespaces.substance._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *         &lt;element name="Templates">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChemistryForAssessment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PublicInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ChemicalName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="OwnerLegalEntityProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *         &lt;element name="OwnerLegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *         &lt;element name="ThirdPartyProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *         &lt;element name="ThirdParty" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *         &lt;element name="RoleInSupplyChain">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoleProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                   &lt;element name="Manufacturer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="Importer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="OnlyRepresentative" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                   &lt;element name="DownstreamUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReferenceSubstance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Protection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                   &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypeOfSubstance">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Composition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Origin" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherNames">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="Protection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                             &lt;element name="NameType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="Country" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Relation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
 *         &lt;element name="ContactPersons">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                             &lt;element name="ContactPerson" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
    "templates",
    "chemistryForAssessment",
    "chemicalName",
    "publicName",
    "ownerLegalEntityProtection",
    "ownerLegalEntity",
    "thirdPartyProtection",
    "thirdParty",
    "roleInSupplyChain",
    "referenceSubstance",
    "typeOfSubstance",
    "otherNames",
    "contactPersons"
})
@XmlRootElement(name = "SUBSTANCE")
public class SUBSTANCE {

    @XmlElement(name = "Templates", required = true)
    protected SUBSTANCE.Templates templates;
    @XmlElement(name = "ChemistryForAssessment")
    protected SUBSTANCE.ChemistryForAssessment chemistryForAssessment;
    @XmlElement(name = "ChemicalName", required = true)
    protected String chemicalName;
    @XmlElement(name = "PublicName", required = true)
    protected String publicName;
    @XmlElement(name = "OwnerLegalEntityProtection", required = true)
    protected DataProtectionField ownerLegalEntityProtection;
    @XmlElement(name = "OwnerLegalEntity", required = true)
    protected String ownerLegalEntity;
    @XmlElement(name = "ThirdPartyProtection", required = true)
    protected DataProtectionField thirdPartyProtection;
    @XmlElement(name = "ThirdParty", required = true)
    protected String thirdParty;
    @XmlElement(name = "RoleInSupplyChain", required = true)
    protected SUBSTANCE.RoleInSupplyChain roleInSupplyChain;
    @XmlElement(name = "ReferenceSubstance", required = true)
    protected SUBSTANCE.ReferenceSubstance referenceSubstance;
    @XmlElement(name = "TypeOfSubstance", required = true)
    protected SUBSTANCE.TypeOfSubstance typeOfSubstance;
    @XmlElement(name = "OtherNames", required = true)
    protected SUBSTANCE.OtherNames otherNames;
    @XmlElement(name = "ContactPersons", required = true)
    protected SUBSTANCE.ContactPersons contactPersons;

    /**
     * Gets the value of the templates property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.Templates }
     *     
     */
    public SUBSTANCE.Templates getTemplates() {
        return templates;
    }

    /**
     * Sets the value of the templates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.Templates }
     *     
     */
    public void setTemplates(SUBSTANCE.Templates value) {
        this.templates = value;
    }

    /**
     * Gets the value of the chemistryForAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.ChemistryForAssessment }
     *     
     */
    public SUBSTANCE.ChemistryForAssessment getChemistryForAssessment() {
        return chemistryForAssessment;
    }

    /**
     * Sets the value of the chemistryForAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.ChemistryForAssessment }
     *     
     */
    public void setChemistryForAssessment(SUBSTANCE.ChemistryForAssessment value) {
        this.chemistryForAssessment = value;
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
     * Gets the value of the publicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicName() {
        return publicName;
    }

    /**
     * Sets the value of the publicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicName(String value) {
        this.publicName = value;
    }

    /**
     * Gets the value of the ownerLegalEntityProtection property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionField }
     *     
     */
    public DataProtectionField getOwnerLegalEntityProtection() {
        return ownerLegalEntityProtection;
    }

    /**
     * Sets the value of the ownerLegalEntityProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionField }
     *     
     */
    public void setOwnerLegalEntityProtection(DataProtectionField value) {
        this.ownerLegalEntityProtection = value;
    }

    /**
     * Gets the value of the ownerLegalEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLegalEntity() {
        return ownerLegalEntity;
    }

    /**
     * Sets the value of the ownerLegalEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLegalEntity(String value) {
        this.ownerLegalEntity = value;
    }

    /**
     * Gets the value of the thirdPartyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionField }
     *     
     */
    public DataProtectionField getThirdPartyProtection() {
        return thirdPartyProtection;
    }

    /**
     * Sets the value of the thirdPartyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionField }
     *     
     */
    public void setThirdPartyProtection(DataProtectionField value) {
        this.thirdPartyProtection = value;
    }

    /**
     * Gets the value of the thirdParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdParty() {
        return thirdParty;
    }

    /**
     * Sets the value of the thirdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdParty(String value) {
        this.thirdParty = value;
    }

    /**
     * Gets the value of the roleInSupplyChain property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.RoleInSupplyChain }
     *     
     */
    public SUBSTANCE.RoleInSupplyChain getRoleInSupplyChain() {
        return roleInSupplyChain;
    }

    /**
     * Sets the value of the roleInSupplyChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.RoleInSupplyChain }
     *     
     */
    public void setRoleInSupplyChain(SUBSTANCE.RoleInSupplyChain value) {
        this.roleInSupplyChain = value;
    }

    /**
     * Gets the value of the referenceSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.ReferenceSubstance }
     *     
     */
    public SUBSTANCE.ReferenceSubstance getReferenceSubstance() {
        return referenceSubstance;
    }

    /**
     * Sets the value of the referenceSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.ReferenceSubstance }
     *     
     */
    public void setReferenceSubstance(SUBSTANCE.ReferenceSubstance value) {
        this.referenceSubstance = value;
    }

    /**
     * Gets the value of the typeOfSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.TypeOfSubstance }
     *     
     */
    public SUBSTANCE.TypeOfSubstance getTypeOfSubstance() {
        return typeOfSubstance;
    }

    /**
     * Sets the value of the typeOfSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.TypeOfSubstance }
     *     
     */
    public void setTypeOfSubstance(SUBSTANCE.TypeOfSubstance value) {
        this.typeOfSubstance = value;
    }

    /**
     * Gets the value of the otherNames property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.OtherNames }
     *     
     */
    public SUBSTANCE.OtherNames getOtherNames() {
        return otherNames;
    }

    /**
     * Sets the value of the otherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.OtherNames }
     *     
     */
    public void setOtherNames(SUBSTANCE.OtherNames value) {
        this.otherNames = value;
    }

    /**
     * Gets the value of the contactPersons property.
     * 
     * @return
     *     possible object is
     *     {@link SUBSTANCE.ContactPersons }
     *     
     */
    public SUBSTANCE.ContactPersons getContactPersons() {
        return contactPersons;
    }

    /**
     * Sets the value of the contactPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBSTANCE.ContactPersons }
     *     
     */
    public void setContactPersons(SUBSTANCE.ContactPersons value) {
        this.contactPersons = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PublicInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "description",
        "publicInfo"
    })
    public static class ChemistryForAssessment {

        @XmlElement(name = "Description", required = true)
        protected String description;
        @XmlElement(name = "PublicInfo", required = true)
        protected String publicInfo;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the publicInfo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublicInfo() {
            return publicInfo;
        }

        /**
         * Sets the value of the publicInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicInfo(String value) {
            this.publicInfo = value;
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
     *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *                   &lt;element name="ContactPerson" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
    public static class ContactPersons {

        protected List<SUBSTANCE.ContactPersons.Entry> entry;

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
         * {@link SUBSTANCE.ContactPersons.Entry }
         * 
         * 
         */
        public List<SUBSTANCE.ContactPersons.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<SUBSTANCE.ContactPersons.Entry>();
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
         *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
         *         &lt;element name="ContactPerson" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
            "contactPerson"
        })
        public static class Entry
            extends RepeatableEntryType
        {

            @XmlElement(name = "DataProtection", required = true)
            protected DataProtectionField dataProtection;
            @XmlElement(name = "ContactPerson", required = true)
            protected String contactPerson;

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
             * Gets the value of the contactPerson property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactPerson() {
                return contactPerson;
            }

            /**
             * Sets the value of the contactPerson property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactPerson(String value) {
                this.contactPerson = value;
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
     *                   &lt;element name="Protection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *                   &lt;element name="NameType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *                   &lt;element name="Country" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Relation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
    public static class OtherNames {

        protected List<SUBSTANCE.OtherNames.Entry> entry;

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
         * {@link SUBSTANCE.OtherNames.Entry }
         * 
         * 
         */
        public List<SUBSTANCE.OtherNames.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<SUBSTANCE.OtherNames.Entry>();
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
         *         &lt;element name="Protection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
         *         &lt;element name="NameType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
         *         &lt;element name="Country" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Relation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
            "protection",
            "nameType",
            "name",
            "country",
            "relation",
            "remarks"
        })
        public static class Entry
            extends RepeatableEntryType
        {

            @XmlElement(name = "Protection", required = true)
            protected DataProtectionField protection;
            @XmlElement(name = "NameType", required = true)
            protected PicklistField nameType;
            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Country")
            protected List<PicklistField> country;
            @XmlElement(name = "Relation", required = true)
            protected PicklistField relation;
            @XmlElement(name = "Remarks", required = true)
            protected String remarks;

            /**
             * Gets the value of the protection property.
             * 
             * @return
             *     possible object is
             *     {@link DataProtectionField }
             *     
             */
            public DataProtectionField getProtection() {
                return protection;
            }

            /**
             * Sets the value of the protection property.
             * 
             * @param value
             *     allowed object is
             *     {@link DataProtectionField }
             *     
             */
            public void setProtection(DataProtectionField value) {
                this.protection = value;
            }

            /**
             * Gets the value of the nameType property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getNameType() {
                return nameType;
            }

            /**
             * Sets the value of the nameType property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setNameType(PicklistField value) {
                this.nameType = value;
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
             * Gets the value of the country property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the country property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCountry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PicklistField }
             * 
             * 
             */
            public List<PicklistField> getCountry() {
                if (country == null) {
                    country = new ArrayList<PicklistField>();
                }
                return this.country;
            }

            /**
             * Gets the value of the relation property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getRelation() {
                return relation;
            }

            /**
             * Sets the value of the relation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setRelation(PicklistField value) {
                this.relation = value;
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
     *         &lt;element name="Protection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *         &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
        "protection",
        "referenceSubstance"
    })
    public static class ReferenceSubstance {

        @XmlElement(name = "Protection", required = true)
        protected DataProtectionField protection;
        @XmlElement(name = "ReferenceSubstance", required = true)
        protected String referenceSubstance;

        /**
         * Gets the value of the protection property.
         * 
         * @return
         *     possible object is
         *     {@link DataProtectionField }
         *     
         */
        public DataProtectionField getProtection() {
            return protection;
        }

        /**
         * Sets the value of the protection property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataProtectionField }
         *     
         */
        public void setProtection(DataProtectionField value) {
            this.protection = value;
        }

        /**
         * Gets the value of the referenceSubstance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceSubstance() {
            return referenceSubstance;
        }

        /**
         * Sets the value of the referenceSubstance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceSubstance(String value) {
            this.referenceSubstance = value;
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
     *         &lt;element name="RoleProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *         &lt;element name="Manufacturer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="Importer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="OnlyRepresentative" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
     *         &lt;element name="DownstreamUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
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
        "roleProtection",
        "manufacturer",
        "importer",
        "onlyRepresentative",
        "downstreamUser"
    })
    public static class RoleInSupplyChain {

        @XmlElement(name = "RoleProtection", required = true)
        protected DataProtectionField roleProtection;
        @XmlElement(name = "Manufacturer", required = true, type = Boolean.class, nillable = true)
        protected Boolean manufacturer;
        @XmlElement(name = "Importer", required = true, type = Boolean.class, nillable = true)
        protected Boolean importer;
        @XmlElement(name = "OnlyRepresentative", required = true, type = Boolean.class, nillable = true)
        protected Boolean onlyRepresentative;
        @XmlElement(name = "DownstreamUser", required = true, type = Boolean.class, nillable = true)
        protected Boolean downstreamUser;

        /**
         * Gets the value of the roleProtection property.
         * 
         * @return
         *     possible object is
         *     {@link DataProtectionField }
         *     
         */
        public DataProtectionField getRoleProtection() {
            return roleProtection;
        }

        /**
         * Sets the value of the roleProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataProtectionField }
         *     
         */
        public void setRoleProtection(DataProtectionField value) {
            this.roleProtection = value;
        }

        /**
         * Gets the value of the manufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getManufacturer() {
            return manufacturer;
        }

        /**
         * Sets the value of the manufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setManufacturer(Boolean value) {
            this.manufacturer = value;
        }

        /**
         * Gets the value of the importer property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getImporter() {
            return importer;
        }

        /**
         * Sets the value of the importer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setImporter(Boolean value) {
            this.importer = value;
        }

        /**
         * Gets the value of the onlyRepresentative property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getOnlyRepresentative() {
            return onlyRepresentative;
        }

        /**
         * Sets the value of the onlyRepresentative property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOnlyRepresentative(Boolean value) {
            this.onlyRepresentative = value;
        }

        /**
         * Gets the value of the downstreamUser property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getDownstreamUser() {
            return downstreamUser;
        }

        /**
         * Sets the value of the downstreamUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDownstreamUser(Boolean value) {
            this.downstreamUser = value;
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
     *         &lt;element name="Template" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "template"
    })
    public static class Templates {

        @XmlElement(name = "Template")
        protected List<String> template;

        /**
         * Gets the value of the template property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the template property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTemplate() {
            if (template == null) {
                template = new ArrayList<String>();
            }
            return this.template;
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
     *         &lt;element name="Composition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="Origin" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
        "composition",
        "origin"
    })
    public static class TypeOfSubstance {

        @XmlElement(name = "Composition", required = true)
        protected PicklistField composition;
        @XmlElement(name = "Origin", required = true)
        protected PicklistField origin;

        /**
         * Gets the value of the composition property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getComposition() {
            return composition;
        }

        /**
         * Sets the value of the composition property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setComposition(PicklistField value) {
            this.composition = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setOrigin(PicklistField value) {
            this.origin = value;
        }

    }

}
