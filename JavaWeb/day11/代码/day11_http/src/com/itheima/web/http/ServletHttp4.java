package com.itheima.web.http;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletHttp4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 浏览器访问ServletHttp4, 结果是由ServletHttp5给浏览器的.
        //为了让效果更佳明显, 我们可以加入: ip地址(其实就是把request当做域容器).

        //四大域容器: ServletContext  > Session > request > page

        //3. 获取ip地址, 然后把ip地址放到: request域容器中.
        String ip = request.getRemoteAddr();
        request.setAttribute("ip",ip);

        //1. 获取可以进行 请求转发动作的 对象.
        //这里不用写项目名
        RequestDispatcher rd = request.getRequestDispatcher("/servletHttp5");

        //2. 指定请求转发的功能.
        rd.forward(request,response);

        //request.getRequestDispatcher("/servletHttp5").forward(request,response);
    }
}
