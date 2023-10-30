package com.example.helloapp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello my first servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        out.println("<html><body>");
        out.println("<h1> Id:" + id + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}