<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 格式化日期 -->
	<%
		//创建日期对象,
		Date date = new Date();
		//将其设置到: request域容器中
		request.setAttribute("date",date);
	%>
	日期: ${date }

	<hr/>
	<%--对日期对象进行格式化--%>
	日期: <fmt:formatDate value="${date }" pattern="yyyy/MM/dd HH:mm:ss"></fmt:formatDate>

</body>
</html>