package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Controllar1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/angular.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            Number 1 : <input type=\"text\" id=\"d1\"/><br>\n");
      out.write("            Number 2 : <input type=\"text\" id=\"d2\"/><br>\n");
      out.write("            <input type=\"submit\"value=\"Add\" ng-click=\"f1()\"/>\n");
      out.write("            <input type=\"submit\" value=\"Subtract\" ng-click=\"f2()\"/>\n");
      out.write("            <input type=\"submit\"value=\"Multiple\" ng-click=\"f3()\"/>\n");
      out.write("            <input type=\"submit\"value=\"Divided\" ng-click=\"f4()\"/>\n");
      out.write("            <input type=\"submit\"value=\"Clear\" ng-click=\"f5()\"/>\n");
      out.write("            <h1>Output is : <input type=\"text\" id=\"c1\" value=\"{{z}}\"/>{{p}}</h1>\n");
      out.write("            <h1>Output is : <textarea id=\"q\">{{z}}</textarea>{{e}}</h1>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                        var m1 = angular.module(\"a\", []);\n");
      out.write("                        m1.controller(\"con1\", function ($scope) {\n");
      out.write("                            $scope.f1 = function () {\n");
      out.write("                                var x = parseInt(document.getElementById(\"d1\").value);\n");
      out.write("                                var y = parseInt(document.getElementById(\"d2\").value);\n");
      out.write("                                $scope.p = document.getElementById(\"c1\").style.backgroundColor = \"red\";\n");
      out.write("                                $scope.e = document.getElementById(\"q\").style.backgroundColor = \"green\";\n");
      out.write("                                $scope.z = x + y;\n");
      out.write("                            };\n");
      out.write("                            $scope.f2 = function () {\n");
      out.write("                                var x = parseInt(document.getElementById(\"d1\").value);\n");
      out.write("                                var y = parseInt(document.getElementById(\"d2\").value);\n");
      out.write("                                $scope.p = document.getElementById(\"c1\").style.backgroundColor = \"red\";\n");
      out.write("                                $scope.e = document.getElementById(\"q\").style.backgroundColor = \"green\";\n");
      out.write("                                $scope.z = x - y;\n");
      out.write("                            };\n");
      out.write("                            $scope.f3 = function () {\n");
      out.write("                                var x = parseInt(document.getElementById(\"d1\").value);\n");
      out.write("                                var y = parseInt(document.getElementById(\"d2\").value);\n");
      out.write("                                $scope.p = document.getElementById(\"c1\").style.backgroundColor = \"red\";\n");
      out.write("                                $scope.e = document.getElementById(\"q\").style.backgroundColor = \"green\";\n");
      out.write("                                $scope.z = x * y;\n");
      out.write("                            };\n");
      out.write("                            $scope.f4 = function () {\n");
      out.write("                                var x = parseInt(document.getElementById(\"d1\").value);\n");
      out.write("                                var y = parseInt(document.getElementById(\"d2\").value);\n");
      out.write("                                $scope.p = document.getElementById(\"c1\").style.backgroundColor = \"red\";\n");
      out.write("                                $scope.e = document.getElementById(\"q\").style.backgroundColor = \"green\";\n");
      out.write("                                $scope.z = x / y;\n");
      out.write("                            };\n");
      out.write("                            $scope.f5 = function () {\n");
      out.write("                                var x =document.getElementById(\"d1\").value=null;\n");
      out.write("                                var y = document.getElementById(\"d2\").value=null;\n");
      out.write("                                 \n");
      out.write("                            };\n");
      out.write("                        });\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
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
