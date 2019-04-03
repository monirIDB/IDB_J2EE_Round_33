package com.test;

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

public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//        ArrayList<Student> list = new ArrayList<>();
        String name=getServletContext().getInitParameter("name");
        String email=getServletContext().getInitParameter("email");
//        int id = Integer.parseInt(req.getParameter("id"));
//        String name = req.getParameter("name");
//        String password = req.getParameter("password");
//        String email = req.getParameter("email");
//        String gender = req.getParameter("gender");
//
//        Student s1 = new Student(id, name, password, email, gender);
//        Student s2=new Student(100, "Mamon", "mamon@gmail.com");
//        Student s3=new Student(101, "Monir", "monir@gmail.com");
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "apcl123456");
//            PreparedStatement pstm = con.prepareStatement("select * from student4");
//            ResultSet rs = pstm.executeQuery();
//            while (rs.next()) {
//                Student s = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
//                list.add(s);
//            }
//
//        } catch (Exception e) {
//
//        }
////        list.add(s1);
//
//        req.setAttribute("st", list);
        req.setAttribute("st1", name);
        req.setAttribute("st2", email);
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
