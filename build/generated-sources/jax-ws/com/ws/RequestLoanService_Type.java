
package com.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestLoanService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestLoanService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestLoanBean" type="{http://ws.com/}requestLoanBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestLoanService", propOrder = {
    "requestLoanBean"
})
public class RequestLoanService_Type {

    @XmlElement(name = "RequestLoanBean")
    protected RequestLoanBean requestLoanBean;

    /**
     * Gets the value of the requestLoanBean property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLoanBean }
     *     
     */
    public RequestLoanBean getRequestLoanBean() {
        return requestLoanBean;
    }

    /**
     * Sets the value of the requestLoanBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLoanBean }
     *     
     */
    public void setRequestLoanBean(RequestLoanBean value) {
        this.requestLoanBean = value;
    }

}
