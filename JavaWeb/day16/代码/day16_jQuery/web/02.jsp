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
    <title>jQuery实现.</title>

    <!--引入jQuery文件-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.0.min.js">
    </script>

    <!--需求: 点击div, 背景色变为: 黄色-->
    <script>
        //jQuery()核心函数的功能一: 页面加载事件.
      $(function() {
          //1. 获取id为d1的元素,
          //jQuery()核心函数的功能二: 获取对象
          var $d1 = jQuery("#d1");

          //2. 给d1绑定一个: 单击事件
          /*$d1.click(function() {
              //3. 设置背景色
              $d1.css("background","yellow");
          });*/

          $d1[0].onclick = function () {
              //3. 设置背景色
              $d1[0].style.backgroundColor = "red";
          }

          //jQuery()核心函数的功能四: 可以把html标签, 转成jQuery对象.
          // 格式: jQuery(html标签);

          //需求: 给页面写一个: a标签
          jQuery("body").append("<a href='http://www.itcast.cn'>传智播客</a>");

          jQuery("body").append(jQuery("<a href='http://www.itheima.com'>黑马程序员</a>"));
      });

      /*
        jQuery()核心函数的功能三: 可以把JS对象, 转成jQuery对象.
            需求: js对象能使用jQuery对象中的方法吗?
                不能, 但是我们可以把js对象封装成jQuery对象.
                格式: jQuery(js对象);

             需求: jQuery对象能使用js对象中的方法吗?
                不能, 但是我们可以把jQuery对象转成: js对象.
                格式: jQuery对象[0]
       */

    </script>
</head>
<body>
    <div id="d1" style="width:300px; height: 300px; background-color: blue">
        我是div
    </div>
</body>
</html>
