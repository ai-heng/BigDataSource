package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class ServletSession1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 获取浏览器提交时的IP, 并将其设置到Session容器中.

        //1. 获取Session容器.
        HttpSession hs = request.getSession();

        /*
            出现的问题:
                浏览器会话结束, Session就销毁了, 为什么?
                原因:
                    浏览器是采用Cookie的方式, 记录Session容器的id的, 当浏览器会话结束的时候, Cookie就销毁了, 于是, 就找不到对象的Session了.
                解决方案:
                    设置存储SessionId的那个Cookie的最大生存时间即可.
         */
        //4. 设置存储SessionId的那个Cookie的最大生存时间即可.
        Cookie cookie = new Cookie("JSESSIONID",hs.getId());
        cookie.setMaxAge(6000);
        response.addCookie(cookie);


        //2. 获取浏览器提交时的IP, 并将其设置到Session容器中.
        String ip = request.getRemoteAddr();
        hs.setAttribute("ip", ip);

        //3. 为了加强用户体验, 给浏览器响应一句话.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Session1, 我把IP " + ip + " 放到Session域容器中了  " + new Date().toString());
    }
}
