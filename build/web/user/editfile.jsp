<%-- 
    Document   : editfile
    Created on : Dec 14, 2016, 2:32:07 PM
    Author     : brass
--%>

<%@page import="com.bean.UserBean"%>
<%@page import="com.bean.RequestLoanBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>แก้ไขไฟล์</title>
        <%!
            RequestLoanBean bean = null;
           
        %>
        <%
            bean = (RequestLoanBean) request.getSession().getAttribute("bean");
             String msg = "";
            msg = (String) request.getAttribute("requestloanStatus");
        %>

    </head>
    <body onload="check()">
        <!-- Main content -->
        <section class="content">
            <!-- Info boxes -->
            <div class="row">
                <div class="col-md-12">
                    <div class="box box-danger" >
                        <h3 class="center"><strong >ตรวจสอบการขอกู้</strong></h3>
                        <div class="box-body">
                            <!--box-body-->
                            <div class="row">
                                <fieldset class="col-md-8 col-md-offset-2">
                                    <form name="editfile" method="post" action="LoanRequstAction.do" enctype="multipart/form-data">
                                        <input type="hidden" name="todo"/>
                                        <input type="hidden" name="loanreq_id"/>
                                        <input type="hidden" name="loanstatustype" value="รอตรวจสอบ"/>
                                        <%
                                            String file1 = bean.getCopyidcard();
                                            if (file1.equals("fileedit")) {
                                        %>
                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">สำเนาบัตรประจำตัวประชาชน</div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file" name="copyidcard"   accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="copyidcard"   type="file">
                                        <%
                                            }
                                        %>

                                        <%
                                            String file2 = bean.getCopylicenses();
                                            if (file2.equals("fileedit")) {
                                        %>
                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ)</div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file" name="copylicenses"  accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="copylicenses"   type="file">
                                        <%
                                            }
                                        %>
                                        <%
                                            String file3 = bean.getCopydocumenthome();
                                            if (file3.equals("fileedit")) {
                                        %>
                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">สำเนาทะเบียนบ้าน</div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file" name="copydocumenthome"  accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="copydocumenthome"   type="file">
                                        <%
                                            }
                                        %>
                                        <%
                                            String file4 = bean.getCopymarriage();
                                            if (file4.equals("fileedit")) {
                                        %>                   

                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">สำเนาทะเบียนสมรส/ใบหย่า</div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file" name="copymarriage"  accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="copymarriage"   type="file">
                                        <%
                                            }
                                        %>
                                        <%
                                            String file5 = bean.getCopy_rename();
                                            if (file5.equals("fileedit")) {
                                        %>
                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">ใบเปลี่ยนชื่อ-สกุล (ทุกใบ) </div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file " name="copy_rename"  accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="copy_rename"   type="file">
                                        <%
                                            }
                                        %>
                                        <%
                                            String file6 = bean.getSalary_slip();
                                            if (file5.equals("fileedit")) {
                                        %>
                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">สลิปเงินเดือน</div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file " name="salary_slip" accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="salary_slip"   type="file">
                                        <%
                                            }
                                        %>
                                        <%
                                            String file7 = bean.getCopy_bankaccount();
                                            if (file5.equals("fileedit")) {
                                        %>
                                        <div class="col-lg-12">
                                            <div class="col-lg-2"></div>
                                            <div class="col-lg-6 font-file">Back Statement สำเนาการเดินบัญชี</div>                    
                                            <div class="col-lg-3"> <input class="btn btn-file " name="copy_bankaccount" accept=".png, .jpg, .jpeg ,.pdf"  type="file" required="true"></div>                     
                                        </div>
                                        <% } else {
                                        %>
                                        <input class="btn btn-file file-noedit" name="copy_bankaccount"   type="file">
                                        <%
                                            }
                                        %>
                                        <div class="col-md-12">
                                             <br>
                                        <br>
                                        </div>
                                       
                                   <div style="text-align: center" >
                                    <button class="btn btn-twitter" onclick="oneditfile('<%=bean.getLoanreq_id()%>')">บันทึก</button>
                                    <button class="btn btn-error"  href="#">ยกเลิก</button>
                                </div>
                                    </form>
                                </fieldset>
                                     
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script type="text/javascript">
            function oneditfile(todo) {
                document.editfile.todo.value = 'oneditfile';
                document.editfile.loanreq_id.value = todo;
                document.editfile.submit();
            }
        </script>
        <div>
        <%
            if("ok".equals(msg)){
        %>
        <script >
            function check() {
                $(document).ready(function () {
                    swal({
                        title: "สำเร็จ",
                        text: "คุณส่งแก้ไขไฟล์เสร็จเรียบร้อยแล้ว !",
                        type: "success",
                        confirmButtonText: "ตกลง!"
                    },
                            function () {
                                window.location.href = 'PageAction.do?todo=gotoPageHome';
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
                        text: "คุณส่งไม่สำเร็จ !",
                        type: "error",
                        confirmButtonText: "ตกลง!"
        },
                    function () {
                        window.location.href = 'LoanRequstAction.do?todo=gotoeditfile&loanreq_id=<%=bean.getLoanreq_id()%>';
                        });
            };

        </script>
        <%   }
        %>
    </div>
    </body>
</html>
