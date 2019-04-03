


<%@page import="util.AllMethod"%>
<%@page import="impl.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="st" class="util.AllMethod" scope="request"></jsp:useBean>

        <%
            int s1 = Integer.parseInt(request.getParameter("id"));
            String s2 = request.getParameter("name");
            String s3 = request.getParameter("password");
            String s4 = request.getParameter("email");
            String s5 = request.getParameter("gender");
        %>
        <%
            Student s = new Student(s1, s2, s3, s4, s5);
            AllMethod a = new AllMethod();
            boolean i = a.doSave(s);
            if (i) {
                out.print("Data is saved");
            } else {
                out.print("Data  saved failed");
            }

             response.sendRedirect("show.jsp");
        %>
    </body>
</html>
