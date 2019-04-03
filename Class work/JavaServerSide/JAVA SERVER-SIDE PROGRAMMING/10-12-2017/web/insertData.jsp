<%-- 
    Document   : insertData
    Created on : Dec 10, 2017, 3:41:44 PM
    Author     : apcl 203
--%>

<%@page import="com.exam.DatabaseCRUD"%>
<%@page import="com.pojo.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="in" class="com.exam.DatabaseCRUD" scope="request"/>

        <%
            int id = Integer.parseInt(request.getParameter("t1"));
            String name = request.getParameter("t2");
            String pass = request.getParameter("t3");
            String email = request.getParameter("t4");
            String gender = request.getParameter("t5");
        %>

        <%
            Student st = new Student(id, name, pass, email, gender);
            DatabaseCRUD dc = new DatabaseCRUD();
            boolean bo = dc.doInsert(st);
            if (bo) {
                out.print("data inserted");
            } else {
                out.print("data not inserted");
            }
        %>
    </body>
</html>
