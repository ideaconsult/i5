//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 11:05:16 PM EET 
//


package eu.europa.echa.schemas.iuclid5._20130101.studyrecord.EC_SEDIMENTDWELLINGTOX_SECTION;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="documentTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LegalEntity"/>
 *     &lt;enumeration value="Substance"/>
 *     &lt;enumeration value="Dossier"/>
 *     &lt;enumeration value="DossierRecreationInfo"/>
 *     &lt;enumeration value="Annotation"/>
 *     &lt;enumeration value="Category"/>
 *     &lt;enumeration value="Mixture"/>
 *     &lt;enumeration value="ReferenceSubstance"/>
 *     &lt;enumeration value="Template"/>
 *     &lt;enumeration value="AttachmentDocument"/>
 *     &lt;enumeration value="EndpointStudyRecord"/>
 *     &lt;enumeration value="EndpointSummary"/>
 *     &lt;enumeration value="EndpointRecord"/>
 *     &lt;enumeration value="Site"/>
 *     &lt;enumeration value="DocumentReferenceGroup"/>
 *     &lt;enumeration value="ExtendedAttribute"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "documentTypeType")
@XmlEnum
public enum DocumentTypeType {

    @XmlEnumValue("LegalEntity")
    LEGAL_ENTITY("LegalEntity"),
    @XmlEnumValue("Substance")
    SUBSTANCE("Substance"),
    @XmlEnumValue("Dossier")
    DOSSIER("Dossier"),
    @XmlEnumValue("DossierRecreationInfo")
    DOSSIER_RECREATION_INFO("DossierRecreationInfo"),
    @XmlEnumValue("Annotation")
    ANNOTATION("Annotation"),
    @XmlEnumValue("Category")
    CATEGORY("Category"),
    @XmlEnumValue("Mixture")
    MIXTURE("Mixture"),
    @XmlEnumValue("ReferenceSubstance")
    REFERENCE_SUBSTANCE("ReferenceSubstance"),
    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    @XmlEnumValue("AttachmentDocument")
    ATTACHMENT_DOCUMENT("AttachmentDocument"),
    @XmlEnumValue("EndpointStudyRecord")
    ENDPOINT_STUDY_RECORD("EndpointStudyRecord"),
    @XmlEnumValue("EndpointSummary")
    ENDPOINT_SUMMARY("EndpointSummary"),
    @XmlEnumValue("EndpointRecord")
    ENDPOINT_RECORD("EndpointRecord"),
    @XmlEnumValue("Site")
    SITE("Site"),
    @XmlEnumValue("DocumentReferenceGroup")
    DOCUMENT_REFERENCE_GROUP("DocumentReferenceGroup"),
    @XmlEnumValue("ExtendedAttribute")
    EXTENDED_ATTRIBUTE("ExtendedAttribute");
    private final String value;

    DocumentTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentTypeType fromValue(String v) {
        for (DocumentTypeType c: DocumentTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
