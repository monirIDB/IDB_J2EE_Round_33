package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("MyServlet initialized:" + new Date());
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><title>BasicServlet</title></head>");
        out.println("<body><h2>" + getServletName() + "</h2>");
        out.println("This is Basic servlet.<br>");
        out.println("<hr></body></html>");
        out.close();
    }

    public void destroy() {
        log("My servlet was destroyed" + new Date());
    }

}
