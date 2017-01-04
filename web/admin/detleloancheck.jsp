<%-- 
    Document   : detleloancheck
    Created on : Dec 9, 2016, 3:32:01 AM
    Author     : brass
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.bean.RequestLoanBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%! RequestLoanBean bean = null;
            RequestLoanBean bean1 = null;
        %>
        <%--
        --%>
        <%
            bean = (RequestLoanBean) request.getSession().getAttribute("editBean");
            bean1 = (RequestLoanBean) request.getSession().getAttribute("editBean1");
            DecimalFormat formatter = new DecimalFormat("###,###.00");
            DecimalFormat phone = new DecimalFormat("###-###-####");
            String e_msg = "";
            String msg = "";
            msg = (String) request.getAttribute("loancheck");
            e_msg = (String) request.getAttribute("resultemail");
            String mascess = "";
            String msgsascess = "";
            msgsascess = (String) request.getAttribute("confrimbank");
            mascess = (String) request.getAttribute("detleloan");
        %>

    <body onload="check()">
        <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" id="detleloanform" name="detleloanform" action="SenddatawsAction.do" method="post" enctype="multipart/form-data">
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <!--box box-solid-->
                            <br>
                            <h3 class="center"><strong >ตรวจสอบการขอกู้</strong></h3>
                            <div class="box-body">
                                <!--box-body-->
                                <div class="row">
                                    <fieldset class="col-md-2">
                                    </fieldset>
                                    <fieldset class="col-md-8 center">
                                        <hr class="hrbrue">
                                    </fieldset>
                                    <div >
                                        <fieldset class="col-md-10 col-md-offset-1">
                                            <div class="form-group">
                                                <div class="panel panel-info">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลส่วนตัว :: &nbsp;&nbsp;&nbsp;&nbsp;รหัสสินเชื่อ : &nbsp;&nbsp;<%=bean.getLoanreq_id()%>&nbsp;&nbsp;สถานะสินเชื่อ : &nbsp;&nbsp;<%=bean.getLoanstatustype()%>&nbsp;&nbsp;วันที่ส่ง : &nbsp;&nbsp;<%=bean.getCreated()%></h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>เลขบัตรประจำตัวประชาชน : &nbsp;&nbsp;<span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean.getCitizen_id()%></span></label>
                                                            <input  type="hidden" name="citizen_id" value="<%=bean.getCitizen_id()%>">
                                                            <input  type="hidden" name="loanreq_id" value="<%=bean.getLoanreq_id()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>คำนำหน้า :<span style="color:#0033FF; font-size: 17px;"><%=bean.getTitle_type()%></span></label>
                                                            <input type="hidden"  name="title_type" value="<%=bean.getTitle_type()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label for="firstname">ชื่อ : &nbsp;&nbsp;<span  style="color:#0033FF; font-size: 17px;"><%=bean.getFirstName()%></span></label>
                                                            <input  type="hidden" name="firstName" value="<%=bean.getFirstName()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>นามสกุล: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getLastName()%></span></label>
                                                            <input type="hidden" name="lastName" value="<%=bean.getLastName()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วันเดือนปีเกิด: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getBirthdate()%></span></label>
                                                            <input type="hidden" name="birthdate" value="<%=bean.getBirthdate()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อายุ: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getAge()%></span> &nbsp;&nbsp;ปี</label>
                                                            <input  type="hidden" name="age" value="<%=bean.getAge()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สัญชาติ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getNationality()%></span></label>
                                                            <input name="nationality" type="hidden" value="<%=bean.getNationality()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สถานะสมรส : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getStatustype()%></span></label>
                                                            <input type="hidden" name="statustype" value="<%=bean.getStatustype()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>เบอร์โทร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getMobile()%></span></label>
                                                            <input type="hidden" name="mobile" value="<%=bean.getMobile()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อีเมล์ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getEmail()%></span></label>
                                                            <input type="hidden" name="email"  value="<%=bean.getEmail()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>อาชีพ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getJobtype()%></span></label>
                                                            <input type="hidden" name="jobtype" value="<%=bean.getJobtype()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >จังหวัด : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getProvince()%></span></label>
                                                            <textarea hidden name="province" ><%=bean.getProvince()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>อำเภอ : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getAmphur()%></span></label>
                                                            <textarea hidden name="amphur" > <%=bean.getAmphur()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>ตำบล  <span style="color:#0033FF; font-size: 17px;"><%=bean.getDistrict()%></span></label>
                                                            <textarea hidden name="district"> <%=bean.getDistrict()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>ที่อยู่  <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddress()%></span></label>
                                                            <textarea hidden name="address"> <%=bean.getAddress()%></textarea>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-success">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลที่อยู่อาศัยที่จะซื้อ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-4">
                                                            <label >ประเภทที่อยู่อาศัย: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getHometype()%></span></label>
                                                            <input type="hidden"  name="hometype" value="<%=bean.getHometype()%>" />
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >ราคาซื้อขาย: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getTradingprice())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="tradingprice" value="<%=bean.getTradingprice()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วงเงินสินเชื่อที่ขอกู้ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getCreditloan())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="creditloan" value="<%=bean.getCreditloan()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >ระยะเวลาที่ขอกู้ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getLncome_per_month()%>&nbsp;&nbsp;</span>ปี</label>
                                                            <input type="hidden" name="lncome_per_month" value="<%=bean.getLncome_per_month()%>">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-danger">
                                                    <div class="panel panel-heading">
                                                        <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-6">
                                                            <label>รายได้ประจำต่อเดือน: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getPeriodloan())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="periodloan" value="<%=bean.getPeriodloan()%>">
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <label>รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getNetprofit())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input type="hidden" name="netprofit" value="<%=bean.getNetprofit()%>">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-warning">
                                                    <div class="panel-heading">
                                                        <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group">
                                                            <div class="col-md-8"><h5>เอกสาร</h5>
                                                            </div>
                                                            <div class="col-md-4"><h5>ดูรายละเอียด</h5></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label >สำเนาบัตรประจำตัวประชาชน: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"> <%=bean.getCopyidcard()%></span></label>
                                                                <input  type="hidden" name="copyidcard" value="<%=bean.getCopyidcard()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getCopyidcard()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group"> 
                                                            <div class="col-md-8">
                                                                <label>สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ) : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopylicenses()%></span></label>
                                                                <input type="hidden" name="copylicenses" value="<%=bean.getCopylicenses()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getCopylicenses()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>

                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label>สำเนาทะเบียนบ้าน :<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopydocumenthome()%></span></label>
                                                                <input type="hidden" name="copydocumenthome" value="<%=bean.getCopydocumenthome()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getCopydocumenthome()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สำเนาทะเบียนสมรส/ใบหย่า/ใบมรณะบัตรของคู่สมรส (ถ้ามี) : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopymarriage()%></span></label>
                                                                <input type="hidden" name="copymarriage" value="<%=bean.getCopymarriage()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getCopymarriage()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label >ใบเปลี่ยนชื่อ-สกุล (ทุกใบ): &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopy_rename()%></span></label>
                                                                <input  type="hidden"  name="copy_rename" value="<%=bean.getCopy_rename()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getCopy_rename()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สลิปเงินเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getSalary_slip()%></span></label>
                                                                <input  type="hidden" name="salary_slip"  value="<%=bean.getSalary_slip()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getSalary_slip()%>"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สำเนาบัญชีธนาคาร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopy_bankaccount()%></span></label>
                                                                <input type="hidden" name="copy_bankaccount"  value="<%=bean.getCopy_bankaccount()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean.getCopy_bankaccount()%>"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--=====================  =====================  =====================  =====================  =====================  =====================-->                                                       
                                                <%
                                                    if ("สมรส".equals(bean.getStatustype())) {
                                                %>
                                                <div class="panel panel-success">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลคู่สมรส :: </h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>เลขบัตรประจำตัวประชาชน : &nbsp;&nbsp;<span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean1.getCitizen_p()%></span></label>
                                                            <input  type="hidden" name="citizen_p" value="<%=bean1.getCitizen_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>คำนำหน้า :<span style="color:#0033FF; font-size: 17px;"><%=bean1.getTitle_p()%></span></label>
                                                            <input type="hidden"  name="title_p" value="<%=bean1.getTitle_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label for="firstname">ชื่อ : &nbsp;&nbsp;<span  style="color:#0033FF; font-size: 17px;"><%=bean1.getFirstname_p()%></span></label>
                                                            <input  type="hidden" name="firstname_p" value="<%=bean1.getFirstname_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>นามสกุล: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getLastname_p()%></span></label>
                                                            <input type="hidden" name="lastname_p" value="<%=bean1.getLastname_p()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วันเดือนปีเกิด: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getBirthdate_p()%></span></label>
                                                            <input type="hidden" name="birthdate_p" value="<%=bean1.getBirthdate_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อายุ: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getAge_p()%></span> &nbsp;&nbsp;ปี</label>
                                                            <input  type="hidden" name="age_p" value="<%=bean1.getAge_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สัญชาติ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getNationality_p()%></span></label>
                                                            <input name="nationality_p" type="hidden" value="<%=bean1.getNationality_p()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สถานะสมรส : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getStatustype_p()%></span></label>
                                                            <input type="hidden" name="statustype_p" value="<%=bean1.getStatustype_p()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>เบอร์โทร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getMobile_p()%></span></label>
                                                            <input type="hidden" name="mobile_p" value="<%=bean1.getMobile_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อีเมล์ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getEmail_p()%></span></label>
                                                            <input type="hidden" name="email_p"  value="<%=bean1.getEmail_p()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>อาชีพ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getJobtype_p()%></span></label>
                                                            <input type="hidden" name="jobtype_p" value="<%=bean1.getJobtype_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >จังหวัด : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean1.getProvince_p()%></span></label>
                                                            <textarea hidden name="province_p" ><%=bean1.getProvince_p()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>อำเภอ : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean1.getAmphur_p()%></span></label>
                                                            <textarea hidden name="amphur_p" > <%=bean1.getAmphur_p()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>ตำบล  <span style="color:#0033FF; font-size: 17px;"><%=bean1.getDistrict_p()%></span></label>
                                                            <textarea hidden name="district_p"> <%=bean1.getDistrict_p()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>ที่อยู่  <span style="color:#0033FF; font-size: 17px;"><%=bean1.getAddress_p()%></span></label>
                                                            <textarea hidden name="address_p"> <%=bean1.getAddress_p()%></textarea>
                                                        </div>
                                                        <div class="col-md-12 panel-heading">
                                                            <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                        </div>

                                                        <div class="form-group col-md-4">
                                                            <label>รายได้ประจำต่อเดือน: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean1.getPeriodloan_p())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="periodloan_p" value="<%=bean1.getPeriodloan_p()%>">
                                                        </div>
                                                        <div class="form-group col-md-">
                                                            <label>รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean1.getNetprofit_p())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input type="hidden" name="netprofit_p" value="<%=bean1.getNetprofit_p()%>">
                                                        </div>
                                                        <div class="col-md-12 panel-heading">
                                                            <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                        </div>

                                                        <div class="form-group">
                                                            <div class="col-md-8"><h5>เอกสาร</h5>
                                                            </div>
                                                            <div class="col-md-4"><h5>ดูรายละเอียด</h5></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label >สำเนาบัตรประจำตัวประชาชน: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"> <%=bean1.getCopyidcard_p()%></span></label>
                                                                <input  type="hidden" name="copyidcard_p" value="<%=bean1.getCopyidcard_p()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getCopyidcard_p()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label>สำเนาทะเบียนบ้าน :<span style="color:#0033FF; font-size: 17px;"><%=bean1.getCopydocumenthome_p()%></span></label>
                                                                <input type="hidden" name="copydocumenthome_p" value="<%=bean1.getCopydocumenthome_p()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getCopydocumenthome_p()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สลิปเงินเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getSalary_slip_p()%></span></label>
                                                                <input  type="hidden" name="salary_slip_p"  value="<%=bean1.getSalary_slip_p()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getSalary_slip_p()%>"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สำเนาบัญชีธนาคาร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getCopy_bankaccount_p()%></span></label>
                                                                <input type="hidden" name="copy_bankaccount_p"  value="<%=bean1.getCopy_bankaccount_p()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getCopy_bankaccount_p()%>"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <%
                                                    } else {
                                                    }
                                                %>                              
                                                <input type="hidden" name="netprofit_p" value="<%=bean1.getNetprofit_p()%>">
                                                <input  class="form-control" type="hidden" name="periodloan_p" value="<%=bean1.getPeriodloan_p()%>">

                                                <!--=====================  =====================  =====================  =====================  =====================  =====================-->                                                      
                                                <!--ข้อมูลผู้กู้ผู้ค้ำ-->
                                                <div class="panel panel-info">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลผู้ค้ำประกัน :: </h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>เลขบัตรประจำตัวประชาชน : &nbsp;&nbsp;<span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean1.getCitizen_k()%></span></label>
                                                            <input  type="hidden" name="citizen_k" value="<%=bean1.getCitizen_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>คำนำหน้า :<span style="color:#0033FF; font-size: 17px;"><%=bean1.getTitle_k()%></span></label>
                                                            <input type="hidden"  name="title_k" value="<%=bean1.getTitle_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label for="firstname">ชื่อ : &nbsp;&nbsp;<span  style="color:#0033FF; font-size: 17px;"><%=bean1.getFirstname_k()%></span></label>
                                                            <input  type="hidden" name="firstname_k" value="<%=bean1.getFirstname_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>นามสกุล: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getLastname_k()%></span></label>
                                                            <input type="hidden" name="lastname_k" value="<%=bean1.getLastname_k()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วันเดือนปีเกิด: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getBirthdate_k()%></span></label>
                                                            <input type="hidden" name="birthdate_k" value="<%=bean1.getBirthdate_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อายุ: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getAge_k()%></span> &nbsp;&nbsp;ปี</label>
                                                            <input  type="hidden" name="age_k" value="<%=bean1.getAge_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สัญชาติ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getNationality_k()%></span></label>
                                                            <input type="hidden" name="nationality_k" value="<%=bean1.getNationality_k()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สถานะสมรส : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getStatustype_k()%></span></label>
                                                            <input type="hidden" name="statustype_k" value="<%=bean1.getStatustype_k()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>เบอร์โทร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getMobile_k()%></span></label>
                                                            <input type="hidden" name="mobile_k" value="<%=bean1.getMobile_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อีเมล์ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getEmail_k()%></span></label>
                                                            <input type="hidden" name="email_k"  value="<%=bean1.getEmail_k()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>อาชีพ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getJobtype_k()%></span></label>
                                                            <input type="hidden" name="jobtype_k" value="<%=bean1.getJobtype_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >จังหวัด : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean1.getProvince_k()%></span></label>
                                                            <textarea hidden name="province_k" ><%=bean1.getProvince_k()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>อำเภอ : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean1.getAmphur_k()%></span></label>
                                                            <textarea hidden name="amphur_k" > <%=bean1.getAmphur_k()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>ตำบล  <span style="color:#0033FF; font-size: 17px;"><%=bean1.getDistrict_k()%></span></label>
                                                            <textarea hidden name="district_k"> <%=bean1.getDistrict_k()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>ที่อยู่  <span style="color:#0033FF; font-size: 17px;"><%=bean1.getAddress_k()%></span></label>
                                                            <textarea hidden name="address_k"> <%=bean1.getAddress_k()%></textarea>
                                                        </div>
                                                        <div class="col-md-12 panel-heading">
                                                            <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>รายได้ประจำต่อเดือน: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean1.getPeriodloan_k())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="periodloan_k" value="<%=bean1.getPeriodloan_k()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean1.getNetprofit_k())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input type="hidden" name="netprofit_k" value="<%=bean1.getNetprofit_k()%>">
                                                        </div>

                                                        <div class="col-md-12 panel-heading">
                                                            <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8"><h5>เอกสาร</h5>
                                                            </div>
                                                            <div class="col-md-4"><h5>ดูรายละเอียด</h5></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label >สำเนาบัตรประจำตัวประชาชน: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"> <%=bean1.getCopyidcard_k()%></span></label>
                                                                <input  type="hidden" name="copyidcard_k" value="<%=bean1.getCopyidcard_k()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getCopyidcard_k()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label>สำเนาทะเบียนบ้าน :<span style="color:#0033FF; font-size: 17px;"><%=bean1.getCopydocumenthome_k()%></span></label>
                                                                <input type="hidden" name="copydocumenthome_k" value="<%=bean1.getCopydocumenthome_k()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getCopydocumenthome_k()%>" target="_blank"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สลิปเงินเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getSalary_slip_k()%></span></label>
                                                                <input  type="hidden" name="salary_slip_k"  value="<%=bean1.getSalary_slip_k()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getSalary_slip_k()%>"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สำเนาบัญชีธนาคาร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean1.getCopy_bankaccount_k()%></span></label>
                                                                <input type="hidden" name="copy_bankaccount_k"  value="<%=bean1.getCopy_bankaccount_k()%>">
                                                            </div>
                                                            <div class="col-md-4"><a  href="http://localhost:8080/TestProject/image/uploade/<%=bean1.getCopy_bankaccount_k()%>"><img class="imgfile" src="./img/icon-pdf1.png"></a></div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <!--=====================  =====================  =====================  =====================  =====================  =====================-->

                                                <div class="panel panel-info">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลธนาคารที่ต้องการขอกู้ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>ธนาคารที่ต้องการขอกู้ :&nbsp;&nbsp;</label><span style="color:#0033FF; font-size: 17px;"><%=bean.getBanktype()%></span>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="center">
                                                    <br>
                                                    <div id="chk" class="btn-group" data-toggle="buttons">
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="blue" value="2011" onclick="callCheckboxActive(this)">กรุงเทพ
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="red" value="2012" onclick="callCheckboxActive(this)">กรุงไทย
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="green" value="2013" onclick="callCheckboxActive(this)">ธนชาติ
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="yellow" value="2013" onclick="callCheckboxActive(this)">ทหารไทย
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">กรุงศรีอยุทยา
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">ออมสิน
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">ไทยพาณิชย์
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">กสิกรไทย
                                                        </label>

                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <input type="hidden" name="loanstatustype" value="รออนุมัติ"/>
                                                    <hr class="hrsuccess">
                                                    <input type="hidden" name="todo"/>
                                                    <div class="col-md-12" align="center">
                                                        <button type="submit" id="submit" name="submit" class="btn btn-primary" onclick="oninsert('insertbank')" ><span class="glyphicon glyphicon-send"></span>ส่งข้อมูลให้ธนาคาร</button>
                                                        <a  href="#popup2" class="btn btn-warning"> <span class="glyphicon glyphicon-edit"></span>เอกสารไม่ผ่าน</a>
                                                        <a  href="#popup3" class="btn btn-danger"> <span class="glyphicon glyphicon-edit"></span>ข้อมูลไม่ผ่าน</a>
                                                    </div>
                                                    <!--test-->
                                                    <div>
                                                        <div id="popup2" class="overlay1" style="margin-top: 55px;">
                                                            <div class="popupr" style="width: 50%;">
                                                                <h2 style="color: red;">ไม่ผ่านการตรวจสอบเอกสาร</h2>
                                                                <div class="content1" style="padding-bottom: 5px;">
                                                                    แจ้งเตือนไปยังลูกค้า
                                                                </div>
                                                                <div class="panel panel-info">
                                                                    <div class="panel panel-heading">                   
                                                                        <input class="form-control"  type="text" name="e_her" placeholder="หัวเรื่อง"/>
                                                                    </div>
                                                                    <div class="panel-body popup-email">
                                                                        <textarea class="form-control" style="height: 80px;" name="e_dtel" placeholder="หมายเหตุ"></textarea>
                                                                        <p>ไฟลที่ต้องการให้แก้ไข</p>
                                                                        <input class="checkbox-popup" type="checkbox" name="file1" value="file1">ไฟล์สำเนาบัตรประจำตัวประชาชน <br>
                                                                        <input class="checkbox-popup" type="checkbox" name="file2" value="file2">สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ)  <br>
                                                                        <input class="checkbox-popup" type="checkbox" name="file3" value="file3">สำเนาทะเบียนบ้าน <br>
                                                                        <input class="checkbox-popup" type="checkbox" name="file4" value="file4">สำเนาทะเบียนสมรส/ใบหย่า/ใบมรณะบัตรของคู่สมรส (ถ้ามี)<br>
                                                                        <input class="checkbox-popup" type="checkbox" name="file5" value="file5">ใบเปลี่ยนชื่อ-สกุล (ทุกใบ)<br>
                                                                        <input class="checkbox-popup" type="checkbox" name="file6" value="file6">สลิปเงินเดือน <br>
                                                                        <input class="checkbox-popup" type="checkbox" name="file7" value="file7">สำเนาบัญชีธนาคาร

                                                                        <input type="hidden" name="loanstatustype" value="เอกสารไม่ผ่าน"/>
                                                                    </div>

                                                                </div>

                                                                <hr class="sohrpopup" style="margin-top: 0;">

                                                                <div style="text-align: center" >
                                                                    <button class="btn btn-twitter" onclick="editapproves('<%=bean.getLoanreq_id()%>')">ยืนยัน</button>
                                                                    <a class="btn btn-danger"  href="#">ยกเลิก</a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div>
                                                        <div id="popup3" class="overlay1" style="margin-top: 55px;">
                                                            <div class="popupr center" style="width: 40%;">
                                                                <h2 style="color: red;">ยืนยัน</h2>
                                                                <div class="panel panel-info">
                                                                    <div class="panel-body popup-email">
                                                                        <br>
                                                                        ยืนยันเอกสารไม่ผ่าน คุณแน่ใจว่าตรวจดีแล้ว !
                                                                        <input type="hidden" name="loanstatustype" value="ไม่อนุมัติ"/>
                                                                    </div>

                                                                </div>

                                                                <hr class="sohrpopup" style="margin-top: 0;">

                                                                <div style="text-align: center" >
                                                                    <button class="btn btn-twitter" onclick="noapproves('<%=bean.getLoanreq_id()%>')">ยืนยัน</button>
                                                                    <a class="btn btn-danger"  href="#">ยกเลิก</a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div> 
                                                    <%--!--                                                    <div>
                                <%
                                    if ("e_ok".equals(e_msg)) {
                                %>

                                                <div id="popup1" class="overlaymsg">
                                                    <div class="popupr">


                                                        <div style="text-align: center" class="popup-success">
                                                            สำเร็จ
                                                        </div>
                                                        <div class="content">
                                                            ทำรายการสำเร็จ
                                                        </div>

                                                        <hr class="sohrsuccess">
                                                        <div style="text-align: center" >
                                                            <a  class="btn btn-successok btn-popup" href="PageAction.do?todo=gotoPageManagermentLoan">ตกลง</a>

                                                        </div>
                                                    </div>
                                                </div>    
                                                <%} else if ("e_no".equals(e_msg)) {
                                                %>            
                                                <div id="popup1" class="overlaymsg">
                                                    <div class="popupr">


                                                        <div style="text-align: center" class="popup-error">
                                                            ล้มเหลว
                                                        </div>
                                                        <div class="content">
                                                            ไม่สามารถทำรายการได้ อาจเกิดปัญหาทางกับอินเทอร์เน็ต กรุณาลองใหม่อีกครั้ง
                                                        </div>
                                                        <hr class="sohrerroo">              
                                                        <div style="text-align: center" >
                                                            <a class="btn btn-error " href="LoanRequstAction.do?todo=gotoDetle_requestloan">ลองใหม่ <span class="glyphicon glyphicon-repeat"></span></a>                   
                                                        </div>            
                                                    </div>
                                                </div>    
                                                <%}%>
                                            </div>--%>
                                                    <!--test-->

                                                </div>   
                                            </div>
                                        </fieldset>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <!--</div>-->
        </section><!-- /.content -->
        <script type="text/javascript">
            function oninsert(select) {
                document.detleloanform.todo.value = select;
                document.detleloanform.submit();
            }
            function callActionsearch(select) {
                document.detleloanform.todo.value = select;
                document.detleloanform.submit();
            }
            function editapproves(loanreq_id) {
                document.detleloanform.loanreq_id.value = loanreq_id;
                document.detleloanform.todo.value = 'editapproves';
                document.detleloanform.submit();
            }
            function reformcadit(loanreq_id) {
                document.detleloanform.loanreq_id.value = loanreq_id;
                document.detleloanform.todo.value = 'reformcadit';
                document.detleloanform.submit();
            }
            function noapproves(loanreq_id) {
                document.detleloanform.loanreq_id.value = loanreq_id;
                document.detleloanform.todo.value = 'noapproves';
                document.detleloanform.submit();
            }
            //            function onsearch(bycitizen_id){
            //                document.loanrequstform.bycitizen_id.value = 'bycitizen_id';
            //                document.loanrequstform.submit();
            //            }
            function callCheckboxActive() {

                $('#chk').find('.active').removeClass('active');
                $('#chk').find('.btn').find('.fa-check').removeClass('fa-check');

                $('#chk').find("input[type='checkbox']:checked").parent('.btn').addClass('active');
                $('#chk').find("input[type='checkbox']:checked").parent('.btn').find('span').addClass('fa-check');



            }
        </script>

        <div>
            <%
                if ("ok".equals(mascess)) {
            %>
            <script >
                function check() {
                    $(document).ready(function () {
                        swal({
                            title: "สำเร็จ",
                            text: "คุณยืนยันเอกสารไม่ผ่านเสร็จเรียบร้อย",
                            type: "success",
                            confirmButtonText: "ตกลง!"
                        },
                                function () {
                                    window.location.href = 'PageAction.do?todo=gotoPageManagermentLoan';
                                });
                    });
                }
            </script>

            <%} else if ("no".equals(mascess)) {
            %>
            <script >
                function check() {
                    swal({
                        title: "ไม่สำเร็จ",
                        text: "คุณสมัครสไม่สำเร็จ !",
                        type: "error",
                        confirmButtonText: "ตกลง!"
                    },
                            function () {
                                //                        window.location.href = 'LoanRequstAction.do?todo=gotoDetle_requestloan&loanreq_id=';
                            });
                }
                ;

            </script>
            <%   }
            %>
        </div>
        <div>
            <%
                if ("ok".equals(msgsascess)) {
            %>
            <script >
                function check() {
                    $(document).ready(function () {
                        swal({
                            title: "สำเร็จ",
                            text: "คุณส่งข้อมูลแก้ไขไปยังลูกค้าสำเร็จ !",
                            type: "success",
                            confirmButtonText: "ตกลง!"
                        },
                                function () {
                                    window.location.href = 'PageAction.do?todo=gotoPageManagermentLoan';
                                });
                    });
                }
            </script>

            <%} else if ("no".equals(msgsascess)) {
            %>
            <script >
                function check() {
                    swal({
                        title: "ไม่สำเร็จ",
                        text: "คุณส่งไม่สำเร็จ !",
                        type: "error",
                        confirmButtonText: "ตกลง!"
                    },
                            function () {
                                //                        window.location.href = 'LoanRequstAction.do?todo=gotoDetle_requestloan&loanreq_id';
                            });
                }
                ;

            </script>
            <%   }
            %>
        </div>
        <div>
            <%
                if ("ok".equals(e_msg)) {
            %>
            <script >
                function check() {
                    $(document).ready(function () {
                        swal({
                            title: "สำเร็จ",
                            text: "คุณยืนยันเอกสารไม่ผ่านเสร็จเรียบร้อย",
                            type: "success",
                            confirmButtonText: "ตกลง!"
                        },
                                function () {
                                    window.location.href = 'PageAction.do?todo=gotoPageManagermentLoan';
                                });
                    });
                }
            </script>

            <%} else if ("no".equals(e_msg)) {
            %>
            <script >
                function check() {
                    swal({
                        title: "ล้มเหลว",
                        text: " ไม่สามารถทำรายการได้ อาจเกิดปัญหาทางกับอินเทอร์เน็ต กรุณาลองใหม่อีกครั้ง !",
                        type: "error",
                        confirmButtonText: "ตกลง!"
                    },
                            function () {
                                //                        window.location.href = 'LoanRequstAction.do?todo=gotoDetle_requestloan&loanreq_id=';
                            });
                }
                ;

            </script>

            <%   }
            %>
        </div>
    </body>

</html>
