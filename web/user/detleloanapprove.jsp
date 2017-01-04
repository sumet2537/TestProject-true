

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
    </head>
    <%! ApproveLoanBean bean = null;
        bankBean bank = null;
        RequestLoanBean loan = null;
//           ApproveLoanBean bean1 = null;
%>
 
    <% bean = (ApproveLoanBean) request.getSession().getAttribute("abean");
        bank = (bankBean) request.getSession().getAttribute("bank");
//           bean1 = (ApproveLoanBean)  request.getSession().getAttribute("abean");
        loan = (RequestLoanBean) request.getSession().getAttribute("loanbean");
        
        DecimalFormat formatter = new DecimalFormat("###,###.00");
        DecimalFormat phone = new DecimalFormat("###-###-####");
        String msg = "";
        msg = (String) request.getAttribute("resultemail");
    %>

    <body onload="check()">
        <!-- Main content -->
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
                                                                <%=loan.getFirstName()%>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>นามสกลุ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=loan.getLastName()%>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ยอดเงินที่ที่ขอกู้ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=formatter.format(loan.getCreditloan())%>&nbsp;&nbsp;บาท
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>ระยะเวลาที่ขอผ่อนชำระ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=loan.getLncome_per_month()%>&nbsp;&nbsp;ปี
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ผลการพิจารณา : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getJudgment()%>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>สถานะ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getLoanstatusbank()%>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>วงเงินที่อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=formatter.format(bean.getApprovedamount())%>&nbsp;&nbsp;บาท
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>ระยะเาลาการผ่อนจ่าย : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getTimerepayment()%>&nbsp;&nbsp;ปี
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ยอดชำระต่อเดือน : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=formatter.format(bean.getInstalllments())%> &nbsp;&nbsp;บาท/เดือน
                                                            </div>
                                                            <div class="col-md-3">
                                                                <label>ชื่อผู้อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getCreatedby()%>
                                                            </div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-3">
                                                                <label>ตำแหน่งผู้อนุมัติ : </label>
                                                            </div>
                                                            <div class="col-md-3">
                                                                <%=bean.getPosition()%>
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
                                                    <div class="col-md-12 ">
                                                        <div class="center">
                                                            <a href="#popup2" class="btn btn-twitter" >ยืนยันการกู้กับธนาคารนี้</a>
                                                        </div>
                                                        <div>
                                                </div>
                                            </div>
                                        </fieldset>
                                                            <div class="center">
                                                        <div id="popup2" class="overlay1" style="margin-top: 55px;">
                                                            <div class="popupr" style="width: 40%;">
                                                                <h2 style="color: blue;">ยืนยันการขอกู้</h2>
                                                                <div class="content1" style="padding-bottom: 5px;">
                                                                    แจ้งไปยังธนาคาร
                                                                </div>
                                                                กรุณายืนยัน Email หรือ Gmail ของคุณ
                                                                 <div class="form-group">
                                        <label class="col-md-4 control-label">อีเมลของคุณ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-send"></i></span>
                                                <input  name="email"  class="form-control"  type="email"  value="<%=loan.getEmail()%>">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label">รหัสผ่าน <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                                <input   name="passemail"  placeholder="กรุณากรอกรหัสผ่าน" class="form-control" required="true" type="password" >
                                            </div>
                                        </div>
                                    </div>
                                                                <input type="hidden" name="citizen_id" value="<%=bean.getCitizen_id()%>">
                                                                        <input type="hidden" name="emailbank" value="<%=bank.getEmailbank()%>"/>
                                                                        <input type="hidden" name="firstname" value="<%=loan.getFirstName()%>">
                                                                        <input type="hidden" name="loanreq_id" value="<%=loan.getLoanreq_id()%>"/>
                                                                        <input type="hidden" name="todo"/>
                                                                <hr class="sohrpopup" style="margin-top: 20;">

                                                                <div style="text-align: center" >
                                                                    <button class="btn btn-twitter" onclick="sendemail('email')">ยืนยัน</button>
                                                                    <a class="btn btn-danger"  href="#">ยกเลิก</a>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div> 
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

            function sendemail(select) {
                document.detleform.todo.value = select;
                document.detleform.submit();
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
                            text: "ยินดีด้วย คุณยืนยันการขอกู้กับธนาคารนี้เรียบร้อยแล้ว โปรทำตามขั้นตอนต่อไป ภายใน 7 วัน !",
                            type: "success",
                            confirmButtonText: "ตกลง"
                        },
                                function () {
                                    //                                window.location.href = 'PageAction.do?todo=gotoPageManagermentLoan';
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
                        text: "คุณยืนยันไม่สำเร็จ กรุณาลองอีกครั้ง !",
                        type: "error",
                        confirmButtonText: "ตกลง!"
                    },
                            function () {
                                //                        window.location.href = '';
                            });
                }
                ;

            </script>
            <%   }
            %>
        </div>

    </body>

</html>
