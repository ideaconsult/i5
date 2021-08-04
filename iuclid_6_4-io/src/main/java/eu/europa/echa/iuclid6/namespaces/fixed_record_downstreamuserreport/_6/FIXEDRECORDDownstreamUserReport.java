
package eu.europa.echa.iuclid6.namespaces.fixed_record_downstreamuserreport._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;


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
 *         &lt;element name="REACHDownstreamUserReport" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GeneralInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DifferentClassif" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="UseNotCovered" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="CsrProvision" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/reach/v6}PG6_60420" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="LessOneTon" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="Ppord" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FurtherInformationOnTheReportedUseS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UseNotCoveredReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="EsInconsistent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="ConditionsOutsideScope" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="UseAdvisedAgainst" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="UseNotCoveredOtherReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="UseNotCoveredSpecify" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="IssueNotResolved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="ConfReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="SupplyChainComIssue" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="IssueOtherReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                             &lt;element name="IssueOtherReasonSpecify" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
    "reachDownstreamUserReport"
})
@XmlRootElement(name = "FIXED_RECORD.DownstreamUserReport")
public class FIXEDRECORDDownstreamUserReport {

    @XmlElement(name = "REACHDownstreamUserReport")
    protected FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport reachDownstreamUserReport;

    /**
     * Gets the value of the reachDownstreamUserReport property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport }
     *     
     */
    public FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport getREACHDownstreamUserReport() {
        return reachDownstreamUserReport;
    }

