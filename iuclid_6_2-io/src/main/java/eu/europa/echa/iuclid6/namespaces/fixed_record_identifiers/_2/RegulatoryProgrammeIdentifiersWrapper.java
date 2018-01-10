
package eu.europa.echa.iuclid6.namespaces.fixed_record_identifiers._2;

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
 *         &lt;element name="RegulatoryProgrammeIdentifiers">
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
 *                             &lt;element name="RegulatoryProgramme" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "regulatoryProgrammeIdentifiers"
})
public class RegulatoryProgrammeIdentifiersWrapper {

    @XmlElement(name = "RegulatoryProgrammeIdentifiers", required = true)
    protected RegulatoryProgrammeIdentifiers regulatoryProgrammeIdentifiers;

    /**
     * Gets the value of the regulatoryProgrammeIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryProgrammeIdentifiers }
     *     
     */
    public RegulatoryProgrammeIdentifiers getRegulatoryProgrammeIdentifiers() {
        return regulatoryProgrammeIdentifiers;
    }

    /**
     * Sets the value of the regulatoryProgrammeIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryProgrammeIdentifiers }
     *     
     */
    public void setRegulatoryProgrammeIdentifiers(RegulatoryProgrammeIdentifiers value) {
        this.regulatoryProgrammeIdentifiers = value;
    }

}
