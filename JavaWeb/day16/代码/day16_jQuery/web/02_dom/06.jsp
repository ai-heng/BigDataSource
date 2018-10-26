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
	
	// 1 使用remove删除标签, 再将删除标签 重新加入body 查看事件是否存在
	
	// 2 使用detach删除标签, 再将删除标签 重新加入body 查看事件是否存在
	
	// 3 清空id='inner'的标签内容
	
});
</script>
</head>
<body>
	<div id="outer" style="background:blue;width:300px;height:300px;">
		<div id="inner" style="background:red;width:150px;height:150px;">你们的真的太棒了!!!</div>
	</div>
</body>
</html>