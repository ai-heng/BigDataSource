package com.itheima.test03_重点掌握;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

//              4                   3
public class Demo3Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //这里写和浏览器交互的代码

        //保证编解码一致
        //解决响应时的: 中文乱码问题.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Demo3Servlet   " + new Date().toString());
    }
}
