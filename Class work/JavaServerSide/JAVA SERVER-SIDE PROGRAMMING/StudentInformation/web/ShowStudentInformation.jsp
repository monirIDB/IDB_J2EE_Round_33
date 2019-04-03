<%-- 
    Document   : ShowStudentInformation
    Created on : Dec 10, 2017, 5:13:05 PM
    Author     : APCL
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                margin: auto;
            }
            th{
              font-size: 30px;
              background: yellowgreen;
                
            }
            td{
                background: palevioletred;
                color: white;
            }
        </style>
    </head>
    <body>
       <table border="1" style="border-collapse: collapse">
        <%
            String url="jdbc:mysql://localhost:3306/studentinformation";
            String user="root";
            String pass="apcl123456";
            ResultSet rs=null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(url, user, pass);
                PreparedStatement pstmt=conn.prepareStatement("select * from student");
                rs=pstmt.executeQuery();
                  
            }catch(Exception e){
                e.printStackTrace();
            }
            %>
            <tr>
                <th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Gender</th>
            </tr>
            <%while(rs.next()){%>
            
            
            <tr>
                <td><%=rs.getString(1)%></td>
                <td><%=rs.getString(2)%></td>
                <td><%=rs.getString(3)%></td>
                <td><%=rs.getString(4)%></td>
                <td><%=rs.getString(5)%></td>
                
                <%}%>
            </tr>
        </table>
    </body>
</html>
