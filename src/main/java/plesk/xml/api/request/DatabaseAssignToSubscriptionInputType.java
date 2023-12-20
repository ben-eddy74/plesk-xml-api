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
 * <p>Java class for DatabaseAssignToSubscriptionInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DatabaseAssignToSubscriptionInputType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="filter" type="{}DatabaseFilterType"/>
 *         <element name="webspace-id" type="{}id_type"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseAssignToSubscriptionInputType", propOrder = {
    "filter",
    "webspaceId"
})
public class DatabaseAssignToSubscriptionInputType {

    @XmlElement(required = true)
    protected DatabaseFilterType filter;
    @XmlElement(name = "webspace-id", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger webspaceId;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseFilterType }
     *     
     */
    public DatabaseFilterType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseFilterType }
     *     
     */
    public void setFilter(DatabaseFilterType value) {
        this.filter = value;
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

}
