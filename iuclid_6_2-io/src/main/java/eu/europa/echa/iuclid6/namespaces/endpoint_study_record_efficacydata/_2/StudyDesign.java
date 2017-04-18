
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
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
 *         &lt;element name="TotalExposureDurationContactTime" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="ModeOfEfficacyAssessment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="MethodOfApplication" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnStudyDesign" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "totalExposureDurationContactTime",
    "remarks",
    "modeOfEfficacyAssessment",
    "methodOfApplication",
    "detailsOnStudyDesign"
})
public class StudyDesign {

    @XmlElement(name = "TotalExposureDurationContactTime", required = true)
    protected PhysicalQuantityRangeField totalExposureDurationContactTime;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;
    @XmlElement(name = "ModeOfEfficacyAssessment", required = true)
    protected String modeOfEfficacyAssessment;
    @XmlElement(name = "MethodOfApplication", required = true)
    protected PicklistFieldWithSmallTextRemarks methodOfApplication;
    @XmlElement(name = "DetailsOnStudyDesign", required = true)
    protected String detailsOnStudyDesign;

    /**
     * Gets the value of the totalExposureDurationContactTime property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getTotalExposureDurationContactTime() {
        return totalExposureDurationContactTime;
    }

    /**
     * Sets the value of the totalExposureDurationContactTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setTotalExposureDurationContactTime(PhysicalQuantityRangeField value) {
        this.totalExposureDurationContactTime = value;
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
     * Gets the value of the modeOfEfficacyAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfEfficacyAssessment() {
        return modeOfEfficacyAssessment;
    }

    /**
     * Sets the value of the modeOfEfficacyAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfEfficacyAssessment(String value) {
        this.modeOfEfficacyAssessment = value;
    }

    /**
     * Gets the value of the methodOfApplication property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getMethodOfApplication() {
        return methodOfApplication;
    }

    /**
     * Sets the value of the methodOfApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setMethodOfApplication(PicklistFieldWithSmallTextRemarks value) {
        this.methodOfApplication = value;
    }

    /**
     * Gets the value of the detailsOnStudyDesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnStudyDesign() {
        return detailsOnStudyDesign;
    }

    /**
     * Sets the value of the detailsOnStudyDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnStudyDesign(String value) {
        this.detailsOnStudyDesign = value;
    }

}
