package com.jiajia;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/dd")
public class ServletF extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        解决思路一：这种方式不推荐，因为客户端解析的字符集是无法预测的

        resp.setCharacterEncoding("UTF-8");   //设置响应体的编码字符集
//        tomcat10中，响应体默认的编码字符集使用的是UTF-8，可以设置响应体的编码字符集和客户端  的保持一致
//        英文不会乱码ascii被所有的兼容
        resp.getWriter().println("可以啊");
        resp.getWriter().write("可以啊");

//        方法二:可以告诉客户端使用指定的字符集进行编码，通过设置Content-Type响应头

//        注意其他的都要带-，只有setContentType这个方法不需要
//        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        resp.setContentType("text/html;charset=UTF-8");


    }
}
