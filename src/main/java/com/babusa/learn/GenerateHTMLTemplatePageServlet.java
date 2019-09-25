package com.babusa.learn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerateHTMLTemplatePageServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter out = res.getWriter();
        out.append("<body><h1>This is Generated page!!</h1></body></html>");
        req.getRequestDispatcher("/headertemplate.jsp").include(req, res);
    }
}
