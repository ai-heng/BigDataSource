<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 获取浏览器给服务器传递的cookie信息 -->
	<%--
		什么时候创建 Session容器呢?
			request.getSession(),  第一次访问.jsp页面.
	--%>
	<h3>Java写法</h3>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				out.print(cookie.getName() + "..." + cookie.getValue());
			}
		}
	%>

	<hr/>

	<h3>EL表达式写法</h3>
	Cookie对象: ${cookie.JSESSIONID }  <br>
	cookie的键:	${cookie.JSESSIONID.name }  <br>
	cookie的值: ${cookie.JSESSIONID.value}

</body>
</html>