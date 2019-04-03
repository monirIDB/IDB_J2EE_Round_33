

<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.exam.Student"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="st" class="com.exam.DatabaseCURD" scope="request" />
        <%
            String name = "";
            String email = request.getParameter("t1");
            String password = request.getParameter("t2");

            Student s = st.findStudentByEmail(email, password);
            if (s != null) {
                name =" Welcome" +(s.getName());
            }else{
                response.sendRedirect("newRegistrationpage.jsp");
            }

        %>

    </body>
</html>
