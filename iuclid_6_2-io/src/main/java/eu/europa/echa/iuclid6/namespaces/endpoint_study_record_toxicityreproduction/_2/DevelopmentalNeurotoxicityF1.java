
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
 *         &lt;element name="BehaviourFunctionalFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityBehaviourFunctionalFindings" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "behaviourFunctionalFindings",
    "descriptionIncidenceAndSeverityBehaviourFunctionalFindings"
})
public class DevelopmentalNeurotoxicityF1 {

    @XmlElement(name = "BehaviourFunctionalFindings", required = true)
    protected PicklistField behaviourFunctionalFindings;
    @XmlElement(name = "DescriptionIncidenceAndSeverityBehaviourFunctionalFindings", required = true)
    protected String descriptionIncidenceAndSeverityBehaviourFunctionalFindings;

    /**
     * Gets the value of the behaviourFunctionalFindings property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getBehaviourFunctionalFindings() {
        return behaviourFunctionalFindings;
    }

    /**
     * Sets the value of the behaviourFunctionalFindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setBehaviourFunctionalFindings(PicklistField value) {
        this.behaviourFunctionalFindings = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityBehaviourFunctionalFindings property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityBehaviourFunctionalFindings() {
        return descriptionIncidenceAndSeverityBehaviourFunctionalFindings;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityBehaviourFunctionalFindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityBehaviourFunctionalFindings(String value) {
        this.descriptionIncidenceAndSeverityBehaviourFunctionalFindings = value;
    }

}
