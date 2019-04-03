<%-- 
    Document   : newRegistration
    Created on : Dec 14, 2017, 4:09:25 PM
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
       <form method="POST" action ="query.jsp">
            <fieldset>
                <legend>  Registration Page   </legend>
                <table>  
                    <tr>  
                        <td>ID</td>
                        <td>:</td>
                        <td>
                            <input type="text" name="t1"/>
                        </td>
                    </tr>
                      <tr>  
                        <td>Name</td>
                        <td>:</td>
                        <td>
                            <input type="text" name="t2"/>
                        </td>
                    </tr>
                      <tr>  
                        <td>Email</td>
                        <td>:</td>
                        <td>
                            <input type="email" name="t3"/>
                        </td>
                    </tr>
                       <tr>  
                        <td>Password</td>
                        <td>:</td>
                        <td>
                            <input type="password" name="t4"/>
                        </td>
                    </tr>
                      <tr>  
                        <td>MobileNo</td>
                        <td>:</td>
                        <td>
                            <input type="text" name="t5"/>
                        </td>
                    </tr>
                       <tr>  
                    
                        <td>
                            <input type="submit" value="save" name="t6"/>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
