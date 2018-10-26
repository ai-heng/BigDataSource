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
	// 插入大专学历 （本科和高中之间）--- 外部插入
	//格式: 老元素.after(新元素);
	$("option[value='本科']").after("<option value='大专'>大专</option>");

	// 插入幼儿园 （学历列表最后） --- 内部插入
	$("#edu").append("<option value='幼儿园'>幼儿园</option>");
});
</script>
</head>
<body>
	<!-- 选择学历 -->
	<select id="edu" name="edu">
		<option value="">请选择</option>
		<option value="本科">本科</option>
		<option value="高中">高中</option>
		<option value="中专">中专</option>
		<option value="小学">小学</option>
	</select>
</body>
</html>