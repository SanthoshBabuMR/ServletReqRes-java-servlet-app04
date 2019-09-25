package com.babusa.learn;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GenerateStandaloneHTMLPageServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("data", "Created using servlet data");
        req.getRequestDispatcher("/standalonepage.jsp").forward(req, res);
    }
}
