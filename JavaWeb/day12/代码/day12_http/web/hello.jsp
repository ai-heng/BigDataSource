<%@ page import="com.sun.org.glassfish.external.statistics.annotations.Reset" %><%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/9/8
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个jsp页面</title>
    <style>
        div{
            font-size:30px;
        }
    </style>
</head>
<body>
    <div>
        我是div的文本
        <font color="red">我是div中的字体标签</font>
    </div>
    <hr/>
    <h1>.jsp中如何书写Java代码, 有三种格式</h1>
    <h3>第一种写法: 脚本表达式</h3>
    <%--
         格式:
            <%=变量名或者值 %>

         简介(大白话解释:)
            相当于:  response.getWriter().write("这里的内容是写个: 浏览器")
    --%>
    <%="abc" %>  <br>
    <%=false %>  <br>
    <%=123 %>

    <hr>
    <h3>第二种写法: 脚本片段</h3>
    <%--
       格式:
          <%
            //这里写Java代码
          %>

       简介(大白话解释:)
          相当于:  我们以前写在方法中的: 代码.
  --%>
    <%
        //需求: 在页面中打印1~10的数字
        for (int i = 1; i <= 10; i++) {
    %>
            <%=i %>
    <%
        }
    %>

    <hr>
    <h3>第三种写法: 脚本声明</h3>
    <%--
       格式:
          <%!
            //这里写Java代码
          %>

       简介(大白话解释:)
          相当于:  我们以前写在 成员位置的代码(类中, 方法外)
      --%>
       <%!
           //成员变量
           String name = "芳芳老师";
           int age = 18;

           //成员方法
           public int getSum(int a,int b) {
               return a + b;
           }
       %>
       姓名是: <%=name%>       <br>
       年龄为: <%=age%>        <br>
       3 + 5 = <%=getSum(3,5) %>

</body>
</html>
