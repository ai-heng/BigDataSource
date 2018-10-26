package com.itheima.web.servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ServletConfig2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 获取当前配置信息文件中的: 参数.
        //方式一: 逐个获取
        ServletConfig sc = this.getServletConfig();
        /*
        String name = sc.getInitParameter("name");
        String gender = sc.getInitParameter("gender");
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);*/

        //方式二: 批量获取
       /* Enumeration<String> em = sc.getInitParameterNames();
        //可以把: Enumeration简单理解为就是: (Iterator it, hasNext(), next())
        while(em.hasMoreElements()) {
            String name = em.nextElement();
            System.out.println(name + "..." + sc.getInitParameter(name));
        }*/

       /*
            ServletConfig的特点:
                每个Servlet都独有自己的ServletConfig对象, 这些对象之间是: 相互隔离的.
        */
       //尝试获取ServletConfig1中的参数信息(size)
        String size = sc.getInitParameter("size");
        System.out.println("size = " + size);
    }
}
