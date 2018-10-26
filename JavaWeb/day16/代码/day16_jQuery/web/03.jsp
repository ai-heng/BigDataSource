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

    <script>
       /* function fljsadsaldflasdfasldjfasdlfjasdfas() {
            console.info("abc");
        }
        //函数只有被调用才会执行.
        fljsadsaldflasdfasldjfasdlfjasdfas();*/

       //页面加载事件,   jQuery() 等价于  $();
       $(function () {
            console.info("abc123");

            $("#d1");
       });

    </script>
</head>
<body>
    <div id="d1" style="width:300px; height: 300px; background-color: blue">
        我是div
    </div>
</body>
</html>
