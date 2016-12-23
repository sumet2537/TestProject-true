/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import java.util.Date;
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
public class RequestLoanForm extends org.apache.struts.action.ActionForm {

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
    
    private String province;
    private String amphur;
    private String district;
     private String address;
//    private String addressregistration;
//    private String addresscurrent;
//    private String addresssenddoc;
    private String jobtype;
    private String hometype;
    private Double tradingprice;
    private Double creditloan;
    private int lncome_per_month;
    private Double periodloan;
    private Double netprofit;

//    private String copyidcard;
//    private String copylicenses;
//    private String copydocumenthome;
//    private String copymarriage;
//    private String copy_rename;
//    private String salary_slip;
//    private String copy_bankaccount;
    private FormFile copyidcard;
    private FormFile copylicenses;
    private FormFile copydocumenthome;
    private FormFile copymarriage;
    private FormFile copy_rename;
    private FormFile salary_slip;
    private FormFile copy_bankaccount;

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

    
    
//      ผู้กู้ร่วม ขขขขขชชชๅ------
    private int id;
    private String citizen_p;
    private String title_p;
    private String firstname_p;
    private String lastname_p;
    private String birthdate_p;
    private int age_p;
    private String nationality_p;
    private String statustype_p;
    private String mobile_p;
    private String email_p;
    private String province_p;
    private String amphur_p;
    private String district_p;
    private String address_p;
    private String jobtype_p;
    private Double periodloan_p;
    private Double netprofit_p;
    private FormFile copyidcard_p;
    private FormFile copydocumenthome_p;
    private FormFile salary_slip_p;
    private FormFile copy_bankaccount_p;
    
//    ผู้ค้ำ--------
       private String citizen_k;
    private String title_k;
    private String firstname_k;
    private String lastname_k;
    private String birthdate_k;
    private int age_k;
    private String nationality_k;
    private String statustype_k;
    private String mobile_k;
    private String email_k;
    private String province_k;
    private String amphur_k;
    private String district_k;
     private String address_k;
    private String jobtype_k;
     private Double periodloan_k;
    private Double netprofit_k;
    private FormFile copyidcard_k;
    private FormFile copydocumenthome_k;
    private FormFile salary_slip_k;
    private FormFile copy_bankaccount_k;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCitizen_p() {
        return citizen_p;
    }

    public void setCitizen_p(String citizen_p) {
        this.citizen_p = citizen_p;
    }

    public String getTitle_p() {
        return title_p;
    }

    public void setTitle_p(String title_p) {
        this.title_p = title_p;
    }

    public String getFirstname_p() {
        return firstname_p;
    }

    public void setFirstname_p(String firstname_p) {
        this.firstname_p = firstname_p;
    }

    public String getLastname_p() {
        return lastname_p;
    }

    public void setLastname_p(String lastname_p) {
        this.lastname_p = lastname_p;
    }

    public String getBirthdate_p() {
        return birthdate_p;
    }

    public void setBirthdate_p(String birthdate_p) {
        this.birthdate_p = birthdate_p;
    }

    public int getAge_p() {
        return age_p;
    }

    public void setAge_p(int age_p) {
        this.age_p = age_p;
    }

    public String getNationality_p() {
        return nationality_p;
    }

    public void setNationality_p(String nationality_p) {
        this.nationality_p = nationality_p;
    }

    public String getStatustype_p() {
        return statustype_p;
    }

    public void setStatustype_p(String statustype_p) {
        this.statustype_p = statustype_p;
    }

    public String getMobile_p() {
        return mobile_p;
    }

    public void setMobile_p(String mobile_p) {
        this.mobile_p = mobile_p;
    }

    public String getEmail_p() {
        return email_p;
    }

    public void setEmail_p(String email_p) {
        this.email_p = email_p;
    }

    public String getProvince_p() {
        return province_p;
    }

    public void setProvince_p(String province_p) {
        this.province_p = province_p;
    }

    public String getAmphur_p() {
        return amphur_p;
    }

    public void setAmphur_p(String amphur_p) {
        this.amphur_p = amphur_p;
    }

