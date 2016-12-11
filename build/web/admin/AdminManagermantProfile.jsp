<%-- 
    Document   : AdminManagermantProfile
    Created on : Nov 23, 2016, 1:07:38 AM
    Author     : brass
--%>

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
            List<UserBean> regislist = new ArrayList<UserBean>();

        %>
        <%  regislist = (List<UserBean>) request.getSession().getAttribute("regisList"); %>
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">

                    <form name="formshowdateuser" method="post" action="registerAction.do">
                        <section class="content-header">
                            <h1>
                                ข้อมูลลูกค้า
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
                                        จัดการผู้ใช้
                                    </a>
                                </li>
                            </ol>
                        </section>
                        <section class="content">
                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="box">
                                        <div class="box-header">
                                            <h3 class="box-title"> ข้อมูลสมาชิก</h3>
                                        </div>
                                        <!--.box-header-->
                                        <div class="box-body">
                                          
                                                <div class="row">
                                                    <div class="col-sm-12">
                                                        <table id="example1" class="table table-striped table-bordered">
                                                            <thead>
                                                                <tr>
                                                                    <th class="sorting_asc" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" aria-sort="ascending"
                                                                        aria-label="Rendering engine: activate to sort column descending" style="width: 50px;">ลำดับ
                                                                    </th>
                                                                    <th class="sorting_asc" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" aria-sort="ascending"
                                                                        aria-label="Rendering engine: activate to sort column descending" style="width: 50px;">เลขบัตร
                                                                    </th>
                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" 
                                                                        colspan="1" aria-label="Browser: activate to sort column ascending" style="width: 100px;">ชื่อ-นามสกุล
                                                                    </th>
                                                                    <!--                                                        <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" 
                                                                                                                                aria-label="Platform(s): activate to sort column ascending" style="width: 93px;">สถานะสมรส
                                                                                                                            </th>-->
                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" 
                                                                        aria-label="Platform(s): activate to sort column ascending" style="width: 90px;">เบอร์โทร
                                                                    </th>
                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1"
                                                                        aria-label="Engine version: activate to sort column ascending" style="width: 60px;">อีเมล์
                                                                    </th>
                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" 
                                                                        aria-label="CSS grade: activate to sort column ascending" style="width: 100px;">ที่อยู่
                                                                    </th>
                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" 
                                                                        aria-label="CSS grade: activate to sort column ascending" style="width: 40px;">ลบ
                                                                    </th>
                                                                    <!--                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" 
                                                                                                                                            aria-label="CSS grade: activate to sort column ascending" style="width: 40px;">แก้ไข
                                                                                                                                        </th>-->
                                                                    <th class="sorting" tabindex="0" aria-controls="example1" rowspan="1" colspan="1" 
                                                                        aria-label="CSS grade: activate to sort column ascending" style="width: 40px;">รายละเอียด
                                                                    </th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <%
                                                                    if (regislist != null && regislist.size() != 0) {
                                                                        for (int i = 0; i < regislist.size(); i++) {
                                                                            UserBean bean = (UserBean) regislist.get(i);
                                                                %>
                                                                <tr role="row" class="odd">
                                                                    <td class="sorting_1"><%=i + 1%></td>
                                                                    <td class="sorting_1"><%=bean.getCitizen_id()%></td>
                                                                    <td class="sorting_1"><%=bean.getTitle_type()%> &nbsp;<%=bean.getFirstName()%>&nbsp;<%=bean.getLastName()%></td>
                                                                    <%----<td class="sorting_1"><%=bean.getStatustype()%></td>--%>
                                                                    <td class="sorting_1"><%=bean.getMobile()%></td>
                                                                    <td class="sorting_1"><%=bean.getEmail()%></td>
                                                                    <td class="sorting_1"><%=bean.getAddressregistration()%></td>
                                                                    <td class="sorting_1"><button class="btn btn-sm btn-danger" type="submit" value="ลบ" onclick="callActionGotoDelete(<%=bean.getUser_id()%>)"><i class="fa fa-close"></i></button></td>
                                                                            <%--<td class="sorting_1"><button class="btn btn-sm btn-success" type="submit" value="แก้ไข" onclick="callActionGotoEdit(<%=bean.getUser_id()%>)"><i class="glyphicon glyphicon-edit"></i></button></td>--%>
                                                                    <td class="sorting_1"><button class="btn btn-sm btn-primary" type="submit" value="รายละเอียด" onclick="callActionGotoDetle(<%=bean.getUser_id()%>)"><i class="glyphicon glyphicon-folder-open"></i></button></td>
                                                                </tr>
                                                                <%}%>
                                                                <%} else {%>
                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        
                                                            <%}%>
                                                            </tbody>
                                                            <tfoot>
                                                                <tr>
                                                                    <th>ลำดับ</th>
                                                                    <th>เลขบัตร </th>
                                                                    <th>ชื่อ-นามสกุล</th>
                                                                    <th>เบอร์โทร</th>
                                                                    <th>อีเมล์</th>
                                                                    <th>ที่อยู่</th>
                                                                    <th>ลบ</th>
                                                                    <!--<th>แก้ไข</th>-->
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
                        <input type="hidden" name="user_id"/>
                    </form>
                </div>
            </div>
        </section>
    </body>
    <script type="text/javascript">
        function callActionGotoDelete(user_id) {
//        alert(คุณต้องการลบขอ้มูลใช่หรือไม่);
            document.formshowdateuser.user_id.value = user_id;
            document.formshowdateuser.todo.value = 'delete';
            document.formshowdateuser.submit();
        }
        function callActionGotoDetle(user_id) {
            document.formshowdateuser.user_id.value = user_id;
            document.formshowdateuser.todo.value = 'Detle';
            document.formshowdateuser.submit();

        }
        function callActionGotoEdit(user_id) {
            document.formshowdateuser.user_id.value = user_id;
            document.formshowdateuser.todo.value = 'gotoEdit';
            document.formshowdateuser.submit();
        }
        function callActionGotosearch(select) {
            document.formshowdateuser.todo.value = select;
            document.formshowdateuser.submit();
        }

    </script>
</html>
