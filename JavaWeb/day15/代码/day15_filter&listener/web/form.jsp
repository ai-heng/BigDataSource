<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/7/22
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>案例二: 解决请求和响应时的乱码问题</title>
</head>
<body>
    <h3>post方式</h3>
    <form method="post" action="${pageContext.request.contextPath}/demo2Servlet">
        请输入你的大名: <input type="text" name="username"> <br>
        请输入你的昵称: <input type="text" name="nickname"> <br>
        <input type="submit" value="点我提交">
    </form>

    <hr>

    <h3>get方式</h3>
    <form method="get" action="${pageContext.request.contextPath}/demo2Servlet">
        请输入你的大名: <input type="text" name="username"> <br>
        请输入你的昵称: <input type="text" name="nickname"> <br>
        <input type="submit" value="点我提交">
    </form>

</body>
</html>
