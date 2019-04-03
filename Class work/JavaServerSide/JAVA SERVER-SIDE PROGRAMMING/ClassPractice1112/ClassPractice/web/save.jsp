<%-- 
    Document   : save
    Created on : Dec 11, 2017, 3:31:23 PM
    Author     : Apcl 208
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int s1 = Integer.parseInt(request.getParameter("id"));
            String s2 = request.getParameter("name");
            String s3 = request.getParameter("user");
            String s4 = request.getParameter("password");
            String s5 = request.getParameter("email");
            String s6 = request.getParameter("gender");
        %>
        <%  int i;
           
            try {
                 
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
                PreparedStatement pstm = con.prepareStatement("insert into login values(?,?,?,?,?,?)");
                pstm.setInt(1, s1);
                pstm.setString(2, s2);
                pstm.setString(3, s3);
                pstm.setString(4, s4);
                pstm.setString(5, s5);
                pstm.setString(6, s6);
                i = pstm.executeUpdate();
                 String ms="New user is created";
                if (i > 0) {
                   
                    JOptionPane.showMessageDialog(null,ms );
                    response.sendRedirect("index.html");
                }
            } catch (Exception e) {
            }
        %>






    </body>
</html>
