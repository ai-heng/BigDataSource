package com.itheima.web;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用Service层的功能, 获取List<Product>
        ProductService ps = new ProductService();
        List<Product> list = ps.findAllProduct();

        //2. 将其封装到: request域容器中.
        request.setAttribute("productList",list);

        //3. 请求转发到: product_list.jsp(商品列表页面.)
        request.getRequestDispatcher("/product_list.jsp").forward(request,response);

        //4. 个人建议, 写return
        return;
    }
}
