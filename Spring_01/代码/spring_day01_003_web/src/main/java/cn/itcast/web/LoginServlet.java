package cn.itcast.web;

import cn.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1 获取参数
        // 2 调用业务层 查询用户信息(从spring容器中获取service)
        // 2.1 实例化spring容器
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        UserService userService = ac.getBean("userServiceImpl", UserService.class);
        userService.login();

        // 3 给浏览器响应内容
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("<h1>登录成功</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
