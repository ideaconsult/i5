
package eu.europa.echa.iuclid6.namespaces.reference_substance._2;

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
 *         &lt;element name="CASNumber" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *         &lt;element name="CASName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "casNumber",
    "casName"
})
public class CASInfo {

    @XmlElement(name = "CASNumber", required = true)
    protected String casNumber;
    @XmlElement(name = "CASName", required = true)
    protected String casName;

    /**
     * Gets the value of the casNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASNumber() {
        return casNumber;
    }

    /**
     * Sets the value of the casNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASNumber(String value) {
        this.casNumber = value;
    }

    /**
     * Gets the value of the casName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASName() {
        return casName;
    }

    /**
     * Sets the value of the casName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASName(String value) {
        this.casName = value;
    }

}
