<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
             table tr:nth-child(odd){background-color: #fda;}
            table td:nth-child(odd){background-color: activeborder;}
            tr,table,td{alignment-adjust: central; padding: 10px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}
        </style>
    </head>
    <body>
        <form method="POST" action="oneshow.jsp">
            <fieldset >
                <legend align="center" >Student Registration Form</legend>
                <table>
                    <tr>
                        <td>ID</td><td>: </td><td> <input type="text" size="30" name="id"/></td>
                    </tr>


                    <tr>
                        <td>  </td><td>  </td><td> <input type="submit" value="Show"></td>
                    </tr>

                </table>

            </fieldset>

        </form>
        
    </body>
</html>
