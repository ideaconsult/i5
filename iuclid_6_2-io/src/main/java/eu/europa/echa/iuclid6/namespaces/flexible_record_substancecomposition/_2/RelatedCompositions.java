
package eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;


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
 *         &lt;element name="RelatedComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField"/>
 *         &lt;element name="ReferenceToRelatedCompositions" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "relatedComposition",
    "referenceToRelatedCompositions"
})
public class RelatedCompositions {

    @XmlElement(name = "RelatedComposition", required = true)
    protected DocumentReferenceMultipleField relatedComposition;
    @XmlElement(name = "ReferenceToRelatedCompositions", required = true)
    protected String referenceToRelatedCompositions;

    /**
     * Gets the value of the relatedComposition property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public DocumentReferenceMultipleField getRelatedComposition() {
        return relatedComposition;
    }

    /**
     * Sets the value of the relatedComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceMultipleField }
     *     
     */
    public void setRelatedComposition(DocumentReferenceMultipleField value) {
        this.relatedComposition = value;
    }

    /**
     * Gets the value of the referenceToRelatedCompositions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceToRelatedCompositions() {
        return referenceToRelatedCompositions;
    }

    /**
     * Sets the value of the referenceToRelatedCompositions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceToRelatedCompositions(String value) {
        this.referenceToRelatedCompositions = value;
    }

}
