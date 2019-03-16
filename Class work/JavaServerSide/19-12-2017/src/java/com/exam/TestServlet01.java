package com.exam;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String adminEmail = getServletContext().getInitParameter("adminEmail");
        String adminMobile = getServletContext().getInitParameter("adminMobile");
        req.setAttribute("st", adminEmail);
        req.setAttribute("st1", adminMobile);
        RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
        rd.forward(req, res);
    }
}
