<%-- 
    Document   : show
    Created on : Dec 18, 2017, 6:21:38 PM
    Author     : Ariful Islam Khokon
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,tr,td,th{
                border: 1px solid;
                border-collapse: collapse;
                margin: 0px auto;
                padding: 2px;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Subject</th>
                <th>Round</th>
            </tr>
            <c:forEach var="tt" items="${requestScope.st}">
                <tr>
                    <td>${tt.id}</td>
                    <td>${tt.name}</td>
                    <td> ${tt.gender}</td>
                    <td> ${tt.subject}</td>
                    <td> ${tt.round}</td>
                </tr>
            </c:forEach>
            <tr>
                <td></td>
                <td></td>
                <td><a href="index.html">search Page</a></td>
                <td></td>
                <td></td>
            </tr>
        </table>



    </body>
</html>
