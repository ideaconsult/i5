
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2;

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
 *         &lt;element name="ObservedEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "observedEffects"
})
public class ObservedEffects {

    @XmlElement(name = "ObservedEffects", required = true)
    protected String observedEffects;

    /**
     * Gets the value of the observedEffects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservedEffects() {
        return observedEffects;
    }

    /**
     * Sets the value of the observedEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservedEffects(String value) {
        this.observedEffects = value;
    }

}
