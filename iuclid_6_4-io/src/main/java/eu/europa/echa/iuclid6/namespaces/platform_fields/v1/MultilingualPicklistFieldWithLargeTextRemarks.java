
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The multilingual version of the picklist field including remarks information up to 32768 characters
 * 
 * <p>Java class for multilingualPicklistFieldWithLargeTextRemarks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multilingualPicklistFieldWithLargeTextRemarks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall" minOccurs="0"/>
 *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multilingualPicklistFieldWithLargeTextRemarks", propOrder = {
    "value",
    "other",
    "remarks"
})
public class MultilingualPicklistFieldWithLargeTextRemarks {

    protected String value;
    protected List<MultilingualTextFieldSmall> other;
    protected List<MultilingualTextFieldLarge> remarks;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the other property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextFieldSmall }
     * 
     * 
     */
    public List<MultilingualTextFieldSmall> getOther() {
        if (other == null) {
            other = new ArrayList<MultilingualTextFieldSmall>();
        }
        return this.other;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextFieldLarge }
     * 
     * 
     */
    public List<MultilingualTextFieldLarge> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<MultilingualTextFieldLarge>();
        }
        return this.remarks;
    }

}
