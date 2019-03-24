<%-- 
    Document   : output_other_field
    Created on : Feb 17, 2018, 6:34:54 PM
    Author     : l2pc207e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="control1">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js"></script>
    </head>
    <body>
       Num1= <input type="text" id="a1"/></br>
        Num1=  <input type="text" id="a2"/></br>

        <input type="submit" value="GO" ng-click="f1()"/></br>


        <h1>Output is:<span id="c1">{{x3}}</span></h1>
        <script>
            var m1 = angular.module("a", []);
            m1.controller("control1", function ($scope) {
                $scope.f1 = function () {
                    $scope.x1 = parseInt(document.getElementById("a1").value);
                    $scope.x2 = parseInt(document.getElementById("a2").value);

                    $scope.x3 = $scope.x1 + $scope.x2;
                    $scope.f = document.getElementById("c1").style.backgroundColor = "red";
                };

            });
        </script>

    </body>
</html>
