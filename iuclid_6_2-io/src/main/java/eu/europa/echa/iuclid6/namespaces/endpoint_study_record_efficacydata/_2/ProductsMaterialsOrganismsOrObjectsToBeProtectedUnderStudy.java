
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2;

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
 *         &lt;element name="OrganismsToBeProtectedOrTreatedMaterials" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "organismsToBeProtectedOrTreatedMaterials"
})
public class ProductsMaterialsOrganismsOrObjectsToBeProtectedUnderStudy {

    @XmlElement(name = "OrganismsToBeProtectedOrTreatedMaterials", required = true)
    protected String organismsToBeProtectedOrTreatedMaterials;

    /**
     * Gets the value of the organismsToBeProtectedOrTreatedMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismsToBeProtectedOrTreatedMaterials() {
        return organismsToBeProtectedOrTreatedMaterials;
    }

    /**
     * Sets the value of the organismsToBeProtectedOrTreatedMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismsToBeProtectedOrTreatedMaterials(String value) {
        this.organismsToBeProtectedOrTreatedMaterials = value;
    }

}
