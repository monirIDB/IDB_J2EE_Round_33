

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            h1{color: blueviolet}
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="time" scope="request" class="com.test.MyCalendar"></jsp:useBean>
            The time is currently : <BR><BR>
        <c:out value="${time.hour}"></c:out><br>
        <c:set var="x" value="${time.hour.hours}" scope="request"></c:set>
        <c:if test="${x >=0 && x <=11}">
            <h1><h1><i>Good Morning!</i></h1>
        </c:if>
        <c:if test="${x >=12 && x <=17}">
            <h1><i>Good Afternoon!</i></h1>
        </c:if>
        <c:if test="${x >=18 && x <=24}">
            <h1><i>Good Evening!</i></h1>
        </c:if>
        </br>
    </body>
</html>
