
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
    if(userLogin != null){
%>   

    <ul class="sidebar-menu">
        <!--<li class="header">MAIN NAVIGATION</li>-->
        <li class="active treeview">
            <!--<a href="#">-->
                <!--<i class="fa fa-plus-square"></i><span>เมนู</span> HEAD MENU -->
            <!--</a>-->
            <ul class="treeview-menu">

                <!--manu admin-->

              <%
            if(userLogin.getRoleBean()!=null){
                if(userLogin.getRoleBean().getRoleGroupMenuBean()!=null){
                    List<MainMenuBean> listMenu = userLogin.getRoleBean().getRoleGroupMenuBean().getMainMenuList();
                    if(listMenu != null && listMenu.size()>0){
                        for(MainMenuBean mainMenuBean : listMenu){
                            
                            if(StringUtil.GROUP_MENU_SUB_MENU.equals(mainMenuBean.getGroupMenu())){                                  
                                List<SubMenuBean> subMenuList = mainMenuBean.getSubMenuList();
                                %>
    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%=mainMenuBean.getMenuName()%> <span class="caret"></span></a>
                                        <ul class="treeview-menu menu-open-menu" role="menu">
                                        <%--<li class="dropdown-header">Sub Menu <%=mainMenuBean.getMenuName()%></li>--%>    
                                <%
                                
                                if(subMenuList != null && subMenuList.size()>0){
                                    for(SubMenuBean subMenuBean : subMenuList){
                                        %>
                                        <li ><a href="<%=subMenuBean.getAction()%>?todo=<%=subMenuBean.getTodoMethod()%>"><%=subMenuBean.getMenuName()%></a></li>
                                        <%
                                    }
                                }       
                                
                                %>
                                        </ul>
                                    </li>
                                <%
                                
                            }else{
                                %>
                                <li> <a href="<%=mainMenuBean.getAction()%>?todo=<%=mainMenuBean.getTodoMethod()%>"><%=mainMenuBean.getMenuName()%></a></li>
                                <%
                            
                            }
                        }
                    }
                }
            }
        %>      
         </ul>
        </li>
    </ul>
<%   
    } else {
%>
      <!--user ปกติ-->
<ul class="sidebar-menu">
        <!--<li class="header">MAIN NAVIGATION</li>-->
        <li class="active treeview">
            <!--<a href="#">-->
                <!--<i class="fa fa-plus-square"></i><span>เมนู</span>-->
            <!--</a>-->
          <ul class="treeview-menu">
                
                   <%
                    if(mainMenuList != null && mainMenuList.size()>0){
                        for(MainMenuBean mainMenuBean : mainMenuList){
                            
                            if(StringUtil.GROUP_MENU_SUB_MENU.equals(mainMenuBean.getGroupMenu())){                                  
                                List<SubMenuBean> subMenuList = mainMenuBean.getSubMenuList();
                                %>
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-plus-square"></i> <%=mainMenuBean.getMenuName()%> <span class="caret"></span></a>
                              <ul class="dropdown-menu" role="menu"> 
                                        <li class="dropdown-header">Sub Menu <%=mainMenuBean.getMenuName()%></li>  
                                <%
                                
                                if(subMenuList != null && subMenuList.size()>0){
                                    for(SubMenuBean subMenuBean : subMenuList){
                                        %>
                                            <li><a href="<%=subMenuBean.getAction()%>?todo=<%=subMenuBean.getTodoMethod()%>"><%=subMenuBean.getMenuName()%></a></li>
                                        <%
                                    }
                                }       
                                
                                %>
                                        </ul>
                                    </li>
                                <%
                                
                            }else{
                                %>
                                <li><a href="<%=mainMenuBean.getAction()%>?todo=<%=mainMenuBean.getTodoMethod()%>"><%=mainMenuBean.getMenuName()%></a></li>
                                <%
                            
                            }
                        }
                    }
                
        %>
        
<!--        <li><a href="WelcomePageAction.do?todo=gotoPageHome">Home</a></li>
        <li><a href="WelcomePageAction.do?todo=gotoPageBootstrapExample">Bootstrap Example</a></li>       -->
    </ul>
        </li>
       </ul>
        


<%
}
%>
</section>
<!-- /.sidebar -->
