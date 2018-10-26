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
	// 1．通过each() 在每个div元素前 加入 “传智播客”
	$("div").each(function() {
	    //$(this): 表示每个div
		//$(this).html() 获取每个div的值.

		$(this).html("传智播客 " + $(this).html());
	});
	// 2．通过size() / length 打印页面中 class属性为 itcast 的元素数量
	var _size = $(".itcast").size();
	var _length = $(".itcast").length;

	console.info(_size);
	console.info(_length);

	// 3．通过index()  打印 id属性为foo 的div标签 是页面内的第几个div标签
	var _num = $("div").index($("#foo"));
	console.info("_num: " + _num)

});
</script>
</head>
<body>
	<div>DIVAAAA</div>
	<div class="itcast">DIVBBBB</div>
	<div>DIVCCCC</div>
	<div>DIVDDDD</div>
	<div class="itcast">DIVEEEE</div>
	<div id="foo">DIVFFFF</div>
	<p>PAAAA</p>
	<p class="itcast">PBBBB</p>
	<p>PCCCC</p>
</body>
</html>