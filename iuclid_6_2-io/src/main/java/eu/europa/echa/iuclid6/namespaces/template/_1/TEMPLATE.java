
package eu.europa.echa.iuclid6.namespaces.template._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;


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
 *         &lt;element name="TemplateName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OwnerLegalEntityProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *         &lt;element name="OwnerLegalEntity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
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
    "templateName",
    "remarks",
    "ownerLegalEntityProtection",
    "ownerLegalEntity"
})
@XmlRootElement(name = "TEMPLATE")
public class TEMPLATE {

    @XmlElement(name = "TemplateName", required = true)
    protected String templateName;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;
    @XmlElement(name = "OwnerLegalEntityProtection", required = true)
    protected DataProtectionField ownerLegalEntityProtection;
    @XmlElement(name = "OwnerLegalEntity", required = true)
    protected String ownerLegalEntity;

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
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
     * Gets the value of the ownerLegalEntityProtection property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionField }
     *     
     */
    public DataProtectionField getOwnerLegalEntityProtection() {
        return ownerLegalEntityProtection;
    }

    /**
     * Sets the value of the ownerLegalEntityProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionField }
     *     
     */
    public void setOwnerLegalEntityProtection(DataProtectionField value) {
        this.ownerLegalEntityProtection = value;
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

}
