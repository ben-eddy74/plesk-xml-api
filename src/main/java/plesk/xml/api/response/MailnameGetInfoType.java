//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Plesk's mailname user
 * 
 * <p>Java class for mailnameGetInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="mailnameGetInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{}id_type" minOccurs="0"/>
 *         <element name="name" type="{}string"/>
 *         <element name="mailbox" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="quota" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   <element name="usage" type="{}int" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="forwarding" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="enabled" type="{}boolean" minOccurs="0"/>
 *                   <element name="address" type="{}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="autoresponder" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   <element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="content_type" minOccurs="0">
 *                     <simpleType>
 *                       <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         <enumeration value="text/html"/>
 *                         <enumeration value="text/plain"/>
 *                       </restriction>
 *                     </simpleType>
 *                   </element>
 *                   <element name="charset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="attachment" type="{}autoRespAttach" maxOccurs="unbounded" minOccurs="0"/>
 *                   <element name="forward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   <element name="end_date" type="{}date" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <choice minOccurs="0">
 *           <element name="password">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <sequence>
 *                     <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                     <element name="type" type="{}passwdType" minOccurs="0"/>
 *                   </sequence>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="user-guid" type="{}string"/>
 *         </choice>
 *         <element name="antivir" type="{}Antivir" minOccurs="0"/>
 *         <element name="outgoing-messages-mbox-limit" type="{}string" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailnameGetInfoType", propOrder = {
    "id",
    "name",
    "mailbox",
    "forwarding",
    "alias",
    "autoresponder",
    "password",
    "userGuid",
    "antivir",
    "outgoingMessagesMboxLimit",
    "description"
})
public class MailnameGetInfoType {

    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
    protected MailnameGetInfoType.Mailbox mailbox;
    protected MailnameGetInfoType.Forwarding forwarding;
    protected List<String> alias;
    protected MailnameGetInfoType.Autoresponder autoresponder;
    protected MailnameGetInfoType.Password password;
    @XmlElement(name = "user-guid")
    protected String userGuid;
    @XmlSchemaType(name = "string")
    protected Antivir antivir;
    @XmlElement(name = "outgoing-messages-mbox-limit")
    protected String outgoingMessagesMboxLimit;
    protected String description;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

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
     * Gets the value of the mailbox property.
     * 
     * @return
     *     possible object is
     *     {@link MailnameGetInfoType.Mailbox }
     *     
     */
    public MailnameGetInfoType.Mailbox getMailbox() {
        return mailbox;
    }

    /**
     * Sets the value of the mailbox property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailnameGetInfoType.Mailbox }
     *     
     */
    public void setMailbox(MailnameGetInfoType.Mailbox value) {
        this.mailbox = value;
    }

    /**
     * Gets the value of the forwarding property.
     * 
     * @return
     *     possible object is
     *     {@link MailnameGetInfoType.Forwarding }
     *     
     */
    public MailnameGetInfoType.Forwarding getForwarding() {
        return forwarding;
    }

