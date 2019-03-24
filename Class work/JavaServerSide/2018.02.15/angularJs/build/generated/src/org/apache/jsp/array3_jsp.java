package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class array3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html ng-app=\"a\" ng-controller=\"con1\">\n");
      out.write("    <head>\n");
      out.write("        <script src=\"js/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("           table,th,tr,td{border: 1px solid green;border-collapse: collapse;padding: 10px;background-color: aqua}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <h1>Scope hote value ana</h1>\n");
      out.write("        <table> \n");
      out.write("             <caption><h2 style=\"margin-left: 10%; color: red\">Student Information:</h2></caption>\n");
      out.write("                <th>id</th>\n");
      out.write("                <th>name</th>\n");
      out.write("                <th>Round</th>\n");
      out.write("            <tr ng-repeat=\"z in students\">   \n");
      out.write("                <td>{{z.id}}</td>        \n");
      out.write("                <td>{{z.name}}</td>        \n");
      out.write("                <td>{{z.Round}}</td>                  \n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <script>\n");
      out.write("            var m1 = angular.module(\"a\", []);\n");
      out.write("            m1.controller(\"con1\", function($scope){\n");
      out.write("            $scope.students = [{id:'100', name:'rahim', Round:'33'},\n");
      out.write("            {id:'100', name:'rahim', Round:'33'},\n");
      out.write("            {id:'100', name:'rahim', Round:'33'},\n");
      out.write("            {id:'100', name:'rahim', Round:'33'}]\n");
      out.write("        });\n");
      out.write("        </script>\n");
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
