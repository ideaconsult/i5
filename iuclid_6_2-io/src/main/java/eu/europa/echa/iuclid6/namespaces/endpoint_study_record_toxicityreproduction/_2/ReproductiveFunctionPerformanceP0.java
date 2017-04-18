
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
 *         &lt;element name="ObservEstrousParent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservEstrousParent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservSpermParent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservSpermParent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservReproPerformParent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityObservReproPerformParent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "observEstrousParent",
    "descriptionIncidenceAndSeverityObservEstrousParent",
    "observSpermParent",
    "descriptionIncidenceAndSeverityObservSpermParent",
    "observReproPerformParent",
    "descriptionIncidenceAndSeverityObservReproPerformParent"
})
public class ReproductiveFunctionPerformanceP0 {

    @XmlElement(name = "ObservEstrousParent", required = true)
    protected PicklistField observEstrousParent;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservEstrousParent", required = true)
    protected String descriptionIncidenceAndSeverityObservEstrousParent;
    @XmlElement(name = "ObservSpermParent", required = true)
    protected PicklistField observSpermParent;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservSpermParent", required = true)
    protected String descriptionIncidenceAndSeverityObservSpermParent;
    @XmlElement(name = "ObservReproPerformParent", required = true)
    protected PicklistField observReproPerformParent;
    @XmlElement(name = "DescriptionIncidenceAndSeverityObservReproPerformParent", required = true)
    protected String descriptionIncidenceAndSeverityObservReproPerformParent;

    /**
     * Gets the value of the observEstrousParent property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservEstrousParent() {
        return observEstrousParent;
    }

    /**
     * Sets the value of the observEstrousParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservEstrousParent(PicklistField value) {
        this.observEstrousParent = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservEstrousParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservEstrousParent() {
        return descriptionIncidenceAndSeverityObservEstrousParent;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservEstrousParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservEstrousParent(String value) {
        this.descriptionIncidenceAndSeverityObservEstrousParent = value;
    }

    /**
     * Gets the value of the observSpermParent property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservSpermParent() {
        return observSpermParent;
    }

    /**
     * Sets the value of the observSpermParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservSpermParent(PicklistField value) {
        this.observSpermParent = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservSpermParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservSpermParent() {
        return descriptionIncidenceAndSeverityObservSpermParent;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservSpermParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservSpermParent(String value) {
        this.descriptionIncidenceAndSeverityObservSpermParent = value;
    }

    /**
     * Gets the value of the observReproPerformParent property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getObservReproPerformParent() {
        return observReproPerformParent;
    }

    /**
     * Sets the value of the observReproPerformParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setObservReproPerformParent(PicklistField value) {
        this.observReproPerformParent = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityObservReproPerformParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityObservReproPerformParent() {
        return descriptionIncidenceAndSeverityObservReproPerformParent;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityObservReproPerformParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityObservReproPerformParent(String value) {
        this.descriptionIncidenceAndSeverityObservReproPerformParent = value;
    }

}
