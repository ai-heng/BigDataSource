package com.itheima.test03_重点掌握;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收浏览器提交的数据.
        String username = request.getParameter("username");
        String password = request.getParameter("password");
       // System.out.println(username + "..." + password);

        //2. 通过JDBC, 获取该数据对应的: User对象.
        QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from user where username = ? and password = ? ;";
        try {
            User user = qr.query(sql, new BeanHandler<>(User.class), username, password);
            //3. 判断该对象是否存在.

            //解决响应时的乱码问题.
            response.setContentType("text/html;charset=utf-8");
            //4. 存在: 提示: 登陆成功.
            if (user != null) {
                response.getWriter().write("<font color='green'>登陆成功</font>");
            } else {
                //5. 不存在: 提示, 用户名或者密码错误.
                response.getWriter().write("<font color='red'>用户名或者密码错误</font>");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
