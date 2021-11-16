
package eu.europa.echa.iuclid6.namespaces.flexible_record_protectionmeasures._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
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
 *         &lt;element name="AdministrativeDataSummary" minOccurs="0">
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
 *         &lt;element name="InstructionsForUse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InstructionsForUse" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MeasuresToProtect" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecommendedMethodsAndPrecautionsConcerningStorage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RecommendedMethodsAndPrecautionsConcerningHandling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="RecommendedMethodsAndPrecautionsConcerningFire" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ParticularsOfLikelyDirect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FirstAidInstructionsAntidotes" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EmergencyMeasuresToProtectEnvironmentInCaseOfAccident" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ControlMeasuresOfRepellents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Procedures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PossibilityOfDestructionOrDecontamination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Air" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Water" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Soil" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProceduresForWasteManagement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PossibilityOfReuseOrRecycling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="PossibilityOfNeutralisationOfEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ConditionsForControllerDischarge" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="ConditionsForControllerIncineration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="InstructionsForSafeDisposal" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
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
    "administrativeDataSummary",
    "instructionsForUse",
    "measuresToProtect",
    "possibilityOfDestructionOrDecontamination",
    "proceduresForWasteManagement",
    "additionalInformation"
})
@XmlRootElement(name = "FLEXIBLE_RECORD.ProtectionMeasures")
public class FLEXIBLERECORDProtectionMeasures {

    @XmlElement(name = "AdministrativeDataSummary")
    protected FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary administrativeDataSummary;
    @XmlElement(name = "InstructionsForUse")
    protected FLEXIBLERECORDProtectionMeasures.InstructionsForUse instructionsForUse;
    @XmlElement(name = "MeasuresToProtect")
    protected FLEXIBLERECORDProtectionMeasures.MeasuresToProtect measuresToProtect;
    @XmlElement(name = "PossibilityOfDestructionOrDecontamination")
    protected FLEXIBLERECORDProtectionMeasures.PossibilityOfDestructionOrDecontamination possibilityOfDestructionOrDecontamination;
    @XmlElement(name = "ProceduresForWasteManagement")
    protected FLEXIBLERECORDProtectionMeasures.ProceduresForWasteManagement proceduresForWasteManagement;
    @XmlElement(name = "AdditionalInformation")
    protected FLEXIBLERECORDProtectionMeasures.AdditionalInformation additionalInformation;

    /**
     * Gets the value of the administrativeDataSummary property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary }
     *     
     */
    public FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary getAdministrativeDataSummary() {
        return administrativeDataSummary;
    }

    /**
     * Sets the value of the administrativeDataSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary }
     *     
     */
    public void setAdministrativeDataSummary(FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary value) {
        this.administrativeDataSummary = value;
    }

    /**
     * Gets the value of the instructionsForUse property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDProtectionMeasures.InstructionsForUse }
     *     
     */
    public FLEXIBLERECORDProtectionMeasures.InstructionsForUse getInstructionsForUse() {
        return instructionsForUse;
    }

    /**
     * Sets the value of the instructionsForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDProtectionMeasures.InstructionsForUse }
     *     
     */
    public void setInstructionsForUse(FLEXIBLERECORDProtectionMeasures.InstructionsForUse value) {
        this.instructionsForUse = value;
    }

    /**
     * Gets the value of the measuresToProtect property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDProtectionMeasures.MeasuresToProtect }
     *     
     */
    public FLEXIBLERECORDProtectionMeasures.MeasuresToProtect getMeasuresToProtect() {
        return measuresToProtect;
    }

    /**
     * Sets the value of the measuresToProtect property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDProtectionMeasures.MeasuresToProtect }
     *     
     */
    public void setMeasuresToProtect(FLEXIBLERECORDProtectionMeasures.MeasuresToProtect value) {
        this.measuresToProtect = value;
    }

    /**
     * Gets the value of the possibilityOfDestructionOrDecontamination property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDProtectionMeasures.PossibilityOfDestructionOrDecontamination }
     *     
     */
    public FLEXIBLERECORDProtectionMeasures.PossibilityOfDestructionOrDecontamination getPossibilityOfDestructionOrDecontamination() {
        return possibilityOfDestructionOrDecontamination;
    }

