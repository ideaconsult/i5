
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="CriticalEffectsObserved" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
 *                         &lt;enumeration value="2082"/>
 *                         &lt;enumeration value="2078"/>
 *                         &lt;enumeration value="2080"/>
 *                         &lt;enumeration value="2079"/>
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
 *         &lt;element name="System" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Organ" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TreatmentRelated" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
    "criticalEffectsObserved",
    "lowestEffectiveDoseConc",
    "system",
    "organ",
    "treatmentRelated",
    "doseResponseRelationship",
    "relevantForHumans"
})
public class Entry
    extends RepeatableEntryType
{

    @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean keyResult;
    @XmlElement(name = "CriticalEffectsObserved", required = true)
    protected PicklistField criticalEffectsObserved;
    @XmlElement(name = "LowestEffectiveDoseConc")
    protected LowestEffectiveDoseConc lowestEffectiveDoseConc;
    @XmlElement(name = "System", required = true)
    protected PicklistField system;
    @XmlElement(name = "Organ")
    protected List<PicklistField> organ;
    @XmlElement(name = "TreatmentRelated", required = true)
    protected PicklistField treatmentRelated;
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
     * Gets the value of the criticalEffectsObserved property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getCriticalEffectsObserved() {
        return criticalEffectsObserved;
    }

    /**
     * Sets the value of the criticalEffectsObserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setCriticalEffectsObserved(PicklistField value) {
        this.criticalEffectsObserved = value;
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
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSystem(PicklistField value) {
        this.system = value;
    }

    /**
     * Gets the value of the organ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistField }
     * 
     * 
     */
    public List<PicklistField> getOrgan() {
        if (organ == null) {
            organ = new ArrayList<PicklistField>();
        }
        return this.organ;
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
