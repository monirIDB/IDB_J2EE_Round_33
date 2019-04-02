<%-- 
    Document   : core_if.jsp
    Created on : Dec 23, 2017, 3:22:29 AM
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
            h3{background-color: pink; color: red;}
        </style>
    </head>
    <body>
        <jsp:useBean id="cal" class="com.exam.MyCalander" scope="request"/>
        The time is currently: <BR><BR>
        <c:out value="${cal.d}"/>
        <c:set var="hour" value="${cal.d.hours}" scope="request"/>
        <BR><BR>
        <b>
            <c:if test="${hour >= 0 && hour<=11}">
                <marquee><h3>Good Morning!</h3></marquee>
            </c:if>
                 <c:if test="${hour >= 12 && hour<=17}">
                <h3> <marquee>Good Afternoon!</marquee></h3> 
            </c:if>
                 <c:if test="${hour >= 18 && hour<=23}">
                 <h3><marquee>Good Evening!</marquee></h3>
                
            </c:if>
        </b>
    </body>
</html>
