<%@page import="java.util.ArrayList"%>
<%@page import="impl.Student"%>
<%@page import="util.AllMethod"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
      <style>
          caption{ background-color: buttonface}
          fieldset{float: left;}
           a{text-decoration: blue}
            table tr:nth-child(odd){background-color: #fda;}
            table td:nth-child(odd){background-color: activeborder;}
            tr,table,td{alignment-adjust: central; padding: 5px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}
        </style>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="POST" action="save.jsp">
            <fieldset f >
                <legend align="center" >Student Registration Form</legend>
                <table>
                    <tr>
                        <td>ID</td><td>: </td><td> <input type="text" size="30" name="id"/></td>
                    </tr>
                    <tr>
                        <td>Name</td><td> : </td><td><input type="text" size="30" name="name"/></td>
                    </tr>

                    <tr>
                        <td>password </td><td> : </td><td> <input type="password" size="30" name="password"/></td>
                    </tr>
                    <tr>
                        <td> Email</td><td> : </td><td> <input type="text" size="30" name="email"/></td>
                    </tr>

                    <tr>
                        <td>Gender </td><td> : </td><td>Male <input type="radio" value="Male" name="gender"/>Female<input type="radio" value="Female" name="gender"/></td>
                    </tr>
                      <tr>
                          <td>  </td><td>  </td><td> <a href="allstudent.jsp"><input type="button" value="Show All Student"></a></td>
                    </tr>
                      <tr>
                          <td>  </td><td>  </td><td> <a href="onestudent.html"><input type="button" value="Show All Student by ID"></a></td>
                    </tr>

                    <tr>
                        <td>  </td><td>  </td><td> <input type="submit" value="Go"></td>
                    </tr>

                </table>

            </fieldset>

        </form>
         <jsp:useBean id="st" class="util.AllMethod" scope="request"></jsp:useBean>
      
        <%   AllMethod a = new AllMethod();
            ArrayList<Student> all = a.findAllStudent();

        %>
        <table>
            <caption background>Student Information </caption>
             <tr>
                 <th>ID</th>
                 <th>Name</th>
               
                 <th>Password</th>
                 <th>Email</th>
                 <th>Gender</th>
             </tr>
            <%for (Student atf : all) {%>
                 
            <tr>
                <td><%=atf.getId()%></td>
                <td><%=atf.getName()%></td>
                <td><%=atf.getPassword()%></td>
                <td><%=atf.getEmail()%></td>
                <td><%=atf.getGender()%></td>

            </tr>


            <% }
            %>
        </table>    
    </body>
</html>
