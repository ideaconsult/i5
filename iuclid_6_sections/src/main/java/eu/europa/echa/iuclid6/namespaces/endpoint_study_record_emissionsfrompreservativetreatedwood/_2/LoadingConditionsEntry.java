
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="WoodWeightPerWaterVolume" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="2022"/>
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
 *         &lt;element name="WoodSurfacePerWaterVolume" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                 &lt;sequence>
 *                   &lt;element name="unitCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value=""/>
 *                         &lt;enumeration value="55500"/>
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
    "woodWeightPerWaterVolume",
    "woodSurfacePerWaterVolume"
})
public class LoadingConditionsEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "WoodWeightPerWaterVolume")
    protected WoodWeightPerWaterVolume woodWeightPerWaterVolume;
    @XmlElement(name = "WoodSurfacePerWaterVolume")
    protected WoodSurfacePerWaterVolume woodSurfacePerWaterVolume;

    /**
     * Gets the value of the woodWeightPerWaterVolume property.
     * 
     * @return
     *     possible object is
     *     {@link WoodWeightPerWaterVolume }
     *     
     */
    public WoodWeightPerWaterVolume getWoodWeightPerWaterVolume() {
        return woodWeightPerWaterVolume;
    }

    /**
     * Sets the value of the woodWeightPerWaterVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link WoodWeightPerWaterVolume }
     *     
     */
    public void setWoodWeightPerWaterVolume(WoodWeightPerWaterVolume value) {
        this.woodWeightPerWaterVolume = value;
    }

    /**
     * Gets the value of the woodSurfacePerWaterVolume property.
     * 
     * @return
     *     possible object is
     *     {@link WoodSurfacePerWaterVolume }
     *     
     */
    public WoodSurfacePerWaterVolume getWoodSurfacePerWaterVolume() {
        return woodSurfacePerWaterVolume;
    }

    /**
     * Sets the value of the woodSurfacePerWaterVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link WoodSurfacePerWaterVolume }
     *     
     */
    public void setWoodSurfacePerWaterVolume(WoodSurfacePerWaterVolume value) {
        this.woodSurfacePerWaterVolume = value;
    }

}
