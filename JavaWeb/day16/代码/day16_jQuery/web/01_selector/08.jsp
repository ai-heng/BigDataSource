<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(function(){
	//1．对所有text框和password框，添加离焦事件，校验输入内容不能为空
	
	//2．对button 添加 点击事件，提交form表单
});
</script>
</head>
<body>
	<form action="login">
		用户名 <input type="text" name="username" /> <br/>
		密码 <input type="password" name="password" /> <br/>
		<input type="button" value="提交" />
	</form>
</body>
</html>