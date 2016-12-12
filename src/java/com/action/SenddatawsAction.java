/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.RequestLoanBean;
import com.dao.RequestLoanDao;
import com.form.RequestLoanForm;
import com.form.SenddatawsForm;
import com.util.FileUploadUtil;
import com.ws.Sendloanrequestws;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author brass
 */
public class SenddatawsAction extends DispatchAction {

     public  ActionForward insertbank(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//        RequestLoanForm loanform = (RequestLoanForm) form;
        SenddatawsForm loanform = (SenddatawsForm)form;
        RequestLoanBean loan = new RequestLoanBean();
        Sendloanrequestws sendloanrequestws = new Sendloanrequestws();
        com.ws.RequestLoanBean loanbean = new com.ws.RequestLoanBean();
//        loanbean.setLoan_id(0);
        loanbean.setLoanreqId(loanform.getLoanreq_id());
        loanbean.setCitizenId(loanform.getCitizen_id());
        loanbean.setTitleType(loanform.getTitle_type());
        loanbean.setFirstName(loanform.getFirstName());
        loanbean.setLastName(loanform.getLastName());
        loanbean.setBirthdate(loanform.getBirthdate());
        loanbean.setAge(loanform.getAge());
        loanbean.setNationality(loanform.getNationality());
        loanbean.setStatustype(loanform.getStatustype());
        loanbean.setMobile(loanform.getMobile());
        loanbean.setEmail(loanform.getEmail());
        loanbean.setAddressregistration(loanform.getAddressregistration());
        loanbean.setAddresscurrent(loanform.getAddresscurrent());
        loanbean.setAddresssenddoc(loanform.getAddresssenddoc());
        loanbean.setJobtype(loanform.getJobtype());
        loanbean.setHometype(loanform.getHometype());
        loanbean.setTradingprice(loanform.getTradingprice());
        loanbean.setCreditloan(loanform.getCreditloan());
        loanbean.setLncomePerMonth(loanform.getLncome_per_month());
        loanbean.setPeriodloan(loanform.getPeriodloan());
        loanbean.setNetprofit(loanform.getNetprofit());
//                
        
        loanbean.setCopyidcard(loanform.getCopyidcard());
        loanbean.setCopylicenses(loanform.getCopylicenses());
        loanbean.setCopydocumenthome(loanform.getCopydocumenthome());
        loanbean.setCopymarriage(loanform.getCopymarriage());
        loanbean.setCopyRename(loanform.getCopy_rename());
        loanbean.setSalarySlip(loanform.getSalary_slip());
        loanbean.setCopyBankaccount(loanform.getCopy_bankaccount());
        
        loanbean.setLoanstatustype(loanform.getLoanstatustype());
        loanbean.setCreateby(loanform.getCreateby());
        loanbean.setCreated(loanform.getCreated());
        loanbean.setUpdateby(loanform.getUpdateby());
        loanbean.setUpdated(loanform.getUpdated());
       
//        RequestLoanDao dao = new RequestLoanDao();
         
//        return sendloanrequestws.requestLoanService(requestLoanService);

        sendloanrequestws.requestLoanService(loanbean);
     request.getSession().setAttribute("sendloanrequestws", sendloanrequestws);
      return mapping.findForward("gotoPageManagermentLoan");
    }

}
