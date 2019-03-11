<%-- 
    Document   : ng-init
    Created on : Feb 18, 2018, 4:30:56 PM
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
        
        <p ng-init="a1=[1,2,3,4,5,6]"></p>
        <p>{{a1[0]}}</p>
        
        <p ng-init="student={name:'Mamun',id:'100',round:'J2EE-33'}"</p>
            <!--Name is={{student.name}}<br/>
            ID is={{student.id}}<br/>
            Round is={{student.round}}<br/>-->
            
            <table>
                <tr ng-repeat="x1 in student", "x2 in student", "x3 in student">
                    <td>{{x1}}</td>
                    <td>{{x2}}</td>
                    <td>{{x3}}</td>
                 </tr>
            </table>
            <!--<ul>
                <li></li>
                <li></li>
            </ul>-->
    </body>
</html>
