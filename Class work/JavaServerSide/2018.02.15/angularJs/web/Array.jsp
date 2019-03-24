<%-- 
    Document   : Array
    Created on : Feb 18, 2018, 4:30:36 PM
    Author     : l2pc210e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="">
    <head>
        <script src="js/angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        <input type="text" ng-init="x = 'Bangla';y = 'Dhaka'"/>
        <input type="text" ng-init="a = [1, 2, 3, 4, 5, 6,7,8,9,10 ]"/>
        {{a[0]}}<br>
        {{x}}
        <br><br>
        <input type="text" ng-init="Student={name:'Rahim',id:'100',Round:'J2EE'}"/>

        {{Student.name}},
        {{Student.id}},
        {{Student.Round}}
    </body>
</html>
