
package eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;


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
 *         &lt;element name="SurfaceTreatmentApplied" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="repeatableSet8912">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="SurfaceTreatmentName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                             &lt;element name="SurfaceTreatment">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Layer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="SurfaceTreatmentAgent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ExternalLayer" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="TotalFractionCoreParticleWW" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                             &lt;element name="SupportingInformation">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AttachedDocument" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "surfaceTreatmentApplied",
    "repeatableSet8912"
})
public class SurfaceTreatmentWrapper {

    @XmlElement(name = "SurfaceTreatmentApplied", required = true)
    protected PicklistField surfaceTreatmentApplied;
    @XmlElement(required = true)
    protected RepeatableSet8912 repeatableSet8912;

    /**
     * Gets the value of the surfaceTreatmentApplied property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSurfaceTreatmentApplied() {
        return surfaceTreatmentApplied;
    }

    /**
     * Sets the value of the surfaceTreatmentApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSurfaceTreatmentApplied(PicklistField value) {
        this.surfaceTreatmentApplied = value;
    }

    /**
     * Gets the value of the repeatableSet8912 property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatableSet8912 }
     *     
     */
    public RepeatableSet8912 getRepeatableSet8912() {
        return repeatableSet8912;
    }

    /**
     * Sets the value of the repeatableSet8912 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatableSet8912 }
     *     
     */
    public void setRepeatableSet8912(RepeatableSet8912 value) {
        this.repeatableSet8912 = value;
    }

}
