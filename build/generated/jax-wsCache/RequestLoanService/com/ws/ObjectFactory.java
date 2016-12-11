
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestLoanService_QNAME = new QName("http://ws.com/", "RequestLoanService");
    private final static QName _RequestLoanServiceResponse_QNAME = new QName("http://ws.com/", "RequestLoanServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestLoanService_Type }
     * 
     */
    public RequestLoanService_Type createRequestLoanService_Type() {
        return new RequestLoanService_Type();
    }

    /**
     * Create an instance of {@link RequestLoanServiceResponse }
     * 
     */
    public RequestLoanServiceResponse createRequestLoanServiceResponse() {
        return new RequestLoanServiceResponse();
    }

    /**
     * Create an instance of {@link RequestLoanBean }
     * 
     */
    public RequestLoanBean createRequestLoanBean() {
        return new RequestLoanBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestLoanService_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "RequestLoanService")
    public JAXBElement<RequestLoanService_Type> createRequestLoanService(RequestLoanService_Type value) {
        return new JAXBElement<RequestLoanService_Type>(_RequestLoanService_QNAME, RequestLoanService_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestLoanServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "RequestLoanServiceResponse")
    public JAXBElement<RequestLoanServiceResponse> createRequestLoanServiceResponse(RequestLoanServiceResponse value) {
        return new JAXBElement<RequestLoanServiceResponse>(_RequestLoanServiceResponse_QNAME, RequestLoanServiceResponse.class, null, value);
    }

}
