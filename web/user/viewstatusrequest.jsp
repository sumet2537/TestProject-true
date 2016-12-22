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
                                        <label class="col-md-4 control-label">รหัสสินเชื่อ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input  name="loanreq_id"  class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ชื่อธนาคาร <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                                <input  name="loanbankreq_id" placeholder="กรุณาใส่ชื่อธนาคาร" class="form-control"  type="text" >
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ชื่อผู้กู้ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-tags"></i></span>
                                                <input  name="firstname" placeholder="รหัสบัตรประจำตัวประชาชน" class="form-control"  type="text"  >
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ผลการพิจารณา <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input  name="judgment" placeholder="กรุณาใส่ชื่อของคุณ" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">สถานะ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                <input  name="loanstatusbank" placeholder="สถานะ" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>
                                   
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">กรอกวงเงินอนุมัติ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                                <input name="approvedamount" placeholder="กรอกวงเงินอนุมัติ" class="form-control" type="text" >
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ยอดผ่อนชำระต่อเดือน <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                <input name="installlments" placeholder="กรุณาใส่ยอดผ่อนชำระต่อเดือน" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>
                                     <div class="form-group">
                                        <label class="col-md-4 control-label">ระยะเวลาการผ่อน <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                <input name="timerepayment" placeholder="กรุณาใส่ระยะเวลาการผ่อน" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-4 control-label">ตำแหน่งผู้อนุมัติ <span class="star">*</span></label>  
                                        <div class="col-md-6 inputGroupContainer">
                                            <div class="input-group">
                                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                <input name="position" placeholder="กรุณาใส่ตำแหน่งผู้อนุมัติ" class="form-control"  type="text">
                                            </div>
                                        </div>
                                    </div>



                                </div>
                                <!-- /.box-body -->
                                <div class="box-footer">
                                    <!--button-->
                                    <div align="center">
                                        <!--<button type="submit" class="btn btn-success" onclick="callinsert('register')">ตกลง</button>&nbsp;&nbsp;&nbsp;&nbsp;-->
                                        <button type="submit" class="btn btn-success"><span class="glyphicon glyphicon-download-alt"></span>  อนุมัติ</button>&nbsp;&nbsp;&nbsp;&nbsp;
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
<%--<div >
                                        <fieldset class="col-md-10 col-md-offset-1">

                                            <div class="box box-primary box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลส่วนตัว ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>

                                                 select 
                                                <div id="collapse" class="collapse in">
                                                    <div class="box-body" >
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="citizen_id">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4 ">
                                                                <input class=" form-control" type="text" name="citizen_id" maxlength="13" readonly="" placeholder="เลขบัตรประจำตัวประชาชน" value="<%=bean.getCitizen_id()%>">
                                                            </div>
                                                        </div>
                                                                <input type="hidden" class="form-control" readonly="" name="title_type" value="<%=bean.getTitle_type()%>">
                                                        
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="firstname">ชื่อ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6 ">
                                                               <input class="form-control" type="text" name="firstName" placeholder="ชื่อ" readonly="" value="<%=bean.getTitle_type()%><%=bean.getFirstName()%>">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="lastName">นามสกุล <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6 ">
                                                                <input class="form-control" type="text" name="lastName" placeholder="นามสกุล" value="<%=bean.getLastName()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="birthdate">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8 col-lg-6">
                                                                <input class="form-control" type="date" name="birthdate" placeholder="วันเดือนปีเกิด" value="<%=bean.getBirthdate()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="birthdate">อายุ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="age" placeholder=" 21 " value="<%=bean.getAge()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="statustype">สถานะสมรส <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input type="text" class="form-control" name="statustype" readonly="" value="<%=bean.getStatustype()%>"/>
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="mobile">เบอร์โทร <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="mobile" maxlength="10" placeholder="เบอร์โทร" readonly="" value="<%=bean.getMobile()%>">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="email">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6 ">
                                                                <input class="form-control" type="text" name="email" placeholder="อีเมล์" value="<%=bean.getEmail()%>" readonly=""/>
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="nationality">สัญชาติ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="nationality" value="<%=bean.getNationality()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="jobtype">อาชีพ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4 ">
                                                                <input class="form-control" type="text" name="jobtype" value="<%=bean.getJobtype()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="province">จังหวัด <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                  <input class="form-control" type="text" name="province" value="<%=bean.getProvince()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="amphur">อำเภอ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="amphur" value="<%=bean.getAmphur()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="district">ตำบล <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="district" value="<%=bean.getDistrict()%>" readonly="">
                                                            </div></div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="addresssenddoc">ที่อยู่ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <textarea class="form-control" name="address" readonly="" ><%=bean.getAddress()%></textarea>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="box box-primary box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลที่อยู่อาศัยที่จะซื้อ ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse1">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>
                                                <div id="collapse1" class="collapse in">
                                                    <div class="box-body">
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-4 control-label" for="hometype">ประเภทที่อยู่อาศัย <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <select  name="hometype" class="form-control">
                                                                    <option value="">:: เลือก ::</option>
                                                                    <option>สินเชื่อบ้านเดี่ยว</option>
                                                                    <option>สินเชื่อบ้านแฝด</option>
                                                                    <option>สินเชื่อทาวน์เฮาส์</option>
                                                                    <option>สินเชื่อคอนโด</option>
                                                                </select>
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-4 control-label" for="tradingprice">ราคาซื้อขาย <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <input  class="form-control"type="text" name="tradingprice" maxlength="11" placeholder="ประเภทที่อยู่อาศัย">
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-4 control-label" for="creditloan">วงเงินสินเชื่อที่ขอกู้ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <input  class="form-control"type="text" name="creditloan" maxlength="11" placeholder="วงเงินสินเชื่อที่ขอกู้">
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-4 control-label" for="lncome_per_month">ระยะเวลาที่ขอกู้ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <input  class="form-control"type="number" name="lncome_per_month" maxlength="2" placeholder="1-2">
                                                                <select  name="lncome_per_month" class="form-control">
                                                                    <option value="">:: เลือก ::</option>
                                                                    <%
                                                                        for (int i = 1; i <= 30; i++) {
                                                                            System.out.print(i + "");
                                                                    %>
                                                                    <option value="<%=i%>"><%=i%></option>
                                                                    <%}
                                                                    %>
                                                                </select>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="box box-primary box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse2">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>
                                                <div class="collapse in" id="collapse2">
                                                    <div class="box-body">
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-4 control-label" for="periodloan">รายได้ประจำต่อเดือน <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <input  class="form-control"type="text" name="periodloan" maxlength="11" placeholder="50,000">
                                                            </div>
                                                        </div>
                                                        <div class="box-body">
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="netprofit">รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-4">
                                                                    <input  class="form-control"type="text" name="netprofit" maxlength="11" placeholder="100,000">
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                
                                                <div class="box box-primary box-solid">
                                                    <div class="box box-header with-border">
                                                        <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                        <div class="box-tools pull-left">
                                                            <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse3">
                                                                <i class="fa fa-minus"></i>
                                                            </button>
                                                        </div>
                                                    </div>
                                                    <div class="collapse in" id="collapse3">
                                                        <div class="box-body">
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copyidcard">สำเนาบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copyidcard" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>

                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copylicenses">สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ) <span class="require" style="color:red;"></span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copylicenses" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copydocumenthome">สำเนาทะเบียนบ้าน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copydocumenthome" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copymarriage">สำเนาทะเบียนสมรส/ใบหย่า/ใบมรณะบัตรของคู่สมรส (ถ้ามี)<span class="require" style="color:red;"></span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copymarriage" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="rename">ใบเปลี่ยนชื่อ-สกุล (ทุกใบ) <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copy_rename" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="salary_slip">สลิปเงินเดือน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="salary_slip" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copy_bankaccount">สำเนาการเดินบัญชีธนาคาร <span  style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copy_bankaccount" accept=".png, .jpg, .jpeg ,.pdf" >
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                
                                                <div class="box box-warning box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลคู่สมรส (ถ้ามี) ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse6">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>

                                                 select 
                                                <div id="collapse6" class="collapse in">
                                                    <div class="box-body" >
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="citizen_p">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4 ">
                                                                <input class=" form-control" type="text" name="citizen_p" maxlength="13"  placeholder="เลขบัตรประจำตัวประชาชน" >
                                                            </div>
                                                        </div>
                                                                
                                                         <div class="form-group col-md-4">
                                                    <label class="col-md-5 control-label" for="title_p">คำนำหน้า <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-7">
                                                        <select class="form-control" name="title_p" >
                                                            <option>:: เลือก ::</option>
                                                            <option value="นาย">นาย</option>
                                                            <option value="นางสาว">นางสาว</option>
                                                            <option value="นาง">นาง</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="firstname_p">ชื่อ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8 ">
                                                               <input class="form-control" type="text" name="firstname_p" placeholder="ชื่อ" >
                                                            </div></div>
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="lastname_p">นามสกุล <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8 ">
                                                                <input class="form-control" type="text" name="lastname_p" placeholder="นามสกุล" >
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="birthdate_p">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="date" name="birthdate_p" placeholder="วันเดือนปีเกิด" >
                                                            </div></div>
                                                         <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="age_p">อายุ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                       
                                                        <select class="form-control" name="age_p">ปี
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
                                                       <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="statustype_p">สถานะ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="statustype_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="โสด">โสด</option>
                                                            <option value="สมรส">สมรส</option>
                                                            <option value="หย่าหร้าง">หย่าหร้าง</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="mobile_p">เบอร์โทร <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="mobile_p" maxlength="10" placeholder="เบอร์โทร" >
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="email_p">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6 ">
                                                                <input class="form-control" type="text" name="email_p" placeholder="อีเมล์" />
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="nationality_p">สัญชาติ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="nationality_p"  placeholder="สัญชาติ">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="jobtype_p">อาชีพ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="jobtype_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="พนักงานเงินเดือนประจำ">พนักงานเงินเดือนประจำ</option>
                                                            <option value="ประกอบอาชีพอิสระ">ประกอบอาชีพอิสระ</option>
                                                             <option value="ไม่ได้ประกอบอาชีพ">ไม่ได้ประกอบอาชีพ</option>
                                                            <option value="ประกอบธุรกิจส่วนตัว">ประกอบธุรกิจส่วนตัว</option>
                                                        </select>
                                                    </div></div>
                                                        
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="province_p">จังหวัด <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="province_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="ขอนแก่น">ขอนแก่น</option>
                                                            <option value="มหาสารคาม">มหาสารคาม</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="amphur_p">อำเภอ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="amphur_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="หนองสองห้อง">หนองสองห้อง</option>
                                                            <option value="มหาสารคาม">มหาสารคาม</option>
                                                        </select>
                                                    </div>
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="district_p">ตำลบ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="district_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="วังหิน">วังหิน</option>
                                                            <option value="ท่าขอนยาง">ท่าขอนยาง</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="address_p">ที่อยู่ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <textarea class="form-control" name="address_p" placeholder="ที่อยู่" ></textarea>
                                                            </div>
                                                        </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copyidcard_p">สำเนาบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copyidcard_p" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copydocumenthome_p">สำเนาทะเบียนบ้าน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copydocumenthome_p" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="salary_slip_p">สลิปเงินเดือน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="salary_slip_p" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copy_bankaccount_p">สำเนาการเดินบัญชีธนาคาร <span  style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copy_bankaccount_p" accept=".png, .jpg, .jpeg ,.pdf" >
                                                                </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                                        <div class="box box-warning box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลผู้ค้ำประกัน ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse6">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>

                                                 select 
                                                <div id="collapse6" class="collapse in">
                                                    <div class="box-body" >
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="citizen_k">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4 ">
                                                                <input class=" form-control" type="text" name="citizen_k" maxlength="13"  placeholder="เลขบัตรประจำตัวประชาชน" >
                                                            </div>
                                                        </div>
                                                                
                                                         <div class="form-group col-md-4">
                                                    <label class="col-md-5 control-label" for="title_k">คำนำหน้า <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-7">
                                                        <select class="form-control" name="title_k" >
                                                            <option>:: เลือก ::</option>
                                                            <option value="นาย">นาย</option>
                                                            <option value="นางสาว">นางสาว</option>
                                                            <option value="นาง">นาง</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="firstname_p">ชื่อ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8 ">
                                                               <input class="form-control" type="text" name="firstname_p" placeholder="ชื่อ" >
                                                            </div></div>
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="lastname_p">นามสกุล <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8 ">
                                                                <input class="form-control" type="text" name="lastname_p" placeholder="นามสกุล" >
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="birthdate_p">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="date" name="birthdate_p" placeholder="วันเดือนปีเกิด" >
                                                            </div></div>
                                                         <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="age_p">อายุ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                       
                                                        <select class="form-control" name="age_p">ปี
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
                                                       <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="statustype_p">สถานะ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="statustype_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="โสด">โสด</option>
                                                            <option value="สมรส">สมรส</option>
                                                            <option value="หย่าหร้าง">หย่าหร้าง</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="mobile_p">เบอร์โทร <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="mobile_p" maxlength="10" placeholder="เบอร์โทร" >
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="email_p">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6 ">
                                                                <input class="form-control" type="text" name="email_p" placeholder="อีเมล์" />
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                            <label class="col-md-6 control-label" for="nationality_p">สัญชาติ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-6">
                                                                <input class="form-control" type="text" name="nationality_p"  placeholder="สัญชาติ">
                                                            </div></div>
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="jobtype_p">อาชีพ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="jobtype_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="พนักงานเงินเดือนประจำ">พนักงานเงินเดือนประจำ</option>
                                                            <option value="ประกอบอาชีพอิสระ">ประกอบอาชีพอิสระ</option>
                                                             <option value="ไม่ได้ประกอบอาชีพ">ไม่ได้ประกอบอาชีพ</option>
                                                            <option value="ประกอบธุรกิจส่วนตัว">ประกอบธุรกิจส่วนตัว</option>
                                                        </select>
                                                    </div></div>
                                                        
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="province_p">จังหวัด <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="province_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="ขอนแก่น">ขอนแก่น</option>
                                                            <option value="มหาสารคาม">มหาสารคาม</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="amphur_p">อำเภอ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="amphur_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="หนองสองห้อง">หนองสองห้อง</option>
                                                            <option value="มหาสารคาม">มหาสารคาม</option>
                                                        </select>
                                                    </div>
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                    <label class="col-md-6 control-label" for="district_p">ตำลบ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-6">
                                                        <select  name="district_p" class="form-control">
                                                            <option>:: เลือก ::</option>
                                                            <option value="วังหิน">วังหิน</option>
                                                            <option value="ท่าขอนยาง">ท่าขอนยาง</option>
                                                        </select>
                                                    </div></div>
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-3 control-label" for="address_p">ที่อยู่ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-4">
                                                                <textarea class="form-control" name="address_p" placeholder="ที่อยู่" ></textarea>
                                                            </div>
                                                        </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copyidcard_p">สำเนาบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copyidcard_p" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copydocumenthome_p">สำเนาทะเบียนบ้าน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copydocumenthome_p" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="salary_slip_p">สลิปเงินเดือน <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="salary_slip_p" accept=".png, .jpg, .jpeg ,.pdf">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="copy_bankaccount_p">สำเนาการเดินบัญชีธนาคาร <span  style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  class="form-control"type="file" name="copy_bankaccount_p" accept=".png, .jpg, .jpeg ,.pdf" >
                                                                </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                                
                                                
                                                <div class="box box-primary box-solid">
                                                    <div class="box box-header with-border">
                                                        <h4> :: ข้อมูลธนาคารที่ต้องการขอกู้ ::</h4>
                                                        <div class="box-tools pull-left">
                                                            <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="collapse" data-target="#collapse4">
                                                                <i class="fa fa-minus"></i>
                                                            </button>
                                                        </div>
                                                    </div>
                                                    <div class="collapse in" id="collapse4">
                                                        <div class="box-body">
                                                            <div class="form-group col-md-12">
                                                                <label class="col-md-4 control-label" for="banktype">ธนาคารที่ต้องการขอกู้ <span class="require" style="color:red;">*</span></label>
                                                                <div class="col-md-8">
                                                                    <input  type="checkbox" name="banktype1" value="กรุงเทพ">กรุงเทพ &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype2" value="กรุงไทย">กรุงไทย &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype3" value="ธนชาติ">ธนชาติ &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype4" value="ทหารไทย">ทหารไทย &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype5" value="ไทยพาณิชย์">ไทยพาณิชย์ &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype6" value="กรุงศรีอยุธยา">กรุงศรีอยุธยา &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype7" value="ออมสิน">ออมสิน &nbsp;&nbsp;&nbsp;
                                                                    <input  type="checkbox" name="banktype8" value="กสิกรไทย">กสิกรไทย &nbsp;&nbsp;&nbsp;
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <fieldset class="col-md-2">
                                                </fieldset>
                                                <fieldset class="col-md-12">
                                                    <div class="form-group col-md-12">
                                                        <br>
                                                        <p class="bg-danger" style="align-content: center; font-size: 17px;"><span style="color: red; font-size: 17px;">**</span>ผู้ขอกู้โปรดกรอกข้อมูลที่เป็นจริงลงในแบบฟอร์มโดยละ
                                                            เอียดซึ่งข้อมูลของท่านถือว่ามีความสำคัญและมีผลต่อการพจิารณาวงเงินสินเชื่อ<span style="color: red; font-size: 17px;">**</span></p>
                                                    </div>
                                                    </div>
                                                </fieldset>
                                                <div class="form-group col-md-12">
                                                    <div align="center">
                                                        <input type="checkbox" name="chk1" id="chk1" value="checkbox" onclick="if (loanrequstform.chk1.checked == false) {
                                                                    loanrequstform.submit.disabled = true;
                                                                } else {
                                                                    loanrequstform.submit.disabled = false;
                                                                }">ยอมรับเงือนไข<br>
                                                    </div>
                                                    <input type="hidden" name="loanstatustype" value="รอตรวจสอบ"/>
                                                    <hr class="hrsuccess">
                                                    <input type="hidden" name="todo" value="save"/>
                                                    <div class="col-md-12" align="center">
                                                        <button type="submit" id="submit" name="submit" class="btn btn-primary" disabled=""  ><span class="glyphicon glyphicon-save"></span>บันทึก</button>
                                                        <a name="reset" type="reset" class="btn btn-danger" ><span class="glyphicon glyphicon-refresh"></span>ยกเลิก</a>
                                                    </div>

                                                    <div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                                                        <div class="modal-dialog">
                                                            <div class="modal-content">

                                                                <div class="modal-header">
                                                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                                    <h4 class="modal-title" id="myModalLabel">ยกเลิก</h4>
                                                                </div>
                                                                <div class="modal-body">
                                                                    คุณแน่ใจแล้วใช้ไหมที่จะยกเลิก
                                                                </div>
                                                                <div class="modal-footer">
                                                                    <button name="reset" type="reset" class="btn btn-danger"  data-toggle="modal" data-target="#myModal" >ยกเลิก</button>
                                                                </div>

                                                            </div>
                                                        </div>
                                                    </div>      </div>
                                        </fieldset>
                                    </div>--%>