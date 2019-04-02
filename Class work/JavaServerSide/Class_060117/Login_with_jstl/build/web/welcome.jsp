<%-- 
    Document   : welcome.jsp
    Created on : Jan 7, 2018, 4:11:15 PM
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
       
        <h3>Welcome ${sessionScope["userInfo"]}</h3>
        <a href="loginPage.jsp">Logout <c:remove var="userInfor" scope="session"/></a>
    </body>
</html>
