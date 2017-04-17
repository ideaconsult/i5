
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2;

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
 *         &lt;element name="ReproductiveToxicity">
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
 *                             &lt;element name="ReproductiveEffectsObserved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="LowestEffectiveDoseConc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                     &lt;sequence>
 *                                       &lt;element name="unitCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="2087"/>
 *                                             &lt;enumeration value="2086"/>
 *                                             &lt;enumeration value="2085"/>
 *                                             &lt;enumeration value="2090"/>
 *                                             &lt;enumeration value="2102"/>
 *                                             &lt;enumeration value="2082"/>
 *                                             &lt;enumeration value="2099"/>
 *                                             &lt;enumeration value="2101"/>
 *                                             &lt;enumeration value="2100"/>
 *                                             &lt;enumeration value="2104"/>
 *                                             &lt;enumeration value="2106"/>
 *                                             &lt;enumeration value="2105"/>
 *                                             &lt;enumeration value="2283"/>
 *                                             &lt;enumeration value="2285"/>
 *                                             &lt;enumeration value="2284"/>
 *                                             &lt;enumeration value="1342"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="unitOther" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="value" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TreatmentRelated" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="RelationToOtherToxicEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="DoseResponseRelationship" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="RelevantForHumans" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
    "reproductiveToxicity"
})
public class ReproductiveToxicity {

    @XmlElement(name = "ReproductiveToxicity", required = true)
    protected ReproductiveToxicity2 reproductiveToxicity;

    /**
     * Gets the value of the reproductiveToxicity property.
     * 
     * @return
     *     possible object is
     *     {@link ReproductiveToxicity2 }
     *     
     */
    public ReproductiveToxicity2 getReproductiveToxicity() {
        return reproductiveToxicity;
    }

    /**
     * Sets the value of the reproductiveToxicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReproductiveToxicity2 }
     *     
     */
    public void setReproductiveToxicity(ReproductiveToxicity2 value) {
        this.reproductiveToxicity = value;
    }

}
