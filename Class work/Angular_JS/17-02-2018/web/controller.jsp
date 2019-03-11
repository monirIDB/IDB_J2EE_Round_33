<%-- 
    Document   : controller
    Created on : Feb 17, 2018, 5:57:23 PM
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
        <div>
              Country is={{country}}<br/> 
              Language is={{language}}  
        </div>
        <script>
            var m1=angular.module("a",[]);
            m1.controller("control1",function ($scope){
              $scope.country="Bangladesh";
              $scope.language="Bangla";
                
               
            });
        </script>
    </body>
</html>
