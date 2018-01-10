
package eu.europa.echa.iuclid6.namespaces.fixed_record_genericexposurepotential._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.DataProtectionField;
import eu.europa.echa.iuclid6.namespaces.platform_fields.v1.PicklistField;


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
 *         &lt;element name="DataProtection" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}dataProtectionField"/>
 *         &lt;element name="ClosedSystem">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TakePlaceInClosedSystem" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoutesOfExposure">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="HumanExposures">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Oral" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Dermal" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Inhalation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EnvironmentExposures">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Water" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Air" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="SolidWaste" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Soil" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PatternExposures">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AccidentalInfrequent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="Occasional" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                             &lt;element name="ContinuousFrequent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
    "dataProtection",
    "closedSystem",
    "routesOfExposure"
})
@XmlRootElement(name = "FIXED_RECORD.GenericExposurePotential")
public class FIXEDRECORDGenericExposurePotential {

    @XmlElement(name = "DataProtection", required = true)
    protected DataProtectionField dataProtection;
    @XmlElement(name = "ClosedSystem", required = true)
    protected FIXEDRECORDGenericExposurePotential.ClosedSystem closedSystem;
    @XmlElement(name = "RoutesOfExposure", required = true)
    protected FIXEDRECORDGenericExposurePotential.RoutesOfExposure routesOfExposure;

    /**
     * Gets the value of the dataProtection property.
     * 
     * @return
     *     possible object is
     *     {@link DataProtectionField }
     *     
     */
    public DataProtectionField getDataProtection() {
        return dataProtection;
    }

    /**
     * Sets the value of the dataProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProtectionField }
     *     
     */
    public void setDataProtection(DataProtectionField value) {
        this.dataProtection = value;
    }

    /**
     * Gets the value of the closedSystem property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDGenericExposurePotential.ClosedSystem }
     *     
     */
    public FIXEDRECORDGenericExposurePotential.ClosedSystem getClosedSystem() {
        return closedSystem;
    }

    /**
     * Sets the value of the closedSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDGenericExposurePotential.ClosedSystem }
     *     
     */
    public void setClosedSystem(FIXEDRECORDGenericExposurePotential.ClosedSystem value) {
        this.closedSystem = value;
    }

    /**
     * Gets the value of the routesOfExposure property.
     * 
     * @return
     *     possible object is
     *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure }
     *     
     */
    public FIXEDRECORDGenericExposurePotential.RoutesOfExposure getRoutesOfExposure() {
        return routesOfExposure;
    }

