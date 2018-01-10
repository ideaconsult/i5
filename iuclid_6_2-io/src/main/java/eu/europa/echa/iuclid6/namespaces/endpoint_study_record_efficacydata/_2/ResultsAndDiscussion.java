
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

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
 *         &lt;element name="EfficacyPerformanceAssessment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="EfficacyParameter" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Efficacy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="TimeToProduceEffect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="Treatment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                             &lt;element name="InterferingSubstances" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *         &lt;element name="MinimumEffectiveDose">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="MinimumEffectiveDose" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                     &lt;sequence>
 *                                       &lt;element name="unitCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="2507"/>
 *                                             &lt;enumeration value="4521"/>
 *                                             &lt;enumeration value="2506"/>
 *                                             &lt;enumeration value="2505"/>
 *                                             &lt;enumeration value="4523"/>
 *                                             &lt;enumeration value="1929"/>
 *                                             &lt;enumeration value="2022"/>
 *                                             &lt;enumeration value="1930"/>
 *                                             &lt;enumeration value="2020"/>
 *                                             &lt;enumeration value="2118"/>
 *                                             &lt;enumeration value="2495"/>
 *                                             &lt;enumeration value="2155"/>
 *                                             &lt;enumeration value="2500"/>
 *                                             &lt;enumeration value="2098"/>
 *                                             &lt;enumeration value="1935"/>
 *                                             &lt;enumeration value="2504"/>
 *                                             &lt;enumeration value="2123"/>
 *                                             &lt;enumeration value="2127"/>
 *                                             &lt;enumeration value="2077"/>
 *                                             &lt;enumeration value="2081"/>
 *                                             &lt;enumeration value="2090"/>
 *                                             &lt;enumeration value="2154"/>
 *                                             &lt;enumeration value="2499"/>
 *                                             &lt;enumeration value="2093"/>
 *                                             &lt;enumeration value="2095"/>
 *                                             &lt;enumeration value="1933"/>
 *                                             &lt;enumeration value="2282"/>
 *                                             &lt;enumeration value="2283"/>
 *                                             &lt;enumeration value="1342"/>
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
 *                             &lt;element name="TimeToProduceEffect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="Treatment" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                             &lt;element name="InterferingSubstances" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
 *         &lt;element name="ResultsOnDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="ObservedLimitationsOnEfficacy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IndicationOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnDevelopmentOfResistance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="UndesirableOrUnintendedSideEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="DetailsOnUndesirableOrUnintendedSideEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="OtherLimitationsObserved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                   &lt;element name="RelevanceOfStudyResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "efficacyPerformanceAssessment",
    "minimumEffectiveDose",
    "resultsOnDetails",
    "observedLimitationsOnEfficacy",
    "anyOtherInformationOnResultsInclTables"
})
public class ResultsAndDiscussion {

    @XmlElement(name = "EfficacyPerformanceAssessment", required = true)
    protected EfficacyPerformanceAssessment efficacyPerformanceAssessment;
    @XmlElement(name = "MinimumEffectiveDose", required = true)
    protected ResultsAndDiscussionMinimumEffectiveDose minimumEffectiveDose;
    @XmlElement(name = "ResultsOnDetails", required = true)
    protected String resultsOnDetails;
    @XmlElement(name = "ObservedLimitationsOnEfficacy", required = true)
    protected ObservedLimitationsOnEfficacy observedLimitationsOnEfficacy;
    @XmlElement(name = "AnyOtherInformationOnResultsInclTables", required = true)
    protected AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

    /**
     * Gets the value of the efficacyPerformanceAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link EfficacyPerformanceAssessment }
     *     
     */
    public EfficacyPerformanceAssessment getEfficacyPerformanceAssessment() {
        return efficacyPerformanceAssessment;
    }

    /**
     * Sets the value of the efficacyPerformanceAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EfficacyPerformanceAssessment }
     *     
     */
    public void setEfficacyPerformanceAssessment(EfficacyPerformanceAssessment value) {
        this.efficacyPerformanceAssessment = value;
    }

    /**
     * Gets the value of the minimumEffectiveDose property.
     * 
     * @return
     *     possible object is
     *     {@link ResultsAndDiscussionMinimumEffectiveDose }
     *     
     */
    public ResultsAndDiscussionMinimumEffectiveDose getMinimumEffectiveDose() {
        return minimumEffectiveDose;
    }

    /**
     * Sets the value of the minimumEffectiveDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsAndDiscussionMinimumEffectiveDose }
     *     
     */
    public void setMinimumEffectiveDose(ResultsAndDiscussionMinimumEffectiveDose value) {
        this.minimumEffectiveDose = value;
    }

    /**
     * Gets the value of the resultsOnDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsOnDetails() {
        return resultsOnDetails;
    }

    /**
     * Sets the value of the resultsOnDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsOnDetails(String value) {
        this.resultsOnDetails = value;
    }

    /**
     * Gets the value of the observedLimitationsOnEfficacy property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedLimitationsOnEfficacy }
     *     
     */
    public ObservedLimitationsOnEfficacy getObservedLimitationsOnEfficacy() {
        return observedLimitationsOnEfficacy;
    }

    /**
     * Sets the value of the observedLimitationsOnEfficacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedLimitationsOnEfficacy }
     *     
     */
    public void setObservedLimitationsOnEfficacy(ObservedLimitationsOnEfficacy value) {
        this.observedLimitationsOnEfficacy = value;
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
