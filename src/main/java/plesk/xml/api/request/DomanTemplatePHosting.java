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
 * <p>Java class for DomanTemplatePHosting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DomanTemplatePHosting">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="vrt_hst" type="{}DomainTemplateVrtHst"/>
 *         <element name="none" type="{}NoneType"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomanTemplatePHosting", propOrder = {
    "vrtHst",
    "none"
})
public class DomanTemplatePHosting {

    @XmlElement(name = "vrt_hst")
    protected DomainTemplateVrtHst vrtHst;
    protected NoneType none;

    /**
     * Gets the value of the vrtHst property.
     * 
     * @return
     *     possible object is
     *     {@link DomainTemplateVrtHst }
     *     
     */
    public DomainTemplateVrtHst getVrtHst() {
        return vrtHst;
    }

    /**
     * Sets the value of the vrtHst property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainTemplateVrtHst }
     *     
     */
    public void setVrtHst(DomainTemplateVrtHst value) {
        this.vrtHst = value;
    }

    /**
     * Gets the value of the none property.
     * 
     * @return
     *     possible object is
     *     {@link NoneType }
     *     
     */
    public NoneType getNone() {
        return none;
    }

    /**
     * Sets the value of the none property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoneType }
     *     
     */
    public void setNone(NoneType value) {
        this.none = value;
    }

}
