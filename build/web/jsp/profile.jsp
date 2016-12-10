
<%@page import="java.util.*"%>
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>--%>

<%! UserBean bean = null;
String msg ="";
%>

<% bean = (UserBean) request.getSession().getAttribute("profiledate");
msg = (String) request.getAttribute("returneditprofile");
%> 

 <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" name="profileForm" action="registerAction.do" method="post" >
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <br>
                           <strong class="text-center">  <h3> แก้ไขข้อมูลส่วนตัว </h3> </strong>
                            <div class="box-body">
                                <div class="row">
                                    <fieldset class="col-md-8 col-md-offset-1">
                                        <div class="col-lg-12">
                                            <h4> :: ข้อมูลส่วนตัว ::</h4>
                                            <hr/>
                                        </div>
                                        <!-- select -->

                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="citizen_id">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 ">
                                                <input class="form-control" type="text" name="citizen_id" maxlength="13" required="" value="<%=bean.getCitizen_id()%>" ><br>
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
                                            <label class="col-md-4 control-label" for="age"อายุ <span class="require" style="color:red;">*</span></label>
                                            <div class="col-md-8 col-lg-4">
                                                <input class="form-control" type="number" name="age" value="<%=bean.getAge()%>" >
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="statustype">สถานะสมรส <span class="require" style="color:red;">*</span></label>
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
                                            <label class="col-md-4 control-label" for="addressregistration">ที่อยู่ตามทะเบียนบ้าน </label>
                                            <div class="col-md-8">
                                                <textarea class="form-control" name="addressregistration" ><%=bean.getAddressregistration()%></textarea>
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="addresscurrent">ที่อยู่ปัจจุบัน </label>
                                            <div class="col-md-8">
                                                <textarea class="form-control" name="addresscurrent" ><%=bean.getAddresscurrent()%></textarea>
                                            </div></div>
                                        <div class="form-group col-md-12">
                                            <label class="col-md-4 control-label" for="addresssenddoc">ที่อยู่จัดส่งเอกสาร </label>
                                            <div class="col-md-8">
                                                <textarea class="form-control" name="addresssenddoc" ><%=bean.getAddresssenddoc()%></textarea>
                                            </div>
                                        </div>
                                        
                                                <input type="hidden" name="todo"/>
                                        <input type="hidden" name="roleId" value="2"/>
                                        <input type="hidden" name="status" value="1"/>
                                        <div align="center">
                                            <button type="submit" name="submit" class="btn btn-primary" onclick="onupdate('user_update')">แก้ไข</button>
                                            <button name="reset" type="reset" class="btn btn-danger" >ยกเลิก</button>
                                        </div>
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <!--</div>-->
        </section><!-- /.content -->
        <script type="text/javascript">
            function onupdate(select) {
                document.profileForm.todo.value = select;
                document.profileForm.submit();
            }
        </script>