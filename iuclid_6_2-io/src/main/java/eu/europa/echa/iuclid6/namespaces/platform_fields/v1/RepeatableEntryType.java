
package eu.europa.echa.iuclid6.namespaces.platform_fields.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.DevelopmentalToxicityEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.EffectLevelsFetusesEfflevelEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.EffectLevelsMaternalAnimalsEfflevelEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.MaternalAbnormalitiesEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.EfficacyPerformanceAssessmentEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.TestTargetOrganismsEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.LoadingConditionsEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.RetentionEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.TestSpecimensEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.WaterSamplesEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsF1Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsF2Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsP0Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.EffectLevelsP1Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.TargetSystemOrganToxicityF1Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.TargetSystemOrganToxicityF2Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.TargetSystemOrganToxicityP0Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.TargetSystemOrganToxicityP1Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.EffectConcentrationsEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.TestOrganismsEntry;


/**
 * <p>Java class for repeatableEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repeatableEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="uuid" use="required" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}uuidAttribute" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repeatableEntryType")
@XmlSeeAlso({
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_neurotoxicity._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.DosesConcentrationsEntry.class,
    EffectLevelsP0Entry.class,
    TargetSystemOrganToxicityP0Entry.class,
    EffectLevelsP1Entry.class,
    TargetSystemOrganToxicityP1Entry.class,
    EffectLevelsF1Entry.class,
    TargetSystemOrganToxicityF1Entry.class,
    EffectLevelsF2Entry.class,
    TargetSystemOrganToxicityF2Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproduction._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.TargetSystemOrganToxicityEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_immunotoxicity._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicitydermal._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.GuidelineEntry.class,
    TestTargetOrganismsEntry.class,
    EfficacyPerformanceAssessmentEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_efficacydata._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicityreproductionother._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.DosesConcentrationsEntry.class,
    EffectLevelsMaternalAnimalsEfflevelEntry.class,
    MaternalAbnormalitiesEntry.class,
    EffectLevelsFetusesEfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.Entry.class,
    DevelopmentalToxicityEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_developmentaltoxicityteratogenicity._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.GuidelineEntry.class,
    TestSpecimensEntry.class,
    WaterSamplesEntry.class,
    LoadingConditionsEntry.class,
    RetentionEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_emissionsfrompreservativetreatedwood._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.TargetSystemOrganToxicityEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_carcinogenicity._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityinhalation._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.GuidelineEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.DosesConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.EfflevelEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.Entry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityother._2.AttachedBackgroundMaterialEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.AttachedJustificationEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.CrossReferenceEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.Entry.class,
    TestOrganismsEntry.class,
    EffectConcentrationsEntry.class,
    eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.AttachedBackgroundMaterialEntry.class
})
public class RepeatableEntryType {

    @XmlAttribute(name = "uuid", namespace = "http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1", required = true)
    protected String uuid;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
