
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2;

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
 *         &lt;element name="DevelopmentalImmunotoxicity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityDevelopmentalImmunotoxicity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "developmentalImmunotoxicity",
    "descriptionIncidenceAndSeverityDevelopmentalImmunotoxicity"
})
public class DevelopmentalImmunotoxicityOfF1Generation {

    @XmlElement(name = "DevelopmentalImmunotoxicity", required = true)
    protected PicklistField developmentalImmunotoxicity;
    @XmlElement(name = "DescriptionIncidenceAndSeverityDevelopmentalImmunotoxicity", required = true)
    protected String descriptionIncidenceAndSeverityDevelopmentalImmunotoxicity;

    /**
     * Gets the value of the developmentalImmunotoxicity property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getDevelopmentalImmunotoxicity() {
        return developmentalImmunotoxicity;
    }

    /**
     * Sets the value of the developmentalImmunotoxicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setDevelopmentalImmunotoxicity(PicklistField value) {
        this.developmentalImmunotoxicity = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityDevelopmentalImmunotoxicity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityDevelopmentalImmunotoxicity() {
        return descriptionIncidenceAndSeverityDevelopmentalImmunotoxicity;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityDevelopmentalImmunotoxicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityDevelopmentalImmunotoxicity(String value) {
        this.descriptionIncidenceAndSeverityDevelopmentalImmunotoxicity = value;
    }

}
