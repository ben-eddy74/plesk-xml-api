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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Domain Standart Forwarding Hosting
 * 
 * <p>Java class for domainSFHostingBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="domainSFHostingBase">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dest_url" type="{}forwardingURL"/>
 *         <element name="http_code" type="{}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainSFHostingBase", propOrder = {
    "destUrl",
    "httpCode"
})
@XmlSeeAlso({
    generated.DomainHostingAgentGet.StdFwd.class,
    generated.DomainHostingAgentSet.StdFwd.class
})
public class DomainSFHostingBase {

    @XmlElement(name = "dest_url", required = true)
    protected String destUrl;
    @XmlElement(name = "http_code")
    protected BigInteger httpCode;

    /**
     * Gets the value of the destUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestUrl() {
        return destUrl;
    }

    /**
     * Sets the value of the destUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestUrl(String value) {
        this.destUrl = value;
    }

    /**
     * Gets the value of the httpCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHttpCode() {
        return httpCode;
    }

    /**
     * Sets the value of the httpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHttpCode(BigInteger value) {
        this.httpCode = value;
    }

}