    public String getDistrict_p() {
        return district_p;
    }

    public void setDistrict_p(String district_p) {
        this.district_p = district_p;
    }

    public String getAddress_p() {
        return address_p;
    }

    public void setAddress_p(String address_p) {
        this.address_p = address_p;
    }

    public String getJobtype_p() {
        return jobtype_p;
    }

    public void setJobtype_p(String jobtype_p) {
        this.jobtype_p = jobtype_p;
    }

    public Double getPeriodloan_p() {
        return periodloan_p;
    }

    public void setPeriodloan_p(Double periodloan_p) {
        this.periodloan_p = periodloan_p;
    }

    public Double getNetprofit_p() {
        return netprofit_p;
    }

    public void setNetprofit_p(Double netprofit_p) {
        this.netprofit_p = netprofit_p;
    }

    

    public String getCitizen_k() {
        return citizen_k;
    }

    public void setCitizen_k(String citizen_k) {
        this.citizen_k = citizen_k;
    }

    public String getTitle_k() {
        return title_k;
    }

    public void setTitle_k(String title_k) {
        this.title_k = title_k;
    }

    public String getFirstname_k() {
        return firstname_k;
    }

    public void setFirstname_k(String firstname_k) {
        this.firstname_k = firstname_k;
    }

    public String getLastname_k() {
        return lastname_k;
    }

    public void setLastname_k(String lastname_k) {
        this.lastname_k = lastname_k;
    }

    public String getBirthdate_k() {
        return birthdate_k;
    }

    public void setBirthdate_k(String birthdate_k) {
        this.birthdate_k = birthdate_k;
    }

    public int getAge_k() {
        return age_k;
    }

    public void setAge_k(int age_k) {
        this.age_k = age_k;
    }

    public String getNationality_k() {
        return nationality_k;
    }

    public void setNationality_k(String nationality_k) {
        this.nationality_k = nationality_k;
    }

    public String getStatustype_k() {
        return statustype_k;
    }

    public void setStatustype_k(String statustype_k) {
        this.statustype_k = statustype_k;
    }

    public String getMobile_k() {
        return mobile_k;
    }

    public void setMobile_k(String mobile_k) {
        this.mobile_k = mobile_k;
    }

    public String getEmail_k() {
        return email_k;
    }

    public void setEmail_k(String email_k) {
        this.email_k = email_k;
    }

    public String getProvince_k() {
        return province_k;
    }

    public void setProvince_k(String province_k) {
        this.province_k = province_k;
    }

    public String getAmphur_k() {
        return amphur_k;
    }

    public void setAmphur_k(String amphur_k) {
        this.amphur_k = amphur_k;
    }

    public String getDistrict_k() {
        return district_k;
    }

    public void setDistrict_k(String district_k) {
        this.district_k = district_k;
    }

    public String getAddress_k() {
        return address_k;
    }

    public void setAddress_k(String address_k) {
        this.address_k = address_k;
    }

    public String getJobtype_k() {
        return jobtype_k;
    }

    public void setJobtype_k(String jobtype_k) {
        this.jobtype_k = jobtype_k;
    }

    public Double getPeriodloan_k() {
        return periodloan_k;
    }

    public void setPeriodloan_k(Double periodloan_k) {
        this.periodloan_k = periodloan_k;
    }

    public Double getNetprofit_k() {
        return netprofit_k;
    }

    public void setNetprofit_k(Double netprofit_k) {
        this.netprofit_k = netprofit_k;
    }

    public FormFile getCopyidcard_p() {
        return copyidcard_p;
    }

    public void setCopyidcard_p(FormFile copyidcard_p) {
        this.copyidcard_p = copyidcard_p;
    }

    public FormFile getCopydocumenthome_p() {
        return copydocumenthome_p;
    }

    public void setCopydocumenthome_p(FormFile copydocumenthome_p) {
        this.copydocumenthome_p = copydocumenthome_p;
    }

    public FormFile getSalary_slip_p() {
        return salary_slip_p;
    }

