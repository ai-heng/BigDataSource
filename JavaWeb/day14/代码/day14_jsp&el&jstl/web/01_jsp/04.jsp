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
	// 通过pageContext内置对象获取4个域容器对象
	/*
		.jsp底层是一个Servlet, 有内置的 9 大对象.
			page, request, session, application(ServletContext)
			response, config(ServletConfig)
			out, exception, pageContext(作用: 相当于管家, 用来管理其他8大对象的)
	 */
	Object page1 = pageContext.getPage();
	ServletRequest request1 = pageContext.getRequest();
	HttpSession hs = pageContext.getSession();
	ServletContext sc = pageContext.getServletContext();

	//需求: 怎么证明 通过pageContext获取的 request对象 和 .jsp内置的request对象是同一个对象呢?
	//								request1					request
	//核心思路:  一个设置属性, 一个获取属性.
	request.setAttribute("money",50000);
%>
	你的月薪是: <%=request1.getAttribute("money") %>
</body>
</html>