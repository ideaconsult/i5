
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2;

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
 *         &lt;element name="EffectConcentrations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                             &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Duration" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                     &lt;sequence>
 *                                       &lt;element name="unitCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="2113"/>
 *                                             &lt;enumeration value="1976"/>
 *                                             &lt;enumeration value="1839"/>
 *                                             &lt;enumeration value="2468"/>
 *                                             &lt;enumeration value="2133"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="unitOther" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="value" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="EffectConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="NominalMeasured" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="ConcBasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="BasisForEffect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
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
 *         &lt;element name="ResultsDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ResultsRefSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="Statistics" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="AnyOtherInformationOnResultsInclTables">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
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
    "effectConcentrations",
    "resultsDetails",
    "resultsRefSubstance",
    "statistics",
    "anyOtherInformationOnResultsInclTables"
})
public class ResultsAndDiscussion {

    @XmlElement(name = "EffectConcentrations", required = true)
    protected EffectConcentrations effectConcentrations;
    @XmlElement(name = "ResultsDetails", required = true)
    protected String resultsDetails;
    @XmlElement(name = "ResultsRefSubstance", required = true)
    protected String resultsRefSubstance;
    @XmlElement(name = "Statistics", required = true)
    protected String statistics;
    @XmlElement(name = "AnyOtherInformationOnResultsInclTables", required = true)
    protected AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

    /**
     * Gets the value of the effectConcentrations property.
     * 
     * @return
     *     possible object is
     *     {@link EffectConcentrations }
     *     
     */
    public EffectConcentrations getEffectConcentrations() {
        return effectConcentrations;
    }

    /**
     * Sets the value of the effectConcentrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectConcentrations }
     *     
     */
    public void setEffectConcentrations(EffectConcentrations value) {
        this.effectConcentrations = value;
    }

    /**
     * Gets the value of the resultsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsDetails() {
        return resultsDetails;
    }

    /**
     * Sets the value of the resultsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsDetails(String value) {
        this.resultsDetails = value;
    }

    /**
     * Gets the value of the resultsRefSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsRefSubstance() {
        return resultsRefSubstance;
    }

    /**
     * Sets the value of the resultsRefSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsRefSubstance(String value) {
        this.resultsRefSubstance = value;
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
     * Gets the value of the anyOtherInformationOnResultsInclTables property.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherInformationOnResultsInclTables }
     *     
     */
    public AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
        return anyOtherInformationOnResultsInclTables;
    }

    /**
     * Sets the value of the anyOtherInformationOnResultsInclTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherInformationOnResultsInclTables }
     *     
     */
    public void setAnyOtherInformationOnResultsInclTables(AnyOtherInformationOnResultsInclTables value) {
        this.anyOtherInformationOnResultsInclTables = value;
    }

}
