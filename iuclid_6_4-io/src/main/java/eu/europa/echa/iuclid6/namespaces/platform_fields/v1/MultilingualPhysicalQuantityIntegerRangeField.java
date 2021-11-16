
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The multilingual version of the physical quantity range field with integer value
 * 
 * <p>Java class for multilingualPhysicalQuantityIntegerRangeField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multilingualPhysicalQuantityIntegerRangeField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitCode" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *         &lt;element name="unitOther" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "multilingualPhysicalQuantityIntegerRangeField", propOrder = {
    "unitCode",
    "unitOther",
    "lowerQualifier",
    "upperQualifier",
    "lowerValue",
    "upperValue"
})
public class MultilingualPhysicalQuantityIntegerRangeField {

    protected String unitCode;
    protected List<MultilingualTextFieldSmall> unitOther;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextFieldSmall }
     * 
     * 
     */
    public List<MultilingualTextFieldSmall> getUnitOther() {
        if (unitOther == null) {
            unitOther = new ArrayList<MultilingualTextFieldSmall>();
        }
        return this.unitOther;
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
