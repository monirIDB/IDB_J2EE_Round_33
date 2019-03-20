<%-- 
    Document   : result.jsp
    Created on : Dec 21, 2017, 11:02:57 PM
    Author     : apcl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${sessionScope.reqperson.name}
       ID is ${param['id']}
    </body>
</html>
