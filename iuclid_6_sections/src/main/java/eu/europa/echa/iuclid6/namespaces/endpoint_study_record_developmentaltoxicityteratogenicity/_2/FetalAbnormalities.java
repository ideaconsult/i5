
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2;

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
 *         &lt;element name="FetalAbnormalities">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                             &lt;element name="Abnormalities" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Localisation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DescriptionIncidenceAndSeverity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "fetalAbnormalities"
})
public class FetalAbnormalities {

    @XmlElement(name = "FetalAbnormalities", required = true)
    protected FetalAbnormalities2 fetalAbnormalities;

    /**
     * Gets the value of the fetalAbnormalities property.
     * 
     * @return
     *     possible object is
     *     {@link FetalAbnormalities2 }
     *     
     */
    public FetalAbnormalities2 getFetalAbnormalities() {
        return fetalAbnormalities;
    }

    /**
     * Sets the value of the fetalAbnormalities property.
     * 
     * @param value
     *     allowed object is
     *     {@link FetalAbnormalities2 }
     *     
     */
    public void setFetalAbnormalities(FetalAbnormalities2 value) {
        this.fetalAbnormalities = value;
    }

}
