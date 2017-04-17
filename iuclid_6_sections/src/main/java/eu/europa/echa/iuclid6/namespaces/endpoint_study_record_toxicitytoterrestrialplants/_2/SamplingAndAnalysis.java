
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
 *         &lt;element name="AnalyticalMonitoring" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnSampling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="DetailsOnAnalyticalMethods" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "analyticalMonitoring",
    "detailsOnSampling",
    "detailsOnAnalyticalMethods"
})
public class SamplingAndAnalysis {

    @XmlElement(name = "AnalyticalMonitoring", required = true)
    protected PicklistFieldWithSmallTextRemarks analyticalMonitoring;
    @XmlElement(name = "DetailsOnSampling", required = true)
    protected String detailsOnSampling;
    @XmlElement(name = "DetailsOnAnalyticalMethods", required = true)
    protected String detailsOnAnalyticalMethods;

    /**
     * Gets the value of the analyticalMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getAnalyticalMonitoring() {
        return analyticalMonitoring;
    }

    /**
     * Sets the value of the analyticalMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setAnalyticalMonitoring(PicklistFieldWithSmallTextRemarks value) {
        this.analyticalMonitoring = value;
    }

    /**
     * Gets the value of the detailsOnSampling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnSampling() {
        return detailsOnSampling;
    }

    /**
     * Sets the value of the detailsOnSampling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnSampling(String value) {
        this.detailsOnSampling = value;
    }

    /**
     * Gets the value of the detailsOnAnalyticalMethods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnAnalyticalMethods() {
        return detailsOnAnalyticalMethods;
    }

    /**
     * Sets the value of the detailsOnAnalyticalMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnAnalyticalMethods(String value) {
        this.detailsOnAnalyticalMethods = value;
    }

}
