package com.itheima.test03_重点掌握;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Demo4Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
            这里接收浏览器提交的数据.
            String getPrrameter(String name);	//根据表单项name的属性值, 获取非多选框的值.
            String[] getParameterValues(String name);  //根据表单项name的属性值, 获取多选框的值.
            Map getParameterMap();	//由服务器创建的map, 表单项的name属性值作为key, 用户填写或者选择的值作为值.
         */
        //方式一: 逐个获取
        /*String username = request.getParameter("username");
        String password = request.getParameter("password");
        //String hobby = request.getParameter("hobby");
        String[] hobby = request.getParameterValues("hobby");

        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("hobby: " + Arrays.toString(hobby));*/

        //方式二: 批量获取
        //键:属性名   值:该属性对应的值, 为啥是数组呢? 有可能有多个值
        Map<String, String[]> map = request.getParameterMap();
        for (String key : map.keySet()) {
            System.out.println(key + "..." + Arrays.toString(map.get(key)));
        }

    }
}
