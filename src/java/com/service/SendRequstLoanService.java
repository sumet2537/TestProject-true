/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.form.RequestLoanForm;
import com.ws.RequsetloanWs;

/**
 *
 * @author MAX
 */
public class SendRequstLoanService {
    
    public int sendRequstLoan(RequestLoanForm loanform ){
        
         RequsetloanWs requsetloanWs  = new RequsetloanWs();
        com.ws.RequestLoanBean  loanbean = new com.ws.RequestLoanBean();
        

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
//        loanbean.setAddressregistration(loanform.getAddressregistration());
//        loanbean.setAddresscurrent(loanform.getAddresscurrent());
//        loanbean.setAddresssenddoc(loanform.getAddresssenddoc());
        loanbean.setHometype(loanform.getHometype());
        loanbean.setTradingprice(loanform.getTradingprice());
        loanbean.setCreditloan(loanform.getCreditloan());
        loanbean.setLncomePerMonth(loanform.getLncome_per_month());
        loanbean.setPeriodloan(loanform.getPeriodloan());
        loanbean.setNetprofit(loanform.getNetprofit());
        
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

        return requsetloanWs.requestLoanService(loanbean);
    }
}
