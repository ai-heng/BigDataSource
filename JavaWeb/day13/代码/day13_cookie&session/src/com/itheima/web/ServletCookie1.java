package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletCookie1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 创建和发送Cookie.
        //1. 创建Cookie.
        //注意: cookie不能存储中文.
        Cookie cookie =  new Cookie("name","zhangsan");

        //2. 设置Cookie的属性.
        /*
            2.1 设置Cookie的最大生存时间, 单位是: 秒.
             参数值:
                正数:   过指定时间后删除.
                0:      立马删除.
                负数:   浏览器会话结束时删除.       //默认值.
         */
        //cookie.setMaxAge(60 * 60 * 24 * 30 * 3);

        //Java项目中是以什么来决定类的唯一性的?  类名, 包名.
        //如何保证Cookie的唯一性呢?  属性名, Cookie的路径.

        //2.2 设置Cookie的 路径.
        //目的在于:  对Cookie进行划分, 不同的Servlet访问的Cookie不同, 可以提高程序运行效率.
        //cookie.setPath("/day13/aaa");

        //3. 发送Cookie.  服务器把Cookie给浏览器.
        response.addCookie(cookie);

        //4. 为了加强用户体验, 给浏览器响应一句话.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Cookie1, 我把Cookie给浏览器了. " + new Date().toString());
    }
}
