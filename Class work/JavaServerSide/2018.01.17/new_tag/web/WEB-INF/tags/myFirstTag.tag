<%-- 
    Document   : myFirstTag
    Created on : Jan 17, 2018, 7:10:39 PM
    Author     : l2pc208e
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="message"%>
<%
out.println("monir");
%>
<%-- any content can be specified here e.g.: --%>
<h2>${message}</h2>