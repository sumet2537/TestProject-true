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
    private String province;
    private String amphur;
    private String district;
    private String address;
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

    private byte[] copyidcardbyte;
    private byte[] copylicensesbyte;
    private byte[] copydocumenthomebyte;
    private byte[] copymarriagebyte;
    private byte[] copyRenamebyte;
    private byte[] salarySlipbyte;
    private byte[] copyBankaccountbyte;

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

    private String file1;
    private String file2;
    private String file3;
    private String file4;
    private String file5;
    private String file6;
    private String file7;
    private String file8;
    private String file9;
    private String file10;
    private String file11;
    private String file12;
    private String file13;
    private String file14;
    private String file15;
    private String e_dtel;
    private String e_her;

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
    private String copyidcard_p;
    private String copydocumenthome_p;
    private String salary_slip_p;
    private String copy_bankaccount_p;
    private byte[] copyidcard_pbyte;
    private byte[] copydocumenthome_pbyte;
    private byte[] salary_slip_pbyte;
    private byte[] copy_bankaccount_pbyte;

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
    private String copyidcard_k;
    private String copydocumenthome_k;
    private String salary_slip_k;
    private String copy_bankaccount_k;
    private byte[] copyidcard_kv;
    private byte[] copydocumenthome_kv;
    private byte[] salary_slip_kbyte;
    private byte[] copy_bankaccount_kbyte;

    public String getFile8() {
        return file8;
    }

    public void setFile8(String file8) {
        this.file8 = file8;
    }

    public String getFile9() {
        return file9;
    }

    public void setFile9(String file9) {
        this.file9 = file9;
    }

    public String getFile10() {
        return file10;
    }

    public void setFile10(String file10) {
        this.file10 = file10;
    }

    public String getFile11() {
        return file11;
    }

    public void setFile11(String file11) {
        this.file11 = file11;
    }

    public String getFile12() {
        return file12;
    }

    public void setFile12(String file12) {
        this.file12 = file12;
    }

    public String getFile13() {
        return file13;
    }

    public void setFile13(String file13) {
        this.file13 = file13;
    }

    public String getFile14() {
        return file14;
    }

    public void setFile14(String file14) {
        this.file14 = file14;
    }

    public String getFile15() {
        return file15;
    }

    public void setFile15(String file15) {
        this.file15 = file15;
    }

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

    public String getCopyidcard_p() {
        return copyidcard_p;
    }

    public void setCopyidcard_p(String copyidcard_p) {
        this.copyidcard_p = copyidcard_p;
    }

    public String getCopydocumenthome_p() {
        return copydocumenthome_p;
    }

    public void setCopydocumenthome_p(String copydocumenthome_p) {
        this.copydocumenthome_p = copydocumenthome_p;
    }

    public String getSalary_slip_p() {
        return salary_slip_p;
    }

    public void setSalary_slip_p(String salary_slip_p) {
        this.salary_slip_p = salary_slip_p;
    }

    public String getCopy_bankaccount_p() {
        return copy_bankaccount_p;
    }

    public void setCopy_bankaccount_p(String copy_bankaccount_p) {
        this.copy_bankaccount_p = copy_bankaccount_p;
    }

    public byte[] getCopyidcard_pbyte() {
        return copyidcard_pbyte;
    }

    public void setCopyidcard_pbyte(byte[] copyidcard_pbyte) {
        this.copyidcard_pbyte = copyidcard_pbyte;
    }

    public byte[] getCopydocumenthome_pbyte() {
        return copydocumenthome_pbyte;
    }

    public void setCopydocumenthome_pbyte(byte[] copydocumenthome_pbyte) {
        this.copydocumenthome_pbyte = copydocumenthome_pbyte;
    }

    public byte[] getSalary_slip_pbyte() {
        return salary_slip_pbyte;
    }

    public void setSalary_slip_pbyte(byte[] salary_slip_pbyte) {
        this.salary_slip_pbyte = salary_slip_pbyte;
    }

    public byte[] getCopy_bankaccount_pbyte() {
        return copy_bankaccount_pbyte;
    }

    public void setCopy_bankaccount_pbyte(byte[] copy_bankaccount_pbyte) {
        this.copy_bankaccount_pbyte = copy_bankaccount_pbyte;
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

    public String getCopyidcard_k() {
        return copyidcard_k;
    }

    public void setCopyidcard_k(String copyidcard_k) {
        this.copyidcard_k = copyidcard_k;
    }

    public String getCopydocumenthome_k() {
        return copydocumenthome_k;
    }

    public void setCopydocumenthome_k(String copydocumenthome_k) {
        this.copydocumenthome_k = copydocumenthome_k;
    }

    public String getSalary_slip_k() {
        return salary_slip_k;
    }

    public void setSalary_slip_k(String salary_slip_k) {
        this.salary_slip_k = salary_slip_k;
    }

    public String getCopy_bankaccount_k() {
        return copy_bankaccount_k;
    }

    public void setCopy_bankaccount_k(String copy_bankaccount_k) {
        this.copy_bankaccount_k = copy_bankaccount_k;
    }

    public byte[] getCopyidcard_kv() {
        return copyidcard_kv;
    }

    public void setCopyidcard_kv(byte[] copyidcard_kv) {
        this.copyidcard_kv = copyidcard_kv;
    }

    public byte[] getCopydocumenthome_kv() {
        return copydocumenthome_kv;
    }

    public void setCopydocumenthome_kv(byte[] copydocumenthome_kv) {
        this.copydocumenthome_kv = copydocumenthome_kv;
    }

    public byte[] getSalary_slip_kbyte() {
        return salary_slip_kbyte;
    }

    public void setSalary_slip_kbyte(byte[] salary_slip_kbyte) {
        this.salary_slip_kbyte = salary_slip_kbyte;
    }

    public byte[] getCopy_bankaccount_kbyte() {
        return copy_bankaccount_kbyte;
    }

    public void setCopy_bankaccount_kbyte(byte[] copy_bankaccount_kbyte) {
        this.copy_bankaccount_kbyte = copy_bankaccount_kbyte;
    }

   
    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }

    public String getFile3() {
        return file3;
    }

    public void setFile3(String file3) {
        this.file3 = file3;
    }

    public String getFile4() {
        return file4;
    }

    public void setFile4(String file4) {
        this.file4 = file4;
    }

    public String getFile5() {
        return file5;
    }

    public void setFile5(String file5) {
        this.file5 = file5;
    }

    public String getFile6() {
        return file6;
    }

    public void setFile6(String file6) {
        this.file6 = file6;
    }

    public String getFile7() {
        return file7;
    }

    public void setFile7(String file7) {
        this.file7 = file7;
    }

    public String getE_dtel() {
        return e_dtel;
    }

    public void setE_dtel(String e_dtel) {
        this.e_dtel = e_dtel;
    }

    public String getE_her() {
        return e_her;
    }

    public void setE_her(String e_her) {
        this.e_her = e_her;
    }

    public byte[] getCopyidcardbyte() {
        return copyidcardbyte;
    }

    public void setCopyidcardbyte(byte[] copyidcardbyte) {
        this.copyidcardbyte = copyidcardbyte;
    }

    public byte[] getCopylicensesbyte() {
        return copylicensesbyte;
    }

    public void setCopylicensesbyte(byte[] copylicensesbyte) {
        this.copylicensesbyte = copylicensesbyte;
    }

    public byte[] getCopydocumenthomebyte() {
        return copydocumenthomebyte;
    }

    public void setCopydocumenthomebyte(byte[] copydocumenthomebyte) {
        this.copydocumenthomebyte = copydocumenthomebyte;
    }

    public byte[] getCopymarriagebyte() {
        return copymarriagebyte;
    }

    public void setCopymarriagebyte(byte[] copymarriagebyte) {
        this.copymarriagebyte = copymarriagebyte;
    }

    public byte[] getCopyRenamebyte() {
        return copyRenamebyte;
    }

    public void setCopyRenamebyte(byte[] copyRenamebyte) {
        this.copyRenamebyte = copyRenamebyte;
    }

    public byte[] getSalarySlipbyte() {
        return salarySlipbyte;
    }

    public void setSalarySlipbyte(byte[] salarySlipbyte) {
        this.salarySlipbyte = salarySlipbyte;
    }

    public byte[] getCopyBankaccountbyte() {
        return copyBankaccountbyte;
    }

    public void setCopyBankaccountbyte(byte[] copyBankaccountbyte) {
        this.copyBankaccountbyte = copyBankaccountbyte;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

//
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
