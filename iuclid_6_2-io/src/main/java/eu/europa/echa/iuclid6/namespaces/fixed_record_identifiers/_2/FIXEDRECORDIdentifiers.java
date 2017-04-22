
package eu.europa.echa.iuclid6.namespaces.fixed_record_identifiers._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *                   &lt;element name="RegulatoryProgrammeIdentifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="RegulatoryProgramme" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExternalSystemIdentifiers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExternalSystemIdentifiers">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *                                       &lt;element name="ExternalSystemDesignator" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                       &lt;element name="Id" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
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
    "regulatoryProgrammeIdentifiers",
    "externalSystemIdentifiers"
})
@XmlRootElement(name = "FIXED_RECORD.Identifiers")
public class FIXEDRECORDIdentifiers {

    @XmlElement(name = "RegulatoryProgrammeIdentifiers", required = true)
    protected RegulatoryProgrammeIdentifiersWrapper regulatoryProgrammeIdentifiers;
    @XmlElement(name = "ExternalSystemIdentifiers", required = true)
    protected ExternalSystemIdentifiersWrapper externalSystemIdentifiers;

    /**
     * Gets the value of the regulatoryProgrammeIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryProgrammeIdentifiersWrapper }
     *     
     */
    public RegulatoryProgrammeIdentifiersWrapper getRegulatoryProgrammeIdentifiers() {
        return regulatoryProgrammeIdentifiers;
    }

    /**
     * Sets the value of the regulatoryProgrammeIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryProgrammeIdentifiersWrapper }
     *     
     */
    public void setRegulatoryProgrammeIdentifiers(RegulatoryProgrammeIdentifiersWrapper value) {
        this.regulatoryProgrammeIdentifiers = value;
    }

    /**
     * Gets the value of the externalSystemIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalSystemIdentifiersWrapper }
     *     
     */
    public ExternalSystemIdentifiersWrapper getExternalSystemIdentifiers() {
        return externalSystemIdentifiers;
    }

    /**
     * Sets the value of the externalSystemIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalSystemIdentifiersWrapper }
     *     
     */
    public void setExternalSystemIdentifiers(ExternalSystemIdentifiersWrapper value) {
        this.externalSystemIdentifiers = value;
    }

}
