<%-- 
    Document   : method
    Created on : Jan 7, 2018, 3:36:46 PM
    Author     : l2pc208e
--%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty param.nam or empty param.pass}">
            <c:redirect url="loginPage.jsp">
                <c:param name="errM" value="user name or password field is empty"/>
            </c:redirect>
        </c:if>
        <c:if test="${not empty param.nam and not empty param.pass}">
            <sql:setDataSource var="ds" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/login_db" user="root" password="apcl123456"/>
            <sql:query var="sq" dataSource="${ds}">
                SELECT count(*) as aa FROM new_login WHERE user_name="${param.nam}" and password="${param.pass}"
            </sql:query>
            <c:forEach var="dd" items="${sq.rows}">
                <c:choose>
                    <c:when test="${dd.aa gt 0}">
                        <c:set var="userInfo" value="${param.nam}" scope="session"/>
                    <c:redirect url="welcome.jsp">
                        
                    </c:redirect>
                    </c:when>
                    <c:otherwise>
                        <c:redirect url="loginPage.jsp">
                            <c:param name="errM" value="User name or password is incorrect"/>
                        </c:redirect>
                    </c:otherwise>
                </c:choose>
                
            </c:forEach>
        </c:if>
    </body>
</html>
