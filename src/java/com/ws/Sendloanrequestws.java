/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

/**
 *
 * @author brass
 */
public class Sendloanrequestws {

    public int requestLoanService(com.ws.RequestLoanBean requestLoanBean) {
        com.ws.RequestLoanService_Service service = new com.ws.RequestLoanService_Service();
        com.ws.RequestLoanService port = service.getRequestLoanServicePort();
        return port.requestLoanService(requestLoanBean);
    }
    
}
