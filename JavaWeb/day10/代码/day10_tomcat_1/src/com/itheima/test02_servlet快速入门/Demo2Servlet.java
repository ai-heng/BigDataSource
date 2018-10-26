package com.itheima.test02_servlet快速入门;

import javax.servlet.*;
import java.io.IOException;

//                4                      1
public class Demo2Servlet implements Servlet{
    public Demo2Servlet() {
        System.out.println("构造方法: 投简历, 接到面试邀约 ");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("初始化的方法: 携带个人简历, 离职报告, 体检证明, 面试...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service()方法, 负责和浏览器交互的: 每日工作, 敲代码, 敲代码, 敲代码...");
    }

    @Override
    public void destroy() {
        System.out.println("销毁Servlet: 提交离职报告 和  交接文档! ");
    }
























    @Override
    public String getServletInfo() {
        return null;
    }
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

}
