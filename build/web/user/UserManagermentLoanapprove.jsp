<%-- 
    Document   : AdminManagermantProfile
    Created on : Nov 23, 2016, 1:07:38 AM
    Author     : brass
--%>

<%@page import="com.bean.ApproveLoanBean"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="com.bean.RequestLoanBean"%>
<%@page import="java.util.*"%>
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

   
    <%!
        ArrayList<ApproveLoanBean> loanlist = null;
        RequestLoanBean bean = null;
    %>
    <%
        loanlist = (ArrayList<ApproveLoanBean>) request.getSession().getAttribute("loanList");

        bean = (RequestLoanBean) request.getSession().getAttribute("loan");
        DecimalFormat formatter = new DecimalFormat("###,###.00");
        String msg = "";
        msg = (String) request.getAttribute("deletesuccess");
    %>
 <% if (bean.getLoanstatustype() != null){

    %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
 

   

    <body onload="check()">

        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" name="detleloanformApprove" action="ApproveLoanAction.do" method="post" enctype="multipart/form-data">
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

                                            <div class="form-group ">
                                                <div class="panel panel-info">
                                                    <div class="panel-heading">
                                                        <a href="#collap" data-toggle="collapse" > <h4> :: ข้อมูลส่วนตัว :: </h4></a>
                                                    </div>
                                                    <div class="collapse" id="collap">
                                                        <div class="panel-body">
                                                            <div class="form-group col-md-12">
                                                                <label>เลขบัตรประจำตัวประชาชน : &nbsp;&nbsp;<span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean.getCitizen_id()%></span></label>
                                                                <input  type="hidden" name="loanreq_id" value="<%=bean.getLoanreq_id()%>">
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
                                                            </div>
                                                            <div class="form-group col-md-4">
                                                                <label >อายุ: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getAge()%></span> &nbsp;&nbsp;ปี</label>
                                                            </div>
                                                            <div class="form-group col-md-4">
                                                                <label >สัญชาติ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getNationality()%></span></label>
                                                            </div>
                                                            <div class="form-group col-md-4">
                                                                <label >สถานะสมรส : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getStatustype()%></span></label>
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
                                                            <%--                                                            <div class="form-group col-md-4">
                                                                                                                            <label >ที่อยู่ตามทะเบียนบ้าน : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddressregistration()%></span></label>
                                                                                                                        </div>
                                                                                                                        <div class="form-group col-md-4">
                                                                                                                            <label>ที่อยู่ปัจจุบัน : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddresscurrent()%></span></label>
                                                                                                                        </div>
                                                                                                                        <div class="form-group col-md-4">
                                                                                                                            <label>ที่อยู่จัดส่งเอกสาร  <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddresssenddoc()%></span></label>
                                                                                                                        </div>--%>
                                                        </div>

                                                        <div class="panel panel-success">
                                                            <div class="panel-heading">
                                                                <h4> :: ข้อมูลที่อยู่อาศัยที่จะซื้อ ::</h4>
                                                            </div>
                                                            <div class="panel-body">
                                                                <div class="form-group col-md-4">
                                                                    <label >ประเภทที่อยู่อาศัย: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getHometype()%></span></label>
                                                                </div>
                                                                <div class="form-group col-md-4">
                                                                    <label >ราคาซื้อขาย: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getTradingprice())%>&nbsp;&nbsp;</span>บาท</label>
                                                                </div>
                                                                <div class="form-group col-md-4">
                                                                    <label>วงเงินสินเชื่อที่ขอกู้ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getCreditloan())%>&nbsp;&nbsp;</span>บาท</label>
                                                                </div>
                                                                <div class="form-group col-md-4">
                                                                    <label >ระยะเวลาที่ขอกู้ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getLncome_per_month()%>&nbsp;&nbsp;</span>ปี</label>
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
                                                                </div>
                                                                <div class="form-group col-md-6">
                                                                    <label>รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getNetprofit())%>&nbsp;&nbsp;</span>บาท</label>
                                                                </div>
                                                            </div>
                                                        </div>

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
        <%}else{%>
        <section class="content">
            <div class="center"><h1>คุณยังไม่ได้ทำการขอสินเชื่อ </h1></div>
        </section>
        <%}%>
        <%if(loanlist != null) {%>
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form name="formshowapprove" method="post" action="ApproveLoanAction.do" enctype="multipart/form-data">
                        <section class="content-header">
                            <h1>
                                ข้อมูลการอนุมัติ
                                <small>ของคุณ</small>
                            </h1>
                            <ol class="breadcrumb">
                                <li>
                                    <a href="PageAction.do?todo=gotoPageHome">
                                        <i class="fa fa-plus-square">
                                        </i>
                                        หน้าแรก
                                    </a>
                                </li>
                                <li class="active">
                                    <a href="#">
                                        <i class="fa fa-plus-square">
                                        </i>
                                        ข้อมูลการอนุมัติ
                                    </a>
                                </li>
                            </ol>
                        </section>
                        <section class="content">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="box">
                                        <div class="box-header">
                                            <h3 class="box-title"> ข้อมูลการอนุมัติ</h3>
                                        </div>
                                        <!--.box-header-->
                                        <div class="box-body">
                                            <div >
                                                <div class="row">
                                                    <div class="col-sm-12">
                                                        <table id="example1" class="table table-striped table-bordered">
                                                            <thead>
                                                                <tr>
                                                                    <th>ลำดับ  </th>
                                                                    <th>รหัสสินเชื่อ  </th>
                                                                    <th>ชื่อธนาคาร </th>
                                                                    <th>สถานะ </th>
                                                                    <th>วงเงินที่อนุมัติ </th>
                                                                    <th>ยอดผ่อนชำระต่อเดือน</th>
                                                                    <th>วันที่อนุมัติ </th>
                                                                    <th>รายละเอียด </th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <% if (loanlist != null && loanlist.size() != 0) {
                                                                        for (int i = 0; i < loanlist.size(); i++) {
                                                                            ApproveLoanBean Approvebean = (ApproveLoanBean) loanlist.get(i);

                                                                %>
                                                                <tr>
                                                                    <td><%=i + 1%></td>
                                                                    <%-- <td><%=Approvebean.getApprove_id()%></td>--%>
                                                                    <td><%=Approvebean.getLoanreq_id()%></td>
                                                                    <td><%=Approvebean.getBankName()%></td>
                                                                    <%--  <td><%=Approvebean.getJudgment()%></td>--%>
                                                                    <td><%=Approvebean.getLoanstatusbank()%></td>
                                                                    <td><%=formatter.format(Approvebean.getApprovedamount())%></td>
                                                                    <td><%=formatter.format(Approvebean.getInstalllments())%></td>
                                                                    <td><%=Approvebean.getCreated()%></td>
                                                                    <td><button class="btn btn-sm btn-primary"  onclick="callActionGotoDetle('<%=Approvebean.getApprove_id()%>')"><i class="glyphicon glyphicon-folder-open"></i></button></td>
                                                                </tr>

                                                                <%}%>

                                                                <%} else {%>
                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        
                                                            <%}%>

                                                            </tbody>
                                                            <tfoot>
                                                            </tfoot>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>
                        <input type="hidden" name="todo"/>
                        <input type="hidden" name="approve_id"/>
                    </form>
                </div>
            </div>
        </section>
        <%} else {%>
        <section class="content">
            <div class="center"><h1>รอธนาคารอนุมัติ </h1></div>
        </section>
        <%}%>
    </body>


    <script type="text/javascript">

        function callActionGotoDelete(approve_id) {
            document.formshowapprove.approve_id.value = approve_id;
            document.formshowapprove.todo.value = 'delete';
            document.formshowapprove.submit();
        }
        function callActionGotoDetle(approve_id) {
            document.formshowapprove.approve_id.value = approve_id;
            document.formshowapprove.todo.value = 'Detle';
            document.formshowapprove.submit();

        }
    </script> 

    <script>
        function GotoDelete() {
            swal({
                title: "คุณ แน่ใจแล้วใช่ไหม ?",
                text: "ลบรายการขอสินเชื่อ !",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "ใช่,ลบเลย !",
                closeOnConfirm: false
            },
                    function () {
                        swal("ลบ!", "ตกลง", "success");

                    });
        }
    </script>
    <div>
        <%
            if ("ok".equals(msg)) {
        %>
        <script >
            function check() {
                $(document).ready(function () {
                    swal({
                        title: "สำเร็จ",
                        text: "คุณลบข้อมูลสำเร็จ !",
                        type: "success",
                        confirmButtonText: "ตกลง!"
                    },
                            function () {
                                window.location.href = 'ApproveLoanAction.do?todo=gotoPageUserViewStatus';
                            });
                });
            }
        </script>

        <%} else if ("no".equals(msg)) {
        %>
        <script >
            function check() {
                swal({
                    title: "ไม่สำเร็จ",
                    text: "คุณลบข้อมูลไม่สำเร็จ !",
                    type: "error",
                    confirmButtonText: "ตกลง!"
                },
                        function () {
                            window.location.href = 'ApproveLoanAction.do?todo=gotoPageUserViewStatus';
                        });
            }
            ;

        </script>
        <%   }
        %>
    </div>

</html>
