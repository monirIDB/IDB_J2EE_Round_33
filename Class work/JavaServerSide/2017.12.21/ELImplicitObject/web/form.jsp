

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <jsp:useBean id="reqperson" class="com.exam.Person" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@ page isELIgnored="true"%>
    </head>
    <body>
       
        <form method="post" action="result.jsp">
            <table>
                <tr>
                    <td>ID</td>
                    <td>:</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td>:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="text" name="Email"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="GO"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
