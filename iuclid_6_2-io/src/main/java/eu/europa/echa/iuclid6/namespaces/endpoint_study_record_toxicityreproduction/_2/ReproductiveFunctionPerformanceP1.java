
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
 *         &lt;element name="ReproductiveFunctionEstrousCycle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ReproductiveFunctionSpermMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ReproductivePerformance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DescriptionIncidenceAndSeverityReproductivePerformance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "reproductiveFunctionEstrousCycle",
    "descriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle",
    "reproductiveFunctionSpermMeasures",
    "descriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures",
    "reproductivePerformance",
    "descriptionIncidenceAndSeverityReproductivePerformance"
})
public class ReproductiveFunctionPerformanceP1 {

    @XmlElement(name = "ReproductiveFunctionEstrousCycle", required = true)
    protected PicklistField reproductiveFunctionEstrousCycle;
    @XmlElement(name = "DescriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle", required = true)
    protected String descriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle;
    @XmlElement(name = "ReproductiveFunctionSpermMeasures", required = true)
    protected PicklistField reproductiveFunctionSpermMeasures;
    @XmlElement(name = "DescriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures", required = true)
    protected String descriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures;
    @XmlElement(name = "ReproductivePerformance", required = true)
    protected PicklistField reproductivePerformance;
    @XmlElement(name = "DescriptionIncidenceAndSeverityReproductivePerformance", required = true)
    protected String descriptionIncidenceAndSeverityReproductivePerformance;

    /**
     * Gets the value of the reproductiveFunctionEstrousCycle property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getReproductiveFunctionEstrousCycle() {
        return reproductiveFunctionEstrousCycle;
    }

    /**
     * Sets the value of the reproductiveFunctionEstrousCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setReproductiveFunctionEstrousCycle(PicklistField value) {
        this.reproductiveFunctionEstrousCycle = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle() {
        return descriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle(String value) {
        this.descriptionIncidenceAndSeverityReproductiveFunctionEstrousCycle = value;
    }

    /**
     * Gets the value of the reproductiveFunctionSpermMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getReproductiveFunctionSpermMeasures() {
        return reproductiveFunctionSpermMeasures;
    }

    /**
     * Sets the value of the reproductiveFunctionSpermMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setReproductiveFunctionSpermMeasures(PicklistField value) {
        this.reproductiveFunctionSpermMeasures = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures() {
        return descriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures(String value) {
        this.descriptionIncidenceAndSeverityReproductiveFunctionSpermMeasures = value;
    }

    /**
     * Gets the value of the reproductivePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getReproductivePerformance() {
        return reproductivePerformance;
    }

    /**
     * Sets the value of the reproductivePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setReproductivePerformance(PicklistField value) {
        this.reproductivePerformance = value;
    }

    /**
     * Gets the value of the descriptionIncidenceAndSeverityReproductivePerformance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionIncidenceAndSeverityReproductivePerformance() {
        return descriptionIncidenceAndSeverityReproductivePerformance;
    }

    /**
     * Sets the value of the descriptionIncidenceAndSeverityReproductivePerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionIncidenceAndSeverityReproductivePerformance(String value) {
        this.descriptionIncidenceAndSeverityReproductivePerformance = value;
    }

}
