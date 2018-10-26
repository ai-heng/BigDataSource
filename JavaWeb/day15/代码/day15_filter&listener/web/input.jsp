<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/9/13
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>解决post方式的乱码问题</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/demo1Servlet">
        你的大名: <input type="text" name="username"> <br/>
         <input type="submit" value="点我提交">
    </form>
</body>
</html>
