<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 遍历 1~10, 偶数为红色, 奇数为蓝色-->
	<%--
		  begin      end    step
		for(int i=1; i<=10; i++) {
		}
	--%>

	<c:forEach begin="1" end="10" var="i" step="1" >
		<%--偶数--%>
		<c:if test="${i % 2 == 0}">
			<font color="red">${i } </font>
		</c:if>
		<%--奇数--%>
		<c:if test="${i % 2 != 0}">
			<font color="blue">${i } </font>
		</c:if>
	</c:forEach>
</body>
</html>