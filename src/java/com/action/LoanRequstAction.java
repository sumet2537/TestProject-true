/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.ApproveLoanBean;
import java.io.File;
import com.bean.RequestLoanBean;
import com.bean.UserBean;
import com.dao.ApproveLoanDao;
import com.dao.RequestLoanDao;
import com.dao.UserDao;
import com.dao.coborrowerDao;
import com.form.RequestLoanForm;
import com.service.SendRequstLoanService;
import com.util.FileUploadUtil;
import java.io.FileOutputStream;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author brass
 */
public class LoanRequstAction extends DispatchAction {

    public ActionForward save(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String msg = "";
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean loanbean = new RequestLoanBean();
        RequestLoanBean loanbean2 = new RequestLoanBean();
        RequestLoanBean loanbean1 = new RequestLoanBean();
        String bank1, bank2, bank3, bank4, bank5, bank6, bank7, bank8;
        bank1 = loanform.getBanktype1();
        bank2 = loanform.getBanktype2();
        bank3 = loanform.getBanktype3();
        bank4 = loanform.getBanktype4();
        bank5 = loanform.getBanktype5();
        bank6 = loanform.getBanktype6();
        bank7 = loanform.getBanktype7();
        bank8 = loanform.getBanktype8();
        String bank = bank1 + ("|") + bank2 + ("|") + bank3 + ("|") + bank4 + ("|") + bank5 + ("|") + bank6 + ("|") + bank7 + ("|") + bank8;
//        loanbean.setLoanreq_id(loanform.getLoanreq_id());
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
   loanbean.setProvince(loanform.getProvince());
        loanbean.setAmphur(loanform.getAmphur());
        loanbean.setDistrict(loanform.getDistrict());
        loanbean.setAddress(loanform.getAddress());
        loanbean.setJobtype(loanform.getJobtype());
        loanbean.setHometype(loanform.getHometype());
        loanbean.setTradingprice(loanform.getTradingprice());
        loanbean.setCreditloan(loanform.getCreditloan());
        loanbean.setLncome_per_month(loanform.getLncome_per_month());
        loanbean.setPeriodloan(loanform.getPeriodloan());
        loanbean.setNetprofit(loanform.getNetprofit());
        String citizen = loanform.getCitizen_id();
//        
//        
        FileUploadUtil upload = new FileUploadUtil();
        FileOutputStream outputStream = null;
        FormFile file = null;
        String file1 = loanform.getCopyidcard().getFileName();
        if (file1.equals("")) {
            loanbean.setCopyidcard("ไม่มีไฟล์");
        } else {
            loanbean.setCopyidcard(upload.upload(loanform.getCopyidcard()));
        }
        String file2 = loanform.getCopylicenses().getFileName();
        if (file2.equals("")) {
            loanbean.setCopylicenses("ไม่มีไฟล์");
        } else {
            loanbean.setCopylicenses(upload.upload(loanform.getCopylicenses()));
        }
        String file3 = loanform.getCopydocumenthome().getFileName();
        if (file3.equals("")) {
            loanbean.setCopydocumenthome("ไม่มีไฟล์");
        } else {
            loanbean.setCopydocumenthome(upload.upload(loanform.getCopydocumenthome()));
        }
        String file4 = loanform.getCopymarriage().getFileName();
        if (file4.equals("")) {
            loanbean.setCopymarriage("ไม่มีไฟล์");
        } else {
            loanbean.setCopymarriage(upload.upload(loanform.getCopymarriage()));
        }
        String file5 = loanform.getCopy_rename().getFileName();
        if (file5.equals("")) {
            loanbean.setCopy_rename("ไม่มีไฟล์");
        } else {
            loanbean.setCopy_rename(upload.upload(loanform.getCopy_rename()));
        }
        String file6 = loanform.getSalary_slip().getFileName();
        if (file6.equals("")) {
            loanbean.setSalary_slip("ไม่มีไฟล์");
        } else {
            loanbean.setSalary_slip(upload.upload(loanform.getSalary_slip()));
        }
        String file7 = loanform.getCopy_bankaccount().getFileName();
        if (file7.equals("")) {
            loanbean.setCopy_bankaccount("ไม่มีไฟล์");
        } else {
            loanbean.setCopy_bankaccount(upload.upload(loanform.getCopy_bankaccount()));
        }
        System.out.println("++++++++++++" + loanform.getCopyidcard().getFileName());

//=============================================คุ๋สมรส==========================================================================================
      String statustype =loanform.getStatustype();
        
      if(statustype.equals("สมรส")){
        loanbean1.setCitizen_p(loanform.getCitizen_p());
        loanbean1.setTitle_p(loanform.getTitle_p());
        loanbean1.setFirstname_p(loanform.getFirstname_p());
        loanbean1.setLastname_p(loanform.getLastname_p());
        loanbean1.setBirthdate_p(loanform.getBirthdate_p());
        loanbean1.setAge_p(loanform.getAge_p());
        loanbean1.setNationality_p(loanform.getNationality_p());
        loanbean1.setStatustype_p(loanform.getStatustype_p());
        loanbean1.setMobile_p(loanform.getMobile_p());
        loanbean1.setEmail_p(loanform.getEmail_p());
        loanbean1.setProvince_p(loanform.getProvince_p());
        loanbean1.setAmphur_p(loanform.getAmphur_p());
        loanbean1.setDistrict_p(loanform.getDistrict_p());
        loanbean1.setAddress_p(loanform.getAddress_p());
        loanbean1.setJobtype_p(loanform.getJobtype_p());
        loanbean1.setPeriodloan_p(loanform.getPeriodloan_p());
        loanbean1.setNetprofit_p(loanform.getNetprofit_p());
//        

        String file8 = loanform.getCopyidcard_p().getFileName();
        if (file8.equals("")) {
            loanbean1.setCopyidcard_p("ไม่มีไฟล์");
        } else {
            loanbean1.setCopyidcard_p(upload.upload(loanform.getCopyidcard_p()));
        }
       
        String file9 = loanform.getCopydocumenthome_p().getFileName();
        if (file9.equals("")) {
            loanbean1.setCopydocumenthome_p("ไม่มีไฟล์");
        } else {
            loanbean1.setCopydocumenthome_p(upload.upload(loanform.getCopydocumenthome_p()));
        }
        String file10 = loanform.getSalary_slip_p().getFileName();
        if (file10.equals("")) {
            loanbean1.setSalary_slip_p("ไม่มีไฟล์");
        } else {
            loanbean1.setSalary_slip_p(upload.upload(loanform.getSalary_slip_p()));
        }
        String file11 = loanform.getCopy_bankaccount_p().getFileName();
        if (file11.equals("")) {
            loanbean1.setCopy_bankaccount_p("ไม่มีไฟล์");
        } else {
            loanbean1.setCopy_bankaccount_p(upload.upload(loanform.getCopy_bankaccount_p()));
        }
        System.out.println("++++++++++++" + loanform.getCopyidcard_p().getFileName());
  
        }else{
        }
        loanbean1.setPeriodloan_p(loanform.getPeriodloan_p());
        loanbean1.setNetprofit_p(loanform.getNetprofit_p());
//==================================================ผู้ค้ำประกัน=====================================================================================
        loanbean1.setCitizen_id(loanform.getCitizen_id());
        loanbean1.setCitizen_k(loanform.getCitizen_k());
        loanbean1.setTitle_k(loanform.getTitle_k());
        loanbean1.setFirstname_k(loanform.getFirstname_k());
        loanbean1.setLastname_k(loanform.getLastname_k());
        loanbean1.setBirthdate_k(loanform.getBirthdate_k());
        loanbean1.setAge_k(loanform.getAge_k());
        loanbean1.setNationality_k(loanform.getNationality_k());
        loanbean1.setStatustype_k(loanform.getStatustype_k());
        loanbean1.setMobile_k(loanform.getMobile_k());
        loanbean1.setEmail_k(loanform.getEmail_k());
        loanbean1.setProvince_k(loanform.getProvince_k());
        loanbean1.setAmphur_k(loanform.getAmphur_k());
        loanbean1.setDistrict_k(loanform.getDistrict_k());
        loanbean1.setAddress_k(loanform.getAddress_k());
        loanbean1.setJobtype_k(loanform.getJobtype_k());
        loanbean1.setPeriodloan_k(loanform.getPeriodloan_k());
        loanbean1.setNetprofit_k(loanform.getNetprofit_k());
//        

        String file8 = loanform.getCopyidcard_k().getFileName();
        if (file8.equals("")) {
            loanbean1.setCopyidcard_k("ไม่มีไฟล์");
        } else {
            loanbean1.setCopyidcard_k(upload.upload(loanform.getCopyidcard_k()));
        }
       
        String file9 = loanform.getCopydocumenthome_k().getFileName();
        if (file9.equals("")) {
            loanbean1.setCopydocumenthome_k("ไม่มีไฟล์");
        } else {
            loanbean1.setCopydocumenthome_k(upload.upload(loanform.getCopydocumenthome_k()));
        }
        String file10 = loanform.getSalary_slip_k().getFileName();
        if (file10.equals("")) {
            loanbean1.setSalary_slip_k("ไม่มีไฟล์");
        } else {
            loanbean1.setSalary_slip_k(upload.upload(loanform.getSalary_slip_k()));
        }
        String file11 = loanform.getCopy_bankaccount_k().getFileName();
        if (file11.equals("")) {
            loanbean1.setCopy_bankaccount_k("ไม่มีไฟล์");
        } else {
            loanbean1.setCopy_bankaccount_k(upload.upload(loanform.getCopy_bankaccount_k()));
        }
        System.out.println("++++++++++++" + loanform.getCopyidcard_k().getFileName());
  
//=======================================================================================================================================
        
        loanbean.setBanktype(bank);
        loanbean.setLoanstatustype(loanform.getLoanstatustype());
        loanbean.setCreateby(loanform.getCreateby());
        loanbean.setCreated(loanform.getCreated());
        loanbean.setUpdateby(loanform.getUpdateby());
//        loanbean.setUpdated(loanform.getUpdated());

        RequestLoanDao dao = new RequestLoanDao();
        coborrowerDao codao = new coborrowerDao();
        try {
            dao.insert(loanbean);
            codao.insert(loanbean1);
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
//        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
//        loanList = dao.selectAll();
        request.removeAttribute("requestloanStatus");
        request.setAttribute("requestloanStatus", msg);
        request.getSession().setAttribute("laonreq_id", loanbean);
        return mapping.findForward("gotoPageLoanRequest");

    }

    public ActionForward gotoshowdatarequest(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanDao loandao = new RequestLoanDao();
        RequestLoanBean loanbean = new RequestLoanBean();

        loanbean = loandao.selectById(loanform.getLoanreq_id());

        request.getSession().setAttribute("loanbean", loanbean);
        return mapping.findForward("gotoshowdatarequest");
    }

//      public ActionForward gotoapprov(ActionMapping mapping, ActionForm form,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception  {
//     RequestLoanForm loanform = (RequestLoanForm)form;
//     RequestLoanDao loandao  =new RequestLoanDao();
//      RequestLoanBean loanbean = new RequestLoanBean();
//      
// loanbean = loandao.selectloanstatustype(loanform.getLoanstatustype());
//     
//     request.getSession().setAttribute("loanbean", loanbean);
//        return mapping.findForward("gotoapprov");
//    }
//    =-=-=-=-=-=-=-=-=-=-=-=check============-=-=-=-=-=-=-
    public ActionForward DetleRcheck(ActionMapping mapping, ActionForm form,  //ok
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanDao loandao = new RequestLoanDao();
        coborrowerDao cdao = new coborrowerDao();
        RequestLoanBean bean = loandao.selectById(loanform.getLoanreq_id());
        RequestLoanBean bean1 = cdao.selectById(loanform.getCitizen_id());
        
        request.getSession().removeAttribute("editBean1");
        request.getSession().setAttribute("editBean1", bean1);
        request.getSession().removeAttribute("editBean");
        request.getSession().setAttribute("editBean", bean);
        return mapping.findForward("gotoDetle_requestloan");
    }

    public ActionForward deleteRcheck(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {  //ok
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();
        coborrowerDao dao = new coborrowerDao();
        String msg = "";
        try {
            int loanreq = (loanform.getLoanreq_id());
            bean = loandao.selectById(loanreq);
           loandao.deleteloanreqId(bean.getLoanreq_id());
            dao.deleteloanreqId(bean.getCitizen_id());
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            msg = "no";
        }

        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        loanList = loandao.selectloanstatustypeRcheck();
        request.getSession().setAttribute("loanList", loanList);
        request.removeAttribute("deletesuccess");
        request.setAttribute("deletesuccess", msg);
        return mapping.findForward("gotoPageManagermentLoan");
    }
    //    =-=-=-=-=-=-=-=-=-=-=-=check============-=-=-=-=-=-=-

//       =-=-=-=-=-=-=-=-=-=-=-=approve============-=-=-=-=-=-=-
    public ActionForward DetleAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanDao loandao = new RequestLoanDao();
        RequestLoanBean bean = loandao.selectById(loanform.getLoanreq_id());

        request.getSession().setAttribute("editBean", bean);
        return mapping.findForward("gotoDetle_ap");
    }

    public ActionForward deleteAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();
        coborrowerDao dao = new coborrowerDao();
String msg;
        try {
            int loanreq = (loanform.getLoanreq_id());
            bean = loandao.selectById(loanreq);
           loandao.deleteloanreqId(bean.getLoanreq_id());
            dao.deleteloanreqId(bean.getCitizen_id());
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            msg ="no";
        }
       

        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        loanList = loandao.selectloanstatustypeAp();
        request.getSession().setAttribute("loanList", loanList);
        request.removeAttribute("msg");
        request.setAttribute("msg", msg);
        return mapping.findForward("gotoPageManagermentAp");
    }
    //    =-=-=-=-=-=-=-=-=-=-=-=approve============-=-=-=-=-=-=-

