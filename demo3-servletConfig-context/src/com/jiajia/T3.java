package com.jiajia;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(value = {"/t3"},initParams = {@WebInitParam(name = "keyA",value = "valueA"),@WebInitParam(name = "keyB",value = "valueB")})
public class T3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        Enumeration<String> initParameterNames1 = servletConfig.getInitParameterNames();


        Enumeration<String> initParameterNames = getInitParameterNames();
        while (initParameterNames.hasMoreElements()){
            String s = initParameterNames.nextElement();
            System.out.println(s+":"+getInitParameter(s));
        }

        req.setAttribute("message","diyici");

        req.getRequestDispatcher("/t4").forward(req,resp);

//        ServletContext servletContext = getServletContext();
    }
}
