
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%--<%
    String msgLoginFail = (String) request.getAttribute("msgLoginFail");
%> 
 <!--  Start Panel -->
    <div class="page-header" >
        <h1>Form <small>Login</small></h1>
    </div>
    <br/>
    <form name="AuthenAuthorizeForm" action="AuthenAuthorizeAction.do"  method="post">
    <input type="hidden" name="todo" value="login" />
    <div class="panel panel-default" style="width: 50%;margin: auto;">
        <div class="panel-heading">
            <h3 class="panel-title"><span class="glyphicon glyphicon-user"></span> Panel Login</h3>
        </div>
        <div class="panel-body"> 
            <%
                if(msgLoginFail != null){
            %>
                <%=msgLoginFail%>
            <%        
                }
            %>
            Username :
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="text" name="username" class="form-control" />
                </div>
            </div>
            Password :
            <div class="row"> 
                <div class="col-lg-12">                            
                    <input type="password" name="password" class="form-control" />
                </div>
            </div>
        </div>
        <div class="panel-footer">
            <button type="submit"  class="btn btn-default" >
                <span class="glyphicon glyphicon-open"></span> Login
            </button>
        </div>

    </div>            
    <!--  End Panel -->
    </form>
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>  Log in</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link href="dist/css/AdminLTE.css" rel="stylesheet" type="text/css"/>
        <!-- iCheck -->
        <link href="plugins/iCheck/square/_all.css" rel="stylesheet" type="text/css"/>
        <%
            String msgLoginFail = (String) request.getAttribute("msgLoginFail");
        %>
    </head> 
    <section class="content">
        <!-- Info boxes -->
        <div class="row">
            <div class="col-md-12">
                <div class="" >
                    <style type="text/css"></style>
                    <body class="hold-transition login-page" >
                        <div class="login-box">
                            <div class="login-logo">
                                <a href="#"><b>Login</b>Loan Request</a>
                            </div>
                            <!-- /.login-logo -->
                            <div class="login-box-body" >
                                <p class="login-box-msg">Sign in to start your session</p>

                                <form name="AuthenAuthorizeForm" action="AuthenAuthorizeAction.do"  method="post">
                                    <input  type="hidden" name="todo" value="login" />

                                    <%
                                        if (msgLoginFail != null) {
                                    %>
                                    <%=msgLoginFail%>
                                    <%
                                        }
                                    %>

                                    <div class="form-group has-feedback">
                                        <input name="username"  type="text" class="form-control"  placeholder="Username">
                                        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                                    </div>
                                    <div class="form-group has-feedback">
                                        <input  name="password" type="password" class="form-control"  placeholder="Password">
                                        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                                    </div>
                                    <div class="row">
                                        <div class="col-xs-8">
                                            <div class="checkbox icheck">
                                                <label>
                                                    <div class="icheckbox_square-blue" aria-checked="false" aria-disabled="false" style="position: relative;"><input type="checkbox" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"><ins class="iCheck-helper" style="position: absolute; top: -20%; left: -20%; display: block; width: 140%; height: 140%; margin: 0px; padding: 0px; border: 0px; opacity: 0; background: rgb(255, 255, 255);"></ins></div> Remember Me
                                                </label>
                                            </div>
                                        </div>
                                        <!-- /.col -->
                                        <div class="col-xs-4">
                                            <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
                                        </div>
                                        <!-- /.col -->
                                    </div>
                                </form>
                                <a href="#">I forgot my password</a><br>
                                <!--<a href="RegisterAction.do?todo=gotosave" class="text-center">Register a new membership</a>-->
                            </div>
                            <!-- /.login-box-body -->
                        </div>
                        <!-- /.login-box -->
              
                    </body>
                </div>
            </div>
        </div>
    </section> 
                                      <!-- jQuery 2.2.0 -->
                        <script src="plugins/jQuery/jQuery-2.1.4.min.js" type="text/javascript"></script>
                        <!-- Bootstrap 3.3.6 -->
                        <script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
                        <!-- iCheck -->
                        <script src="plugins/iCheck/icheck.js" type="text/javascript"></script>

</html>