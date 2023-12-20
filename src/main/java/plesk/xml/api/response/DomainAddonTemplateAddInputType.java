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
 * <p>Java class for DomainAddonTemplateAddInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DomainAddonTemplateAddInputType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{}string"/>
 *         <choice minOccurs="0">
 *           <element name="owner-id" type="{}id_type"/>
 *           <element name="owner-login" type="{}string"/>
 *         </choice>
 *         <element name="limits" type="{}DomainAddonTemplateLimits" minOccurs="0"/>
 *         <element name="hosting" type="{}DomainAddonTemplateVrtHst" minOccurs="0"/>
 *         <element name="performance" type="{}DomainPerformanceType" minOccurs="0"/>
 *         <element name="permissions" type="{}domainPerms" minOccurs="0"/>
 *         <element name="external-id" type="{}string" minOccurs="0"/>
 *         <element name="php-settings" type="{}phpSettings" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainAddonTemplateAddInputType", propOrder = {
    "name",
    "ownerId",
    "ownerLogin",
    "limits",
    "hosting",
    "performance",
    "permissions",
    "externalId",
    "phpSettings"
})
public class DomainAddonTemplateAddInputType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "owner-id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ownerId;
    @XmlElement(name = "owner-login")
    protected String ownerLogin;
    protected DomainAddonTemplateLimits limits;
    protected DomainAddonTemplateVrtHst hosting;
    protected DomainPerformanceType performance;
    protected DomainPerms permissions;
    @XmlElement(name = "external-id")
    protected String externalId;
    @XmlElement(name = "php-settings")
    protected PhpSettings phpSettings;

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
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwnerId(BigInteger value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the ownerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerLogin() {
        return ownerLogin;
    }

    /**
     * Sets the value of the ownerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerLogin(String value) {
        this.ownerLogin = value;
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link DomainAddonTemplateLimits }
     *     
     */
    public DomainAddonTemplateLimits getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAddonTemplateLimits }
     *     
     */
    public void setLimits(DomainAddonTemplateLimits value) {
        this.limits = value;
    }

    /**
     * Gets the value of the hosting property.
     * 
     * @return
     *     possible object is
     *     {@link DomainAddonTemplateVrtHst }
     *     
     */
    public DomainAddonTemplateVrtHst getHosting() {
        return hosting;
    }

    /**
     * Sets the value of the hosting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainAddonTemplateVrtHst }
     *     
     */
    public void setHosting(DomainAddonTemplateVrtHst value) {
        this.hosting = value;
    }

    /**
     * Gets the value of the performance property.
     * 
     * @return
     *     possible object is
     *     {@link DomainPerformanceType }
     *     
     */
    public DomainPerformanceType getPerformance() {
        return performance;
    }

    /**
     * Sets the value of the performance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainPerformanceType }
     *     
     */
    public void setPerformance(DomainPerformanceType value) {
        this.performance = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link DomainPerms }
     *     
     */
    public DomainPerms getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainPerms }
     *     
     */
    public void setPermissions(DomainPerms value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the phpSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PhpSettings }
     *     
     */
    public PhpSettings getPhpSettings() {
        return phpSettings;
    }

    /**
     * Sets the value of the phpSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhpSettings }
     *     
     */
    public void setPhpSettings(PhpSettings value) {
        this.phpSettings = value;
    }

}
