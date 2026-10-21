package com.servlet;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {
    public void init() {
        System.out.println("Servlet Initialized");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        res.setContentType("text/html");
        res.getWriter().println("<h1>Request Processed</h1>");
    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}