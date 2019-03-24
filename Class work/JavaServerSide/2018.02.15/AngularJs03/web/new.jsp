<%-- 
    Document   : new
    Created on : Feb 19, 2018, 6:13:39 PM
    Author     : l2pc211e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="c">
    <head>
        <script src="angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        <table>
            <tr>
                <td>Number 1 :</td>
                <td><input type="text" id="d1"/></td>
            </tr>
            <tr>
                <td>Number 2 :</td>
                <td> <input type="text" id="d2"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="add" ng-click="f()"/></td>
            </tr>
            <tr>
                <td>SUM</td>
                <td><input type="text" id="d3" value="{{z}}" />{{q}}</td>
            </tr>
            <tr>
                <td>SUM</td>
                <td><textarea id="d4">{{z}}</textarea>{{r}}</td>
            </tr>
            <tr>
                <td>Multiply</td>
                <td><input type="text" id="d3" value="{{ab}}" />{{q}}</td>
            </tr>
        </table>
        
        
        <script>
            var m=angular.module("a",[]);
            m.controller("c",function ($scope){
                $scope.f=function (){
                    var x=parseInt(document.getElementById("d1").value);
                    var y=parseInt(document.getElementById("d2").value);
                    $scope.q=document.getElementById("d3").style.backgroundColor="green";
                    $scope.r=document.getElementById("d4").style.backgroundColor="aqua";
                    $scope.z=x+y;
                    $scope.ab=x*y;
                };
            });
        </script>
    </body>
</html>
