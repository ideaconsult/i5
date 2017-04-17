
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;


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
 *         &lt;element name="Species" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Strain" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="DetailsOnSpeciesStrainSelection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Sex" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="OrganismDetails" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "species",
    "strain",
    "detailsOnSpeciesStrainSelection",
    "sex",
    "organismDetails"
})
public class TestAnimals {

    @XmlElement(name = "Species", required = true)
    protected PicklistField species;
    @XmlElement(name = "Strain", required = true)
    protected PicklistFieldWithSmallTextRemarks strain;
    @XmlElement(name = "DetailsOnSpeciesStrainSelection", required = true)
    protected String detailsOnSpeciesStrainSelection;
    @XmlElement(name = "Sex", required = true)
    protected PicklistField sex;
    @XmlElement(name = "OrganismDetails", required = true)
    protected String organismDetails;

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
     * Gets the value of the strain property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getStrain() {
        return strain;
    }

    /**
     * Sets the value of the strain property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setStrain(PicklistFieldWithSmallTextRemarks value) {
        this.strain = value;
    }

    /**
     * Gets the value of the detailsOnSpeciesStrainSelection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnSpeciesStrainSelection() {
        return detailsOnSpeciesStrainSelection;
    }

    /**
     * Sets the value of the detailsOnSpeciesStrainSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnSpeciesStrainSelection(String value) {
        this.detailsOnSpeciesStrainSelection = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setSex(PicklistField value) {
        this.sex = value;
    }

    /**
     * Gets the value of the organismDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismDetails() {
        return organismDetails;
    }

    /**
     * Sets the value of the organismDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismDetails(String value) {
        this.organismDetails = value;
    }

}
