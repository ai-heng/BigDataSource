package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckUsernameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //正常逻辑, 这里应该接受浏览器提交的数据, 然后去查询数据库, 然后再把结果返回给浏览器.
        //这里为了简单, 我们不查数据库了, 假设: 数据表中已经有数据:   用户名: zhangsan,  昵称: 张三

        //1. 接受浏览器提交的数据.
        String username = request.getParameter("username");
        //解决get方式的乱码
        username = new String(username.getBytes("iso-8859-1"),"utf-8");

        //解决响应乱码
        response.setContentType("text/html;charset=utf-8");

        //2. 查询数据库, 看该数据库是否存在.
        if (username != null && username.trim().length() > 0  && !"zhangsan".equals(username)) {
            //3. 不存在, 提示: 用户名可用.
            response.getWriter().write("<font color='green'>用户名可用</font>");
        } else {
            //4. 存在, 提示: 用户名不可用.
            response.getWriter().write("<font color='red'>用户名不可用</font>");

        }
    }
}
