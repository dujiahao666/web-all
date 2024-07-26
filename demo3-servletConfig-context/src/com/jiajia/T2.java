package com.jiajia;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/ssa",initParams ={@WebInitParam(name = "sdfa",value = "true"),@WebInitParam(name="sdf",value = "dsfa")})
public class T2 extends HttpServlet {
   /* public static void main(String[] args) {
        System.out.println("执行");
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get的请求方式");
    }
}
