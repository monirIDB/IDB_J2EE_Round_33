<%-- 
    Document   : result
    Created on : Dec 18, 2017, 6:23:23 PM
    Author     : apcl
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,tr,td{border: 1px solid black ;border-collapse: collapse}
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td>Name</td>
                <td> Subject</td>
                <td>Round</td>
            </tr>
            <c:forEach var="s" items="${requestScope.st}">

                <tr>


                    <td> ${s.name}</td>


                    <td> ${s.subject}</td>
                    <td> ${s.round}</td>
                </tr>
            </c:forEach> 
        </table>   



    </body>
</html>
