package com.itheima.web;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.itheima.service.impl.ProductServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class AddProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决请求时的乱码问题.
        request.setCharacterEncoding("utf-8");

        //1. 接收商品的信息, 将其封装成: product对象.
        Product product = new Product();
        try {
            BeanUtils.populate(product,request.getParameterMap());
            System.out.println(product);

            //2. 调用service层的功能, 添加商品, 并接收返回值.
            ProductService ps = new ProductServiceImpl();
            boolean flag = ps.addProduct(product);

            //3. 判断, 如果是true: 添加成功, 重定向到: productListServlet --> list.jsp
            if (flag) {
                response.sendRedirect(request.getContextPath() + "/productListServlet");
            } else {
                //4. 判断如果是false, 提示添加失败, 定时刷新到: add.jsp(商品添加页面)
                response.setContentType("text/html;charset=utf-8");
                response.setHeader("refresh","3;url=/day18/admin/product/add.jsp");
                response.getWriter().write("<h2>添加失败, 3秒后跳转到 商品添加页面</h2>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
