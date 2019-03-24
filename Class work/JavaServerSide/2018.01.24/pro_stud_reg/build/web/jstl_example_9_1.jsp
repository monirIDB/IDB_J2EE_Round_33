<%-- 
    Document   : jstl_example_9_1
    Created on : Jan 24, 2018, 3:42:12 PM
    Author     : l2pc208e
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <sql:query var="items" dataSource="myReff">
            SELECT id, name FROM logtable ORDER by name
        </sql:query>
        
            <h1>New Student</h1>
            <table border='1'>
                <th>ID</th><th>Name</th>
                <c:forEach var="row" items="${items.rows}">
                <tr>
                    <td>
                        <c:out value="${row.id}"/>
                    </td>
                    <td><c:out value="${row.name}"/></td>
                </tr>
                
                </c:forEach>
            </table>
    </body>
</html>
