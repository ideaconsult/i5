
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithMultiLineTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *       &lt;sequence>
 *         &lt;element name="KeyResult" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
 *         &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Duration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="2113"/>
 *                         &lt;enumeration value="1976"/>
 *                         &lt;enumeration value="1839"/>
 *                         &lt;enumeration value="2468"/>
 *                         &lt;enumeration value="2133"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="unitOther" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="EffectConc" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="NominalMeasured" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="ConcBasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="BasisForEffect" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="RemarksOnResults" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keyResult",
    "species",
    "duration",
    "endpoint",
    "effectConc",
    "nominalMeasured",
    "concBasedOn",
    "basisForEffect",
    "remarksOnResults"
})
public class EffectConcentrationsEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean keyResult;
    @XmlElement(name = "Species", required = true)
    protected PicklistField species;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "Endpoint", required = true)
    protected PicklistFieldWithSmallTextRemarks endpoint;
    @XmlElement(name = "EffectConc", required = true)
    protected PhysicalQuantityRangeField effectConc;
    @XmlElement(name = "NominalMeasured", required = true)
    protected PicklistField nominalMeasured;
    @XmlElement(name = "ConcBasedOn", required = true)
    protected PicklistFieldWithSmallTextRemarks concBasedOn;
    @XmlElement(name = "BasisForEffect", required = true)
    protected PicklistFieldWithSmallTextRemarks basisForEffect;
    @XmlElement(name = "RemarksOnResults", required = true)
    protected PicklistFieldWithMultiLineTextRemarks remarksOnResults;

    /**
     * Gets the value of the keyResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getKeyResult() {
        return keyResult;
    }

    /**
     * Sets the value of the keyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyResult(Boolean value) {
        this.keyResult = value;
    }

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSpecies(PicklistField value) {
        this.species = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getEndpoint() {
        return endpoint;
    }

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setEndpoint(PicklistFieldWithSmallTextRemarks value) {
        this.endpoint = value;
    }

    /**
     * Gets the value of the effectConc property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getEffectConc() {
        return effectConc;
    }

    /**
     * Sets the value of the effectConc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setEffectConc(PhysicalQuantityRangeField value) {
        this.effectConc = value;
    }

    /**
     * Gets the value of the nominalMeasured property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getNominalMeasured() {
        return nominalMeasured;
    }

    /**
     * Sets the value of the nominalMeasured property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setNominalMeasured(PicklistField value) {
        this.nominalMeasured = value;
    }

    /**
     * Gets the value of the concBasedOn property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getConcBasedOn() {
        return concBasedOn;
    }

    /**
     * Sets the value of the concBasedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setConcBasedOn(PicklistFieldWithSmallTextRemarks value) {
        this.concBasedOn = value;
    }

    /**
     * Gets the value of the basisForEffect property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getBasisForEffect() {
        return basisForEffect;
    }

    /**
     * Sets the value of the basisForEffect property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setBasisForEffect(PicklistFieldWithSmallTextRemarks value) {
        this.basisForEffect = value;
    }

    /**
     * Gets the value of the remarksOnResults property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithMultiLineTextRemarks }
     *     
     */
    public PicklistFieldWithMultiLineTextRemarks getRemarksOnResults() {
        return remarksOnResults;
    }

    /**
     * Sets the value of the remarksOnResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithMultiLineTextRemarks }
     *     
     */
    public void setRemarksOnResults(PicklistFieldWithMultiLineTextRemarks value) {
        this.remarksOnResults = value;
    }

}
