<%-- 
    Document   : sumOfTwoNumbers
    Created on : Feb 18, 2018, 3:40:36 PM
    Author     : l2pc207e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="mamun">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js"></script>
    </head>
    <body id="m">
        Number1=<input type="text" id="b"/>
        Number2=<input type="text" id="c"/><br/>

        <input type="submit" value="SUM" ng-click="f1()"9/>
        Summation of Two Number is={{x3}}
        
        <br/><input type="submit" value="SUBT" ng-click="f2()"/>
       Subtraction of Two Number is={{x4}}
        
        <br/><input type="submit" value="Multiplication" ng-click="f3()"/>
        Multiplication of Two Number is={{x5}}
        
        <br/><input type="submit" value="Division" ng-click="f4()"/>
        Division of Two Number is={{x6}}
        
        <br/>Value Clear Button=<input type="submit" value="Clear" ng-click="f5()"/>
        <script>
                    var m1 = angular.module("a", []);
                    m1.controller("mamun", function ($scope) {
                        $scope.f1 = function () {
                            $scope.x1 = parseInt(document.getElementById("b").value);
                            $scope.x2 = parseInt(document.getElementById("c").value);
                            $scope.x3 = $scope.x1 + $scope.x2;
                            document.getElementById("m").style.backgroundColor = "pink";
                        };
                         $scope.f2 = function () {
                            $scope.x11 = parseInt(document.getElementById("b").value);
                            $scope.x22 = parseInt(document.getElementById("c").value);
                            $scope.x4 = $scope.x11 - $scope.x22;
                            document.getElementById("m").style.backgroundColor = "pink";
                        };
                         $scope.f3 = function () {
                            $scope.x12 = parseInt(document.getElementById("b").value);
                            $scope.x23 = parseInt(document.getElementById("c").value);
                            $scope.x5 = $scope.x12 * $scope.x23;
                            document.getElementById("m").style.backgroundColor = "pink";
                        };
                         $scope.f4 = function () {
                            $scope.x13 = parseInt(document.getElementById("b").value);
                            $scope.x24 = parseInt(document.getElementById("c").value);
                            $scope.x6= $scope.x13 / $scope.x24;
                            document.getElementById("m").style.backgroundColor = "pink";
                        };

                        $scope.f5 = function () {
                            var x1 = document.getElementById("b").value = null;
                            var x2 = document.getElementById("c").value = null;
                            document.getElementById("m").style.backgroundColor = "green";
                        };
                    }
                    );
        </script>
    </body>
</html>
