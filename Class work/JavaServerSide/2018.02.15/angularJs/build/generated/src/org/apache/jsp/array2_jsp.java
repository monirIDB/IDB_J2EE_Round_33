package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class array2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/angular.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <style>\n");
      out.write("            table,th,tr,td{border: 1px solid green;border-collapse: collapse;padding: 10px;background-color: aqua}\n");
      out.write("            table,th{border: 1px solid green;border-collapse: collapse;padding: 10px;background-color: green}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <fieldset>\n");
      out.write("            <div style=\"margin-left: 42%\" ng-init=\"Student=[{name:'Rahim',id:'100',Round:'J2EE',Gender:'Male',DOB:'20 - 11 - 2000'},\n");
      out.write("                {name:'Hasan', id:'101', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Fatema', id:'102', Round:'J2EE', Gender:'Feale', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Hasan', id:'103', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Hasan', id:'104', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Hasan', id:'105', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Hasan', id:'107', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Hasan', id:'108', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Hasan', id:'109', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                },\n");
      out.write("                {name:'Masud', id:'110', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'\n");
      out.write("                }]\"/>\n");
      out.write("\n");
      out.write("            <table>\n");
      out.write("                <caption><h2 style=\"margin-left: 10%; color: red\">Student Information:</h2></caption>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Id</th>\n");
      out.write("                <th>Round</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Dath of Birth</th>\n");
      out.write("\n");
      out.write("                <tr ng-repeat=\"x in Student\">\n");
      out.write("                    <td>{{x.name}}</td>        \n");
      out.write("                    <td>{{x.id}}</td>        \n");
      out.write("                    <td>{{x.Round}}</td>        \n");
      out.write("                    <td>{{x.Gender}}</td>        \n");
      out.write("                    <td>{{x.DOB}}</td>        \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <ul ng-repeat=\"y in Student|limitTo:2\"> ");
      out.write("\n");
      out.write("                <li>{{y.name}}</li>\n");
      out.write("                <li>{{y.id}}</li>\n");
      out.write("                <li>{{y.Round}}</li>\n");
      out.write("                <li>{{y.Gender}}</li>\n");
      out.write("                <li>{{y.DOB}}</li>\n");
      out.write("            </ul>\n");
      out.write("                <table>\n");
      out.write("                    <tr ng-repeat=\"m in Student | limitTo:3\">\n");
      out.write("                        <td>{{m.name}}</td>\n");
      out.write("                        <td>{{m.id}}</td>\n");
      out.write("                        <td>{{m.Round}}</td>\n");
      out.write("                        <td>{{m.Gender}}</td>\n");
      out.write("                        <td>{{m.DOB}}</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("        </div>\n");
      out.write("    </fieldset>\n");
      out.write("</body>\n");
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
