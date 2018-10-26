package com.itheima.web;

import com.itheima.utils.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class ServletCookie5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 记录用户的最后一次登录时间.
        //1. 获取浏览器提交的所有的Cookie.
        Cookie[] cookies = request.getCookies();
        //2. 从中获取到, 记录: 最后一次登录时间的那个Cookie, 例如,叫: lastVisit
        Cookie cookie = CookieUtils.getCookieByName(cookies, "lastVisit");
        response.setContentType("text/html;charset=utf-8");
        //3. 判断该Cookie是否存在.
        if (cookie == null) {
            //4. 不存在, 就提示: 欢迎登陆本网站.
            response.getWriter().write("欢迎登陆本网站");
        } else {
            //5. 存在, 就提示: 您上次的访问时间是: ***年**月**日...
            response.getWriter().write("您好, 您上次的登陆时间是: " + cookie.getValue());
        }
        //6. 不管该Cookie是否存在, 都要讲此时的时间重新赋值给: lastVisit这个cookie.
        //   因为此时就是该用户的: 最有一次访问时间.
        cookie = new Cookie("lastVisit", new Date().toLocaleString());
        //7. 设置Cookie的属性.
        cookie.setPath(request.getContextPath());
        cookie.setMaxAge(60 * 60 * 24 * 90);
        //8. 将Cookie重新响应给浏览器.
        response.addCookie(cookie);
    }
}
