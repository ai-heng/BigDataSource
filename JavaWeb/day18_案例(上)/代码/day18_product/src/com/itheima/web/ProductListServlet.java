package com.itheima.web;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.itheima.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用Service层的功能, 获取数据.   List<Product>
        ProductService ps = new ProductServiceImpl();
        List<Product> list = ps.findAllProduct();

        //2. 将数据设置到: request域容器中.
        request.setAttribute("productList",list);

        //3. 请求转发到: 商品展示页面list.jsp
        request.getRequestDispatcher("/admin/product/list.jsp").forward(request,response);
    }
}
