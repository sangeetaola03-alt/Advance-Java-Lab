package com.servlet;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

@WebListener
public class AppListener implements ServletContextListener,
                                   HttpSessionListener {
    public void contextInitialized(ServletContextEvent e) {
        System.out.println("Application Started");
    }
    public void contextDestroyed(ServletContextEvent e) {
        System.out.println("Application Stopped");
    }
    public void sessionCreated(HttpSessionEvent e) {
        System.out.println("Session Created");
    }
    public void sessionDestroyed(HttpSessionEvent e) {
        System.out.println("Session Destroyed");
    }
}