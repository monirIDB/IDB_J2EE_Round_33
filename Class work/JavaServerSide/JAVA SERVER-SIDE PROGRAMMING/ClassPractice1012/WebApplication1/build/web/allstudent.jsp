
<%@page import="java.util.ArrayList"%>
<%@page import="impl.Student"%>
<%@page import="util.AllMethod"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        
        </style>
    </head>
    <body>
        <jsp:useBean id="st" class="util.AllMethod" scope="request"></jsp:useBean>
      
        <%   AllMethod a = new AllMethod();
            ArrayList<Student> all = a.findAllStudent();

        %>
        <table>

            <%for (Student atf : all) {%>
                 
            <tr>
                <td><%=atf.getId()%></td>
                <td><%=atf.getName()%></td>
                <td><%=atf.getPassword()%></td>
                <td><%=atf.getEmail()%></td>
                <td><%=atf.getGender()%></td>

            </tr>


            <% }
            %>
        </table>        
    </body>
</html>
