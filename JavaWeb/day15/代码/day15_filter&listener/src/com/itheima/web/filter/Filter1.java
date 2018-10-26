package com.itheima.web.filter;

/*
    过滤器使用步骤和: Servlet非常相似.
        1. 定义类, 实现接口.
        2. 重写所有的抽象方法.
        3. 在web.xml文件中配置
 */

import javax.servlet.*;
import java.io.IOException;

//1
public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤器, 1111111111111111111111");

        //放行.
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
    //2
}
