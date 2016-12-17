/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.ApproveLoanBean;
import com.bean.RequestLoanBean;
import com.bean.bankBean;
import com.dao.ApproveLoanDao;
import com.dao.RequestLoanDao;
import com.dao.bankDao;
import com.form.ApproveLoanForm;
import com.form.RequestLoanForm;
import com.util.FileUploadUtil;
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
public class ApproveLoanAction extends DispatchAction {

 public ActionForward saveapprove(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String msg = "";
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        ApproveLoanBean loanbean = new ApproveLoanBean();
        RequestLoanBean bean = new RequestLoanBean();
        
        loanbean.setApprove_id(loanform.getApprove_id());
        loanbean.setLoanreq_id(loanform.getLoanreq_id());
        loanbean.setBank_id(loanform.getBank_id());
        loanbean.setCitizen_id(loanform.getCitizen_id());
        loanbean.setFirstName(loanform.getFirstName());
        loanbean.setJudgment(loanform.getJudgment());
        loanbean.setLoanstatusbank(loanform.getLoanstatusbank());
        loanbean.setApprovedamount(loanform.getApprovedamount());
        loanbean.setInstalllments(loanform.getInstalllments());
        loanbean.setTimerepayment(loanform.getTimerepayment());
        loanbean.setPosition(loanform.getPosition());
        loanbean.setCreatedby(loanform.getCreatedby());
        loanbean.setUpdateby(loanform.getUpdateby());
        
        
        bean.setLoanstatustype(loanform.getLoanstatustype());
  
        RequestLoanDao dao = new RequestLoanDao();
         ApproveLoanDao Adao = new ApproveLoanDao();
        try {
            Adao.insert(loanbean);
             dao.updateBystatus(bean);
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            System.out.println("no");
            e.printStackTrace();
            msg = "no";

        }
////        webservice
//        SendRequstLoanService loanService = new SendRequstLoanService();
//        loanService.sendRequstLoan(loanform);
//        
//        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
//        loanList = dao.selectAll();
        request.removeAttribute("requestloanStatus");
        request.setAttribute("requestloanStatus", msg);
        return mapping.findForward("gotoPageLoanRequest");

    }

    public ActionForward gotoPageUserViewStatus(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        ApproveLoanBean abean = new ApproveLoanBean();
        ApproveLoanDao adao = new ApproveLoanDao();
        RequestLoanBean loanbean = new RequestLoanBean();
        bankBean bank = new bankBean();
         bankDao bakdao = new bankDao();
        RequestLoanDao rdao = new RequestLoanDao();
       String msg = "";
       loanbean = (RequestLoanBean) request.getSession().getAttribute("requestLoan");
//        ArrayList<ApproveLoanBean> list1 = null;
        ArrayList<ApproveLoanBean> list = null;
              int loanreq_id = loanbean.getLoanreq_id();
//              String citizen = abean.getCitizen_id();
        try {
            String citizen_id = loanbean.getCitizen_id();
        loanbean = rdao.selectBycitizenid(citizen_id);
        
//        list1 = adao.selectByIdcitizen(citizen_id);
        list = adao.selectById(loanreq_id);
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }
        request.getSession().removeAttribute("loanList");
//        request.getSession().removeAttribute("loan");
        request.getSession().setAttribute("loan", loanbean);
        request.getSession().setAttribute("loanList", list);
//        request.getSession().setAttribute("loanList1", list1);
        return mapping.findForward("gotoPageUserViewStatus");
    }
    
    
     public ActionForward Detle(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        ApproveLoanDao adao = new ApproveLoanDao();
        ApproveLoanBean abean = new ApproveLoanBean();
       String msg = "";
         try {
         abean = adao.selectApprove_id(loanform.getApprove_id());
             
             System.out.println("ok");
             msg = "ok";
         } catch (Exception e) {
             e.printStackTrace();
             System.out.println("no");
             msg = "no";
         }
          request.getSession().setAttribute("bank",abean);
        return mapping.findForward("gotoDetleApprove1");
    }
     
    public ActionForward delete(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();
        ApproveLoanBean abean = new ApproveLoanBean();
        RequestLoanDao rdao = new RequestLoanDao();
        RequestLoanBean loanbean = new RequestLoanBean();
        ApproveLoanDao adao = new ApproveLoanDao();
        bankDao bankdao = new bankDao();
        bankBean bankbean = new bankBean();
        String msg = "";
        loanbean = (RequestLoanBean) request.getSession().getAttribute("requestLoan");
        ArrayList<ApproveLoanBean> list1 = null;
        ArrayList<ApproveLoanBean> list = null;
        String bank_id = abean.getBank_id();
              int loanreq_id = loanbean.getLoanreq_id();
        try {
            String citizen_id = loanbean.getCitizen_id();
          adao.deleteloanreqId(loanform.getApprove_id());    //delete approve by id approve
          
        loanbean = rdao.selectBycitizenid(citizen_id);      //select by citizen id table requestloan
        list1 = adao.selectByIdcitizen(citizen_id);        ///select by citizen id bable approve 
        list = adao.selectById(loanreq_id);     //select by loanreq id table approve ที่อนุมัติแล้วของคนนี้
        bankbean = bankdao.selectById(bank_id);
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }
        request.getSession().setAttribute("loanList1", list1);
        request.getSession().setAttribute("loanList", list);
       
        request.removeAttribute("deletesuccess");
        request.setAttribute("deletesuccess", msg);
        return mapping.findForward("gotoPageUserViewStatus");
    }
//    ApproveLoanForm loanform = (ApproveLoanForm) form;
//         ApproveLoanBean abean = new ApproveLoanBean();
//        ApproveLoanDao adao = new ApproveLoanDao();
//        RequestLoanBean loanbean = new RequestLoanBean();
//        bankBean bank = new bankBean();
//         bankDao bankdao = new bankDao();
//        RequestLoanDao rdao = new RequestLoanDao();
//       String msg = "";
//        loanbean = (RequestLoanBean) request.getSession().getAttribute("requestLoan");
//         try {
//         abean = adao.selectApprove_id(loanform.getApprove_id());
//             String bank_id = abean.getBank_id();
//         int loanreq_id = loanbean.getLoanreq_id();
//             String citizen_id = loanbean.getCitizen_id();
//             abean = adao.selectByIdcitizen_id(citizen_id);
//             
//              abean = adao.selectBy_Id(loanreq_id); 
//             bank = bankdao.selectById(bank_id);
//             System.out.println("ok");
//             msg = "ok";
//         } catch (Exception e) {
//             e.printStackTrace();
//             System.out.println("no");
//             msg = "no";
//         }
//          request.getSession().setAttribute("bank", bank);
//          request.getSession().setAttribute("abean", abean);
////          request.getSession().setAttribute("loanbean", abean);
    
}
