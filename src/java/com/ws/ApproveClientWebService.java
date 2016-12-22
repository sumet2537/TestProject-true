/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import com.bean.ApproveLoanBean;
import com.dao.RequestLoanDao;
import com.service.ApproverLoanService;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author brass
 */
@WebService(serviceName = "ApproveClientWebService")
public class ApproveClientWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "insertApproveClient")
    public int insertApproveClient(@WebParam(name = "approveLoanBean") ApproveLoanBean approveLoanBean) {
        int result =0;
       
        ApproverLoanService as =new ApproverLoanService();
        result = as.approveLoanClient(approveLoanBean);
       
        
        return result;
    }
}
// RequestLoanBean bean = new RequestLoanBean();
//        RequestLoanDao dao = new RequestLoanDao();
// String a = approveLoanBean.getLoanstatusbank();