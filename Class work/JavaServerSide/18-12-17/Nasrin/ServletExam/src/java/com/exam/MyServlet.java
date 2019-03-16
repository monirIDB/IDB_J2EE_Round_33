/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author apcl
 */
public class MyServlet extends HttpServlet {
    Connection con;
    String url="jdbc:mysql://localhost:3306/db1";
    String user="root";
    String password="apcl1234";
    PreparedStatement pstm;
    ResultSet rs;
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
        String subject=req.getParameter("t1");
        String round=req.getParameter("t2");
        ArrayList<Student> list=new ArrayList<Student>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
            pstm=con.prepareStatement("select * from stu_inf where subject=? and round=?");
            pstm.setString(1, subject);
            pstm.setString(2, round);
            rs=pstm.executeQuery();
            while (rs.next()) {                
                Student s= new Student(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(s);
            }
        }catch (Exception e) {
        }
        req.setAttribute("st", list);
        RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
