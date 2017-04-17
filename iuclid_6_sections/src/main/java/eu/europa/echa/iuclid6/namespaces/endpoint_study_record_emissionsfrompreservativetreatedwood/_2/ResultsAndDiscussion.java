
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="Retention">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="ReplicateNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Retention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="RetentionStddev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *                             &lt;element name="RetentionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
 *         &lt;element name="Leaching">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="Time" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityField">
 *                                     &lt;sequence>
 *                                       &lt;element name="unitCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value=""/>
 *                                             &lt;enumeration value="2329"/>
 *                                             &lt;enumeration value="2113"/>
 *                                             &lt;enumeration value="1976"/>
 *                                             &lt;enumeration value="1839"/>
 *                                             &lt;enumeration value="2468"/>
 *                                             &lt;enumeration value="2133"/>
 *                                             &lt;enumeration value="2477"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="unitOther" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="255"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="value" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ActiveIngredient" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="TypeOfSpecimen" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="SpecimenNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="EmissionRate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
 *         &lt;element name="ValidityCritFulfilled" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="QualityCriteria" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="AnyOtherInformationOnResultsInclTables">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "retention",
    "leaching",
    "validityCritFulfilled",
    "qualityCriteria",
    "anyOtherInformationOnResultsInclTables"
})
public class ResultsAndDiscussion {

    @XmlElement(name = "Retention", required = true)
    protected Retention retention;
    @XmlElement(name = "Leaching", required = true)
    protected Leaching leaching;
    @XmlElement(name = "ValidityCritFulfilled", required = true)
    protected PicklistFieldWithSmallTextRemarks validityCritFulfilled;
    @XmlElement(name = "QualityCriteria", required = true)
    protected String qualityCriteria;
    @XmlElement(name = "AnyOtherInformationOnResultsInclTables", required = true)
    protected AnyOtherInformationOnResultsInclTables anyOtherInformationOnResultsInclTables;

    /**
     * Gets the value of the retention property.
     * 
     * @return
     *     possible object is
     *     {@link Retention }
     *     
     */
    public Retention getRetention() {
        return retention;
    }

    /**
     * Sets the value of the retention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Retention }
     *     
     */
    public void setRetention(Retention value) {
        this.retention = value;
    }

    /**
     * Gets the value of the leaching property.
     * 
     * @return
     *     possible object is
     *     {@link Leaching }
     *     
     */
    public Leaching getLeaching() {
        return leaching;
    }

    /**
     * Sets the value of the leaching property.
     * 
     * @param value
     *     allowed object is
     *     {@link Leaching }
     *     
     */
    public void setLeaching(Leaching value) {
        this.leaching = value;
    }

    /**
     * Gets the value of the validityCritFulfilled property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getValidityCritFulfilled() {
        return validityCritFulfilled;
    }

    /**
     * Sets the value of the validityCritFulfilled property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setValidityCritFulfilled(PicklistFieldWithSmallTextRemarks value) {
        this.validityCritFulfilled = value;
    }

    /**
     * Gets the value of the qualityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityCriteria() {
        return qualityCriteria;
    }

    /**
     * Sets the value of the qualityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityCriteria(String value) {
        this.qualityCriteria = value;
    }

    /**
     * Gets the value of the anyOtherInformationOnResultsInclTables property.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherInformationOnResultsInclTables }
     *     
     */
    public AnyOtherInformationOnResultsInclTables getAnyOtherInformationOnResultsInclTables() {
        return anyOtherInformationOnResultsInclTables;
    }

    /**
     * Sets the value of the anyOtherInformationOnResultsInclTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherInformationOnResultsInclTables }
     *     
     */
    public void setAnyOtherInformationOnResultsInclTables(AnyOtherInformationOnResultsInclTables value) {
        this.anyOtherInformationOnResultsInclTables = value;
    }

}
