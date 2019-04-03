<%-- 
    Document   : text
    Created on : Dec 20, 2017, 5:42:57 PM
    Author     : Apcl 208
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>body,td{font-family: verdana;font-size: 10pt}</style>
    </head>
    <body>
        <h1>EL and Text template</h1>
       <table border="1">
           <tr>
               <td colspan="2">Hello ${param['name']}
                   
               </td>
           </tr>
            <tr>
            <form action="text.jsp" method="post">
                <td><input type="text" name="name"/></td>
                <td><input type="submit" value="Submit"</td>
            </form>
           </tr>
       </table>
    </body>
</html>
