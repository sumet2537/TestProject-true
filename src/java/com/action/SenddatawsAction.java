/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.RequestLoanBean;
import com.dao.RequestLoanDao;
import com.form.RequestLoanForm;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author brass
 */
public class SenddatawsAction extends DispatchAction {

     public ActionForward insertbank(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean loanbean = new RequestLoanBean();
//        loanbean.setLoan_id(0);
        loanbean.setLoanreq_id(loanform.getLoanreq_id());
        loanbean.setCitizen_id(loanform.getCitizen_id());
        loanbean.setTitle_type(loanform.getTitle_type());
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
        loanbean.setLncome_per_month(loanform.getLncome_per_month());
        loanbean.setPeriodloan(loanform.getPeriodloan());
        loanbean.setNetprofit(loanform.getNetprofit());
//        
//        
//        FileUploadUtil upload = new FileUploadUtil();
//       FileOutputStream outputStream = null;
//        FormFile file = null;
//        String file1 = loanform.getCopyidcard().getFileName();
//        if (file1.equals("")) {
//            loanbean.setCopyidcard("nofile");
//        } else {
//       loanbean.setCopyidcard(upload.fileinputStream(loanform.getCopyidcard()));
//        }
//        String file2 = loanform.getCopylicenses().getFileName();
//       if(file2.equals("")){
//           loanbean.setCopylicenses("nofile");
//       }else{
//       loanbean.setCopylicenses(upload.fileinputStream(loanform.getCopylicenses()));
//       }
//          String file3 = loanform.getCopydocumenthome().getFileName();
//       if(file3.equals("")){
//           loanbean.setCopydocumenthome("nofile");
//       }else{
//       loanbean.setCopydocumenthome(upload.fileinputStream(loanform.getCopydocumenthome()));
//       }
//          String file4 = loanform.getCopymarriage().getFileName();
//       if(file4.equals("")){
//           loanbean.setCopymarriage("nofile");
//       }else{
//       loanbean.setCopymarriage(upload.fileinputStream(loanform.getCopymarriage()));
//       }
//            String file5 = loanform.getCopy_rename().getFileName();
//       if(file5.equals("")){
//           loanbean.setCopy_rename("nofile");
//       }else{
//       loanbean.setCopy_rename(upload.fileinputStream(loanform.getCopy_rename()));
//       }
//            String file6 = loanform.getSalary_slip().getFileName();
//       if(file6.equals("")){
//           loanbean.setSalary_slip("nofile");
//       }else{
//       loanbean.setSalary_slip(upload.fileinputStream(loanform.getSalary_slip()));
//       }
//            String file7 = loanform.getCopy_bankaccount().getFileName();
//       if(file7.equals("")){
//           loanbean.setCopy_bankaccount("nofile");
//       }else{
//       loanbean.setCopy_bankaccount(upload.fileinputStream(loanform.getCopy_bankaccount()));
//       }
//        System.out.println("++++++++++++"+loanform.getCopyidcard().getFileName());

//        loanbean.setCopyidcard(loanform.getCopyidcard());
//        loanbean.setCopylicenses(loanform.getCopylicenses());
//        loanbean.setCopydocumenthome(loanform.getCopydocumenthome());
//        loanbean.setCopymarriage(loanform.getCopymarriage());
//        loanbean.setCopy_rename(loanform.getCopy_rename());
//        loanbean.setSalary_slip(loanform.getSalary_slip());
//        loanbean.setCopy_bankaccount(loanform.getCopy_bankaccount());
        
        loanbean.setLoanstatustype(loanform.getLoanstatustype());
        loanbean.setCreateby(loanform.getCreateby());
        loanbean.setCreated(loanform.getCreated());
        loanbean.setUpdateby(loanform.getUpdateby());
//        loanbean.setUpdated(loanform.getUpdated());

        RequestLoanDao dao = new RequestLoanDao();
        dao.insertbank(loanbean);
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        loanList = dao.selectAll();

        request.getSession().setAttribute("loanList", loanList);
        return mapping.findForward("gotorequestloansuccess");

    }

}
