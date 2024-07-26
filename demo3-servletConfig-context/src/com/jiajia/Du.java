package com.jiajia;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = "/Du",loadOnStartup = 7)
public class Du  extends HttpServlet {
    public  Du(){
        System.out.println("构造方法");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("被访问到了");
    }



    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
