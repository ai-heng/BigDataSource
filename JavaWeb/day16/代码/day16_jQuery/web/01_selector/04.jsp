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
	// 1．设置含有文本内容 ”传智播客” 的 div 的字体颜色为红色
	$("div:contains('传智播客')").css("color","red");

	// 2．设置没有子元素的div元素 文本内容 ”这是一个空DIV“
	$("div:empty").html("这是一个空DIV");

	// 3．设置包含p元素 的 div 背景色为黄色
    $("div:has(p)").css("background","yellow");

	// 4．设置所有含有子元素的span字体为蓝色
    $("span:parent").css("color","blue");

});
</script>
</head>
<body>
	<div>今天是个晴天</div>
	<div>明天要去传智播客学 java</div>
	<div>
		<span>JavaScript</span> 是网页开发中脚本技术
	</div>
	<div>Ajax 是异步的 JavaScript和 XML</div>
	<div>
		<p>jQuery</p>
		是 JavaScript一个 轻量级框架
	</div>
	<div></div>
</body>
</html>