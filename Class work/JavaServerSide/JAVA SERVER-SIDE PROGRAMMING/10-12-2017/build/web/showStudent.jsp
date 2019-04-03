<%-- 
    Document   : showStudent
    Created on : Dec 10, 2017, 3:31:58 PM
    Author     : apcl 203
--%>

<%@page import="com.pojo.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style> table,tr,td,th{border: 1px solid black;border-collapse: collapse; margin:0px auto;margin-top: 100px;} </style>

    </head>
    <body>
        <jsp:useBean id="sh" class="com.exam.DatabaseCRUD" scope="request"/>
        <%
            ArrayList<Student> allstu = sh.findAllStudent();
        %>
        <table>
            <% for (Student s : allstu) {%>
            <tr>
                <td><%=s.getId()%></td>
                <td><%=s.getName()%></td>
                <td><%=s.getPass()%></td>
                <td><%=s.getEmail()%></td>
                <td><%=s.getGender()%></td>
                <% }%>
            </tr>
        </table>
            <form action="y.jsp">
                <input type="text" name="r1"/>
                <input type="submit" value="go"/>
            </form>
           
    </body>
</html>
