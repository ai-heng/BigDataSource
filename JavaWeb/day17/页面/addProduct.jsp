<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/7/25
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品,展示分类信息</title>
    <!--引入js文件-->
    <script type="text/javascript" src="/day17/js/jquery-1.11.0.min.js"></script>
</head>
<body>
<form action="" method="post">
    <table>
        <tr>
            <td>商品名称: </td>
            <td>
                <input type="text" name="pname">
                <script type="text/javascript">
                    //需求: 只要商品名称的文本框一离焦, 就加载商品的分类信息.
                
                </script>
            </td>
        </tr>

        <tr>
            <td>商品价格: </td>
            <td>
                <input type="text" name="price">
            </td>
        </tr>

        <tr>
            <td>分类名称: </td>
            <td>
               <select id="category_msg">
                   <option value="null">--请选择分类信息--</option>
               </select>
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
