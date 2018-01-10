
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2;

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
 *         &lt;element name="EffectLevels">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Efflevel">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *                                       &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="EffectLevel" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                                       &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="Basis" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
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
 *         &lt;element name="ObservedEffects">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ObservedEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "effectLevels",
    "observedEffects",
    "anyOtherInformationOnResultsInclTables"
})
public class ResultsAndDiscussion {

    @XmlElement(name = "EffectLevels", required = true)
    protected EffectLevels effectLevels;
    @XmlElement(name = "ObservedEffects", required = true)
    protected ObservedEffects observedEffects;
    @XmlElement(name = "AnyOtherInformationOnResultsInclTables", required = true)
    protected AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

    /**
     * Gets the value of the effectLevels property.
     * 
     * @return
     *     possible object is
     *     {@link EffectLevels }
     *     
     */
    public EffectLevels getEffectLevels() {
        return effectLevels;
    }

    /**
     * Sets the value of the effectLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectLevels }
     *     
     */
    public void setEffectLevels(EffectLevels value) {
        this.effectLevels = value;
    }

    /**
     * Gets the value of the observedEffects property.
     * 
     * @return
     *     possible object is
     *     {@link ObservedEffects }
     *     
     */
    public ObservedEffects getObservedEffects() {
        return observedEffects;
    }

    /**
     * Sets the value of the observedEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObservedEffects }
     *     
     */
    public void setObservedEffects(ObservedEffects value) {
        this.observedEffects = value;
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
