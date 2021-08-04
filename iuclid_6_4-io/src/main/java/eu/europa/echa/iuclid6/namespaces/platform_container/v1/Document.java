
package eu.europa.echa.iuclid6.namespaces.platform_container.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.europa.echa.iuclid6.namespaces.platform_attachment.v1.Attachment;
import eu.europa.echa.iuclid6.namespaces.platform_modification_history.v1.Modification;


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
 *         &lt;element name="PlatformMetadata">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}iuclidVersion" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}documentKey" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}documentType" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}definitionVersion" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}creationDate" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}lastModificationDate" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}name" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}documentSubType" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}parentDocumentKey" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}orderInSectionNo" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}submissionType" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}submissionTypeVersion" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}submittingLegalEntity" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}dossierSubject" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}i5Origin" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}creationTool" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}snapshotCreationTool" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Content">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any namespace='##other' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attachments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1}Attachment" minOccurs="0"/>
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1}AttachmentRef" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ModificationHistory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-modification-history/v1}Modification" minOccurs="0"/>
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
    "platformMetadata",
    "content",
    "attachments",
    "modificationHistory"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "PlatformMetadata", required = true)
    protected Document.PlatformMetadata platformMetadata;
    @XmlElement(name = "Content", required = true)
    protected Document.Content content;
    @XmlElement(name = "Attachments", required = true, nillable = true)
    protected Document.Attachments attachments;
    @XmlElement(name = "ModificationHistory", required = true, nillable = true)
    protected Document.ModificationHistory modificationHistory;

    /**
     * Gets the value of the platformMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link Document.PlatformMetadata }
     *     
     */
    public Document.PlatformMetadata getPlatformMetadata() {
        return platformMetadata;
    }

    /**
     * Sets the value of the platformMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.PlatformMetadata }
     *     
     */
    public void setPlatformMetadata(Document.PlatformMetadata value) {
        this.platformMetadata = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Document.Content }
     *     
     */
    public Document.Content getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Content }
     *     
     */
    public void setContent(Document.Content value) {
        this.content = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Document.Attachments }
     *     
     */
    public Document.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Attachments }
     *     
     */
    public void setAttachments(Document.Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the modificationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Document.ModificationHistory }
     *     
     */
    public Document.ModificationHistory getModificationHistory() {
        return modificationHistory;
    }

    /**
     * Sets the value of the modificationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.ModificationHistory }
     *     
     */
    public void setModificationHistory(Document.ModificationHistory value) {
        this.modificationHistory = value;
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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1}Attachment" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1}AttachmentRef" minOccurs="0"/>
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
        "attachmentAndAttachmentRef"
    })
    public static class Attachments {

        @XmlElements({
            @XmlElement(name = "Attachment", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1", type = Attachment.class),
            @XmlElement(name = "AttachmentRef", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1", type = String.class)
        })
        protected List<Object> attachmentAndAttachmentRef;

        /**
         * Gets the value of the attachmentAndAttachmentRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachmentAndAttachmentRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachmentAndAttachmentRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Attachment }
         * {@link String }
         * 
         * 
         */
        public List<Object> getAttachmentAndAttachmentRef() {
            if (attachmentAndAttachmentRef == null) {
                attachmentAndAttachmentRef = new ArrayList<Object>();
            }
            return this.attachmentAndAttachmentRef;
        }

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
     *         &lt;any namespace='##other' minOccurs="0"/>
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
        "any"
    })
    public static class Content {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-modification-history/v1}Modification" minOccurs="0"/>
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
        "modification"
    })
    public static class ModificationHistory {

        @XmlElement(name = "Modification", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-modification-history/v1")
        protected List<Modification> modification;

        /**
         * Gets the value of the modification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Modification }
         * 
         * 
         */
        public List<Modification> getModification() {
            if (modification == null) {
                modification = new ArrayList<Modification>();
            }
            return this.modification;
        }

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
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}iuclidVersion" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}documentKey" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}documentType" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}definitionVersion" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}creationDate" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}lastModificationDate" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}name" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}documentSubType" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}parentDocumentKey" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}orderInSectionNo" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}submissionType" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}submissionTypeVersion" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}submittingLegalEntity" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}dossierSubject" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}i5Origin" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}creationTool" minOccurs="0"/>
     *         &lt;element ref="{http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1}snapshotCreationTool" minOccurs="0"/>
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
        "iuclidVersionAndDocumentKeyAndDocumentType"
    })
    public static class PlatformMetadata {

        @XmlElementRefs({
            @XmlElementRef(name = "submissionType", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "documentSubType", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "iuclidVersion", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "creationDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "name", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dossierSubject", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "definitionVersion", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "documentKey", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "parentDocumentKey", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "submittingLegalEntity", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "documentType", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "lastModificationDate", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "submissionTypeVersion", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "snapshotCreationTool", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "i5Origin", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "creationTool", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "orderInSectionNo", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> iuclidVersionAndDocumentKeyAndDocumentType;

        /**
         * Gets the value of the iuclidVersionAndDocumentKeyAndDocumentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the iuclidVersionAndDocumentKeyAndDocumentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIuclidVersionAndDocumentKeyAndDocumentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getIuclidVersionAndDocumentKeyAndDocumentType() {
            if (iuclidVersionAndDocumentKeyAndDocumentType == null) {
                iuclidVersionAndDocumentKeyAndDocumentType = new ArrayList<JAXBElement<?>>();
            }
            return this.iuclidVersionAndDocumentKeyAndDocumentType;
        }

    }

}
