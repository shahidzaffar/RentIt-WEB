/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-09-26 15:06:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" >\r\n");
      out.write("<head>\r\n");
      out.write("  <title>RentIt Login</title>\r\n");
      out.write("  \r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>  \r\n");
      out.write("  \r\n");
      out.write("  <style type=\"text/css\"> \r\n");
      out.write("  \r\n");
      out.write("  body\r\n");
      out.write("  {\r\n");
      out.write("  \tbackground-image:url(https://images.unsplash.com/photo-1585503418537-88331351ad99?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1567&q=80);\r\n");
      out.write("  \theight=\"100%\"\r\n");
      out.write("  }\r\n");
      out.write("  \t.form-2 {\r\n");
      out.write("    \r\n");
      out.write("    width: 340px;\r\n");
      out.write("    margin: 60px auto 30px;\r\n");
      out.write("    padding: 15px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("\r\n");
      out.write("    /* Styles */\r\n");
      out.write("    background: #fffaf6;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    color: #7e7975;\r\n");
      out.write("    box-shadow:\r\n");
      out.write("        0 2px 2px rgba(0,0,0,0.2),        \r\n");
      out.write("        0 1px 5px rgba(0,0,0,0.2),        \r\n");
      out.write("        0 0 0 12px rgba(255,255,255,0.4); \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write(".form-2 .float {\r\n");
      out.write("    width: 50%;\r\n");
      out.write("    float: left;\r\n");
      out.write("    padding-top: 15px;\r\n");
      out.write("    border-top: 1px solid rgba(255,255,255,1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 .float:first-of-type {\r\n");
      out.write("    padding-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 .float:last-of-type {\r\n");
      out.write("    padding-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 label {\r\n");
      out.write("    display:Block;\r\n");
      out.write("    padding: 0 0 5px 2px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    text-shadow: 0 1px 0 rgba(255,255,255,0.8);\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 label i {\r\n");
      out.write("    margin-right: 10px; /* Gap between icon and text */\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    width: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 input[type=text],\r\n");
      out.write(".form-2 input[type=password] {\r\n");
      out.write("    font-family: 'Lato', Calibri, Arial, sans-serif;\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    font-weight: 400;\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("    border: 3px solid #ebe6e2;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    transition: all 0.3s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 input[type=text]:hover,\r\n");
      out.write(".form-2 input[type=password]:hover {\r\n");
      out.write("    border-color: #CCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 label:hover ~ input {\r\n");
      out.write("    border-color: #CCC;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 input[type=text]:focus,\r\n");
      out.write(".form-2 input[type=password]:focus {\r\n");
      out.write("    border-color: #BBB;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    .clearfix:after {\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tdisplay: table;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 input[type=submit],\r\n");
      out.write("{\r\n");
      out.write("    /* Size and position */\r\n");
      out.write("    width: 49%;\r\n");
      out.write("    height: 38px;\r\n");
      out.write("    float: left;\r\n");
      out.write("    position: relative;\r\n");
      out.write("\r\n");
      out.write("    /* Styles */\r\n");
      out.write("    box-shadow: inset 0 1px rgba(255,255,255,0.3);\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("\r\n");
      out.write("    /* Font styles */\r\n");
      out.write("    font-family: 'Lato', Calibri, Arial, sans-serif;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    line-height: 38px; /* Same as height */\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 input[type=submit] {\r\n");
      out.write("    margin-left: 1%;\r\n");
      out.write("    align:center;\r\n");
      out.write("    background: linear-gradient(#fbd568, #ffb347);\r\n");
      out.write("    border: 1px solid #f4ab4c;\r\n");
      out.write("    color: #996319;\r\n");
      out.write("    text-shadow: 0 1px rgba(255,255,255,0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t.form-2 input[type=submit]:hover,\r\n");
      out.write(" {\r\n");
      out.write("    box-shadow: \r\n");
      out.write("        inset 0 1px rgba(255,255,255,0.3), \r\n");
      out.write("        inset 0 20px 40px rgba(255,255,255,0.15);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-2 input[type=submit]:\r\n");
      out.write("{\r\n");
      out.write("    top: 1px;\r\n");
      out.write("}\r\n");
      out.write("  </style>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("<!--\t<div style=\"margin-top: 10%; background-color: #cc9200\">\t-->\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"margin-top: 12%;\" >\t\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  <form  class=\"form-2\" action=\"adminlogin\" method=\"post\">\r\n");
      out.write("\t  \r\n");
      out.write("\t  <h2><span class=\"log-in\">Log in</span></h2>\r\n");
      out.write("\t  \r\n");
      out.write("\t  <div class=\"form-group\" >\r\n");
      out.write("\t      <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t \r\n");
      out.write("\t    <p class=\"float\">\r\n");
      out.write("\t      <label for=\"login\"><i class=\"icon-user\" class=\"form-control\"></i>Username</label>\r\n");
      out.write("        \t<input type=\"text\" name=\"username\" placeholder=\"Username or email\">\r\n");
      out.write("        </p>\r\n");
      out.write("\t     \r\n");
      out.write("\t   \r\n");
      out.write("\t    <p class=\"float\">\r\n");
      out.write("        \t<label for=\"password\"><i class=\"icon-lock\"></i>Password</label>\r\n");
      out.write("        \t<input type=\"password\" name=\"password\" placeholder=\"Password\" > \r\n");
      out.write("    \t</p>\r\n");
      out.write("    \t\r\n");
      out.write("    \t<p class=\"clearfix\"> \r\n");
      out.write("            \r\n");
      out.write("       \t\t <input type=\"submit\" name=\"submit\" class=\"btn btn-success\" value=\"SUBMIT\">\r\n");
      out.write("    \t</p> \r\n");
      out.write("\t \r\n");
      out.write("\t    \r\n");
      out.write("\t  </form>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/adminlogin.jsp(180,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.error != null}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t    <div id=\"error\">\r\n");
        out.write("\t\t\t       <p style=\"background-color: white; width: 50%;\"> <font color=\"red\">\r\n");
        out.write("\t\t\t       \t\t\t<b>ERROR! Invalid Credentials<br>Try Again... </b></font> </p>\r\n");
        out.write("\t\t\t    </div>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
