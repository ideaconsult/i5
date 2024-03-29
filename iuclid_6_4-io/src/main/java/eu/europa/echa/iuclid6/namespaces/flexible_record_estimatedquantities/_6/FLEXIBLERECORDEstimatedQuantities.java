
package eu.europa.echa.iuclid6.namespaces.flexible_record_estimatedquantities._6;

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
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldSmall;


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
 *         &lt;element name="Year" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalTonnage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Manufacturer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                   &lt;element name="Imported" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetailsTonnage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TonnageDirectlyExported" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                   &lt;element name="TonnageOwnUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                   &lt;element name="TonnageIntermediateTransporter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                   &lt;element name="TonnageIntermediateOnsite" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TonnagesNotificationSubstancesInArticles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TonnageImportedArticles" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                   &lt;element name="TonnageProducedArticles" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
    "year",
    "totalTonnage",
    "detailsTonnage",
    "tonnagesNotificationSubstancesInArticles",
    "additionalInformation"
})
@XmlRootElement(name = "FLEXIBLE_RECORD.EstimatedQuantities")
public class FLEXIBLERECORDEstimatedQuantities {

    @XmlElement(name = "DataProtection")
    protected FLEXIBLERECORDEstimatedQuantities.DataProtection dataProtection;
    @XmlElementRef(name = "Year", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> year;
    @XmlElement(name = "TotalTonnage")
    protected FLEXIBLERECORDEstimatedQuantities.TotalTonnage totalTonnage;
    @XmlElement(name = "DetailsTonnage")
    protected FLEXIBLERECORDEstimatedQuantities.DetailsTonnage detailsTonnage;
    @XmlElement(name = "TonnagesNotificationSubstancesInArticles")
    protected FLEXIBLERECORDEstimatedQuantities.TonnagesNotificationSubstancesInArticles tonnagesNotificationSubstancesInArticles;
    @XmlElement(name = "AdditionalInformation")
    protected FLEXIBLERECORDEstimatedQuantities.AdditionalInformation additionalInformation;

    /**
     * Gets the value of the dataProtection property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.DataProtection }
     *     
     */
    public FLEXIBLERECORDEstimatedQuantities.DataProtection getDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.DataProtection }
     *     
     */
    public void setDataProtection(FLEXIBLERECORDEstimatedQuantities.DataProtection value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setYear(JAXBElement<BigInteger> value) {
        this.year = value;
    }

    /**
     * Gets the value of the totalTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.TotalTonnage }
     *     
     */
    public FLEXIBLERECORDEstimatedQuantities.TotalTonnage getTotalTonnage() {
        return totalTonnage;
    }

    /**
     * Sets the value of the totalTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.TotalTonnage }
     *     
     */
    public void setTotalTonnage(FLEXIBLERECORDEstimatedQuantities.TotalTonnage value) {
        this.totalTonnage = value;
    }

    /**
     * Gets the value of the detailsTonnage property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.DetailsTonnage }
     *     
     */
    public FLEXIBLERECORDEstimatedQuantities.DetailsTonnage getDetailsTonnage() {
        return detailsTonnage;
    }

    /**
     * Sets the value of the detailsTonnage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.DetailsTonnage }
     *     
     */
    public void setDetailsTonnage(FLEXIBLERECORDEstimatedQuantities.DetailsTonnage value) {
        this.detailsTonnage = value;
    }

    /**
     * Gets the value of the tonnagesNotificationSubstancesInArticles property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.TonnagesNotificationSubstancesInArticles }
     *     
     */
    public FLEXIBLERECORDEstimatedQuantities.TonnagesNotificationSubstancesInArticles getTonnagesNotificationSubstancesInArticles() {
        return tonnagesNotificationSubstancesInArticles;
    }

    /**
     * Sets the value of the tonnagesNotificationSubstancesInArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.TonnagesNotificationSubstancesInArticles }
     *     
     */
    public void setTonnagesNotificationSubstancesInArticles(FLEXIBLERECORDEstimatedQuantities.TonnagesNotificationSubstancesInArticles value) {
        this.tonnagesNotificationSubstancesInArticles = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.AdditionalInformation }
     *     
     */
    public FLEXIBLERECORDEstimatedQuantities.AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDEstimatedQuantities.AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(FLEXIBLERECORDEstimatedQuantities.AdditionalInformation value) {
        this.additionalInformation = value;
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
        "remarks"
    })
    public static class AdditionalInformation {

