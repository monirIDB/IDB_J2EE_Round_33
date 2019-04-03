/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.pojo.Student;
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
 * @author Ariful Islam Khokon
 */
public class TestServlet extends HttpServlet {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/db4";
    String user  = "root";
    String pass = "apcl123456";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String sub = req.getParameter("sb");
        String rdd = req.getParameter("rd");
        ArrayList<Student> al = new ArrayList<>();
        Student s1 = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url, user, pass);
            pstm = con.prepareStatement("select * from student where subject=? and round=?");
            pstm.setString(1, sub);
            pstm.setString(2, rdd);
            rs = pstm.executeQuery();
            while (rs.next()) {
             s1 = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
             al.add(s1);
                
            }
        } catch (Exception e) {
        }
        req.setAttribute("st", al);
        RequestDispatcher rds = req.getRequestDispatcher("show.jsp");
        rds.forward(req, res);
    }
    
}
