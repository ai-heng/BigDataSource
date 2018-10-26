<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/9/14
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JS实现</title>
    <!--引入jQuery文件-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js">
    </script>
    <!--需求: 点击div, 背景色变为: 红色-->
    <script>
      /*  function changeColor(){
            //1. 获取id为d1的元素,
            var d1 = document.getElementById("d1");
            //2. 设置背景色
            d1.style.backgroundColor = "red";
        }*/

      window.onload = function () {
          //1. 获取id为d1的元素,
          var d1 = document.getElementById("d1");

          //2. 给d1绑定一个: 单击事件
         /* d1.onclick = function () {
              //3. 设置背景色
              d1.style.backgroundColor = "red";
          }*/

          jQuery(d1).click(function() {
              //3. 设置背景色
              jQuery(d1).css("background","yellow");
          });
      }



    </script>

</head>
<body>
    <div id="d1" style="width:300px; height: 300px; background-color: blue">
        我是div
    </div>
</body>
</html>
