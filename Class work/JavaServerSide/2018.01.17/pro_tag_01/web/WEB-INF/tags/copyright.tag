<%-- 
    Document   : copyright
    Created on : Jan 18, 2018, 5:14:49 PM
    Author     : l2pc208e
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>

<%
    out.println("Copyright 2005, Apress");
%>
<%-- any content can be specified here e.g.: --%>
<h1>${message}</h1>