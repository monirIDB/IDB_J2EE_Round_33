<%-- 
    Document   : searchStdId
    Created on : Dec 10, 2017, 3:32:21 PM
    Author     : apcl 203
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.pojo.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style> table,tr,td,th{border: 1px solid black;border-collapse: collapse; margin:0px auto;margin-top: 100px;} </style>
    </head>
    <body>
         <form method="POST" action="searchStdId.jsp">
                <table>
                    <tr>
                        <td>ID</td>
                        <td>:</td>
                        <td><input type="text" name="t1"></input></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td><input type="submit" value="Search"></input></td>
                    </tr>

                </table>
        </form>
        <jsp:useBean id="si" class="com.exam.DatabaseCRUD" scope="request"/>
        <%
         int id = Integer.parseInt(request.getParameter("t1"));
         Student s=si.findStudentById(id);
        %>
        <table>
            <tr>
                <td><%=s.getId()%></td>
                <td><%=s.getName()%></td>
                <td><%=s.getPass()%></td>
                <td><%=s.getEmail()%></td>
                <td><%=s.getGender()%></td>
            </tr>
        </table>
        
    </body>
</html>
