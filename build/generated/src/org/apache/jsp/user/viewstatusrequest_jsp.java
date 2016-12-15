package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.UserBean;
import com.bean.RequestLoanBean;

public final class viewstatusrequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    RequestLoanBean bean = null;
//    UserBean userBean = null;
    
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 
        bean = (RequestLoanBean) request.getSession().getAttribute("loanbean");
//        userBean = (UserBean) request.getSession().getAttribute("requestBean");
        
        String msg = "";
        msg = (String) request.getAttribute("registerStatus");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body onload=\"Success()\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2 align=\"center\">รายการอนุมัติ</h2>\n");
      out.write("            <div class=\"col-sm-2\"></div>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"row\">");
      out.print(bean.getEmail());
      out.write("\n");
      out.write("                    <!--box-->\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <div class=\"box box-info\">\n");
      out.write("                            <div class=\"box-header with-border \">\n");
      out.write("                                <h3 class=\"box-title\">ลงทะเบียน</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <form class=\"form-horizontal\" name=\"formview\" action=\"SenddatawsAction.do\" method=\"post\"  id=\"register_form\" autocomplete=\"on\">\n");
      out.write("\n");
      out.write("                                <div class=\"box-body\">\n");
      out.write("                                    <input type=\"hidden\" name=\"todo\" value=\"register\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">ชื่อเข้าใช้ระบบ <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                                <input  name=\"u_username\" placeholder=\"กรุณาใส่ชื่อเข้าใช้ระบบ\" class=\"form-control\"  type=\"text\" maxlength=\"10\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">รหัสผ่าน <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                                                <input  name=\"u_password\" placeholder=\"กรุณาใส่รหัสผ่าน\" class=\"form-control\"  type=\"password\" maxlength=\"10\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">รหัสบัตรประจำตัวประชาชน <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-tags\"></i></span>\n");
      out.write("                                                <input  name=\"u_citizen\" placeholder=\"รหัสบัตรประจำตัวประชาชน\" class=\"form-control\"  type=\"text\" pattern= \"[0-9]\" maxlength=\"13\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">ชื่อ <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                                <input  name=\"u_fname\" placeholder=\"กรุณาใส่ชื่อของคุณ\" class=\"form-control\"  type=\"text\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">นามสกุล <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                                <input  name=\"u_lname\" placeholder=\"กรุณาใสนามสกุล\" class=\"form-control\"  type=\"text\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"\" class=\"col-sm-4 control-label\">เพศ </label>\n");
      out.write("                                        <div class=\"col-sm-6 index-0\">\n");
      out.write("                                            <div id=\"rdo\" class=\"btn-group\" data-toggle=\"buttons\">\n");
      out.write("                                                <label class=\"btn btn-default\">\n");
      out.write("                                                    <span class=\"glyphicon\"></span>\n");
      out.write("                                                    <input type=\"radio\" name=\"u_sex\" value=\"ชาย\" onclick=\"callRadioActive(this)\">ชาย\n");
      out.write("                                                </label>\n");
      out.write("                                                <label class=\"btn btn-default\">\n");
      out.write("                                                    <span class=\"glyphicon\"></span>\n");
      out.write("                                                    <input type=\"radio\" name=\"u_sex\" value=\"หญิง\" onclick=\"callRadioActive(this)\">หญิง\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">เบอร์โทร <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-earphone\"></i></span>\n");
      out.write("                                                <input name=\"u_tel\" placeholder=\"0833261877\" class=\"form-control\" type=\"text\" pattern= \"[0-9]\" maxlength=\"10\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-4 control-label\">อีเมล์ <span class=\"star\">*</span></label>  \n");
      out.write("                                        <div class=\"col-md-6 inputGroupContainer\">\n");
      out.write("                                            <div class=\"input-group\">\n");
      out.write("                                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-envelope\"></i></span>\n");
      out.write("                                                <input name=\"u_email\" placeholder=\"กรุณาใส่อีเมล์ของคุณ\" class=\"form-control\"  type=\"text\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.box-body -->\n");
      out.write("                                <div class=\"box-footer\">\n");
      out.write("                                    <!--button-->\n");
      out.write("                                    <div align=\"center\">\n");
      out.write("                                        <!--<button type=\"submit\" class=\"btn btn-success\" onclick=\"callinsert('register')\">ตกลง</button>&nbsp;&nbsp;&nbsp;&nbsp;-->\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-download-alt\"></span>  ลงทะเบียน</button>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                                        <!--<button type=\"reset\" class=\"btn btn-danger\">ยกเลิก</button>-->\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.box-footer-->\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <!--</section>-->\n");
      out.write("                <!-- end box -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-2\"></div>\n");
      out.write("        <!--alert--> \n");
      out.write("        <div >\n");
      out.write("            ");

                if ("ok".equals(msg)) {
            
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                function Success() {\n");
      out.write("    //                    swal(\"สำเร็จ!\", \", Your account is created!\", \"success\");\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                swal({\n");
      out.write("                title: \"สำเร็จ\",\n");
      out.write("                        text: \"ลงทะเบียนสำเร็จ เข้าสู่ระบบ\",\n");
      out.write("                        type: \"success\"\n");
      out.write("                },\n");
      out.write("                        function () {\n");
      out.write("                        window.location.href = 'PageAction.do?todo=gotoPageLogin';\n");
      out.write("                        });\n");
      out.write("                });\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            ");

            } else if ("no".equals(msg)) {
            
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                function Success() {\n");
      out.write("                swal(\"ไม่สำเร็จ\", \"Account is not removed!\", \"error\");\n");
      out.write("                },\n");
      out.write("                        function () {\n");
      out.write("                        window.location.href = 'PageAction.do?todo=gotoPageRegister';\n");
      out.write("                        });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!--alert-->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        function callActionGotoEdit(loanreq_id) {\n");
      out.write("        document.formshowdaterequestloan.loanreq_id.value = loanreq_id;\n");
      out.write("        document.formshowdaterequestloan.todo.value = 'gotoEdit';\n");
      out.write("        document.formshowdaterequestloan.submit();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
