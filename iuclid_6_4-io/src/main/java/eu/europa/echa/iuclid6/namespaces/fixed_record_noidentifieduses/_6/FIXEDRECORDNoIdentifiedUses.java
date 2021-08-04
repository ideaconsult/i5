
package eu.europa.echa.iuclid6.namespaces.fixed_record_noidentifieduses._6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.BasePicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldLarge;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.MultilingualTextFieldSmall;


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
 *         &lt;element name="JustificationNoIdentified" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD410" minOccurs="0"/>
 *                   &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JustificationForNoExposureAssessment" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
 *                 &lt;sequence>
 *                   &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}PG6_60356" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CumulativeTonnages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CumulativeTonnageForUseAtIndustrialSitesTonnesYear" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                           &lt;sequence>
 *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CumulativeEUTonnageForUsesAtIndustrialSites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="DetailsOnCumulativeTonnageReportedForUseAtIndustrialSites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                           &lt;sequence>
 *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CumulativeEUTonnageForWidespreadUsesByProfessionalWorkers" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="DetailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CumulativeTonnageForConsumerUsesTonnesYear" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                           &lt;sequence>
 *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CumulativeEUTonnageConsumerUses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="DetailsOnCumulativeTonnageReportedForConsumerUses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="CumulativeTonnageForServiceLifeTonnesYear" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
 *                           &lt;sequence>
 *                             &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
 *                             &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
 *                             &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CumulativeEUTonnageForServiceLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
 *                   &lt;element name="DetailsOnCumulativeTonnageReportedForServiceLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OverviewOnUses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
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
    "justificationNoIdentified",
    "justificationForNoExposureAssessment",
    "cumulativeTonnages",
    "overviewOnUses"
})
@XmlRootElement(name = "FIXED_RECORD.NoIdentifiedUses")
public class FIXEDRECORDNoIdentifiedUses {

    @XmlElement(name = "JustificationNoIdentified")
    protected FIXEDRECORDNoIdentifiedUses.JustificationNoIdentified justificationNoIdentified;
    @XmlElement(name = "JustificationForNoExposureAssessment")
    protected List<FIXEDRECORDNoIdentifiedUses.JustificationForNoExposureAssessment> justificationForNoExposureAssessment;
    @XmlElement(name = "CumulativeTonnages")
    protected FIXEDRECORDNoIdentifiedUses.CumulativeTonnages cumulativeTonnages;
    @XmlElement(name = "OverviewOnUses")
    protected FIXEDRECORDNoIdentifiedUses.OverviewOnUses overviewOnUses;

    /**
     * Gets the value of the justificationNoIdentified property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDNoIdentifiedUses.JustificationNoIdentified }
     *     
     */
    public FIXEDRECORDNoIdentifiedUses.JustificationNoIdentified getJustificationNoIdentified() {
        return justificationNoIdentified;
    }

    /**
     * Sets the value of the justificationNoIdentified property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDNoIdentifiedUses.JustificationNoIdentified }
     *     
     */
    public void setJustificationNoIdentified(FIXEDRECORDNoIdentifiedUses.JustificationNoIdentified value) {
        this.justificationNoIdentified = value;
    }

    /**
     * Gets the value of the justificationForNoExposureAssessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the justificationForNoExposureAssessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJustificationForNoExposureAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FIXEDRECORDNoIdentifiedUses.JustificationForNoExposureAssessment }
     * 
     * 
     */
    public List<FIXEDRECORDNoIdentifiedUses.JustificationForNoExposureAssessment> getJustificationForNoExposureAssessment() {
        if (justificationForNoExposureAssessment == null) {
            justificationForNoExposureAssessment = new ArrayList<FIXEDRECORDNoIdentifiedUses.JustificationForNoExposureAssessment>();
        }
        return this.justificationForNoExposureAssessment;
    }

    /**
     * Gets the value of the cumulativeTonnages property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages }
     *     
     */
    public FIXEDRECORDNoIdentifiedUses.CumulativeTonnages getCumulativeTonnages() {
        return cumulativeTonnages;
    }

    /**
     * Sets the value of the cumulativeTonnages property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages }
     *     
     */
    public void setCumulativeTonnages(FIXEDRECORDNoIdentifiedUses.CumulativeTonnages value) {
        this.cumulativeTonnages = value;
    }

