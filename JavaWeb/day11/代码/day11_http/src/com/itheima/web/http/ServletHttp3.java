package com.itheima.web.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class ServletHttp3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 解决post请求时的: 中文乱码问题
        //方式1, 2, 3和get一模一样.

        //方式4:  掌不掌握随你自己, 反正四种你得会一种.

        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //需求: 解决get请求时的: 中文乱码问题.
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        /*
            核心思路:
                乱码原因: 编解码不一致.
                    浏览器: 默认码表是gbk, 但是目前我们用的页面是在Idea中创建的, 所以用的是: utf-8
                    服务器: 默认码表: iso-8859-1
                解决方案: 编解码一致.
                    先进行iso-8859-1编码, 后进行utf-8解码.
         */
        //方式一:  理解
       /* String encode = URLEncoder.encode(username, "iso-8859-1");
        username = URLDecoder.decode(encode, "utf-8");*/

       //方式二: 思路: 先把值按照iso-8859-1转成字节数字, 然后按照utf-8转成字符串.  大纲要求, 掌握.
        /*byte[] bys = username.getBytes("iso-8859-1");
        username = new String(bys,"utf-8");*/

        //方式三: 个人要求: 掌握
        username = new String(username.getBytes("iso-8859-1"),"utf-8");

        System.out.println("username: " + username);
        System.out.println("password: " + password);
    }
}
