<%-- 
    Document   : result
    Created on : Dec 21, 2017, 4:53:30 PM
    Author     : Apcl 208
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
        <h1>Hello World!</h1>
        ${sessionScope.reqperson.id}
        ${sessionScope.reqperson.name}
        ${sessionScope.reqperson.email}
        ${sessionScope.reqperson.address}
        <c:out value="Alamin"></c:out>
        <c:set var="x" value="${'Monir'}" scope="session"></c:set>
        <c:out value="${x}"></c:out>
       
       
       
         <table>
                <tr><td>ID</td><td>:</td><td> ${param["id"]}</td></tr>
                <tr><td>Name</td><td>:</td><td> ${param["name"]}</td></tr>
                <tr><td>Email</td><td>:</td><td> ${param["email"]}</td></tr>
                <tr><td>Address</td><td>:</td><td> ${param["address"]}</td></tr>
             
                
            </table>
    </body>
</html>
