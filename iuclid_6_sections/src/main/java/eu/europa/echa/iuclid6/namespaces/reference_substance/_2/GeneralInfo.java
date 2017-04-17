
package eu.europa.echa.iuclid6.namespaces.reference_substance._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ReferenceSubstanceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "referenceSubstanceName"
})
public class GeneralInfo {

    @XmlElement(name = "ReferenceSubstanceName", required = true)
    protected String referenceSubstanceName;

    /**
     * Gets the value of the referenceSubstanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSubstanceName() {
        return referenceSubstanceName;
    }

    /**
     * Sets the value of the referenceSubstanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSubstanceName(String value) {
        this.referenceSubstanceName = value;
    }

}
