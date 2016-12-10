/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.upload.FormFile;
import org.apache.struts.upload.MultipartRequestHandler;

/**
 *
 * @author brass
 */
public class SenddatawsForm extends org.apache.struts.action.ActionForm {
    
private int loan_id;
    private int loanreq_id;
    private String citizen_id;
    private String title_type;
    private String firstName;
    private String lastName;
    private String birthdate;
    private int age;
    private String nationality;
    private String statustype;
    private String mobile;
    private String email;
    private String addressregistration;
    private String addresscurrent;
    private String addresssenddoc;
    private String jobtype;
    private String hometype;
   private Double tradingprice;
    private Double creditloan;
    private int lncome_per_month;
    private Double periodloan;
    private Double netprofit;
    
    private String copyidcard;
    private String copylicenses;
    private String copydocumenthome;
    private String copymarriage;
    private String copy_rename;
    private String salary_slip;
    private String copy_bankaccount;
    
//        private FormFile copyidcard;
//    private FormFile copylicenses;
//    private FormFile copydocumenthome;
//    private FormFile copymarriage;
//    private FormFile copy_rename;
//    private FormFile salary_slip;
//    private FormFile copy_bankaccount;
    
    
    private String banktype;
    private String banktype1;
    private String banktype2;
    private String banktype3;
    private String banktype4;
    private String banktype5;
    private String banktype6;
    private String banktype7;
      private String banktype8;
    private String loanstatustype;
    private String createby;
    private String created;
    private String updated;
    private String updateby;
    private String status;   
    private String todo;

     private String fileNameDownload;

    public String getFileNameDownload() {
        return fileNameDownload;
    }

    public void setFileNameDownload(String fileNameDownload) {
        this.fileNameDownload = fileNameDownload;
    }

    public int getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    
    public String getBanktype8() {
        return banktype8;
    }

    public void setBanktype8(String banktype8) {
        this.banktype8 = banktype8;
    }

    
    
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    
    public int getLoanreq_id() {
        return loanreq_id;
    }

    public void setLoanreq_id(int loanreq_id) {
        this.loanreq_id = loanreq_id;
    }

    public String getCitizen_id() {
        return citizen_id;
    }

    public void setCitizen_id(String citizen_id) {
        this.citizen_id = citizen_id;
    }

    public String getTitle_type() {
        return title_type;
    }

