
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


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
 *         &lt;element name="AttachedJustification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *         &lt;element name="ReasonPurpose" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
    "attachedJustification",
    "reasonPurpose"
})
public class AttachedJustificationEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "AttachedJustification", required = true)
    protected String attachedJustification;
    @XmlElement(name = "ReasonPurpose", required = true)
    protected PicklistFieldWithSmallTextRemarks reasonPurpose;

    /**
     * Gets the value of the attachedJustification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedJustification() {
        return attachedJustification;
    }

    /**
     * Sets the value of the attachedJustification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedJustification(String value) {
        this.attachedJustification = value;
    }

    /**
     * Gets the value of the reasonPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getReasonPurpose() {
        return reasonPurpose;
    }

    /**
     * Sets the value of the reasonPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setReasonPurpose(PicklistFieldWithSmallTextRemarks value) {
        this.reasonPurpose = value;
    }

}