    //       =-=-=-=-=-=-=-=-=-=-=-=NoApprove============-=-=-=-=-=-=-
    public ActionForward DetleNoAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanDao loandao = new RequestLoanDao();
        RequestLoanBean bean = loandao.selectById(loanform.getLoanreq_id());

        request.getSession().setAttribute("editBean", bean);
        return mapping.findForward("gotoDetle_NoAp");
    }

    public ActionForward deleteNoAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();
        coborrowerDao dao = new coborrowerDao();
        ApproveLoanDao adao = new ApproveLoanDao();
String msg;
        try {
            int loanreq = (loanform.getLoanreq_id());
            bean = loandao.selectById(loanreq);
           loandao.deleteloanreqId(bean.getLoanreq_id());
            dao.deleteloanreqId(bean.getCitizen_id());
             adao.deletecitizen(bean.getCitizen_id());
            System.out.println("ok");
             msg = "ok";
        } catch (Exception e) {
             e.printStackTrace();
            msg ="no";
        }
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        loanList = loandao.selectloanstatustypeNoAp();
         request.removeAttribute("msg");
        request.setAttribute("msg", msg);
        request.getSession().setAttribute("loanList", loanList);
        return mapping.findForward("gotoPageManagermentNo");
    }
    //    =-=-=-=-=-=-=-=-=-=-=-=NoApprove============-=-=-=-=-=-=-

    //       =-=-=-=-=-=-=-=-=-=-=-=Nofile============-=-=-=-=-=-=-
    public ActionForward DetleNofile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanDao loandao = new RequestLoanDao();
        RequestLoanBean bean = loandao.selectById(loanform.getLoanreq_id());

        request.getSession().setAttribute("editBean", bean);
        return mapping.findForward("gotoDetle_Nofile");
    }

    public ActionForward deleteNofile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {   //ok
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();
        coborrowerDao dao = new coborrowerDao();
       String msg;
        try {
            int loanreq = (loanform.getLoanreq_id());
            bean = loandao.selectById(loanreq);
           loandao.deleteloanreqId(bean.getLoanreq_id());
            dao.deleteloanreqId(bean.getCitizen_id());
            System.out.println("ok");
             msg = "ok";
        } catch (Exception e) {
             e.printStackTrace();
            msg ="no";
        }
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        loanList = loandao.selectloanstatustypeNofile();
          request.removeAttribute("msg");
        request.setAttribute("msg", msg);
        request.getSession().setAttribute("loanList", loanList);
        return mapping.findForward("gotoPageManagermentNofile");
    }
    //    =-=-=-=-=-=-=-=-=-=-=-=Nofile============-=-=-=-=-=-=-

    //       =-=-=-=-=-=-=-=-=-=-=-=Nofile============-=-=-=-=-=-=-
    public ActionForward DetleRAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanDao loandao = new RequestLoanDao();
        RequestLoanBean bean = loandao.selectById(loanform.getLoanreq_id());

        request.getSession().setAttribute("editBean", bean);
        return mapping.findForward("gotoDetle_RAp");
    }

    public ActionForward deleteRAp(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();
        coborrowerDao dao = new coborrowerDao();
  String msg;
        try {
              int loanreq = (loanform.getLoanreq_id());
            bean = loandao.selectById(loanreq);
           loandao.deleteloanreqId(bean.getLoanreq_id());
            dao.deleteloanreqId(bean.getCitizen_id());
            System.out.println("ok");
             msg = "ok";
        } catch (Exception e) {
             e.printStackTrace();
            msg ="no";
        }
        List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
        loanList = loandao.selectloanstatustypeRapp();
          request.removeAttribute("msg");
        request.setAttribute("msg", msg);
        request.getSession().setAttribute("loanList", loanList);
        return mapping.findForward("gotoPageManagermentR");
    }
    //    =-=-=-=-=-=-=-=-=-=-=-=Nofile============-=-=-=-=-=-=-

    public ActionForward gotoeditfile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean bean = new RequestLoanBean();
        RequestLoanDao loandao = new RequestLoanDao();

        bean = loandao.selectById(loanform.getLoanreq_id());
        request.removeAttribute("bean");
        request.getSession().setAttribute("bean", bean);
        return mapping.findForward("gotoeditfile");
    }

    public ActionForward oneditfile(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String msg = "";
        RequestLoanForm loanform = (RequestLoanForm) form;
        RequestLoanBean loanbean = new RequestLoanBean();
        RequestLoanBean bean = new RequestLoanBean();

        FileUploadUtil upload = new FileUploadUtil();
        FileOutputStream outputStream = null;
        FormFile file = null;
        String file1 = loanform.getCopyidcard().getFileName();
        if (file1.equals("")) {
            loanbean.setCopyidcard(bean.getCopyidcard());
        } else {
            loanbean.setCopyidcard(upload.upload(loanform.getCopyidcard()));
        }
        String file2 = loanform.getCopylicenses().getFileName();
        if (file2.equals("")) {
            loanbean.setCopylicenses(bean.getCopylicenses());
        } else {
            loanbean.setCopylicenses(upload.upload(loanform.getCopylicenses()));
        }
        String file3 = loanform.getCopydocumenthome().getFileName();
        if (file3.equals("")) {
            loanbean.setCopydocumenthome(bean.getCopydocumenthome());
        } else {
            loanbean.setCopydocumenthome(upload.upload(loanform.getCopydocumenthome()));
        }
        String file4 = loanform.getCopymarriage().getFileName();
        if (file4.equals("")) {
            loanbean.setCopymarriage(bean.getCopymarriage());
        } else {
            loanbean.setCopymarriage(upload.upload(loanform.getCopymarriage()));
        }
        String file5 = loanform.getCopy_rename().getFileName();
        if (file5.equals("")) {
            loanbean.setCopy_rename(bean.getCopy_rename());
        } else {
            loanbean.setCopy_rename(upload.upload(loanform.getCopy_rename()));
        }
        String file6 = loanform.getSalary_slip().getFileName();
        if (file6.equals("")) {
            loanbean.setSalary_slip(bean.getSalary_slip());
        } else {
            loanbean.setSalary_slip(upload.upload(loanform.getSalary_slip()));
        }
        String file7 = loanform.getCopy_bankaccount().getFileName();
        if (file7.equals("")) {
            loanbean.setCopy_bankaccount(bean.getCopy_bankaccount());
        } else {
            loanbean.setCopy_bankaccount(upload.upload(loanform.getCopy_bankaccount()));
        }
        System.out.println("++++++++++++" + loanform.getCopyidcard().getFileName());

        loanbean.setLoanstatustype(loanform.getLoanstatustype());
        loanbean.setLoanreq_id(loanform.getLoanreq_id());
//        loanbean.setCreateby(loanform.getCreateby());
//        loanbean.setCreated(loanform.getCreated());
//        loanbean.setUpdateby(loanform.getUpdateby());

        RequestLoanDao dao = new RequestLoanDao();
        try {
            dao.updatefile(loanbean);
            System.out.println("ok");
            msg = "ok";
        } catch (Exception e) {
            System.out.println("no");
            e.printStackTrace();
            msg = "no";

        }
        request.removeAttribute("requestloanStatus");
        request.setAttribute("requestloanStatus", msg);
        return mapping.findForward("gotoeditfile");
    }

//    public ActionForward gotoPageUserViewStatus(ActionMapping mapping, ActionForm form,
//            HttpServletRequest request, HttpServletResponse response)
//            throws Exception {
//        RequestLoanForm loanform = (RequestLoanForm) form;
//        ApproveLoanBean abean = new ApproveLoanBean();
//        ApproveLoanDao adao = new ApproveLoanDao();
//        RequestLoanBean loanbean = new RequestLoanBean();
//        ArrayList<RequestLoanBean> listbean = null;
//        RequestLoanDao rdao = new RequestLoanDao();
//       String msg = "";
//       loanbean = (RequestLoanBean) request.getSession().getAttribute("requestLoan");
//       
//        try {
//            String citizen_id = loanbean.getCitizen_id();
//        loanbean = rdao.selectBycitizenid(citizen_id);
//            System.out.println("ok");
//            msg = "ok";
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("no");
//            msg = "no";
//        }
//        request.getSession().setAttribute("loanbean", loanbean);
//        return mapping.findForward("gotoPageUserViewStatus");
//    }
}
