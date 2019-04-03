package com.apress.projsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {

    public void init(ServletConfig sc) throws ServletException {
        super.init(sc);
        log("My servlet initialized at:" + new Date());

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>BasicServlet</title></head>");
        out.println("<body><h2>" + getServletName() + "</h2>");
        out.println("This is a basic Servlet.</br>");
        out.println("</hr></body></html>");
        out.close();
    }    
        public void destroy(){
            log("My servlet aat destroyed at :+"+ new Date());
        }
}
