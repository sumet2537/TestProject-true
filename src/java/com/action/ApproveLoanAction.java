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
import com.util.EmailUtility;
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
        loanbean.setJudgment(loanform.getJudgment());
        loanbean.setLoanstatusbank(loanform.getLoanstatusbank());
        loanbean.setApprovedamount(loanform.getApprovedamount());
        loanbean.setInstalllments(loanform.getInstalllments());
        loanbean.setTimerepayment(loanform.getTimerepayment());
        loanbean.setPosition(loanform.getPosition());
        loanbean.setCreatedby(loanform.getCreatedby());
        loanbean.setUpdateby(loanform.getUpdateby());

        bean.setLoanstatustype(loanform.getLoanstatusbank());

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
        ArrayList<ApproveLoanBean> list = null;
//        int loanreq_id = loanbean.getLoanreq_id();
        String citizen = loanbean.getCitizen_id();
        try {
            String citizen_id = loanbean.getCitizen_id();
            loanbean = rdao.selectBycitizenid(citizen_id);
//                 list = adao.selectById(loanreq_id);
            list = adao.selectByIdcitizenid(citizen);
            String bank_id = abean.getBank_id();

            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }
        request.getSession().removeAttribute("loanList");
        request.getSession().setAttribute("loan", loanbean);
        request.getSession().setAttribute("loanList", list);
        return mapping.findForward("gotoPageUserViewStatus");
    }
//    user

    public ActionForward Detle(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        ApproveLoanDao adao = new ApproveLoanDao();
        ApproveLoanBean abean = new ApproveLoanBean();
        String msg = "";
        ApproveLoanBean abean1 = new ApproveLoanBean();
        ApproveLoanDao adao1 = new ApproveLoanDao();
        RequestLoanBean loanbean = new RequestLoanBean();
        bankBean bank = new bankBean();
        bankDao bankdao = new bankDao();
        RequestLoanDao rdao = new RequestLoanDao();
        loanbean = (RequestLoanBean) request.getSession().getAttribute("requestLoan");

        try {

            int loanreq_id = loanbean.getLoanreq_id();
            String citizen_id = loanbean.getCitizen_id();

            abean = adao.selectApprove_id(loanform.getApprove_id());
            loanbean = rdao.selectBycitizenid(citizen_id);
            abean1 = adao.selectBy_Id(loanreq_id);
            String bank_id = abean.getBank_id();
            bank = bankdao.selectById(bank_id);
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }
        request.getSession().setAttribute("abean", abean);
        request.getSession().setAttribute("loanbean", loanbean);
        request.getSession().setAttribute("abean", abean1);
        request.getSession().setAttribute("bank", bank);
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
//    ========
//    admin=======

    public ActionForward Detleadmin(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        ApproveLoanDao adao = new ApproveLoanDao();
        ApproveLoanBean abean = new ApproveLoanBean();
        String msg = "";
        ApproveLoanBean abean1 = new ApproveLoanBean();
        ApproveLoanDao adao1 = new ApproveLoanDao();
        RequestLoanBean loanbean = new RequestLoanBean();
        bankBean bank = new bankBean();
        bankDao bankdao = new bankDao();
        RequestLoanDao rdao = new RequestLoanDao();
        try {
            abean = adao.selectApprove_id(loanform.getApprove_id());
             loanbean = rdao.selectById(loanform.getLoanreq_id());
//            loanbean = rdao.selectBycitizenid(citizen_id);
//            abean1 = adao.selectBy_Id(loanreq_id);
            String bank_id = abean.getBank_id();
            bank = bankdao.selectById(bank_id);
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }
        request.getSession().setAttribute("abean", abean);
        request.getSession().setAttribute("loanbean", loanbean);
        request.getSession().setAttribute("abean", abean1);
        request.getSession().setAttribute("bank", bank);
        return mapping.findForward("gotoDetle_ap");

    }

    public ActionForward deleteadmin(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        ApproveLoanForm loanform = (ApproveLoanForm) form;
        ApproveLoanDao adao = new ApproveLoanDao();
        String msg = "";
        List<ApproveLoanBean> loanList = new ArrayList<ApproveLoanBean>();
        ApproveLoanDao dao = new ApproveLoanDao();

        try {
            adao.deleteloanreqId(loanform.getApprove_id());
            loanList = dao.selectAll_aii();
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }
        request.removeAttribute("deletesuccess");
        request.setAttribute("deletesuccess", msg);
        request.getSession().removeAttribute("loanList");
        request.getSession().setAttribute("loanList", loanList);
        return mapping.findForward("gotoPageManagermentAp");
    }

    public ActionForward email(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String msg = "";
        ApproveLoanForm af = (ApproveLoanForm) form;
        ApproveLoanBean approve = new ApproveLoanBean();
        RequestLoanBean bean = new RequestLoanBean();
        EmailUtility emailUtility = new EmailUtility();

        String emailbank = (af.getEmailbank());
        String passmail = (af.getPassemail());
        String email = (af.getEmail());
        String citizenid = (af.getCitizen_id());
        int loanreq = (af.getLoanreq_id());
        String fratname = (af.getFirstname());
        String em = (af.getEmail());

        String url = "<strong><a href=\"http://localhost:8080/TestProject/LoanRequstAction.do?todo=gotoeditfile&loanreq_id=" + " \"  target=\"_blank\">กดที่นี้เพื่อทำการแก้ไข</a></strong>";
        String uuu = "<strong><a href=\"www.google.com\"  target=\"_blank\">ลูกค้ายืนยันเรียบร้อย</a></strong>";
//            String bass = "sumat678@gmail.com";
//
//"homeloansystem@gmail.com", "0833412924brass", email
        try {
            emailUtility.sendEmail(email, passmail, emailbank, "emailผู้ยืนยัน :" + email + "<br>", "ยืนยันการกู้รหัสสินเชื่อคือ :" + loanreq + "<br>" + "เลขบัตรประชาชน :" + citizenid + "<br>" + "ชื่อผู้ยืนยัน :" + fratname + "<br>" + uuu, null);

            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            msg = "no";
        }

        request.removeAttribute("resultemail");
        request.setAttribute("resultemail", msg);
        return mapping.findForward("gotoDetleApprove1");
    }

}
