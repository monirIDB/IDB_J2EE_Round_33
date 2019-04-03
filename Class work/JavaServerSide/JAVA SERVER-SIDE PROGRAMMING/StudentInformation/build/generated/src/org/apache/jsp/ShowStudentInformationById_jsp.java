package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class ShowStudentInformationById_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            #t1{\n");
      out.write("                margin: auto;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #t2,tr,td,th{\n");
      out.write("                margin: auto;\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                padding: 40px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String id = request.getParameter("id");                    
            String url = "jdbc:mysql://localhost:3306/studentinformation";
            String user = "root";
            String pass = "apcl123456";
            String a="";
            String b = "";
            String c = "";
            String d="";
            String e="";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement pstm = con.prepareStatement("SELECT * FROM student WHERE id=?");
                pstm.setString(1, id);               
                ResultSet rs = pstm.executeQuery();
                while (rs.next()) {
                    
                    a = rs.getString(1);
                    b = rs.getString(2);
                    c = rs.getString(3);
                    d = rs.getString(4);
                    e=rs.getString(5);
                }

            } catch (Exception f) {
                f.printStackTrace();
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table id=\"t1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Gender</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(a);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(c);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(d);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(e);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("            <form method=\"POST\" action=\"ShowStudentInformationById.jsp\">\n");
      out.write("                <table id=\"t2\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID</td>\n");
      out.write("                        <td><input type=\"text\" name=\"id\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Show\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
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
