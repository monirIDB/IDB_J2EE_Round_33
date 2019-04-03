
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <style>
            a{text-decoration: blue}
            table tr:nth-child(odd){background-color: #fda;}
            table td:nth-child(odd){background-color: activeborder;}
            tr,table,td{alignment-adjust: central; padding: 10px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}
        </style>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="POST" action="query.jsp">
            <fieldset >
                <legend align="center" >Student Registration Form</legend>
                <table>

                    <tr>
                        <td>User Name </td><td> : </td><td> <input type="text" size="30" name="user"/></td>
                    </tr>
                    <tr>
                        <td>Password </td><td> : </td><td> <input type="password" size="30" name="password"/></td>
                    </tr>
                    <tr>
                        <td>  </td><td>  </td><td> <input type="submit" value="Submit"></td>
                    </tr>
                    <tr>
                        <td>  </td><td>  </td><td> <a href="index.html"><input type="button" value="Create New Account"></a></td>
                    </tr>




                </table>

            </fieldset>

        </form>

    </body>
</html>
