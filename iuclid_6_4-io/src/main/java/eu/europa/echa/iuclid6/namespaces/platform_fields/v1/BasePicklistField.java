
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An empty complex type that is extended by the picklist fields which are defined inline in the auto-generated document xsds. 
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * The picklist fields contain the following elements:
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;value&lt;/li&gt;&lt;li&gt;other&lt;/li&gt;&lt;li&gt;remarks&lt;/li&gt;&lt;/ul&gt;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns="http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;li&gt;restrict the eligible phrase codes per picklist field&lt;/li&gt;&lt;li&gt;conditionally define or omit the "other" element based on the configured phrasegroup (open, close)&lt;/li&gt;&lt;li&gt;based on the picklist definition, properly define the multilingual behavior of the textual elements "other" and "remarks" elements &lt;/li&gt;&lt;li&gt;based on the picklist definition, properly define the length restriction of the "remarks" elements &lt;/li&gt;&lt;/ul&gt;
 * </pre>
 * 
 * 
 * <p>Java class for basePicklistField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basePicklistField">
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
@XmlType(name = "basePicklistField")
@XmlSeeAlso({
    eu.europa.echa.iuclid6.namespaces.test_material_information._6.TESTMATERIALINFORMATION.Composition.CompositionList.Entry.Type.class,
    eu.europa.echa.iuclid6.namespaces.test_material_information._6.TESTMATERIALINFORMATION.Composition.CompositionPurityOtherInformation.class,
    eu.europa.echa.iuclid6.namespaces.test_material_information._6.TESTMATERIALINFORMATION.Composition.OtherCharacteristics.TestMaterialForm.class
})
public class BasePicklistField {


}
