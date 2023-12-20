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
 * <p>Java class for ResellerCFormButtonsListOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResellerCFormButtonsListOutput">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="result" maxOccurs="unbounded">
 *           <complexType>
 *             <complexContent>
 *               <extension base="{}resultFilterType">
 *                 <sequence minOccurs="0">
 *                   <element name="button" type="{}buttonDataType" maxOccurs="unbounded"/>
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
@XmlType(name = "ResellerCFormButtonsListOutput", propOrder = {
    "result"
})
public class ResellerCFormButtonsListOutput {

    @XmlElement(required = true)
    protected List<ResellerCFormButtonsListOutput.Result> result;

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
     * {@link ResellerCFormButtonsListOutput.Result }
     * 
     * 
     * @return
     *     The value of the result property.
     */
    public List<ResellerCFormButtonsListOutput.Result> getResult() {
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
     *         <element name="button" type="{}buttonDataType" maxOccurs="unbounded"/>
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
        "button"
    })
    public static class Result
        extends ResultFilterType
    {

        protected List<ButtonDataType> button;

        /**
         * Gets the value of the button property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the button property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getButton().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ButtonDataType }
         * 
         * 
         * @return
         *     The value of the button property.
         */
        public List<ButtonDataType> getButton() {
            if (button == null) {
                button = new ArrayList<>();
            }
            return this.button;
        }

    }

}
