<%-- 
    Document   : new
    Created on : Feb 17, 2018, 5:32:56 PM
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
            <h1>Country is : {{country}}</h1>
            <h1>Language is : {{language}}</h1>
        </div>

        <script>
           var m1=angular.module("a",[]);     <%--Module tairy kora hoyeche--%>
           m1.controller("con1",function($scope){
               $scope.country="Bangladesh";
               $scope.language="Bangla";                     
           });  <%--Controlar  tairy kora hoyeche--%>
           
        </script>
    </body>

</html>
