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

public class ProductConditionQueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        //1. 接收浏览器提交的数据
        String cid = request.getParameter("cid");
        String pname = request.getParameter("pname");
        //System.out.println(cid + "..." + pname);

        //2. 调用service层的功能, 根据条件查询商品信息. List<Product>
        ProductService ps = new ProductServiceImpl();
        List<Product> list = ps.findProductByCondition(cid,pname);

        //5. 回显
        request.setAttribute("cid",cid);
        request.setAttribute("pname",pname);

        //3. 请集合设置到request域容器中.
        request.setAttribute("productList",list);

        //4. 请求转发到: list.jsp.
        request.getRequestDispatcher("/admin/product/list.jsp").forward(request,response);

    }
}
