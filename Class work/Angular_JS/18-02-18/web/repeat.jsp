<%-- 
    Document   : repeat
    Created on : Feb 18, 2018, 5:40:36 PM
    Author     : l2pc207e
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="angular.min.js" type="text/javascript"></script>
        <style>
            table,tr,td,th{border: 2px solid #ffffff; border-collapse: collapse; height: 50px; width: 100px; text-align: center;
            padding: 3px;background-color: graytext;
            };
        </style>
    </head>
    <body>
        <p ng-init="student=[{name:'Mamun', id:'101',round:'33',email:'mamundsndk@gmail.com',phone:'01532738700'},
            {name:'Mamun', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Monir', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Alamin', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Shibli', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Anisur Rahaman', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Morad', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Rahim', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Ashraf', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Polash', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            {name:'Biplob', id:'101', round:'33', email:'mamundsndk@gmail.com', phone:'01532738700'
            }
            ,
            ]"></p>

        <table align="center">
            <tr>
                <th>Name</th>
                <th>ID</th>
                <th>Round</th>
                <th>Email</th>
                <th>Phone</th>
            </tr>
            
       


        <tr ng-repeat="x1 in student| limitTo:10 "><!--Limit Dewar Jonnow-->
            <td>{{x1.name}}</td> 
            <td>{{x1.id}}</td> 
            <td>{{x1.round}}</td> 
            <td>{{x1.email}}</td> 
            <td>{{x1.phone}}</td> 
        </tr>
    </table>
</body>
</html>
