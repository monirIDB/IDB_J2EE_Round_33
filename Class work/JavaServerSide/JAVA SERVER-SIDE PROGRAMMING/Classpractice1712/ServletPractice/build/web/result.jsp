<%-- 
    Document   : result
    Created on : Dec 17, 2017, 4:54:37 PM
    Author     : Apcl 208
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.test.bd.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>table, tr,td{border: 2px solid activecaption; border-collapse: collapse; background-color: beige}</style>
    </head>
    <body>

        <table>
            <tr>
                <td>Id</td> 

                <td>Name</td> 

                <td>Email</td> 
            </tr>
            <c:forEach var="s" items="${requestScope.st}">

                <tr>
                    <td>${s.id}</td>

                    <td>${s.name}</td>

                    <td>${s.email}</td>
                </tr>

            </c:forEach>
        </table>

    </body>
</html>
