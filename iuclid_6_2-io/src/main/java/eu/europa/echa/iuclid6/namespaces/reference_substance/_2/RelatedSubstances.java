
package eu.europa.echa.iuclid6.namespaces.reference_substance._2;

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
 *         &lt;element name="IdentifiersOfRelatedSubstances">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="RelatedSubstances">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Identifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                                 &lt;element name="Identity" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                                                 &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Relation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
 *         &lt;element name="GroupCategoryInfo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "identifiersOfRelatedSubstances",
    "groupCategoryInfo"
})
public class RelatedSubstances {

    @XmlElement(name = "IdentifiersOfRelatedSubstances", required = true)
    protected IdentifiersOfRelatedSubstances identifiersOfRelatedSubstances;
    @XmlElement(name = "GroupCategoryInfo", required = true)
    protected String groupCategoryInfo;

    /**
     * Gets the value of the identifiersOfRelatedSubstances property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiersOfRelatedSubstances }
     *     
     */
    public IdentifiersOfRelatedSubstances getIdentifiersOfRelatedSubstances() {
        return identifiersOfRelatedSubstances;
    }

    /**
     * Sets the value of the identifiersOfRelatedSubstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiersOfRelatedSubstances }
     *     
     */
    public void setIdentifiersOfRelatedSubstances(IdentifiersOfRelatedSubstances value) {
        this.identifiersOfRelatedSubstances = value;
    }

    /**
     * Gets the value of the groupCategoryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCategoryInfo() {
        return groupCategoryInfo;
    }

    /**
     * Sets the value of the groupCategoryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCategoryInfo(String value) {
        this.groupCategoryInfo = value;
    }

}
