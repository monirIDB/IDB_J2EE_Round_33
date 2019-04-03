

<%@page import="impl.AllMethod"%>
<%@page import="util.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="st" class="impl.AllMethod" scope="request"/>

        <%
            int s1 = Integer.parseInt(request.getParameter("id"));
            String s2 = request.getParameter("name");
            String s3 = request.getParameter("email");
            String s4 = request.getParameter("phone");
            String s5 = request.getParameter("address");
        %>
        <%
            Student s=new Student(s1, s2, s3, s4, s5);
            AllMethod am=new AllMethod();
            boolean i=am.doSave(s);
            if(i){
            out.print("Data is saved");
            }else{
            out.print("Data  saved failed");
            }
            
        
        %>
    </body>
</html>
