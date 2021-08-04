
package eu.europa.echa.iuclid6.namespaces.inventory.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="versionInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="inventoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inventoryEntries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="inventoryEntry" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inventoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="inventoryNames" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="inventoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="casNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="molecularFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="descriptions" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="description" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute name="exportDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "versionInfo",
    "inventoryCode",
    "name",
    "inventoryEntries"
})
@XmlRootElement(name = "Inventory")
public class Inventory {

    @XmlElement(required = true)
    protected Inventory.VersionInfo versionInfo;
    @XmlElement(required = true)
    protected String inventoryCode;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Inventory.InventoryEntries inventoryEntries;
    @XmlAttribute(name = "scope")
    @XmlSchemaType(name = "anySimpleType")
    protected String scope;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "exportDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String exportDate;

    /**
     * Gets the value of the versionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Inventory.VersionInfo }
     *     
     */
    public Inventory.VersionInfo getVersionInfo() {
        return versionInfo;
    }

    /**
     * Sets the value of the versionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventory.VersionInfo }
     *     
     */
    public void setVersionInfo(Inventory.VersionInfo value) {
        this.versionInfo = value;
    }

    /**
     * Gets the value of the inventoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryCode() {
        return inventoryCode;
    }

    /**
     * Sets the value of the inventoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryCode(String value) {
        this.inventoryCode = value;
    }

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
     * Gets the value of the inventoryEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Inventory.InventoryEntries }
     *     
     */
    public Inventory.InventoryEntries getInventoryEntries() {
        return inventoryEntries;
    }

    /**
     * Sets the value of the inventoryEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inventory.InventoryEntries }
     *     
     */
    public void setInventoryEntries(Inventory.InventoryEntries value) {
        this.inventoryEntries = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the exportDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDate() {
        return exportDate;
    }

    /**
     * Sets the value of the exportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDate(String value) {
        this.exportDate = value;
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
     *         &lt;element name="inventoryEntry" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="inventoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="inventoryNames" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="inventoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="casNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="molecularFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="descriptions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="description" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "inventoryEntry"
    })
    public static class InventoryEntries {

        protected List<Inventory.InventoryEntries.InventoryEntry> inventoryEntry;

        /**
         * Gets the value of the inventoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inventoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInventoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Inventory.InventoryEntries.InventoryEntry }
         * 
         * 
         */
        public List<Inventory.InventoryEntries.InventoryEntry> getInventoryEntry() {
            if (inventoryEntry == null) {
                inventoryEntry = new ArrayList<Inventory.InventoryEntries.InventoryEntry>();
            }
            return this.inventoryEntry;
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
         *         &lt;element name="inventoryNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="inventoryNames" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="inventoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="casNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="molecularFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="descriptions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="description" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="lastModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "inventoryNumber",
            "inventoryNames",
            "casNumber",
            "molecularFormula",
            "descriptions"
        })
        public static class InventoryEntry {

            @XmlElement(required = true)
            protected String inventoryNumber;
            protected Inventory.InventoryEntries.InventoryEntry.InventoryNames inventoryNames;
            protected String casNumber;
            protected String molecularFormula;
            protected Inventory.InventoryEntries.InventoryEntry.Descriptions descriptions;
            @XmlAttribute(name = "creationDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar creationDate;
            @XmlAttribute(name = "lastModificationDate")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar lastModificationDate;
            @XmlAttribute(name = "status")
            protected String status;

            /**
             * Gets the value of the inventoryNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryNumber() {
                return inventoryNumber;
            }

            /**
             * Sets the value of the inventoryNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryNumber(String value) {
                this.inventoryNumber = value;
            }

            /**
             * Gets the value of the inventoryNames property.
             * 
             * @return
             *     possible object is
             *     {@link Inventory.InventoryEntries.InventoryEntry.InventoryNames }
             *     
             */
            public Inventory.InventoryEntries.InventoryEntry.InventoryNames getInventoryNames() {
                return inventoryNames;
            }

            /**
             * Sets the value of the inventoryNames property.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventory.InventoryEntries.InventoryEntry.InventoryNames }
             *     
             */
            public void setInventoryNames(Inventory.InventoryEntries.InventoryEntry.InventoryNames value) {
                this.inventoryNames = value;
            }

            /**
             * Gets the value of the casNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCasNumber() {
                return casNumber;
            }

            /**
             * Sets the value of the casNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCasNumber(String value) {
                this.casNumber = value;
            }

            /**
             * Gets the value of the molecularFormula property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMolecularFormula() {
                return molecularFormula;
            }

            /**
             * Sets the value of the molecularFormula property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMolecularFormula(String value) {
                this.molecularFormula = value;
            }

            /**
             * Gets the value of the descriptions property.
             * 
             * @return
             *     possible object is
             *     {@link Inventory.InventoryEntries.InventoryEntry.Descriptions }
             *     
             */
            public Inventory.InventoryEntries.InventoryEntry.Descriptions getDescriptions() {
                return descriptions;
            }

            /**
             * Sets the value of the descriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link Inventory.InventoryEntries.InventoryEntry.Descriptions }
             *     
             */
            public void setDescriptions(Inventory.InventoryEntries.InventoryEntry.Descriptions value) {
                this.descriptions = value;
            }

            /**
             * Gets the value of the creationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreationDate() {
                return creationDate;
            }

            /**
             * Sets the value of the creationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreationDate(XMLGregorianCalendar value) {
                this.creationDate = value;
            }

            /**
             * Gets the value of the lastModificationDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getLastModificationDate() {
                return lastModificationDate;
            }

            /**
             * Sets the value of the lastModificationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setLastModificationDate(XMLGregorianCalendar value) {
                this.lastModificationDate = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
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
             *         &lt;element name="description" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
                "description"
            })
            public static class Descriptions {

                protected Inventory.InventoryEntries.InventoryEntry.Descriptions.Description description;

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Inventory.InventoryEntries.InventoryEntry.Descriptions.Description }
                 *     
                 */
                public Inventory.InventoryEntries.InventoryEntry.Descriptions.Description getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Inventory.InventoryEntries.InventoryEntry.Descriptions.Description }
                 *     
                 */
                public void setDescription(Inventory.InventoryEntries.InventoryEntry.Descriptions.Description value) {
                    this.description = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Description {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
                    protected String lang;

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
                     * Gets the value of the lang property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLang() {
                        return lang;
                    }

                    /**
                     * Sets the value of the lang property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLang(String value) {
                        this.lang = value;
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
             *         &lt;element name="inventoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "inventoryName"
            })
            public static class InventoryNames {

                @XmlElement(required = true)
                protected String inventoryName;

                /**
                 * Gets the value of the inventoryName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInventoryName() {
                    return inventoryName;
                }

                /**
                 * Sets the value of the inventoryName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInventoryName(String value) {
                    this.inventoryName = value;
                }

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
     *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "version",
        "date"
    })
    public static class VersionInfo {

        @XmlElement(required = true)
        protected String version;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

    }

}
