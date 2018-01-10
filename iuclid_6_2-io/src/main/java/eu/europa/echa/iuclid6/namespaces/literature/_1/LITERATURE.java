
package eu.europa.echa.iuclid6.namespaces.literature._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="GeneralInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LiteratureType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
 *                   &lt;element name="Name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall">
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Author" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
 *                   &lt;element name="ReferenceYear">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="1000"/>
 *                         &lt;maxInclusive value="9999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Source" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="TestLab" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="ReportNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="CompanyOwner" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="CompanyOwnerStudyNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
 *                   &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
    "generalInfo"
})
@XmlRootElement(name = "LITERATURE")
public class LITERATURE {

    @XmlElement(name = "GeneralInfo", required = true)
    protected LITERATURE.GeneralInfo generalInfo;

    /**
     * Gets the value of the generalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LITERATURE.GeneralInfo }
     *     
     */
    public LITERATURE.GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    /**
     * Sets the value of the generalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LITERATURE.GeneralInfo }
     *     
     */
    public void setGeneralInfo(LITERATURE.GeneralInfo value) {
        this.generalInfo = value;
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
     *         &lt;element name="LiteratureType" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}picklistField"/>
     *         &lt;element name="Name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall">
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Author" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldMultiLine"/>
     *         &lt;element name="ReferenceYear">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="1000"/>
     *               &lt;maxInclusive value="9999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Source" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="TestLab" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="ReportNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="CompanyOwner" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="CompanyOwnerStudyNo" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldSmall"/>
     *         &lt;element name="ReportDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="Remarks" type="{http://iuclid6.echa.europa.eu/namespaces/platform-fields/v1}textFieldLarge"/>
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
        "literatureType",
        "name",
        "author",
        "referenceYear",
        "source",
        "testLab",
        "reportNo",
        "companyOwner",
        "companyOwnerStudyNo",
        "reportDate",
        "remarks"
    })
    public static class GeneralInfo {

        @XmlElement(name = "LiteratureType", required = true)
        protected PicklistField literatureType;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Author", required = true)
        protected String author;
        @XmlElement(name = "ReferenceYear", required = true, type = Integer.class, nillable = true)
        protected Integer referenceYear;
        @XmlElement(name = "Source", required = true)
        protected String source;
        @XmlElement(name = "TestLab", required = true)
        protected String testLab;
        @XmlElement(name = "ReportNo", required = true)
        protected String reportNo;
        @XmlElement(name = "CompanyOwner", required = true)
        protected String companyOwner;
        @XmlElement(name = "CompanyOwnerStudyNo", required = true)
        protected String companyOwnerStudyNo;
        @XmlElement(name = "ReportDate", required = true, nillable = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar reportDate;
        @XmlElement(name = "Remarks", required = true)
        protected String remarks;

        /**
         * Gets the value of the literatureType property.
         * 
         * @return
         *     possible object is
         *     {@link PicklistField }
         *     
         */
        public PicklistField getLiteratureType() {
            return literatureType;
        }

        /**
         * Sets the value of the literatureType property.
         * 
         * @param value
         *     allowed object is
         *     {@link PicklistField }
         *     
         */
        public void setLiteratureType(PicklistField value) {
            this.literatureType = value;
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
         * Gets the value of the author property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Gets the value of the referenceYear property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getReferenceYear() {
            return referenceYear;
        }

        /**
         * Sets the value of the referenceYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setReferenceYear(Integer value) {
            this.referenceYear = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Gets the value of the testLab property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTestLab() {
            return testLab;
        }

        /**
         * Sets the value of the testLab property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTestLab(String value) {
            this.testLab = value;
        }

        /**
         * Gets the value of the reportNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReportNo() {
            return reportNo;
        }

        /**
         * Sets the value of the reportNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReportNo(String value) {
            this.reportNo = value;
        }

        /**
         * Gets the value of the companyOwner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyOwner() {
            return companyOwner;
        }

        /**
         * Sets the value of the companyOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyOwner(String value) {
            this.companyOwner = value;
        }

        /**
         * Gets the value of the companyOwnerStudyNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyOwnerStudyNo() {
            return companyOwnerStudyNo;
        }

        /**
         * Sets the value of the companyOwnerStudyNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyOwnerStudyNo(String value) {
            this.companyOwnerStudyNo = value;
        }

        /**
         * Gets the value of the reportDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getReportDate() {
            return reportDate;
        }

        /**
         * Sets the value of the reportDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setReportDate(XMLGregorianCalendar value) {
            this.reportDate = value;
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
