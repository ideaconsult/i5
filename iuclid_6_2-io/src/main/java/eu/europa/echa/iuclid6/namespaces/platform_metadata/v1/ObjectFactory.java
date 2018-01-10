
package eu.europa.echa.iuclid6.namespaces.platform_metadata.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.platform_metadata.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Name_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "name");
    private final static QName _SubmittingLegalEntity_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "submittingLegalEntity");
    private final static QName _I5Origin_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "i5Origin");
    private final static QName _CreationTool_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "creationTool");
    private final static QName _SubmissionType_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "submissionType");
    private final static QName _LastModificationDate_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "lastModificationDate");
    private final static QName _SnapshotCreationTool_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "snapshotCreationTool");
    private final static QName _OrderInSectionNo_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "orderInSectionNo");
    private final static QName _DefinitionVersion_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "definitionVersion");
    private final static QName _DocumentKey_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "documentKey");
    private final static QName _SubmissionTypeVersion_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "submissionTypeVersion");
    private final static QName _CreationDate_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "creationDate");
    private final static QName _ParentDocumentKey_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "parentDocumentKey");
    private final static QName _DocumentSubType_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "documentSubType");
    private final static QName _DocumentType_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "documentType");
    private final static QName _DossierSubject_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "dossierSubject");
    private final static QName _IuclidVersion_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", "iuclidVersion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.platform_metadata.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "submittingLegalEntity")
    public JAXBElement<String> createSubmittingLegalEntity(String value) {
        return new JAXBElement<String>(_SubmittingLegalEntity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "i5Origin")
    public JAXBElement<Boolean> createI5Origin(Boolean value) {
        return new JAXBElement<Boolean>(_I5Origin_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "creationTool")
    public JAXBElement<String> createCreationTool(String value) {
        return new JAXBElement<String>(_CreationTool_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "submissionType")
    public JAXBElement<String> createSubmissionType(String value) {
        return new JAXBElement<String>(_SubmissionType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "lastModificationDate")
    public JAXBElement<XMLGregorianCalendar> createLastModificationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastModificationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "snapshotCreationTool")
    public JAXBElement<String> createSnapshotCreationTool(String value) {
        return new JAXBElement<String>(_SnapshotCreationTool_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "orderInSectionNo")
    public JAXBElement<String> createOrderInSectionNo(String value) {
        return new JAXBElement<String>(_OrderInSectionNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "definitionVersion")
    public JAXBElement<String> createDefinitionVersion(String value) {
        return new JAXBElement<String>(_DefinitionVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "documentKey")
    public JAXBElement<String> createDocumentKey(String value) {
        return new JAXBElement<String>(_DocumentKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "submissionTypeVersion")
    public JAXBElement<String> createSubmissionTypeVersion(String value) {
        return new JAXBElement<String>(_SubmissionTypeVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "creationDate")
    public JAXBElement<XMLGregorianCalendar> createCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "parentDocumentKey")
    public JAXBElement<String> createParentDocumentKey(String value) {
        return new JAXBElement<String>(_ParentDocumentKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "documentSubType")
    public JAXBElement<String> createDocumentSubType(String value) {
        return new JAXBElement<String>(_DocumentSubType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "documentType")
    public JAXBElement<String> createDocumentType(String value) {
        return new JAXBElement<String>(_DocumentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "dossierSubject")
    public JAXBElement<String> createDossierSubject(String value) {
        return new JAXBElement<String>(_DossierSubject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-metadata/v1", name = "iuclidVersion")
    public JAXBElement<String> createIuclidVersion(String value) {
        return new JAXBElement<String>(_IuclidVersion_QNAME, String.class, null, value);
    }

}
