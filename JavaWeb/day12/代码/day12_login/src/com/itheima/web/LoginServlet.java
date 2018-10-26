package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //方式一: 手动封装user对象.
     /*   //1. 接收浏览器提交的数据.
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //2. 将其封装成user对象.       /目的: 讲解BeanUtils工具类
        User user = new User(0,username,password,"");
        System.out.println(user);*/

        //1. 接收浏览器提交的数据.
        Map<String, String[]> map = request.getParameterMap();
        //2. 将其封装成user对象.       /目的: 讲解BeanUtils工具类
        User user = new User();
        try {
            BeanUtils.populate(user,map);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3. 调用Service层的功能, 判断对象是否存在.
        UserService us = new UserService();
        boolean flag = us.isLogin(user);

        //4. 存在, 重定向到: index.jsp(首页).
        if (flag) {
            response.sendRedirect("/day12/index.jsp");
        } else {
            //5. 不存在, 先提示用户, 再请求转发到: login.jsp(登陆页面)
            request.setAttribute("msg","<font color='red'>用户名或密码错误</font>");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }
}
