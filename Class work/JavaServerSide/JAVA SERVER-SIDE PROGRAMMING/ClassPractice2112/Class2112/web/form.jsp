<%-- 
    Document   : form
    Created on : Dec 21, 2017, 4:53:02 PM
    Author     : Apcl 208
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="reqperson" class="com.exam.Person" scope="session"/>
        <form method="POST" action="result.jsp">
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
                    <td><input type="text" name="email"/></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>:</td>
                    <td><input type="text" name="address"/>
                    </td></tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td><input type="submit" value="Submit"/></td>
                </tr>

            </table>
        </form>
    </body>
</html>
