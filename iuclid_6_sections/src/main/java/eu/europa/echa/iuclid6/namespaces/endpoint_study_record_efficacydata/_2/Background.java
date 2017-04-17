
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="BackgroundInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="ObjectiveLabelClaimAddressed" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SourceOfInformationTypeOfStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
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
    "backgroundInformation",
    "objectiveLabelClaimAddressed",
    "sourceOfInformationTypeOfStudy"
})
public class Background {

    @XmlElement(name = "BackgroundInformation", required = true)
    protected String backgroundInformation;
    @XmlElement(name = "ObjectiveLabelClaimAddressed", required = true)
    protected String objectiveLabelClaimAddressed;
    @XmlElement(name = "SourceOfInformationTypeOfStudy")
    protected List<PicklistFieldWithSmallTextRemarks> sourceOfInformationTypeOfStudy;

    /**
     * Gets the value of the backgroundInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundInformation() {
        return backgroundInformation;
    }

    /**
     * Sets the value of the backgroundInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundInformation(String value) {
        this.backgroundInformation = value;
    }

    /**
     * Gets the value of the objectiveLabelClaimAddressed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectiveLabelClaimAddressed() {
        return objectiveLabelClaimAddressed;
    }

    /**
     * Sets the value of the objectiveLabelClaimAddressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectiveLabelClaimAddressed(String value) {
        this.objectiveLabelClaimAddressed = value;
    }

    /**
     * Gets the value of the sourceOfInformationTypeOfStudy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceOfInformationTypeOfStudy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceOfInformationTypeOfStudy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistFieldWithSmallTextRemarks }
     * 
     * 
     */
    public List<PicklistFieldWithSmallTextRemarks> getSourceOfInformationTypeOfStudy() {
        if (sourceOfInformationTypeOfStudy == null) {
            sourceOfInformationTypeOfStudy = new ArrayList<PicklistFieldWithSmallTextRemarks>();
        }
        return this.sourceOfInformationTypeOfStudy;
    }

}
