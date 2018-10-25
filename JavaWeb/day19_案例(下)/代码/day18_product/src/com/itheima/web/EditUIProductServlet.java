package com.itheima.web;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.itheima.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditUIProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收浏览器提交的参数.
        String pid = request.getParameter("pid");
        //System.out.println(pid);

        //2. 根据该值, 调用service, 进行查询, 获取数据. Product.
        ProductService ps = new ProductServiceImpl();
        Product p = ps.findProductByPid(pid);

        //3. 将对象设置到: request容器中.
        request.setAttribute("product", p);

        //4. 请求转发到: edit.jsp页面.
        request.getRequestDispatcher("/admin/product/edit.jsp").forward(request,response);
    }
}
