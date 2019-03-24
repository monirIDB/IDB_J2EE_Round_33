<%-- 
    Document   : angularService
    Created on : Feb 19, 2018, 5:04:25 PM
    Author     : l2pc211e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="con">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        {{myloc}}
        <script>
            var m1=angular.module("a", []);
            m1.controller("con", function ($scope, $location, $timeout){
                $scope.myloc=$location.absUrl();
                $timeout(function (){$scope.myloc='Earth';},3000);
                $timeout(function (){$scope.myloc='Bangladesh';},6000);
                $timeout(function (){$scope.myloc='Dhaka';},9000);
                $timeout(function (){$scope.myloc='BUET';},12000);
                $timeout(function (){$scope.myloc='Smrity Hall';},15000);
                $timeout(function (){$scope.myloc='3212';},18000);
                $timeout(function (){$scope.myloc='Monir';},21000);
                $timeout(function (){$scope.myloc='GO';},24000);
                
            });
        </script>
    </body>
</html>
