
<%@page import="java.util.ArrayList"%>
<%@page import="util.Student"%>
<%@page import="impl.AllMethod"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table tr:nth-child(odd){background-color: #fda;}
            table td:nth-child(odd){background-color: blue;}
            tr,table,td{alignment-adjust: central; padding: 10px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}</style>
    </head>
    <body>
        <jsp:useBean id="st" class="util.Student" scope="request"/>
        <%
        int a= Integer.parseInt(request.getParameter("id"));
        %>
        <% 
            AllMethod am=new AllMethod();
           Student s= am.findStudentBy(a); %>
            
          
             <table>
           <tr>
               <td><%out.print(s.getId());%></td>
               <td><%out.print(s.getName());%></td>
               <td><%out.print(s.getEmail());%></td>
               <td><%out.print(s.getPhone());%></td>
               <td><%out.print(s.getAddress());%></td>
           </tr>
                
                
            </table>
                    
            
    </body>
</html>
