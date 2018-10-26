package com.itheima.web.servletconfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletConfig1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            需求: 你是一家公司的老总, 你们公司生产可乐, 初期的市场调研之后, 你们生产: 500ML的可乐.
                  经过一段时间之后, 做市场调研, 发现喝不完, 改为生产: 200ML的可乐
                  经过一段时间之后, 做市场调研, 发现不够喝, 改为生产: 300ML的可乐
            请用所需知识, 模拟该问题.
         */

        //int size = 500;
        //int size = 200;
        //int size = 300;

        //需求: 从ServletConfig中获取参数值
        //1. 获取当前Servlet的配置信息对象.
        ServletConfig sc = this.getServletConfig();
        //2. 从ServletConfig中获取参数值.
        String str = sc.getInitParameter("size");
        int size = Integer.parseInt(str);

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我们生产的可乐是: " + size + " 毫升的");

        /**
         * 这样写代码不好, 每次需求变更的时候, 都需要修改源码, 和"对修改关闭, 对扩展开放"这个开发原则相违背,
         * 于是我们就考虑解决此问题, 怎么解决呢?
         *    可以把这些变化的参数写到 配置文件中, 用的时候来读取这些 参数即可.
         *    这个配置文件对象就是: ServletConfig对象.
         *
         *    特点: 每个Servlet都独有自己的ServletConfig对象(配置信息对象), 这些配置信息对象之间是: 相互隔离的.
         */
    }
}
