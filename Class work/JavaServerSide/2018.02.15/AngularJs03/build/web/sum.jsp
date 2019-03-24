<%-- 
    Document   : sum
    Created on : Feb 19, 2018, 5:59:03 PM
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
        <table>
            <tr>
                <td>Number 01</td>
                <td><input type="text" id="d1"/></td>
            </tr>
            <tr>
                <td>Number 02</td>
                <td><input type="text" id="d2"/></td>
            </tr>
            <tr>
                <td>Click on it</td>
                <td><input type="submit" value="DO SUM" id="d3" onclick="f1()"/></td>
            </tr>
            <tr>
                <td>Result</td>
                <td>{{result}}</td>
            </tr>
        </table>
        
        <script>
            int num1=Integer.parseInt(request.getElementById("d1")).value;
            int num2=Integer.parseInt(request.getElementById("d2")).value;
            
             var m1=angular.module("a", []);
              m1.controller("con", function ($scope){
                  $scope.f1=function(){
                      $scope.result=num1+num2;
                      
                  }
                
                
            });
        </script>
    </body>
</html>
