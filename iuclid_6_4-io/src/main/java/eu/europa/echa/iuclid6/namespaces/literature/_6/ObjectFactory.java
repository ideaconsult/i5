
package eu.europa.echa.iuclid6.namespaces.literature._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.europa.echa.iuclid6.namespaces.literature._6 package. 
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

    private final static QName _LITERATUREGeneralInfoReferenceYear_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/LITERATURE/6.0", "ReferenceYear");
    private final static QName _LITERATUREGeneralInfoReportDate_QNAME = new QName("http://iuclid6.echa.europa.eu/namespaces/LITERATURE/6.0", "ReportDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.europa.echa.iuclid6.namespaces.literature._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LITERATURE }
     * 
     */
    public LITERATURE createLITERATURE() {
        return new LITERATURE();
    }

    /**
     * Create an instance of {@link LITERATURE.GeneralInfo }
     * 
     */
    public LITERATURE.GeneralInfo createLITERATUREGeneralInfo() {
        return new LITERATURE.GeneralInfo();
    }

    /**
     * Create an instance of {@link LITERATURE.GeneralInfo.StudyIdentifiers }
     * 
     */
    public LITERATURE.GeneralInfo.StudyIdentifiers createLITERATUREGeneralInfoStudyIdentifiers() {
        return new LITERATURE.GeneralInfo.StudyIdentifiers();
    }

    /**
     * Create an instance of {@link LITERATURE.GeneralInfo.LiteratureType }
     * 
     */
    public LITERATURE.GeneralInfo.LiteratureType createLITERATUREGeneralInfoLiteratureType() {
        return new LITERATURE.GeneralInfo.LiteratureType();
    }

    /**
     * Create an instance of {@link LITERATURE.GeneralInfo.StudyIdentifiers.Entry }
     * 
     */
    public LITERATURE.GeneralInfo.StudyIdentifiers.Entry createLITERATUREGeneralInfoStudyIdentifiersEntry() {
        return new LITERATURE.GeneralInfo.StudyIdentifiers.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/LITERATURE/6.0", name = "ReferenceYear", scope = LITERATURE.GeneralInfo.class)
    public JAXBElement<Integer> createLITERATUREGeneralInfoReferenceYear(Integer value) {
        return new JAXBElement<Integer>(_LITERATUREGeneralInfoReferenceYear_QNAME, Integer.class, LITERATURE.GeneralInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iuclid6.echa.europa.eu/namespaces/LITERATURE/6.0", name = "ReportDate", scope = LITERATURE.GeneralInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLITERATUREGeneralInfoReportDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LITERATUREGeneralInfoReportDate_QNAME, XMLGregorianCalendar.class, LITERATURE.GeneralInfo.class, value);
    }

}