    public void setSalary_slip_p(FormFile salary_slip_p) {
        this.salary_slip_p = salary_slip_p;
    }

    public FormFile getCopy_bankaccount_p() {
        return copy_bankaccount_p;
    }

    public void setCopy_bankaccount_p(FormFile copy_bankaccount_p) {
        this.copy_bankaccount_p = copy_bankaccount_p;
    }

    public FormFile getCopyidcard_k() {
        return copyidcard_k;
    }

    public void setCopyidcard_k(FormFile copyidcard_k) {
        this.copyidcard_k = copyidcard_k;
    }

    public FormFile getCopydocumenthome_k() {
        return copydocumenthome_k;
    }

    public void setCopydocumenthome_k(FormFile copydocumenthome_k) {
        this.copydocumenthome_k = copydocumenthome_k;
    }

    public FormFile getSalary_slip_k() {
        return salary_slip_k;
    }

    public void setSalary_slip_k(FormFile salary_slip_k) {
        this.salary_slip_k = salary_slip_k;
    }

    public FormFile getCopy_bankaccount_k() {
        return copy_bankaccount_k;
    }

    public void setCopy_bankaccount_k(FormFile copy_bankaccount_k) {
        this.copy_bankaccount_k = copy_bankaccount_k;
    }

    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAmphur() {
        return amphur;
    }

    public void setAmphur(String amphur) {
        this.amphur = amphur;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public FormFile getCopyidcard() {
        return copyidcard;
    }

    public void setCopyidcard(FormFile copyidcard) {
        this.copyidcard = copyidcard;
    }

    public FormFile getCopylicenses() {
        return copylicenses;
    }

    public void setCopylicenses(FormFile copylicenses) {
        this.copylicenses = copylicenses;
    }

    public FormFile getCopydocumenthome() {
        return copydocumenthome;
    }

    public void setCopydocumenthome(FormFile copydocumenthome) {
        this.copydocumenthome = copydocumenthome;
    }

    public FormFile getCopymarriage() {
        return copymarriage;
    }

    public void setCopymarriage(FormFile copymarriage) {
        this.copymarriage = copymarriage;
    }

    public FormFile getCopy_rename() {
        return copy_rename;
    }

    public void setCopy_rename(FormFile copy_rename) {
        this.copy_rename = copy_rename;
    }

    public FormFile getSalary_slip() {
        return salary_slip;
    }

    public void setSalary_slip(FormFile salary_slip) {
        this.salary_slip = salary_slip;
    }

    public FormFile getCopy_bankaccount() {
        return copy_bankaccount;
    }

    public void setCopy_bankaccount(FormFile copy_bankaccount) {
        this.copy_bankaccount = copy_bankaccount;
    }
//
//    public String getCopyidcard() {
//        return copyidcard;
//    }
//
//    public void setCopyidcard(String copyidcard) {
//        this.copyidcard = copyidcard;
//    }
//
//    public String getCopylicenses() {
//        return copylicenses;
//    }
//
//    public void setCopylicenses(String copylicenses) {
//        this.copylicenses = copylicenses;
//    }
//
//    public String getCopydocumenthome() {
//        return copydocumenthome;
//    }
//
//    public void setCopydocumenthome(String copydocumenthome) {
//        this.copydocumenthome = copydocumenthome;
//    }
//
//    public String getCopymarriage() {
//        return copymarriage;
//    }
//
//    public void setCopymarriage(String copymarriage) {
//        this.copymarriage = copymarriage;
//    }
//
//    public String getCopy_rename() {
//        return copy_rename;
//    }
//
//    public void setCopy_rename(String copy_rename) {
//        this.copy_rename = copy_rename;
//    }
//
//    public String getSalary_slip() {
//        return salary_slip;
//    }
//
//    public void setSalary_slip(String salary_slip) {
//        this.salary_slip = salary_slip;
//    }
//
//    public String getCopy_bankaccount() {
//        return copy_bankaccount;
//    }
//
//    public void setCopy_bankaccount(String copy_bankaccount) {
//        this.copy_bankaccount = copy_bankaccount;
//    }
////

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
