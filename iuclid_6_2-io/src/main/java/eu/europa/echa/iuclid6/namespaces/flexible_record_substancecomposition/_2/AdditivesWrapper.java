
package eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2;

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
 *         &lt;element name="Additives">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                             &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                             &lt;element name="ProportionTypical" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityHalfBoundedField"/>
 *                             &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="Function" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="DetailsOfFunctionInComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="RelevantForClassificationLabeling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
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
    "additives"
})
public class AdditivesWrapper {

    @XmlElement(name = "Additives", required = true)
    protected Additives additives;

    /**
     * Gets the value of the additives property.
     * 
     * @return
     *     possible object is
     *     {@link Additives }
     *     
     */
    public Additives getAdditives() {
        return additives;
    }

    /**
     * Sets the value of the additives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Additives }
     *     
     */
    public void setAdditives(Additives value) {
        this.additives = value;
    }

}
