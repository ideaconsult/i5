
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
 *         &lt;element name="ApplicationMethod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *         &lt;element name="TreatFacility" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Registrant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="DetailMethod" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="ApplicationDate" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="FormulaRetention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="ConditionProcedure" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="EndSealant" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="SubsTreat" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
    "applicationMethod",
    "treatFacility",
    "registrant",
    "detailMethod",
    "applicationDate",
    "formulaRetention",
    "conditionProcedure",
    "endSealant",
    "subsTreat"
})
public class Application {

    @XmlElement(name = "ApplicationMethod", required = true)
    protected PicklistFieldWithSmallTextRemarks applicationMethod;
    @XmlElement(name = "TreatFacility", required = true)
    protected String treatFacility;
    @XmlElement(name = "Registrant", required = true)
    protected String registrant;
    @XmlElement(name = "DetailMethod", required = true)
    protected String detailMethod;
    @XmlElement(name = "ApplicationDate", required = true)
    protected String applicationDate;
    @XmlElement(name = "FormulaRetention", required = true)
    protected String formulaRetention;
    @XmlElement(name = "ConditionProcedure", required = true)
    protected String conditionProcedure;
    @XmlElement(name = "EndSealant", required = true)
    protected String endSealant;
    @XmlElement(name = "SubsTreat", required = true)
    protected String subsTreat;

    /**
     * Gets the value of the applicationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public PicklistFieldWithSmallTextRemarks getApplicationMethod() {
        return applicationMethod;
    }

    /**
     * Sets the value of the applicationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PicklistFieldWithSmallTextRemarks }
     *     
     */
    public void setApplicationMethod(PicklistFieldWithSmallTextRemarks value) {
        this.applicationMethod = value;
    }

    /**
     * Gets the value of the treatFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatFacility() {
        return treatFacility;
    }

    /**
     * Sets the value of the treatFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatFacility(String value) {
        this.treatFacility = value;
    }

    /**
     * Gets the value of the registrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrant() {
        return registrant;
    }

    /**
     * Sets the value of the registrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrant(String value) {
        this.registrant = value;
    }

    /**
     * Gets the value of the detailMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailMethod() {
        return detailMethod;
    }

    /**
     * Sets the value of the detailMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailMethod(String value) {
        this.detailMethod = value;
    }

    /**
     * Gets the value of the applicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationDate() {
        return applicationDate;
    }

    /**
     * Sets the value of the applicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationDate(String value) {
        this.applicationDate = value;
    }

    /**
     * Gets the value of the formulaRetention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormulaRetention() {
        return formulaRetention;
    }

    /**
     * Sets the value of the formulaRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormulaRetention(String value) {
        this.formulaRetention = value;
    }

    /**
     * Gets the value of the conditionProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionProcedure() {
        return conditionProcedure;
    }

    /**
     * Sets the value of the conditionProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionProcedure(String value) {
        this.conditionProcedure = value;
    }

    /**
     * Gets the value of the endSealant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndSealant() {
        return endSealant;
    }

    /**
     * Sets the value of the endSealant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSealant(String value) {
        this.endSealant = value;
    }

    /**
     * Gets the value of the subsTreat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsTreat() {
        return subsTreat;
    }

    /**
     * Sets the value of the subsTreat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsTreat(String value) {
        this.subsTreat = value;
    }

}
