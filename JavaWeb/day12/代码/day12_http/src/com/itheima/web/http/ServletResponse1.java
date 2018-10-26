package com.itheima.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletResponse1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 浏览器访问ServletResponse1, 结果是由ServletResponse2给响应的.
        //1. 设置状态码.     告诉浏览器, 我没有这个资源.
        /**
         * 200: 响应成功.
         * 302: 重定向.
         * 404: 请求的资源不存在.
         * 500: 服务器内部错误.
         */
        //重定向的方式一: 分步实现.
        //response.setStatus(302);
        //2. 设置新的访问的资源路径.       告诉浏览器, 谁有这个资源.
        //response.setHeader("location","/day12/servletResponse2");

        //重定向的方式二: 合并版
        //response.sendRedirect("/day12/servletResponse2");
        response.sendRedirect("http://www.itheima.com");

        /*
            请求转发和重定向的区别?
                1. 关于几次请求, 几次响应.
                    请求转发:   1.
                    重定向:     n.
                2. 关于浏览器地址栏中书写格式 和 窗体内容是否一致.
                    请求转发:  不一致.
                    重定向:    一致.
                3. 跳转时, 是否需要编写  项目名.
                    请求转发:  不用.
                    重定向:    用.
                4. 是否可以跳转外部路径.
                    请求转发:  不可以.
                    重定向:   可以.
                5. 如果把request当做域容器, 哪种方式更合适?
                    请求转发:  合适.
                    重定向:   不合适.

                   记忆:
                     每次请求都会创建新的request和response对象, 响应结束后这两个对象就销毁.
                    一般来讲, 可以简单理解为:
                        操作成功, 用重定向更多, 操作失败, 用请求转发更多.

         */
    }
}
