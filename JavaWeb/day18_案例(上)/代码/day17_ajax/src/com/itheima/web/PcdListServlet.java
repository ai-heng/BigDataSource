package com.itheima.web;

import com.itheima.service.PcdService;
import flexjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PcdListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收浏览器传过来的数据
        int pid = Integer.parseInt(request.getParameter("pid"));

        //2. 调用service层, 获取json字符串.
        PcdService ps = new PcdService();
        String str = ps.findPcdByPid(pid);

        //3. 将json字符串响应给: 页面.
        response.setContentType("json/application;charset=utf-8");
        response.getWriter().write(str);

    }
}
