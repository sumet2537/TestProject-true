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

        loanbean.setStatustype(loanform.getStatustype());
        loanbean.setMobile(loanform.getMobile());
        loanbean.setEmail(loanform.getEmail());
        loanbean.setNationality(loanform.getNationality());
        loanbean.setJobtype(loanform.getJobtype());
        loanbean.setProvince(loanform.getProvince());
        loanbean.setAmphur(loanform.getAmphur());
        loanbean.setDistrict(loanform.getDistrict());
        loanbean.setAddress(loanform.getAddress());

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

        //=============================================คุ๋สมรส==========================================================================================
        String statustype = loanform.getStatustype();
        if (statustype.equals("สมรส")) {
            loanbean.setCitizenP(loanform.getCitizen_p());
            loanbean.setTitleP(loanform.getTitle_p());
            loanbean.setFirstnameP(loanform.getFirstname_p());
            loanbean.setLastnameP(loanform.getLastname_p());
            loanbean.setBirthdateP(loanform.getBirthdate_p());
            loanbean.setAgeP(loanform.getAge_p());
            loanbean.setNationalityP(loanform.getNationality_p());
            loanbean.setStatustypeP(loanform.getStatustype_p());
            loanbean.setMobileP(loanform.getMobile_p());
            loanbean.setEmailP(loanform.getEmail_p());
            loanbean.setProvinceP(loanform.getProvince_p());
            loanbean.setAmphurP(loanform.getAmphur_p());
            loanbean.setDistrictP(loanform.getDistrict_p());
            loanbean.setAddressP(loanform.getAddress_p());
            loanbean.setJobtypeP(loanform.getJobtype_p());
            loanbean.setPeriodloanP(loanform.getPeriodloan_p());
            loanbean.setNetprofitP(loanform.getNetprofit_p());
//        
            loanbean.setCopyidcardP(loanform.getCopyidcard_p());
            loanbean.setCopydocumenthomeP(loanform.getCopydocumenthome_p());
            loanbean.setSalarySlipP(loanform.getSalary_slip_p());
            loanbean.setCopyBankaccountP(loanform.getCopy_bankaccount_p());

            String file8 = loanform.getCopyidcard_p();
            if (file8.equals("")) {
                loanbean.setCopyidcardP(loan.getCopyidcard_p());
            } else {
                loanbean.setCopyidcardP(file8);
                loanbean.setCopyidcardPbyte(upload.fileToByteArray(file8));
            }

            String file9 = loanform.getCopydocumenthome_p();
            if (file9.equals("")) {
                loanbean.setCopydocumenthomeP(loan.getCopydocumenthome_p());
            } else {
                loanbean.setCopydocumenthomeP(file9);
                loanbean.setCopydocumenthomePbyte(upload.fileToByteArray(file9));
            }
            String file10 = loanform.getSalary_slip_p();
            if (file10.equals("")) {
                loanbean.setSalarySlipP(loan.getSalary_slip_p());
            } else {
                loanbean.setSalarySlipP(file10);
                loanbean.setSalarySlipPbyte(upload.fileToByteArray(file10));
            }
            String file11 = loanform.getCopy_bankaccount_p();
            if (file11.equals("")) {
                loanbean.setCopyBankaccountP(loan.getCopy_bankaccount_p());
            } else {
                loanbean.setCopyBankaccountP(file11);
                loanbean.setCopyBankaccountPbyte(upload.fileToByteArray(file11));
            }

        } else {
        }
//==================================================ผู้ค้ำประกัน=====================================================================================

        loanbean.setCitizenK(loanform.getCitizen_k());
        loanbean.setTitleK(loanform.getTitle_k());
        loanbean.setFirstnameK(loanform.getFirstname_k());
        loanbean.setLastnameK(loanform.getLastname_k());
        loanbean.setBirthdateK(loanform.getBirthdate_k());
        loanbean.setAgeK(loanform.getAge_k());
        loanbean.setNationalityK(loanform.getNationality_k());
        loanbean.setStatustypeK(loanform.getStatustype_k());
        loanbean.setMobileK(loanform.getMobile_k());
        loanbean.setEmailK(loanform.getEmail_k());
        loanbean.setProvinceK(loanform.getProvince_k());
        loanbean.setAmphurK(loanform.getAmphur_k());
        loanbean.setDistrictK(loanform.getDistrict_k());
        loanbean.setAddressK(loanform.getAddress_k());
        loanbean.setJobtypeK(loanform.getJobtype_k());
        loanbean.setPeriodloanK(loanform.getPeriodloan_k());
        loanbean.setNetprofitK(loanform.getNetprofit_k());
//        
        loanbean.setCopyidcardK(loanform.getCopyidcard_k());
        loanbean.setCopydocumenthomeK(loanform.getCopydocumenthome_k());
        loanbean.setSalarySlipK(loanform.getSalary_slip_k());
        loanbean.setCopyBankaccountK(loanform.getCopy_bankaccount_k());

        String file12 = loanform.getCopyidcard_k();
            if (file12.equals("")) {
                loanbean.setCopyidcardK(loan.getCopyidcard_k());
            } else {
                loanbean.setCopyidcardK(file12);
                loanbean.setCopyidcardKv(upload.fileToByteArray(file12));
            }

            String file13 = loanform.getCopydocumenthome_k();
            if (file13.equals("")) {
                loanbean.setCopydocumenthomeK(loan.getCopydocumenthome_k());
            } else {
                loanbean.setCopydocumenthomeK(file13);
                loanbean.setCopydocumenthomeKv(upload.fileToByteArray(file13));
            }
            String file14 = loanform.getSalary_slip_k();
            if (file14.equals("")) {
                loanbean.setSalarySlipK(loan.getSalary_slip_k());
            } else {
                loanbean.setSalarySlipK(file14);
                loanbean.setSalarySlipKbyte(upload.fileToByteArray(file14));
            }
            String file15 = loanform.getCopy_bankaccount_k();
            if (file15.equals("")) {
                loanbean.setCopyBankaccountK(loan.getCopy_bankaccount_k());
            } else {
                loanbean.setCopyBankaccountK(file15);
                loanbean.setCopyBankaccountKbyte(upload.fileToByteArray(file15));
            }
//=======================================================================================================================================
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
            msgmascess = "no";
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
        String e_msg = "";
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
//            userBean = (UserBean) request.getSession().getAttribute("loanreq");
            RequestLoanBean loanbean = new RequestLoanBean();
            loanbean = (RequestLoanBean) request.getSession().getAttribute("editBean");
            String email = loanbean.getEmail();
//            String bass = "sumat678@gmail.com";

            emailUtility.sendEmail("homeloansystem@gmail.com", "0833412924brass", email, af.getE_her(), "หมายเหตุ" + af.getE_dtel() + "<br>" + "ไฟล์ที่ต้องแก้ไข" + "<br>" + msgfile1 + "<br>"
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
