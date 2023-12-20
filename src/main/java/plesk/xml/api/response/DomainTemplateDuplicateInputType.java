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
 * <p>Java class for DomainTemplateDuplicateInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DomainTemplateDuplicateInputType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="filter" type="{}DomainTemplateFilterType"/>
 *         <choice minOccurs="0">
 *           <element name="owner-id" type="{}id_type"/>
 *           <element name="owner-login" type="{}string"/>
 *         </choice>
 *         <element name="duplicate-name" type="{}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainTemplateDuplicateInputType", propOrder = {
    "filter",
    "ownerId",
    "ownerLogin",
    "duplicateName"
})
public class DomainTemplateDuplicateInputType {

    @XmlElement(required = true)
    protected DomainTemplateFilterType filter;
    @XmlElement(name = "owner-id")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger ownerId;
    @XmlElement(name = "owner-login")
    protected String ownerLogin;
    @XmlElement(name = "duplicate-name", required = true)
    protected String duplicateName;

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link DomainTemplateFilterType }
     *     
     */
    public DomainTemplateFilterType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainTemplateFilterType }
     *     
     */
    public void setFilter(DomainTemplateFilterType value) {
        this.filter = value;
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
     * Gets the value of the duplicateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuplicateName() {
        return duplicateName;
    }

    /**
     * Sets the value of the duplicateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuplicateName(String value) {
        this.duplicateName = value;
    }

}
