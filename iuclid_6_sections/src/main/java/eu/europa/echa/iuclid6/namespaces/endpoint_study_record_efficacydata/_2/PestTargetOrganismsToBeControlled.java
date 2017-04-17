
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
 *         &lt;element name="TestTargetOrganisms">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="ScientificName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="CommonName" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                             &lt;element name="DevelopmentalStage" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetailsOnTestTargetOrganisms" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "testTargetOrganisms",
    "detailsOnTestTargetOrganisms"
})
public class PestTargetOrganismsToBeControlled {

    @XmlElement(name = "TestTargetOrganisms", required = true)
    protected TestTargetOrganisms testTargetOrganisms;
    @XmlElement(name = "DetailsOnTestTargetOrganisms", required = true)
    protected String detailsOnTestTargetOrganisms;

    /**
     * Gets the value of the testTargetOrganisms property.
     * 
     * @return
     *     possible object is
     *     {@link TestTargetOrganisms }
     *     
     */
    public TestTargetOrganisms getTestTargetOrganisms() {
        return testTargetOrganisms;
    }

    /**
     * Sets the value of the testTargetOrganisms property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestTargetOrganisms }
     *     
     */
    public void setTestTargetOrganisms(TestTargetOrganisms value) {
        this.testTargetOrganisms = value;
    }

    /**
     * Gets the value of the detailsOnTestTargetOrganisms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsOnTestTargetOrganisms() {
        return detailsOnTestTargetOrganisms;
    }

    /**
     * Sets the value of the detailsOnTestTargetOrganisms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsOnTestTargetOrganisms(String value) {
        this.detailsOnTestTargetOrganisms = value;
    }

}
