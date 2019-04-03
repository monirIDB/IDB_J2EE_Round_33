<%-- 
    Document   : sum
    Created on : Dec 7, 2017, 3:13:20 PM
    Author     : Apcl 208
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
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
            String name = "";
            String mobile = "";
            String email = "";
          
            try {

                int n1 = Integer.parseInt(request.getParameter("id"));
                String n2 = request.getParameter("password");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
                PreparedStatement pstm = con.prepareStatement("select * from student3 where id=? and password=?");
                pstm.setInt(1, n1);
                pstm.setString(2, n2);

                ResultSet rs = pstm.executeQuery();
                  int r=rs.getRow();
                
                while (rs.next()) {
                    name = rs.getString(2);
                    email = rs.getString(3);
                    mobile = rs.getString(4);
                }
              

            } catch (ClassNotFoundException ex) {

            } catch (SQLException e) {

            }
        %>
        <%=name%>
        
    </body>
</html>
