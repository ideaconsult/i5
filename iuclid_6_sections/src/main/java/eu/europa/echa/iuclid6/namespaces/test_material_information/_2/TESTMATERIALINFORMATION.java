
package eu.europa.echa.iuclid6.namespaces.test_material_information._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PhysicalQuantityRangeField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithMultiLineTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistFieldWithSmallTextRemarks;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.RepeatableEntryType;


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
 *         &lt;element name="Name" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *         &lt;element name="Composition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompositionList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                                       &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
 *                                       &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
 *                                       &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CompositionPurityOtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
 *                   &lt;element name="OtherCharacteristics">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TestMaterialForm" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
 *                             &lt;element name="DetailsOnTestMaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                             &lt;element name="ConfidentialDetailsOnTestMaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "name",
    "composition"
})
@XmlRootElement(name = "TEST_MATERIAL_INFORMATION")
public class TESTMATERIALINFORMATION {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Composition", required = true)
    protected TESTMATERIALINFORMATION.Composition composition;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the composition property.
     * 
     * @return
     *     possible object is
     *     {@link TESTMATERIALINFORMATION.Composition }
     *     
     */
    public TESTMATERIALINFORMATION.Composition getComposition() {
        return composition;
    }

    /**
     * Sets the value of the composition property.
     * 
     * @param value
     *     allowed object is
     *     {@link TESTMATERIALINFORMATION.Composition }
     *     
     */
    public void setComposition(TESTMATERIALINFORMATION.Composition value) {
        this.composition = value;
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
     *         &lt;element name="CompositionList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
     *                           &lt;sequence>
     *                             &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                             &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
     *                             &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
     *                             &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CompositionPurityOtherInformation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithSmallTextRemarks"/>
     *         &lt;element name="OtherCharacteristics">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TestMaterialForm" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
     *                   &lt;element name="DetailsOnTestMaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
     *                   &lt;element name="ConfidentialDetailsOnTestMaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
        "compositionList",
        "compositionPurityOtherInformation",
        "otherCharacteristics"
    })
    public static class Composition {

        @XmlElement(name = "CompositionList", required = true)
        protected TESTMATERIALINFORMATION.Composition.CompositionList compositionList;
        @XmlElement(name = "CompositionPurityOtherInformation", required = true)
        protected PicklistFieldWithSmallTextRemarks compositionPurityOtherInformation;
        @XmlElement(name = "OtherCharacteristics", required = true)
        protected TESTMATERIALINFORMATION.Composition.OtherCharacteristics otherCharacteristics;

        /**
         * Gets the value of the compositionList property.
         * 
         * @return
         *     possible object is
         *     {@link TESTMATERIALINFORMATION.Composition.CompositionList }
         *     
         */
        public TESTMATERIALINFORMATION.Composition.CompositionList getCompositionList() {
            return compositionList;
        }

        /**
         * Sets the value of the compositionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link TESTMATERIALINFORMATION.Composition.CompositionList }
         *     
         */
        public void setCompositionList(TESTMATERIALINFORMATION.Composition.CompositionList value) {
            this.compositionList = value;
        }

        /**
         * Gets the value of the compositionPurityOtherInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public PicklistFieldWithSmallTextRemarks getCompositionPurityOtherInformation() {
            return compositionPurityOtherInformation;
        }

        /**
         * Sets the value of the compositionPurityOtherInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistFieldWithSmallTextRemarks }
         *     
         */
        public void setCompositionPurityOtherInformation(PicklistFieldWithSmallTextRemarks value) {
            this.compositionPurityOtherInformation = value;
        }

        /**
         * Gets the value of the otherCharacteristics property.
         * 
         * @return
         *     possible object is
         *     {@link TESTMATERIALINFORMATION.Composition.OtherCharacteristics }
         *     
         */
        public TESTMATERIALINFORMATION.Composition.OtherCharacteristics getOtherCharacteristics() {
            return otherCharacteristics;
        }

        /**
         * Sets the value of the otherCharacteristics property.
         * 
         * @param value
         *     allowed object is
         *     {@link TESTMATERIALINFORMATION.Composition.OtherCharacteristics }
         *     
         */
        public void setOtherCharacteristics(TESTMATERIALINFORMATION.Composition.OtherCharacteristics value) {
            this.otherCharacteristics = value;
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
         *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
         *                 &lt;sequence>
         *                   &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *                   &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
         *                   &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
         *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "entry"
        })
        public static class CompositionList {

            protected List<TESTMATERIALINFORMATION.Composition.CompositionList.Entry> entry;

            /**
             * Gets the value of the entry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the entry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TESTMATERIALINFORMATION.Composition.CompositionList.Entry }
             * 
             * 
             */
            public List<TESTMATERIALINFORMATION.Composition.CompositionList.Entry> getEntry() {
                if (entry == null) {
                    entry = new ArrayList<TESTMATERIALINFORMATION.Composition.CompositionList.Entry>();
                }
                return this.entry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}repeatableEntryType">
             *       &lt;sequence>
             *         &lt;element name="Type" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
             *         &lt;element name="ReferenceSubstance" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}documentReferenceField"/>
             *         &lt;element name="Concentration" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}physicalQuantityRangeField"/>
             *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
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
                "type",
                "referenceSubstance",
                "concentration",
                "remarks"
            })
            public static class Entry
                extends RepeatableEntryType
            {

                @XmlElement(name = "Type", required = true)
                protected PicklistField type;
                @XmlElement(name = "ReferenceSubstance", required = true)
                protected String referenceSubstance;
                @XmlElement(name = "Concentration", required = true)
                protected PhysicalQuantityRangeField concentration;
                @XmlElement(name = "Remarks", required = true)
                protected String remarks;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PicklistField }
                 *     
                 */
                public PicklistField getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PicklistField }
                 *     
                 */
                public void setType(PicklistField value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the referenceSubstance property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReferenceSubstance() {
                    return referenceSubstance;
                }

                /**
                 * Sets the value of the referenceSubstance property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReferenceSubstance(String value) {
                    this.referenceSubstance = value;
                }

                /**
                 * Gets the value of the concentration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public PhysicalQuantityRangeField getConcentration() {
                    return concentration;
                }

                /**
                 * Sets the value of the concentration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PhysicalQuantityRangeField }
                 *     
                 */
                public void setConcentration(PhysicalQuantityRangeField value) {
                    this.concentration = value;
                }

                /**
                 * Gets the value of the remarks property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemarks() {
                    return remarks;
                }

                /**
                 * Sets the value of the remarks property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemarks(String value) {
                    this.remarks = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="TestMaterialForm" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistFieldWithMultiLineTextRemarks"/>
         *         &lt;element name="DetailsOnTestMaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
         *         &lt;element name="ConfidentialDetailsOnTestMaterial" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
            "testMaterialForm",
            "detailsOnTestMaterial",
            "confidentialDetailsOnTestMaterial"
        })
        public static class OtherCharacteristics {

            @XmlElement(name = "TestMaterialForm", required = true)
            protected PicklistFieldWithMultiLineTextRemarks testMaterialForm;
            @XmlElement(name = "DetailsOnTestMaterial", required = true)
            protected String detailsOnTestMaterial;
            @XmlElement(name = "ConfidentialDetailsOnTestMaterial", required = true)
            protected String confidentialDetailsOnTestMaterial;

            /**
             * Gets the value of the testMaterialForm property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistFieldWithMultiLineTextRemarks }
             *     
             */
            public PicklistFieldWithMultiLineTextRemarks getTestMaterialForm() {
                return testMaterialForm;
            }

            /**
             * Sets the value of the testMaterialForm property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistFieldWithMultiLineTextRemarks }
             *     
             */
            public void setTestMaterialForm(PicklistFieldWithMultiLineTextRemarks value) {
                this.testMaterialForm = value;
            }

            /**
             * Gets the value of the detailsOnTestMaterial property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDetailsOnTestMaterial() {
                return detailsOnTestMaterial;
            }

            /**
             * Sets the value of the detailsOnTestMaterial property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDetailsOnTestMaterial(String value) {
                this.detailsOnTestMaterial = value;
            }

            /**
             * Gets the value of the confidentialDetailsOnTestMaterial property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConfidentialDetailsOnTestMaterial() {
                return confidentialDetailsOnTestMaterial;
            }

            /**
             * Sets the value of the confidentialDetailsOnTestMaterial property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConfidentialDetailsOnTestMaterial(String value) {
                this.confidentialDetailsOnTestMaterial = value;
            }

        }

    }

}
