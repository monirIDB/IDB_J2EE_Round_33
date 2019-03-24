package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html ng-app=\"\">\n");
      out.write("    <head>\n");
      out.write("        <script src=\"js/angular.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"margin-left: 46%;color: red\"><i>AngularJs :</i> </h1>\n");
      out.write("        <fieldset>\n");
      out.write("             <legend style=\"margin-left: 44%\"><h1>Auto Show Output : </h1></legend>\n");
      out.write("        Id : <input type=\"text\" ng-model=\"v1\"/>\n");
      out.write("        output :<input type=\"text\" value=\"{{v1}}\"/>\n");
      out.write("        <br> \n");
      out.write("        Name : <input type=\"text\" ng-model=\"v2\"/>\n");
      out.write("        output :<input type=\"text\" value=\"{{v2}}\"/>\n");
      out.write("        </fieldset>\n");
      out.write("        <hr>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend style=\"margin-left: 45%\"><h1>Calculation : </h1></legend>\n");
      out.write("        Number 1 : <input type=\"number\" ng-model=\"a1\"/>\n");
      out.write("        Number 2 : <input type=\"number\" ng-model=\"a2\"/>\n");
      out.write("        <br>\n");
      out.write("        Sum Is :<input type=\"text\" value=\"{{a1+a2}}\"/>\n");
      out.write("        subtraction is :<input type=\"text\" value=\"{{a1-a2}}\"/>\n");
      out.write("        Multiple is :<input type=\"text\" value=\"{{a1*a2}}\"/>\n");
      out.write("        Divided is :<input type=\"text\" value=\"{{a1/a2}}\"/>\n");
      out.write("        </fieldset>\n");
      out.write("        <hr>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend><h3>Field ar value initialization kore deyar Jonno</h3></legend>\n");
      out.write("            Name : <input type=\"text\" ng-bind=\"b1=100\"/> {{ b1}}\n");
      out.write("            <br>\n");
      out.write("            Name : <input type=\"text\" ng-bind=\"b2='Rahim'\"/>{{ b2}}\n");
      out.write("            <hr>\n");
      out.write("            Name : <input type=\"text\" ng-init=\"First_name='Abdur';Last_name='Rahim'\"/>\n");
      out.write("            {{First_name}} {{Last_name}}\n");
      out.write("        </fieldset>\n");
      out.write("    </body>\n");
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
