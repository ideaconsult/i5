
package eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *       &lt;sequence>
 *         &lt;element name="ReplicateNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Retention" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *         &lt;element name="RetentionStddev" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}numericField"/>
 *         &lt;element name="RetentionRemarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "replicateNumber",
    "retention",
    "retentionStddev",
    "retentionRemarks"
})
public class RetentionEntry
    extends RepeatableEntryType
{

    @XmlElement(name = "ReplicateNumber", required = true, nillable = true)
    protected BigInteger replicateNumber;
    @XmlElement(name = "Retention", required = true)
    protected PhysicalQuantityRangeField retention;
    @XmlElement(name = "RetentionStddev", required = true, nillable = true)
    protected BigDecimal retentionStddev;
    @XmlElement(name = "RetentionRemarks", required = true)
    protected String retentionRemarks;

    /**
     * Gets the value of the replicateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReplicateNumber() {
        return replicateNumber;
    }

    /**
     * Sets the value of the replicateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReplicateNumber(BigInteger value) {
        this.replicateNumber = value;
    }

    /**
     * Gets the value of the retention property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public PhysicalQuantityRangeField getRetention() {
        return retention;
    }

    /**
     * Sets the value of the retention property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantityRangeField }
     *     
     */
    public void setRetention(PhysicalQuantityRangeField value) {
        this.retention = value;
    }

    /**
     * Gets the value of the retentionStddev property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRetentionStddev() {
        return retentionStddev;
    }

    /**
     * Sets the value of the retentionStddev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRetentionStddev(BigDecimal value) {
        this.retentionStddev = value;
    }

    /**
     * Gets the value of the retentionRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetentionRemarks() {
        return retentionRemarks;
    }

    /**
     * Sets the value of the retentionRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetentionRemarks(String value) {
        this.retentionRemarks = value;
    }

}
