<%-- 
    Document   : save
    Created on : Dec 11, 2017, 3:31:23 PM
    Author     : Apcl 208
--%>

<%@page import="javax.swing.JOptionPane"%>
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
    </head>
    <body>
       <%
           
            String s3= request.getParameter("user");
            String s4 = request.getParameter("password");
           
        %>
        <%
             String name="";
             
            ResultSet rs;
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","apcl123456");
            PreparedStatement pstm=con.prepareStatement("select * from login where user_name=? and password=?");
           
            pstm.setString(1,s3);
            pstm.setString(2,s4);
            rs=pstm.executeQuery();
            boolean b=false;
           
            while(rs.next()){
              b=true;
              name=rs.getString(2);
            }
            if(b){
            JOptionPane.showMessageDialog(null, "Query is succesfull");
            }else{
             JOptionPane.showMessageDialog(null, "Query not  succesfull");
             response.sendRedirect("index.html");
            }
            
            }catch(Exception e){
            
            }
           
              %>
         Welcome     <%=name%>
            
      
    </body>
</html>
