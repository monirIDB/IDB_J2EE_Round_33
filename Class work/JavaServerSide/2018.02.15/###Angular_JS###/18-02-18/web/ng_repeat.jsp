<%-- 
    Document   : ng_repeat
    Created on : Feb 18, 2018, 5:23:54 PM
    Author     : l2pc207e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        <p ng-init="student={name:'Mamun', id:'101',round:'33'}"></p>
        <table>
            <tr ng-repeat="x1 in student">
                <td>{{x1}}</td> 
            </tr>
        </table>
    </body>
</html>
