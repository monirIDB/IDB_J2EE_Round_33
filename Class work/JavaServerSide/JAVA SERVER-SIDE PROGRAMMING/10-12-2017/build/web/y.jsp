<%-- 
    Document   : y
    Created on : Dec 10, 2017, 6:54:00 PM
    Author     : apcl 203
--%>

<%@page import="com.pojo.Student"%>
<%@page import="com.exam.DatabaseCRUD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        int n=Integer.parseInt(request.getParameter("r1"));
        DatabaseCRUD dc=new DatabaseCRUD();
        Student s=new Student(n, "fatema", "fatema", "fatema", "fatema");
        dc.doInsert(s);
        response.sendRedirect("showStudent.jsp");
        %>
    </body>
</html>