    /**
     * Sets the value of the routesOfExposure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure }
     *     
     */
    public void setRoutesOfExposure(FIXEDRECORDGenericExposurePotential.RoutesOfExposure value) {
        this.routesOfExposure = value;
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
     *         &lt;element name="TakePlaceInClosedSystem" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
        "takePlaceInClosedSystem"
    })
    public static class ClosedSystem {

        @XmlElement(name = "TakePlaceInClosedSystem", required = true)
        protected PicklistField takePlaceInClosedSystem;

        /**
         * Gets the value of the takePlaceInClosedSystem property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getTakePlaceInClosedSystem() {
            return takePlaceInClosedSystem;
        }

        /**
         * Sets the value of the takePlaceInClosedSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setTakePlaceInClosedSystem(PicklistField value) {
            this.takePlaceInClosedSystem = value;
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
     *         &lt;element name="HumanExposures">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Oral" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="Dermal" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="Inhalation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EnvironmentExposures">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Water" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="Air" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="SolidWaste" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="Soil" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PatternExposures">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AccidentalInfrequent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="Occasional" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *                   &lt;element name="ContinuousFrequent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
        "humanExposures",
        "environmentExposures",
        "patternExposures"
    })
    public static class RoutesOfExposure {

        @XmlElement(name = "HumanExposures", required = true)
        protected FIXEDRECORDGenericExposurePotential.RoutesOfExposure.HumanExposures humanExposures;
        @XmlElement(name = "EnvironmentExposures", required = true)
        protected FIXEDRECORDGenericExposurePotential.RoutesOfExposure.EnvironmentExposures environmentExposures;
        @XmlElement(name = "PatternExposures", required = true)
        protected FIXEDRECORDGenericExposurePotential.RoutesOfExposure.PatternExposures patternExposures;

        /**
         * Gets the value of the humanExposures property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure.HumanExposures }
         *     
         */
        public FIXEDRECORDGenericExposurePotential.RoutesOfExposure.HumanExposures getHumanExposures() {
            return humanExposures;
        }

        /**
         * Sets the value of the humanExposures property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure.HumanExposures }
         *     
         */
        public void setHumanExposures(FIXEDRECORDGenericExposurePotential.RoutesOfExposure.HumanExposures value) {
            this.humanExposures = value;
        }

        /**
         * Gets the value of the environmentExposures property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure.EnvironmentExposures }
         *     
         */
        public FIXEDRECORDGenericExposurePotential.RoutesOfExposure.EnvironmentExposures getEnvironmentExposures() {
            return environmentExposures;
        }

        /**
         * Sets the value of the environmentExposures property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure.EnvironmentExposures }
         *     
         */
        public void setEnvironmentExposures(FIXEDRECORDGenericExposurePotential.RoutesOfExposure.EnvironmentExposures value) {
            this.environmentExposures = value;
        }

        /**
         * Gets the value of the patternExposures property.
         * 
         * @return
         *     possible object is
         *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure.PatternExposures }
         *     
         */
        public FIXEDRECORDGenericExposurePotential.RoutesOfExposure.PatternExposures getPatternExposures() {
            return patternExposures;
        }

        /**
         * Sets the value of the patternExposures property.
         * 
         * @param value
         *     allowed object is
         *     {@link FIXEDRECORDGenericExposurePotential.RoutesOfExposure.PatternExposures }
         *     
         */
        public void setPatternExposures(FIXEDRECORDGenericExposurePotential.RoutesOfExposure.PatternExposures value) {
            this.patternExposures = value;
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
         *         &lt;element name="Water" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Air" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="SolidWaste" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Soil" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
            "water",
            "air",
            "solidWaste",
            "soil"
        })
        public static class EnvironmentExposures {

            @XmlElement(name = "Water", required = true)
            protected PicklistField water;
            @XmlElement(name = "Air", required = true)
            protected PicklistField air;
            @XmlElement(name = "SolidWaste", required = true)
            protected PicklistField solidWaste;
            @XmlElement(name = "Soil", required = true)
            protected PicklistField soil;

            /**
             * Gets the value of the water property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getWater() {
                return water;
            }

            /**
             * Sets the value of the water property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setWater(PicklistField value) {
                this.water = value;
            }

            /**
             * Gets the value of the air property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getAir() {
                return air;
            }

            /**
             * Sets the value of the air property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setAir(PicklistField value) {
                this.air = value;
            }

            /**
             * Gets the value of the solidWaste property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getSolidWaste() {
                return solidWaste;
            }

            /**
             * Sets the value of the solidWaste property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setSolidWaste(PicklistField value) {
                this.solidWaste = value;
            }

            /**
             * Gets the value of the soil property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getSoil() {
                return soil;
            }

            /**
             * Sets the value of the soil property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setSoil(PicklistField value) {
                this.soil = value;
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
         *         &lt;element name="Oral" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Dermal" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Inhalation" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
            "oral",
            "dermal",
            "inhalation"
        })
        public static class HumanExposures {

            @XmlElement(name = "Oral", required = true)
            protected PicklistField oral;
            @XmlElement(name = "Dermal", required = true)
            protected PicklistField dermal;
            @XmlElement(name = "Inhalation", required = true)
            protected PicklistField inhalation;

            /**
             * Gets the value of the oral property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getOral() {
                return oral;
            }

            /**
             * Sets the value of the oral property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setOral(PicklistField value) {
                this.oral = value;
            }

            /**
             * Gets the value of the dermal property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getDermal() {
                return dermal;
            }

            /**
             * Sets the value of the dermal property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setDermal(PicklistField value) {
                this.dermal = value;
            }

            /**
             * Gets the value of the inhalation property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getInhalation() {
                return inhalation;
            }

            /**
             * Sets the value of the inhalation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setInhalation(PicklistField value) {
                this.inhalation = value;
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
         *         &lt;element name="AccidentalInfrequent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="Occasional" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
         *         &lt;element name="ContinuousFrequent" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
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
            "accidentalInfrequent",
            "occasional",
            "continuousFrequent"
        })
        public static class PatternExposures {

            @XmlElement(name = "AccidentalInfrequent", required = true)
            protected PicklistField accidentalInfrequent;
            @XmlElement(name = "Occasional", required = true)
            protected PicklistField occasional;
            @XmlElement(name = "ContinuousFrequent", required = true)
            protected PicklistField continuousFrequent;

            /**
             * Gets the value of the accidentalInfrequent property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getAccidentalInfrequent() {
                return accidentalInfrequent;
            }

            /**
             * Sets the value of the accidentalInfrequent property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setAccidentalInfrequent(PicklistField value) {
                this.accidentalInfrequent = value;
            }

            /**
             * Gets the value of the occasional property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getOccasional() {
                return occasional;
            }

            /**
             * Sets the value of the occasional property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setOccasional(PicklistField value) {
                this.occasional = value;
            }

            /**
             * Gets the value of the continuousFrequent property.
             * 
             * @return
             *     possible object is
             *     {@link PicklistField }
             *     
             */
            public PicklistField getContinuousFrequent() {
                return continuousFrequent;
            }

            /**
             * Sets the value of the continuousFrequent property.
             * 
             * @param value
             *     allowed object is
             *     {@link PicklistField }
             *     
             */
            public void setContinuousFrequent(PicklistField value) {
                this.continuousFrequent = value;
            }

        }

    }

}
