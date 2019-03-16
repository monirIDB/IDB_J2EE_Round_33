package com.exam;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Student extends HttpServlet{
int x=5;
int y=6;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String adminEmail =req.getHeader("Accept-Language");
        String adminEmail01 =req.getMethod();
        req.setAttribute("st", adminEmail);
        req.setAttribute("st1", adminEmail01);
        req.setAttribute("st2", x);
        req.setAttribute("st3", y);
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
