package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

public class ServletSession3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 研究Session容器的生命周期.
        /*
            session什么时候被创建?
                方式一:
                    初次调用: request.getSession();
                方式二:
                    第一次访问jsp页面.
                    //因为.jsp页面底层是一个Servlet, 它内部自动调用了getSession()方法.

            session什么时候被销毁?
                方式一:
                    Session对象在服务器内部有默认的存活时间, 是30分钟.
                    //思考: 为什么设置session的默认存活时间.

                方式二:
                    调用 session.invalidate()方法, 通知服务器销毁对应的session容器.

                方式三:
                    服务器断电, 内存数据消失, session保存在内存中, 肯定也消失.
         */
        HttpSession hs = request.getSession();

        //调用 session.invalidate()方法, 销毁Session
        hs.invalidate();

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("我是Session3, 我是为了研究Session的生命周期: "  +  new Date().toString());
    }
}
