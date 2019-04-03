<%-- 
    Document   : ActionForm
    Created on : Dec 10, 2017, 4:30:21 PM
    Author     : APCL
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
            String id=request.getParameter("id");
            String name=request.getParameter("name");
            String password=request.getParameter("password");
            String email=request.getParameter("email");
            String gender=request.getParameter("radio");
            
            String url="jdbc:mysql://localhost:3306/studentinformation";
            String user="root";
            String pass="apcl123456";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection(url, user, pass);
                PreparedStatement pstmt=conn.prepareStatement("insert into student values(?,?,?,?,?)");
                pstmt.setString(1, id);
                pstmt.setString(2, name);
                pstmt.setString(3, password);
                pstmt.setString(4, email);
                pstmt.setString(5, gender);
                int i=pstmt.executeUpdate();
                if(i>0){
                    JOptionPane.showMessageDialog(null, "Insert Successfully");
                }else{
                   JOptionPane.showMessageDialog(null, "Insert Not Successfully"); 
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            %>
    </body>
</html>
