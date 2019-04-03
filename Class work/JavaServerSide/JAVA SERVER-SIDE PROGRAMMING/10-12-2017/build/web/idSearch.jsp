<%-- 
    Document   : idSearch
    Created on : Dec 10, 2017, 5:18:56 PM
    Author     : apcl 203
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="searchStdId.jsp">
            <fieldset>
                <legend>Student Information By Id</legend>
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
            </fieldset>
        </form>
    </body>
</html>
