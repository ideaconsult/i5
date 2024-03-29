
package eu.europa.echa.iuclid6.namespaces.contact._6;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.contact._6 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.contact._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CONTACT }
     * 
     */
    public CONTACT createCONTACT() {
        return new CONTACT();
    }

    /**
     * Create an instance of {@link CONTACT.GeneralInfo }
     * 
     */
    public CONTACT.GeneralInfo createCONTACTGeneralInfo() {
        return new CONTACT.GeneralInfo();
    }

    /**
     * Create an instance of {@link CONTACT.GeneralInfo.ContactType }
     * 
     */
    public CONTACT.GeneralInfo.ContactType createCONTACTGeneralInfoContactType() {
        return new CONTACT.GeneralInfo.ContactType();
    }

    /**
     * Create an instance of {@link CONTACT.GeneralInfo.Country }
     * 
     */
    public CONTACT.GeneralInfo.Country createCONTACTGeneralInfoCountry() {
        return new CONTACT.GeneralInfo.Country();
    }

}
