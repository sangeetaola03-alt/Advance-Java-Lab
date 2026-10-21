package com.servlet;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        HttpSession session = req.getSession(false);

        if (session == null || session.getAttribute("user") == null) {
            res.sendRedirect("index.html");
            return;
        }

        res.setContentType("text/html");
        res.getWriter().println(
            "<html><body><h1>Welcome, "
            + session.getAttribute("user")
            + "</h1><p>Login successful.</p>"
            + "<a href='logout'>Logout</a></body></html>");
    }
}
