
package eu.europa.echa.iuclid6.namespaces.reference_substance._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;


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
 *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *         &lt;element name="MolecularFormula" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="MolecularWeightRange" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="SmilesNotation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="InChl" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="StructuralFormula" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}attachmentField"/>
 *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "dataProtection",
    "molecularFormula",
    "molecularWeightRange",
    "smilesNotation",
    "inChl",
    "structuralFormula",
    "remarks"
})
public class MolecularStructuralInfo {

    @XmlElement(name = "DataProtection", required = true)
    protected DataProtectionField dataProtection;
    @XmlElement(name = "MolecularFormula", required = true)
    protected String molecularFormula;
    @XmlElement(name = "MolecularWeightRange", required = true)
    protected PhysicalQuantityRangeField molecularWeightRange;
    @XmlElement(name = "SmilesNotation", required = true)
    protected String smilesNotation;
    @XmlElement(name = "InChl", required = true)
    protected String inChl;
    @XmlElement(name = "StructuralFormula", required = true)
    protected String structuralFormula;
    @XmlElement(name = "Remarks", required = true)
    protected String remarks;

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
     * Gets the value of the molecularFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMolecularFormula() {
        return molecularFormula;
    }

    /**
     * Sets the value of the molecularFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMolecularFormula(String value) {
        this.molecularFormula = value;
    }

    /**
     * Gets the value of the molecularWeightRange property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getMolecularWeightRange() {
        return molecularWeightRange;
    }

    /**
     * Sets the value of the molecularWeightRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setMolecularWeightRange(PhysicalQuantityRangeField value) {
        this.molecularWeightRange = value;
    }

    /**
     * Gets the value of the smilesNotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmilesNotation() {
        return smilesNotation;
    }

    /**
     * Sets the value of the smilesNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmilesNotation(String value) {
        this.smilesNotation = value;
    }

    /**
     * Gets the value of the inChl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInChl() {
        return inChl;
    }

    /**
     * Sets the value of the inChl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInChl(String value) {
        this.inChl = value;
    }

    /**
     * Gets the value of the structuralFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStructuralFormula() {
        return structuralFormula;
    }

    /**
     * Sets the value of the structuralFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStructuralFormula(String value) {
        this.structuralFormula = value;
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

}
