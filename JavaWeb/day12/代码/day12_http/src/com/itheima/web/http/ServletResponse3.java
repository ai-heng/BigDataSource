package com.itheima.web.http;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletResponse3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 3秒后跳转到: 传智播客官网
        //格式: response.setHeader("refresh","秒数;url=新的资源路径");

        response.setHeader("refresh","3;url=http://www.itcast.cn");

        //为了加强用户体验, 给浏览器响应一句话
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("页面将在3秒后跳转到: <font color='red'><b>传智播客官网</b></font>");
    }
}
