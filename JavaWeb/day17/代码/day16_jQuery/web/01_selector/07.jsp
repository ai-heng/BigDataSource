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
	// 1.在每个表格 下3的倍数行，字体颜色为红色
	$("table tr:nth-child(3n)").css("color","red");

	// 2.每个表格 奇数行 背景色 黄色	//行数从1数, 即: 索引从0开始.
	$("table tr:nth-child(odd)").css("background","yellow");

	// 3.每个表格 偶数行 背景色 灰色
    $("table tr:nth-child(even)").css("background","gray");

	// 4.每个tr 只有一个td的  背景为 蓝色
	$("tr td:only-child").css("background","blue");

});
</script>
</head>
<body>
	<table border="1" width="400" id="mytable">
		<tr><td>1</td><td>冰箱</td></tr>
		<tr><td>2</td><td>洗衣机</td></tr>
		<tr><td>3</td><td>热水器</td></tr>
		<tr><td>4</td><td>电饭锅</td></tr>
		<tr><td>5</td><td>电磁炉</td></tr>
		<tr><td>6</td><td>豆浆机</td></tr>
		<tr><td>7</td><td>微波炉</td></tr>
		<tr><td>8</td><td>电视</td></tr>
		<tr><td>9</td><td>空调</td></tr>
		<tr><td>10</td><td>收音机</td></tr>
		<tr><td>11</td><td>排油烟机</td></tr>
		<tr><td>12</td><td>加湿器</td></tr>
    	<tr><td>13 电暖气</td></tr>
	</table>
</body>
</html>