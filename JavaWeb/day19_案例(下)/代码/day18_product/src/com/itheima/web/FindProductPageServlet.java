package com.itheima.web;

import com.itheima.domain.Pagebean;
import com.itheima.domain.Product;
import com.itheima.service.ProductService;
import com.itheima.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FindProductPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收浏览器提交过来的参数(当前页面, 每页显示数据)
        int pagenum = 1;
        try {
            pagenum = Integer.parseInt(request.getParameter("pagenum"));
        }catch (Exception e){
        }
        int numperpage = 12;        //这里, 我们固定每页显示12条.
        //System.out.println(pagenum + "..." + numperpage);

        //5. 接收用户传过来的分类信息(有可能有, 也有可能没有)
        String cid = request.getParameter("cid");
        //System.out.println("cid: " + cid);

        //6. 将浏览器传过来的cid值, 再回显给浏览器, 用于: 选中列高亮显示.
        request.setAttribute("cid",cid);

        //2. 调用service层, 获取Pagebean对象.
        ProductService ps = new ProductServiceImpl();
        Pagebean pb = ps.findPagebean(pagenum, numperpage, cid);

        //3. 将Pagebean对象设置到request域容器中.
        request.setAttribute("pagebean",pb);

        //4. 请求转发到: product_list.jsp
        request.getRequestDispatcher("/product_list.jsp").forward(request,response);
    }
}
