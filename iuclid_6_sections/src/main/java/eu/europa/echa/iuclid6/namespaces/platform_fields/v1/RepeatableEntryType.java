//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 08:47:51 PM EEST 
//


package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repeatableEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repeatableEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" use="required" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}uuidAttribute" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repeatableEntryType")
@XmlSeeAlso({
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.AdministrativeData.AttachedJustification.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.AdministrativeData.CrossReference.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.MaterialsAndMethods.Guideline.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.MaterialsAndMethods.TestMaterials.ReferenceMaterial.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.ResultsAndDiscussion.ZetaPotential.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.ResultsAndDiscussion.IsoElectricPoint.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_zetapotential._2.ENDPOINTSTUDYRECORDZetaPotential.OverallRemarksAttachments.AttachedBackgroundMaterial.Entry.class
})
public class RepeatableEntryType {

    @XmlAttribute(name = "uuid", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1", required = true)
    protected String uuid;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