        @XmlElement(name = "Remarks")
        protected List<MultilingualTextFieldLarge> remarks;

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
        protected List<FLEXIBLERECORDEstimatedQuantities.DataProtection.Legislation> legislation;

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
         * {@link FLEXIBLERECORDEstimatedQuantities.DataProtection.Legislation }
         * 
         * 
         */
        public List<FLEXIBLERECORDEstimatedQuantities.DataProtection.Legislation> getLegislation() {
            if (legislation == null) {
                legislation = new ArrayList<FLEXIBLERECORDEstimatedQuantities.DataProtection.Legislation>();
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
     *         &lt;element name="TonnageDirectlyExported" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *         &lt;element name="TonnageOwnUser" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *         &lt;element name="TonnageIntermediateTransporter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *         &lt;element name="TonnageIntermediateOnsite" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
        "tonnageDirectlyExported",
        "tonnageOwnUser",
        "tonnageIntermediateTransporter",
        "tonnageIntermediateOnsite"
    })
    public static class DetailsTonnage {

        @XmlElementRef(name = "TonnageDirectlyExported", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tonnageDirectlyExported;
        @XmlElementRef(name = "TonnageOwnUser", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tonnageOwnUser;
        @XmlElementRef(name = "TonnageIntermediateTransporter", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tonnageIntermediateTransporter;
        @XmlElementRef(name = "TonnageIntermediateOnsite", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tonnageIntermediateOnsite;

        /**
         * Gets the value of the tonnageDirectlyExported property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTonnageDirectlyExported() {
            return tonnageDirectlyExported;
        }

        /**
         * Sets the value of the tonnageDirectlyExported property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTonnageDirectlyExported(JAXBElement<BigDecimal> value) {
            this.tonnageDirectlyExported = value;
        }

        /**
         * Gets the value of the tonnageOwnUser property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTonnageOwnUser() {
            return tonnageOwnUser;
        }

        /**
         * Sets the value of the tonnageOwnUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTonnageOwnUser(JAXBElement<BigDecimal> value) {
            this.tonnageOwnUser = value;
        }

        /**
         * Gets the value of the tonnageIntermediateTransporter property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTonnageIntermediateTransporter() {
            return tonnageIntermediateTransporter;
        }

        /**
         * Sets the value of the tonnageIntermediateTransporter property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTonnageIntermediateTransporter(JAXBElement<BigDecimal> value) {
            this.tonnageIntermediateTransporter = value;
        }

        /**
         * Gets the value of the tonnageIntermediateOnsite property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTonnageIntermediateOnsite() {
            return tonnageIntermediateOnsite;
        }

        /**
         * Sets the value of the tonnageIntermediateOnsite property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTonnageIntermediateOnsite(JAXBElement<BigDecimal> value) {
            this.tonnageIntermediateOnsite = value;
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
     *         &lt;element name="TonnageImportedArticles" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *         &lt;element name="TonnageProducedArticles" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
        "tonnageImportedArticles",
        "tonnageProducedArticles"
    })
    public static class TonnagesNotificationSubstancesInArticles {

        @XmlElementRef(name = "TonnageImportedArticles", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tonnageImportedArticles;
        @XmlElementRef(name = "TonnageProducedArticles", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> tonnageProducedArticles;

        /**
         * Gets the value of the tonnageImportedArticles property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTonnageImportedArticles() {
            return tonnageImportedArticles;
        }

        /**
         * Sets the value of the tonnageImportedArticles property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTonnageImportedArticles(JAXBElement<BigDecimal> value) {
            this.tonnageImportedArticles = value;
        }

        /**
         * Gets the value of the tonnageProducedArticles property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getTonnageProducedArticles() {
            return tonnageProducedArticles;
        }

        /**
         * Sets the value of the tonnageProducedArticles property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setTonnageProducedArticles(JAXBElement<BigDecimal> value) {
            this.tonnageProducedArticles = value;
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
     *         &lt;element name="Manufacturer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
     *         &lt;element name="Imported" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField" minOccurs="0"/>
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
        "manufacturer",
        "imported"
    })
    public static class TotalTonnage {

        @XmlElementRef(name = "Manufacturer", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> manufacturer;
        @XmlElementRef(name = "Imported", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-EstimatedQuantities/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<BigDecimal> imported;

        /**
         * Gets the value of the manufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getManufacturer() {
            return manufacturer;
        }

        /**
         * Sets the value of the manufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setManufacturer(JAXBElement<BigDecimal> value) {
            this.manufacturer = value;
        }

        /**
         * Gets the value of the imported property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public JAXBElement<BigDecimal> getImported() {
            return imported;
        }

        /**
         * Sets the value of the imported property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
         *     
         */
        public void setImported(JAXBElement<BigDecimal> value) {
            this.imported = value;
        }

    }

}
