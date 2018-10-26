package com.itheima.test02_servlet快速入门;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

/*
    Servlet接口: 服务器和Java代码交互的规则.

       具体步骤:
        1. 定义一个类(Demo1Servlet), 实现Servlet接口.
        2. 重写接口中所有的抽象方法.
        3. 在web.xml文件中进行设置(目的是明确: 浏览器访问该java代码的路径)
 */
public class Demo1Servlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        //负责和浏览器具体交互的:  可以读取浏览器提交过来的参数, 也可以往浏览器写数据.

        //给浏览器响应一句话, 先不要响应中文, 会乱码.
        response.getWriter().write("this is Demo1Servlet  " + new Date().toLocaleString());
    }


    @Override
    public void destroy() {

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
