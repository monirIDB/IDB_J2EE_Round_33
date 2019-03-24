<%-- 
    Document   : eventTextField
    Created on : Feb 19, 2018, 6:34:19 PM
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
                <td><input type="submit" value="Go" ng-click="f()"/></td>
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
            <tr>
                <td>Checkbox</td>
                <td><input type="checkbox" value="Football" ng-model="v1"/>FootBall</td>
            </tr>
            <tr>
                <td><input type="radio" ng-model="v2" value="Java"/>Java</td>
                <td><input type="radio" ng-model="v2" value="HTML"/>HTML</td>
                <td><input type="radio" ng-model="v2" value="CSS"/>CSS</td>
                <td><input type="radio" ng-model="v2" value="WPSI"/>WPSI</td>
                
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td><select ng-model="v3">
                        <option value="Pen">Pen</option>
                        <option value="BOOk">book</option>
                        <option value="PC">pc</option>
                        <option value="MOucs">mopucs</option>
                        <option value="Key">key</option>
                    </select></td>
                <td></td>
                <td></td>
            </tr>
        </table>
        
        {{v3}}
        <script>
            var m=angular.module("a",[]);
            m.controller("c",function ($scope){
                $scope.v1=true;
                $scope.v2=true;
                $scope.v3="Pen";
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

