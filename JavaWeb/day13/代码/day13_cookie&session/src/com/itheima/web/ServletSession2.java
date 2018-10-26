package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

public class ServletSession2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 从Session容器中获取, 由ServletSession1放进去的ip地址.
        //1. 获取Session域容器.
        HttpSession hs = request.getSession();

        //2. 从中获取ip地址.
        String ip = (String)hs.getAttribute("ip");

        //3. 将获取到的ip地址, 响应给页面.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Session2, 我获取到的ip是: " + ip);
    }
}
