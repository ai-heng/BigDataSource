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
                    //页面加载事件
                    $(function () {
                        //1. 给文本框绑定一个: 离焦事件.
                        $("input[name='pname']").blur(function () {
                            //2. 通过ajax, 获取所有的分类信息.
                            $.get("/day17/categoryListServlet", function (data) {
                                //打印: 服务器返回的结果.
                                //console.info(data)
                                // [{…}, {…}, {…}, {…}, {…}, {…}]
                                //3. 将获取到的数据, 封装成指定的格式.
                                //3.1 定义变量, 记录最终拼接后的结果.
                                var str = "<option value='null'>--请选择分类信息--</option>";
                                //3.2 遍历获取到的json字符串, 按照格式拼接
                                for(var i=0; i<data.length; i++) {
                                    str += "<option value='"+ data[i].cid +"'>"+ data[i].cname +"</option>";
                                }
                                //3.3 将拼接后的值设置到指定的地方(下拉列表).
                                $("#category_msg").html(str)
                            });

                        });

                    })
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
