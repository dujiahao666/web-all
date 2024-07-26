package com.jiajia;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/kkkl")
public class Serv3  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        String serv2 = servletContext.getRealPath("Serv2");
        System.out.println(serv2);
        System.out.println("=========================");
        //getRealPath，获得一个指向项目部署位置下的某个文件/目录的磁盘下的真实路径/API   是部署路径
        String update = servletContext.getRealPath("update");
        System.out.println(update);
        System.out.println("=========================");

//       getContextPath， 获取项目的上下文路径，  项目的访问路径   比如说当前的/kkkl
//        的上下文路径是：http://localhost:8080/demo3/kkkl
//        我们获取到的/demo3  就是/kkkl的上下文路径

        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
    }
}
