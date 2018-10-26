package com.itheima.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContext3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            需求: ServletContext3获取: 浏览器提交时候的IP地址, 然后将ip地址放到: ServletContext域容器中.
                  由ServletContext4从 ServletContext域容器中, 获取该ip.
         */
        //1. 获取浏览器提交时候的ip.
        String ip = request.getRemoteAddr();

        //2. 将ip地址放到: ServletContext域容器中.
        ServletContext sc = this.getServletContext();
        sc.setAttribute("ip",ip);

        //3. 为了让结果更明显, 给浏览器打印提示信息.
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是ServletContext3, 我把ip: " + ip + " 放到了ServletContext域容器中");

    }
}
