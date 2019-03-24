<%-- 
    Document   : array2.1
    Created on : Feb 19, 2018, 3:29:21 PM
    Author     : l2pc210e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="con">
    <head>
        <script src="js/angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        <table>
            <tr ng-repeat="s in students| orderBy:'name' | limitTo:2">
                <td>{{s.name | uppercase}}</td>
                <td>{{s.District | lowercase}}</td>
                <td>{{s.Fee | currency}}</td>
            </tr>
        </table>

        <script>
                    var m = angular.module("a", []);
                    m.controller("con", function ($scope) {
                        $scope.students = [{name: 'rahim', District: 'Dhaka', Fee: '100'},
                            {name: 'Hasan', District: 'Bogra', Fee: '100'},
                            {name: 'Runa', District: 'Vhola', Fee: '100'},
                            {name: 'mannan', District: 'Dinajpur', Fee: '100'}]

                    });
        </script> 
    </body>
</html>
