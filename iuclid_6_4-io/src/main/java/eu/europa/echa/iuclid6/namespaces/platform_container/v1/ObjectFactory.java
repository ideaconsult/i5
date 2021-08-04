
package eu.europa.echa.iuclid6.namespaces.platform_container.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.platform_container.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.platform_container.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Document.PlatformMetadata }
     * 
     */
    public Document.PlatformMetadata createDocumentPlatformMetadata() {
        return new Document.PlatformMetadata();
    }

    /**
     * Create an instance of {@link Document.Content }
     * 
     */
    public Document.Content createDocumentContent() {
        return new Document.Content();
    }

    /**
     * Create an instance of {@link Document.Attachments }
     * 
     */
    public Document.Attachments createDocumentAttachments() {
        return new Document.Attachments();
    }

    /**
     * Create an instance of {@link Document.ModificationHistory }
     * 
     */
    public Document.ModificationHistory createDocumentModificationHistory() {
        return new Document.ModificationHistory();
    }

}
