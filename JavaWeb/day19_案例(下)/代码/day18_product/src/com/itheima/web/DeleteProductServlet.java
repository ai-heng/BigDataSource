package com.itheima.web;

import com.itheima.service.ProductService;
import com.itheima.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收浏览器传过来的参数.
        String pid = request.getParameter("pid");

        //2. 调用service, 删除数据, 并接收结果.
        ProductService ps = new ProductServiceImpl();
        boolean flag = ps.deleteProduct(pid);

        //3. 判断, true, 删除成功, 重定向到: productListServlet --> list.jsp
        if (flag) {
            response.sendRedirect(request.getContextPath() + "/productListServlet");

        } else{
            //4. 判断, false, 删除失败, 提示, 定时刷新,  productListServlet --> list.jsp
            response.setContentType("text/html;charset=utf-8");
            response.setHeader("refresh","3;url=/day18/productListServlet");
            response.getWriter().write("<h3>删除失败, 3秒后跳转到 商品展示页面</h3>");
        }

    }
}
