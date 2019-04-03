

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="style.css"/>
        <style></style>
    </head>
    <body>
        <%
             ResultSet rs =null;
      try {
          

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
            PreparedStatement pstm = con.prepareStatement("select * from student3");
         

            rs = pstm.executeQuery();
           

          

        } catch (ClassNotFoundException ex) {

        } catch (SQLException e) {

        }
     %>
     <table >
         <caption>Student Info</caption>
          <tr>
             <th>ID</th> 
               <th>Name</th> 
               <th>Email</th> 
               <th>Phone</th> 
         </tr>
         <%while(rs.next()){%>
          
         <tr>
             <td><%=rs.getInt(1)%></td> 
               <td><%=rs.getString(2)%></td> 
               <td><%=rs.getString(3)%></td> 
               <td><%=rs.getString(4)%></td> 
         </tr>
         <%}%>
        
     </table>
    </body>
</html>
