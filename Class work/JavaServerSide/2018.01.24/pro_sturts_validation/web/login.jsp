<%-- 
    Document   : login
    Created on : Feb 5, 2018, 4:00:12 PM
    Author     : l2pc208e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="go">
            <s:textfield name="name"/>
            <s:textfield name="age"/>
            <s:submit label="Validate"/>
        </s:form>
    </body>
</html>
