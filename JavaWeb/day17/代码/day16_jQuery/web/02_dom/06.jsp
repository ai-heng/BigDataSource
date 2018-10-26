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
    //给id为inner的div绑定一个: 单击事件
	$("#inner").click(function () {
		alert("不要点我...")
    });
	
	// 1 使用remove删除标签, 再将删除标签 重新加入body 查看事件是否存在
	/*var _inner = $("#inner").remove();		//能获取到删除的元素的引用, 重新添加后, 事件不存在.
	$("body").append(_inner);*/
	
	// 2 使用detach删除标签, 再将删除标签 重新加入body 查看事件是否存在
	/*var _inner = $("#inner").detach();		//会保留事件
	$("body").append(_inner)*/

	// 3 清空id='inner'的标签内容
	$("#inner").empty();
});
</script>
</head>
<body>
	<div id="outer" style="background:blue;width:300px;height:300px;">
		<div id="inner" style="background:red;width:150px;height:150px;">你们的真的太棒了!!!</div>
	</div>
</body>
</html>