<%-- 
    Document   : newSturts
    Created on : Feb 3, 2018, 6:54:50 PM
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
        <h2>Hello World</h2>
        Sturts 2 Message:<s:property value="message" default="Guest"/>
        <s:form method="GET" action="pro_sturts/HelloStruts2World.action">
            Enter your name: <s:textfield name="userName"/>
        <s:submit value="Submit"/>
    </s:form>
    </body>
</html>
