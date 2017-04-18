
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityField;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *       &lt;sequence>
 *         &lt;element name="unitCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="2507"/>
 *               &lt;enumeration value="4521"/>
 *               &lt;enumeration value="2506"/>
 *               &lt;enumeration value="2505"/>
 *               &lt;enumeration value="4523"/>
 *               &lt;enumeration value="1929"/>
 *               &lt;enumeration value="2022"/>
 *               &lt;enumeration value="1930"/>
 *               &lt;enumeration value="2020"/>
 *               &lt;enumeration value="2118"/>
 *               &lt;enumeration value="2495"/>
 *               &lt;enumeration value="2155"/>
 *               &lt;enumeration value="2500"/>
 *               &lt;enumeration value="2098"/>
 *               &lt;enumeration value="1935"/>
 *               &lt;enumeration value="2504"/>
 *               &lt;enumeration value="2123"/>
 *               &lt;enumeration value="2127"/>
 *               &lt;enumeration value="2077"/>
 *               &lt;enumeration value="2081"/>
 *               &lt;enumeration value="2090"/>
 *               &lt;enumeration value="2154"/>
 *               &lt;enumeration value="2499"/>
 *               &lt;enumeration value="2093"/>
 *               &lt;enumeration value="2095"/>
 *               &lt;enumeration value="1933"/>
 *               &lt;enumeration value="2282"/>
 *               &lt;enumeration value="2283"/>
 *               &lt;enumeration value="1342"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="unitOther" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="value" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "unitCode",
    "unitOther",
    "value"
})
public class MinimumEffectiveDose
    extends PhysicalQuantityField
{

    protected String unitCode;
    protected String unitOther;
    protected String value;

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

}
