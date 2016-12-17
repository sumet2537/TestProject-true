

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
        <%--
        --%>
        <% bean = (ApproveLoanBean) request.getSession().getAttribute("abean");
           bank = (bankBean) request.getSession().getAttribute("bank");
//           bean1 = (ApproveLoanBean)  request.getSession().getAttribute("abean");
           loan= (RequestLoanBean) request.getSession().getAttribute("loanbean");
            DecimalFormat formatter = new DecimalFormat("###,###.00");
            DecimalFormat phone = new DecimalFormat("###-###-####");
            String msg = "";
            msg = (String) request.getAttribute("deletesuccess");
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
                                                        <h4> :: ข้อมูลส่วนตัว :: <%=bean.getCitizen_id()%><%=bean.getBank_id()%></h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <%=bank.getBankname()%><%=bank.getEmailbank()%>
                                                        <%=loan.getPeriodloan()%>
                                                        <%--<%=bean1.getPosition()%>--%>
                                                    <hr class="hrsuccess">
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
                                                                      

                                                                        <input type="hidden" name="loanstatustype" value="เอกสารไม่ผ่าน"/>
                                                                    </div>

                                                                </div>

                                                                <hr class="sohrpopup" style="margin-top: 0;">

                                                                <div style="text-align: center" >
                                                                    <button class="btn btn-twitter" onclick="editapproves('')">ยืนยัน</button>
                                                                    <a class="btn btn-danger"  href="#">ยกเลิก</a>
                                                                </div>
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
<script type="text/javascript">
   
    function editapproves(loanreq_id) {
        document.detleloanform.loanreq_id.value = loanreq_id;
        document.detleloanform.todo.value = 'editapproves';
        document.detleloanform.submit();
    }
</script>


    <div>
        <%
            if("ok".equals(msg)){
        %>
        <script >
            function check() {
                $(document).ready(function () {
                    swal({
                        title: "สำเร็จ",
                        text: "คุณยืนยันการขอกู้กับธนาคารนี้แล้ว โปรทำตามขั้นตอนต่อไป !",
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
                        text: "คุณยืนยันไม่สำเร็จ !",
                        type: "error",
                        confirmButtonText: "ตกลง!"
        },
                    function () {
//                        window.location.href = '';
                        });
            };

        </script>
        <%   }
        %>
    </div>
    
</body>

</html>
