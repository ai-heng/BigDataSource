package cn.itcast.web;

import cn.itcast.service.AccountService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AccountTransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1 需要哪些参数: 出账人 入账人 多少钱
        String out = request.getParameter("out");
        String in = request.getParameter("in");
        double money = 0;
        try {
            money = Double.parseDouble(request.getParameter("money"));
        }catch (Exception e) {
        }
        // 2 调用业务层
        AccountService accountService = new AccountService();
        accountService.transfer(out, in, money);

        // 3 给浏览器响应什么内容:
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("<h1 style='color:green'>转账成功!</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
