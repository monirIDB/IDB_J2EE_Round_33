<%-- 
    Document   : array3
    Created on : Feb 18, 2018, 6:39:40 PM
    Author     : l2pc210e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="con1">
    <head>
        <script src="js/angular.min.js" type="text/javascript"></script>
        <style>
           table,th,tr,td{border: 1px solid green;border-collapse: collapse;padding: 10px;background-color: aqua}
        </style>
    </head>
    <body> 
        <h1>Scope hote value ana</h1>
        <table> 
             <caption><h2 style="margin-left: 10%; color: red">Student Information:</h2></caption>
                <th>id</th>
                <th>name</th>
                <th>Round</th>
            <tr ng-repeat="z in students">   
                <td>{{z.id}}</td>        
                <td>{{z.name}}</td>        
                <td>{{z.Round}}</td>                  
            </tr>
        </table>
        <script>
            var m1 = angular.module("a", []);
            m1.controller("con1", function($scope){
            $scope.students = [{id:'100', name:'rahim', Round:'33'},
            {id:'100', name:'rahim', Round:'33'},
            {id:'100', name:'rahim', Round:'33'},
            {id:'100', name:'rahim', Round:'33'}]
        });
        </script>
    </body>
</html>
