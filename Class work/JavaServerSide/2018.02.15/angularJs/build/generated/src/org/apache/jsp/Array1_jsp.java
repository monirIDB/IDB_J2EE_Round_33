package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Array1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            table,tr,td{border: 1px solid red;border-collapse: collapse;padding: 10px}\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script src=\"js/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <input type=\"text\" ng-init=\"x = 'Bangla';y = 'Dhaka'\"/>\n");
      out.write("        <input type=\"text\" ng-init=\"a = [1, 2, 3, 4, 5, 6,7,8,9,10 ]\"/>\n");
      out.write("         <input type=\"text\" ng-init=\"Student={name:'Rahim',id:'100',Round:'J2EE'}\"/>\n");
      out.write("        \n");
      out.write("        <table>     \n");
      out.write("                <tr ng-repeat=\"x in a\">\n");
      out.write("                    <td>{{x}}</td>        \n");
      out.write("                </tr>    \n");
      out.write("        </table>\n");
      out.write("         \n");
      out.write("        <ul>\n");
      out.write("            <li ng-repeat=\"x in a\">{{x}}</li>\n");
      out.write("        </ul>\n");
      out.write("         <ul>\n");
      out.write("            <li ng-repeat=\"x in Student\">{{x}}</li>\n");
      out.write("        </ul>\n");
      out.write("          \n");
      out.write("        <ol>\n");
      out.write("             <li ng-repeat=\"x in a\">{{x}}</li>\n");
      out.write("        </ol>\n");
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
