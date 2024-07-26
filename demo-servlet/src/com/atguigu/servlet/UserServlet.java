package com.atguigu.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        从request 对象中获取请求的任何信息（username参数）
        String username = req.getParameter("username");
//        处理业务的代码
        String info ="<h1>Yes</h1>";
        if("atguigu".equals(username)){
            info="No";
        }
//        将要响应的数据放入resp
        PrintWriter pwriter = resp.getWriter();   //该方法返回的是一个向  响应体中打印   的字符串  打印流

      /*  应该设置Content-Type响应头
        resp.setHeader("Contnet-Type","text/html");*/

        resp.setContentType("text/html");
//        第二种方式：
        pwriter.write(info);
    }
}
