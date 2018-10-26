<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 获取用户提交的参数信息 -->
	<h3>Java写法</h3>
		username: <%=request.getParameter("username") %>  <br/>
		city: <%=request.getParameter("city") %>
	<hr/>
	<h3>EL表达式写法</h3>
		username: ${param.username}	<br/>
		city:	${param.city}
</body>
</html>