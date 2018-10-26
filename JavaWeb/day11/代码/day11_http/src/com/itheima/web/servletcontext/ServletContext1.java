package com.itheima.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ServletContext1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 从ServletContext中, 获取当前项目的配置信息.
        //ServletContext sc = getServletContext();
        ServletContext sc = this.getServletContext();

        //方式一: 逐个获取
        /*String faren = sc.getInitParameter("faren");
        String company = sc.getInitParameter("company");
        System.out.println("faren: " + faren);
        System.out.println("company: " + company);*/

        //方式二: 批量获取
        Enumeration<String> em = sc.getInitParameterNames();
        while(em.hasMoreElements()) {
            String name = em.nextElement();
            System.out.println(name + "..." + sc.getInitParameter(name));
        }

        /*
            ServletContext:
                特点: 里边的参数, 可以被项目下所有的Servlet: 共享.
         */
    }
}
