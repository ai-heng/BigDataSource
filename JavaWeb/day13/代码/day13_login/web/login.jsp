<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/9/8
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
</head>
<body>
    <form method="get" action="/day13/loginServlet">
        <table>
            <tr>
                <td colspan="2">
                    <%--<%=request.getAttribute("msg") == null ? "" : request.getAttribute("msg")%>--%>
                    ${msg}
                </td>
            </tr>
            <tr>
                <td>用户名</td>
                <td>
                    <input type="text" name="username" />
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="登陆">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
