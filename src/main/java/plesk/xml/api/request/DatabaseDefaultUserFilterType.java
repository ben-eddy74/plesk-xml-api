//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package plesk.xml.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatabaseDefaultUserFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DatabaseDefaultUserFilterType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice minOccurs="0">
 *         <element name="db-id" type="{}id_type" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseDefaultUserFilterType", propOrder = {
    "dbId"
})
public class DatabaseDefaultUserFilterType {

    @XmlElement(name = "db-id")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> dbId;

    /**
     * Gets the value of the dbId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dbId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDbId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     * @return
     *     The value of the dbId property.
     */
    public List<BigInteger> getDbId() {
        if (dbId == null) {
            dbId = new ArrayList<>();
        }
        return this.dbId;
    }

}
