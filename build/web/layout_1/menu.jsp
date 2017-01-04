
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
<!-- /.sidebar -->
<!--<ul class="sidebar-menu">
        <li class="header">MAIN NAVIGATION</li>
        <li class="active treeview">
          <a href="#">
            <i class="fa fa-dashboard"></i> <span>Dashboard</span> <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li class="active"><a href="index.html"><i class="fa fa-circle-o"></i> Dashboard v1</a></li>
            <li><a href="index2.html"><i class="fa fa-circle-o"></i> Dashboard v2</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-files-o"></i>
            <span>Layout Options</span>
            <span class="label label-primary pull-right">4</span>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/layout/top-nav.html"><i class="fa fa-circle-o"></i> Top Navigation</a></li>
            <li><a href="pages/layout/boxed.html"><i class="fa fa-circle-o"></i> Boxed</a></li>
            <li><a href="pages/layout/fixed.html"><i class="fa fa-circle-o"></i> Fixed</a></li>
            <li><a href="pages/layout/collapsed-sidebar.html"><i class="fa fa-circle-o"></i> Collapsed Sidebar</a></li>
          </ul>
        </li>
        <li>
          <a href="pages/widgets.html">
            <i class="fa fa-th"></i> <span>Widgets</span>
            <small class="label pull-right bg-green">new</small>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>Charts</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/charts/chartjs.html"><i class="fa fa-circle-o"></i> ChartJS</a></li>
            <li><a href="pages/charts/morris.html"><i class="fa fa-circle-o"></i> Morris</a></li>
            <li><a href="pages/charts/flot.html"><i class="fa fa-circle-o"></i> Flot</a></li>
            <li><a href="pages/charts/inline.html"><i class="fa fa-circle-o"></i> Inline charts</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-laptop"></i>
            <span>UI Elements</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/UI/general.html"><i class="fa fa-circle-o"></i> General</a></li>
            <li><a href="pages/UI/icons.html"><i class="fa fa-circle-o"></i> Icons</a></li>
            <li><a href="pages/UI/buttons.html"><i class="fa fa-circle-o"></i> Buttons</a></li>
            <li><a href="pages/UI/sliders.html"><i class="fa fa-circle-o"></i> Sliders</a></li>
            <li><a href="pages/UI/timeline.html"><i class="fa fa-circle-o"></i> Timeline</a></li>
            <li><a href="pages/UI/modals.html"><i class="fa fa-circle-o"></i> Modals</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-edit"></i> <span>Forms</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/forms/general.html"><i class="fa fa-circle-o"></i> General Elements</a></li>
            <li><a href="pages/forms/advanced.html"><i class="fa fa-circle-o"></i> Advanced Elements</a></li>
            <li><a href="pages/forms/editors.html"><i class="fa fa-circle-o"></i> Editors</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-table"></i> <span>Tables</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/tables/simple.html"><i class="fa fa-circle-o"></i> Simple tables</a></li>
            <li><a href="pages/tables/data.html"><i class="fa fa-circle-o"></i> Data tables</a></li>
          </ul>
        </li>
        <li>
          <a href="pages/calendar.html">
            <i class="fa fa-calendar"></i> <span>Calendar</span>
            <small class="label pull-right bg-red">3</small>
          </a>
        </li>
        <li>
          <a href="pages/mailbox/mailbox.html">
            <i class="fa fa-envelope"></i> <span>Mailbox</span>
            <small class="label pull-right bg-yellow">12</small>
          </a>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-folder"></i> <span>Examples</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="pages/examples/invoice.html"><i class="fa fa-circle-o"></i> Invoice</a></li>
            <li><a href="pages/examples/profile.html"><i class="fa fa-circle-o"></i> Profile</a></li>
            <li><a href="pages/examples/login.html"><i class="fa fa-circle-o"></i> Login</a></li>
            <li><a href="pages/examples/register.html"><i class="fa fa-circle-o"></i> Register</a></li>
            <li><a href="pages/examples/lockscreen.html"><i class="fa fa-circle-o"></i> Lockscreen</a></li>
            <li><a href="pages/examples/404.html"><i class="fa fa-circle-o"></i> 404 Error</a></li>
            <li><a href="pages/examples/500.html"><i class="fa fa-circle-o"></i> 500 Error</a></li>
            <li><a href="pages/examples/blank.html"><i class="fa fa-circle-o"></i> Blank Page</a></li>
            <li><a href="pages/examples/pace.html"><i class="fa fa-circle-o"></i> Pace Page</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#">
            <i class="fa fa-share"></i> <span>Multilevel</span>
            <i class="fa fa-angle-left pull-right"></i>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>
            <li>
              <a href="#"><i class="fa fa-circle-o"></i> Level One <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="#"><i class="fa fa-circle-o"></i> Level Two</a></li>
                <li>
                  <a href="#"><i class="fa fa-circle-o"></i> Level Two <i class="fa fa-angle-left pull-right"></i></a>
                  <ul class="treeview-menu">
                    <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>
                  </ul>
                </li>
              </ul>
            </li>
            <li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>
          </ul>
        </li>
        <li><a href="documentation/index.html"><i class="fa fa-book"></i> <span>Documentation</span></a></li>
        <li class="header">LABELS</li>
        <li><a href="#"><i class="fa fa-circle-o text-red"></i> <span>Important</span></a></li>
        <li><a href="#"><i class="fa fa-circle-o text-yellow"></i> <span>Warning</span></a></li>
        <li><a href="#"><i class="fa fa-circle-o text-aqua"></i> <span>Information</span></a></li>
      </ul>-->