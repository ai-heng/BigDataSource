package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取浏览器提交的数据.
        Map<String, String[]> map = request.getParameterMap();
        //2. 将其封装成User对象.
        User user = new User();
        try {
            BeanUtils.populate(user,map);
            //3. 调用Service层的功能, 获取 查询数据库后的User对象.
            UserService us = new UserService();
            User loginUser = us.isLogin(user);
            //4. 判断loginUser对象是否为 null.
            //5. 如果为null, 说明: 用户名或者密码错误, 提示用户, 然后请求转发到: login.jsp
            if (loginUser == null) {
                request.setAttribute("msg","<font color='red'>用户名或密码错误</font>");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            } else {
                // 6. 如果不为null, 说明: 登录成功, 把该User对象封装到: Session域容器中,
                //    然后重定向到首页(index.jsp).

                //6.1 把该User对象封装到: Session域容器中,
                HttpSession hs = request.getSession();
                hs.setAttribute("loginUser",loginUser);

                //6.2 重定向到首页(index.jsp).
                response.sendRedirect("/day13/index.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
