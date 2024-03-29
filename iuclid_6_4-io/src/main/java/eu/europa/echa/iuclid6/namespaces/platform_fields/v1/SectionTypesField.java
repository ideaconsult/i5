
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the content of the section types field under Category document
 * 
 * <p>Java class for sectionTypesField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sectionTypesField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDefinitionIdentifier" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="documentSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "sectionTypesField", propOrder = {
    "documentDefinitionIdentifier"
})
public class SectionTypesField {

    protected List<SectionTypesField.DocumentDefinitionIdentifier> documentDefinitionIdentifier;

    /**
     * Gets the value of the documentDefinitionIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentDefinitionIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentDefinitionIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionTypesField.DocumentDefinitionIdentifier }
     * 
     * 
     */
    public List<SectionTypesField.DocumentDefinitionIdentifier> getDocumentDefinitionIdentifier() {
        if (documentDefinitionIdentifier == null) {
            documentDefinitionIdentifier = new ArrayList<SectionTypesField.DocumentDefinitionIdentifier>();
        }
        return this.documentDefinitionIdentifier;
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
     *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="documentSubType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "documentType",
        "documentSubType"
    })
    public static class DocumentDefinitionIdentifier {

        @XmlElement(required = true)
        protected String documentType;
        @XmlElement(required = true)
        protected String documentSubType;

        /**
         * Gets the value of the documentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentType() {
            return documentType;
        }

        /**
         * Sets the value of the documentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentType(String value) {
            this.documentType = value;
        }

        /**
         * Gets the value of the documentSubType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentSubType() {
            return documentSubType;
        }

        /**
         * Sets the value of the documentSubType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentSubType(String value) {
            this.documentSubType = value;
        }

    }

}
