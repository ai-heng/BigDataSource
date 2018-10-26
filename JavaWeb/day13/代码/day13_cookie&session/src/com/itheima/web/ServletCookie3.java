package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.Date;

public class ServletCookie3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 研究Cookie的默认路径
        //结论: Cookie的默认路径是: 访问当前Servlet时, 的父目录.

        Cookie cookie = new Cookie("meinv","fangfang");

        //设置路径
        //cookie.setPath("/day13/car");

        //实际开发涉及到项目名了, 写法如下:
        cookie.setPath(request.getContextPath() + "/car");

        //把cookie响应给浏览器.
        response.addCookie(cookie);

        //给浏览器写一句话.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Cookie3, 我把Cookie给浏览器了. " + new Date().toString());
    }
}
