<%-- 
    Document   : Controllar1
    Created on : Feb 17, 2018, 6:31:14 PM
    Author     : l2pc210e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="con1">
    <head>
        <script src="js/angular.min.js"></script>
    </head>
    <body>
        <div>
            Number 1 : <input type="text" id="d1"/><br>
            Number 2 : <input type="text" id="d2"/><br>
            <input type="submit"value="Add" ng-click="f1()"/>
            <input type="submit" value="Subtract" ng-click="f2()"/>
            <input type="submit"value="Multiple" ng-click="f3()"/>
            <input type="submit"value="Divided" ng-click="f4()"/>
            <input type="submit"value="Clear" ng-click="f5()"/>
            <h1>Output is : <input type="text" id="c1" value="{{z}}"/>{{p}}</h1>
            <h1>Output is : <textarea id="q">{{z}}</textarea>{{e}}</h1>

            <script>
                        var m1 = angular.module("a", []);
                        m1.controller("con1", function ($scope) {
                            $scope.f1 = function () {
                                var x = parseInt(document.getElementById("d1").value);
                                var y = parseInt(document.getElementById("d2").value);
                                $scope.p = document.getElementById("c1").style.backgroundColor = "red";
                                $scope.e = document.getElementById("q").style.backgroundColor = "green";
                                $scope.z = x + y;
                            };
                            $scope.f2 = function () {
                                var x = parseInt(document.getElementById("d1").value);
                                var y = parseInt(document.getElementById("d2").value);
                                $scope.p = document.getElementById("c1").style.backgroundColor = "red";
                                $scope.e = document.getElementById("q").style.backgroundColor = "green";
                                $scope.z = x - y;
                            };
                            $scope.f3 = function () {
                                var x = parseInt(document.getElementById("d1").value);
                                var y = parseInt(document.getElementById("d2").value);
                                $scope.p = document.getElementById("c1").style.backgroundColor = "red";
                                $scope.e = document.getElementById("q").style.backgroundColor = "green";
                                $scope.z = x * y;
                            };
                            $scope.f4 = function () {
                                var x = parseInt(document.getElementById("d1").value);
                                var y = parseInt(document.getElementById("d2").value);
                                $scope.p = document.getElementById("c1").style.backgroundColor = "red";
                                $scope.e = document.getElementById("q").style.backgroundColor = "green";
                                $scope.z = x / y;
                            };
                            $scope.f5 = function () {
                                var x =document.getElementById("d1").value=null;
                                var y = document.getElementById("d2").value=null;
                                 
                            };
                        });
            </script>
        </div>
    </body>
</html>
