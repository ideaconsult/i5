
package eu.europa.echa.iuclid6.namespaces.flexible_record_productresearchdevelopment._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.flexible_record_productresearchdevelopment._6 package. 
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

    private final static QName _FLEXIBLERECORDProductResearchDevelopmentForHumanVeterinaryUse_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-ProductResearchDevelopment/6.0", "ForHumanVeterinaryUse");
    private final static QName _FLEXIBLERECORDProductResearchDevelopmentNotPlacedOnMarket_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-ProductResearchDevelopment/6.0", "NotPlacedOnMarket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.flexible_record_productresearchdevelopment._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FLEXIBLERECORDProductResearchDevelopment }
     * 
     */
    public FLEXIBLERECORDProductResearchDevelopment createFLEXIBLERECORDProductResearchDevelopment() {
        return new FLEXIBLERECORDProductResearchDevelopment();
    }

    /**
     * Create an instance of {@link FLEXIBLERECORDProductResearchDevelopment.DataProtection }
     * 
     */
    public FLEXIBLERECORDProductResearchDevelopment.DataProtection createFLEXIBLERECORDProductResearchDevelopmentDataProtection() {
        return new FLEXIBLERECORDProductResearchDevelopment.DataProtection();
    }

    /**
     * Create an instance of {@link FLEXIBLERECORDProductResearchDevelopment.EstimatedQuantity }
     * 
     */
    public FLEXIBLERECORDProductResearchDevelopment.EstimatedQuantity createFLEXIBLERECORDProductResearchDevelopmentEstimatedQuantity() {
        return new FLEXIBLERECORDProductResearchDevelopment.EstimatedQuantity();
    }

    /**
     * Create an instance of {@link FLEXIBLERECORDProductResearchDevelopment.DataProtection.Legislation }
     * 
     */
    public FLEXIBLERECORDProductResearchDevelopment.DataProtection.Legislation createFLEXIBLERECORDProductResearchDevelopmentDataProtectionLegislation() {
        return new FLEXIBLERECORDProductResearchDevelopment.DataProtection.Legislation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-ProductResearchDevelopment/6.0", name = "ForHumanVeterinaryUse", scope = FLEXIBLERECORDProductResearchDevelopment.class)
    public JAXBElement<Boolean> createFLEXIBLERECORDProductResearchDevelopmentForHumanVeterinaryUse(Boolean value) {
        return new JAXBElement<Boolean>(_FLEXIBLERECORDProductResearchDevelopmentForHumanVeterinaryUse_QNAME, Boolean.class, FLEXIBLERECORDProductResearchDevelopment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/FLEXIBLE_RECORD-ProductResearchDevelopment/6.0", name = "NotPlacedOnMarket", scope = FLEXIBLERECORDProductResearchDevelopment.class)
    public JAXBElement<Boolean> createFLEXIBLERECORDProductResearchDevelopmentNotPlacedOnMarket(Boolean value) {
        return new JAXBElement<Boolean>(_FLEXIBLERECORDProductResearchDevelopmentNotPlacedOnMarket_QNAME, Boolean.class, FLEXIBLERECORDProductResearchDevelopment.class, value);
    }

}