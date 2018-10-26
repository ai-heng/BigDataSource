<%@ page import="com.itheima.domain.Product" %><%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/9/8
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>.jsp页面的内置对象</title>
</head>
<body>
    <%--
        记忆:
            1. .jsp页面底层其实是一个: Servlet.
            2. .jsp页面有9大内置对象, request就是其中的一个内置对象.
                    四大域容器:
                        page, request, session, application(ServletContext类型)
                    推理法:
                        response, config(ServletConfig类型)
                     联想记忆法:
                        out, exception, pageContext(相当于管家, 是用来管理其他8大对象的).
    --%>
    <%--需求: 往request域容器中放一个参数(非自定义版类型), 然后获取, 并将其打印得到: 浏览器上--%>
    <%
        request.setAttribute("money",30000);
    %>
    你的工资是: <%=request.getAttribute("money") %>

    <hr>
    <%
        Product p = new Product("G63 AMG", 160);
        request.setAttribute("product",p);
    %>
    <h3>方式一: 普通获取</h3>
    商品名:    <%=((Product)request.getAttribute("product")).getName() %>  <br>
    商品价格:   <%=((Product)request.getAttribute("product")).getPrice()%>

    <hr>
    <%--
        EL表达式:
            概述(作用): 就是用来简化 jsp代码的.

            格式:
                ${域容器.属性名.该属性具体的属性名 }
    --%>
    <h3>方式二: EL表达式</h3>
    商品名: ${requestScope.product.name }    <br>
    商品价格: ${requestScope.product.price }

    <hr>
    <h3>方式二: EL表达式_优化版</h3>
    商品名: ${product.name }    <br>
    商品价格: ${product.price }  <br>
    你的工资: ${money}

</body>
</html>
