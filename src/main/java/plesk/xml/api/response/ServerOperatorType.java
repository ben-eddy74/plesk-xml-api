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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServerOperatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServerOperatorType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded">
 *         <element name="get_protos" type="{}GetProtosType"/>
 *         <element name="get" type="{}GetType"/>
 *         <element name="set" type="{}SetType"/>
 *         <element name="srv_man" type="{}ServicesManagementType"/>
 *         <element name="lic_install" type="{}LicenseInstallType"/>
 *         <element name="lic_update" type="{}resultType"/>
 *         <element name="initial_setup" type="{}InitialSetupType"/>
 *         <element name="get_additional_key" type="{}GetAdditionalKeyType"/>
 *         <element name="remove_additional_key" type="{}GetValidationModeResultType"/>
 *         <element name="renew_additional_key" type="{}RenewAdditionalKeyType"/>
 *         <element name="set_misc" type="{}SetMiscType"/>
 *         <element name="get_misc" type="{}GetMiscType"/>
 *         <element name="del_misc" type="{}DelMiscType"/>
 *         <element name="create_session" type="{}CreateSessionType"/>
 *         <element name="set-ppb-connection">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="reboot">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="license-rollback-key">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{}resultType">
 *                           <sequence minOccurs="0">
 *                             <element name="key-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           </sequence>
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="license-retrieve-keys">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="lic_get_info" type="{}keyType"/>
 *         <element name="clean-mail-queue">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="add-admin-alias">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="set-admin-alias">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="del-admin-alias">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="domain-restriction-add">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="domain-restriction-remove">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="domain-restriction-list">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="enable" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="domain-restriction-rename">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="domain-restriction-enable">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="domain-restriction-disable">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="result" type="{}resultType"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
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
@XmlType(name = "ServerOperatorType", propOrder = {
    "getProtosOrGetOrSet"
})
public class ServerOperatorType {

    @XmlElements({
        @XmlElement(name = "get_protos", type = GetProtosType.class),
        @XmlElement(name = "get", type = GetType.class),
        @XmlElement(name = "set", type = SetType.class),
        @XmlElement(name = "srv_man", type = ServicesManagementType.class),
        @XmlElement(name = "lic_install", type = LicenseInstallType.class),
        @XmlElement(name = "lic_update", type = ResultType.class),
        @XmlElement(name = "initial_setup", type = InitialSetupType2 .class),
        @XmlElement(name = "get_additional_key", type = GetAdditionalKeyType.class),
        @XmlElement(name = "remove_additional_key", type = GetValidationModeResultType.class),
        @XmlElement(name = "renew_additional_key", type = RenewAdditionalKeyType.class),
        @XmlElement(name = "set_misc", type = SetMiscType.class),
        @XmlElement(name = "get_misc", type = GetMiscType.class),
        @XmlElement(name = "del_misc", type = DelMiscType.class),
        @XmlElement(name = "create_session", type = CreateSessionType.class),
        @XmlElement(name = "set-ppb-connection", type = ServerOperatorType.SetPpbConnection.class),
        @XmlElement(name = "reboot", type = ServerOperatorType.Reboot.class),
        @XmlElement(name = "license-rollback-key", type = ServerOperatorType.LicenseRollbackKey.class),
        @XmlElement(name = "license-retrieve-keys", type = ServerOperatorType.LicenseRetrieveKeys.class),
        @XmlElement(name = "lic_get_info", type = KeyType.class),
        @XmlElement(name = "clean-mail-queue", type = ServerOperatorType.CleanMailQueue.class),
        @XmlElement(name = "add-admin-alias", type = ServerOperatorType.AddAdminAlias.class),
        @XmlElement(name = "set-admin-alias", type = ServerOperatorType.SetAdminAlias.class),
        @XmlElement(name = "del-admin-alias", type = ServerOperatorType.DelAdminAlias.class),
        @XmlElement(name = "domain-restriction-add", type = ServerOperatorType.DomainRestrictionAdd.class),
        @XmlElement(name = "domain-restriction-remove", type = ServerOperatorType.DomainRestrictionRemove.class),
        @XmlElement(name = "domain-restriction-list", type = ServerOperatorType.DomainRestrictionList.class),
        @XmlElement(name = "domain-restriction-rename", type = ServerOperatorType.DomainRestrictionRename.class),
        @XmlElement(name = "domain-restriction-enable", type = ServerOperatorType.DomainRestrictionEnable.class),
        @XmlElement(name = "domain-restriction-disable", type = ServerOperatorType.DomainRestrictionDisable.class)
    })
    protected List<Object> getProtosOrGetOrSet;

