<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="conn.ConnectDB"%>
<%@page import="impl.Student"%>
<%@page import="util.AllMethod"%>
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
            table td:nth-child(odd){background-color: blue;}
            tr,table,td{alignment-adjust: central; padding: 10px;border:1px solid chartreuse;border-collapse: collapse;border-color: crimson;}
        </style>
    </head>
    <body>
        <jsp:useBean id="st" class="util.AllMethod" scope="request"></jsp:useBean>

        <%
          String a =request.getParameter("name");
           
            ConnectDB cd = new ConnectDB();
            Connection con = null;
            PreparedStatement pstm = null;
            ResultSet rs ;
            int b=0;
            String c="";
            String d="";
            String e="";
            String f="";
            try {

                con = cd.doConnect();
                pstm = con.prepareStatement("select * from student4 where name=?");
                pstm.setString(1, a);
                rs = pstm.executeQuery();
                while (rs.next()) {
                     b=rs.getInt(1);
                     c=rs.getString(2);
                     d=rs.getString(3);
                     e=rs.getString(4);
                     f=rs.getString(5);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    pstm.close();
                    con.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

        %>
        <table>
            <tr>
                <td><%=b%></td>
                <td><%=c%></td>
                <td><%=d%></td>
                <td><%=e%></td>
                <td><%=f%></td>
            </tr>
        </table>

        <form method="POST" action="sameshowbyid.jsp">
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

