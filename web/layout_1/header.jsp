
<%@page import="com.bean.UserBean"%>
<%@page import="com.bean.MainMenuBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    List<MainMenuBean> mainMenuList = null;
    UserBean userLogin = null;
%>
<%
   userLogin = (UserBean) request.getSession().getAttribute("userLogin");
   mainMenuList = (List<MainMenuBean>) request.getSession().getAttribute("mainMenuList");
%>
<!-- Logo -->
<a href="PageAction.do?todo=gotoPageHome" class="logo">
    <!-- mini logo for sidebar mini 50x50 pixels -->
    <span class="logo-mini"><b>L</b>o<b>a</b>n</span>
    <!-- logo for regular state and mobile devices -->
    <span class="logo-lg"><b>สินเชื่อ</b>บ้าน </span>
</a>
<!-- Header Navbar: style can be found in header.less -->
<nav class="navbar navbar-static-top" role="navigation">
    <!-- Sidebar toggle button-->
    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        <span class="sr-only">Toggle navigation</span>
    </a>
    <!-- Navbar Right Menu -->
    <div class="navbar-custom-menu">
<!--        <ul class="nav navbar-nav">
            
            user ปกติ
        
             User Account: style can be found in dropdown.less 
            <li ><a href="loginAction.do?todo=gotologin"><i class="fa fa-circle-o"></i> Login</a></li>HEAD MENU 
        </ul>-->
    
            <!--admin-->
              <!-- User Account: style can be found in dropdown.less -->
               <ul class="nav navbar-nav">
             <li class="dropdown user user-menu">
                <a href="PageAction.do?todo=gotoPageHome" class="dropdown-toggle" data-toggle="dropdown">
                    <img  src="./img/home1.jpg" class="user-image" alt="User Image" />
                  
                    <span class="hidden-xs"><img src="./img/iconloan1.png" width="50px" height="23px" /></span>
                </a>
                <ul class="dropdown-menu">
                     <!--User image--> 
                      <%
                        if(userLogin !=null){
                        %>
                    <li class="user-header">
                       <img  src="./img/home1.jpg" class="img-circle" alt="User Image" />
                
                        <p>
                            ยินดีตอนรับคุณ <%=userLogin.getFirstName()%>
                        <small></small>
                        </p>
                    </li>
                     <!--Menu Footer-->
                    <li class="user-footer">
                       
                         <div class="pull-left">
                            <a href="PageAction.do?todo=gotoPageProfile" class="btn btn-default btn-flat">โปรไฟล์</a>
                        </div>
                         
                        <div class="pull-right">
                            <a href="AuthenAuthorizeAction.do?todo=logout" class="btn btn-default btn-flat">ออกจากระบบ</a>
                        </div>
                        <%
                        }else{
}
                        %>
                       
                    </li>
                </ul>
            </li>
               </ul>
<!--                          user ที่สมัครสมาชิกแล้ว
               User Account: style can be found in dropdown.less 
               <ul class="nav navbar-nav">
             <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <img class="user-image" alt="User Image"/>
                  
                    <span class="hidden-xs"></span>
                </a>
                <ul class="dropdown-menu">
                     User image 
                    <li class="user-header">
                        <img  src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image" />
                  <%--<%=bean.getImg()%>--%>
                        <p>
                        RGE ยินดีตอนรับคุณ 
                        <small></small>
                        </p>
                    </li>
                     Menu Footer
                    <li class="user-footer">
                        <div class="pull-left">
                            <a href="RegisterAction.do?todo=gotoprofile" class="btn btn-default btn-flat">Profile</a>
                        </div>
                        <div class="pull-right">
                            <a href="./Home.jsp" class="btn btn-default btn-flat">Sign out</a>
                        </div>
                    </li>
                </ul>
            </li>
               </ul>
             <ul>
                <li class="active"><a href="loginAction.do?todo=gotologin"> <i class="fa fa-circle-o"></i> Login</a></li>SUBMENU MENU //กลับไปหน้า body 
                 </ul>-->
    </div>

</nav>
