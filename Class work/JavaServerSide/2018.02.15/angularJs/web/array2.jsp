<%-- 
    Document   : array2
    Created on : Feb 18, 2018, 5:39:28 PM
    Author     : l2pc210e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="">
    <head>
        <script src="js/angular.min.js" type="text/javascript"></script>
        <style>
            table,th,tr,td{border: 1px solid green;border-collapse: collapse;padding: 10px;background-color: aqua}
            table,th{border: 1px solid green;border-collapse: collapse;padding: 10px;background-color: green}

        </style>
    </head>
    <body>
        <fieldset>
            <div style="margin-left: 42%" ng-init="Student=[{name:'Rahim',id:'100',Round:'J2EE',Gender:'Male',DOB:'20 - 11 - 2000'},
                {name:'Hasan', id:'101', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Fatema', id:'102', Round:'J2EE', Gender:'Feale', DOB:'20-11-2000'
                },
                {name:'Hasan', id:'103', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Hasan', id:'104', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Hasan', id:'105', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Hasan', id:'107', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Hasan', id:'108', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Hasan', id:'109', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                },
                {name:'Masud', id:'110', Round:'J2EE', Gender:'Male', DOB:'20-11-2000'
                }]"/>

            <table>
                <caption><h2 style="margin-left: 10%; color: red">Student Information:</h2></caption>
                <th>Name</th>
                <th>Id</th>
                <th>Round</th>
                <th>Gender</th>
                <th>Dath of Birth</th>

                <tr ng-repeat="x in Student">
                    <td>{{x.name}}</td>        
                    <td>{{x.id}}</td>        
                    <td>{{x.Round}}</td>        
                    <td>{{x.Gender}}</td>        
                    <td>{{x.DOB}}</td>        
                </tr>
            </table>
            <ul ng-repeat="y in Student|limitTo:2"> <%--Filter korar jonno--%>
                <li>{{y.name}}</li>
                <li>{{y.id}}</li>
                <li>{{y.Round}}</li>
                <li>{{y.Gender}}</li>
                <li>{{y.DOB}}</li>
            </ul>
                <table>
                    <tr ng-repeat="m in Student | limitTo:3">
                        <td>{{m.name}}</td>
                        <td>{{m.id}}</td>
                        <td>{{m.Round}}</td>
                        <td>{{m.Gender}}</td>
                        <td>{{m.DOB}}</td>
                    </tr>
                </table>
        </div>
    </fieldset>
</body>
</html>
