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
    <body>

        <%!
            List<RequestLoanBean> loanlist = new ArrayList<RequestLoanBean>();

        %>
        <%  loanlist = (List<RequestLoanBean>) request.getSession().getAttribute("loanList");
            DecimalFormat formatter = new DecimalFormat("###,###.00");
            DecimalFormat phone = new DecimalFormat("###-###-####");
        %>
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">

                    <form name="formshowdaterequestloan" method="post" action="LoanRequstAction.do">
                        <section class="content-header">
                            <h1>
                                ข้อมูลไม่ผ่านการอนุมัติ
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
                                        ไม่ผ่านการอนุมัติ
                                    </a>
                                </li>
                            </ol>
                        </section>
                        <section class="content">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="box">
                                        <div class="box-header">
                                            <h3 class="box-title"> ไม่ผ่านการอนุมัติ</h3>
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
                                                                    <td> <button class="btn btn-sm btn-danger" type="submit" value="ลบ" onclick="callActionGotoDelete(<%=bean.getLoanreq_id()%>)"><i class="fa fa-close"></i></button></td>
                                                                            <%--<td class="sorting_1"><button class="btn btn-sm btn-success" type="submit" value="แก้ไข" onclick="callActionGotoEdit(<%=bean.getUser_id()%>)"><i class="glyphicon glyphicon-edit"></i></button></td>--%>
                                                                    <td><button class="btn btn-sm btn-primary" type="submit" value="รายละเอียด" onclick="callActionGotoDetle(<%=bean.getLoanreq_id()%>)"><i class="glyphicon glyphicon-folder-open"></i></button></td>
                                                                </tr>
                                                            <div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                                                <div class="modal-dialog">
                                                                    <div class="modal-content center">

                                                                        <div class="modal-header  center">
                                                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                                            <h4 class="modal-title" id="myModalLabel">ยืนยันการลบ</h4>
                                                                        </div>
                                                                        <div class="modal-body center">
                                                                            คุณต้องการลบข้อมูลใช่หรือไม่
                                                                            <hr class="hrsuccess">
                                                                            <br>
                                                                        </div>
                                                                        <div class="center">
                                                                            <br>
                                                                            <div class=" ">
                                                                                <button class="btn btn-sm btn-danger" type="submit" value="ลบ" onclick="callActionGotoDelete(<%=bean.getLoanreq_id()%>)"><i class="fa fa-close">ลบ</i></button>
                                                                                <button class="btn btn-danger " data-dismiss="modal" >ยกเลิก</button>
                                                                                <br>
                                                                                <br>
                                                                            </div>
                                                                        </div>

                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <%}%>
                                                            <%} else {%>
<!--                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        -->
                                                            <%}%>

                                                            </tbody>
                                                            <tfoot>
                                                                <tr>
                                                                    <th>ลำดับ  </th>
                                                                    <th>รหัสสินเชื่อ  </th>
                                                                    <th>ชื่อ-นามสกุล </th>
                                                                    <th>เบอร์โทร
                                                                    </th>
                                                                    <th>อีเมล์
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
//        alert(คุณต้องการลบขอ้มูลใช่หรือไม่);
            document.formshowdaterequestloan.loanreq_id.value = loanreq_id;
            document.formshowdaterequestloan.todo.value = 'deleteNoAp';
            document.formshowdaterequestloan.submit();
        }
        function callActionGotoDetle(loanreq_id) {
            document.formshowdaterequestloan.loanreq_id.value = loanreq_id;
            document.formshowdaterequestloan.todo.value = 'DetleNoAp';
            document.formshowdaterequestloan.submit();

        }
        function callActionGotoEdit(loanreq_id) {
            document.formshowdaterequestloan.loanreq_id.value = loanreq_id;
            document.formshowdaterequestloan.todo.value = 'gotoEdit';
            document.formshowdaterequestloan.submit();
        }
        function callActionGotosearch(select) {
            document.formshowdaterequestloan.todo.value = select;
            document.formshowdaterequestloan.submit();
        }


       
    </script>       
    
</html>
