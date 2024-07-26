package com.jiajia;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet(value = "/dfs",
        initParams = {@WebInitParam(name="keyA",value = "valuea"),@WebInitParam(name="keyB",value = "valueB"),@WebInitParam(name="keyc",value = "valuec")},
        loadOnStartup = 6
)
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
//        获取初始配置信息，根据参数名或获取参数值
        String keyA = servletConfig.getInitParameter("keyA");
        System.out.println("keyA="+keyA);

        System.out.println("=================================");

//        获取所有的初始参数的名字
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
//        enum可以理解为早起的iterator,早起的迭代器
        while (initParameterNames.hasMoreElements()){
            String s = initParameterNames.nextElement();
            System.out.println(s+"="+servletConfig.getInitParameter(s));
        }
        //hasMoreElements(),这个放吧，判断有没有下一个参数，有返回true,否则返回flase
        //nextElement()，得到当前，向后移动一次游标
    }

}
