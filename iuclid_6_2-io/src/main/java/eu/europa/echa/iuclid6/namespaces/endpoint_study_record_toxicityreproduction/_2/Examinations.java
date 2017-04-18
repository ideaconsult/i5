
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
 *         &lt;element name="ParentalAnimalsObservationsAndExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="EstrousCyclicityParentalAnimals" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="SpermParametersParentalAnimals" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="LitterObservations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="PostmortemExaminationsParentalAnimals" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="PostmortemExaminationsOffspring" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="ReproductiveIndices" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="OffspringViabilityIndices" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "parentalAnimalsObservationsAndExaminations",
    "estrousCyclicityParentalAnimals",
    "spermParametersParentalAnimals",
    "litterObservations",
    "postmortemExaminationsParentalAnimals",
    "postmortemExaminationsOffspring",
    "statistics",
    "reproductiveIndices",
    "offspringViabilityIndices"
})
public class Examinations {

    @XmlElement(name = "ParentalAnimalsObservationsAndExaminations", required = true)
    protected String parentalAnimalsObservationsAndExaminations;
    @XmlElement(name = "EstrousCyclicityParentalAnimals", required = true)
    protected String estrousCyclicityParentalAnimals;
    @XmlElement(name = "SpermParametersParentalAnimals", required = true)
    protected String spermParametersParentalAnimals;
    @XmlElement(name = "LitterObservations", required = true)
    protected String litterObservations;
    @XmlElement(name = "PostmortemExaminationsParentalAnimals", required = true)
    protected String postmortemExaminationsParentalAnimals;
    @XmlElement(name = "PostmortemExaminationsOffspring", required = true)
    protected String postmortemExaminationsOffspring;
    @XmlElement(name = "Statistics", required = true)
    protected String statistics;
    @XmlElement(name = "ReproductiveIndices", required = true)
    protected String reproductiveIndices;
    @XmlElement(name = "OffspringViabilityIndices", required = true)
    protected String offspringViabilityIndices;

    /**
     * Gets the value of the parentalAnimalsObservationsAndExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentalAnimalsObservationsAndExaminations() {
        return parentalAnimalsObservationsAndExaminations;
    }

    /**
     * Sets the value of the parentalAnimalsObservationsAndExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentalAnimalsObservationsAndExaminations(String value) {
        this.parentalAnimalsObservationsAndExaminations = value;
    }

    /**
     * Gets the value of the estrousCyclicityParentalAnimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstrousCyclicityParentalAnimals() {
        return estrousCyclicityParentalAnimals;
    }

    /**
     * Sets the value of the estrousCyclicityParentalAnimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstrousCyclicityParentalAnimals(String value) {
        this.estrousCyclicityParentalAnimals = value;
    }

    /**
     * Gets the value of the spermParametersParentalAnimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpermParametersParentalAnimals() {
        return spermParametersParentalAnimals;
    }

    /**
     * Sets the value of the spermParametersParentalAnimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpermParametersParentalAnimals(String value) {
        this.spermParametersParentalAnimals = value;
    }

    /**
     * Gets the value of the litterObservations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLitterObservations() {
        return litterObservations;
    }

    /**
     * Sets the value of the litterObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLitterObservations(String value) {
        this.litterObservations = value;
    }

    /**
     * Gets the value of the postmortemExaminationsParentalAnimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostmortemExaminationsParentalAnimals() {
        return postmortemExaminationsParentalAnimals;
    }

    /**
     * Sets the value of the postmortemExaminationsParentalAnimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostmortemExaminationsParentalAnimals(String value) {
        this.postmortemExaminationsParentalAnimals = value;
    }

    /**
     * Gets the value of the postmortemExaminationsOffspring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostmortemExaminationsOffspring() {
        return postmortemExaminationsOffspring;
    }

    /**
     * Sets the value of the postmortemExaminationsOffspring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostmortemExaminationsOffspring(String value) {
        this.postmortemExaminationsOffspring = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatistics(String value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the reproductiveIndices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReproductiveIndices() {
        return reproductiveIndices;
    }

    /**
     * Sets the value of the reproductiveIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReproductiveIndices(String value) {
        this.reproductiveIndices = value;
    }

    /**
     * Gets the value of the offspringViabilityIndices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffspringViabilityIndices() {
        return offspringViabilityIndices;
    }

    /**
     * Sets the value of the offspringViabilityIndices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffspringViabilityIndices(String value) {
        this.offspringViabilityIndices = value;
    }

}