    public void setTitle_type(String title_type) {
        this.title_type = title_type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ActionServlet getServlet() {
        return servlet;
    }

    public void setServlet(ActionServlet servlet) {
        this.servlet = servlet;
    }

    public MultipartRequestHandler getMultipartRequestHandler() {
        return multipartRequestHandler;
    }

    public void setMultipartRequestHandler(MultipartRequestHandler multipartRequestHandler) {
        this.multipartRequestHandler = multipartRequestHandler;
    }

 

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStatustype() {
        return statustype;
    }

    public void setStatustype(String statustype) {
        this.statustype = statustype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressregistration() {
        return addressregistration;
    }

    public void setAddressregistration(String addressregistration) {
        this.addressregistration = addressregistration;
    }

    public String getAddresscurrent() {
        return addresscurrent;
    }

    public void setAddresscurrent(String addresscurrent) {
        this.addresscurrent = addresscurrent;
    }

    public String getAddresssenddoc() {
        return addresssenddoc;
    }

    public void setAddresssenddoc(String addresssenddoc) {
        this.addresssenddoc = addresssenddoc;
    }

    public String getJobtype() {
        return jobtype;
    }

    public void setJobtype(String jobtype) {
        this.jobtype = jobtype;
    }

    public String getHometype() {
        return hometype;
    }

    public void setHometype(String hometype) {
        this.hometype = hometype;
    }

 

    public int getLncome_per_month() {
        return lncome_per_month;
    }

    public void setLncome_per_month(int lncome_per_month) {
        this.lncome_per_month = lncome_per_month;
    }

    public Double getTradingprice() {
        return tradingprice;
    }

    public void setTradingprice(Double tradingprice) {
        this.tradingprice = tradingprice;
    }

    public Double getCreditloan() {
        return creditloan;
    }

    public void setCreditloan(Double creditloan) {
        this.creditloan = creditloan;
    }

    public Double getPeriodloan() {
        return periodloan;
    }

    public void setPeriodloan(Double periodloan) {
        this.periodloan = periodloan;
    }

 

    public Double getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Double netprofit) {
        this.netprofit = netprofit;
    }
    

//    public FormFile getCopyidcard() {
//        return copyidcard;
//    }
//
//    public void setCopyidcard(FormFile copyidcard) {
//        this.copyidcard = copyidcard;
//    }
//
//    public FormFile getCopylicenses() {
//        return copylicenses;
//    }
//
//    public void setCopylicenses(FormFile copylicenses) {
//        this.copylicenses = copylicenses;
//    }
//
//    public FormFile getCopydocumenthome() {
//        return copydocumenthome;
//    }
//
//    public void setCopydocumenthome(FormFile copydocumenthome) {
//        this.copydocumenthome = copydocumenthome;
//    }
//
//    public FormFile getCopymarriage() {
//        return copymarriage;
//    }
//
//    public void setCopymarriage(FormFile copymarriage) {
//        this.copymarriage = copymarriage;
//    }
//
//    public FormFile getCopy_rename() {
//        return copy_rename;
//    }
//
//    public void setCopy_rename(FormFile copy_rename) {
//        this.copy_rename = copy_rename;
//    }
//
//    public FormFile getSalary_slip() {
//        return salary_slip;
//    }
//
//    public void setSalary_slip(FormFile salary_slip) {
//        this.salary_slip = salary_slip;
//    }
//
//    public FormFile getCopy_bankaccount() {
//        return copy_bankaccount;
//    }
//
//    public void setCopy_bankaccount(FormFile copy_bankaccount) {
//        this.copy_bankaccount = copy_bankaccount;
//    }

    public String getCopyidcard() {
        return copyidcard;
    }

    public void setCopyidcard(String copyidcard) {
        this.copyidcard = copyidcard;
    }

    public String getCopylicenses() {
        return copylicenses;
    }

    public void setCopylicenses(String copylicenses) {
        this.copylicenses = copylicenses;
    }

    public String getCopydocumenthome() {
        return copydocumenthome;
    }

    public void setCopydocumenthome(String copydocumenthome) {
        this.copydocumenthome = copydocumenthome;
    }

    public String getCopymarriage() {
        return copymarriage;
    }

    public void setCopymarriage(String copymarriage) {
        this.copymarriage = copymarriage;
    }

    public String getCopy_rename() {
        return copy_rename;
    }

    public void setCopy_rename(String copy_rename) {
        this.copy_rename = copy_rename;
    }

    public String getSalary_slip() {
        return salary_slip;
    }

    public void setSalary_slip(String salary_slip) {
        this.salary_slip = salary_slip;
    }

    public String getCopy_bankaccount() {
        return copy_bankaccount;
    }

    public void setCopy_bankaccount(String copy_bankaccount) {
        this.copy_bankaccount = copy_bankaccount;
    }



    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public String getLoanstatustype() {
        return loanstatustype;
    }

    public void setLoanstatustype(String loanstatustype) {
        this.loanstatustype = loanstatustype;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

 

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getBanktype1() {
        return banktype1;
    }

    public void setBanktype1(String banktype1) {
        this.banktype1 = banktype1;
    }

    public String getBanktype2() {
        return banktype2;
    }

    public void setBanktype2(String banktype2) {
        this.banktype2 = banktype2;
    }

    public String getBanktype3() {
        return banktype3;
    }

    public void setBanktype3(String banktype3) {
        this.banktype3 = banktype3;
    }

    public String getBanktype4() {
        return banktype4;
    }

    public void setBanktype4(String banktype4) {
        this.banktype4 = banktype4;
    }

    public String getBanktype5() {
        return banktype5;
    }

    public void setBanktype5(String banktype5) {
        this.banktype5 = banktype5;
    }

    public String getBanktype6() {
        return banktype6;
    }

    public void setBanktype6(String banktype6) {
        this.banktype6 = banktype6;
    }

    public String getBanktype7() {
        return banktype7;
    }

    public void setBanktype7(String banktype7) {
        this.banktype7 = banktype7;
    }
    
}