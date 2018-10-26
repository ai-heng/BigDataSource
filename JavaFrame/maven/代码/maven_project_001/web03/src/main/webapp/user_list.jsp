<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" width="60%" cellspacing="0px" cellpadding="10px" align="center">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>修改 删除</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
