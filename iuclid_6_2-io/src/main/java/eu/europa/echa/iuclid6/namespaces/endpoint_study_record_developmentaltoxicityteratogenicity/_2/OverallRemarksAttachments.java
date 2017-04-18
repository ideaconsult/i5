
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.AttachmentListField;


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
 *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *         &lt;element name="AttachedBackgroundMaterial">
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
 *         &lt;element name="AttachedStudyReport" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentListField"/>
 *         &lt;element name="IllustrationPicGraph" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
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
    "remarksOnResults",
    "attachedBackgroundMaterial",
    "attachedStudyReport",
    "illustrationPicGraph"
})
public class OverallRemarksAttachments {

    @XmlElement(name = "RemarksOnResults", required = true)
    protected String remarksOnResults;
    @XmlElement(name = "AttachedBackgroundMaterial", required = true)
    protected AttachedBackgroundMaterial attachedBackgroundMaterial;
    @XmlElement(name = "AttachedStudyReport", required = true)
    protected AttachmentListField attachedStudyReport;
    @XmlElement(name = "IllustrationPicGraph", required = true)
    protected String illustrationPicGraph;

    /**
     * Gets the value of the remarksOnResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksOnResults() {
        return remarksOnResults;
    }

    /**
     * Sets the value of the remarksOnResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksOnResults(String value) {
        this.remarksOnResults = value;
    }

    /**
     * Gets the value of the attachedBackgroundMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedBackgroundMaterial }
     *     
     */
    public AttachedBackgroundMaterial getAttachedBackgroundMaterial() {
        return attachedBackgroundMaterial;
    }

    /**
     * Sets the value of the attachedBackgroundMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedBackgroundMaterial }
     *     
     */
    public void setAttachedBackgroundMaterial(AttachedBackgroundMaterial value) {
        this.attachedBackgroundMaterial = value;
    }

    /**
     * Gets the value of the attachedStudyReport property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentListField }
     *     
     */
    public AttachmentListField getAttachedStudyReport() {
        return attachedStudyReport;
    }

    /**
     * Sets the value of the attachedStudyReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentListField }
     *     
     */
    public void setAttachedStudyReport(AttachmentListField value) {
        this.attachedStudyReport = value;
    }

    /**
     * Gets the value of the illustrationPicGraph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIllustrationPicGraph() {
        return illustrationPicGraph;
    }

    /**
     * Sets the value of the illustrationPicGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIllustrationPicGraph(String value) {
        this.illustrationPicGraph = value;
    }

}
