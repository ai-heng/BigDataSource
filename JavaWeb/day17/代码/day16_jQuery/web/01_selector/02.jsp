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
	// 1．将class属性值为itcast的元素下所有a元素字体变为红色
	$(".itcast a").css("color","red");

	// 2．将class属性值为itcast的元素下直接a元素字体变为蓝色
    $(".itcast > a").css("color","blue");

	// 3．将div元素后所有兄弟a元素，字体变为黄色，大小变为30px
	$("div ~ a").css({
		"color":"yellow",
		"font-size":"30px"
	});
});
</script>
</head>
<body>
	<div class="itcast">
		<a>div link</a>
		<p>
			info <a>p link</a>
		</p>
	</div>
	<a>link</a>
	<p class="itcast">
		<a>p link</a>
	</p>
	<a>link</a>
</body>
</html>