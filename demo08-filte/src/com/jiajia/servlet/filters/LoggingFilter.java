package com.jiajia.servlet.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//@WebFilter(servletNames = "ddd")
public class LoggingFilter implements Filter {

    private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("请求到达之前的方法");
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        String requestURI = request.getRequestURI();
        System.out.println(simpleDateFormat.format(new Date()) +":"+requestURI+"资源被请求");

        filterChain.doFilter(servletRequest,servletResponse);

        System.out.println("响应之前的功能代码");
    }
}
