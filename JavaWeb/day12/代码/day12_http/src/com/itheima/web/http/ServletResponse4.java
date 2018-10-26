package com.itheima.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletResponse4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 服务器给浏览器响应数据.

        //方式一: 字符流, 合并版.            //掌握
       response.setContentType("text/html;charset=utf-8");
       response.getWriter().write("我是ServletResponse4, 我给浏览器写一句话: 字符流, 合并版");

        //方式二: 字符流, 分解版.            //掌握
       /* response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("我是ServletResponse4, 我给浏览器写一句话: 字符流, 分解版");*/

       //方式三: 字节流版.
        //浏览器的默认码表是: GBK,  但是我们是在Idea中创建html页面, 所以用的码表是: utf-8
        //这里如果没有写码表, 用的是: GBK.
       // response.getOutputStream().write("我是ServletResponse4, 我给浏览器写一句话: 字节流版".getBytes());

        /*
            关于服务器给浏览器响应数据时的注意事项:
                1. 什么时候使用字节流, 什么时候使用字符流?
                    如果只是响应一些文本信息, 推荐使用: 字符流.
                    其他, 考虑使用: 字节流.

                2. 字节流和字符流能不能同时使用?
                    不能, 否则结果可能不是你想要的.

                3. 不需要调用close(), flush(), tomcat服务器软件会自动调用.

         */
    }
}
