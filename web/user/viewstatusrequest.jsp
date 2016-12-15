<%-- 
    Document   : viewstatusrequest
    Created on : Dec 11, 2016, 4:39:05 AM
    Author     : brass
--%>

<%@page import="com.bean.UserBean"%>
<%@page import="com.bean.RequestLoanBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
    <%-- ! 
    RequestLoanBean bean = null;
//    UserBean userBean = null;
    %>
    <% 
        bean = (RequestLoanBean) request.getSession().getAttribute("loanbean");
//        userBean = (UserBean) request.getSession().getAttribute("requestBean");
        
        String msg = "";
        msg = (String) request.getAttribute("registerStatus");
    --%>
    
    <body onload="Success1()">
        <div class="container">
            <h2 align="center">รายการอนุมัติ</h2>
            <div class="col-sm-2"></div>
            <div class="col-md-8">
                <div class="row">
                    <!--box-->
                    <section class="content">
                        <div class="box box-info">
                            <div class="box-header with-border ">
                                <h3 class="box-title">ลงทะเบียน</h3>
                            </div>
                            <form class="form-horizontal" name="formview" action="SenddatawsAction.do" method="post"  id="register_form" autocomplete="on">

                                <div class="box-body">
                                    <input type="hidden" name="todo" value="register">


                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ชื่อเข้าใช้ระบบ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input  name="u_username" placeholder="กรุณาใส่ชื่อเข้าใช้ระบบ" class="form-control"  type="text" maxlength="10">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label">รหัสผ่าน <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                                <input  name="u_password" placeholder="กรุณาใส่รหัสผ่าน" class="form-control"  type="password" maxlength="10">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">รหัสบัตรประจำตัวประชาชน <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-tags"></i></span>
                                                <input  name="u_citizen" placeholder="รหัสบัตรประจำตัวประชาชน" class="form-control"  type="text" pattern= "[0-9]" maxlength="13">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ชื่อ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input  name="u_fname" placeholder="กรุณาใส่ชื่อของคุณ" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">นามสกุล <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input  name="u_lname" placeholder="กรุณาใสนามสกุล" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>
                                   
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">เบอร์โทร <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                                <input name="u_tel" placeholder="0833261877" class="form-control" type="text" pattern= "[0-9]" maxlength="10">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">อีเมล์ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                <input name="u_email" placeholder="กรุณาใส่อีเมล์ของคุณ" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>



                                </div>
                                <!-- /.box-body -->
                                <div class="box-footer">
                                    <!--button-->
                                    <div align="center">
                                        <!--<button type="submit" class="btn btn-success" onclick="callinsert('register')">ตกลง</button>&nbsp;&nbsp;&nbsp;&nbsp;-->
                                        <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-download-alt"></span>  ลงทะเบียน</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                        <!--<button type="reset" class="btn btn-danger">ยกเลิก</button>-->
                                    </div>
                                </div>
                            </form>


                        </div>
                        <!-- /.box-footer-->
                    </section>
                </div>
                <!--</section>-->
                <!-- end box -->
            </div>
        </div>
        <div class="col-sm-2"></div>
        <!--alert--> 
        <div >
          
            <script type="text/javascript">
                function Success() {
    //                    swal("สำเร็จ!", ", Your account is created!", "success");
                $(document).ready(function () {
                swal({
                title: "สำเร็จ",
                        text: "ลงทะเบียนสำเร็จ เข้าสู่ระบบ",
                        type: "success"
                },
                        function () {
                        window.location.href = 'PageAction.do?todo=gotoPageLogin';
                        });
                });
                }
            </script>

            <script type="text/javascript">
                function Success() {
                swal("ไม่สำเร็จ", "Account is not removed!", "error");
                }
                        function () {
                        window.location.href = 'PageAction.do?todo=gotoPageRegister';
                        };
                
            </script>
        </div>
        <!--alert-->

    </body>
    
        <script type="text/javascript">
        function callActionGotoEdit(loanreq_id) {
        document.formshowdaterequestloan.loanreq_id.value = loanreq_id;
        document.formshowdaterequestloan.todo.value = 'gotoEdit';
        document.formshowdaterequestloan.submit();
        }
    </script>
</html>
