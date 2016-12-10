<%-- 
    Document   : detle_user
    Created on : Nov 25, 2016, 6:06:28 PM
    Author     : brass
--%>

<%@page import="java.util.*"%>
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>--%>

<%! UserBean bean = null;%>

<% bean = (UserBean) request.getSession().getAttribute("detleuser");
%> 

 <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" name="detleuserForm" action="registerAction.do" method="post" >
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <br>
                           <strong class="text-center">  <h3> ข้อมูลส่วนตัว </h3> </strong>
                            <div class="box-body">
                                <div class="row">
                                    <fieldset class="col-md-10 col-md-offset-1">
                                        <div class="col-lg-10">
                                            <h4>ลำดับที่ : <%=bean.getUser_id()%>  ข้อมูลคุณ : <%=bean.getFirstName()%> </h4>
                                              </div>
                                            <div class="col-lg-2" align="right">
                                        <a class="btn btn-sm btn-success" href="registerAction.do?todo=gotouserEdit" ><i class="glyphicon glyphicon-edit"></i>แก้ไขข้อมูล</a>
                                        </div>
                                            
                                      
                                        <!-- select -->
 <div class="col-lg-10">
                                            <h4>ข้อมูลส่วนตัว</h4>
                                            <hr/>
                                              </div>
                                        <div class="form-group col-md-12">
                                            <label >เลขบัตรประจำตัวประชาชน   : &nbsp;&nbsp;<%=bean.getCitizen_id()%> </label>
                                        </div>
                                          <div class="form-group col-md-4">
                                              <label  for="title_type">คำนำหน้า : &nbsp;&nbsp;<%=bean.getTitle_type()%> </label></div>
                                        <div class="form-group col-md-4">
                                            <label  for="firstName">ชื่อ : &nbsp;&nbsp; <%=bean.getFirstName()%></label>
                                          </div>
                                        <div class="form-group col-md-4">
                                            <label  for="lastName">นามสกุล : &nbsp;&nbsp; <%=bean.getLastName()%></label>
                                         </div>
                                        <div class="form-group col-md-4">
                                            <label  for="birthdate">วันเดือนปีเกิด : &nbsp;&nbsp;  <%=bean.getBirthdate()%></label>
                                           </div>
                                           <div class="form-group col-md-4">
                                               <label  for="birthdate">อายุ : &nbsp;&nbsp;  <%=bean.getBirthdate()%></label>
                                           </div>
                                        <div class="form-group col-md-4">
                                            <label for="statustype">สถานะสมรส  : &nbsp;&nbsp;<%=bean.getStatustype()%></label>
                                            
                                           </div>
                                        <div class="form-group col-md-4">
                                            <label>เบอร์โทร  : &nbsp;&nbsp;<%=bean.getMobile()%></label>
                                                
                                            </div>
                                        <div class="form-group col-md-4">
                                            <label >อีเมล์  : &nbsp;&nbsp; <%=bean.getEmail()%></label>
                                             
                                            </div>
                                        <div class="form-group col-md-12">
                                            <label >ที่อยู่ตามทะเบียนบ้าน : &nbsp;&nbsp; <%=bean.getAddressregistration()%></label>
                                             
                                            </div>
                                        <div class="form-group col-md-12">
                                            <label >ที่อยู่ปัจจุบัน   <%=bean.getAddresscurrent()%></label>
                                             
                                            </div>
                                        <div class="form-group col-md-12">
                                            <label >ที่อยู่จัดส่งเอกสาร : &nbsp;&nbsp;<%=bean.getAddresssenddoc()%></label>
                                               
                                            </div>
                                            <br>
                                            <div class="col-lg-10">
                                            <h4>ข้อมูลเข้าสู่ระบบ</h4>
                                            <hr/>
                                              </div>
                                        <input type="hidden" name="todo"/>
                                        <input type="hidden" name="roleId" value="2"/>
                                        <input type="hidden" name="status" value="1"/>
                                        
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <!--</div>-->
        </section><!-- /.content -->
        <script type="text/javascript">//
//           function callActionGotoEdituser(select){
//        document.detleuserForm.todo.value = select;
//        document.detleuserForm.submit();
//        }
//        </script>