

<%@page import="java.sql.SQLException"%>
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
            try {
                String n1 = request.getParameter("name");
                int n2 = Integer.parseInt(request.getParameter("id"));
                String n3 = request.getParameter("email");
                String n4 = request.getParameter("mobile");
                String n5 = request.getParameter("gender");
                String n6 = request.getParameter("password");

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
                PreparedStatement pstm = con.prepareStatement("insert into student3 values(?,?,?,?,?,?)");
                pstm.setInt(1, n2);
                pstm.setString(2, n1);
                pstm.setString(3, n3);
                pstm.setString(4, n4);
                pstm.setString(5, n5);
                pstm.setString(6, n6);
                int i = pstm.executeUpdate();
                if (i > 0) {
                    out.print("Data is saved");
                } else {
                    out.print("Data is saved");
                }

            } catch (ClassNotFoundException ex) {

            } catch (SQLException e) {

            }
        %>


    </body>
</html>
