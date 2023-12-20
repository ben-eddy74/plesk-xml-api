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
 * <p>Java class for DatabaseGetDBUsersOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DatabaseGetDBUsersOutputType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="result" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{}resultFilterType">
 *                 <sequence minOccurs="0">
 *                   <element name="login" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   <element name="db-id" type="{}id_type" minOccurs="0"/>
 *                   <element name="acl" type="{}DatabaseUserAclType" minOccurs="0"/>
 *                   <element name="allow-access-from" type="{}DatabaseUserRemoteAccessRulesType" minOccurs="0"/>
 *                 </sequence>
 *               </extension>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseGetDBUsersOutputType", propOrder = {
    "result"
})
public class DatabaseGetDBUsersOutputType {

    @XmlElement(required = true)
    protected List<DatabaseGetDBUsersOutputType.Result> result;

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatabaseGetDBUsersOutputType.Result }
     * 
     * 
     * @return
     *     The value of the result property.
     */
    public List<DatabaseGetDBUsersOutputType.Result> getResult() {
        if (result == null) {
            result = new ArrayList<>();
        }
        return this.result;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <extension base="{}resultFilterType">
     *       <sequence minOccurs="0">
     *         <element name="login" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         <element name="db-id" type="{}id_type" minOccurs="0"/>
     *         <element name="acl" type="{}DatabaseUserAclType" minOccurs="0"/>
     *         <element name="allow-access-from" type="{}DatabaseUserRemoteAccessRulesType" minOccurs="0"/>
     *       </sequence>
     *     </extension>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "login",
        "dbId",
        "acl",
        "allowAccessFrom"
    })
    public static class Result
        extends ResultFilterType
    {

        protected Object login;
        @XmlElement(name = "db-id")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger dbId;
        protected DatabaseUserAclType acl;
        @XmlElement(name = "allow-access-from")
        protected DatabaseUserRemoteAccessRulesType allowAccessFrom;

        /**
         * Gets the value of the login property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLogin() {
            return login;
        }

        /**
         * Sets the value of the login property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLogin(Object value) {
            this.login = value;
        }

        /**
         * Gets the value of the dbId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDbId() {
            return dbId;
        }

        /**
         * Sets the value of the dbId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDbId(BigInteger value) {
            this.dbId = value;
        }

        /**
         * Gets the value of the acl property.
         * 
         * @return
         *     possible object is
         *     {@link DatabaseUserAclType }
         *     
         */
        public DatabaseUserAclType getAcl() {
            return acl;
        }

        /**
         * Sets the value of the acl property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatabaseUserAclType }
         *     
         */
        public void setAcl(DatabaseUserAclType value) {
            this.acl = value;
        }

        /**
         * Gets the value of the allowAccessFrom property.
         * 
         * @return
         *     possible object is
         *     {@link DatabaseUserRemoteAccessRulesType }
         *     
         */
        public DatabaseUserRemoteAccessRulesType getAllowAccessFrom() {
            return allowAccessFrom;
        }

        /**
         * Sets the value of the allowAccessFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatabaseUserRemoteAccessRulesType }
         *     
         */
        public void setAllowAccessFrom(DatabaseUserRemoteAccessRulesType value) {
            this.allowAccessFrom = value;
        }

    }

}
