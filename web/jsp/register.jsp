<%-- 
    Document   : register
    Created on : Nov 15, 2016, 10:53:20 PM
    Author     : brass
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.ProvinceBean"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%!
    List<ProvinceBean> prolist = null;
%>
<%
    prolist = (List<ProvinceBean>) request.getSession().getAttribute("list");
//   List<ProvinceBean> loanlist = null;
//      loanlist = (ArrayList<ProvinceBean>) request.getAttribute("regisList");
    List<ProvinceBean> loanlist1 = null;
    loanlist1 = (ArrayList<ProvinceBean>) request.getAttribute("regisList1");
    List<ProvinceBean> loanlist2 = null;
    loanlist2 = (ArrayList<ProvinceBean>) request.getAttribute("regisList2");

    String msg = "";
    msg = (String) request.getAttribute("registerStatus");
%>
<!DOCTYPE html>


<body onload="Success()">
    <!-- Main content -->
    <section class="content">
        <!-- Info boxes -->
        <div class="row">
            <div class="col-md-12">
                <form class="form-horizontal" name="registerForm" id="registerForm" action="registerAction.do" method="post" autocomplete="on">
                    <!--<div align="center">-->
                    <div class="box box-solid" >
                        <br>
                        <strong class="text-center"> <h3>สมัครสมาชิก</h3></strong>
                        <div class="box-body">
                            <div class="row">
                                <fieldset class="col-md-8 col-md-offset-2">
                                    <div class="form-group">
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                                <h4> :: ข้อมูลส่วนตัว ::</h4>
                                            </div>
                                            <div class="panel-body">


                                                <!-- select -->

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="citizen_id">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="citizen_id" maxlength="13"  placeholder="เลขบัตรประจำตัวประชาชน" required="true"><br>
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="title_type">คำนำหน้า <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <select class="form-control" name="title_type" >
                                                            <option>:: เลือก ::</option>
                                                            <option value="นาย">นาย</option>
                                                            <option value="นางสาว">นางสาว</option>
                                                            <option value="นาง">นาง</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="firstName">ชื่อ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="firstName" placeholder="ชื่อ" required="true">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="lastName">นามสกุล <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="lastName" placeholder="นามสกุล" required="true">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="birthdate">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <input class="form-control" type="date" name="birthdate" placeholder="วันเดือนปีเกิด" required="true">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="age">อายุ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">

                                                        <select class="form-control" name="age">ปี
                                                            <option>::เลือก::</option>
                                                            <%
                                                                for (int i = 20; i <= 60; i++) {
                                                            %>
                                                            <option value="<%=i%>"><%=i%></option>
                                                            <%
                                                                }
                                                            %>
                                                        </select>
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="statustype">สถานะ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <select  name="statustype" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="โสด">โสด</option>
                                                            <option value="สมรส">สมรส</option>
                                                            <option value="หย่าหร้าง">หย่าหร้าง</option>
                                                        </select>
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="mobile">เบอร์โทร <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8">
                                                        <input class="form-control" type="text" name="mobile" maxlength="10" placeholder="เบอร์โทร" required="true">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="email">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="email" placeholder="อีเมล์" required="true">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="nationality">สัญชาติ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="nationality" placeholder="อีเมล์" required="true">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="jobtype">อาชีพ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <select  name="jobtype" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="พนักงานเงินเดือนประจำ">พนักงานเงินเดือนประจำ</option>
                                                            <option value="ประกอบอาชีพอิสระ">ประกอบอาชีพอิสระ</option>
                                                            <option value="ไม่ได้ประกอบอาชีพ">ไม่ได้ประกอบอาชีพ</option>
                                                            <option value="ประกอบธุรกิจส่วนตัว">ประกอบธุรกิจส่วนตัว</option>
                                                        </select>
                                                    </div></div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="province">จังหวัด <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <select  name="province" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <% if (prolist != null && prolist.size() != 0) {
                                                                    for (int i = 0; i < prolist.size(); i++) {
                                                                        ProvinceBean bean = (ProvinceBean) prolist.get(i);

                                                            %>
                                                            <option value="<%=bean.getPROVINCE_NAME()%>"><%=bean.getPROVINCE_NAME()%></option>
                                                            <%}%><%} else {%>
                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        
                                                            <%}%>
                                                        </select>
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="amphur">อำเภอ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <select  name="amphur" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <% if (loanlist1 != null && loanlist1.size() != 0) {
                                                                    for (int i = 0; i < loanlist1.size(); i++) {
                                                                        ProvinceBean bean = (ProvinceBean) loanlist1.get(i);

                                                            %>
                                                            <option value="<%=bean.getAMPHUR_NAME()%>"><%=bean.getAMPHUR_NAME()%></option>
                                                            <%}%><%} else {%>
                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        
                                                            <%}%>
                                                        </select>
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="district">ตำลบ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <select  name="district" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <% if (loanlist2 != null && loanlist2.size() != 0) {
                                                                    for (int i = 0; i < loanlist2.size(); i++) {
                                                                        ProvinceBean bean = (ProvinceBean) loanlist2.get(i);

                                                            %>
                                                            <option value="<%=bean.getDISTRICT_NAME()%>"><%=bean.getDISTRICT_NAME()%></option>
                                                            <%}%><%} else {%>
                                                            <br><br>
                                                            <strong style="color: red">ไม่พบข้อมูลสมาชิก</strong>        
                                                            <%}%>
                                                        </select>
                                                    </div></div>

                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="address">ที่อยู่ </label>
                                                    <div class="col-md-8">
                                                        <textarea class="form-control" name="address" placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์" required="true"></textarea>
                                                    </div></div>

                                            </div>
                                        </div>
                                        <div class="panel panel-danger">
                                            <div class="panel-heading">
                                                <h4>ข้อมูลเข้าสู่ระบบ ::</h4>
                                            </div>
                                            <div class="panel-body">
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="username">ชื่อใช้เข้าสู่ระบบ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8">
                                                        <input class="form-control" type="text" name="username" placeholder="ชื่อเข้าสู่ระบบ" minlength="6" maxlength="13" required="true">
                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="password">รหัสผ่าน <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8">
                                                        <input  class="form-control"type="password" name="password" id="pass1" placeholder="รหัสผ่าน" minlength="6" maxlength="13" required="true">
                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="cpassword">ยืนยันรหัสผ่าน <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8">
                                                        <input  class="form-control"type="password" name="cpassword" id="pass2" placeholder="ยืนยันรหัสผ่าน" minlength="6" maxlength="13" required="true"><br>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <input type="hidden" name="todo" />
                                    <input type="hidden" name="roleId" value="2"/>
                                    <input type="hidden" name="status" value="1"/>
                                    <div align="center">
                                        <button name="submit" id="submit" type="submit" onclick="insert('save')" class="btn btn-primary"><span class="glyphicon glyphicon-save"></span>สมัครสมาชิก</button>
                                        <button name="reset" type="reset" class="btn btn-danger" ><span class="glyphicon glyphicon-refresh"></span>ยกเลิก</button>
                                    </div>
                                    </section><!-- /.content -->
                                    <div>
                                        <%
                                            if ("ok".equals(msg)) {
                                        %>
                                        <script >
                                            function Success() {
                                                $(document).ready(function () {
                                                    swal({
                                                        title: "สำเร็จ",
                                                        text: "คุณสมัครสมาชิกสำเร็จ เข้าสู่ระบบ",
                                                        type: "success",
                                                        confirmButtonText: "ตกลง!"
                                                    },
                                                            function () {
                                                                window.location.href = 'PageAction.do?todo=gotoPageLogin';
                                                            });
                                                });
                                            }
                                        </script>

                                        <%} else if ("no".equals(msg)) {
                                        %>
                                        <script >
                                            function Success() {
                                                swal({
                                                    title: "ไม่สำเร็จ",
                                                    text: "คุณสมัครสไม่สำเร็จ !",
                                                    type: "error",
                                                    confirmButtonText: "ตกลง!"
                                                },
                                                        function () {
                                                            window.location.href = 'PageAction.do?todo=gotoPageRegister';
                                                        });
                                            }
                                            ;

                                        </script>
                                        <%   }
                                        %>
                                    </div>
                                    </body>


                                    <script type="text/javascript">
                                        function insert(select) {
                                            document.registerForm.todo.value = select;
                                             var pass1 = document.getElementById("pass1")
                                                , pass2 = document.getElementById("pass2");

                                        function validatePassword() {
                                            if (pass1.value != pass2.value) {
                                                pass2.setCustomValidity("Passwords Don't Match");
                                            } else {
                                                pass2.setCustomValidity('');
                                                document.registerForm.submit();
                                            }
                                        }

                                        pass1.onchange = validatePassword;
                                        pass2.onkeyup = validatePassword; 
                                        }
                                    </script>

