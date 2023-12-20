//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProtectedDirGetUserOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProtectedDirGetUserOutput">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="result" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{}resultFilterType">
 *                 <sequence minOccurs="0">
 *                   <element name="data">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="login" type="{}string" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
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
@XmlType(name = "ProtectedDirGetUserOutput", propOrder = {
    "result"
})
public class ProtectedDirGetUserOutput {

    @XmlElement(required = true)
    protected List<ProtectedDirGetUserOutput.Result> result;

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
     * {@link ProtectedDirGetUserOutput.Result }
     * 
     * 
     * @return
     *     The value of the result property.
     */
    public List<ProtectedDirGetUserOutput.Result> getResult() {
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
     *         <element name="data">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="login" type="{}string" minOccurs="0"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
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
        "data"
    })
    public static class Result
        extends ResultFilterType
    {

        protected ProtectedDirGetUserOutput.Result.Data data;

        /**
         * Gets the value of the data property.
         * 
         * @return
         *     possible object is
         *     {@link ProtectedDirGetUserOutput.Result.Data }
         *     
         */
        public ProtectedDirGetUserOutput.Result.Data getData() {
            return data;
        }

        /**
         * Sets the value of the data property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProtectedDirGetUserOutput.Result.Data }
         *     
         */
        public void setData(ProtectedDirGetUserOutput.Result.Data value) {
            this.data = value;
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
         *         <element name="login" type="{}string" minOccurs="0"/>
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
            "login"
        })
        public static class Data {

            protected String login;

            /**
             * Gets the value of the login property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLogin() {
                return login;
            }

            /**
             * Sets the value of the login property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLogin(String value) {
                this.login = value;
            }

        }

    }

}
