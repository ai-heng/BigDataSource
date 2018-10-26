package com.itheima.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Demo2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String nickname = request.getParameter("nickname");

        System.out.println("post    username: " + username);
        System.out.println("post    nickname: " + nickname);

      /*  Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            System.out.println(key + "..." + Arrays.toString(map.get(key)));
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String nickname = request.getParameter("nickname");

        System.out.println("get    username: " + username);
        System.out.println("get    nickname: " + nickname);
    }
}
