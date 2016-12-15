/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.action;

import com.bean.RequestLoanBean;
import com.bean.UserBean;
import com.dao.RequestLoanDao;
import com.dao.UserDao;
import com.form.RequestLoanForm;
import com.form.SenddatawsForm;
import com.util.EmailUtility;
import static com.util.EmailUtility.sendEmail;
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
        String msgmascess = "";
        SenddatawsForm loanform = (SenddatawsForm) form;
        RequestLoanBean loan = new RequestLoanBean();
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

        FileUploadUtil upload = new FileUploadUtil();
        FileOutputStream outputStream = null;
        FormFile file = null;
        String file1 = loanform.getCopyidcard();
        if (file1.equals("")) {
            loanbean.setCopyidcard(loan.getCopyidcard());
        } else {
            loanbean.setCopyidcard(file1);
            loanbean.setCopyidcardbyte(upload.fileToByteArray(file1));
        }

        String file2 = loanform.getCopylicenses();
        if (file2.equals("")) {
            loanbean.setCopylicenses(loan.getCopylicenses());
        } else {
            loanbean.setCopylicenses(file2);
            loanbean.setCopylicensesbyte(upload.fileToByteArray(file2));

        }
        String file3 = loanform.getCopydocumenthome();
        if (file3.equals("")) {
            loanbean.setCopydocumenthome(loan.getCopydocumenthome());
        } else {
            loanbean.setCopydocumenthome(file3);
            loanbean.setCopydocumenthomebyte(upload.fileToByteArray(file3));
        }
        String file4 = loanform.getCopymarriage();
        if (file4.equals("")) {
            loanbean.setCopymarriage(loan.getCopymarriage());
        } else {
            loanbean.setCopymarriage(file4);
            loanbean.setCopymarriagebyte(upload.fileToByteArray(file4));
        }
        String file5 = loanform.getCopy_rename();
        if (file5.equals("")) {
            loanbean.setCopyRename(loan.getCopydocumenthome());
        } else {
            loanbean.setCopyRename(file5);
            loanbean.setCopyRenamebyte(upload.fileToByteArray(file5));
        }
        String file6 = loanform.getSalary_slip();
        if (file6.equals("")) {
            loanbean.setSalarySlip(loan.getSalary_slip());
        } else {
            loanbean.setSalarySlip(file6);
            loanbean.setSalarySlipbyte(upload.fileToByteArray(file6));
        }
        String file7 = loanform.getCopy_bankaccount();
        if (file7.equals("")) {
            loanbean.setCopyBankaccount(loan.getCopy_bankaccount());
        } else {
            loanbean.setCopyBankaccount(file7);
            loanbean.setCopyBankaccountbyte(upload.fileToByteArray(file7));
        }
        System.out.println("++++++++++++" + loanform.getCopyidcard());

        loanbean.setLoanstatustype(loanform.getLoanstatustype());
        loanbean.setCreateby(loanform.getCreateby());
        loanbean.setCreated(loanform.getCreated());
        loanbean.setUpdateby(loanform.getUpdateby());
        loanbean.setUpdated(loanform.getUpdated());

       
        RequestLoanDao dao = new RequestLoanDao();
        loan.setLoanstatustype(loanform.getLoanstatustype());
        loan.setLoanreq_id(loanform.getLoanreq_id());
        loan.setUpdateby("Admin");
//        atill update status ยังอัพเดจสถานะไม่ได้    
        try {
            dao.updateBystatus(loan);
            Sendloanrequestws sendloanrequestws = new Sendloanrequestws();
            sendloanrequestws.requestLoanService(loanbean);
            System.out.println("ok");
            msgmascess = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            msgmascess  ="no";
        }