    /**
     * Sets the value of the possibilityOfDestructionOrDecontamination property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDProtectionMeasures.PossibilityOfDestructionOrDecontamination }
     *     
     */
    public void setPossibilityOfDestructionOrDecontamination(FLEXIBLERECORDProtectionMeasures.PossibilityOfDestructionOrDecontamination value) {
        this.possibilityOfDestructionOrDecontamination = value;
    }

    /**
     * Gets the value of the proceduresForWasteManagement property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDProtectionMeasures.ProceduresForWasteManagement }
     *     
     */
    public FLEXIBLERECORDProtectionMeasures.ProceduresForWasteManagement getProceduresForWasteManagement() {
        return proceduresForWasteManagement;
    }

    /**
     * Sets the value of the proceduresForWasteManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDProtectionMeasures.ProceduresForWasteManagement }
     *     
     */
    public void setProceduresForWasteManagement(FLEXIBLERECORDProtectionMeasures.ProceduresForWasteManagement value) {
        this.proceduresForWasteManagement = value;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDProtectionMeasures.AdditionalInformation }
     *     
     */
    public FLEXIBLERECORDProtectionMeasures.AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDProtectionMeasures.AdditionalInformation }
     *     
     */
    public void setAdditionalInformation(FLEXIBLERECORDProtectionMeasures.AdditionalInformation value) {
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
     *         &lt;element name="Reference" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
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
        "reference"
    })
    public static class AdditionalInformation {

        @XmlElement(name = "Reference")
        protected DocumentReferenceMultipleField reference;

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
    public static class AdministrativeDataSummary {

        @XmlElement(name = "DataProtection")
        protected FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection dataProtection;

        /**
         * Gets the value of the dataProtection property.
         * 
         * @return
         *     possible object is
         *     {@link FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection }
         *     
         */
        public FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection getDataProtection() {
            return dataProtection;
        }

        /**
         * Sets the value of the dataProtection property.
         * 
         * @param value
         *     allowed object is
         *     {@link FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection }
         *     
         */
        public void setDataProtection(FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection value) {
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
            protected List<FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection.Legislation> legislation;

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
             * {@link FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection.Legislation }
             * 
             * 
             */
            public List<FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection.Legislation> getLegislation() {
                if (legislation == null) {
                    legislation = new ArrayList<FLEXIBLERECORDProtectionMeasures.AdministrativeDataSummary.DataProtection.Legislation>();
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
     *         &lt;element name="InstructionsForUse" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
        "instructionsForUse"
    })
    public static class InstructionsForUse {

        @XmlElement(name = "InstructionsForUse")
        protected List<MultilingualTextField> instructionsForUse;

        /**
         * Gets the value of the instructionsForUse property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instructionsForUse property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstructionsForUse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getInstructionsForUse() {
            if (instructionsForUse == null) {
                instructionsForUse = new ArrayList<MultilingualTextField>();
            }
            return this.instructionsForUse;
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
     *         &lt;element name="RecommendedMethodsAndPrecautionsConcerningStorage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RecommendedMethodsAndPrecautionsConcerningHandling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="RecommendedMethodsAndPrecautionsConcerningFire" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ParticularsOfLikelyDirect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FirstAidInstructionsAntidotes" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EmergencyMeasuresToProtectEnvironmentInCaseOfAccident" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ControlMeasuresOfRepellents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Procedures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "recommendedMethodsAndPrecautionsConcerningStorage",
        "recommendedMethodsAndPrecautionsConcerningHandling",
        "recommendedMethodsAndPrecautionsConcerningFire",
        "particularsOfLikelyDirect",
        "firstAidInstructionsAntidotes",
        "emergencyMeasuresToProtectEnvironmentInCaseOfAccident",
        "controlMeasuresOfRepellents",
        "procedures"
    })
    public static class MeasuresToProtect {

        @XmlElement(name = "RecommendedMethodsAndPrecautionsConcerningStorage")
        protected List<MultilingualTextField> recommendedMethodsAndPrecautionsConcerningStorage;
        @XmlElement(name = "RecommendedMethodsAndPrecautionsConcerningHandling")
        protected List<MultilingualTextFieldLarge> recommendedMethodsAndPrecautionsConcerningHandling;
        @XmlElement(name = "RecommendedMethodsAndPrecautionsConcerningFire")
        protected List<MultilingualTextFieldLarge> recommendedMethodsAndPrecautionsConcerningFire;
        @XmlElement(name = "ParticularsOfLikelyDirect")
        protected List<MultilingualTextField> particularsOfLikelyDirect;
        @XmlElement(name = "FirstAidInstructionsAntidotes")
        protected List<MultilingualTextFieldLarge> firstAidInstructionsAntidotes;
        @XmlElement(name = "EmergencyMeasuresToProtectEnvironmentInCaseOfAccident")
        protected List<MultilingualTextFieldLarge> emergencyMeasuresToProtectEnvironmentInCaseOfAccident;
        @XmlElement(name = "ControlMeasuresOfRepellents")
        protected List<MultilingualTextField> controlMeasuresOfRepellents;
        @XmlElement(name = "Procedures")
        protected List<MultilingualTextFieldLarge> procedures;

        /**
         * Gets the value of the recommendedMethodsAndPrecautionsConcerningStorage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendedMethodsAndPrecautionsConcerningStorage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendedMethodsAndPrecautionsConcerningStorage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getRecommendedMethodsAndPrecautionsConcerningStorage() {
            if (recommendedMethodsAndPrecautionsConcerningStorage == null) {
                recommendedMethodsAndPrecautionsConcerningStorage = new ArrayList<MultilingualTextField>();
            }
            return this.recommendedMethodsAndPrecautionsConcerningStorage;
        }

        /**
         * Gets the value of the recommendedMethodsAndPrecautionsConcerningHandling property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendedMethodsAndPrecautionsConcerningHandling property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendedMethodsAndPrecautionsConcerningHandling().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getRecommendedMethodsAndPrecautionsConcerningHandling() {
            if (recommendedMethodsAndPrecautionsConcerningHandling == null) {
                recommendedMethodsAndPrecautionsConcerningHandling = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.recommendedMethodsAndPrecautionsConcerningHandling;
        }

        /**
         * Gets the value of the recommendedMethodsAndPrecautionsConcerningFire property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommendedMethodsAndPrecautionsConcerningFire property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommendedMethodsAndPrecautionsConcerningFire().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getRecommendedMethodsAndPrecautionsConcerningFire() {
            if (recommendedMethodsAndPrecautionsConcerningFire == null) {
                recommendedMethodsAndPrecautionsConcerningFire = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.recommendedMethodsAndPrecautionsConcerningFire;
        }

        /**
         * Gets the value of the particularsOfLikelyDirect property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the particularsOfLikelyDirect property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParticularsOfLikelyDirect().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getParticularsOfLikelyDirect() {
            if (particularsOfLikelyDirect == null) {
                particularsOfLikelyDirect = new ArrayList<MultilingualTextField>();
            }
            return this.particularsOfLikelyDirect;
        }

        /**
         * Gets the value of the firstAidInstructionsAntidotes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the firstAidInstructionsAntidotes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFirstAidInstructionsAntidotes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getFirstAidInstructionsAntidotes() {
            if (firstAidInstructionsAntidotes == null) {
                firstAidInstructionsAntidotes = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.firstAidInstructionsAntidotes;
        }

        /**
         * Gets the value of the emergencyMeasuresToProtectEnvironmentInCaseOfAccident property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emergencyMeasuresToProtectEnvironmentInCaseOfAccident property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmergencyMeasuresToProtectEnvironmentInCaseOfAccident().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getEmergencyMeasuresToProtectEnvironmentInCaseOfAccident() {
            if (emergencyMeasuresToProtectEnvironmentInCaseOfAccident == null) {
                emergencyMeasuresToProtectEnvironmentInCaseOfAccident = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.emergencyMeasuresToProtectEnvironmentInCaseOfAccident;
        }

        /**
         * Gets the value of the controlMeasuresOfRepellents property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the controlMeasuresOfRepellents property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getControlMeasuresOfRepellents().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getControlMeasuresOfRepellents() {
            if (controlMeasuresOfRepellents == null) {
                controlMeasuresOfRepellents = new ArrayList<MultilingualTextField>();
            }
            return this.controlMeasuresOfRepellents;
        }

        /**
         * Gets the value of the procedures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getProcedures() {
            if (procedures == null) {
                procedures = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.procedures;
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
     *         &lt;element name="Air" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Water" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Soil" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "air",
        "water",
        "soil"
    })
    public static class PossibilityOfDestructionOrDecontamination {

        @XmlElement(name = "Air")
        protected List<MultilingualTextFieldLarge> air;
        @XmlElement(name = "Water")
        protected List<MultilingualTextFieldLarge> water;
        @XmlElement(name = "Soil")
        protected List<MultilingualTextFieldLarge> soil;

        /**
         * Gets the value of the air property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the air property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAir().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getAir() {
            if (air == null) {
                air = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.air;
        }

        /**
         * Gets the value of the water property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the water property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWater().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getWater() {
            if (water == null) {
                water = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.water;
        }

        /**
         * Gets the value of the soil property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the soil property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSoil().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getSoil() {
            if (soil == null) {
                soil = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.soil;
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
     *         &lt;element name="PossibilityOfReuseOrRecycling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="PossibilityOfNeutralisationOfEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ConditionsForControllerDischarge" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="ConditionsForControllerIncineration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="InstructionsForSafeDisposal" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
        "possibilityOfReuseOrRecycling",
        "possibilityOfNeutralisationOfEffects",
        "conditionsForControllerDischarge",
        "conditionsForControllerIncineration",
        "instructionsForSafeDisposal"
    })
    public static class ProceduresForWasteManagement {

        @XmlElement(name = "PossibilityOfReuseOrRecycling")
        protected List<MultilingualTextFieldLarge> possibilityOfReuseOrRecycling;
        @XmlElement(name = "PossibilityOfNeutralisationOfEffects")
        protected List<MultilingualTextFieldLarge> possibilityOfNeutralisationOfEffects;
        @XmlElement(name = "ConditionsForControllerDischarge")
        protected List<MultilingualTextFieldLarge> conditionsForControllerDischarge;
        @XmlElement(name = "ConditionsForControllerIncineration")
        protected List<MultilingualTextFieldLarge> conditionsForControllerIncineration;
        @XmlElement(name = "InstructionsForSafeDisposal")
        protected List<MultilingualTextField> instructionsForSafeDisposal;

        /**
         * Gets the value of the possibilityOfReuseOrRecycling property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the possibilityOfReuseOrRecycling property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPossibilityOfReuseOrRecycling().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getPossibilityOfReuseOrRecycling() {
            if (possibilityOfReuseOrRecycling == null) {
                possibilityOfReuseOrRecycling = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.possibilityOfReuseOrRecycling;
        }

        /**
         * Gets the value of the possibilityOfNeutralisationOfEffects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the possibilityOfNeutralisationOfEffects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPossibilityOfNeutralisationOfEffects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getPossibilityOfNeutralisationOfEffects() {
            if (possibilityOfNeutralisationOfEffects == null) {
                possibilityOfNeutralisationOfEffects = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.possibilityOfNeutralisationOfEffects;
        }

        /**
         * Gets the value of the conditionsForControllerDischarge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conditionsForControllerDischarge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConditionsForControllerDischarge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getConditionsForControllerDischarge() {
            if (conditionsForControllerDischarge == null) {
                conditionsForControllerDischarge = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.conditionsForControllerDischarge;
        }

        /**
         * Gets the value of the conditionsForControllerIncineration property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conditionsForControllerIncineration property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConditionsForControllerIncineration().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getConditionsForControllerIncineration() {
            if (conditionsForControllerIncineration == null) {
                conditionsForControllerIncineration = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.conditionsForControllerIncineration;
        }

        /**
         * Gets the value of the instructionsForSafeDisposal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instructionsForSafeDisposal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstructionsForSafeDisposal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextField }
         * 
         * 
         */
        public List<MultilingualTextField> getInstructionsForSafeDisposal() {
            if (instructionsForSafeDisposal == null) {
                instructionsForSafeDisposal = new ArrayList<MultilingualTextField>();
            }
            return this.instructionsForSafeDisposal;
        }

    }

}
