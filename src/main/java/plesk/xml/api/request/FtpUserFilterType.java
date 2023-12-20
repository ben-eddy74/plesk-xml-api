//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FtpUserFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FtpUserFilterType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *         <element name="id" type="{}id_type" maxOccurs="unbounded"/>
 *         <element name="name" type="{}string" maxOccurs="unbounded"/>
 *         <element name="webspace-id" type="{}id_type" maxOccurs="unbounded"/>
 *         <element name="webspace-name" type="{}string" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtpUserFilterType", propOrder = {
    "id",
    "name",
    "webspaceId",
    "webspaceName"
})
public class FtpUserFilterType {

    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> id;
    protected List<String> name;
    @XmlElement(name = "webspace-id")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> webspaceId;
    @XmlElement(name = "webspace-name")
    protected List<String> webspaceName;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<BigInteger> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the name property.
     */
    public List<String> getName() {
        if (name == null) {
            name = new ArrayList<>();
        }
        return this.name;
    }

    /**
     * Gets the value of the webspaceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the webspaceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebspaceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     * @return
     *     The value of the webspaceId property.
     */
    public List<BigInteger> getWebspaceId() {
        if (webspaceId == null) {
            webspaceId = new ArrayList<>();
        }
        return this.webspaceId;
    }

    /**
     * Gets the value of the webspaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the webspaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebspaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the webspaceName property.
     */
    public List<String> getWebspaceName() {
        if (webspaceName == null) {
            webspaceName = new ArrayList<>();
        }
        return this.webspaceName;
    }

}
