

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="">
    <head>
        <script src="js/angular.min.js"></script>
    </head>
    <body>
        <h1 style="margin-left: 46%;color: red"><i>AngularJs :</i> </h1>
        <fieldset>
             <legend style="margin-left: 44%"><h1>Auto Show Output : </h1></legend>
        Id : <input type="text" ng-model="v1"/>
        output :<input type="text" value="{{v1}}"/>
        <br> 
        Name : <input type="text" ng-model="v2"/>
        output :<input type="text" value="{{v2}}"/>
        </fieldset>
        <hr>
        <fieldset>
            <legend style="margin-left: 45%"><h1>Calculation : </h1></legend>
        Number 1 : <input type="number" ng-model="a1"/>
        Number 2 : <input type="number" ng-model="a2"/>
        <br>
        Sum Is :<input type="text" value="{{a1+a2}}"/>
        subtraction is :<input type="text" value="{{a1-a2}}"/>
        Multiple is :<input type="text" value="{{a1*a2}}"/>
        Divided is :<input type="text" value="{{a1/a2}}"/>
        </fieldset>
        <hr>
        <fieldset>
            <legend><h3>Field ar value initialization kore deyar Jonno</h3></legend>
            Name : <input type="text" ng-bind="b1=100"/> {{ b1}}
            <br>
            Name : <input type="text" ng-bind="b2='Rahim'"/>{{ b2}}
            <hr>
            Name : <input type="text" ng-init="First_name='Abdur';Last_name='Rahim'"/>
            {{First_name}} {{Last_name}}
        </fieldset>
    </body>
</html>
