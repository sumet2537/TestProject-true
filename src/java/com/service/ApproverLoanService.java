/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.bean.ApproveLoanBean;
import com.bean.RequestLoanBean;
import com.dao.ApproveLoanDao;
import com.dao.RequestLoanDao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brass
 */
public class ApproverLoanService {
    
    public int approveLoanClient(ApproveLoanBean approveLoanBean){
        ApproveLoanDao approveLoanDao =new ApproveLoanDao();
        RequestLoanDao dao = new RequestLoanDao();
        RequestLoanBean bean = new  RequestLoanBean();
        int result = 0;
        try {
            result = approveLoanDao.insert(approveLoanBean);
            bean.setLoanstatustype(approveLoanBean.getLoanstatusbank());
            bean.setLoanreq_id(approveLoanBean.getLoanreq_id());
            bean.setUpdateby(approveLoanBean.getUpdateby());
            dao.updateBystatus(bean);
        } catch (Exception ex) {
            Logger.getLogger(ApproverLoanService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
