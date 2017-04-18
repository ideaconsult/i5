
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
 *         &lt;element name="Vehicle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnPreparationAndApplicationOfTestSubstrate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "vehicle",
    "detailsOnPreparationAndApplicationOfTestSubstrate"
})
public class TestSubstrate {

    @XmlElement(name = "Vehicle", required = true)
    protected PicklistFieldWithSmallTextRemarks vehicle;
    @XmlElement(name = "DetailsOnPreparationAndApplicationOfTestSubstrate", required = true)
    protected String detailsOnPreparationAndApplicationOfTestSubstrate;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setVehicle(PicklistFieldWithSmallTextRemarks value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the detailsOnPreparationAndApplicationOfTestSubstrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnPreparationAndApplicationOfTestSubstrate() {
        return detailsOnPreparationAndApplicationOfTestSubstrate;
    }

    /**
     * Sets the value of the detailsOnPreparationAndApplicationOfTestSubstrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnPreparationAndApplicationOfTestSubstrate(String value) {
        this.detailsOnPreparationAndApplicationOfTestSubstrate = value;
    }

}
