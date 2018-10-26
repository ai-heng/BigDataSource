package com.itheima.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ServletHttp2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            需求1: 处理请求行.
                public String getMethod();		//获取请求的方式
                public String getRequestURI();	//获取请求资源
                public String getProtocol();	//获取协议类型
                public String getContextPath();	//获取项目名(项目路径)
                public String getRemoteAddr();	//获取IP地址.
                public int getLocalPort();		//获取端口号
         */
        /*System.out.println("请求方式: " + request.getMethod());
        System.out.println("资源路径: " + request.getRequestURI());
        System.out.println("协议版本: " + request.getProtocol());
        System.out.println("项目名: " + request.getContextPath());     //掌握
        System.out.println("IP地址: " + request.getRemoteAddr());      //掌握
        System.out.println("端口号: " + request.getLocalPort());*/


        //需求2:  处理请求头.
        //方式一: 逐个获取.
       /* String accept = request.getHeader("Accept");
        String header = request.getHeader("User-Agent");
        System.out.println("Accept :" + accept);
        System.out.println("User-Agent :" + header);*/

       //方式二: 批量获取.
        //获取所有的: 属性名
        Enumeration<String> names = request.getHeaderNames();
        while(names.hasMoreElements()) {
            String name = names.nextElement();
            System.out.println(name + ": " + request.getHeader(name));
        }
    }
}
