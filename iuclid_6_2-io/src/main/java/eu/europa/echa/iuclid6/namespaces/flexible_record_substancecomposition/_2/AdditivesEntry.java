
package eu.europa.echa.iuclid6.namespaces.flexible_record_substancecomposition._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityHalfBoundedField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
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
 *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *         &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *         &lt;element name="ProportionTypical" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityHalfBoundedField"/>
 *         &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="Function" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DetailsOfFunctionInComposition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="RelevantForClassificationLabeling" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField"/>
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
    "dataProtection",
    "referenceSubstance",
    "proportionTypical",
    "concentration",
    "function",
    "detailsOfFunctionInComposition",
    "remarks",
    "relevantForClassificationLabeling"
})
public class AdditivesEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "DataProtection", required = true)
    protected DataProtectionField dataProtection;
    @XmlElement(name = "ReferenceSubstance", required = true)
    protected String referenceSubstance;
    @XmlElement(name = "ProportionTypical", required = true)
    protected PhysicalQuantityHalfBoundedField proportionTypical;
    @XmlElement(name = "Concentration", required = true)
    protected PhysicalQuantityRangeField concentration;
    @XmlElement(name = "Function", required = true)
    protected PicklistField function;
    @XmlElement(name = "DetailsOfFunctionInComposition", required = true)
    protected String detailsOfFunctionInComposition;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;
    @XmlElement(name = "RelevantForClassificationLabeling", required = true, type = Boolean.class, nillable = true)
    protected Boolean relevantForClassificationLabeling;

    /**
     * Gets the value of the dataProtection property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionField }
     *     
     */
    public DataProtectionField getDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionField }
     *     
     */
    public void setDataProtection(DataProtectionField value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the referenceSubstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceSubstance() {
        return referenceSubstance;
    }

    /**
     * Sets the value of the referenceSubstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceSubstance(String value) {
        this.referenceSubstance = value;
    }

    /**
     * Gets the value of the proportionTypical property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityHalfBoundedField }
     *     
     */
    public PhysicalQuantityHalfBoundedField getProportionTypical() {
        return proportionTypical;
    }

    /**
     * Sets the value of the proportionTypical property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityHalfBoundedField }
     *     
     */
    public void setProportionTypical(PhysicalQuantityHalfBoundedField value) {
        this.proportionTypical = value;
    }

    /**
     * Gets the value of the concentration property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getConcentration() {
        return concentration;
    }

    /**
     * Sets the value of the concentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setConcentration(PhysicalQuantityRangeField value) {
        this.concentration = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setFunction(PicklistField value) {
        this.function = value;
    }

    /**
     * Gets the value of the detailsOfFunctionInComposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOfFunctionInComposition() {
        return detailsOfFunctionInComposition;
    }

    /**
     * Sets the value of the detailsOfFunctionInComposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOfFunctionInComposition(String value) {
        this.detailsOfFunctionInComposition = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the relevantForClassificationLabeling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRelevantForClassificationLabeling() {
        return relevantForClassificationLabeling;
    }

    /**
     * Sets the value of the relevantForClassificationLabeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelevantForClassificationLabeling(Boolean value) {
        this.relevantForClassificationLabeling = value;
    }

}