    /**
     * Gets the value of the getProtosOrGetOrSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the getProtosOrGetOrSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetProtosOrGetOrSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateSessionType }
     * {@link DelMiscType }
     * {@link GetAdditionalKeyType }
     * {@link GetMiscType }
     * {@link GetProtosType }
     * {@link GetType }
     * {@link GetValidationModeResultType }
     * {@link InitialSetupType2 }
     * {@link KeyType }
     * {@link LicenseInstallType }
     * {@link RenewAdditionalKeyType }
     * {@link ResultType }
     * {@link ServerOperatorType.AddAdminAlias }
     * {@link ServerOperatorType.CleanMailQueue }
     * {@link ServerOperatorType.DelAdminAlias }
     * {@link ServerOperatorType.DomainRestrictionAdd }
     * {@link ServerOperatorType.DomainRestrictionDisable }
     * {@link ServerOperatorType.DomainRestrictionEnable }
     * {@link ServerOperatorType.DomainRestrictionList }
     * {@link ServerOperatorType.DomainRestrictionRemove }
     * {@link ServerOperatorType.DomainRestrictionRename }
     * {@link ServerOperatorType.LicenseRetrieveKeys }
     * {@link ServerOperatorType.LicenseRollbackKey }
     * {@link ServerOperatorType.Reboot }
     * {@link ServerOperatorType.SetAdminAlias }
     * {@link ServerOperatorType.SetPpbConnection }
     * {@link ServicesManagementType }
     * {@link SetMiscType }
     * {@link SetType }
     * 
     * 
     * @return
     *     The value of the getProtosOrGetOrSet property.
     */
    public List<Object> getGetProtosOrGetOrSet() {
        if (getProtosOrGetOrSet == null) {
            getProtosOrGetOrSet = new ArrayList<>();
        }
        return this.getProtosOrGetOrSet;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class AddAdminAlias {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class CleanMailQueue {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class DelAdminAlias {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class DomainRestrictionAdd {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class DomainRestrictionDisable {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class DomainRestrictionEnable {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="enable" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enable",
        "name"
    })
    public static class DomainRestrictionList {

        @XmlElement(required = true)
        protected BigInteger enable;
        protected List<String> name;

        /**
         * Gets the value of the enable property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEnable() {
            return enable;
        }

        /**
         * Sets the value of the enable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEnable(BigInteger value) {
            this.enable = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class DomainRestrictionRemove {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class DomainRestrictionRename {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class LicenseRetrieveKeys {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{}resultType">
     *                 <sequence minOccurs="0">
     *                   <element name="key-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class LicenseRollbackKey {

        @XmlElement(required = true)
        protected ServerOperatorType.LicenseRollbackKey.Result result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ServerOperatorType.LicenseRollbackKey.Result }
         *     
         */
        public ServerOperatorType.LicenseRollbackKey.Result getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServerOperatorType.LicenseRollbackKey.Result }
         *     
         */
        public void setResult(ServerOperatorType.LicenseRollbackKey.Result value) {
            this.result = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{}resultType">
         *       <sequence minOccurs="0">
         *         <element name="key-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "keyId"
        })
        public static class Result
            extends ResultType
        {

            @XmlElement(name = "key-id")
            protected String keyId;

            /**
             * Gets the value of the keyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyId() {
                return keyId;
            }

            /**
             * Sets the value of the keyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyId(String value) {
                this.keyId = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class Reboot {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class SetAdminAlias {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="result" type="{}resultType"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "result"
    })
    public static class SetPpbConnection {

        @XmlElement(required = true)
        protected ResultType result;

        /**
         * Gets the value of the result property.
         * 
         * @return
         *     possible object is
         *     {@link ResultType }
         *     
         */
        public ResultType getResult() {
            return result;
        }

        /**
         * Sets the value of the result property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResultType }
         *     
         */
        public void setResult(ResultType value) {
            this.result = value;
        }

    }

}
