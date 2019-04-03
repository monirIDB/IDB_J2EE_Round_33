
<%@page import="java.util.ArrayList"%>
<%@page import="util.Student"%>
<%@page import="impl.AllMethod"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table tr:nth-child(odd){background-color: #fda;}
            table td:nth-child(odd){background-color: cyan;}
            tr,table,td{alignment-adjust: central; padding: 10px;border-collapse: collapse;border-color: crimson;}</style>
    </head>
    <body>
        <jsp:useBean id="st" class="util.Student" scope="request"/>
        <%
            AllMethod am = new AllMethod();
            ArrayList<Student> std = am.findAllStudent(); %>
        <table>
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Email</td>
                <td>Phone</td>
                <td>Address</td>
            </tr>
            <%for (Student e : std) {%>

            <tr>
                <td><%out.print(e.getId());%></td>
                <td><%out.print(e.getName());%></td>
                <td><%out.print(e.getEmail());%></td>
                <td><%out.print(e.getPhone());%></td>
                <td><%out.print(e.getAddress());%></td>
            </tr>

             <%  }
        %>
        </table>

      
    </body>
</html>
