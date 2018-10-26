package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1 调用业务层 查询用户集合
        // F8 下一步
        // F9 调到下一个断点,如果没有断点,就结束
        // F7 进入方法内部
        UserService userService = new UserServiceImpl();
        List<User> userList = userService.queryAll();

        // 2 将用户集合转发给用户列表页 且 显示
        request.setAttribute("userList", userList);
        request.getRequestDispatcher("/user_list.jsp").forward(request, response);
        return;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
