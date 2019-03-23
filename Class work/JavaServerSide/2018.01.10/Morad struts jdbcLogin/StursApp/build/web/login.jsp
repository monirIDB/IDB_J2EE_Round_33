<%-- 
    Document   : login
    Created on : Feb 12, 2018, 4:31:50 PM
    Author     : l2pc214e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login">
            <table>
                <tr>
                    <td>User Name</td>
                    <td>:</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
