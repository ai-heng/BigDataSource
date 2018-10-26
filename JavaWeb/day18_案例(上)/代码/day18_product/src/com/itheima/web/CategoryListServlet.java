package com.itheima.web;

import com.itheima.service.CategoryService;
import com.itheima.service.impl.CategoryServiceImpl;

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
        //1. 调用service, 获取数据. String json.
        CategoryService cs = new CategoryServiceImpl();
        String json = cs.findAllCategory();

        //2. 将json写个浏览器.
        response.setContentType("json/application;charset=utf-8");
        response.getWriter().write(json);
    }
}
