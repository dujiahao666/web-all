package com.atguigu.schedule.controller;

import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.service.impl.SysUserServiceimpl;
import com.atguigu.schedule.util.MD5Util;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/user/*")
public class SysUserController extends BaseController {

    private SysUserService userService = new SysUserServiceimpl();

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是添加的方法");
    }


    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1：接收用户名和密码
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2:调用服务层方法，完成注册功能
        SysUser loginUser = userService.findByUsername(username);
        if(loginUser==null){
            resp.sendRedirect("/loginUsernameError.html");
        } else if (!MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())) {
            resp.sendRedirect("/loginUserPwdError.html");
        }else {
            resp.sendRedirect("/showSchedule.html");
        }
    }

    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1：接收客户端提交的参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2:调用服务层方法，完成注册功能
        SysUser sysUser = new SysUser(null, username, userPwd);
        int rows = userService.regist(sysUser);
        //3：根据注册结果（失败  成功） 做页面跳转
        if (rows > 0) {
            resp.sendRedirect("/regiestSuccess.html");

        } else {
            resp.sendRedirect("/regiestFail.html");
        }
    }


    /**
     * 注册时，接收要注册的用户名，校验用户名是否被占用的业务接口
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void checkUsernameUsed(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收用户名
        String username = req.getParameter("username");
        //调用服务层业务处理方法查询该用户名是否有对应的用户
        SysUser sysUser = userService.findByUsername(username);
        //如果有 响应 已占用
        //如果没 响应  可用
        String info="可用";
        if(null!=sysUser){
            info="已占用";
        }
        resp.getWriter().write(info);
    }


}
