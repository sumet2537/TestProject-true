<%-- 
    Document   : register
    Created on : Nov 15, 2016, 10:53:20 PM
    Author     : brass
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>

<% String msg = "";
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
                                                        <input class="form-control" type="text" name="citizen_id" maxlength="13" required="" placeholder="เลขบัตรประจำตัวประชาชน"><br>
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
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="firstName">ชื่อ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="firstName" placeholder="ชื่อ">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="lastName">นามสกุล <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="lastName" placeholder="นามสกุล" >
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="birthdate">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <input class="form-control" type="date" name="birthdate" placeholder="วันเดือนปีเกิด">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="age">อายุ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 col-lg-4">
                                                        <!--<input class="form-control" type="number" name="age" placeholder="อายุ"> ปี-->
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
                                                    <label class="col-md-4 control-label" for="statustype">สถานะสมรส <span class="require" style="color:red;">*</span></label>
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
                                                        <input class="form-control" type="text" name="mobile" maxlength="10" placeholder="เบอร์โทร">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="email">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8 ">
                                                        <input class="form-control" type="text" name="email" placeholder="อีเมล์">
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="addressregistration">ที่อยู่ตามทะเบียนบ้าน </label>
                                                    <div class="col-md-8">
                                                        <textarea class="form-control" name="addressregistration" placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์
                                                                  แขวงบางขุนศรี เขตบางกอกน้อย
                                                                  กรุงเทพ 10700"></textarea>
                                                    </div></div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="addresscurrent">ที่อยู่ปัจจุบัน </label>
                                                    <div class="col-md-8">
                                                        <textarea class="form-control" name="addresscurrent" placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์
                                                                  แขวงบางขุนศรี เขตบางกอกน้อย
                                                                  กรุงเทพ 10700"></textarea>
                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="addresssenddoc">ที่อยู่จัดส่งเอกสาร </label>
                                                    <div class="col-md-8">
                                                        <textarea class="form-control" name="addresssenddoc" placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์
                                                                  แขวงบางขุนศรี เขตบางกอกน้อย
                                                                  กรุงเทพ 10700"></textarea>
                                                    </div>
                                                </div>

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
                                                        <input class="form-control" type="text" name="username" placeholder="ชื่อเข้าสู่ระบบ">
                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="password">รหัสผ่าน <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8">
                                                        <input  class="form-control"type="password" name="password" id="pass1" placeholder="รหัสผ่าน">
                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <label class="col-md-4 control-label" for="cpassword">ยืนยันรหัสผ่าน <span class="require" style="color:red;">*</span></label>
                                                    <div class="col-md-8">
                                                        <input  class="form-control"type="password" name="cpassword" id="pass2" placeholder="ยืนยันรหัสผ่าน"><br>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <input type="hidden" name="todo" value="save"/>
                                    <input type="hidden" name="roleId" value="2"/>
                                    <input type="hidden" name="status" value="1"/>
                                    <div align="center">
                                        <button name="submit" id="submit" type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-save"></span>สมัครสมาชิก</button>
                                        <button name="reset" type="reset" class="btn btn-danger" ><span class="glyphicon glyphicon-refresh"></span>ยกเลิก</button>
                                    </div>
                                    <!--                                        <div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">    data-toggle="modal" data-target="#myModal"
                                                                                <div class="modal-dialog">
                                                                                    <div class="modal-content center">
                                    
                                                                                        <div class="modal-header  center">
                                                                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                                                                            <h4 class="modal-title" id="myModalLabel">สำเร็จแล้ว</h4>
                                                                                        </div>
                                                                                        <div class="modal-body center">
                                                                                            คุณสมัครสมาชิกสำเร็จแล้ว สามารถขอสินเชื่อบ้านผ่านระบบได้
                                                                                            <hr class="hrsuccess">
                                                                                            <br>
                                                                                        </div>
                                                                                        <div class="center">
                                                                                            <br>
                                                                                        <div class=" ">
                                                                                            <button type="submit" name="submit" class="btn btn-primary" onclick="insert('save')"><span class="glyphicon glyphicon-save"></span>บันทึก</button>
                                                                                            <button class="btn btn-danger " data-dismiss="modal" >ยกเลิก</button>
                                                                                            <br>
                                                                                            <br>
                                                                                        </div>
                                                                                        </div>
                                    
                                                                                    </div>
                                                                                </div>
                                                                            </div>-->
                                </fieldset>
                            </div>
                        </div>
                    </div>


                </form>
            </div>
        </div>

        <!--</div>-->
    </section><!-- /.content -->
    <div>
        <%
            if("ok".equals(msg)){
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
            };

        </script>
        <%   }
        %>
    </div>
</body>


<script type="text/javascript">
    function insert(select) {
        document.registerForm.todo.value = select;
        //        document.registerForm.id;
        document.registerForm.submit();

        function myFunction() {
            var pass1 = document.getElementById("pass1").value;
            var pass2 = document.getElementById("pass2").value;
            if (pass1 != pass2) {
                //alert("Passwords Do not match");
                document.getElementById("pass1").style.borderColor = "#E34234";
                document.getElementById("pass2").style.borderColor = "#E34234";
            } else {
                alert("Passwords Match!!!");
            }
        }
    }

</script>

