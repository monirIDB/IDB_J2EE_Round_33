<%-- 
    Document   : two_a_binding
    Created on : Feb 18, 2018, 7:00:31 PM
    Author     : l2pc207e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="mamun">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js" type="text/javascript"></script>
    </head>
    <body>

        <input type="text" ng-model="var1"/>
        <input type="text" value="{{var1}}"/>
        <p>{{var1}}</p>
        <script>
            var m1 = angular.module("a", []);
            m1.controller("mamun", function ($scope){
                $scope.var1="Dhaka";
           });
        </script>
    </body>
</html>
