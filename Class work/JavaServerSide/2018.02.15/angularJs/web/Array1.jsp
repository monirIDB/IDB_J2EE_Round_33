<%-- 
    Document   : Array1
    Created on : Feb 18, 2018, 5:10:22 PM
    Author     : l2pc210e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="">
    <head>
        <style>
            table,tr,td{border: 1px solid red;border-collapse: collapse;padding: 10px}
            
        </style>
        <script src="js/angular.min.js" type="text/javascript"></script>
    </head>
    <body>
         <input type="text" ng-init="x = 'Bangla';y = 'Dhaka'"/>
        <input type="text" ng-init="a = [1, 2, 3, 4, 5, 6,7,8,9,10 ]"/>
         <input type="text" ng-init="Student={name:'Rahim',id:'100',Round:'J2EE'}"/>
        
        <table>     
                <tr ng-repeat="x in a">
                    <td>{{x}}</td>        
                </tr>    
        </table>
         
        <ul>
            <li ng-repeat="x in a">{{x}}</li>
        </ul>
         <ul>
            <li ng-repeat="x in Student">{{x}}</li>
        </ul>
          
        <ol>
             <li ng-repeat="x in a">{{x}}</li>
        </ol>
    </body>
</html>
