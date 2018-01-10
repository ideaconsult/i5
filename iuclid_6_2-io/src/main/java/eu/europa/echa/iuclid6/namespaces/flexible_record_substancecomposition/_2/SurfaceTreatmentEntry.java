
package eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *         &lt;element name="SurfaceTreatmentName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="SurfaceTreatment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="Layer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="SurfaceTreatmentAgent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *         &lt;element name="ExternalLayer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="TotalFractionCoreParticleWW" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="SupportingInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "surfaceTreatmentName",
    "surfaceTreatment",
    "externalLayer",
    "totalFractionCoreParticleWW",
    "remarks",
    "supportingInformation"
})
public class SurfaceTreatmentEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "SurfaceTreatmentName", required = true)
    protected String surfaceTreatmentName;
    @XmlElement(name = "SurfaceTreatment", required = true)
    protected SurfaceTreatment surfaceTreatment;
    @XmlElement(name = "ExternalLayer", required = true)
    protected PicklistField externalLayer;
    @XmlElement(name = "TotalFractionCoreParticleWW", required = true)
    protected PhysicalQuantityRangeField totalFractionCoreParticleWW;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;
    @XmlElement(name = "SupportingInformation", required = true)
    protected SupportingInformation supportingInformation;

    /**
     * Gets the value of the surfaceTreatmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceTreatmentName() {
        return surfaceTreatmentName;
    }

    /**
     * Sets the value of the surfaceTreatmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceTreatmentName(String value) {
        this.surfaceTreatmentName = value;
    }

    /**
     * Gets the value of the surfaceTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link SurfaceTreatment }
     *     
     */
    public SurfaceTreatment getSurfaceTreatment() {
        return surfaceTreatment;
    }

    /**
     * Sets the value of the surfaceTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfaceTreatment }
     *     
     */
    public void setSurfaceTreatment(SurfaceTreatment value) {
        this.surfaceTreatment = value;
    }

    /**
     * Gets the value of the externalLayer property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getExternalLayer() {
        return externalLayer;
    }

    /**
     * Sets the value of the externalLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setExternalLayer(PicklistField value) {
        this.externalLayer = value;
    }

    /**
     * Gets the value of the totalFractionCoreParticleWW property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getTotalFractionCoreParticleWW() {
        return totalFractionCoreParticleWW;
    }

    /**
     * Sets the value of the totalFractionCoreParticleWW property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setTotalFractionCoreParticleWW(PhysicalQuantityRangeField value) {
        this.totalFractionCoreParticleWW = value;
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
     * Gets the value of the supportingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SupportingInformation }
     *     
     */
    public SupportingInformation getSupportingInformation() {
        return supportingInformation;
    }

    /**
     * Sets the value of the supportingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportingInformation }
     *     
     */
    public void setSupportingInformation(SupportingInformation value) {
        this.supportingInformation = value;
    }

}
