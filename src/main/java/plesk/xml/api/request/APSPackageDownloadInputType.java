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
 * <p>Java class for APSPackageDownloadInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="APSPackageDownloadInputType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="package" type="{}APSIdentifierType"/>
 *         <element name="aps-catalog-url" type="{}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APSPackageDownloadInputType", propOrder = {
    "_package",
    "apsCatalogUrl"
})
public class APSPackageDownloadInputType {

    @XmlElement(name = "package", required = true)
    protected APSIdentifierType _package;
    @XmlElement(name = "aps-catalog-url")
    protected String apsCatalogUrl;

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link APSIdentifierType }
     *     
     */
    public APSIdentifierType getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link APSIdentifierType }
     *     
     */
    public void setPackage(APSIdentifierType value) {
        this._package = value;
    }

    /**
     * Gets the value of the apsCatalogUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApsCatalogUrl() {
        return apsCatalogUrl;
    }

    /**
     * Sets the value of the apsCatalogUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApsCatalogUrl(String value) {
        this.apsCatalogUrl = value;
    }

}
