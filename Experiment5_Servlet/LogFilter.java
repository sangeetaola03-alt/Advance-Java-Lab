package com.servlet;
import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LogFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain)
            throws IOException, ServletException {
        System.out.println("Request intercepted: " +
            ((HttpServletRequest) req).getRequestURI());
        chain.doFilter(req, res);
        System.out.println("Response completed");
    }
}