package com.itheima.web;

import com.itheima.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CategoryListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用service层, 获取所有的分类信息(json字符串).
        CategoryService cs = new CategoryService();
        String json = cs.findAllCategory();

        //2. 将获取到的json字符串, 响应给页面(浏览器).
        //细节, 这里不要写错了.  //text/html
        response.setContentType("json/application;charset=utf-8");
        response.getWriter().write(json);
    }
}
