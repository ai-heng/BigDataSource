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
	// 1.设置所有含有id属性的div，字体颜色红色
	$("div[id]").css("color","red");

	// 2.设置所有class属性值 含有itcast元素背景色为黄色
	$("[class*='itcast']").css("background","yellow");

	// 3.对所有既有id又有class属性div元素，添加一个点击事件，打印div标签中内容
	$("div[id][class]").click(function() {
	    console.info($(this).text());
	});

	// 4 获取属性name="hobby"的input标签, 打印value属性值
	$("input[name='hobby']").each(function() {
	    console.info($(this).val());
	});
});
</script>
</head>
<body>
	<div>AAAA</div>
	<div id="mydiv" class="itcast1">BBBB</div>
	<div class="itcast2">CCCC</div>
	<div id="mydiv2">DDDD</div>
	<div class="divclass">EEEE</div>
	<div id="xxx" class="itcast3">FFFF</div>
	<p class="p-itcast">PPPPPP</p>
	
	<input type="checkbox" name="hobby" value="高尔夫"/> 高尔夫
	<input type="checkbox" name="hobby" value="蹦极"/> 蹦极
	<input type="checkbox" name="hobby" value="足球"/> 足球 
	
</body>
</html>