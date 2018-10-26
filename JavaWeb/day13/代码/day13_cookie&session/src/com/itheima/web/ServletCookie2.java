package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletCookie2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 接收浏览器提交的所有的Cookie.
        //1. 浏览器提交的所有的Cookie.
        Cookie[] cookies = request.getCookies();

        //2. 遍历数组, 将结果打印到控制台
        //个人建议, 实际开发中只要是对象,先做不为null校验.
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName() + "..." + cookie.getValue());
            }
        } else{
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("我是Cookie2, 我没拿到cookie. " + new Date().toString());
        }
    }
}
