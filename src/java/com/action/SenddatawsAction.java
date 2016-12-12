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
import com.ws.RequsetloanWs;
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

    public ActionForward insertbank(ActionMapping mapping, ActionForm form,

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
<<<<<<< HEAD
        
        loanbean.setCopyidcard(loanform.getCopyidcard());
        loanbean.setCopylicenses(loanform.getCopylicenses());
        loanbean.setCopydocumenthome(loanform.getCopydocumenthome());
        loanbean.setCopymarriage(loanform.getCopymarriage());
        loanbean.setCopyRename(loanform.getCopy_rename());
        loanbean.setSalarySlip(loanform.getSalary_slip());
        loanbean.setCopyBankaccount(loanform.getCopy_bankaccount());
        
=======
        FileUploadUtil upload = new FileUploadUtil();
        FileOutputStream outputStream = null;
        FormFile file = null;
        String file1 = loanform.getCopyidcard();
        if (file1.equals("")) {
            loanbean.setCopyidcard("nofile");

        } else {
            loanbean.setCopyidcard(file1);
            loanbean.setCopyidcardbyte(upload.fileToByteArray(file1));
        }
        String file2 = loanform.getCopylicenses();
        if (file2.equals("")) {
            loanbean.setCopylicenses("nofile");
        } else {
            loanbean.setCopylicenses(file2);
            loanbean.setCopylicensesbyte(upload.fileToByteArray(file2));

        }
        String file3 = loanform.getCopydocumenthome();
        if (file3.equals("")) {
            loanbean.setCopydocumenthome("nofile");
        } else {
            loanbean.setCopydocumenthome(file3);
            loanbean.setCopydocumenthomebyte(upload.fileToByteArray(file3));
        }
        String file4 = loanform.getCopymarriage();
        if (file4.equals("")) {
            loanbean.setCopymarriage("nofile");
        } else {
            loanbean.setCopymarriage(file4);
            loanbean.setCopymarriagebyte(upload.fileToByteArray(file4));
        }
        String file5 = loanform.getCopy_rename();
        if (file5.equals("")) {
            loanbean.setCopyRename("nofile");
        } else {
            loanbean.setCopyRename(file5);
            loanbean.setCopyRenamebyte(upload.fileToByteArray(file5));
        }
        String file6 = loanform.getSalary_slip();
        if (file6.equals("")) {
            loanbean.setSalarySlip("nofile");
        } else {
            loanbean.setSalarySlip(file6);
            loanbean.setSalarySlipbyte(upload.fileToByteArray(file6));
        }
        String file7 = loanform.getCopy_bankaccount();
        if (file7.equals("")) {
            loanbean.setCopyBankaccount("nofile");
        } else {
            loanbean.setCopyBankaccount(file7);
             loanbean.setCopyBankaccountbyte(upload.fileToByteArray(file7));
        }
        System.out.println("++++++++++++" + loanform.getCopyidcard());

//        loanbean.setCopyidcard(loanform.getCopyidcard());
//        loanbean.setCopylicenses(loanform.getCopylicenses());
//        loanbean.setCopydocumenthome(loanform.getCopydocumenthome());
//        loanbean.setCopymarriage(loanform.getCopymarriage());
//        loanbean.setCopy_rename(loanform.getCopy_rename());
//        loanbean.setSalary_slip(loanform.getSalary_slip());
//        loanbean.setCopy_bankaccount(loanform.getCopy_bankaccount());
>>>>>>> origin/master
        loanbean.setLoanstatustype(loanform.getLoanstatustype());
        loanbean.setCreateby(loanform.getCreateby());
        loanbean.setCreated(loanform.getCreated());
        loanbean.setUpdateby(loanform.getUpdateby());
        loanbean.setUpdated(loanform.getUpdated());


        RequestLoanDao dao = new RequestLoanDao();
        RequsetloanWs send = new RequsetloanWs();
        send.requestLoanService(loanbean);
///        request.getSession().setAttribute("loanList", loanList);
        return mapping.findForward("gotorequestloansuccess");

    }

}
