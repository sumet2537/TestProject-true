<%-- 
    Document   : detleloancheck
    Created on : Dec 9, 2016, 3:32:01 AM
    Author     : brass
--%>

<%@page import="java.text.DecimalFormat"%>
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
        <%bean = (RequestLoanBean) request.getSession().getAttribute("editBean");
            DecimalFormat formatter = new DecimalFormat("###,###.00");
            DecimalFormat phone = new DecimalFormat("###-###-####");
        %>

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
                                                        <h4> :: ข้อมูลส่วนตัว :: &nbsp;&nbsp;&nbsp;&nbsp;รหัสสินเชื่อ : &nbsp;&nbsp;<%=bean.getLoanreq_id()%></h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>เลขบัตรประจำตัวประชาชน : &nbsp;&nbsp;<span class="fontblue1" style="color:#0033FF; font-size: 17px;"><%=bean.getCitizen_id()%></span></label>
                                                            <input  type="hidden" name="citizen_id" value="<%=bean.getCitizen_id()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>คำนำหน้า :<span style="color:#0033FF; font-size: 17px;"><%=bean.getTitle_type()%></span></label>
                                                            <input type="hidden"  name="title_type" value="<%=bean.getTitle_type()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label for="firstname">ชื่อ : &nbsp;&nbsp;<span  style="color:#0033FF; font-size: 17px;"><%=bean.getFirstName()%></span></label>
                                                            <input  type="hidden" name="firstName" value="<%=bean.getFirstName()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>นามสกุล: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getLastName()%></span></label>
                                                            <input type="hidden" name="lastName" value="<%=bean.getLastName()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วันเดือนปีเกิด: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getBirthdate()%></span></label>
                                                            <input type="hidden" name="birthdate" value="<%=bean.getBirthdate()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อายุ: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getAge()%></span> &nbsp;&nbsp;ปี</label>
                                                            <input  type="hidden" name="age" value="<%=bean.getAge()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สัญชาติ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getNationality()%></span></label>
                                                            <input name="nationality" type="hidden" value="<%=bean.getNationality()%>" >
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >สถานะสมรส : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getStatustype()%></span></label>
                                                            <input type="hidden" name="statustype" value="<%=bean.getStatustype()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>เบอร์โทร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getMobile()%></span></label>
                                                            <input type="hidden" name="mobile" value="<%=bean.getMobile()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >อีเมล์ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getEmail()%></span></label>
                                                            <input type="hidden" name="email"  value="<%=bean.getEmail()%>"/>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>อาชีพ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getJobtype()%></span></label>
                                                            <input type="hidden" name="joptype" value="<%=bean.getJobtype()%>">
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <label >ที่อยู่ตามทะเบียนบ้าน : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddressregistration()%></span></label>
                                                            <textarea hidden name="addressregistration" ><%=bean.getAddressregistration()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <label>ที่อยู่ปัจจุบัน : &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddresscurrent()%></span></label>
                                                            <textarea hidden name="addresscurrent" > <%=bean.getAddresscurrent()%></textarea>
                                                        </div>
                                                        <div class="form-group col-md-12">
                                                            <label>ที่อยู่จัดส่งเอกสาร  <span style="color:#0033FF; font-size: 17px;"><%=bean.getAddresssenddoc()%></span></label>
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
                                                            <label >ประเภทที่อยู่อาศัย: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=bean.getHometype()%></span></label>
                                                            <input type="hidden"  name="hometype" value="<%=bean.getHometype()%>" />
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >ราคาซื้อขาย: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getTradingprice())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="tradingprice" value="<%=bean.getTradingprice()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label>วงเงินสินเชื่อที่ขอกู้ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getCreditloan())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="creditloan" value="<%=bean.getCreditloan()%>">
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                            <label >ระยะเวลาที่ขอกู้ : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getLncome_per_month()%>&nbsp;&nbsp;</span>ปี</label>
                                                            <input type="hidden" name="lncome_per_month" value="<%=bean.getLncome_per_month()%>">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-danger">
                                                    <div class="panel panel-heading">
                                                        <h4> :: ข้อมูลด้านรายได้ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-6">
                                                            <label>รายได้ประจำต่อเดือน: &nbsp;&nbsp; <span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getPeriodloan())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input  class="form-control" type="hidden" name="periodloan" value="<%=bean.getPeriodloan()%>">
                                                        </div>
                                                        <div class="form-group col-md-6">
                                                            <label>รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=formatter.format(bean.getNetprofit())%>&nbsp;&nbsp;</span>บาท</label>
                                                            <input type="hidden" name="netprofit" value="<%=bean.getNetprofit()%>">
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-warning">
                                                    <div class="panel-heading">
                                                        <h4> :: เอกสารประกอบการขอกู้ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label >สำเนาบัตรประจำตัวประชาชน: &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopyidcard()%></span></label>
                                                                <input  type="hidden" name="copyidcard" value="<%=bean.getCopyidcard()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                        <div class="form-group"> 
                                                            <div class="col-md-8">
                                                                <label>สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ) : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopylicenses()%></span></label>
                                                                <input type="hidden" name="copylicenses" value="<%=bean.getCopylicenses()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class="col-md-8">
                                                                <label>สำเนาทะเบียนบ้าน :<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopydocumenthome()%></span></label>
                                                                <input type="hidden" name="copydocumenthome" value="<%=bean.getCopydocumenthome()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สำเนาทะเบียนสมรส/ใบหย่า/ใบมรณะบัตรของคู่สมรส (ถ้ามี) : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopymarriage()%></span></label>
                                                                <input type="hidden" name="copymarriage" value="<%=bean.getCopymarriage()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label >ใบเปลี่ยนชื่อ-สกุล (ทุกใบ): &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopy_rename()%></span></label>
                                                                <input  type="hidden"  name="copy_rename" value="<%=bean.getCopy_rename()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สลิปเงินเดือน : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getSalary_slip()%></span></label>
                                                                <input  type="hidden" name="salary_slip"  value="<%=bean.getSalary_slip()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                        <div class="form-group">
                                                            <div class=" col-md-8">
                                                                <label>สำเนาบัญชีธนาคาร : &nbsp;&nbsp;<span style="color:#0033FF; font-size: 17px;"><%=bean.getCopy_bankaccount()%></span></label>
                                                                <input type="hidden" name="copy_bankaccount"  value="<%=bean.getCopy_bankaccount()%>">
                                                            </div>
                                                            <div class="col-md-2">view</div>
                                                            <div class="col-md-2">download</div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel panel-info">
                                                    <div class="panel-heading">
                                                        <h4> :: ข้อมูลธนาคารที่ต้องการขอกู้ ::</h4>
                                                    </div>
                                                    <div class="panel-body">
                                                        <div class="form-group col-md-12">
                                                            <label>ธนาคารที่ต้องการขอกู้ :&nbsp;&nbsp;</label><span style="color:#0033FF; font-size: 17px;"><%=bean.getBanktype()%></span>
                                                            <div class="col-md-8">
                                                                <input  type="hidden" name="banktype1" value="<%=bean.getBanktype()%>">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="center">
                                                    <br>
                                                    <div id="chk" class="btn-group" data-toggle="buttons">
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="blue" value="2011" onclick="callCheckboxActive(this)">กรุงเทพ
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="red" value="2012" onclick="callCheckboxActive(this)">กรุงไทย
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="green" value="2013" onclick="callCheckboxActive(this)">ธนชาติ
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox" name="yellow" value="2013" onclick="callCheckboxActive(this)">ทหารไทย
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">กรุงศรีอยุทยา
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">ออมสิน
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">ไทยพาณิชย์
                                                        </label>
                                                        <label class="btn btn-primary">
                                                            <span class="glyphicon"></span>
                                                            <input type="checkbox"  name="skyblue" value="2013" onclick="callCheckboxActive(this)">กสิกรไทย
                                                        </label>

                                                    </div>
                                                </div>
                                                <div class="form-group col-md-12">
                                                    <input type="hidden" name="loanstatustype" value="รออนุมัติ"/>
                                                    <hr class="hrsuccess">
                                                    <input type="hidden" name="todo"/>
                                                    <div class="col-md-12" align="center">
                                                        <button type="submit" id="submit" name="submit" class="btn btn-primary" onclick="oninsert('insretbank')" ><span class="glyphicon glyphicon-save"></span>บันทึก</button>
                                                        <button  type="reset" class="btn btn-danger"> <span class="glyphicon glyphicon-refresh"></span>ยกเลิก</button>
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
                                                    </div>  
                                                </div>   
                                            </div>
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
