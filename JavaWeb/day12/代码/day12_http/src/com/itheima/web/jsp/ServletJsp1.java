package com.itheima.web.jsp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletJsp1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 使用servlet向浏览器输出一个黑马超链接页面.
        //<a href='http://www.itheima.com'>黑马程序员</a>

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<html>");
        response.getWriter().println("<head><titile>黑马程序员</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().write("<a href='http://www.itheima.com'>黑马程序员</a>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");

    }
}
