package com.itheima.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContext4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 从ServletContext域容器中获取:  由ServletContext3放进去的ip
        //1. 获取ServletContext域容器.
        ServletContext sc = this.getServletContext();
        //2. 从域容器中获取: ip
        String ip = (String)sc.getAttribute("ip");

        //3. 将ip打印到浏览器中.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是ServletContext4, 我获取到的IP是: " + ip);

    }
}
