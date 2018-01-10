
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
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
 *         &lt;element name="ReproductiveEffectsObserved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="LowestEffectiveDoseConc" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="2087"/>
 *                         &lt;enumeration value="2086"/>
 *                         &lt;enumeration value="2085"/>
 *                         &lt;enumeration value="2090"/>
 *                         &lt;enumeration value="2102"/>
 *                         &lt;enumeration value="2082"/>
 *                         &lt;enumeration value="2099"/>
 *                         &lt;enumeration value="2101"/>
 *                         &lt;enumeration value="2100"/>
 *                         &lt;enumeration value="2104"/>
 *                         &lt;enumeration value="2106"/>
 *                         &lt;enumeration value="2105"/>
 *                         &lt;enumeration value="2283"/>
 *                         &lt;enumeration value="2285"/>
 *                         &lt;enumeration value="2284"/>
 *                         &lt;enumeration value="1342"/>
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
 *         &lt;element name="TreatmentRelated" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="RelationToOtherToxicEffects" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DoseResponseRelationship" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="RelevantForHumans" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
    "reproductiveEffectsObserved",
    "lowestEffectiveDoseConc",
    "treatmentRelated",
    "relationToOtherToxicEffects",
    "doseResponseRelationship",
    "relevantForHumans"
})
public class Entry
    extends RepeatableEntryType
{

    @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean keyResult;
    @XmlElement(name = "ReproductiveEffectsObserved", required = true)
    protected PicklistField reproductiveEffectsObserved;
    @XmlElement(name = "LowestEffectiveDoseConc")
    protected LowestEffectiveDoseConc lowestEffectiveDoseConc;
    @XmlElement(name = "TreatmentRelated", required = true)
    protected PicklistField treatmentRelated;
    @XmlElement(name = "RelationToOtherToxicEffects", required = true)
    protected PicklistField relationToOtherToxicEffects;
    @XmlElement(name = "DoseResponseRelationship", required = true)
    protected PicklistField doseResponseRelationship;
    @XmlElement(name = "RelevantForHumans", required = true)
    protected PicklistField relevantForHumans;

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
     * Gets the value of the reproductiveEffectsObserved property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getReproductiveEffectsObserved() {
        return reproductiveEffectsObserved;
    }

    /**
     * Sets the value of the reproductiveEffectsObserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setReproductiveEffectsObserved(PicklistField value) {
        this.reproductiveEffectsObserved = value;
    }

    /**
     * Gets the value of the lowestEffectiveDoseConc property.
     * 
     * @return
     *     possible object is
     *     {@link LowestEffectiveDoseConc }
     *     
     */
    public LowestEffectiveDoseConc getLowestEffectiveDoseConc() {
        return lowestEffectiveDoseConc;
    }

    /**
     * Sets the value of the lowestEffectiveDoseConc property.
     * 
     * @param value
     *     allowed object is
     *     {@link LowestEffectiveDoseConc }
     *     
     */
    public void setLowestEffectiveDoseConc(LowestEffectiveDoseConc value) {
        this.lowestEffectiveDoseConc = value;
    }

    /**
     * Gets the value of the treatmentRelated property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getTreatmentRelated() {
        return treatmentRelated;
    }

    /**
     * Sets the value of the treatmentRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setTreatmentRelated(PicklistField value) {
        this.treatmentRelated = value;
    }

    /**
     * Gets the value of the relationToOtherToxicEffects property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getRelationToOtherToxicEffects() {
        return relationToOtherToxicEffects;
    }

    /**
     * Sets the value of the relationToOtherToxicEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setRelationToOtherToxicEffects(PicklistField value) {
        this.relationToOtherToxicEffects = value;
    }

    /**
     * Gets the value of the doseResponseRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getDoseResponseRelationship() {
        return doseResponseRelationship;
    }

    /**
     * Sets the value of the doseResponseRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setDoseResponseRelationship(PicklistField value) {
        this.doseResponseRelationship = value;
    }

    /**
     * Gets the value of the relevantForHumans property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getRelevantForHumans() {
        return relevantForHumans;
    }

    /**
     * Sets the value of the relevantForHumans property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setRelevantForHumans(PicklistField value) {
        this.relevantForHumans = value;
    }

}
