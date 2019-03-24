package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventTextField_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html ng-app=\"a\" ng-controller=\"c\">\n");
      out.write("    <head>\n");
      out.write("        <script src=\"angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Number 1 :</td>\n");
      out.write("                <td><input type=\"text\" id=\"d1\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Number 2 :</td>\n");
      out.write("                <td> <input type=\"text\" id=\"d2\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td><input type=\"submit\" value=\"Go\" ng-click=\"f()\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>SUM</td>\n");
      out.write("                <td><input type=\"text\" id=\"d3\" value=\"{{z}}\" />{{q}}</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>SUM</td>\n");
      out.write("                <td><textarea id=\"d4\">{{z}}</textarea>{{r}}</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Multiply</td>\n");
      out.write("                <td><input type=\"text\" id=\"d3\" value=\"{{ab}}\" />{{q}}</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Checkbox</td>\n");
      out.write("                <td><input type=\"checkbox\" value=\"Football\" ng-model=\"v1\"/>FootBall</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"radio\" ng-model=\"v2\" value=\"Java\"/>Java</td>\n");
      out.write("                <td><input type=\"radio\" ng-model=\"v2\" value=\"HTML\"/>HTML</td>\n");
      out.write("                <td><input type=\"radio\" ng-model=\"v2\" value=\"CSS\"/>CSS</td>\n");
      out.write("                <td><input type=\"radio\" ng-model=\"v2\" value=\"WPSI\"/>WPSI</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td><select ng-model=\"v3\">\n");
      out.write("                        <option value=\"Pen\">Pen</option>\n");
      out.write("                        <option value=\"BOOk\">book</option>\n");
      out.write("                        <option value=\"PC\">pc</option>\n");
      out.write("                        <option value=\"MOucs\">mopucs</option>\n");
      out.write("                        <option value=\"Key\">key</option>\n");
      out.write("                    </select></td>\n");
      out.write("                <td></td>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        {{v3}}\n");
      out.write("        <script>\n");
      out.write("            var m=angular.module(\"a\",[]);\n");
      out.write("            m.controller(\"c\",function ($scope){\n");
      out.write("                $scope.v1=true;\n");
      out.write("                $scope.v2=true;\n");
      out.write("                $scope.v3=\"Pen\";\n");
      out.write("                $scope.f=function (){\n");
      out.write("                    var x=parseInt(document.getElementById(\"d1\").value);\n");
      out.write("                    var y=parseInt(document.getElementById(\"d2\").value);\n");
      out.write("                    $scope.q=document.getElementById(\"d3\").style.backgroundColor=\"green\";\n");
      out.write("                    $scope.r=document.getElementById(\"d4\").style.backgroundColor=\"aqua\";\n");
      out.write("                    $scope.z=x+y;\n");
      out.write("                    $scope.ab=x*y;\n");
      out.write("                    \n");
      out.write("                };\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
