package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import impl.Student;
import util.AllMethod;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("      <style>\n");
      out.write("           a{text-decoration: blue}\n");
      out.write("            table tr:nth-child(odd){background-color: #fda;}\n");
      out.write("            table td:nth-child(odd){background-color: activeborder;}\n");
      out.write("            tr,table,td{alignment-adjust: central; padding: 10px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}\n");
      out.write("        </style>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"POST\" action=\"save.jsp\">\n");
      out.write("            <fieldset >\n");
      out.write("                <legend align=\"center\" >Student Registration Form</legend>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID</td><td>: </td><td> <input type=\"text\" size=\"30\" name=\"id\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td><td> : </td><td><input type=\"text\" size=\"30\" name=\"name\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>password </td><td> : </td><td> <input type=\"password\" size=\"30\" name=\"password\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> Email</td><td> : </td><td> <input type=\"text\" size=\"30\" name=\"email\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender </td><td> : </td><td>Male <input type=\"radio\" value=\"Male\" name=\"gender\"/>Female<input type=\"radio\" value=\"Female\" name=\"gender\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>  </td><td>  </td><td> <a href=\"allstudent.jsp\"><input type=\"button\" value=\"Show All Student\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                          <td>  </td><td>  </td><td> <a href=\"onestudent.html\"><input type=\"button\" value=\"Show All Student by ID\"></a></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>  </td><td>  </td><td> <input type=\"submit\" value=\"Go\"></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("         ");
      util.AllMethod st = null;
      synchronized (request) {
        st = (util.AllMethod) _jspx_page_context.getAttribute("st", PageContext.REQUEST_SCOPE);
        if (st == null){
          st = new util.AllMethod();
          _jspx_page_context.setAttribute("st", st, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("      \n");
      out.write("        ");
   AllMethod a = new AllMethod();
            ArrayList<Student> all = a.findAllStudent();

        
      out.write("\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("            ");
for (Student atf : all) {
      out.write("\n");
      out.write("                 \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(atf.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(atf.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(atf.getPassword());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(atf.getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(atf.getGender());
      out.write("</td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
 }
            
      out.write("\n");
      out.write("        </table>    \n");
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
