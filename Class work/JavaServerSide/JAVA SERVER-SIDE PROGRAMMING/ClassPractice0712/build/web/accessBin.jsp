<%-- 
    Document   : AccessBin
    Created on : Dec 7, 2017, 6:44:46 PM
    Author     : Apcl 208
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.Exam.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access Bin Page</title>
    </head>
    <body>
        <jsp:useBean id="st" class="com.Exam.Student" scope="request"/>
        <%
          Date d=st.getDob();
          String n1=st.getName();
       String d1= new SimpleDateFormat("MMM/dd/yyyy").format(d);
         
        %>
        Name <%=n1%>
        Date of Birth <%=d1%>
    </body>
</html>
