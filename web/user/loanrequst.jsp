
<%@page import="com.bean.RequestLoanBean"%>
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ระบบขอสินเชื่อบ้าน</title>
    </head>
    <%! UserBean bean = null; %>
    <%--
   --%>
   <%bean = (UserBean) request.getSession().getAttribute("requestBean");
   String msg = "";
    msg = (String) request.getAttribute("requestloanStatus");
   %>
    
   <body onload="check()">
        <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" id="loanrequstform" name="loanrequstform" action="LoanRequstAction.do" method="post" enctype="multipart/form-data">
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <!--box box-solid-->
                            <br>
                            <strong class="text-center"><h3>แบบฟอร์มขอกู้สินเชื่อบ้าน</h3></strong>
                            <div class="box-body">
                                <!--box-body-->
                                <div class="row">
                                    <fieldset class="col-md-2">
                                    </fieldset>
                                    <fieldset class="col-md-8 center">
                                        <hr class="hrred">
                                        <div class="center">
                                        <div class="col-md-12">
                                            <p class="bg-danger center" style="color: red; font-size: 16px;">ผู้ขอกู้โปรดกรอกข้อมูลที่เป็นจริงลงในแบบฟอร์มด้านล่างโดยละ
                                                เอียดซึ่งข้อมูลของท่านถือว่ามีความสำคัญและมีผลต่อการพจิารณาวงเงินสินเชื่อ</p>
                                        </div>
                                            </div>
                                    </fieldset>
                                    <div >
                                        <fieldset class="col-md-8 col-md-offset-2">

                                            <div class="box box-primary box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลส่วนตัว ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>

                                                <!-- select -->
                                                <div class="box-body">
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="citizen_id">เลขบัตรประจำตัวประชาชน <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-5 ">
                                                            <input class=" form-control" type="text" name="citizen_id" maxlength="13" readonly="" placeholder="เลขบัตรประจำตัวประชาชน" value="<%=bean.getCitizen_id()%>">
                                                        </div>
                                                    </div>

                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="title_type">คำนำหน้า <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-4 col-lg-4">
                                                            <input type="text" class="form-control" readonly="" name="title_type" value="<%=bean.getTitle_type()%>">
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="firstname">ชื่อ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8 ">
                                                            <input class="form-control" type="text" name="firstName" placeholder="ชื่อ" readonly="" value="<%=bean.getFirstName()%>">
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="lastName">นามสกุล <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8 ">
                                                            <input class="form-control" type="text" name="lastName" placeholder="นามสกุล" value="<%=bean.getLastName()%>" readonly="">
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="birthdate">วันเดือนปีเกิด <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8 col-lg-4">
                                                            <input class="form-control" type="date" name="birthdate" placeholder="วันเดือนปีเกิด" value="<%=bean.getBirthdate()%>" readonly="">
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="birthdate">อายุ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-4">
                                                            <input class="form-control" type="text" name="age" placeholder=" 21 " value="<%=bean.getAge()%>" readonly="">
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="nationality">สัญชาติ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8 col-lg-4">
                                                            <input class="form-control" type="text" name="nationality" placeholder="สัญชาติ" >
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="statustype">สถานะสมรส <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-4 col-lg-4">
                                                            <input type="text" class="form-control" name="statustype" readonly="" value="<%=bean.getStatustype()%>"/>
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="mobile">เบอร์โทร <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <input class="form-control" type="text" name="mobile" maxlength="10" placeholder="เบอร์โทร" readonly="" value="<%=bean.getMobile()%>">
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="email">อีเมล์ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8 ">
                                                            <input class="form-control" type="text" name="email" placeholder="อีเมล์" value="<%=bean.getEmail()%>" readonly=""/>
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="addressregistration">ที่อยู่ตามทะเบียนบ้าน  <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <textarea class="form-control" name="addressregistration" placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์
                                                                      แขวงบางขุนศรี เขตบางกอกน้อย
                                                                      กรุงเทพ 10700" readonly=""><%=bean.getAddressregistration()%></textarea>
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="addresscurrent">ที่อยู่ปัจจุบัน  <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <textarea class="form-control" name="addresscurrent" placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์
                                                                      แขวงบางขุนศรี เขตบางกอกน้อย
                                                                      กรุงเทพ 10700" readonly=""> <%=bean.getAddresscurrent()%></textarea>
                                                        </div></div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="addresssenddoc">ที่อยู่จัดส่งเอกสาร  <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <textarea class="form-control" name="addresssenddoc"  placeholder="285/33 ซอยจรัญสนิทวงศ์31 ถนนจรัญสนิทวงศ์
                                                                      แขวงบางขุนศรี เขตบางกอกน้อย
                                                                      กรุงเทพ 10700" readonly=""> <%=bean.getAddresssenddoc()%></textarea>
                                                        </div>
                                                    </div>
                                                        
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="jobtype">อาชีพ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <input class="form-control" type="text" name="jobtype" placeholder="อาชีพ">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="box box-primary box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลที่อยู่อาศัยที่จะซื้อ ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>
                                                <div class="box-body">
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="hometype">ประเภทที่อยู่อาศัย <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
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
                                                        <div class="col-md-8">
                                                            <input  class="form-control"type="text" name="tradingprice" maxlength="11" placeholder="ประเภทที่อยู่อาศัย">
                                                        </div>
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="creditloan">วงเงินสินเชื่อที่ขอกู้ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <input  class="form-control"type="text" name="creditloan" maxlength="11" placeholder="วงเงินสินเชื่อที่ขอกู้">
                                                        </div>
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="lncome_per_month">ระยะเวลาที่ขอกู้ <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8 col-lg-4">
                                                            <!--<input  class="form-control"type="number" name="lncome_per_month" maxlength="2" placeholder="1-2">-->
                                                               <select  name="lncome_per_month" class="form-control">
                                                                <option value="">:: เลือก ::</option>
                                                                <%
                                                                    for(int i=1; i<=30;i++){
                                                                    System.out.print(i+"");
                                                                %>
                                                                <option value="<%=i%>"><%=i%></option>
                                                                <%}
                                                                         %>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="box box-primary box-solid">
                                                <div class="box box-header with-border">
                                                    <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                    <div class="box-tools pull-left">
                                                        <button type="button" class="btn btn-box-tool" data-widget="collapse">
                                                            <i class="fa fa-minus"></i>
                                                        </button>
                                                    </div>
                                                </div>
                                                <div class="box-body">
                                                    <div class="form-group col-md-12">
                                                        <label class="col-md-4 control-label" for="periodloan">รายได้ประจำต่อเดือน <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <input  class="form-control"type="text" name="periodloan" maxlength="11" placeholder="50,000">
                                                        </div>
                                                    </div>
                                                    <div class="box-body">
                                                        <div class="form-group col-md-12">
                                                            <label class="col-md-4 control-label" for="netprofit">รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8">
                                                                <input  class="form-control"type="text" name="netprofit" maxlength="11" placeholder="100,000">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="box box-primary box-solid">
                                                    <div class="box box-header with-border">
                                                        <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                        <div class="box-tools pull-left">
                                                            <button type="button" class="btn btn-box-tool" data-widget="collapse">
                                                                <i class="fa fa-minus"></i>
                                                            </button>
                                                        </div>
                                                    </div>
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
                                                            <label class="col-md-4 control-label" for="copy_bankaccount">สำเนาบัญชีธนาคาร <span  style="color:red;">*</span></label>
                                                            <div class="col-md-8">
                                                                <input  class="form-control"type="file" name="copy_bankaccount" accept=".png, .jpg, .jpeg ,.pdf" >
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="box box-primary box-solid">
                                                    <div class="box box-header with-border">
                                                        <h4> :: ข้อมูลธนาคารที่ต้องการขอกู้ ::</h4>
                                                        <div class="box-tools pull-left">
                                                            <button type="button" class="btn btn-box-tool" data-widget="collapse">
                                                                <i class="fa fa-minus"></i>
                                                            </button>
                                                        </div>
                                                    </div>
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
                                              
                                                <fieldset class="col-md-2">
                                                </fieldset>
                                                <fieldset class="col-md-12">
                                                    <div class="form-group col-md-12">
                                                          <br>
                                                        <p class="bg-danger" style="color: red; align-content: center; font-size: 17px;">ผู้ขอกู้โปรดกรอกข้อมูลที่เป็นจริงลงในแบบฟอร์มโดยละ
                                                            เอียดซึ่งข้อมูลของท่านถือว่ามีความสำคัญและมีผลต่อการพจิารณาวงเงินสินเชื่อ</p>
                                                    </div>
                                                    <!--</div>-->
                                                </fieldset>
                                                <div class="form-group col-md-12">
                                                    <div align="center">
                                                        <input type="checkbox" name="chk1" id="chk1" value="checkbox" onclick="if(loanrequstform.chk1.checked==false){loanrequstform.submit.disabled=true;}else{loanrequstform.submit.disabled=false;}">ยอมรับเงือนไข<br>
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
                                    </div>
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
            function check() {
                $(document).ready(function () {
                    swal({
                        title: "สำเร็จ",
                        text: "ดีใจด้วย คุณขอสินเชื่อสำเร็จ !",
                        type: "success"
                    },
                            function () {
                                window.location.href = 'PageAction.do?todo=gotoPageUserViewStatus';
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
                        text: "คุณขอสินเชื่อไม่สำเร็จ ลองใหม่อีกครั้ง!",
                        type: "error"
        },
                    function () {
                        window.location.href = 'PageAction.do?todo=gotoPageDetleRequest';
                        });
            };

        </script>
        <%   }
        %>
    </div>
        <script type="text/javascript">
            function oninsert(select) {
//             swal({
//  title: "Are you sure?",
//  text: "You will not be able to recover this imaginary file!",
//  type: "warning",
//  showCancelButton: true,
//  confirmButtonColor: "#DD6B55",
//  confirmButtonText: "Yes, delete it!",
//  closeOnConfirm: false
//},
//function(){
//  swal("Deleted!", "Your imaginary file has been deleted.", "success");
//});
                document.loanrequstform.todo.value = select;
                document.loanrequstform.submit();
            }
              function callActionsearch(select) {
                document.loanrequstform.todo.value = select;
                document.loanrequstform.submit();
            }
            
//            function onsearch(bycitizen_id){
//                document.loanrequstform.bycitizen_id.value = 'bycitizen_id';
//                document.loanrequstform.submit();
//            }
        </script>
    </body>

</html>