//         List<RequestLoanBean> loanList = new ArrayList<RequestLoanBean>();
//        loanList = dao.selectloanstatustypeRcheck();
//        request.getSession().setAttribute("loanList", loanList);
//        return mapping.findForward("gotoPageManagermentLoan");
        request.removeAttribute("detleloan");
        request.setAttribute("confrimbank", msgmascess);
        return mapping.findForward("gotoDetle_requestloan");

    }

    public ActionForward editapproves(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String e_msg= "";
        SenddatawsForm af = (SenddatawsForm) form;
        UserBean userBean = null;
        RequestLoanDao dao = new RequestLoanDao();
        UserDao userDao = new UserDao();
        userBean = new UserBean();
        RequestLoanBean beanT = new RequestLoanBean();
        beanT = dao.selectById(af.getLoanreq_id());
        RequestLoanBean bean = new RequestLoanBean();
        EmailUtility emailUtility = new EmailUtility();
        String file1, file2, file3, file4, file5, file6, file7;
        file1 = af.getFile1();
        file2 = af.getFile2();
        file3 = af.getFile3();
        file4 = af.getFile4();
        file5 = af.getFile5();
        file6 = af.getFile6();
        file7 = af.getFile7();
        String msg = "";
        String msgfile1 = "";
        String msgfile2 = "";
        String msgfile3 = "";
        String msgfile4 = "";
        String msgfile5 = "";
        String msgfile6 = "";
        String msgfile7 = "";

        bean.setLoanreq_id(af.getLoanreq_id());
        bean.setLoanstatustype("เอกสารไม่ผ่าน");
        try {
            if (file1 == null) {
                bean.setCopyidcard(beanT.getCopyidcard());
            } else {
                bean.setCopyidcard("fileedit");
                msgfile1 = "ไฟล์สำเนาบัตรประจำตัวประชาชน";
            }
            if (file2 == null) {
                bean.setCopylicenses(beanT.getCopylicenses());
            } else {
                bean.setCopylicenses("fileedit");
                msgfile2 = "สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ)";
            }
            if (file3 == null) {
                bean.setCopydocumenthome(beanT.getCopydocumenthome());
            } else {
                bean.setCopydocumenthome("fileedit");
                msgfile3 = "สำเนาทะเบียนบ้าน ";
            }
            if (file4 == null) {
                bean.setCopymarriage(beanT.getCopymarriage());
            } else {
                bean.setCopymarriage("fileedit");
                msgfile4 = "สำเนาทะเบียนสมรส/ใบหย่า ";
            }
            if (file5 == null) {
                bean.setCopy_rename(beanT.getCopy_rename());
            } else {
                bean.setCopy_rename("fileedit");
                msgfile5 = "ใบเปลี่ยนชื่อ-สกุล (ทุกใบ) ";
            }
            if (file6 == null) {
                bean.setSalary_slip(beanT.getSalary_slip());
            } else {
                bean.setSalary_slip("fileedit");
                msgfile5 = "สลิปเงินเดือน  ";
            }
            if (file7 == null) {
                bean.setCopy_bankaccount(beanT.getCopy_bankaccount());
            } else {
                bean.setCopy_bankaccount("fileedit");
                msgfile5 = "สำเนาบัญชีธนาคาร  ";
            }
            String url = "<strong><a href=\"http://localhost:8080/TestProject/LoanRequstAction.do?todo=gotoeditfile&loanreq_id=" + beanT.getLoanreq_id() + " \"  target=\"_blank\">กดที่นี้เพื่อทำการแก้ไข</a></strong>";
            String uuu = "<strong><a href=\"www.google.com\"  target=\"_blank\">กดที่นี้เพื่อทำการแก้ไข</a></strong>";
            userBean = (UserBean) request.getSession().getAttribute("useraccount");
//            String bass = "sumat678@gmail.com";

            emailUtility.sendEmail("chakknrt123@gmail.com","chakknrt111", "chakknrt789@hotmail.com", af.getE_her(), "หมายเหตุ" + af.getE_dtel() + "<br>" + "ไฟล์ที่ต้องแก้ไข" + "<br>" + msgfile1 + "<br>"
                    + msgfile2 + "<br>" + msgfile3 + "<br>" + msgfile4 + "<br>" + msgfile5 + "<br> " + msgfile6 + "<br> " + msgfile7 + "<br> " + url, null);

            dao.updatefile(bean);
            System.out.println("ok");
            e_msg = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            e_msg = "no";
        }

        request.removeAttribute("resultemail");
        request.setAttribute("resultemail", e_msg);
        return mapping.findForward("gotoDetle_requestloan");
    }

    public ActionForward noapproves(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String mascess = null;
        SenddatawsForm loanform = (SenddatawsForm) form;
        RequestLoanBean loan = new RequestLoanBean();
        RequestLoanDao dao = new RequestLoanDao();
        loan.setLoanstatustype(loanform.getLoanstatustype());
        loan.setLoanreq_id(loanform.getLoanreq_id());
        loan.setUpdateby("Admin");

        try {
            dao.updateBystatus(loan);
            System.out.println("yes");
            mascess = "ok";
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("no");
            mascess = "no";
        }

        request.removeAttribute("detleloan");
        request.setAttribute("detleloan", mascess);
        return mapping.findForward("gotoDetle_requestloan");

    }
}
