
package eu.europa.echa.iuclid6.namespaces.fixed_record_assessmentapproach._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextField;


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
 *         &lt;element name="Approach" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApproachPublic" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextField" maxOccurs="unbounded" minOccurs="0"/>
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
    "approach",
    "approachPublic"
})
@XmlRootElement(name = "FIXED_RECORD.AssessmentApproach")
public class FIXEDRECORDAssessmentApproach {

    @XmlElement(name = "Approach")
    protected List<MultilingualTextField> approach;
    @XmlElement(name = "ApproachPublic")
    protected List<MultilingualTextField> approachPublic;

    /**
     * Gets the value of the approach property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approach property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproach().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextField }
     * 
     * 
     */
    public List<MultilingualTextField> getApproach() {
        if (approach == null) {
            approach = new ArrayList<MultilingualTextField>();
        }
        return this.approach;
    }

    /**
     * Gets the value of the approachPublic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approachPublic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproachPublic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualTextField }
     * 
     * 
     */
    public List<MultilingualTextField> getApproachPublic() {
        if (approachPublic == null) {
            approachPublic = new ArrayList<MultilingualTextField>();
        }
        return this.approachPublic;
    }

}
