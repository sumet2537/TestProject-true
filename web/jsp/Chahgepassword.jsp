
<%@page import="com.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>--%>
<%--<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>--%>
<%
    String msgLoginFail = (String) request.getAttribute("msgLoginFail");
%> 
<%!
    UserBean userLoginBean = null;
    String msgLoginFail, msgLoginSuccess = "";
%>
<%
    userLoginBean = (UserBean) request.getSession().getAttribute("userLogin");
    msgLoginFail = (String) request.getAttribute("msgLoginFail");
    msgLoginSuccess = (String) request.getAttribute("msgLoginSuccess");
%>
 <!--  Start Panel -->
 <br>
    <div class="page-header" >
        <div align="center">
        <h1> เปลี่ยน <small>รหัสผ่าน</small></h1>
        </div>
    </div>
    <br/>
    <form name="chahgewdForm" action="ChahgewdAction.do"  method="post">
    <input type="hidden" name="todo"  />
     <input type="hidden" name="userid" />
    <div class="panel panel-default" style="width: 50%;margin: auto;">
        <div class="panel-heading">
            <h3 class="panel-title"><span class="glyphicon glyphicon-user"></span> เปลี่ยนรหัสผ่าน</h3>
        </div>
        <div class="panel-body"> 

            <%if (msgLoginFail != null) {%>
            <%=msgLoginFail%>
            <%}
                if (msgLoginSuccess != null) {%>
            <%=msgLoginSuccess%>
            <%}%>

              รหัสผู้ใช้ :
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="text" name="userid" class="form-control"  value="<%=userLoginBean.getUser_id()%>" disabled/>
                </div>
            </div>
            ชื่อผู้ใช้ :
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="text" name="username" class="form-control" value="<%=userLoginBean.getUsername()%>" disabled/>
                </div>
            </div>
             รหัสผ่านใหม่ :
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="password" name="newpassword" class="form-control" placeholder="กรุณากรอกรหัสผ่านใหม่"/>
                </div>
            </div>
              ยืนยัน รหัสผ่านใหม่ :
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="password" name="confpassword" class="form-control" placeholder="ยืนยันรหัสผ่านใหม่"/>
                </div>
            </div>
        </div>
        <div class="panel-footer" align="center">
            <button type="submit"  class="btn btn-primary" onclick="callUpdate('<%=userLoginBean.getUser_id()%>')">
                <span class="glyphicon glyphicon-save"></span> บันทึก
            </button>
            <button type="reset"  class="btn btn-danger" >
                <span class="glyphicon glyphicon-remove"></span> ยกเลิก
            </button>
        </div>

    </div>            
    <!--  End Panel -->
    </form>
   <script type="text/javascript">
    function callUpdate(userid) {
        document.chahgewdForm.todo.value = 'gotoPageChangeComp';
        document.chahgewdForm.id.value = userid;
        document.chahgewdForm.submit();
    }
</script>