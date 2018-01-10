
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithLargeTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;


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
 *         &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="StudyResultType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="PurposeFlag" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="RobustStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *         &lt;element name="UsedForClassification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *         &lt;element name="UsedForMSDS" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *         &lt;element name="StudyPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="Reliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="RationalReliability" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks"/>
 *         &lt;element name="DataWaiving" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DataWaivingJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JustificationForTypeOfInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="AttachedJustification">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                             &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *         &lt;element name="CrossReference">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="RelatedInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
    "dataProtection",
    "endpoint",
    "studyResultType",
    "purposeFlag",
    "robustStudy",
    "usedForClassification",
    "usedForMSDS",
    "studyPeriod",
    "reliability",
    "rationalReliability",
    "dataWaiving",
    "dataWaivingJustification",
    "justificationForTypeOfInformation",
    "attachedJustification",
    "crossReference"
})
public class AdministrativeData {

    @XmlElement(name = "DataProtection", required = true)
    protected DataProtectionField dataProtection;
    @XmlElement(name = "Endpoint", required = true)
    protected PicklistFieldWithSmallTextRemarks endpoint;
    @XmlElement(name = "StudyResultType", required = true)
    protected PicklistFieldWithSmallTextRemarks studyResultType;
    @XmlElement(name = "PurposeFlag", required = true)
    protected PicklistField purposeFlag;
    @XmlElement(name = "RobustStudy", required = true, type = Boolean.class, nillable = true)
    protected Boolean robustStudy;
    @XmlElement(name = "UsedForClassification", required = true, type = Boolean.class, nillable = true)
    protected Boolean usedForClassification;
    @XmlElement(name = "UsedForMSDS", required = true, type = Boolean.class, nillable = true)
    protected Boolean usedForMSDS;
    @XmlElement(name = "StudyPeriod", required = true)
    protected String studyPeriod;
    @XmlElement(name = "Reliability", required = true)
    protected PicklistField reliability;
    @XmlElement(name = "RationalReliability", required = true)
    protected PicklistFieldWithLargeTextRemarks rationalReliability;
    @XmlElement(name = "DataWaiving", required = true)
    protected PicklistField dataWaiving;
    @XmlElement(name = "DataWaivingJustification")
    protected List<PicklistFieldWithLargeTextRemarks> dataWaivingJustification;
    @XmlElement(name = "JustificationForTypeOfInformation", required = true)
    protected String justificationForTypeOfInformation;
    @XmlElement(name = "AttachedJustification", required = true)
    protected AttachedJustification attachedJustification;
    @XmlElement(name = "CrossReference", required = true)
    protected CrossReference crossReference;

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
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setEndpoint(PicklistFieldWithSmallTextRemarks value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the studyResultType property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getStudyResultType() {
        return studyResultType;
    }

    /**
     * Sets the value of the studyResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setStudyResultType(PicklistFieldWithSmallTextRemarks value) {
        this.studyResultType = value;
    }

    /**
     * Gets the value of the purposeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getPurposeFlag() {
        return purposeFlag;
    }

    /**
     * Sets the value of the purposeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setPurposeFlag(PicklistField value) {
        this.purposeFlag = value;
    }

    /**
     * Gets the value of the robustStudy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRobustStudy() {
        return robustStudy;
    }

    /**
     * Sets the value of the robustStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRobustStudy(Boolean value) {
        this.robustStudy = value;
    }

    /**
     * Gets the value of the usedForClassification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUsedForClassification() {
        return usedForClassification;
    }

    /**
     * Sets the value of the usedForClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedForClassification(Boolean value) {
        this.usedForClassification = value;
    }

    /**
     * Gets the value of the usedForMSDS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUsedForMSDS() {
        return usedForMSDS;
    }

    /**
     * Sets the value of the usedForMSDS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedForMSDS(Boolean value) {
        this.usedForMSDS = value;
    }

    /**
     * Gets the value of the studyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyPeriod() {
        return studyPeriod;
    }

    /**
     * Sets the value of the studyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyPeriod(String value) {
        this.studyPeriod = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setReliability(PicklistField value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the rationalReliability property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithLargeTextRemarks }
     *     
     */
    public PicklistFieldWithLargeTextRemarks getRationalReliability() {
        return rationalReliability;
    }

    /**
     * Sets the value of the rationalReliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithLargeTextRemarks }
     *     
     */
    public void setRationalReliability(PicklistFieldWithLargeTextRemarks value) {
        this.rationalReliability = value;
    }

    /**
     * Gets the value of the dataWaiving property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getDataWaiving() {
        return dataWaiving;
    }

    /**
     * Sets the value of the dataWaiving property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setDataWaiving(PicklistField value) {
        this.dataWaiving = value;
    }

    /**
     * Gets the value of the dataWaivingJustification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataWaivingJustification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataWaivingJustification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistFieldWithLargeTextRemarks }
     * 
     * 
     */
    public List<PicklistFieldWithLargeTextRemarks> getDataWaivingJustification() {
        if (dataWaivingJustification == null) {
            dataWaivingJustification = new ArrayList<PicklistFieldWithLargeTextRemarks>();
        }
        return this.dataWaivingJustification;
    }

    /**
     * Gets the value of the justificationForTypeOfInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationForTypeOfInformation() {
        return justificationForTypeOfInformation;
    }

    /**
     * Sets the value of the justificationForTypeOfInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationForTypeOfInformation(String value) {
        this.justificationForTypeOfInformation = value;
    }

    /**
     * Gets the value of the attachedJustification property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedJustification }
     *     
     */
    public AttachedJustification getAttachedJustification() {
        return attachedJustification;
    }

    /**
     * Sets the value of the attachedJustification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedJustification }
     *     
     */
    public void setAttachedJustification(AttachedJustification value) {
        this.attachedJustification = value;
    }

    /**
     * Gets the value of the crossReference property.
     * 
     * @return
     *     possible object is
     *     {@link CrossReference }
     *     
     */
    public CrossReference getCrossReference() {
        return crossReference;
    }

    /**
     * Sets the value of the crossReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossReference }
     *     
     */
    public void setCrossReference(CrossReference value) {
        this.crossReference = value;
    }

}
