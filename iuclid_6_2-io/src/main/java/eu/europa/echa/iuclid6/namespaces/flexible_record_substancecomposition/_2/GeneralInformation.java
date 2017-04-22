
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
 *         &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="TypeOfComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="StateForm" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionOfComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="AttachedDescription">
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
 *         &lt;element name="JustificationForDeviations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="RelatedCompositions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField"/>
 *                   &lt;element name="ReferenceToRelatedCompositions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "name",
    "typeOfComposition",
    "stateForm",
    "descriptionOfComposition",
    "attachedDescription",
    "justificationForDeviations",
    "relatedCompositions"
})
public class GeneralInformation {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "TypeOfComposition", required = true)
    protected PicklistField typeOfComposition;
    @XmlElement(name = "StateForm", required = true)
    protected PicklistField stateForm;
    @XmlElement(name = "DescriptionOfComposition", required = true)
    protected String descriptionOfComposition;
    @XmlElement(name = "AttachedDescription", required = true)
    protected AttachedDescription attachedDescription;
    @XmlElement(name = "JustificationForDeviations", required = true)
    protected String justificationForDeviations;
    @XmlElement(name = "RelatedCompositions", required = true)
    protected RelatedCompositions relatedCompositions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeOfComposition property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getTypeOfComposition() {
        return typeOfComposition;
    }

    /**
     * Sets the value of the typeOfComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setTypeOfComposition(PicklistField value) {
        this.typeOfComposition = value;
    }

    /**
     * Gets the value of the stateForm property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getStateForm() {
        return stateForm;
    }

    /**
     * Sets the value of the stateForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setStateForm(PicklistField value) {
        this.stateForm = value;
    }

    /**
     * Gets the value of the descriptionOfComposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionOfComposition() {
        return descriptionOfComposition;
    }

    /**
     * Sets the value of the descriptionOfComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionOfComposition(String value) {
        this.descriptionOfComposition = value;
    }

    /**
     * Gets the value of the attachedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AttachedDescription }
     *     
     */
    public AttachedDescription getAttachedDescription() {
        return attachedDescription;
    }

    /**
     * Sets the value of the attachedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachedDescription }
     *     
     */
    public void setAttachedDescription(AttachedDescription value) {
        this.attachedDescription = value;
    }

    /**
     * Gets the value of the justificationForDeviations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationForDeviations() {
        return justificationForDeviations;
    }

    /**
     * Sets the value of the justificationForDeviations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationForDeviations(String value) {
        this.justificationForDeviations = value;
    }

    /**
     * Gets the value of the relatedCompositions property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedCompositions }
     *     
     */
    public RelatedCompositions getRelatedCompositions() {
        return relatedCompositions;
    }

    /**
     * Sets the value of the relatedCompositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedCompositions }
     *     
     */
    public void setRelatedCompositions(RelatedCompositions value) {
        this.relatedCompositions = value;
    }

}
