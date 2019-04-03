package com.test.bd;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        ArrayList<Student> list=new ArrayList<>();
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        Student s1=new Student(id, name, email);
        Student s2=new Student(100, "Mamon", "mamon@gmail.com");
        Student s3=new Student(101, "Monir", "monir@gmail.com");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        req.setAttribute("st", list);
        RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
