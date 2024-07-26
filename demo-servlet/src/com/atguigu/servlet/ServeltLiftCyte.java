package com.atguigu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//@WebServlet(value = "/ServletLifeCyte",loadOnStartup = 2)   //servlet注解
//londOnStartup:实例化时间（次序）

public class ServeltLiftCyte extends HttpServlet {

    public ServeltLiftCyte(){
        System.out.println("构造器");
//        实例化
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务");
    }

    @Override
    public void destroy() {
        System.out.println("结束");
    }
}


//实例化和初始化，在servlet生命周期只执行一次，而service执行多次，destory结束是也执行一次