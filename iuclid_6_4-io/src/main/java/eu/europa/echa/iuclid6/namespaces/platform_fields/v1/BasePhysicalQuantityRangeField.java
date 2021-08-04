
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An empty complex type that is extended by the physical quantity range fields which are defined inline in the auto-generated document xsds. 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * The physical quantity range fields contain the following elements:
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;unitCode&lt;/li&gt;&lt;li&gt;unitOther&lt;/li&gt;&lt;li&gt;lowerQualifier&lt;/li&gt;&lt;li&gt;upperQualifier&lt;/li&gt;&lt;li&gt;lowerValue&lt;/li&gt;&lt;li&gt;upperValue&lt;/li&gt;&lt;li&gt;qualifier: in case of half-bounded&lt;/li&gt;&lt;li&gt;value: in case of half-bounded&lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * The inline definition of the fields take place in order to:
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;restrict the eligible phrase codes for the "unitCode" element&lt;/li&gt;&lt;li&gt;conditionally define or omit the "unitOther" element based on the configured phrasegroup (open, close)&lt;/li&gt;&lt;li&gt;based on the field definition, properly define the multilingual behavior of the textual "unitOther" element&lt;/li&gt;&lt;li&gt;based on the field definition, dynamically setup the bounded- or half-boudnded-related elements&lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * 
 * <p>Java class for basePhysicalQuantityRangeField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basePhysicalQuantityRangeField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basePhysicalQuantityRangeField")
@XmlSeeAlso({
    eu.europa.echa.iuclid6.namespaces.test_material_information._6.TESTMATERIALINFORMATION.Composition.CompositionList.Entry.Concentration.class
})
public class BasePhysicalQuantityRangeField {


}
