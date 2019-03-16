package com.exam;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String adminEmail=getServletContext().getInitParameter("adminEmail");
        String adminMobile=getServletContext().getInitParameter("adminMobile");
        String version=getInitParameter("Monir");
        req.setAttribute("st",adminEmail);
        req.setAttribute("st1",adminMobile);
        req.setAttribute("st2",version);
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
