
package com.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("student.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("name", request.getParameter("name"));
        request.setAttribute("email", request.getParameter("email"));
        request.setAttribute("course", request.getParameter("course"));
        request.setAttribute("age", request.getParameter("age"));
        request.setAttribute("rollNo", request.getParameter("rollNo"));

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
