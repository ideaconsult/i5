
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="ValidityCriteriaFulfilled" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="Conclusions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ExecutiveSummary" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
    "validityCriteriaFulfilled",
    "conclusions",
    "executiveSummary"
})
public class ApplicantSummaryAndConclusion {

    @XmlElement(name = "ValidityCriteriaFulfilled", required = true)
    protected PicklistFieldWithSmallTextRemarks validityCriteriaFulfilled;
    @XmlElement(name = "Conclusions", required = true)
    protected String conclusions;
    @XmlElement(name = "ExecutiveSummary", required = true)
    protected String executiveSummary;

    /**
     * Gets the value of the validityCriteriaFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getValidityCriteriaFulfilled() {
        return validityCriteriaFulfilled;
    }

    /**
     * Sets the value of the validityCriteriaFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setValidityCriteriaFulfilled(PicklistFieldWithSmallTextRemarks value) {
        this.validityCriteriaFulfilled = value;
    }

    /**
     * Gets the value of the conclusions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConclusions() {
        return conclusions;
    }

    /**
     * Sets the value of the conclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConclusions(String value) {
        this.conclusions = value;
    }

    /**
     * Gets the value of the executiveSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveSummary() {
        return executiveSummary;
    }

    /**
     * Sets the value of the executiveSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveSummary(String value) {
        this.executiveSummary = value;
    }

}
