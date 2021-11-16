
package eu.europa.echa.iuclid6.namespaces.flexible_record_useatindustrialsitesadvisedagainst._6;

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
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;
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
 *         &lt;element name="IdentifiedUseNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IdentifiedUseName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RelatedComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *         &lt;element name="ContributingActivityTechniqueForTheEnvironment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="NameOfActivityTechnique" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="EnvironmentalReleaseCategoryERC" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}U03" minOccurs="0"/>
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
 *         &lt;element name="ContributingActivityTechniqueForWorkers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="NameOfActivityTechnique" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ProcessCategoryPROC" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                                     &lt;sequence>
 *                                       &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD50" minOccurs="0"/>
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
 *         &lt;element name="ProductCategories" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N35" minOccurs="0"/>
 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SectorUses" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N34" minOccurs="0"/>
 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TechnicalFunctions" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD490" minOccurs="0"/>
 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UseCoverageInCSR" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}U10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
    "identifiedUseNumber",
    "identifiedUseName",
    "description",
    "relatedComposition",
    "contributingActivityTechniqueForTheEnvironment",
    "contributingActivityTechniqueForWorkers",
    "productCategories",
    "sectorUses",
    "technicalFunctions",
    "useCoverageInCSR",
    "remarks"
})
@XmlRootElement(name = "FLEXIBLE_RECORD.UseAtIndustrialSitesAdvisedAgainst")
public class FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst {

