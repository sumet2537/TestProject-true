<%-- 
    Document   : detleloancheck
    Created on : Dec 9, 2016, 3:32:01 AM
    Author     : brass
--%>

<%@page import="com.bean.RequestLoanBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%! RequestLoanBean bean = null;%>
        <%--
        --%>
        <%bean = (RequestLoanBean) request.getSession().getAttribute("editBean");%>

    <body>
        <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <form class="form-horizontal" id="loanrequstform" name="detleloanform" action="LoanRequstAction.do" method="post" >
                        <!--<div align="center">-->
                        <div class="box box-solid" >
                            <!--box box-solid-->
                            <br>
                            <h3 class="center"><strong >ตรวจสอบการขอกู้</strong></h3>
                            <div class="box-body">
                                <!--box-body-->
                                <div class="row">
                                    <fieldset class="col-md-2">
                                    </fieldset>
                                    <fieldset class="col-md-8 center">
                                        <hr class="hrbrue">
                                    </fieldset>
                                    <div >
                                        <fieldset class="col-md-10 col-md-offset-1">
                                            <div class="form-group">
                                                <div class="panel panel-info">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลส่วนตัว ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>เลขบัตรประจำตัวประชาชน : <span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean.getCitizen_id()%></span></label>
                                                            <input  type="hidden" name="citizen_id" value="<%=bean.getCitizen_id()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>คำนำหน้า :<span style="color:#0033FF; font-size: 17px;"><%=bean.getTitle_type()%></span></label>
                                                            <input type="hidden"  name="title_type" value="<%=bean.getTitle_type()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label for="firstname">ชื่อ :<span  style="color:#0033FF; font-size: 17px;"><%=bean.getFirstName()%></span></label>
                                                            <input  type="hidden" name="firstName" value="<%=bean.getFirstName()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>นามสกุล :<span style="color:#0033FF; font-size: 17px;"><%=bean.getLastName()%></span></label>
                                                            <input type="hidden" name="lastName" value="<%=bean.getLastName()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วันเดือนปีเกิด :<span style="color:#0033FF; font-size: 17px;"><%=bean.getBirthdate()%></span></label>
                                                            <input type="hidden" name="birthdate" value="<%=bean.getBirthdate()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อายุ :<span style="color:#0033FF; font-size: 17px;"><%=bean.getAge()%></span></label>
                                                            <input  type="hidden" name="age" value="<%=bean.getAge()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สัญชาติ :<span style="color:#0033FF; font-size: 17px;">*</span></label>
                                                            <input name="nationality" type="hidden" <%=bean.getNationality()%> >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สถานะสมรส <span style="color:#0033FF; font-size: 17px;">*</span></label>
                                                            <input type="hidden" name="statustype" value="<%=bean.getStatustype()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>เบอร์โทร <span style="color:#0033FF; font-size: 17px;">*</span></label>
                                                            <input type="hidden" name="mobile" value="<%=bean.getMobile()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อีเมล์ <span style="color:#0033FF; font-size: 17px;"><%=bean.getEmail()%></span></label>
                                                            <input type="hidden" name="email"  value="<%=bean.getEmail()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>อาชีพ <span style="color:#0033FF; font-size: 17px;"><%=bean.getJobtype()%></span></label>
                                                            <input type="hidden" name="joptype" value="<%=bean.getJobtype()%>">
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <label >ที่อยู่ตามทะเบียนบ้าน  <span style="color:#0033FF; font-size: 17px;">*</span></label>
                                                            <textarea hidden name="addressregistration" ><%=bean.getAddressregistration()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <label>ที่อยู่ปัจจุบัน  <span style="color:#0033FF; font-size: 17px;">*</span></label>
                                                            <textarea hidden name="addresscurrent" > <%=bean.getAddresscurrent()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>ที่อยู่จัดส่งเอกสาร  <span style="color:#0033FF; font-size: 17px;">*</span></label>
                                                            <textarea hidden name="addresssenddoc"> <%=bean.getAddresssenddoc()%></textarea>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-success">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลที่อยู่อาศัยที่จะซื้อ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-4">
                                                            <label >ประเภทที่อยู่อาศัย <span style="color:#0033FF; font-size: 17px;"><%=bean.getHometype()%></span></label>
                                                            <input type="hidden"  name="hometype" value="<%=bean.getHometype()%>" />
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >ราคาซื้อขาย <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8">
                                                                <input  class="form-control" type="text" name="tradingprice" maxlength="11" placeholder="ประเภทที่อยู่อาศัย">
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="creditloan">วงเงินสินเชื่อที่ขอกู้ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8">
                                                                <input  class="form-control" type="text" name="creditloan" maxlength="11" placeholder="วงเงินสินเชื่อที่ขอกู้">
                                                            </div>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="lncome_per_month">ระยะเวลาที่ขอกู้ <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8 col-lg-4">
                                                                <!--<input  class="form-control"type="number" name="lncome_per_month" maxlength="2" placeholder="1-2">-->
                                                                <select  name="lncome_per_month" class="form-control">
                                                                </select>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="panel panel-danger">
                                                <div class="panel panel-heading">
                                                    <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div class="form-group col-md-4">
                                                        <label class="col-md-4 control-label" for="periodloan">รายได้ประจำต่อเดือน <span class="require" style="color:red;">*</span></label>
                                                        <div class="col-md-8">
                                                            <input  class="form-control" type="text" name="periodloan" maxlength="11" placeholder="50,000">
                                                        </div>
                                                    </div>
                                                    <div class="box-body">
                                                        <div class="form-group col-md-4">
                                                            <label class="col-md-4 control-label" for="netprofit">รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน <span class="require" style="color:red;">*</span></label>
                                                            <div class="col-md-8">
                                                                <input  class="form-control" type="text" name="netprofit" maxlength="11" placeholder="100,000">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="panel panel-warning">
                                                <div class="panel-heading">
                                                    <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div class="form-group col-md-12">
                                                        <label >สำเนาบัตรประจำตัวประชาชน :<span class="require" style="color:red;"><%=bean.getCopyidcard()%></span></label>
                                                        <input  type="hidden" name="copyidcard" value="<%=bean.getCopyidcard()%>">
                                                    </div>

                                                    <div class="form-group col-md-12">
                                                        <label>สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ) :<span class="require" style="color:red;"><%=bean.getCopylicenses()%></span></label>
                                                        <input type="hidden" name="copylicenses" value="<%=bean.getCopylicenses()%>">
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label>สำเนาทะเบียนบ้าน :<span class="require" style="color:red;"><%=bean.getCopydocumenthome()%></span></label>
                                                            <input type="hidden" name="copydocumenthome" value="<%=bean.getCopydocumenthome()%>">
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label>สำเนาทะเบียนสมรส/ใบหย่า/ใบมรณะบัตรของคู่สมรส (ถ้ามี) :<span class="require" style="color:red;"><%=bean.getCopymarriage()%></span></label>
                                                        <input type="hidden" name="copymarriage" value="<%=bean.getCopymarriage()%>">
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label >ใบเปลี่ยนชื่อ-สกุล (ทุกใบ) :<span class="require" style="color:red;"><%=bean.getCopy_rename()%></span></label>
                                                        <input  type="hidden"  name="copy_rename" value="<%=bean.getCopy_rename()%>">
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label>สลิปเงินเดือน :<span class="require" style="color:red;"><%=bean.getSalary_slip()%></span></label>
                                                        <input  type="hidden" name="salary_slip"  value="<%=bean.getSalary_slip()%>">
                                                    </div>
                                                    <div class="form-group col-md-12">
                                                        <label>สำเนาบัญชีธนาคาร :<span class="require" style="color:red;"><%=bean.getCopy_bankaccount()%></span></label>
                                                            <input type="hidden" name="copy_bankaccount"  value="<%=bean.getCopy_bankaccount()%>">
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="panel panel-info">
                                                <div class="panel-heading">
                                                    <h4> :: ข้อมูลธนาคารที่ต้องการขอกู้ ::</h4>
                                                </div>
                                                <div class="panel-body">
                                                    <div class="form-group col-md-12">
                                                        <label>ธนาคารที่ต้องการขอกู้ <span class="require" style="color:red;"><%=bean.getBanktype()%></span></label>
                                                        <div class="col-md-8">
                                                            <input  type="hidden" name="banktype1" value="<%=bean.getBanktype()%>">
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <div align="center">
                                            <input type="checkbox" name="chk1" id="chk1" value="checkbox" onclick="if (loanrequstform.chk1.checked == false) {
                                                                    loanrequstform.submit.disabled = true;
                                                                } else {
                                                                    loanrequstform.submit.disabled = false;
                                                                }">ยอมรับเงือนไข<br>
                                        </div>
                                        <input type="hidden" name="loanstatustype" value="รออนุมัติ"/>
                                        <hr class="hrsuccess">
                                        <input type="hidden" name="todo"/>
                                        <div class="col-md-12" align="center">
                                            <button type="submit" id="submit" name="submit" class="btn btn-primary" disabled="" onclick="oninsert('save')" ><span class="glyphicon glyphicon-save"></span>บันทึก</button>
                                            <a  type="reset" class="btn btn-danger"> <span class="glyphicon glyphicon-refresh"></span>ยกเลิก</a>
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
    <script type="text/javascript">
        function oninsert(select) {
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
