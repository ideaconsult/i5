
package eu.europa.echa.iuclid6.namespaces.platform_attachment.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.platform_attachment.v1 package. 
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

    private final static QName _AttachmentRef_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1", "AttachmentRef");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.platform_attachment.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Attachment.Content }
     * 
     */
    public Attachment.Content createAttachmentContent() {
        return new Attachment.Content();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-attachment/v1", name = "AttachmentRef")
    public JAXBElement<String> createAttachmentRef(String value) {
        return new JAXBElement<String>(_AttachmentRef_QNAME, String.class, null, value);
    }

}
