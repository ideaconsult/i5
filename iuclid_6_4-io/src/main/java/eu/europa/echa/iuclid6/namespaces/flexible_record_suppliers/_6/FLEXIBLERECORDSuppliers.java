
package eu.europa.echa.iuclid6.namespaces.flexible_record_suppliers._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
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
 *         &lt;element name="ManufacturerImportForm" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OnlyRepresentationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NonEUManufacturerAssignment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *                   &lt;element name="ImporterEntries" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
 *                                       &lt;element name="Agreement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
    "dataProtection",
    "manufacturerImportForm",
    "onlyRepresentationInfo"
})
@XmlRootElement(name = "FLEXIBLE_RECORD.Suppliers")
public class FLEXIBLERECORDSuppliers {

    @XmlElement(name = "DataProtection")
    protected FLEXIBLERECORDSuppliers.DataProtection dataProtection;
    @XmlElement(name = "ManufacturerImportForm")
    protected FLEXIBLERECORDSuppliers.ManufacturerImportForm manufacturerImportForm;
    @XmlElement(name = "OnlyRepresentationInfo")
    protected FLEXIBLERECORDSuppliers.OnlyRepresentationInfo onlyRepresentationInfo;

    /**
     * Gets the value of the dataProtection property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDSuppliers.DataProtection }
     *     
     */
    public FLEXIBLERECORDSuppliers.DataProtection getDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDSuppliers.DataProtection }
     *     
     */
    public void setDataProtection(FLEXIBLERECORDSuppliers.DataProtection value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the manufacturerImportForm property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDSuppliers.ManufacturerImportForm }
     *     
     */
    public FLEXIBLERECORDSuppliers.ManufacturerImportForm getManufacturerImportForm() {
        return manufacturerImportForm;
    }

    /**
     * Sets the value of the manufacturerImportForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDSuppliers.ManufacturerImportForm }
     *     
     */
    public void setManufacturerImportForm(FLEXIBLERECORDSuppliers.ManufacturerImportForm value) {
        this.manufacturerImportForm = value;
    }

    /**
     * Gets the value of the onlyRepresentationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDSuppliers.OnlyRepresentationInfo }
     *     
     */
    public FLEXIBLERECORDSuppliers.OnlyRepresentationInfo getOnlyRepresentationInfo() {
        return onlyRepresentationInfo;
    }

    /**
     * Sets the value of the onlyRepresentationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDSuppliers.OnlyRepresentationInfo }
     *     
     */
    public void setOnlyRepresentationInfo(FLEXIBLERECORDSuppliers.OnlyRepresentationInfo value) {
        this.onlyRepresentationInfo = value;
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
        protected List<FLEXIBLERECORDSuppliers.DataProtection.Legislation> legislation;

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
         * {@link FLEXIBLERECORDSuppliers.DataProtection.Legislation }
         * 
         * 
         */
        public List<FLEXIBLERECORDSuppliers.DataProtection.Legislation> getLegislation() {
            if (legislation == null) {
                legislation = new ArrayList<FLEXIBLERECORDSuppliers.DataProtection.Legislation>();
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
     *         &lt;element name="LegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "legalEntity",
        "remarks"
    })
    public static class ManufacturerImportForm {

        @XmlElement(name = "LegalEntity")
        protected String legalEntity;
        @XmlElement(name = "Remarks")
        protected List<MultilingualTextFieldLarge> remarks;

        /**
         * Gets the value of the legalEntity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalEntity() {
            return legalEntity;
        }

        /**
         * Sets the value of the legalEntity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalEntity(String value) {
            this.legalEntity = value;
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
     *         &lt;element name="NonEUManufacturerAssignment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
     *         &lt;element name="ImporterEntries" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="LegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
     *                             &lt;element name="Agreement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
        "nonEUManufacturerAssignment",
        "importerEntries"
    })
    public static class OnlyRepresentationInfo {

        @XmlElement(name = "NonEUManufacturerAssignment")
        protected String nonEUManufacturerAssignment;
        @XmlElement(name = "ImporterEntries")
        protected FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries importerEntries;

        /**
         * Gets the value of the nonEUManufacturerAssignment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonEUManufacturerAssignment() {
            return nonEUManufacturerAssignment;
        }

        /**
         * Sets the value of the nonEUManufacturerAssignment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonEUManufacturerAssignment(String value) {
            this.nonEUManufacturerAssignment = value;
        }

        /**
         * Gets the value of the importerEntries property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries }
         *     
         */
        public FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries getImporterEntries() {
            return importerEntries;
        }

        /**
         * Sets the value of the importerEntries property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries }
         *     
         */
        public void setImporterEntries(FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries value) {
            this.importerEntries = value;
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
         *                   &lt;element name="LegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
         *                   &lt;element name="Agreement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
        public static class ImporterEntries {

            protected List<FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries.Entry> entry;

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
             * {@link FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries.Entry }
             * 
             * 
             */
            public List<FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<FLEXIBLERECORDSuppliers.OnlyRepresentationInfo.ImporterEntries.Entry>();
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
             *         &lt;element name="LegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField" minOccurs="0"/>
             *         &lt;element name="Agreement" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
                "legalEntity",
                "agreement"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "LegalEntity")
                protected String legalEntity;
                @XmlElement(name = "Agreement")
                protected String agreement;

                /**
                 * Gets the value of the legalEntity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLegalEntity() {
                    return legalEntity;
                }

                /**
                 * Sets the value of the legalEntity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLegalEntity(String value) {
                    this.legalEntity = value;
                }

                /**
                 * Gets the value of the agreement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgreement() {
                    return agreement;
                }

                /**
                 * Sets the value of the agreement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgreement(String value) {
                    this.agreement = value;
                }

            }

        }

    }

}
