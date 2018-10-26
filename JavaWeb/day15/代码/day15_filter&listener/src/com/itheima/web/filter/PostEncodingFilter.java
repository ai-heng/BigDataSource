package com.itheima.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class PostEncodingFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //1. 解决post请求时的乱码问题.
        request.setCharacterEncoding("utf-8");

        //2. 解决响应时的乱码问题.
        response.setContentType("text/html;charset=utf-8");

        chain.doFilter(request, response);
    }



    public void destroy() {
    }
}
