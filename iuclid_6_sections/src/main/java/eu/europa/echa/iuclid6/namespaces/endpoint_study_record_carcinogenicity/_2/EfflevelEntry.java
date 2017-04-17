
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithLargeTextRemarks;
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
 *         &lt;element name="Endpoint" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="EffectLevel" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="BasedOn" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Basis" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithLargeTextRemarks" maxOccurs="unbounded" minOccurs="0"/>
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
    "endpoint",
    "effectLevel",
    "basedOn",
    "sex",
    "basis",
    "remarksOnResults"
})
public class EfflevelEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "KeyResult", required = true, type = Boolean.class, nillable = true)
    protected Boolean keyResult;
    @XmlElement(name = "Endpoint", required = true)
    protected PicklistFieldWithSmallTextRemarks endpoint;
    @XmlElement(name = "EffectLevel", required = true)
    protected PhysicalQuantityRangeField effectLevel;
    @XmlElement(name = "BasedOn", required = true)
    protected PicklistFieldWithSmallTextRemarks basedOn;
    @XmlElement(name = "Sex", required = true)
    protected PicklistField sex;
    @XmlElement(name = "Basis")
    protected List<PicklistFieldWithLargeTextRemarks> basis;
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
     * Gets the value of the effectLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getEffectLevel() {
        return effectLevel;
    }

    /**
     * Sets the value of the effectLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setEffectLevel(PhysicalQuantityRangeField value) {
        this.effectLevel = value;
    }

    /**
     * Gets the value of the basedOn property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getBasedOn() {
        return basedOn;
    }

    /**
     * Sets the value of the basedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setBasedOn(PicklistFieldWithSmallTextRemarks value) {
        this.basedOn = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSex(PicklistField value) {
        this.sex = value;
    }

    /**
     * Gets the value of the basis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicklistFieldWithLargeTextRemarks }
     * 
     * 
     */
    public List<PicklistFieldWithLargeTextRemarks> getBasis() {
        if (basis == null) {
            basis = new ArrayList<PicklistFieldWithLargeTextRemarks>();
        }
        return this.basis;
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
