package com.jiajia;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

@WebServlet(value = "/servleta")
public class Servlett1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /* RequestDispatcher servletB = req.getRequestDispatcher("ServletB");
        servletB.forward(req,resp);*/
//        获取所有的请求头信息
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String s = headerNames.nextElement();
            System.out.println(s+"=:"+req.getHeader(s));
        }

        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String s = parameterNames.nextElement();
            String[] parameterValues = req.getParameterValues(s);
            if(parameterValues.length>1){
                System.out.println(Arrays.toString(parameterValues));
            }else {
                System.out.println(parameterValues[0]);
            }
        }
    }
}
