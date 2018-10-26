<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 获取用户请求头信息 -->
	<h3>Java写法</h3>
		Accept: <%=request.getHeader("Accept") %>  <br>
		User-Agent: <%=request.getHeader("User-Agent") %>

	<hr/>

	<h3>EL表达式写法</h3>
	Accept: ${header["Accept"]}  <br>
	User-Agent: ${header["User-Agent"]}

	<hr/>
	<%--EL表达式的优化版, 注意: 只针对于纯字母组成的属性名有效--%>
	Accept: ${header.Accept}  <br>
	User-Agent: ${header.User-Agent }

</body>
</html>