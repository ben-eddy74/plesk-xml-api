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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConditionType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="log-bysize" type="{}int"/>
 *         <element name="log-bytime">
 *           <simpleType>
 *             <restriction base="{}string">
 *               <enumeration value="Daily"/>
 *               <enumeration value="Weekly"/>
 *               <enumeration value="Monthly"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionType", propOrder = {
    "logBysize",
    "logBytime"
})
public class ConditionType {

    @XmlElement(name = "log-bysize")
    protected BigInteger logBysize;
    @XmlElement(name = "log-bytime")
    protected String logBytime;

    /**
     * Gets the value of the logBysize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLogBysize() {
        return logBysize;
    }

    /**
     * Sets the value of the logBysize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLogBysize(BigInteger value) {
        this.logBysize = value;
    }

    /**
     * Gets the value of the logBytime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogBytime() {
        return logBytime;
    }

    /**
     * Sets the value of the logBytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogBytime(String value) {
        this.logBytime = value;
    }

}