    /**
     * Gets the value of the overviewOnUses property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDNoIdentifiedUses.OverviewOnUses }
     *     
     */
    public FIXEDRECORDNoIdentifiedUses.OverviewOnUses getOverviewOnUses() {
        return overviewOnUses;
    }

    /**
     * Sets the value of the overviewOnUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDNoIdentifiedUses.OverviewOnUses }
     *     
     */
    public void setOverviewOnUses(FIXEDRECORDNoIdentifiedUses.OverviewOnUses value) {
        this.overviewOnUses = value;
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
     *         &lt;element name="CumulativeTonnageForUseAtIndustrialSitesTonnesYear" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                 &lt;sequence>
     *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CumulativeEUTonnageForUsesAtIndustrialSites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="DetailsOnCumulativeTonnageReportedForUseAtIndustrialSites" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                 &lt;sequence>
     *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CumulativeEUTonnageForWidespreadUsesByProfessionalWorkers" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="DetailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CumulativeTonnageForConsumerUsesTonnesYear" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                 &lt;sequence>
     *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CumulativeEUTonnageConsumerUses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="DetailsOnCumulativeTonnageReportedForConsumerUses" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="CumulativeTonnageForServiceLifeTonnesYear" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
     *                 &lt;sequence>
     *                   &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
     *                   &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
     *                   &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CumulativeEUTonnageForServiceLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}booleanField" minOccurs="0"/>
     *         &lt;element name="DetailsOnCumulativeTonnageReportedForServiceLife" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldLarge" maxOccurs="unbounded" minOccurs="0"/>
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
        "cumulativeTonnageForUseAtIndustrialSitesTonnesYear",
        "cumulativeEUTonnageForUsesAtIndustrialSites",
        "detailsOnCumulativeTonnageReportedForUseAtIndustrialSites",
        "cumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear",
        "cumulativeEUTonnageForWidespreadUsesByProfessionalWorkers",
        "detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers",
        "cumulativeTonnageForConsumerUsesTonnesYear",
        "cumulativeEUTonnageConsumerUses",
        "detailsOnCumulativeTonnageReportedForConsumerUses",
        "cumulativeTonnageForServiceLifeTonnesYear",
        "cumulativeEUTonnageForServiceLife",
        "detailsOnCumulativeTonnageReportedForServiceLife"
    })
    public static class CumulativeTonnages {

        @XmlElement(name = "CumulativeTonnageForUseAtIndustrialSitesTonnesYear")
        protected FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForUseAtIndustrialSitesTonnesYear cumulativeTonnageForUseAtIndustrialSitesTonnesYear;
        @XmlElementRef(name = "CumulativeEUTonnageForUsesAtIndustrialSites", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-NoIdentifiedUses/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> cumulativeEUTonnageForUsesAtIndustrialSites;
        @XmlElement(name = "DetailsOnCumulativeTonnageReportedForUseAtIndustrialSites")
        protected List<MultilingualTextFieldLarge> detailsOnCumulativeTonnageReportedForUseAtIndustrialSites;
        @XmlElement(name = "CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear")
        protected FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear cumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear;
        @XmlElementRef(name = "CumulativeEUTonnageForWidespreadUsesByProfessionalWorkers", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-NoIdentifiedUses/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> cumulativeEUTonnageForWidespreadUsesByProfessionalWorkers;
        @XmlElement(name = "DetailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers")
        protected List<MultilingualTextFieldLarge> detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers;
        @XmlElement(name = "CumulativeTonnageForConsumerUsesTonnesYear")
        protected FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForConsumerUsesTonnesYear cumulativeTonnageForConsumerUsesTonnesYear;
        @XmlElementRef(name = "CumulativeEUTonnageConsumerUses", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-NoIdentifiedUses/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> cumulativeEUTonnageConsumerUses;
        @XmlElement(name = "DetailsOnCumulativeTonnageReportedForConsumerUses")
        protected List<MultilingualTextFieldLarge> detailsOnCumulativeTonnageReportedForConsumerUses;
        @XmlElement(name = "CumulativeTonnageForServiceLifeTonnesYear")
        protected FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForServiceLifeTonnesYear cumulativeTonnageForServiceLifeTonnesYear;
        @XmlElementRef(name = "CumulativeEUTonnageForServiceLife", namespace = "http://iuclid6.echa.europa.eu/namespaces/FIXED_RECORD-NoIdentifiedUses/6.0", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> cumulativeEUTonnageForServiceLife;
        @XmlElement(name = "DetailsOnCumulativeTonnageReportedForServiceLife")
        protected List<MultilingualTextFieldLarge> detailsOnCumulativeTonnageReportedForServiceLife;

        /**
         * Gets the value of the cumulativeTonnageForUseAtIndustrialSitesTonnesYear property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForUseAtIndustrialSitesTonnesYear }
         *     
         */
        public FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForUseAtIndustrialSitesTonnesYear getCumulativeTonnageForUseAtIndustrialSitesTonnesYear() {
            return cumulativeTonnageForUseAtIndustrialSitesTonnesYear;
        }

        /**
         * Sets the value of the cumulativeTonnageForUseAtIndustrialSitesTonnesYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForUseAtIndustrialSitesTonnesYear }
         *     
         */
        public void setCumulativeTonnageForUseAtIndustrialSitesTonnesYear(FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForUseAtIndustrialSitesTonnesYear value) {
            this.cumulativeTonnageForUseAtIndustrialSitesTonnesYear = value;
        }

        /**
         * Gets the value of the cumulativeEUTonnageForUsesAtIndustrialSites property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getCumulativeEUTonnageForUsesAtIndustrialSites() {
            return cumulativeEUTonnageForUsesAtIndustrialSites;
        }

        /**
         * Sets the value of the cumulativeEUTonnageForUsesAtIndustrialSites property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setCumulativeEUTonnageForUsesAtIndustrialSites(JAXBElement<Boolean> value) {
            this.cumulativeEUTonnageForUsesAtIndustrialSites = value;
        }

        /**
         * Gets the value of the detailsOnCumulativeTonnageReportedForUseAtIndustrialSites property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsOnCumulativeTonnageReportedForUseAtIndustrialSites property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailsOnCumulativeTonnageReportedForUseAtIndustrialSites().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getDetailsOnCumulativeTonnageReportedForUseAtIndustrialSites() {
            if (detailsOnCumulativeTonnageReportedForUseAtIndustrialSites == null) {
                detailsOnCumulativeTonnageReportedForUseAtIndustrialSites = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.detailsOnCumulativeTonnageReportedForUseAtIndustrialSites;
        }

        /**
         * Gets the value of the cumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear }
         *     
         */
        public FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear getCumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear() {
            return cumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear;
        }

        /**
         * Sets the value of the cumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear }
         *     
         */
        public void setCumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear(FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear value) {
            this.cumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear = value;
        }

        /**
         * Gets the value of the cumulativeEUTonnageForWidespreadUsesByProfessionalWorkers property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getCumulativeEUTonnageForWidespreadUsesByProfessionalWorkers() {
            return cumulativeEUTonnageForWidespreadUsesByProfessionalWorkers;
        }

        /**
         * Sets the value of the cumulativeEUTonnageForWidespreadUsesByProfessionalWorkers property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setCumulativeEUTonnageForWidespreadUsesByProfessionalWorkers(JAXBElement<Boolean> value) {
            this.cumulativeEUTonnageForWidespreadUsesByProfessionalWorkers = value;
        }

        /**
         * Gets the value of the detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getDetailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers() {
            if (detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers == null) {
                detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.detailsOnCumulativeTonnageReportedForWidespreadUsesByProfessionalWorkers;
        }

        /**
         * Gets the value of the cumulativeTonnageForConsumerUsesTonnesYear property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForConsumerUsesTonnesYear }
         *     
         */
        public FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForConsumerUsesTonnesYear getCumulativeTonnageForConsumerUsesTonnesYear() {
            return cumulativeTonnageForConsumerUsesTonnesYear;
        }

        /**
         * Sets the value of the cumulativeTonnageForConsumerUsesTonnesYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForConsumerUsesTonnesYear }
         *     
         */
        public void setCumulativeTonnageForConsumerUsesTonnesYear(FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForConsumerUsesTonnesYear value) {
            this.cumulativeTonnageForConsumerUsesTonnesYear = value;
        }

        /**
         * Gets the value of the cumulativeEUTonnageConsumerUses property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getCumulativeEUTonnageConsumerUses() {
            return cumulativeEUTonnageConsumerUses;
        }

        /**
         * Sets the value of the cumulativeEUTonnageConsumerUses property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setCumulativeEUTonnageConsumerUses(JAXBElement<Boolean> value) {
            this.cumulativeEUTonnageConsumerUses = value;
        }

        /**
         * Gets the value of the detailsOnCumulativeTonnageReportedForConsumerUses property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsOnCumulativeTonnageReportedForConsumerUses property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailsOnCumulativeTonnageReportedForConsumerUses().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getDetailsOnCumulativeTonnageReportedForConsumerUses() {
            if (detailsOnCumulativeTonnageReportedForConsumerUses == null) {
                detailsOnCumulativeTonnageReportedForConsumerUses = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.detailsOnCumulativeTonnageReportedForConsumerUses;
        }

        /**
         * Gets the value of the cumulativeTonnageForServiceLifeTonnesYear property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForServiceLifeTonnesYear }
         *     
         */
        public FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForServiceLifeTonnesYear getCumulativeTonnageForServiceLifeTonnesYear() {
            return cumulativeTonnageForServiceLifeTonnesYear;
        }

        /**
         * Sets the value of the cumulativeTonnageForServiceLifeTonnesYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForServiceLifeTonnesYear }
         *     
         */
        public void setCumulativeTonnageForServiceLifeTonnesYear(FIXEDRECORDNoIdentifiedUses.CumulativeTonnages.CumulativeTonnageForServiceLifeTonnesYear value) {
            this.cumulativeTonnageForServiceLifeTonnesYear = value;
        }

        /**
         * Gets the value of the cumulativeEUTonnageForServiceLife property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getCumulativeEUTonnageForServiceLife() {
            return cumulativeEUTonnageForServiceLife;
        }

        /**
         * Sets the value of the cumulativeEUTonnageForServiceLife property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setCumulativeEUTonnageForServiceLife(JAXBElement<Boolean> value) {
            this.cumulativeEUTonnageForServiceLife = value;
        }

        /**
         * Gets the value of the detailsOnCumulativeTonnageReportedForServiceLife property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsOnCumulativeTonnageReportedForServiceLife property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailsOnCumulativeTonnageReportedForServiceLife().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldLarge }
         * 
         * 
         */
        public List<MultilingualTextFieldLarge> getDetailsOnCumulativeTonnageReportedForServiceLife() {
            if (detailsOnCumulativeTonnageReportedForServiceLife == null) {
                detailsOnCumulativeTonnageReportedForServiceLife = new ArrayList<MultilingualTextFieldLarge>();
            }
            return this.detailsOnCumulativeTonnageReportedForServiceLife;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *       &lt;sequence>
         *         &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *         &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *         &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lowerQualifier",
            "upperQualifier",
            "lowerValue",
            "upperValue"
        })
        public static class CumulativeTonnageForConsumerUsesTonnesYear
            extends BasePhysicalQuantityRangeField
        {

            protected String lowerQualifier;
            protected String upperQualifier;
            protected BigDecimal lowerValue;
            protected BigDecimal upperValue;

            /**
             * Gets the value of the lowerQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLowerQualifier() {
                return lowerQualifier;
            }

            /**
             * Sets the value of the lowerQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLowerQualifier(String value) {
                this.lowerQualifier = value;
            }

            /**
             * Gets the value of the upperQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpperQualifier() {
                return upperQualifier;
            }

            /**
             * Sets the value of the upperQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpperQualifier(String value) {
                this.upperQualifier = value;
            }

            /**
             * Gets the value of the lowerValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLowerValue() {
                return lowerValue;
            }

            /**
             * Sets the value of the lowerValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLowerValue(BigDecimal value) {
                this.lowerValue = value;
            }

            /**
             * Gets the value of the upperValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUpperValue() {
                return upperValue;
            }

            /**
             * Sets the value of the upperValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUpperValue(BigDecimal value) {
                this.upperValue = value;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *       &lt;sequence>
         *         &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *         &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *         &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lowerQualifier",
            "upperQualifier",
            "lowerValue",
            "upperValue"
        })
        public static class CumulativeTonnageForServiceLifeTonnesYear
            extends BasePhysicalQuantityRangeField
        {

            protected String lowerQualifier;
            protected String upperQualifier;
            protected BigDecimal lowerValue;
            protected BigDecimal upperValue;

            /**
             * Gets the value of the lowerQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLowerQualifier() {
                return lowerQualifier;
            }

            /**
             * Sets the value of the lowerQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLowerQualifier(String value) {
                this.lowerQualifier = value;
            }

            /**
             * Gets the value of the upperQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpperQualifier() {
                return upperQualifier;
            }

            /**
             * Sets the value of the upperQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpperQualifier(String value) {
                this.upperQualifier = value;
            }

            /**
             * Gets the value of the lowerValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLowerValue() {
                return lowerValue;
            }

            /**
             * Sets the value of the lowerValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLowerValue(BigDecimal value) {
                this.lowerValue = value;
            }

            /**
             * Gets the value of the upperValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUpperValue() {
                return upperValue;
            }

            /**
             * Sets the value of the upperValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUpperValue(BigDecimal value) {
                this.upperValue = value;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *       &lt;sequence>
         *         &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *         &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *         &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lowerQualifier",
            "upperQualifier",
            "lowerValue",
            "upperValue"
        })
        public static class CumulativeTonnageForUseAtIndustrialSitesTonnesYear
            extends BasePhysicalQuantityRangeField
        {

            protected String lowerQualifier;
            protected String upperQualifier;
            protected BigDecimal lowerValue;
            protected BigDecimal upperValue;

            /**
             * Gets the value of the lowerQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLowerQualifier() {
                return lowerQualifier;
            }

            /**
             * Sets the value of the lowerQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLowerQualifier(String value) {
                this.lowerQualifier = value;
            }

            /**
             * Gets the value of the upperQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpperQualifier() {
                return upperQualifier;
            }

            /**
             * Sets the value of the upperQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpperQualifier(String value) {
                this.upperQualifier = value;
            }

            /**
             * Gets the value of the lowerValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLowerValue() {
                return lowerValue;
            }

            /**
             * Sets the value of the lowerValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLowerValue(BigDecimal value) {
                this.lowerValue = value;
            }

            /**
             * Gets the value of the upperValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUpperValue() {
                return upperValue;
            }

            /**
             * Sets the value of the upperValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUpperValue(BigDecimal value) {
                this.upperValue = value;
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
         *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePhysicalQuantityRangeField">
         *       &lt;sequence>
         *         &lt;element name="lowerQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}lowerQualifier" minOccurs="0"/>
         *         &lt;element name="upperQualifier" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}upperQualifier" minOccurs="0"/>
         *         &lt;element name="lowerValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="upperValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "lowerQualifier",
            "upperQualifier",
            "lowerValue",
            "upperValue"
        })
        public static class CumulativeTonnageForWidespreadUsesByProfessionalWorkersTonnesYear
            extends BasePhysicalQuantityRangeField
        {

            protected String lowerQualifier;
            protected String upperQualifier;
            protected BigDecimal lowerValue;
            protected BigDecimal upperValue;

            /**
             * Gets the value of the lowerQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLowerQualifier() {
                return lowerQualifier;
            }

            /**
             * Sets the value of the lowerQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLowerQualifier(String value) {
                this.lowerQualifier = value;
            }

            /**
             * Gets the value of the upperQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpperQualifier() {
                return upperQualifier;
            }

            /**
             * Sets the value of the upperQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpperQualifier(String value) {
                this.upperQualifier = value;
            }

            /**
             * Gets the value of the lowerValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLowerValue() {
                return lowerValue;
            }

            /**
             * Sets the value of the lowerValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLowerValue(BigDecimal value) {
                this.lowerValue = value;
            }

            /**
             * Gets the value of the upperValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getUpperValue() {
                return upperValue;
            }

            /**
             * Sets the value of the upperValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setUpperValue(BigDecimal value) {
                this.upperValue = value;
            }

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
     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *       &lt;sequence>
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}PG6_60356" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class JustificationForNoExposureAssessment
        extends BasePicklistField
    {

        protected String value;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
     *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}basePicklistField">
     *       &lt;sequence>
     *         &lt;element name="value" type="{http://iuclid6.echa.europa.eu/namespaces/core/v6}TD410" minOccurs="0"/>
     *         &lt;element name="other" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}multilingualTextFieldSmall" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value",
        "other"
    })
    public static class JustificationNoIdentified
        extends BasePicklistField
    {

        protected String value;
        protected List<MultilingualTextFieldSmall> other;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the other property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOther().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultilingualTextFieldSmall }
         * 
         * 
         */
        public List<MultilingualTextFieldSmall> getOther() {
            if (other == null) {
                other = new ArrayList<MultilingualTextFieldSmall>();
            }
            return this.other;
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
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OverviewOnUses {


    }

}
