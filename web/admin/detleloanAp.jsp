<%-- 
    Document   : detleloancheck
    Created on : Dec 9, 2016, 3:32:01 AM
    Author     : brass
--%>

<%@page import="com.bean.bankBean"%>
<%@page import="com.bean.ApproveLoanBean"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.bean.RequestLoanBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%!
            ApproveLoanBean bean1 = null;
            bankBean bank = null;
            RequestLoanBean bean = null;%>
        <%--
        --%>
        <%
            bean1 = (ApproveLoanBean) request.getSession().getAttribute("abean");
            bank = (bankBean) request.getSession().getAttribute("bank");
            bean = (RequestLoanBean) request.getSession().getAttribute("loanbean");
            DecimalFormat formatter = new DecimalFormat("###,###.00");
            DecimalFormat phone = new DecimalFormat("###-###-####");
        %>

    <body>
        <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" id="loanrequstform" name="detleloanform" action="LoanRequstAction.do" method="post" >
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <!--box box-solid-->
                            <br>
                            <h3 class="center"><strong >รายละเอียดสินเชื่อผ่านการอนุมัติ</strong></h3>
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
                                                        <h4> :: ข้อมูลส่วนตัว :: &nbsp;&nbsp;&nbsp;&nbsp;รหัสสินเชื่อ : &nbsp;&nbsp;<%=bean.getLoanreq_id()%>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>เลขบัตรประจำตัวประชาชน : &nbsp;&nbsp;<span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean.getCitizen_id()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>คำนำหน้า :<span style="color:#0033FF; font-size: 17px;"><%=bean.getTitle_type()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label for="firstname">ชื่อ : &nbsp;&nbsp;<span  style="color:#0033FF; font-size: 17px;"><%=bean.getFirstName()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>นามสกุล: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getLastName()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วันเดือนปีเกิด: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getBirthdate()%></span></label>
                                                            <input type="hidden" name="birthdate" value="<%=bean.getBirthdate()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อายุ: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getAge()%></span> &nbsp;&nbsp;ปี</label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สัญชาติ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getNationality()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สถานะสมรส : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getStatustype()%></span></label>
                                                            <input type="hidden" name="statustype" value="<%=bean.getStatustype()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>เบอร์โทร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getMobile()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อีเมล์ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getEmail()%></span></label>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>อาชีพ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getJobtype()%></span></label>
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

        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" id="detleloanform" name="detleform" action="ApproveLoanAction.do" method="post" enctype="multipart/form-data">
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <a href="#" onclick="javascript:window.print();" class="pull-right"><i class="glyphicon glyphicon-print"></i></a>
                            <!--box box-solid-->

                            <br>
                            <h3 class="center"><strong >รายละเอียดการอนุมัติของ&nbsp;<font color="red">ธนาคาร<%=bank.getBankname()%></font></strong></h3>
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
                                                <div class="box box-primary">
                                                    <div class="box-header">
                                                        <h4> :: รายละเอียด ::</h4>
                                                    </div>
                                                    <div class="box-body">

                                                        <div class="form-group">
                                                            <div class="col-md-3 ">
                                                                <label >ชื่อผู้กู้ :</label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getFirstName()%>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>นามสกลุ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getLastName()%>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ยอดเงินที่ที่ขอกู้ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=formatter.format(bean.getCreditloan())%>&nbsp;&nbsp;บาท
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>ระยะเวลาที่ขอผ่อนชำระ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getLncome_per_month()%>&nbsp;&nbsp;ปี
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ผลการพิจารณา : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean1.getJudgment()%>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>สถานะ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean1.getLoanstatusbank()%>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>วงเงินที่อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=formatter.format(bean1.getApprovedamount())%>&nbsp;&nbsp;บาท
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>ระยะเาลาการผ่อนจ่าย : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean1.getTimerepayment()%>&nbsp;&nbsp;ปี
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ยอดชำระต่อเดือน : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=formatter.format(bean1.getInstalllments())%> &nbsp;&nbsp;บาท/เดือน
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>ชื่อผู้อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean1.getCreatedby()%>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ตำแหน่งผู้อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean1.getPosition()%>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>วันที่อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getCreated()%>
                                                            </div>
                                                        </div>
                                                    </div> 
                                                    <hr class="hrsuccess">
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
                                document.loanrequstform.todo.value = select;
                                document.loanrequstform.submit();
                            }
                            function callActionsearch(select) {
                                document.loanrequstform.todo.value = select;
                                document.loanrequstform.submit();
                            }

                            //            function onsearch(bycitizen_id){
                            //                document.loanrequstform.bycitizen_id.value = 'bycitizen_id';
                            //                document.loanrequstform.submit();
                            //            }
                        </script>
                        </body>

                        </html>
