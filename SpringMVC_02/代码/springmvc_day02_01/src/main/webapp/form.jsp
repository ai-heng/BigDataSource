<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/show11.do" method="post">
    <table>
        <tr>
            <td>姓名:</td>
            <td><input name="name" value="liuyan" /></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input name="age" value="20" /></td>
        </tr>
        <tr>
            <td>收入:</td>
            <td><input name="income" value="100000" /></td>
        </tr>
        <tr>
            <td>结婚:</td>
            <td>
                <input type="radio" name="isMarried" value="true" checked="checked" />是
                <input type="radio" name="isMarried" value="false" />否
            </td>
        </tr>
        <tr>
            <td>兴趣:</td>
            <td>
                <input type="checkbox" name="interests" value="shopping" checked="checked" />购物
                <input type="checkbox" name="interests" value="sport" checked="checked" />运动
                <input type="checkbox" name="interests" value="movie" checked="checked" />看电影
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交表单" /></td>
        </tr>
    </table>
</form>
</body>
</html>