    /**
     * Sets the value of the forwarding property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailnameGetInfoType.Forwarding }
     *     
     */
    public void setForwarding(MailnameGetInfoType.Forwarding value) {
        this.forwarding = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the alias property.
     */
    public List<String> getAlias() {
        if (alias == null) {
            alias = new ArrayList<>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the autoresponder property.
     * 
     * @return
     *     possible object is
     *     {@link MailnameGetInfoType.Autoresponder }
     *     
     */
    public MailnameGetInfoType.Autoresponder getAutoresponder() {
        return autoresponder;
    }

    /**
     * Sets the value of the autoresponder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailnameGetInfoType.Autoresponder }
     *     
     */
    public void setAutoresponder(MailnameGetInfoType.Autoresponder value) {
        this.autoresponder = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link MailnameGetInfoType.Password }
     *     
     */
    public MailnameGetInfoType.Password getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailnameGetInfoType.Password }
     *     
     */
    public void setPassword(MailnameGetInfoType.Password value) {
        this.password = value;
    }

    /**
     * Gets the value of the userGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGuid() {
        return userGuid;
    }

    /**
     * Sets the value of the userGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGuid(String value) {
        this.userGuid = value;
    }

    /**
     * Gets the value of the antivir property.
     * 
     * @return
     *     possible object is
     *     {@link Antivir }
     *     
     */
    public Antivir getAntivir() {
        return antivir;
    }

    /**
     * Sets the value of the antivir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Antivir }
     *     
     */
    public void setAntivir(Antivir value) {
        this.antivir = value;
    }

    /**
     * Gets the value of the outgoingMessagesMboxLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingMessagesMboxLimit() {
        return outgoingMessagesMboxLimit;
    }

    /**
     * Sets the value of the outgoingMessagesMboxLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingMessagesMboxLimit(String value) {
        this.outgoingMessagesMboxLimit = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="content_type" minOccurs="0">
     *           <simpleType>
     *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               <enumeration value="text/html"/>
     *               <enumeration value="text/plain"/>
     *             </restriction>
     *           </simpleType>
     *         </element>
     *         <element name="charset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="attachment" type="{}autoRespAttach" maxOccurs="unbounded" minOccurs="0"/>
     *         <element name="forward" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="end_date" type="{}date" minOccurs="0"/>
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
        "enabled",
        "subject",
        "contentType",
        "charset",
        "text",
        "attachment",
        "forward",
        "endDate"
    })
    public static class Autoresponder {

        @XmlElement(defaultValue = "false")
        protected Boolean enabled;
        protected String subject;
        @XmlElement(name = "content_type")
        protected String contentType;
        protected String charset;
        protected String text;
        protected List<AutoRespAttach> attachment;
        protected String forward;
        @XmlElement(name = "end_date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;

        /**
         * Gets the value of the enabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * Sets the value of the enabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnabled(Boolean value) {
            this.enabled = value;
        }

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubject(String value) {
            this.subject = value;
        }

        /**
         * Gets the value of the contentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContentType() {
            return contentType;
        }

        /**
         * Sets the value of the contentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContentType(String value) {
            this.contentType = value;
        }

        /**
         * Gets the value of the charset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharset() {
            return charset;
        }

        /**
         * Sets the value of the charset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharset(String value) {
            this.charset = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutoRespAttach }
         * 
         * 
         * @return
         *     The value of the attachment property.
         */
        public List<AutoRespAttach> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<>();
            }
            return this.attachment;
        }

        /**
         * Gets the value of the forward property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForward() {
            return forward;
        }

        /**
         * Sets the value of the forward property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForward(String value) {
            this.forward = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
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
     *         <element name="enabled" type="{}boolean" minOccurs="0"/>
     *         <element name="address" type="{}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "enabled",
        "address"
    })
    public static class Forwarding {

        @XmlElement(defaultValue = "false")
        protected Boolean enabled;
        protected List<String> address;

        /**
         * Gets the value of the enabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * Sets the value of the enabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnabled(Boolean value) {
            this.enabled = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         * @return
         *     The value of the address property.
         */
        public List<String> getAddress() {
            if (address == null) {
                address = new ArrayList<>();
            }
            return this.address;
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
     *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         <element name="quota" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         <element name="usage" type="{}int" minOccurs="0"/>
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
        "enabled",
        "quota",
        "usage"
    })
    public static class Mailbox {

        @XmlElement(defaultValue = "true")
        protected Boolean enabled;
        protected Long quota;
        protected BigInteger usage;

        /**
         * Gets the value of the enabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEnabled() {
            return enabled;
        }

        /**
         * Sets the value of the enabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEnabled(Boolean value) {
            this.enabled = value;
        }

        /**
         * Gets the value of the quota property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getQuota() {
            return quota;
        }

        /**
         * Sets the value of the quota property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setQuota(Long value) {
            this.quota = value;
        }

        /**
         * Gets the value of the usage property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getUsage() {
            return usage;
        }

        /**
         * Sets the value of the usage property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setUsage(BigInteger value) {
            this.usage = value;
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
     *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         <element name="type" type="{}passwdType" minOccurs="0"/>
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
        "value",
        "type"
    })
    public static class Password {

        protected String value;
        @XmlSchemaType(name = "string")
        protected PasswdType type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link PasswdType }
         *     
         */
        public PasswdType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link PasswdType }
         *     
         */
        public void setType(PasswdType value) {
            this.type = value;
        }

    }

}
