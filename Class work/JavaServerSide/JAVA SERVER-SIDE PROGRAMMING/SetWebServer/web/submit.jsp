
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
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
                    PreparedStatement pstm=con.prepareStatement("insert into student2 values(?,?)");
                    pstm.setString(1, s1);
                    pstm.setString(2, s2);
                   int a= pstm.executeUpdate();
                   if(a>0){
                     String a1="Data is inserted";
                      out.print(a1);
                   }
                } catch (ClassNotFoundException ex) {

                } catch (SQLException e) {

                }

            
       %>


    </body>
</html>
