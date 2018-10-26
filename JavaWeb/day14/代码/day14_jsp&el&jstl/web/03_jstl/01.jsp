<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 遍历域容器中的复杂数据(数组, list, map) -->
	<%
		//创建数组
		int[] arr = {11,22,33};
		//将其设置到: request域容器中.
		request.setAttribute("arr1",arr);
	%>
	<%--通过jstl的标签, 遍历数组--%>
	<c:forEach items="${arr1}" var="i">
		${i }	<br>
	</c:forEach>

	<hr/>
	<%
		//创建集合
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		//将其设置到: request域容器中.
		request.setAttribute("list1",list);
	%>
	<c:forEach items="${list1}" var="e">
		${e } <br>
	</c:forEach>


	<hr/>
	<%
		//创建集合
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("风女", 36);
		hm.put("亚索", 33);
		hm.put("盲僧", 23);

		//将其设置到: request域容器中.
		request.setAttribute("hm1",hm);
	%>
	<c:forEach items="${hm1}" var="entry">
		${entry.key} ... ${entry.value}		<br>
	</c:forEach>


</body>
</html>