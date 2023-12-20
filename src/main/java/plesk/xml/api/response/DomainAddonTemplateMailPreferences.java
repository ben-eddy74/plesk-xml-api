//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainAddonTemplateMailPreferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DomainAddonTemplateMailPreferences">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="webmail" type="{}string" minOccurs="0"/>
 *         <element name="spam-protect-sign" type="{}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainAddonTemplateMailPreferences", propOrder = {
    "webmail",
    "spamProtectSign"
})
public class DomainAddonTemplateMailPreferences {

    protected String webmail;
    @XmlElement(name = "spam-protect-sign")
    protected Boolean spamProtectSign;

    /**
     * Gets the value of the webmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebmail() {
        return webmail;
    }

    /**
     * Sets the value of the webmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebmail(String value) {
        this.webmail = value;
    }

    /**
     * Gets the value of the spamProtectSign property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpamProtectSign() {
        return spamProtectSign;
    }

    /**
     * Sets the value of the spamProtectSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpamProtectSign(Boolean value) {
        this.spamProtectSign = value;
    }

}
