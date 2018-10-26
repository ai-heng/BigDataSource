<%@ page import="com.itheima.domain.Category" %>
<%@ page import="com.itheima.domain.Product" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 获取域容器中的复杂数据(自定义对象)-->
	<h3>Java写法</h3>
	<%
		//往域容器中设置值.
		//创建数据
		Category c = new Category("c111","汽车分类");
		Product p = new Product("p666","G63 AMG", 165, c);

		//将商品对象设置到: request域容器中.
		//pageContext.setAttribute("product",p,PageContext.REQUEST_SCOPE);
		pageContext.setAttribute("product",p,2);
	%>
	商品的名字:	<%=((Product)pageContext.getAttribute("product",2)).getPname() %>  <br>
	商品的分类名字: <%=((Product)pageContext.getAttribute("product",2)).getCategory().getCname() %>

	<hr/>

	<h3>EL表达式写法</h3>
	商品的名字:	${requestScope.product.pname }  <br>
	商品的分类名字: ${requestScope.product.category.cname}

	<hr/>
	<h3>EL表达式写法_优化版</h3>
	商品的名字:	${product.pname }  <br>
	商品的分类名字: ${product.category.cname}

</body>
</html>