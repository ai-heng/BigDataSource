package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletCookie4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 删除指定的Cookie.
        //核心思路: 获取到指定的Cookie, 将其的最大生存时间设置为: 0.
        //保证Cookie的唯一性通过: 属性名, 路径.

        //需求1: 删除Cookie1(name,张三)
      /*  //1. 获取到指定的Cookie
        Cookie cookie = new Cookie("name","");
        cookie.setPath(request.getContextPath());       //如果删除的是项目下的直接的cookie, 这样代码写不写都行.

        //2. 将其的最大生存时间设置为: 0.
        cookie.setMaxAge(0);

        //3. 将该Cookie重新响应给浏览器.
        response.addCookie(cookie);

        //4. 为了加强用户体验, 给浏览器响应一句话.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Cookie4, 我把Cookie给删除了. " + new Date().toString());*/


        //需求2: 删除Cookie3(name,张三)
        //1. 获取到指定的Cookie
        Cookie cookie = new Cookie("meinv","");
        cookie.setPath(request.getContextPath() + "/car");

        //2. 将其的最大生存时间设置为: 0.
        cookie.setMaxAge(0);

        //3. 将该Cookie重新响应给浏览器.
        response.addCookie(cookie);

        //4. 为了加强用户体验, 给浏览器响应一句话.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Cookie4, 我把Cookie给删除了. " + new Date().toString());
    }
}
