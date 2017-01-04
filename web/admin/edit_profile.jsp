<%-- 
    Document   : edit_profile
    Created on : Nov 24, 2016, 2:16:03 PM
    Author     : brass
--%>

<%@page import="java.util.*"%>
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>--%>

<%! UserBean bean = new UserBean();%>
<% bean = (UserBean) request.getSession().getAttribute("editBean");
String msg = "";
    msg = (String) request.getAttribute("msg");
%> 

 <!-- Main content -->
 <body onload="check()">
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" name="profileForm" action="registerAction.do" method="post" >
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <br>
                           <strong class="text-center">  <h3> แก้ไขข้อมูลลูกค้า </h3> </strong>
                           <hr class="hrbrue">
                            <div class="box-body">
                                <div class="row">
                                    <fieldset class="col-md-8 col-md-offset-2">
                                        <div class="panel panel-info">
                                            <div class="panel-heading">
                                            <h4>ลำดับที่ : <%=bean.getUser_id()%>  ข้อมูลคุณ : <%=bean.getFirstName()%> </h4>
                                        </div>
                                        <div class="panel panel-body">
                                            
                                      
                                        
                                        <!-- select -->

                                        <div class="form-group col-md-12">
                                            <br>
                                            <label class="col-md-4 control-label" for="citizen_id">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 ">
                                                <input class="form-control" type="text" name="citizen_id" maxlength="13" required="" value="<%=bean.getCitizen_id()%>" readonly=""><br>
                                            </div></div>
                                          <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="title_type">คำนำหน้า <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 col-lg-4">
                                                <select class="form-control" name="title_type" >
                                                    <option ><%=bean.getTitle_type()%></option>
                                                    <option>นาย</option>
                                                    <option>นางสาว</option>
                                                    <option>นาง</option>
                                                </select>
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="firstName">ชื่อ <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 ">
                                                <input class="form-control" type="text" name="firstName" value="<%=bean.getFirstName()%>" >
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="lastName">นามสกุล <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 ">
                                                <input class="form-control" type="text" name="lastName" value="<%=bean.getLastName()%>" >
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="birthdate">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 col-lg-4">
                                                <input class="form-control" type="date" name="birthdate" value="<%=bean.getBirthdate()%>" >
                                            </div></div>
                                              <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="age">อายุ <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-4 col-lg-4">
                                                <input class="form-control" type="text" name="age" value="<%=bean.getAge()%>" >
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="statustype">สถานะ <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 col-lg-4">
                                                <select  name="statustype" class="form-control">
                                                    <option ><%=bean.getStatustype()%></option>
                                                    <option>โสด</option>
                                                    <option>สมรส</option>
                                                    <option>หย่าหร้าง</option>
                                                </select>
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="mobile">เบอร์โทร <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8">
                                                <input class="form-control" type="text" name="mobile" maxlength="10" value="<%=bean.getMobile()%>">
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="email">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 ">
                                                <input class="form-control" type="text" name="email" value="<%=bean.getEmail()%>" >
                                            </div></div>
                                          <div class="form-group col-md-12">
                                        <label class="col-md-4 control-label" for="nationality">สัญชาติ <span class="require" style="color:red;">*</span></label>
                                        <div class="col-md-8 ">
                                            <input class="form-control" type="text" name="nationality" value="<%=bean.getNationality()%>" >
                                        </div></div>
                                                  <div class="form-group col-md-12">
                                        <label class="col-md-4 control-label" for="jobtype">อาชีพ <span class="require" style="color:red;">*</span></label>
                                        <div class="col-md-8 col-lg-4">
                                            <select  name="jobtype" class="form-control">
                                                <option ><%=bean.getJobtype()%></option>
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
                                                <option ><%=bean.getProvince()%></option>
                                                <option>โสด</option>
                                                <option>สมรส</option>
                                                <option>หย่าหร้าง</option>
                                            </select>
                                        </div></div>
                                                  <div class="form-group col-md-12">
                                        <label class="col-md-4 control-label" for="amphur">อำเภอ <span class="require" style="color:red;">*</span></label>
                                        <div class="col-md-8 col-lg-4">
                                            <select  name="amphur" class="form-control">
                                                <option ><%=bean.getAmphur()%></option>
                                            </select>
                                        </div></div>
                                                  <div class="form-group col-md-12">
                                        <label class="col-md-4 control-label" for="district">ตำบล <span class="require" style="color:red;">*</span></label>
                                        <div class="col-md-8 col-lg-4">
                                            <select  name="district" class="form-control">
                                                <option ><%=bean.getDistrict()%></option>
                                            </select>
                                        </div></div>
                                    <div class="form-group col-md-12">
                                        <label class="col-md-4 control-label" for="addresssenddoc">ที่อยู่ <span class="require" style="color:red;">*</span></label>
                                        <div class="col-md-8">
                                            <textarea class="form-control" name="address" ><%=bean.getAddress()%></textarea>
                                        </div>
                                    </div>
                                        
                                            <input type="hidden" name="todo" value="<%=bean.getUser_id()%>"/>
                                        <!--<input type="hidden" name="roleId" value="2"/>-->
                                        <input type="hidden" name="status" value="1"/>
                                        
                                        <div align="center">
                                            <button type="submit" name="submit" class="btn btn-primary" onclick="insert('admin_update')">แก้ไข</button>
                                            <button name="reset" type="reset" class="btn btn-danger" >ยกเลิก</button>
                                        </div>
                                          </div>
                                            </div>
                                    </fieldset>
                                </div>
                            </div>
                                        <hr class="hrred">
                        </div>
                    </form>
                </div>
            </div>

            <!--</div>-->
        </section><!-- /.content -->
 </body>
        <script type="text/javascript">
            function insert(select) {
                document.profileForm.todo.value = select;
                document.profileForm.submit();
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
                        text: "ดีใจด้วย คุณแก้ไขข้อมูลสำเร็จ !",
                        type: "success"
                    },
                            function () {
                                window.location.href = 'registerAction.do?todo=gotoPageAdminManagermentProfile';// 
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
                    text: "คุณแก้ไขข้อมูลไม่สำเร็จ ลองใหม่อีกครั้ง!",
                    type: "error"
                },
                        function () {
                            window.location.href = 'registerAction.do?todo=gotoadminEdit';
                        });
            }
            ;

        </script>
        <%   }
        %>
    </div>