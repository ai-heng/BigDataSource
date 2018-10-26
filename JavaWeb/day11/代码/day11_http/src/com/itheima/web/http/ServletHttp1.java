package com.itheima.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletHttp1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理post请求.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("this is ServletHttp1#doPost()方法");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理get请求.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("this is ServletHttp1#doGet()方法");

    }
}
