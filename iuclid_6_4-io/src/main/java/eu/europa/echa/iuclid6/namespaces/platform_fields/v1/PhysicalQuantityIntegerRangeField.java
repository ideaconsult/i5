
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Lists the elements constituting the integer physical quantity range field
 * 
 * <p>Java class for physicalQuantityIntegerRangeField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physicalQuantityIntegerRangeField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *         &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *         &lt;group ref="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}rangeQualifierIntegerGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicalQuantityIntegerRangeField", propOrder = {
    "unitCode",
    "unitOther",
    "lowerQualifier",
    "upperQualifier",
    "lowerValue",
    "upperValue"
})
public class PhysicalQuantityIntegerRangeField {

    protected String unitCode;
    protected String unitOther;
    protected String lowerQualifier;
    protected String upperQualifier;
    protected BigInteger lowerValue;
    protected BigInteger upperValue;

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the unitOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOther() {
        return unitOther;
    }

    /**
     * Sets the value of the unitOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOther(String value) {
        this.unitOther = value;
    }

    /**
     * Gets the value of the lowerQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerQualifier() {
        return lowerQualifier;
    }

    /**
     * Sets the value of the lowerQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerQualifier(String value) {
        this.lowerQualifier = value;
    }

    /**
     * Gets the value of the upperQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperQualifier() {
        return upperQualifier;
    }

    /**
     * Sets the value of the upperQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperQualifier(String value) {
        this.upperQualifier = value;
    }

    /**
     * Gets the value of the lowerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLowerValue() {
        return lowerValue;
    }

    /**
     * Sets the value of the lowerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLowerValue(BigInteger value) {
        this.lowerValue = value;
    }

    /**
     * Gets the value of the upperValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpperValue() {
        return upperValue;
    }

    /**
     * Sets the value of the upperValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpperValue(BigInteger value) {
        this.upperValue = value;
    }

}
