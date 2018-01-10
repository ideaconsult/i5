
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="WoodSpecies" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="SourceWood" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Density" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="GrowthRate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="Dimensionx" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *         &lt;element name="Dimensiony" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *         &lt;element name="Dimensionz" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *         &lt;element name="MoistureContent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "woodSpecies",
    "sourceWood",
    "density",
    "growthRate",
    "dimensionx",
    "dimensiony",
    "dimensionz",
    "moistureContent"
})
public class TestSpecimensEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "WoodSpecies", required = true)
    protected PicklistField woodSpecies;
    @XmlElement(name = "SourceWood", required = true)
    protected String sourceWood;
    @XmlElement(name = "Density", required = true)
    protected PhysicalQuantityRangeField density;
    @XmlElement(name = "GrowthRate", required = true)
    protected PhysicalQuantityRangeField growthRate;
    @XmlElement(name = "Dimensionx", required = true, nillable = true)
    protected BigDecimal dimensionx;
    @XmlElement(name = "Dimensiony", required = true, nillable = true)
    protected BigDecimal dimensiony;
    @XmlElement(name = "Dimensionz", required = true, nillable = true)
    protected BigDecimal dimensionz;
    @XmlElement(name = "MoistureContent", required = true)
    protected String moistureContent;

    /**
     * Gets the value of the woodSpecies property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getWoodSpecies() {
        return woodSpecies;
    }

    /**
     * Sets the value of the woodSpecies property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setWoodSpecies(PicklistField value) {
        this.woodSpecies = value;
    }

    /**
     * Gets the value of the sourceWood property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceWood() {
        return sourceWood;
    }

    /**
     * Sets the value of the sourceWood property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceWood(String value) {
        this.sourceWood = value;
    }

    /**
     * Gets the value of the density property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getDensity() {
        return density;
    }

    /**
     * Sets the value of the density property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setDensity(PhysicalQuantityRangeField value) {
        this.density = value;
    }

    /**
     * Gets the value of the growthRate property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getGrowthRate() {
        return growthRate;
    }

    /**
     * Sets the value of the growthRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setGrowthRate(PhysicalQuantityRangeField value) {
        this.growthRate = value;
    }

    /**
     * Gets the value of the dimensionx property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimensionx() {
        return dimensionx;
    }

    /**
     * Sets the value of the dimensionx property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimensionx(BigDecimal value) {
        this.dimensionx = value;
    }

    /**
     * Gets the value of the dimensiony property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimensiony() {
        return dimensiony;
    }

    /**
     * Sets the value of the dimensiony property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimensiony(BigDecimal value) {
        this.dimensiony = value;
    }

    /**
     * Gets the value of the dimensionz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimensionz() {
        return dimensionz;
    }

    /**
     * Sets the value of the dimensionz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimensionz(BigDecimal value) {
        this.dimensionz = value;
    }

    /**
     * Gets the value of the moistureContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoistureContent() {
        return moistureContent;
    }

    /**
     * Sets the value of the moistureContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoistureContent(String value) {
        this.moistureContent = value;
    }

}
