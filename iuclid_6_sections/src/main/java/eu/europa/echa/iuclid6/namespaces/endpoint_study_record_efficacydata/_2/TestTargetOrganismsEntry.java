
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
    "scientificName",
    "commonName",
    "developmentalStage"
})
public class TestTargetOrganismsEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "ScientificName", required = true)
    protected PicklistFieldWithSmallTextRemarks scientificName;
    @XmlElement(name = "CommonName", required = true)
    protected PicklistFieldWithSmallTextRemarks commonName;
    @XmlElement(name = "DevelopmentalStage", required = true)
    protected PicklistFieldWithSmallTextRemarks developmentalStage;

    /**
     * Gets the value of the scientificName property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getScientificName() {
        return scientificName;
    }

    /**
     * Sets the value of the scientificName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setScientificName(PicklistFieldWithSmallTextRemarks value) {
        this.scientificName = value;
    }

    /**
     * Gets the value of the commonName property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getCommonName() {
        return commonName;
    }

    /**
     * Sets the value of the commonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setCommonName(PicklistFieldWithSmallTextRemarks value) {
        this.commonName = value;
    }

    /**
     * Gets the value of the developmentalStage property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getDevelopmentalStage() {
        return developmentalStage;
    }

    /**
     * Sets the value of the developmentalStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setDevelopmentalStage(PicklistFieldWithSmallTextRemarks value) {
        this.developmentalStage = value;
    }

}
