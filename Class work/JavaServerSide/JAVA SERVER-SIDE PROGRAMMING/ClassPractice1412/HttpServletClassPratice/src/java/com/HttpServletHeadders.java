package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpServletHeadders extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Http header</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Header</h1>");
        out.println("<table border=2px solid green>");
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String email = request.getParameter("email");
        out.println("<tr><td>Name</td><td>ID</td><td>Email</td></tr>");
        out.println("<tr><td>");
        out.println(name);
        out.println("</td><td>");
        out.println(id);
       
        out.println("</td><td>");
        out.println(email);
        out.println("</td></tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }
}
