<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div {
		padding : 10px;
		background-color : blue;
	}
		
	p {
		background-color : red;
	}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(function(){
	// 需求1:当点击btn1时,将外面的p标签 替换 里面的p标签
	$("#btn1").click(function () {
		/*
			替换的格式:
				新元素.replaceAll(旧元素);
				旧元素.replaceWith(新元素);
		 */
		//$("#myp").replaceAll($("#mydiv_p"));

        $("#mydiv_p").replaceWith($("#myp"));
    })

	// 需求2:当点击btn2时,将外面的p标签 替换且克隆 里面的p标签

    $("#btn2").click(function () {
        $("#myp").clone().replaceAll($("#mydiv_p"));

        //$("#mydiv_p").replaceWith($("#myp").clone());
    })
	
});
</script>
</head>
<body>
	<%--旧元素--%>
 	<div id="mydiv">
		<p id="mydiv_p">AAAA</p>
	</div>
	<%--新元素--%>
	<p id="myp">BBBB<a href="#">CCCC</a></p>

	<input type="button" id="btn1" value="替换"/>
	<input type="button" id="btn2" value="替换并克隆"/>
</body>
</html>