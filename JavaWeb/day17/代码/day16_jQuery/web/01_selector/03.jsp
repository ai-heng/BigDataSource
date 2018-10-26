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
	// 1．设置表格第一行，显示为红色
	$("table tr:first").css("color","red");

	// 2．设置表格除第一行以外 显示为蓝色
    //$("table tr:not(:first)").css("color","blue");
    $("table tr:gt(0)").css("color","blue");

    // 3．设置表格奇数行背景色 黄色			//行数从: 1开始数, 模拟现实生活中的数据
    $("table tr:even").css("background","yellow");

	// 4．设置表格偶数行背景色 绿色
    $("table tr:odd").css("background","green");

	// 5．设置页面中所有标题 显示为灰色
	$(":header").css("color","gray");

	// 6．设置页面中正在执行动画效果div背景黄色，不执行动画div背景绿色
	//动画效果指的是: 单击事件.
	$("div").click(function () {
		//动画效果
        $(this).slideUp("slow");

        //正在执行动画效果div背景黄色
        $("div:animated").css("background","yellow");
    });

	//不执行动画div背景绿色
	$("div:not(:animated)").css("background","green");

});
</script>
</head>
<body>
<h1>表格信息</h1>
	<h2>这是一张商品表</h2>
	<table border="1" width="600">
		<tr>
			<th>商品编号</th>
			<th>商品名称</th>
			<th>售价</th>
			<th>数量</th>
		</tr>
		<tr>
			<td>001</td>
			<td>冰箱</td>
			<td>3000</td>
			<td>100</td>
		</tr>
		<tr>
			<td>002</td>
			<td>洗衣机</td>
			<td>2000</td>
			<td>50</td>
		</tr>
		<tr>
			<td>003</td>
			<td>热水器</td>
			<td>1500</td>
			<td>20</td>
		</tr>
		<tr>
			<td>004</td>
			<td>手机</td>
			<td>2188</td>
			<td>200</td>
		</tr>
	</table>

	<div>slideDown(speed, [callback]) 概述
		通过高度变化（向下增大）来动态地显示所有匹配的元素，在显示完成后可选地触发一个回调函数。
		这个动画效果只调整元素的高度，可以使匹配的元素以“滑动”的方式显示出来。在jQuery
		1.3中，上下的padding和margin也会有动画，效果更流畅。 参数
		speedString,Number三种预定速度之一的字符串("slow", "normal", or
		"fast")或表示动画时长的毫秒数值(如：1000) callback (可选)FunctionFunction在动画完成时执行的函数</div>
	<div>fadeOut(speed, [callback]) 概述
		通过不透明度的变化来实现所有匹配元素的淡出效果，并在动画完成后可选地触发一个回调函数。
		这个动画只调整元素的不透明度，也就是说所有匹配的元素的高度和宽度不会发生变化。 参数
		speedString,Number三种预定速度之一的字符串("slow", "normal", or
		"fast")或表示动画时长的毫秒数值(如：1000) callback (可选)Function在动画完成时执行的函数</div>
</body>
</html>