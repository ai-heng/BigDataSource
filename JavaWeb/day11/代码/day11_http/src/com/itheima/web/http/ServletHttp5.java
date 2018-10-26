package com.itheima.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletHttp5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 给浏览器一句话
        //从request中获取ip地址.
        String ip = (String)request.getAttribute("ip");

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是ServletHttp5, 我从request域容器中获取的ip是:   " + ip + "  ..." +  new Date().toString());
    }
}
