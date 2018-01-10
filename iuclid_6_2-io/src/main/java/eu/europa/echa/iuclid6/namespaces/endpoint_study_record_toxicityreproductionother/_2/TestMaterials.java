
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2;

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
 *         &lt;element name="TestMaterialInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *         &lt;element name="SpecificDetailsOnTestMaterialUsedForTheStudy" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "testMaterialInformation",
    "specificDetailsOnTestMaterialUsedForTheStudy"
})
public class TestMaterials {

    @XmlElement(name = "TestMaterialInformation", required = true)
    protected String testMaterialInformation;
    @XmlElement(name = "SpecificDetailsOnTestMaterialUsedForTheStudy", required = true)
    protected String specificDetailsOnTestMaterialUsedForTheStudy;

    /**
     * Gets the value of the testMaterialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestMaterialInformation() {
        return testMaterialInformation;
    }

    /**
     * Sets the value of the testMaterialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestMaterialInformation(String value) {
        this.testMaterialInformation = value;
    }

    /**
     * Gets the value of the specificDetailsOnTestMaterialUsedForTheStudy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificDetailsOnTestMaterialUsedForTheStudy() {
        return specificDetailsOnTestMaterialUsedForTheStudy;
    }

    /**
     * Sets the value of the specificDetailsOnTestMaterialUsedForTheStudy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificDetailsOnTestMaterialUsedForTheStudy(String value) {
        this.specificDetailsOnTestMaterialUsedForTheStudy = value;
    }

}
