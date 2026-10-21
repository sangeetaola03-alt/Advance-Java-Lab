package com.servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {
            req.getSession().setAttribute("user", username);
            res.sendRedirect("home");
        } else {
            res.sendRedirect("index.html?error=1");
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.sendRedirect("index.html");
    }
}
