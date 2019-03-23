<%-- 
    Document   : index
    Created on : Feb 12, 2018, 4:00:38 PM
    Author     : l2pc203e
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="insert">
            <s:textfield name="id" label="Id"/>
            <s:textfield name="name" label="Name"/>
            <s:textfield name="email" label="Email"/>
            <s:password name="password" label="Password"/>
            <s:textfield name="mobno" label="Mobile No"/>
            <s:submit value="Save"/>
        </s:form>
    </body>
</html>
