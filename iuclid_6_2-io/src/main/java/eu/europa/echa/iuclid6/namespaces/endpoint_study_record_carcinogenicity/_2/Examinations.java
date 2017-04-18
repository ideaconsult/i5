
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2;

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
 *         &lt;element name="ObservationsAndExaminationsPerformedAndFrequency" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="SacrificeAndPathology" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OtherExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "observationsAndExaminationsPerformedAndFrequency",
    "sacrificeAndPathology",
    "otherExaminations",
    "statistics"
})
public class Examinations {

    @XmlElement(name = "ObservationsAndExaminationsPerformedAndFrequency", required = true)
    protected String observationsAndExaminationsPerformedAndFrequency;
    @XmlElement(name = "SacrificeAndPathology", required = true)
    protected String sacrificeAndPathology;
    @XmlElement(name = "OtherExaminations", required = true)
    protected String otherExaminations;
    @XmlElement(name = "Statistics", required = true)
    protected String statistics;

    /**
     * Gets the value of the observationsAndExaminationsPerformedAndFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservationsAndExaminationsPerformedAndFrequency() {
        return observationsAndExaminationsPerformedAndFrequency;
    }

    /**
     * Sets the value of the observationsAndExaminationsPerformedAndFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservationsAndExaminationsPerformedAndFrequency(String value) {
        this.observationsAndExaminationsPerformedAndFrequency = value;
    }

    /**
     * Gets the value of the sacrificeAndPathology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSacrificeAndPathology() {
        return sacrificeAndPathology;
    }

    /**
     * Sets the value of the sacrificeAndPathology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSacrificeAndPathology(String value) {
        this.sacrificeAndPathology = value;
    }

    /**
     * Gets the value of the otherExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherExaminations() {
        return otherExaminations;
    }

    /**
     * Sets the value of the otherExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherExaminations(String value) {
        this.otherExaminations = value;
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

}
