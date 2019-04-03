<%-- 
    Document   : showdata
    Created on : Dec 9, 2017, 6:55:55 PM
    Author     : Apcl 208
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="exam.java.Student1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="st" class="impl.AllMethod" scope="request"/>
        <%
            ArrayList<Student1> s=st.findAllProduct();
            
        %>
        <table>
        
       <% for(Student1 as : s) {%>
        <tr>
            <td><%=as.getId()%></td>
        </tr>   
           <%}%>
        </table>
    </body>
</html>
