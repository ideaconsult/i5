
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2;

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
 *         &lt;element name="MaternalExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="OvariesAndUterineContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="FetalExaminations" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Indices" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="HistoricalControlData" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "maternalExaminations",
    "ovariesAndUterineContent",
    "fetalExaminations",
    "statistics",
    "indices",
    "historicalControlData"
})
public class Examinations {

    @XmlElement(name = "MaternalExaminations", required = true)
    protected String maternalExaminations;
    @XmlElement(name = "OvariesAndUterineContent", required = true)
    protected String ovariesAndUterineContent;
    @XmlElement(name = "FetalExaminations", required = true)
    protected String fetalExaminations;
    @XmlElement(name = "Statistics", required = true)
    protected String statistics;
    @XmlElement(name = "Indices", required = true)
    protected String indices;
    @XmlElement(name = "HistoricalControlData", required = true)
    protected String historicalControlData;

    /**
     * Gets the value of the maternalExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaternalExaminations() {
        return maternalExaminations;
    }

    /**
     * Sets the value of the maternalExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaternalExaminations(String value) {
        this.maternalExaminations = value;
    }

    /**
     * Gets the value of the ovariesAndUterineContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvariesAndUterineContent() {
        return ovariesAndUterineContent;
    }

    /**
     * Sets the value of the ovariesAndUterineContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvariesAndUterineContent(String value) {
        this.ovariesAndUterineContent = value;
    }

    /**
     * Gets the value of the fetalExaminations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFetalExaminations() {
        return fetalExaminations;
    }

    /**
     * Sets the value of the fetalExaminations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFetalExaminations(String value) {
        this.fetalExaminations = value;
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
     * Gets the value of the indices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndices() {
        return indices;
    }

    /**
     * Sets the value of the indices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndices(String value) {
        this.indices = value;
    }

    /**
     * Gets the value of the historicalControlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalControlData() {
        return historicalControlData;
    }

    /**
     * Sets the value of the historicalControlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalControlData(String value) {
        this.historicalControlData = value;
    }

}
