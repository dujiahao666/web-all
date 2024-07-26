package com.jiajia;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(value = {"/s","/d"},name = "真不错",loadOnStartup = 6,initParams = {@WebInitParam(name ="" ,value ="" )})
public class zz extends HttpServlet {

    public zz(){
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


