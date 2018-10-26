<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注释</title>
</head>
<body>
    <%--
        为什么要学习JSP?
            1. HTML不能直接操作数据库.
            2. Java代码可以操作数据库.
            3. 而我们目前知道的HTML和Java交互的规则, 只有: Servlet,  但是,
               通过Servlet给页面写标签, 很麻烦.    //回顾: Servlet给页面写一个<a>
               于是就有了: jsp.
            JSP简介:
                概述: Java Server pages, Java服务器页面, 里边可以写: html, css, js, java.
    --%>
	    <%--.jsp页面中可以写哪些注释?--%>
        <!--HTML的注释-->

        <%
            //单行注释

            /*
                多行注释
             */

            /**
             * 文档注释
             */
        %>
        <%--.jsp页面自身的注释方式--%>

        <%--遇到的问题: 为什么最后页面中只有HTML的注释呢?
            .jsp    -->     .java      -->      .class      -->   浏览器
            html注释        html注释             html注释
            java注释        java注释
            jsp注释

        --%>

        <%--
            注意事项:
                1. HTMl注释能不能注释Java代码?

                2. .jsp自身的注释, 可以注释任何代码.
        --%>
        <!--<%=request.getRemoteAddr() %>-->

        <%--<%=request.getRemoteAddr() %>--%>

</body>
</html>