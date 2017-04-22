
package eu.europa.echa.iuclid6.namespaces.legal_entity._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.AddressField;
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
 *         &lt;element name="GeneralInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LegalEntityName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LegalEntityType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="OtherNames">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *         &lt;element name="Identifiers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LegalEntityIdentifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="IdentifierType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                   &lt;element name="RegulatoryProgrammeIdentifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="RegulatoryProgramme" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *                   &lt;element name="ExternalSystemIdentifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="ExternalSystemDesignator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                       &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *         &lt;element name="ContactInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactAddress">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                             &lt;element name="ContactAddress" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}addressField"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ContactPersons">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="ContactPerson" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
    "generalInfo",
    "identifiers",
    "contactInfo"
})
@XmlRootElement(name = "LEGAL_ENTITY")
public class LEGALENTITY {

    @XmlElement(name = "GeneralInfo", required = true)
    protected LEGALENTITY.GeneralInfo generalInfo;
    @XmlElement(name = "Identifiers", required = true)
    protected LEGALENTITY.Identifiers identifiers;
    @XmlElement(name = "ContactInfo", required = true)
    protected LEGALENTITY.ContactInfo contactInfo;

    /**
     * Gets the value of the generalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALENTITY.GeneralInfo }
     *     
     */
    public LEGALENTITY.GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALENTITY.GeneralInfo }
     *     
     */
    public void setGeneralInfo(LEGALENTITY.GeneralInfo value) {
        this.generalInfo = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALENTITY.Identifiers }
     *     
     */
    public LEGALENTITY.Identifiers getIdentifiers() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALENTITY.Identifiers }
     *     
     */
    public void setIdentifiers(LEGALENTITY.Identifiers value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LEGALENTITY.ContactInfo }
     *     
     */
    public LEGALENTITY.ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEGALENTITY.ContactInfo }
     *     
     */
    public void setContactInfo(LEGALENTITY.ContactInfo value) {
        this.contactInfo = value;
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
     *         &lt;element name="ContactAddress">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *                   &lt;element name="ContactAddress" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}addressField"/>
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
        "contactAddress",
        "contactPersons"
    })
    public static class ContactInfo {

        @XmlElement(name = "ContactAddress", required = true)
        protected LEGALENTITY.ContactInfo.ContactAddress contactAddress;
        @XmlElement(name = "ContactPersons", required = true)
        protected LEGALENTITY.ContactInfo.ContactPersons contactPersons;

        /**
         * Gets the value of the contactAddress property.
         * 
         * @return
         *     possible object is
         *     {@link LEGALENTITY.ContactInfo.ContactAddress }
         *     
         */
        public LEGALENTITY.ContactInfo.ContactAddress getContactAddress() {
            return contactAddress;
        }

        /**
         * Sets the value of the contactAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEGALENTITY.ContactInfo.ContactAddress }
         *     
         */
        public void setContactAddress(LEGALENTITY.ContactInfo.ContactAddress value) {
            this.contactAddress = value;
        }

        /**
         * Gets the value of the contactPersons property.
         * 
         * @return
         *     possible object is
         *     {@link LEGALENTITY.ContactInfo.ContactPersons }
         *     
         */
        public LEGALENTITY.ContactInfo.ContactPersons getContactPersons() {
            return contactPersons;
        }

        /**
         * Sets the value of the contactPersons property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEGALENTITY.ContactInfo.ContactPersons }
         *     
         */
        public void setContactPersons(LEGALENTITY.ContactInfo.ContactPersons value) {
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
         *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
         *         &lt;element name="ContactAddress" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}addressField"/>
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
            "contactAddress"
        })
        public static class ContactAddress {

            @XmlElement(name = "DataProtection", required = true)
            protected DataProtectionField dataProtection;
            @XmlElement(name = "ContactAddress", required = true)
            protected AddressField contactAddress;

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
             * Gets the value of the contactAddress property.
             * 
             * @return
             *     possible object is
             *     {@link AddressField }
             *     
             */
            public AddressField getContactAddress() {
                return contactAddress;
            }

            /**
             * Sets the value of the contactAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link AddressField }
             *     
             */
            public void setContactAddress(AddressField value) {
                this.contactAddress = value;
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

            protected List<LEGALENTITY.ContactInfo.ContactPersons.Entry> entry;

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
             * {@link LEGALENTITY.ContactInfo.ContactPersons.Entry }
             * 
             * 
             */
            public List<LEGALENTITY.ContactInfo.ContactPersons.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<LEGALENTITY.ContactInfo.ContactPersons.Entry>();
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
     *         &lt;element name="LegalEntityName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall">
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LegalEntityType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
     *                             &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
     *                             &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
        "legalEntityName",
        "legalEntityType",
        "remarks",
        "otherNames"
    })
    public static class GeneralInfo {

        @XmlElement(name = "LegalEntityName", required = true)
        protected String legalEntityName;
        @XmlElement(name = "LegalEntityType", required = true)
        protected PicklistField legalEntityType;
        @XmlElement(name = "Remarks", required = true)
        protected String remarks;
        @XmlElement(name = "OtherNames", required = true)
        protected LEGALENTITY.GeneralInfo.OtherNames otherNames;

        /**
         * Gets the value of the legalEntityName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalEntityName() {
            return legalEntityName;
        }

        /**
         * Sets the value of the legalEntityName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalEntityName(String value) {
            this.legalEntityName = value;
        }

        /**
         * Gets the value of the legalEntityType property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getLegalEntityType() {
            return legalEntityType;
        }

        /**
         * Sets the value of the legalEntityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setLegalEntityType(PicklistField value) {
            this.legalEntityType = value;
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
         * Gets the value of the otherNames property.
         * 
         * @return
         *     possible object is
         *     {@link LEGALENTITY.GeneralInfo.OtherNames }
         *     
         */
        public LEGALENTITY.GeneralInfo.OtherNames getOtherNames() {
            return otherNames;
        }

        /**
         * Sets the value of the otherNames property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEGALENTITY.GeneralInfo.OtherNames }
         *     
         */
        public void setOtherNames(LEGALENTITY.GeneralInfo.OtherNames value) {
            this.otherNames = value;
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
         *                   &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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

            protected List<LEGALENTITY.GeneralInfo.OtherNames.Entry> entry;

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
             * {@link LEGALENTITY.GeneralInfo.OtherNames.Entry }
             * 
             * 
             */
            public List<LEGALENTITY.GeneralInfo.OtherNames.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<LEGALENTITY.GeneralInfo.OtherNames.Entry>();
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
             *         &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
                "name"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "DataProtection", required = true)
                protected DataProtectionField dataProtection;
                @XmlElement(name = "Name", required = true)
                protected String name;

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
     *         &lt;element name="LegalEntityIdentifiers">
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
     *                             &lt;element name="IdentifierType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
     *         &lt;element name="RegulatoryProgrammeIdentifiers">
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
     *                             &lt;element name="RegulatoryProgramme" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
     *         &lt;element name="ExternalSystemIdentifiers">
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
     *                             &lt;element name="ExternalSystemDesignator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *                             &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
        "legalEntityIdentifiers",
        "regulatoryProgrammeIdentifiers",
        "externalSystemIdentifiers"
    })
    public static class Identifiers {

        @XmlElement(name = "LegalEntityIdentifiers", required = true)
        protected LEGALENTITY.Identifiers.LegalEntityIdentifiers legalEntityIdentifiers;
        @XmlElement(name = "RegulatoryProgrammeIdentifiers", required = true)
        protected LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers regulatoryProgrammeIdentifiers;
        @XmlElement(name = "ExternalSystemIdentifiers", required = true)
        protected LEGALENTITY.Identifiers.ExternalSystemIdentifiers externalSystemIdentifiers;

        /**
         * Gets the value of the legalEntityIdentifiers property.
         * 
         * @return
         *     possible object is
         *     {@link LEGALENTITY.Identifiers.LegalEntityIdentifiers }
         *     
         */
        public LEGALENTITY.Identifiers.LegalEntityIdentifiers getLegalEntityIdentifiers() {
            return legalEntityIdentifiers;
        }

        /**
         * Sets the value of the legalEntityIdentifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEGALENTITY.Identifiers.LegalEntityIdentifiers }
         *     
         */
        public void setLegalEntityIdentifiers(LEGALENTITY.Identifiers.LegalEntityIdentifiers value) {
            this.legalEntityIdentifiers = value;
        }

        /**
         * Gets the value of the regulatoryProgrammeIdentifiers property.
         * 
         * @return
         *     possible object is
         *     {@link LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers }
         *     
         */
        public LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers getRegulatoryProgrammeIdentifiers() {
            return regulatoryProgrammeIdentifiers;
        }

        /**
         * Sets the value of the regulatoryProgrammeIdentifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers }
         *     
         */
        public void setRegulatoryProgrammeIdentifiers(LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers value) {
            this.regulatoryProgrammeIdentifiers = value;
        }

        /**
         * Gets the value of the externalSystemIdentifiers property.
         * 
         * @return
         *     possible object is
         *     {@link LEGALENTITY.Identifiers.ExternalSystemIdentifiers }
         *     
         */
        public LEGALENTITY.Identifiers.ExternalSystemIdentifiers getExternalSystemIdentifiers() {
            return externalSystemIdentifiers;
        }

        /**
         * Sets the value of the externalSystemIdentifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link LEGALENTITY.Identifiers.ExternalSystemIdentifiers }
         *     
         */
        public void setExternalSystemIdentifiers(LEGALENTITY.Identifiers.ExternalSystemIdentifiers value) {
            this.externalSystemIdentifiers = value;
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
         *                   &lt;element name="ExternalSystemDesignator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
         *                   &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
        public static class ExternalSystemIdentifiers {

            protected List<LEGALENTITY.Identifiers.ExternalSystemIdentifiers.Entry> entry;

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
             * {@link LEGALENTITY.Identifiers.ExternalSystemIdentifiers.Entry }
             * 
             * 
             */
            public List<LEGALENTITY.Identifiers.ExternalSystemIdentifiers.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<LEGALENTITY.Identifiers.ExternalSystemIdentifiers.Entry>();
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
             *         &lt;element name="ExternalSystemDesignator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
             *         &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
                "dataProtection",
                "externalSystemDesignator",
                "id",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "DataProtection", required = true)
                protected DataProtectionField dataProtection;
                @XmlElement(name = "ExternalSystemDesignator", required = true)
                protected String externalSystemDesignator;
                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

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
                 * Gets the value of the externalSystemDesignator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExternalSystemDesignator() {
                    return externalSystemDesignator;
                }

                /**
                 * Sets the value of the externalSystemDesignator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExternalSystemDesignator(String value) {
                    this.externalSystemDesignator = value;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
         *                   &lt;element name="IdentifierType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
        public static class LegalEntityIdentifiers {

            protected List<LEGALENTITY.Identifiers.LegalEntityIdentifiers.Entry> entry;

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
             * {@link LEGALENTITY.Identifiers.LegalEntityIdentifiers.Entry }
             * 
             * 
             */
            public List<LEGALENTITY.Identifiers.LegalEntityIdentifiers.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<LEGALENTITY.Identifiers.LegalEntityIdentifiers.Entry>();
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
             *         &lt;element name="IdentifierType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
                "identifierType",
                "id"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "DataProtection", required = true)
                protected DataProtectionField dataProtection;
                @XmlElement(name = "IdentifierType", required = true)
                protected PicklistField identifierType;
                @XmlElement(name = "Id", required = true)
                protected String id;

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
                 * Gets the value of the identifierType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getIdentifierType() {
                    return identifierType;
                }

                /**
                 * Sets the value of the identifierType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setIdentifierType(PicklistField value) {
                    this.identifierType = value;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
         *                   &lt;element name="RegulatoryProgramme" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
        public static class RegulatoryProgrammeIdentifiers {

            protected List<LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers.Entry> entry;

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
             * {@link LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers.Entry }
             * 
             * 
             */
            public List<LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<LEGALENTITY.Identifiers.RegulatoryProgrammeIdentifiers.Entry>();
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
             *         &lt;element name="RegulatoryProgramme" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
                "dataProtection",
                "regulatoryProgramme",
                "id",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "DataProtection", required = true)
                protected DataProtectionField dataProtection;
                @XmlElement(name = "RegulatoryProgramme", required = true)
                protected PicklistField regulatoryProgramme;
                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

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
                 * Gets the value of the regulatoryProgramme property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getRegulatoryProgramme() {
                    return regulatoryProgramme;
                }

                /**
                 * Sets the value of the regulatoryProgramme property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setRegulatoryProgramme(PicklistField value) {
                    this.regulatoryProgramme = value;
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
