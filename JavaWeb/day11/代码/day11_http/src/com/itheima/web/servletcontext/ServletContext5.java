package com.itheima.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Parameter;

public class ServletContext5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取ServletContext域容器.
        ServletContext sc = this.getServletContext();

        //需求1: 获取项目下资源文件的: 绝对路径.
        //目的, 告诉大家, 我们在项目下写文件, 路径都是相对于: web文件夹来写的.
        String realA = sc.getRealPath("WEB-INF/classes/a.txt");
        String realB = sc.getRealPath("WEB-INF/b.txt");
        String realC = sc.getRealPath("c.txt");
        String realD = sc.getRealPath("d.txt");
        System.out.println("a.txt: " + realA);
        System.out.println("b.txt: " + realB);
        System.out.println("c.txt: " + realC);
        System.out.println("d.txt: " + realD);

        System.out.println("*************************");
        //需求2: 获取项目下资源文件的: 文件类型.
        //看tomcat支持哪些: 文件类型
        String a = "a.txt";
        String b = "b.jpg";
        String c = "c.avi";
        System.out.println("a.txt  =" + sc.getMimeType(a) );
        System.out.println("b.jpg  =" + sc.getMimeType(b) );
        System.out.println("c.avi  =" + sc.getMimeType(c) );
        System.out.println("realA  =" + sc.getMimeType(realA) );
        System.out.println("realB  =" + sc.getMimeType(realB) );

        System.out.println("*************************");
        //需求3: 获取项目名.           //面试题
        //System.out.println(sc.getContextPath());
        //System.out.println(this.getServletContext().getContextPath());
        System.out.println(getServletContext().getContextPath());
        System.out.println(request.getContextPath());
    }
}
