<%-- 
    Document   : oneshow
    Created on : Dec 10, 2017, 4:58:44 PM
    Author     : Ariful Islam Khokon
--%>

<%@page import="util.AllMethod"%>
<%@page import="impl.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       <style>
             table tr:nth-child(odd){background-color: #fda;}
            table td:nth-child(odd){background-color: activeborder;}
            tr,table,td{alignment-adjust: central; padding: 10px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}
        </style>
    </head>
    <body>
        <jsp:useBean id="st" class="util.AllMethod" scope="request"></jsp:useBean>

        <%
            int a = Integer.parseInt(request.getParameter("id"));
        %>
        <%
            AllMethod am = new AllMethod();
            boolean s = am.doDelete(a);
            response.sendRedirect("allstudent.jsp");
        %>
       

    </body>
</html>
