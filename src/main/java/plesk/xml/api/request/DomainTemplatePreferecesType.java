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
 * <p>Java class for DomainTemplatePreferecesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DomainTemplatePreferecesType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stat" type="{}int" minOccurs="0"/>
 *         <element name="maillists" type="{}boolean" minOccurs="0"/>
 *         <element name="mailservice" type="{}boolean" minOccurs="0"/>
 *         <element name="dns_zone_type" type="{}ZoneType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainTemplatePreferecesType", propOrder = {
    "stat",
    "maillists",
    "mailservice",
    "dnsZoneType"
})
public class DomainTemplatePreferecesType {

    protected BigInteger stat;
    protected Boolean maillists;
    protected Boolean mailservice;
    @XmlElement(name = "dns_zone_type")
    @XmlSchemaType(name = "string")
    protected ZoneType dnsZoneType;

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStat(BigInteger value) {
        this.stat = value;
    }

    /**
     * Gets the value of the maillists property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaillists() {
        return maillists;
    }

    /**
     * Sets the value of the maillists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaillists(Boolean value) {
        this.maillists = value;
    }

    /**
     * Gets the value of the mailservice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMailservice() {
        return mailservice;
    }

    /**
     * Sets the value of the mailservice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMailservice(Boolean value) {
        this.mailservice = value;
    }

    /**
     * Gets the value of the dnsZoneType property.
     * 
     * @return
     *     possible object is
     *     {@link ZoneType }
     *     
     */
    public ZoneType getDnsZoneType() {
        return dnsZoneType;
    }

    /**
     * Sets the value of the dnsZoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneType }
     *     
     */
    public void setDnsZoneType(ZoneType value) {
        this.dnsZoneType = value;
    }

}
