<%-- 
    Document   : AdminManagermantProfile
    Created on : Nov 23, 2016, 1:07:38 AM
    Author     : brass
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="com.bean.RequestLoanBean"%>
<%@page import="java.util.*"%>
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <%!
        List<RequestLoanBean> loanlist = new ArrayList<RequestLoanBean>();

    %>
    <%  loanlist = (List<RequestLoanBean>) request.getSession().getAttribute("loanList");
        DecimalFormat formatter = new DecimalFormat("###,###.00");
        DecimalFormat phone = new DecimalFormat("###-###-####");
        String msg = "";
        msg = (String) request.getAttribute("deletesuccess");
    %>
    <body onload="check()">

        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">

                    <form name="formloan" method="post" action="LoanRequstAction.do">
                        <section class="content-header">
                            <h1>
                                ข้อมูลสินเชื่อรอตรวจสอบ
                                <small>ของระบบ</small>
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
                                        ตรวจสอบสินเชื่อ
                                    </a>
                                </li>
                            </ol>
                        </section>
                        <section class="content">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="box">
                                        <div class="box-header">
                                            <h3 class="box-title"> รอตรวจสอบ</h3>
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
                                                                    <th>ชื่อ-นามสกุล </th>
                                                                    <th>เบอร์โทร
                                                                    </th>
                                                                    <th>สถานะ
                                                                    </th>
                                                                    <th>วงเงินที่ขอ
                                                                    </th>
                                                                    <th>ส่งขอมูลวันที่
                                                                    </th>
                                                                    <th>ลบ
                                                                    </th>
                                                                    <th>รายละเอียด
                                                                    </th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <% if (loanlist != null && loanlist.size() != 0) {
                                                                        for (int i = 0; i < loanlist.size(); i++) {
                                                                            RequestLoanBean bean = (RequestLoanBean) loanlist.get(i);
                                                                %>
                                                                <tr>
                                                                    <td><%=i + 1%></td>
                                                                    <td><%=bean.getLoanreq_id()%></td>
                                                                    <td><%=bean.getTitle_type()%> &nbsp;<%=bean.getFirstName()%>&nbsp;<%=bean.getLastName()%></td>
                                                                    <td><%=bean.getMobile()%></td>
                                                                    <td><%=bean.getLoanstatustype()%></td>
                                                                    <td><%=formatter.format(bean.getCreditloan())%></td>
                                                                    <td><%=bean.getCreated()%></td>
                                                                    <td> <button  onclick="callActionGotoDelete(<%=bean.getLoanreq_id()%>)" class="btn btn-sm btn-danger" ><i class="fa fa-close"></i></button></td>

                                                                    <td><button class="btn btn-sm btn-primary" type="submit" value="รายละเอียด" onclick="callActionGotoDetle(<%=bean.getLoanreq_id()%>)"><i class="glyphicon glyphicon-folder-open"></i></button></td>
                                                                </tr>

                                                                <%}%>

                                                                <%} else {%>
                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        
                                                            <%}%>

                                                            </tbody>
                                                            <tfoot>
                                                                <tr>
                                                                    <th>ลำดับ  </th>
                                                                    <th>รหัสสินเชื่อ  </th>
                                                                    <th>ชื่อ-นามสกุล </th>
                                                                    <th>เบอร์โทร</th>
                                                                    <th>อีเมล์</th>
                                                                    <th>วงเงินที่ขอ</th>
                                                                    <th>ส่งขอมูลวันที่</th>
                                                                    <th>ลบ</th>
                                                                    <th>รายละเอียด</th>

                                                                </tr>
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
                        <input type="hidden" name="loanreq_id"/>
                    </form>
                </div>
            </div>
        </section>
    </body>
    <script type="text/javascript">

        function callActionGotoDelete(loanreq_id) {
            document.formloan.loanreq_id.value = loanreq_id;
            document.formloan.todo.value = 'deleteRcheck';
            document.formloan.submit();
        }
        function callActionGotoDetle(loanreq_id) {
            document.formloan.loanreq_id.value = loanreq_id;
            document.formloan.todo.value = 'DetleRcheck';
            document.formloan.submit();

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
                                window.location.href = 'PageAction.do?todo=gotoPageManagermentLoan';
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
                            window.location.href = 'PageAction.do?todo=gotoPageManagermentLoan';
                        });
            }
            ;

        </script>
        <%   }
        %>
    </div>
</html>
