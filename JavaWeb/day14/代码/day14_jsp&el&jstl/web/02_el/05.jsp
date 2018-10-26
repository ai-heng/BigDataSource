<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 获取域容器中的简单数据, 非自定义类型的数据 -->
	<h3>Java写法</h3>
	<%
		//往域容器中设置值
		pageContext.setAttribute("city","北京1",PageContext.PAGE_SCOPE);
		pageContext.setAttribute("city","北京2",PageContext.REQUEST_SCOPE);
		pageContext.setAttribute("city","北京3",PageContext.SESSION_SCOPE);
		pageContext.setAttribute("city","北京4",PageContext.APPLICATION_SCOPE);
	%>
		<%=pageContext.getAttribute("city",1) %>		<br>
		<%=pageContext.getAttribute("city",2) %>		<br>
		<%=pageContext.getAttribute("city",3) %>		<br>
		<%=pageContext.getAttribute("city",4) %>

	<hr/>

	<h3>EL表达式写法</h3>
		${pageScope.city}	<br>
		${requestScope.city}	<br>
		${sessionScope.city}	<br>
		${applicationScope.city}	<br>
</body>
</html>