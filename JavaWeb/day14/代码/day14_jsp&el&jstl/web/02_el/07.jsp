<%@ page import="java.util.ArrayList" %>
<%@ page import="com.itheima.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>需求1: 将a和b保存到page域中, 使用el计算 a+b</h1>
	<%
		/**
		 * 第一个参数: 参数名
		 * 第二个参数: 参数值
		 * 第三个参数: 参数所处的域容器的: 编号
		 * 			page, request, session , application , 对应1,2,3,4
		 */
		pageContext.setAttribute("a",10,1);
		pageContext.setAttribute("b",20,1);
		pageContext.setAttribute("c",30,1);
	%>
	a + b = ${a + b}

	<h1>需求2: 将a,b,c保存到page域中, 使用el计算 a+b+c</h1>
	a + b + c = ${a + b + c}

	<h1>需求1: 使用el表达式 判断集合是否为空</h1>
	<%
		//创建数据(集合)
		//注意, 这里的泛型必须写, 不然会有问题.
		ArrayList<String> list = new ArrayList<String>();		//菱形泛型
		list.add("a");
		//将数据设置到: request域容器中.
		//pageContext.setAttribute("list",list,2);
		request.setAttribute("list1",list);
	%>
		empty list:  ${empty list1 }		<br>
		not empty list: ${not empty list1}

	<h1>需求2: 使用el表达式 判断用户是否存在</h1>
	<%
		//创建用户
		//User user = new User("zhangsan",23);	//目的, 判断用户是否为空, 和用户对象的参数值无关.
		User user = null;
		//将用户对象, 设置到 request域容器中.
		request.setAttribute("user1",user);
	%>
	empty user1:  ${empty user1 }		<br>
	not empty user1: ${not empty user1}
</body>
</html>