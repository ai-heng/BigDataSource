<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP</h1>
	<h3><a href="${pageContext.request.contextPath }/01_jsp/00.jsp">注释</a></h3>
	<h3><a href="${pageContext.request.contextPath }/01_jsp/01.jsp">回顾在jsp中嵌入java代码的三种方式</a></h3>
	<h3><a href="${pageContext.request.contextPath }/01_jsp/02.jsp">java代码出现异常怎么办?</a></h3>
	<h3><a href="/day14/01_jsp/jingtai/main.jsp">需求: 静态引入公共页面</a></h3>
	<h3><a href="/day14/01_jsp/dongtai/main.jsp">需求: 动态引入公共页面</a></h3>
	<h3><a href="/day14/01_jsp/03.jsp">out内置对象: 向浏览器输出内容</a></h3>
	<h3><a href="/day14/01_jsp/04.jsp">通过pageContext内置对象获取其他内置对象</a></h3>
	<h3><a href="/day14/01_jsp/05.jsp">通过pageContext内置对象 对域容器数据 进行 增删改</a></h3>
<h1>EL</h1>
	<h3><a href="/day14/02_el/01.jsp?username=zhangsan&city=beijing">需求: 获取用户提交的参数信息</a></h3>
	<h3><a href="/day14/02_el/02.jsp">需求: 获取请求头信息</a></h3>
	<h3><a href="/day14/02_el/03.jsp">需求: 获取浏览器给服务器传递的cookie信息</a></h3>
	<h3><a href="/day14/02_el/04.jsp">需求: 获取项目路径</a></h3>
	<h3><a href="/day14/02_el/05.jsp">需求: 获取域容器中的简单数据</a></h3>
	<h3><a href="/day14/02_el/06.jsp">需求: 获取域容器中自定义对象的值</a></h3>
	<h3><a href="/day14/02_el/07.jsp">需求: EL表达式执行运算</a></h3>
	<h3><a href="/day14/02_el/08.jsp">需求: 获取域容器中的复杂数据(数组, list, map)</a></h3>
<h1>JSTL</h1>
	<h3><a href="/day14/03_jstl/01.jsp">需求: 遍历域容器中的复杂数据(数组, list, map)</a></h3>
	<h3><a href="/day14/03_jstl/02.jsp">需求: 遍历 1~10, 偶数为红色, 奇数为蓝色</a></h3>
	<h3><a href="/day14/03_jstl/03.jsp">需求: 格式化日期</a></h3>
<h1>案例</h1>
	<h3><a href="/day1402/admin/home.jsp">需求: 显示商品信息</a></h3>
</body>
</html>