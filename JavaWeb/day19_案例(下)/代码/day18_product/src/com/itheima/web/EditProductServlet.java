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

public class EditProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决请求时的乱码问题
        request.setCharacterEncoding("utf-8");

        //1. 接收浏览器提交的数据, 封装成对象.
        Product p = new Product();
        try {
            BeanUtils.populate(p, request.getParameterMap());
            System.out.println(p);

        } catch (Exception e) {
            e.printStackTrace();
        }

        //2. 调用service层的功能, 修改该对象的信息, 并接收返回结果.
        ProductService ps = new ProductServiceImpl();
        boolean flag = ps.updateProduct(p);

        //3. 判断, 结果为:true, 修改成功. 重定向到: productListServlet  --> list.jsp
        if (flag) {
            response.sendRedirect(request.getContextPath() + "/productListServlet");
          /*  response.setContentType("text/html;charset=utf-8");
            response.setHeader("refresh","3;url=/day18/productListServlet");
            response.getWriter().write("<h3>修改成功, 3秒后跳转到 商品展示页面</h3>");*/

        } else {
            //4. 判断, 如果为: false, 修改失败, 提示, 然后定时刷新到: 编辑页面.
            response.setContentType("text/html;charset=utf-8");
            response.setHeader("refresh","3;url=/day18/admin/product/edit.jsp");
            response.getWriter().write("<h3>修改失败, 3秒后跳转到 商品编辑页面</h3>");
        }



    }
}