    /**
     * Sets the value of the reachDownstreamUserReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport }
     *     
     */
    public void setREACHDownstreamUserReport(FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport value) {
        this.reachDownstreamUserReport = value;
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
     *         &lt;element name="GeneralInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DifferentClassif" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="UseNotCovered" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="CsrProvision" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/reach/v6}PG6_60420" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="LessOneTon" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="Ppord" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FurtherInformationOnTheReportedUseS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UseNotCoveredReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="EsInconsistent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="ConditionsOutsideScope" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="UseAdvisedAgainst" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="UseNotCoveredOtherReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="UseNotCoveredSpecify" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="IssueNotResolved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="ConfReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="SupplyChainComIssue" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="IssueOtherReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *                   &lt;element name="IssueOtherReasonSpecify" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "generalInformation",
        "furtherInformationOnTheReportedUseS"
    })
    public static class REACHDownstreamUserReport {

        @XmlElement(name = "GeneralInformation")
        protected FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation generalInformation;
        @XmlElement(name = "FurtherInformationOnTheReportedUseS")
        protected FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.FurtherInformationOnTheReportedUseS furtherInformationOnTheReportedUseS;

        /**
         * Gets the value of the generalInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation }
         *     
         */
        public FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation getGeneralInformation() {
            return generalInformation;
        }

        /**
         * Sets the value of the generalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation }
         *     
         */
        public void setGeneralInformation(FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation value) {
            this.generalInformation = value;
        }

        /**
         * Gets the value of the furtherInformationOnTheReportedUseS property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.FurtherInformationOnTheReportedUseS }
         *     
         */
        public FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.FurtherInformationOnTheReportedUseS getFurtherInformationOnTheReportedUseS() {
            return furtherInformationOnTheReportedUseS;
        }

        /**
         * Sets the value of the furtherInformationOnTheReportedUseS property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.FurtherInformationOnTheReportedUseS }
         *     
         */
        public void setFurtherInformationOnTheReportedUseS(FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.FurtherInformationOnTheReportedUseS value) {
            this.furtherInformationOnTheReportedUseS = value;
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
         *         &lt;element name="UseNotCoveredReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="EsInconsistent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="ConditionsOutsideScope" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="UseAdvisedAgainst" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="UseNotCoveredOtherReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="UseNotCoveredSpecify" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="IssueNotResolved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="ConfReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="SupplyChainComIssue" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="IssueOtherReason" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="IssueOtherReasonSpecify" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "useNotCoveredReason",
            "esInconsistent",
            "conditionsOutsideScope",
            "useAdvisedAgainst",
            "useNotCoveredOtherReason",
            "useNotCoveredSpecify",
            "issueNotResolved",
            "confReason",
            "supplyChainComIssue",
            "issueOtherReason",
            "issueOtherReasonSpecify"
        })
        public static class FurtherInformationOnTheReportedUseS {

            @XmlElementRef(name = "UseNotCoveredReason", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> useNotCoveredReason;
            @XmlElementRef(name = "EsInconsistent", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> esInconsistent;
            @XmlElementRef(name = "ConditionsOutsideScope", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> conditionsOutsideScope;
            @XmlElementRef(name = "UseAdvisedAgainst", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> useAdvisedAgainst;
            @XmlElementRef(name = "UseNotCoveredOtherReason", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> useNotCoveredOtherReason;
            @XmlElement(name = "UseNotCoveredSpecify")
            protected List<MultilingualTextFieldLarge> useNotCoveredSpecify;
            @XmlElementRef(name = "IssueNotResolved", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> issueNotResolved;
            @XmlElementRef(name = "ConfReason", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> confReason;
            @XmlElementRef(name = "SupplyChainComIssue", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> supplyChainComIssue;
            @XmlElementRef(name = "IssueOtherReason", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> issueOtherReason;
            @XmlElement(name = "IssueOtherReasonSpecify")
            protected List<MultilingualTextFieldLarge> issueOtherReasonSpecify;

            /**
             * Gets the value of the useNotCoveredReason property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getUseNotCoveredReason() {
                return useNotCoveredReason;
            }

            /**
             * Sets the value of the useNotCoveredReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setUseNotCoveredReason(JAXBElement<Boolean> value) {
                this.useNotCoveredReason = value;
            }

            /**
             * Gets the value of the esInconsistent property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getEsInconsistent() {
                return esInconsistent;
            }

            /**
             * Sets the value of the esInconsistent property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setEsInconsistent(JAXBElement<Boolean> value) {
                this.esInconsistent = value;
            }

            /**
             * Gets the value of the conditionsOutsideScope property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getConditionsOutsideScope() {
                return conditionsOutsideScope;
            }

            /**
             * Sets the value of the conditionsOutsideScope property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setConditionsOutsideScope(JAXBElement<Boolean> value) {
                this.conditionsOutsideScope = value;
            }

            /**
             * Gets the value of the useAdvisedAgainst property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getUseAdvisedAgainst() {
                return useAdvisedAgainst;
            }

            /**
             * Sets the value of the useAdvisedAgainst property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setUseAdvisedAgainst(JAXBElement<Boolean> value) {
                this.useAdvisedAgainst = value;
            }

            /**
             * Gets the value of the useNotCoveredOtherReason property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getUseNotCoveredOtherReason() {
                return useNotCoveredOtherReason;
            }

            /**
             * Sets the value of the useNotCoveredOtherReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setUseNotCoveredOtherReason(JAXBElement<Boolean> value) {
                this.useNotCoveredOtherReason = value;
            }

            /**
             * Gets the value of the useNotCoveredSpecify property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the useNotCoveredSpecify property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUseNotCoveredSpecify().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getUseNotCoveredSpecify() {
                if (useNotCoveredSpecify == null) {
                    useNotCoveredSpecify = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.useNotCoveredSpecify;
            }

            /**
             * Gets the value of the issueNotResolved property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getIssueNotResolved() {
                return issueNotResolved;
            }

            /**
             * Sets the value of the issueNotResolved property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setIssueNotResolved(JAXBElement<Boolean> value) {
                this.issueNotResolved = value;
            }

            /**
             * Gets the value of the confReason property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getConfReason() {
                return confReason;
            }

            /**
             * Sets the value of the confReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setConfReason(JAXBElement<Boolean> value) {
                this.confReason = value;
            }

            /**
             * Gets the value of the supplyChainComIssue property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getSupplyChainComIssue() {
                return supplyChainComIssue;
            }

            /**
             * Sets the value of the supplyChainComIssue property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setSupplyChainComIssue(JAXBElement<Boolean> value) {
                this.supplyChainComIssue = value;
            }

            /**
             * Gets the value of the issueOtherReason property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getIssueOtherReason() {
                return issueOtherReason;
            }

            /**
             * Sets the value of the issueOtherReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setIssueOtherReason(JAXBElement<Boolean> value) {
                this.issueOtherReason = value;
            }

            /**
             * Gets the value of the issueOtherReasonSpecify property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the issueOtherReasonSpecify property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIssueOtherReasonSpecify().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getIssueOtherReasonSpecify() {
                if (issueOtherReasonSpecify == null) {
                    issueOtherReasonSpecify = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.issueOtherReasonSpecify;
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
         *         &lt;element name="DifferentClassif" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="UseNotCovered" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="CsrProvision" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/reach/v6}PG6_60420" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="LessOneTon" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
         *         &lt;element name="Ppord" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
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
            "differentClassif",
            "useNotCovered",
            "csrProvision",
            "lessOneTon",
            "ppord"
        })
        public static class GeneralInformation {

            @XmlElementRef(name = "DifferentClassif", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> differentClassif;
            @XmlElementRef(name = "UseNotCovered", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> useNotCovered;
            @XmlElement(name = "CsrProvision")
            protected FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation.CsrProvision csrProvision;
            @XmlElementRef(name = "LessOneTon", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> lessOneTon;
            @XmlElementRef(name = "Ppord", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-DownstreamUserReport/6.0", type = JAXBElement.class, required = false)
            protected JAXBElement<Boolean> ppord;

            /**
             * Gets the value of the differentClassif property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getDifferentClassif() {
                return differentClassif;
            }

            /**
             * Sets the value of the differentClassif property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setDifferentClassif(JAXBElement<Boolean> value) {
                this.differentClassif = value;
            }

            /**
             * Gets the value of the useNotCovered property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getUseNotCovered() {
                return useNotCovered;
            }

            /**
             * Sets the value of the useNotCovered property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setUseNotCovered(JAXBElement<Boolean> value) {
                this.useNotCovered = value;
            }

            /**
             * Gets the value of the csrProvision property.
             * 
             * @return
             *     possible object is
             *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation.CsrProvision }
             *     
             */
            public FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation.CsrProvision getCsrProvision() {
                return csrProvision;
            }

            /**
             * Sets the value of the csrProvision property.
             * 
             * @param value
             *     allowed object is
             *     {@link FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation.CsrProvision }
             *     
             */
            public void setCsrProvision(FIXEDRECORDDownstreamUserReport.REACHDownstreamUserReport.GeneralInformation.CsrProvision value) {
                this.csrProvision = value;
            }

            /**
             * Gets the value of the lessOneTon property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getLessOneTon() {
                return lessOneTon;
            }

            /**
             * Sets the value of the lessOneTon property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setLessOneTon(JAXBElement<Boolean> value) {
                this.lessOneTon = value;
            }

            /**
             * Gets the value of the ppord property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public JAXBElement<Boolean> getPpord() {
                return ppord;
            }

            /**
             * Sets the value of the ppord property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
             *     
             */
            public void setPpord(JAXBElement<Boolean> value) {
                this.ppord = value;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/reach/v6}PG6_60420" minOccurs="0"/>
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
            public static class CsrProvision
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

}
