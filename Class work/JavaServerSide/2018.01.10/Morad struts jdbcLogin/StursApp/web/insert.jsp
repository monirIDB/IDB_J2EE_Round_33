<%-- 
    Document   : insert
    Created on : Feb 4, 2018, 5:58:44 PM
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
        <form action="inserted">
            <table>
                <tr>
                    <td>First Name</td>
                    <td>:</td>
                    <td><input type="text" name="firstname"/></td>
                </tr>
                
                <tr>
                    <td>Last Name</td>
                    <td>:</td>
                    <td><input type="text" name="lastname"/></td>
                </tr>
                
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
                    <td><input type="submit" value="Submit"></td>
                </tr>
                
            </table>
        </form>
    </body>
</html>
