package com.itheima.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter2 implements Filter {
    /*
        假设你站到调度者的身份, 考虑安检, 你会怎么做?
            1. 成立安监部.
            2. 分配安检人员和安检设备.
            3. 指定安检的动作(重复工作).
            4. 解散安监部门, 发放遣散费: 500W.
     */
    public Filter2() {
        System.out.println("构造方法:  成立安监部.");
    }

    public void init(FilterConfig config) throws ServletException {
        //int size = 10;
        //int size = 30;
        //int size = 20;

        //从配置文件中, 获取: 该Servlet 的信息.
        int size = Integer.parseInt(config.getInitParameter("size"));

        System.out.println("初始化方法: 分配"+ size +"个安检人员和安检设备");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("执行过滤器, 2222222222222222222");
        System.out.println("重复工作:    指定安检的动作(重复工作).");
        //放行
       chain.doFilter(req, resp);
    }

    public void destroy() {
        System.out.println("销毁: 解散安监部门, 发放遣散费: 500W. ");
    }

}
