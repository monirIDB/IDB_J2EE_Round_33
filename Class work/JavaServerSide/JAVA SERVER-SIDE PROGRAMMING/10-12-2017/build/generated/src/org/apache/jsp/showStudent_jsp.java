package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.pojo.Student;
import java.util.ArrayList;

public final class showStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style> table,tr,td,th{border: 1px solid black;border-collapse: collapse; margin:0px auto;margin-top: 100px;} </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      com.exam.DatabaseCRUD sh = null;
      synchronized (request) {
        sh = (com.exam.DatabaseCRUD) _jspx_page_context.getAttribute("sh", PageContext.REQUEST_SCOPE);
        if (sh == null){
          sh = new com.exam.DatabaseCRUD();
          _jspx_page_context.setAttribute("sh", sh, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");

            ArrayList<Student> allstu = sh.findAllStudent();
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            ");
 for (Student s : allstu) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(s.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.getPass());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s.getGender());
      out.write("</td>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <form action=\"y.jsp\">\n");
      out.write("                <input type=\"text\" name=\"r1\"/>\n");
      out.write("                <input type=\"submit\" value=\"go\"/>\n");
      out.write("            </form>\n");
      out.write("           \n");
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
