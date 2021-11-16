
package eu.europa.echa.iuclid6.namespaces.category._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BaseDataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldMultiLine;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldSmall;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.SectionTypesField;


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
 *         &lt;element name="CategoryName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PublicName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine" minOccurs="0"/>
 *         &lt;element name="OwnerLegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *         &lt;element name="RegulatoryPurposes" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Substances" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *         &lt;element name="CategoryDocuments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CategorySections" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}sectionTypesField" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JustificationsAndDiscussions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CategoryDefinition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CategoryOrderDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CategoryRationale" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Reports" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Flags" minOccurs="0">
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
 *                                       &lt;element name="Report" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
    "categoryName",
    "publicName",
    "ownerLegalEntity",
    "regulatoryPurposes",
    "remarks",
    "substances",
    "categoryDocuments",
    "justificationsAndDiscussions"
})
@XmlRootElement(name = "CATEGORY")
public class CATEGORY {

    @XmlElement(name = "CategoryName", required = true)
    protected String categoryName;
    @XmlElement(name = "PublicName")
    protected String publicName;
    @XmlElement(name = "OwnerLegalEntity", required = true)
    protected String ownerLegalEntity;
    @XmlElement(name = "RegulatoryPurposes")
    protected List<CATEGORY.RegulatoryPurposes> regulatoryPurposes;
    @XmlElement(name = "Remarks")
    protected List<MultilingualTextFieldLarge> remarks;
    @XmlElement(name = "Substances")
    protected DocumentReferenceMultipleField substances;
    @XmlElement(name = "CategoryDocuments")
    protected CATEGORY.CategoryDocuments categoryDocuments;
    @XmlElement(name = "JustificationsAndDiscussions")
    protected CATEGORY.JustificationsAndDiscussions justificationsAndDiscussions;

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
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
     * Gets the value of the regulatoryPurposes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulatoryPurposes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulatoryPurposes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CATEGORY.RegulatoryPurposes }
     * 
     * 
     */
    public List<CATEGORY.RegulatoryPurposes> getRegulatoryPurposes() {
        if (regulatoryPurposes == null) {
            regulatoryPurposes = new ArrayList<CATEGORY.RegulatoryPurposes>();
        }
        return this.regulatoryPurposes;
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
     * Gets the value of the substances property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public DocumentReferenceMultipleField getSubstances() {
        return substances;
    }

    /**
     * Sets the value of the substances property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public void setSubstances(DocumentReferenceMultipleField value) {
        this.substances = value;
    }

    /**
     * Gets the value of the categoryDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORY.CategoryDocuments }
     *     
     */
    public CATEGORY.CategoryDocuments getCategoryDocuments() {
        return categoryDocuments;
    }

    /**
     * Sets the value of the categoryDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORY.CategoryDocuments }
     *     
     */
    public void setCategoryDocuments(CATEGORY.CategoryDocuments value) {
        this.categoryDocuments = value;
    }

    /**
     * Gets the value of the justificationsAndDiscussions property.
     * 
     * @return
     *     possible object is
     *     {@link CATEGORY.JustificationsAndDiscussions }
     *     
     */
    public CATEGORY.JustificationsAndDiscussions getJustificationsAndDiscussions() {
        return justificationsAndDiscussions;
    }

    /**
     * Sets the value of the justificationsAndDiscussions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATEGORY.JustificationsAndDiscussions }
     *     
     */
    public void setJustificationsAndDiscussions(CATEGORY.JustificationsAndDiscussions value) {
        this.justificationsAndDiscussions = value;
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
     *         &lt;element name="CategorySections" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}sectionTypesField" minOccurs="0"/>
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
        "categorySections"
    })
    public static class CategoryDocuments {

        @XmlElement(name = "CategorySections")
        protected SectionTypesField categorySections;

        /**
         * Gets the value of the categorySections property.
         * 
         * @return
         *     possible object is
         *     {@link SectionTypesField }
         *     
         */
        public SectionTypesField getCategorySections() {
            return categorySections;
        }

        /**
         * Sets the value of the categorySections property.
         * 
         * @param value
         *     allowed object is
         *     {@link SectionTypesField }
         *     
         */
        public void setCategorySections(SectionTypesField value) {
            this.categorySections = value;
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
     *         &lt;element name="CategoryDefinition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CategoryOrderDescription" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CategoryRationale" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Reports" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Flags" minOccurs="0">
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
     *                             &lt;element name="Report" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
        "categoryDefinition",
        "categoryOrderDescription",
        "categoryRationale",
        "reports"
    })
    public static class JustificationsAndDiscussions {

        @XmlElement(name = "CategoryDefinition")
        protected List<MultilingualTextFieldMultiLine> categoryDefinition;
        @XmlElement(name = "CategoryOrderDescription")
        protected List<MultilingualTextFieldSmall> categoryOrderDescription;
        @XmlElement(name = "CategoryRationale")
        protected List<MultilingualTextFieldLarge> categoryRationale;
        @XmlElement(name = "Reports")
        protected CATEGORY.JustificationsAndDiscussions.Reports reports;

        /**
         * Gets the value of the categoryDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldMultiLine }
         * 
         * 
         */
        public List<MultilingualTextFieldMultiLine> getCategoryDefinition() {
            if (categoryDefinition == null) {
                categoryDefinition = new ArrayList<MultilingualTextFieldMultiLine>();
            }
            return this.categoryDefinition;
        }

        /**
         * Gets the value of the categoryOrderDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryOrderDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryOrderDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldSmall }
         * 
         * 
         */
        public List<MultilingualTextFieldSmall> getCategoryOrderDescription() {
            if (categoryOrderDescription == null) {
                categoryOrderDescription = new ArrayList<MultilingualTextFieldSmall>();
            }
            return this.categoryOrderDescription;
        }

        /**
         * Gets the value of the categoryRationale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the categoryRationale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategoryRationale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getCategoryRationale() {
            if (categoryRationale == null) {
                categoryRationale = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.categoryRationale;
        }

        /**
         * Gets the value of the reports property.
         * 
         * @return
         *     possible object is
         *     {@link CATEGORY.JustificationsAndDiscussions.Reports }
         *     
         */
        public CATEGORY.JustificationsAndDiscussions.Reports getReports() {
            return reports;
        }

        /**
         * Sets the value of the reports property.
         * 
         * @param value
         *     allowed object is
         *     {@link CATEGORY.JustificationsAndDiscussions.Reports }
         *     
         */
        public void setReports(CATEGORY.JustificationsAndDiscussions.Reports value) {
            this.reports = value;
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
         *                   &lt;element name="Flags" minOccurs="0">
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
         *                   &lt;element name="Report" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
        public static class Reports {

            protected List<CATEGORY.JustificationsAndDiscussions.Reports.Entry> entry;

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
             * {@link CATEGORY.JustificationsAndDiscussions.Reports.Entry }
             * 
             * 
             */
            public List<CATEGORY.JustificationsAndDiscussions.Reports.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<CATEGORY.JustificationsAndDiscussions.Reports.Entry>();
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
             *         &lt;element name="Flags" minOccurs="0">
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
             *         &lt;element name="Report" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField" minOccurs="0"/>
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
                "flags",
                "report"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Flags")
                protected CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags flags;
                @XmlElement(name = "Report")
                protected String report;

                /**
                 * Gets the value of the flags property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags }
                 *     
                 */
                public CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags getFlags() {
                    return flags;
                }

                /**
                 * Sets the value of the flags property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags }
                 *     
                 */
                public void setFlags(CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags value) {
                    this.flags = value;
                }

                /**
                 * Gets the value of the report property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReport() {
                    return report;
                }

                /**
                 * Sets the value of the report property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReport(String value) {
                    this.report = value;
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
                public static class Flags
                    extends BaseDataProtectionField
                {

                    protected String confidentiality;
                    protected List<MultilingualTextField> justification;
                    protected List<CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags.Legislation> legislation;

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
                     * {@link CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags.Legislation }
                     * 
                     * 
                     */
                    public List<CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags.Legislation> getLegislation() {
                        if (legislation == null) {
                            legislation = new ArrayList<CATEGORY.JustificationsAndDiscussions.Reports.Entry.Flags.Legislation>();
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
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/domain/v6}N78" minOccurs="0"/>
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
    public static class RegulatoryPurposes
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
