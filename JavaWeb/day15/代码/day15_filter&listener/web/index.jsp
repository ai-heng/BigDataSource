<%--
  Created by IntelliJ IDEA.
  User: Liu
  Date: 2018/7/22
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>过滤器</h1>
  <h3><a href="${pageContext.request.contextPath}/hello.jsp">需求1: 访问.jsp页面</a></h3>
  <h3><a href="${pageContext.request.contextPath}/helloServlet">需求2: 访问helloServlet类</a></h3>
  <h3><a href="${pageContext.request.contextPath}/helloServlet">需求3: 过滤器的生命周期</a></h3>
  <h3><a href="${pageContext.request.contextPath}/input.jsp">案例1: 解决post(请求)方式的乱码问题</a></h3>
  <h3><a href="${pageContext.request.contextPath}/form.jsp">案例2: 解决请求和响应时的乱码问题</a></h3>
  <hr>
  <h1>监听器</h1>
  <h3><a href="${pageContext.request.contextPath}/demo3Servlet">需求1: 监听request容器的创建和销毁</a></h3>
  <h3><a href="${pageContext.request.contextPath}/demo3Servlet">需求2: 监听session容器的创建和销毁</a></h3>
  <h3><a href="${pageContext.request.contextPath}/MyServletContextListener">需求3: 监听servletContext容器的创建和销毁</a></h3>
  <h3><a href="${pageContext.request.contextPath}/demo3Servlet">需求4: 监听session容器中属性的变化</a></h3>
  <h3><a href="${pageContext.request.contextPath}/demo4Servlet">需求5: 监听session容器中对象的绑定和解绑</a></h3>
  <h3><a href="${pageContext.request.contextPath}/demo4Servlet">需求6: 监听session容器中对象的钝化和活化</a></h3>
  </body>
</html>
