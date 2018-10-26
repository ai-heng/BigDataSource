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
<%
	//page, request, session, application四大域容器对应的数字分别是: 1, 2, 3, 4

	// 1 通过pageContext内置对象 增加数据(往不同的域容器中添加数据)
	pageContext.setAttribute("city","北京1",PageContext.PAGE_SCOPE);
	pageContext.setAttribute("city","北京2",PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("city","北京3",PageContext.SESSION_SCOPE);
	pageContext.setAttribute("city","北京4",PageContext.APPLICATION_SCOPE);

	//pageContext.setAttribute("city","北京5");		//默认往 page域容器中设置.

	// 3 通过pageContext内置对象 删除数据
	//pageContext.removeAttribute("city");			//移除所有
	pageContext.removeAttribute("city",1);
	pageContext.removeAttribute("city",4);

	// 2 通过pageContext内置对象 获取数据
	//out.print(pageContext.getAttribute("city"));	//默认往 page域容器中获取.
	/*out.print(pageContext.getAttribute("city",1));
	out.print(pageContext.getAttribute("city",2));
	out.print(pageContext.getAttribute("city",3));
	out.print(pageContext.getAttribute("city",4));*/

	// 4 通过pageContext内置对象 获取域中数据的简化方式
	//out.print(pageContext.findAttribute("city"));	//默认按照: page, request, session, application的顺序查找


	// 5 通过pageContext内置对象 操作复杂数据
	//5.1 创建分类对象
	Category c = new Category("c111","汽车分类");
	//5.2 创建商品对象.
	Product p = new Product("p666","G63 AMG", 165, c);

	//5.3 将商品对象设置到: request域容器中.
	//pageContext.setAttribute("product",p,PageContext.REQUEST_SCOPE);
	pageContext.setAttribute("product",p,2);
%>
	商品的名字:	<%=((Product)pageContext.getRequest().getAttribute("product")).getPname() %>  <br/>
	商品的分类名: <%=((Product)pageContext.getRequest().getAttribute("product")).getCategory().getCname() %>

	<hr/>
	<%--
		为什么要学习EL表达式?
			用来简化 jsp中java代码的写法的.

			格式:
				${域容器.属性名.该属性具体的属性名}
	--%>
	商品的名字: ${requestScope.product.pname}	 <br/>
	商品的分类名: ${requestScope.product.category.cname}

	<hr/>
	商品的名字: ${product.pname}	 <br/>
	商品的分类名: ${product.category.cname}


</body>
</html>