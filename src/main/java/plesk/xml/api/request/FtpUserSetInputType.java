//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FtpUserSetInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FtpUserSetInputType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="filter" type="{}FtpUserFilterType"/>
 *         <element name="values" type="{}FtpUserSetType"/>
 *         <choice minOccurs="0">
 *           <element name="webspace-id" type="{}id_type"/>
 *           <element name="webspace-name" type="{}string"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpUserSetInputType", propOrder = {
    "filter",
    "values",
    "webspaceId",
    "webspaceName"
})
public class FtpUserSetInputType {

    @XmlElement(required = true)
    protected FtpUserFilterType filter;
    @XmlElement(required = true)
    protected FtpUserSetType values;
    @XmlElement(name = "webspace-id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger webspaceId;
    @XmlElement(name = "webspace-name")
    protected String webspaceName;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FtpUserFilterType }
     *     
     */
    public FtpUserFilterType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtpUserFilterType }
     *     
     */
    public void setFilter(FtpUserFilterType value) {
        this.filter = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link FtpUserSetType }
     *     
     */
    public FtpUserSetType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link FtpUserSetType }
     *     
     */
    public void setValues(FtpUserSetType value) {
        this.values = value;
    }

    /**
     * Gets the value of the webspaceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWebspaceId() {
        return webspaceId;
    }

    /**
     * Sets the value of the webspaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWebspaceId(BigInteger value) {
        this.webspaceId = value;
    }

    /**
     * Gets the value of the webspaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebspaceName() {
        return webspaceName;
    }

    /**
     * Sets the value of the webspaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebspaceName(String value) {
        this.webspaceName = value;
    }

}