    @XmlElement(name = "DataProtection")
    protected FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection dataProtection;
    @XmlElementRef(name = "IdentifiedUseNumber", namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-UseAtIndustrialSitesAdvisedAgainst/6.0", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> identifiedUseNumber;
    @XmlElement(name = "IdentifiedUseName")
    protected List<MultilingualTextFieldMultiLine> identifiedUseName;
    @XmlElement(name = "Description")
    protected List<MultilingualTextField> description;
    @XmlElement(name = "RelatedComposition")
    protected DocumentReferenceMultipleField relatedComposition;
    @XmlElement(name = "ContributingActivityTechniqueForTheEnvironment")
    protected FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment contributingActivityTechniqueForTheEnvironment;
    @XmlElement(name = "ContributingActivityTechniqueForWorkers")
    protected FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers contributingActivityTechniqueForWorkers;
    @XmlElement(name = "ProductCategories")
    protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ProductCategories> productCategories;
    @XmlElement(name = "SectorUses")
    protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.SectorUses> sectorUses;
    @XmlElement(name = "TechnicalFunctions")
    protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.TechnicalFunctions> technicalFunctions;
    @XmlElement(name = "UseCoverageInCSR")
    protected FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.UseCoverageInCSR useCoverageInCSR;
    @XmlElement(name = "Remarks")
    protected List<MultilingualTextField> remarks;

    /**
     * Gets the value of the dataProtection property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection }
     *     
     */
    public FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection getDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection }
     *     
     */
    public void setDataProtection(FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the identifiedUseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getIdentifiedUseNumber() {
        return identifiedUseNumber;
    }

    /**
     * Sets the value of the identifiedUseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setIdentifiedUseNumber(JAXBElement<BigInteger> value) {
        this.identifiedUseNumber = value;
    }

    /**
     * Gets the value of the identifiedUseName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiedUseName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiedUseName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextFieldMultiLine }
     * 
     * 
     */
    public List<MultilingualTextFieldMultiLine> getIdentifiedUseName() {
        if (identifiedUseName == null) {
            identifiedUseName = new ArrayList<MultilingualTextFieldMultiLine>();
        }
        return this.identifiedUseName;
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
     * Gets the value of the contributingActivityTechniqueForTheEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment }
     *     
     */
    public FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment getContributingActivityTechniqueForTheEnvironment() {
        return contributingActivityTechniqueForTheEnvironment;
    }

    /**
     * Sets the value of the contributingActivityTechniqueForTheEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment }
     *     
     */
    public void setContributingActivityTechniqueForTheEnvironment(FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment value) {
        this.contributingActivityTechniqueForTheEnvironment = value;
    }

    /**
     * Gets the value of the contributingActivityTechniqueForWorkers property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers }
     *     
     */
    public FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers getContributingActivityTechniqueForWorkers() {
        return contributingActivityTechniqueForWorkers;
    }

    /**
     * Sets the value of the contributingActivityTechniqueForWorkers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers }
     *     
     */
    public void setContributingActivityTechniqueForWorkers(FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers value) {
        this.contributingActivityTechniqueForWorkers = value;
    }

    /**
     * Gets the value of the productCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ProductCategories }
     * 
     * 
     */
    public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ProductCategories> getProductCategories() {
        if (productCategories == null) {
            productCategories = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ProductCategories>();
        }
        return this.productCategories;
    }

    /**
     * Gets the value of the sectorUses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectorUses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectorUses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.SectorUses }
     * 
     * 
     */
    public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.SectorUses> getSectorUses() {
        if (sectorUses == null) {
            sectorUses = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.SectorUses>();
        }
        return this.sectorUses;
    }

    /**
     * Gets the value of the technicalFunctions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalFunctions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.TechnicalFunctions }
     * 
     * 
     */
    public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.TechnicalFunctions> getTechnicalFunctions() {
        if (technicalFunctions == null) {
            technicalFunctions = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.TechnicalFunctions>();
        }
        return this.technicalFunctions;
    }

    /**
     * Gets the value of the useCoverageInCSR property.
     * 
     * @return
     *     possible object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.UseCoverageInCSR }
     *     
     */
    public FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.UseCoverageInCSR getUseCoverageInCSR() {
        return useCoverageInCSR;
    }

    /**
     * Sets the value of the useCoverageInCSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.UseCoverageInCSR }
     *     
     */
    public void setUseCoverageInCSR(FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.UseCoverageInCSR value) {
        this.useCoverageInCSR = value;
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
     *                   &lt;element name="NameOfActivityTechnique" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="EnvironmentalReleaseCategoryERC" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}U03" minOccurs="0"/>
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
    public static class ContributingActivityTechniqueForTheEnvironment {

        protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry> entry;

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
         * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry }
         * 
         * 
         */
        public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry>();
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
         *         &lt;element name="NameOfActivityTechnique" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="EnvironmentalReleaseCategoryERC" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}U03" minOccurs="0"/>
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
            "nameOfActivityTechnique",
            "environmentalReleaseCategoryERC"
        })
        public static class Entry
            extends RepeatableEntryType
        {

            @XmlElement(name = "NameOfActivityTechnique")
            protected List<MultilingualTextFieldMultiLine> nameOfActivityTechnique;
            @XmlElement(name = "EnvironmentalReleaseCategoryERC")
            protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry.EnvironmentalReleaseCategoryERC> environmentalReleaseCategoryERC;

            /**
             * Gets the value of the nameOfActivityTechnique property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nameOfActivityTechnique property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNameOfActivityTechnique().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getNameOfActivityTechnique() {
                if (nameOfActivityTechnique == null) {
                    nameOfActivityTechnique = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.nameOfActivityTechnique;
            }

            /**
             * Gets the value of the environmentalReleaseCategoryERC property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the environmentalReleaseCategoryERC property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEnvironmentalReleaseCategoryERC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry.EnvironmentalReleaseCategoryERC }
             * 
             * 
             */
            public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry.EnvironmentalReleaseCategoryERC> getEnvironmentalReleaseCategoryERC() {
                if (environmentalReleaseCategoryERC == null) {
                    environmentalReleaseCategoryERC = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForTheEnvironment.Entry.EnvironmentalReleaseCategoryERC>();
                }
                return this.environmentalReleaseCategoryERC;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}U03" minOccurs="0"/>
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
            public static class EnvironmentalReleaseCategoryERC
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
     *                   &lt;element name="NameOfActivityTechnique" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ProcessCategoryPROC" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD50" minOccurs="0"/>
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
    public static class ContributingActivityTechniqueForWorkers {

        protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry> entry;

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
         * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry }
         * 
         * 
         */
        public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry>();
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
         *         &lt;element name="NameOfActivityTechnique" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldMultiLine" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ProcessCategoryPROC" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD50" minOccurs="0"/>
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
            "nameOfActivityTechnique",
            "processCategoryPROC"
        })
        public static class Entry
            extends RepeatableEntryType
        {

            @XmlElement(name = "NameOfActivityTechnique")
            protected List<MultilingualTextFieldMultiLine> nameOfActivityTechnique;
            @XmlElement(name = "ProcessCategoryPROC")
            protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry.ProcessCategoryPROC> processCategoryPROC;

            /**
             * Gets the value of the nameOfActivityTechnique property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the nameOfActivityTechnique property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNameOfActivityTechnique().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldMultiLine }
             * 
             * 
             */
            public List<MultilingualTextFieldMultiLine> getNameOfActivityTechnique() {
                if (nameOfActivityTechnique == null) {
                    nameOfActivityTechnique = new ArrayList<MultilingualTextFieldMultiLine>();
                }
                return this.nameOfActivityTechnique;
            }

            /**
             * Gets the value of the processCategoryPROC property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the processCategoryPROC property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProcessCategoryPROC().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry.ProcessCategoryPROC }
             * 
             * 
             */
            public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry.ProcessCategoryPROC> getProcessCategoryPROC() {
                if (processCategoryPROC == null) {
                    processCategoryPROC = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.ContributingActivityTechniqueForWorkers.Entry.ProcessCategoryPROC>();
                }
                return this.processCategoryPROC;
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
             *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD50" minOccurs="0"/>
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
            public static class ProcessCategoryPROC
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
        protected List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection.Legislation> legislation;

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
         * {@link FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection.Legislation }
         * 
         * 
         */
        public List<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection.Legislation> getLegislation() {
            if (legislation == null) {
                legislation = new ArrayList<FLEXIBLERECORDUseAtIndustrialSitesAdvisedAgainst.DataProtection.Legislation>();
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
     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *       &lt;sequence>
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N35" minOccurs="0"/>
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
    public static class ProductCategories
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
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}N34" minOccurs="0"/>
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
    public static class SectorUses
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
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD490" minOccurs="0"/>
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
    public static class TechnicalFunctions
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
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}U10" minOccurs="0"/>
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
    public static class UseCoverageInCSR
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
