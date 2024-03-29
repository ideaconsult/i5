
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The multilingual version of the data protection field type
 * 
 * <p>Java class for multilingualDataProtectionField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multilingualDataProtectionField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confidentiality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded"/>
 *         &lt;element name="legislation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualLegislation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multilingualDataProtectionField", propOrder = {
    "confidentiality",
    "justification",
    "legislation"
})
public class MultilingualDataProtectionField {

    @XmlElement(required = true)
    protected String confidentiality;
    @XmlElement(required = true)
    protected List<MultilingualTextField> justification;
    protected List<MultilingualLegislation> legislation;

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentiality(String value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextField }
     * 
     * 
     */
    public List<MultilingualTextField> getJustification() {
        if (justification == null) {
            justification = new ArrayList<MultilingualTextField>();
        }
        return this.justification;
    }

    /**
     * Gets the value of the legislation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legislation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegislation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualLegislation }
     * 
     * 
     */
    public List<MultilingualLegislation> getLegislation() {
        if (legislation == null) {
            legislation = new ArrayList<MultilingualLegislation>();
        }
        return this.legislation;
    }

}
