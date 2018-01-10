
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="PlantGroup" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="DetailsOnTestOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "species",
    "plantGroup",
    "detailsOnTestOrganisms"
})
public class TestOrganismsEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "Species", required = true)
    protected PicklistField species;
    @XmlElement(name = "PlantGroup", required = true)
    protected PicklistField plantGroup;
    @XmlElement(name = "DetailsOnTestOrganisms", required = true)
    protected String detailsOnTestOrganisms;

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSpecies(PicklistField value) {
        this.species = value;
    }

    /**
     * Gets the value of the plantGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getPlantGroup() {
        return plantGroup;
    }

    /**
     * Sets the value of the plantGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setPlantGroup(PicklistField value) {
        this.plantGroup = value;
    }

    /**
     * Gets the value of the detailsOnTestOrganisms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnTestOrganisms() {
        return detailsOnTestOrganisms;
    }

    /**
     * Sets the value of the detailsOnTestOrganisms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnTestOrganisms(String value) {
        this.detailsOnTestOrganisms = value;
    }

}
