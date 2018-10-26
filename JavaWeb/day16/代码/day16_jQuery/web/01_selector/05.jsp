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
	// 1．为表单中所有隐藏域  添加 class属性，值为itcast
	$("form :hidden").attr("class","itcast");

	// 2．设置table所有 可见 tr 背景色 黄色
	$("table tr:visible").css("background","yellow");

	// 3．设置table所有 隐藏tr 字体颜色为红色，显示出来 ，并输出tr中文本值
	var _tr = $("table tr:hidden").css("color","red").show();

	//获取所有(文本, 标签)
	console.info("_html: " + _tr.html());
	console.info("_html: " + _tr.text());

});
</script>
</head>
<body>
<!-- <h1>隐藏页面的标签</h1> -->
<!-- <span style="visibility:hidden">3333</span>4444 <br/> -->
<!-- <span style="display:none">1111</span>2222 <br/> -->

	<form>
		<input type="hidden" /> <input type="text" name="xxx"  style="display: none;" />
	</form>

	<table>
		<tr>
			<td>洗衣机</td>
		</tr>
		<tr>
			<td>热水器</td>
		</tr>
		<tr style="display: none">
			<td>电冰箱</td>
		</tr>
	</table>
</body>
</html>