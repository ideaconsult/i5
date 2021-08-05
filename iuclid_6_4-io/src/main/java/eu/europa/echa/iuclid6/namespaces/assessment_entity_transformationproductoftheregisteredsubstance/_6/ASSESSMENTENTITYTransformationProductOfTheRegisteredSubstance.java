
package eu.europa.echa.iuclid6.namespaces.assessment_entity_transformationproductoftheregisteredsubstance._6;

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
 *         &lt;element name="AssessmentEntityConfidentialityClaim" minOccurs="0">
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
 *         &lt;element name="AssessmentEntityName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *         &lt;element name="Compositions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *         &lt;element name="RelatedComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReactionSchema" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
 *         &lt;element name="EndpointSummariesList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *                             &lt;element name="Notes" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
    "assessmentEntityConfidentialityClaim",
    "assessmentEntityName",
    "compositions",
    "relatedComposition",
    "description",
    "reactionSchema",
    "endpointSummariesList"
})
@XmlRootElement(name = "ASSESSMENT_ENTITY.TransformationProductOfTheRegisteredSubstance")
public class ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance {

    @XmlElement(name = "AssessmentEntityConfidentialityClaim")
    protected ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim assessmentEntityConfidentialityClaim;
    @XmlElement(name = "AssessmentEntityName")
    protected String assessmentEntityName;
    @XmlElement(name = "Compositions")
    protected DocumentReferenceMultipleField compositions;
    @XmlElement(name = "RelatedComposition")
    protected DocumentReferenceMultipleField relatedComposition;
    @XmlElement(name = "Description")
    protected List<MultilingualTextField> description;
    @XmlElement(name = "ReactionSchema")
    protected String reactionSchema;
    @XmlElement(name = "EndpointSummariesList")
    protected ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList endpointSummariesList;

    /**
     * Gets the value of the assessmentEntityConfidentialityClaim property.
     * 
     * @return
     *     possible object is
     *     {@link ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim }
     *     
     */
    public ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim getAssessmentEntityConfidentialityClaim() {
        return assessmentEntityConfidentialityClaim;
    }

    /**
     * Sets the value of the assessmentEntityConfidentialityClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim }
     *     
     */
    public void setAssessmentEntityConfidentialityClaim(ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim value) {
        this.assessmentEntityConfidentialityClaim = value;
    }

    /**
     * Gets the value of the assessmentEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentEntityName() {
        return assessmentEntityName;
    }

    /**
     * Sets the value of the assessmentEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentEntityName(String value) {
        this.assessmentEntityName = value;
    }

    /**
     * Gets the value of the compositions property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public DocumentReferenceMultipleField getCompositions() {
        return compositions;
    }

    /**
     * Sets the value of the compositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public void setCompositions(DocumentReferenceMultipleField value) {
        this.compositions = value;
    }

    /**
     * Gets the value of the relatedComposition property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public DocumentReferenceMultipleField getRelatedComposition() {
        return relatedComposition;
    }

    /**
     * Sets the value of the relatedComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public void setRelatedComposition(DocumentReferenceMultipleField value) {
        this.relatedComposition = value;
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
     * {@link MultilingualTextField }
     * 
     * 
     */
    public List<MultilingualTextField> getDescription() {
        if (description == null) {
            description = new ArrayList<MultilingualTextField>();
        }
        return this.description;
    }

    /**
     * Gets the value of the reactionSchema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReactionSchema() {
        return reactionSchema;
    }

    /**
     * Sets the value of the reactionSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReactionSchema(String value) {
        this.reactionSchema = value;
    }

    /**
     * Gets the value of the endpointSummariesList property.
     * 
     * @return
     *     possible object is
     *     {@link ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList }
     *     
     */
    public ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList getEndpointSummariesList() {
        return endpointSummariesList;
    }

    /**
     * Sets the value of the endpointSummariesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList }
     *     
     */
    public void setEndpointSummariesList(ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList value) {
        this.endpointSummariesList = value;
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
    public static class AssessmentEntityConfidentialityClaim
        extends BaseDataProtectionField
    {

        protected String confidentiality;
        protected List<MultilingualTextField> justification;
        protected List<ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim.Legislation> legislation;

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
         * {@link ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim.Legislation }
         * 
         * 
         */
        public List<ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim.Legislation> getLegislation() {
            if (legislation == null) {
                legislation = new ArrayList<ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.AssessmentEntityConfidentialityClaim.Legislation>();
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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
     *                   &lt;element name="Notes" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class EndpointSummariesList {

        protected List<ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList.Entry> entry;

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
         * {@link ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList.Entry }
         * 
         * 
         */
        public List<ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<ASSESSMENTENTITYTransformationProductOfTheRegisteredSubstance.EndpointSummariesList.Entry>();
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
         *         &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
         *         &lt;element name="Notes" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "name",
            "notes"
        })
        public static class Entry
            extends RepeatableEntryType
        {

            @XmlElement(name = "Name")
            protected DocumentReferenceMultipleField name;
            @XmlElement(name = "Notes")
            protected List<MultilingualTextFieldLarge> notes;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentReferenceMultipleField }
             *     
             */
            public DocumentReferenceMultipleField getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentReferenceMultipleField }
             *     
             */
            public void setName(DocumentReferenceMultipleField value) {
                this.name = value;
            }

            /**
             * Gets the value of the notes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the notes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNotes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getNotes() {
                if (notes == null) {
                    notes = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.notes;
            }

        }

    }

}