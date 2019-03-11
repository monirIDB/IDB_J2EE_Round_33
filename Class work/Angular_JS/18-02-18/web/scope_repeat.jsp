<%-- 
    Document   : scope_repeat
    Created on : Feb 18, 2018, 6:29:04 PM
    Author     : l2pc207e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="a" ng-controller="mamun">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js" type="text/javascript"></script>
    </head>
    <body>
        <table>
            <tr ng-repeat="x1 in student| limitTo:10 ">
                <td>{{x1.name}}</td> 
                <td>{{x1.id}}</td> 
                <td>{{x1.round}}</td> 
                <td>{{x1.email}}</td> 
                <td>{{x1.phone}}</td> 
            </tr>
        </table>
        <script>
                    var m1 = angular.module("a", []);
                    m1.controller("mamun", function ($scope) {
                        $scope.student = [
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'},
                            {name: 'Mamun', id: '101', round: '33', email: 'mamundsndk@gmail.com', phone: '01532738700'}

                        ];
                    }
                    );
        </script>
    </body>
</html>
