
<%@page import="java.sql.ResultSet"%>
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
           String s1 = request.getParameter("n1");
            String s2 = request.getParameter("n2");   
            String name="";
            String email="";
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
                    PreparedStatement pstm=con.prepareStatement("select * from student2 where name=?");
                    pstm.setString(1, s1);
                   ResultSet a= pstm.executeQuery();
                  while(a.next()){
                      name=a.getString(1);
                      email=a.getString(2);
                  }
                } catch (ClassNotFoundException ex) {

                } catch (SQLException e) {

                }

            
       %>
       Name is <%=name%></br>
       Email is <%=email%>


    </body>
</html>
