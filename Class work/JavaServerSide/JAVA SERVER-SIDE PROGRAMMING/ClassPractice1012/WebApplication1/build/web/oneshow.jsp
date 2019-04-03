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
            table td:nth-child(odd){background-color: blue;}
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
            Student s = am.findOneStudent(a);
        %>
        <table>
            <tr>
                <td><%=s.getId()%></td>
                <td><%=s.getName()%></td>
                <td><%=s.getPassword()%></td>
                <td><%=s.getEmail()%></td>
                <td><%=s.getGender()%></td>
            </tr>
        </table>


    </body>
</html>
