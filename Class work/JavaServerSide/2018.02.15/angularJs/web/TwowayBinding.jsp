

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="con">
    <head>
        <script src="js/angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>NG-Model ar maddome 2 way Binding</h1>
        <input type="text" ng-model="m"/>
        <p>{{m}}</p>
        <script>
             var m1 = angular.module("a", []);
            m1.controller("con", function($scope){
            $scope.m="Dhaka";
        });
        </script>
    </body>
</html>
