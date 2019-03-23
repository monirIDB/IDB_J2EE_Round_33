<%-- 
    Document   : insert
    Created on : Feb 12, 2018, 5:08:52 PM
    Author     : l2pc208e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="monir">
            <s:textfield name="id" label="Id"/>
            <s:textfield name="name" label="Name"/>
            
            <s:password name="password" label="Password"/>
            
            <s:submit value="Save"/>
        </s:form>
    </body>
</html>
