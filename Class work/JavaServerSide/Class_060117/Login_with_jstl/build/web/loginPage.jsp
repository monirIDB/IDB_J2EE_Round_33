<%-- 
    Document   : loginPage
    Created on : Jan 7, 2018, 3:27:53 PM
    Author     : l2pc208e
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="method.jsp">
            <table>
                <tr>
                    <td>User Name</td>
                    <td>:</td>
                    <td><input type="text" name="nam"/></td>
                </tr>
                 <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="password" name="pass"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><c:if test="${not empty param.errM}">
                            <c:out value="${param.errM}"/>
                    </c:if></td>
                </tr>
                 <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Login"/></td>
                </tr>
            </table>
        </form>
        <c:out value="${param.errM}"/>
    </body>
</html>
