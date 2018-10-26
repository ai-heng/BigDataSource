<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/9/16
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json字符串讲解</title>
    <script>
        //定义json字符串
        var stu = {"name":"芳芳", "age": "16" };

        document.write("<h3>json字符串的第一种遍历方式: json字符串对象.键名 </h3>")
        document.write("name: " + stu.name + "<br />")
        document.write("age: " + stu.age + "<hr />")

        document.write("<h3>json字符串的第二种遍历方式: json字符串对象['键名'] </h3>")
        document.write("name: " + stu["name"] + "<br />")
        document.write("age: " + stu["age"] + "<hr />")

        document.write("<h3>json字符串的第三种遍历方式: for-in循环, 获取所有键名, 然后获取 </h3>")
        for(var key in stu) {
            //key就是: json字符串的键名
            document.write(key + ": " + stu[key] + "<br/> ");
        }

        document.write("<hr /><h3>案例: 遍历json字符串数组</h3>")
        var stuArr = [
            {"name":"芳芳", "age": "16" },
            {"name":"曹胖子", "age": "35" },
            {"name":"夯哥", "age": "18" },
            {"name":"项羽", "age": "62" }
        ];
        //1. 遍历stuArr数组, 获取到每个json字符串
        for(var i=0; i<stuArr.length; i++) {
            //stuArr[i]: 就是每个学生对象的: json字符串形式
            for(var key in stuArr[i] ) {
                document.write(key + ": " + stuArr[i][key] + "  ");
            }
            document.write("<br/>")
        }


    </script>
</head>
<body>
    <%--
        JSON字符串:
            概述: JavaScript Object Notation, JS对象(字符串)表示法.

            大白话:
                就是JS对象的字符串形式的写法.

             格式:
                var 变量名 = {
                    "属性名": "属性值",
                    "属性名": "属性值",
                    "属性名": "属性值"
                };
             特点:
                属性名和属性值都要用引号引起来.
    --%>
</body>
</html>
