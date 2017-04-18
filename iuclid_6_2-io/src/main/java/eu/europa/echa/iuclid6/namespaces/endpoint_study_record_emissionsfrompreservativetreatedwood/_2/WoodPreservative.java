
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2;

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
 *         &lt;element name="SupplierPreserv" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="TypeFormulation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Preservative" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="ActiveIngredients" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *         &lt;element name="Composition" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Coformulants" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *         &lt;element name="Retention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
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
    "supplierPreserv",
    "typeFormulation",
    "preservative",
    "activeIngredients",
    "composition",
    "coformulants",
    "retention"
})
public class WoodPreservative {

    @XmlElement(name = "SupplierPreserv", required = true)
    protected String supplierPreserv;
    @XmlElement(name = "TypeFormulation", required = true)
    protected PicklistField typeFormulation;
    @XmlElement(name = "Preservative", required = true)
    protected PicklistField preservative;
    @XmlElement(name = "ActiveIngredients", required = true)
    protected PicklistField activeIngredients;
    @XmlElement(name = "Composition", required = true)
    protected String composition;
    @XmlElement(name = "Coformulants", required = true)
    protected String coformulants;
    @XmlElement(name = "Retention", required = true)
    protected PicklistFieldWithSmallTextRemarks retention;

    /**
     * Gets the value of the supplierPreserv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierPreserv() {
        return supplierPreserv;
    }

    /**
     * Sets the value of the supplierPreserv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierPreserv(String value) {
        this.supplierPreserv = value;
    }

    /**
     * Gets the value of the typeFormulation property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getTypeFormulation() {
        return typeFormulation;
    }

    /**
     * Sets the value of the typeFormulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setTypeFormulation(PicklistField value) {
        this.typeFormulation = value;
    }

    /**
     * Gets the value of the preservative property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getPreservative() {
        return preservative;
    }

    /**
     * Sets the value of the preservative property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setPreservative(PicklistField value) {
        this.preservative = value;
    }

    /**
     * Gets the value of the activeIngredients property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistField }
     *     
     */
    public PicklistField getActiveIngredients() {
        return activeIngredients;
    }

    /**
     * Sets the value of the activeIngredients property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistField }
     *     
     */
    public void setActiveIngredients(PicklistField value) {
        this.activeIngredients = value;
    }

    /**
     * Gets the value of the composition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComposition() {
        return composition;
    }

    /**
     * Sets the value of the composition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComposition(String value) {
        this.composition = value;
    }

    /**
     * Gets the value of the coformulants property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoformulants() {
        return coformulants;
    }

    /**
     * Sets the value of the coformulants property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoformulants(String value) {
        this.coformulants = value;
    }

    /**
     * Gets the value of the retention property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getRetention() {
        return retention;
    }

    /**
     * Sets the value of the retention property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setRetention(PicklistFieldWithSmallTextRemarks value) {
        this.retention = value;
    }

}
