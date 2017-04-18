
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *         &lt;element name="TestType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="StudyType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="SubstrateType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="LimitTest" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="TotalExposureDuration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="2113"/>
 *                         &lt;enumeration value="1976"/>
 *                         &lt;enumeration value="1839"/>
 *                         &lt;enumeration value="2468"/>
 *                         &lt;enumeration value="2133"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="unitOther" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="PostExposureObservationPeriod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="JustificationForExposureDuration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "testType",
    "studyType",
    "substrateType",
    "limitTest",
    "totalExposureDuration",
    "remarks",
    "postExposureObservationPeriod",
    "justificationForExposureDuration"
})
public class StudyDesign {

    @XmlElement(name = "TestType", required = true)
    protected PicklistField testType;
    @XmlElement(name = "StudyType", required = true)
    protected PicklistFieldWithSmallTextRemarks studyType;
    @XmlElement(name = "SubstrateType", required = true)
    protected PicklistFieldWithSmallTextRemarks substrateType;
    @XmlElement(name = "LimitTest", required = true)
    protected PicklistField limitTest;
    @XmlElement(name = "TotalExposureDuration")
    protected TotalExposureDuration totalExposureDuration;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;
    @XmlElement(name = "PostExposureObservationPeriod", required = true)
    protected String postExposureObservationPeriod;
    @XmlElement(name = "JustificationForExposureDuration", required = true)
    protected String justificationForExposureDuration;

    /**
     * Gets the value of the testType property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setTestType(PicklistField value) {
        this.testType = value;
    }

    /**
     * Gets the value of the studyType property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getStudyType() {
        return studyType;
    }

    /**
     * Sets the value of the studyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setStudyType(PicklistFieldWithSmallTextRemarks value) {
        this.studyType = value;
    }

    /**
     * Gets the value of the substrateType property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getSubstrateType() {
        return substrateType;
    }

    /**
     * Sets the value of the substrateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setSubstrateType(PicklistFieldWithSmallTextRemarks value) {
        this.substrateType = value;
    }

    /**
     * Gets the value of the limitTest property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getLimitTest() {
        return limitTest;
    }

    /**
     * Sets the value of the limitTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setLimitTest(PicklistField value) {
        this.limitTest = value;
    }

    /**
     * Gets the value of the totalExposureDuration property.
     * 
     * @return
     *     possible object is
     *     {@link TotalExposureDuration }
     *     
     */
    public TotalExposureDuration getTotalExposureDuration() {
        return totalExposureDuration;
    }

    /**
     * Sets the value of the totalExposureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalExposureDuration }
     *     
     */
    public void setTotalExposureDuration(TotalExposureDuration value) {
        this.totalExposureDuration = value;
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
     * Gets the value of the postExposureObservationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostExposureObservationPeriod() {
        return postExposureObservationPeriod;
    }

    /**
     * Sets the value of the postExposureObservationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostExposureObservationPeriod(String value) {
        this.postExposureObservationPeriod = value;
    }

    /**
     * Gets the value of the justificationForExposureDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationForExposureDuration() {
        return justificationForExposureDuration;
    }

    /**
     * Sets the value of the justificationForExposureDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationForExposureDuration(String value) {
        this.justificationForExposureDuration = value;
    }

}
