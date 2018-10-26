<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/7/25
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JQuery版本的ajax代码</title>
    <!--引入JQuery文件-->
    <script type="text/javascript" src="/day17/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        //页面加载事件
        $(function () {
            //1. 校验用户名
            $("input[name='username']").blur(function () {
                //1.1 获取用户录入的: 用户名
                var uname = this.value;

                //1.2 通过ajax局部(异步)刷新技术, 查询该用户名是否可用.
                $.get("/day17/checkUsernameServlet",{"username":uname},function (data) {
                    $("#username_msg").html(data)
                });
            });

            //2. 校验昵称
            $("input[name='nickname']").blur(function () {
                //1.1 获取用户录入的: 用户名
                var name = this.value;

                //1.2 通过ajax局部(异步)刷新技术, 查询该用户名是否可用.
                $.post("/day17/checkNicknameServlet",{"nickname":name},function (data) {
                    $("#nickname_msg").html(data);
                });
            });

        })

    </script>
</head>
<body>
<form action="" method="get">
    <table>
        <tr>
            <td>用户名(get):</td>
            <td>
                <input type="text" name="username">
            </td>
            <td>
                <span id="username_msg"></span>
            </td>
        </tr>

        <tr>
            <td>昵称(post):</td>
            <td>
                <input type="text" name="nickname">
            </td>
            <td>
                <span id="nickname_msg"></span>
            </td>
        </tr>

        <tr>
            <td>年龄:</td>
            <td>
                <input type="text" name="age">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交">
            </td>
        </tr>

    </table>
</form>
</body>
</html>
