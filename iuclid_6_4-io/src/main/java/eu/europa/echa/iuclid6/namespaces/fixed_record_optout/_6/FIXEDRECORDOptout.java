
package eu.europa.echa.iuclid6.namespaces.fixed_record_optout._6;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DocumentReferenceMultipleField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


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
 *         &lt;element name="OptoutBlock" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                           &lt;sequence>
 *                             &lt;element name="Documents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
 *                             &lt;element name="Justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
    "optoutBlock"
})
@XmlRootElement(name = "FIXED_RECORD.Optout")
public class FIXEDRECORDOptout {

    @XmlElement(name = "OptoutBlock")
    protected FIXEDRECORDOptout.OptoutBlock optoutBlock;

    /**
     * Gets the value of the optoutBlock property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDOptout.OptoutBlock }
     *     
     */
    public FIXEDRECORDOptout.OptoutBlock getOptoutBlock() {
        return optoutBlock;
    }

    /**
     * Sets the value of the optoutBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDOptout.OptoutBlock }
     *     
     */
    public void setOptoutBlock(FIXEDRECORDOptout.OptoutBlock value) {
        this.optoutBlock = value;
    }


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
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                 &lt;sequence>
     *                   &lt;element name="Documents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
     *                   &lt;element name="Justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "entry"
    })
    public static class OptoutBlock {

        protected List<FIXEDRECORDOptout.OptoutBlock.Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FIXEDRECORDOptout.OptoutBlock.Entry }
         * 
         * 
         */
        public List<FIXEDRECORDOptout.OptoutBlock.Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<FIXEDRECORDOptout.OptoutBlock.Entry>();
            }
            return this.entry;
        }


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
         *         &lt;element name="Documents" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceMultipleField" minOccurs="0"/>
         *         &lt;element name="Justification" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
            "documents",
            "justification"
        })
        public static class Entry
            extends RepeatableEntryType
        {

            @XmlElement(name = "Documents")
            protected DocumentReferenceMultipleField documents;
            @XmlElement(name = "Justification")
            protected List<MultilingualTextFieldLarge> justification;

            /**
             * Gets the value of the documents property.
             * 
             * @return
             *     possible object is
             *     {@link DocumentReferenceMultipleField }
             *     
             */
            public DocumentReferenceMultipleField getDocuments() {
                return documents;
            }

            /**
             * Sets the value of the documents property.
             * 
             * @param value
             *     allowed object is
             *     {@link DocumentReferenceMultipleField }
             *     
             */
            public void setDocuments(DocumentReferenceMultipleField value) {
                this.documents = value;
            }

            /**
             * Gets the value of the justification property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the justification property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJustification().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MultilingualTextFieldLarge }
             * 
             * 
             */
            public List<MultilingualTextFieldLarge> getJustification() {
                if (justification == null) {
                    justification = new ArrayList<MultilingualTextFieldLarge>();
                }
                return this.justification;
            }

        }

    }

}
