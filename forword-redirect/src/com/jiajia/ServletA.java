package com.jiajia;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/servleta")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("A获得参数："+name);
        System.out.println("servletA执行了");
//        RequestDispatcher se = req.getRequestDispatcher("servletb");
//        请求转发步骤
//        1：获得请求转发器 getRequestDispatcher
        RequestDispatcher se = req.getRequestDispatcher("WEB-INF/a.html");
//        a.html       sta/a.html

//        2:请求转发器做出转【发动】作
        se.forward(req,resp);
    }
}
