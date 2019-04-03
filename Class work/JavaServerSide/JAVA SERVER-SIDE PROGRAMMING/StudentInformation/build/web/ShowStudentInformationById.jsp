<%-- 
    Document   : ShowStudentInformationById
    Created on : Dec 10, 2017, 5:28:01 PM
    Author     : APCL
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            #t1{
                margin: auto;
                
            }
            #t2,tr,td,th{
                margin: auto;
                border: 1px solid black;
                border-collapse: collapse;
                padding: 20px;
                
                
            }
            th{
                background-color: yellowgreen;
            }
            td{
                background-color: peru;
            }
        </style>
    </head>
    <body>
        <%
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
        %>
        <%
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
                PreparedStatement pstm = con.prepareStatement("delete from student where id=?");
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
        %>
        
        
        <table id="t1">
            <tr>
                <th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Gender</th>
            </tr>
            <tr>
                <td><%=a%></td>
                <td><%=b%></td>
                <td><%=c%></td>
                <td><%=d%></td>
                <td><%=e%></td>
            </tr>
        </table>
            <form method="POST" action="ShowStudentInformationById.jsp">
                <table id="t2">
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="id"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Show"></td>
                    </tr>
                </table>
            </form>
    </body>
</html>
