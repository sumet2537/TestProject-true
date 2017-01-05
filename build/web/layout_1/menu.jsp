
<%@page import="com.bean.SubMenuBean"%>
<%@page import="com.util.StringUtil"%>
<%@page import="com.bean.UserBean"%>
<%@page import="com.bean.MainMenuBean"%>
<%@page import="java.util.List"%>

<% request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
%>

<%!
    List<MainMenuBean> mainMenuList = null;
    UserBean userLogin = null;
%>
<%
    userLogin = (UserBean) request.getSession().getAttribute("userLogin");
    mainMenuList = (List<MainMenuBean>) request.getSession().getAttribute("mainMenuList");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- sidebar: style can be found in sidebar.less -->
<section class="sidebar">
    <%
        if (userLogin != null) {
    %>   

    <ul class="sidebar-menu">
        <!--<li class="header">MAIN NAVIGATION</li>-->
        <!--        <li class="active treeview">
                    <a href="#">
                        <i class="fa fa-plus-square"></i><span>เมนู</span>
                    </a>-->
        <!--<ul class="treeview-menu">-->

        <!--manu admin-->
        <!-- roleid    1 admin    /////   2 user-->
        <%
            if (userLogin.getRoleId() != 2) {
        %>
        <!--admin-->
 <li class="active treeview">
          <a href="PageAction.do?todo=gotoPageHome">
            <i class="glyphicon glyphicon-home"></i> <span>หน้าแรก</span>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>จัดการสินเชื่อ</span>
            <i class="fa fa-angle-left pull-right"></i>
            <!--<span class="label label-primary pull-right">4</span>-->
          </a>
          <ul class="treeview-menu">
            <li><a href="PageAction.do?todo=gotoPageManagermentAp"><i class="glyphicon glyphicon-ok-sign"></i>สินเชื่อที่ผ่านการอนุมัติ</a></li>
            <li><a href="PageAction.do?todo=gotoPageManagermentR"><i class="glyphicon glyphicon-screenshot"></i> สินเชื่อรออนุมัติ</a></li>
            <li><a href="PageAction.do?todo=gotoPageManagermentLoan"><i class="glyphicon glyphicon-info-sign"></i> รอตรวจสอบ</a></li>
            <li><a href="PageAction.do?todo=gotoPageManagermentNofile"><i class="glyphicon glyphicon-question-sign"></i> แก้ไขเอกสาร</a></li>
            <li><a href="PageAction.do?todo=gotoPageManagermentNo"><i class="glyphicon glyphicon-remove-sign"></i> สินเชื่อไม่ผ่านการอนุมัติ</a></li>
          </ul>
        </li>
        <li>
          <a href="PageAction.do?todo=gotoPageAdminManagermentProfile">
            <i class="glyphicon glyphicon-user"></i> <span>จัดการผู้ใช้</span>
          </a>
        </li>
          <li>
          <a href="#">
            <i class="glyphicon glyphicon-thumbs-up"></i> <span>เกี่ยวกับเรา</span>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="glyphicon glyphicon-cog"></i>
            <span>ตั้งค่า</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="PageAction.do?todo=gotoPageProfile"><i class="glyphicon glyphicon-pencil"></i> แก้ไขข้อมูลส่วนตัว</a></li>
            <li><a href="ChahgewdAction.do?todo=gotoPageChangePassword"><i class="glyphicon glyphicon-lock"></i> เปลียนระหัสผ่าน</a></li>
            <li><a href="AuthenAuthorizeAction.do?todo=logout"><i class="glyphicon glyphicon-log-out"></i> ออกจากระบบ</a></li>
          </ul>
        </li>
        <%
        } else {
        %>
        <!--user-->
        <li class="active treeview">
          <a href="PageAction.do?todo=gotoPageHome">
            <i class="glyphicon glyphicon-home"></i> <span>หน้าแรก</span>
          </a>
        </li>
          <li>
          <a href="PageAction.do?todo=gotoPageLoanRequest">
            <i class="glyphicon glyphicon-send"></i> <span>ขอสินเชื่อ</span>
          </a>
        </li>
        <li>
          <a href="ApproveLoanAction.do?todo=gotoPageUserViewStatus">
            <i class="glyphicon glyphicon-bell"></i> <span>ตรวจสอบการอนุมัติ</span>
          </a>
        </li>
          <li>
          <a href="#">
            <i class="glyphicon glyphicon-thumbs-up"></i> <span>เกี่ยวกับเรา</span>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="glyphicon glyphicon-cog"></i>
            <span>ตั้งค่า</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="PageAction.do?todo=gotoPageProfile"><i class="glyphicon glyphicon-pencil"></i> แก้ไขข้อมูลส่วนตัว</a></li>
            <li><a href="ChahgewdAction.do?todo=gotoPageChangePassword"><i class="glyphicon glyphicon-lock"></i> เปลียนระหัสผ่าน</a></li>
            <li><a href="AuthenAuthorizeAction.do?todo=logout"><i class="glyphicon glyphicon-log-out"></i> ออกจากระบบ</a></li>
          </ul>
        </li>
    </ul>
        <%
            }
    } else {
    %>
    <!--user ปกติ-->
    <ul class="sidebar-menu">
 <li>
          <a href="PageAction.do?todo=gotoPageHome">
            <i class="glyphicon glyphicon-home"></i> <span>หน้าแรก</span>
          </a>
        </li>
           <li>
          <a href="PageAction.do?todo=gotoPageRegister">
            <i class="glyphicon glyphicon-registration-mark"></i> <span>สมัครสมาชิก</span>
          </a>
        </li>
        <li>
          <a href="PageAction.do?todo=gotoPageDetleRequest">
            <i class="glyphicon glyphicon-send"></i> <span>ขอสินเชื่อ</span>
          </a>
        </li>
          <li>
          <a href="PageAction.do?todo=gotoPageLogin">
            <i class="glyphicon glyphicon-log-in"></i> <span>เข้าสู่ระบบ</span>
          </a>
        </li>
          <li>
          <a href="#">
            <i class="glyphicon glyphicon-thumbs-up"></i> <span>เกี่ยวกับเรา</span>
          </a>
        </li>
          <li>
          <a href="PageAction.do?todo=gotoPageifrequest">
            <i class="glyphicon glyphicon-bookmark"></i> <span>เงื่อนไขการขอกู้</span>
            <small class="label pull-right bg-green">new</small>
          </a>
        </li>
</ul>
    <%    }
    %>
</section>
