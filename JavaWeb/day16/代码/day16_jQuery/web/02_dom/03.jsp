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
	// 1．<div><p>传智播客</p></div>  获取div中 html和text 对比
	
	// 2．单击pickBtn 使用val() 获得文本框、下拉框、单选框选中的value 
	
	// 3．单击setBtn 测试能否通过 val() 设置单选框、下拉框的选中效果 ？ 
});
</script>
</head>
<body>
	<div><p>传智播客</p></div>  
	<form>
		用户名 <input type="text" name="username" /> <br/>
		城市 <select>
				<option value="">请选择</option>
				<option value="北京">北京</option>
				<option value="上海">上海</option>
			</select><br/>
		爱好 <input type="checkbox" name="hobby" value="足球" />足球	
		 <input type="checkbox" name="hobby" value="篮球" />篮球	
		 <input type="checkbox" name="hobby" value="乒乓球" />乒乓球	
		 <input type="checkbox" name="hobby" value="排球" />排球 <br/>	

		性别 <input type="radio" name="gender" value="男" />男	
			<input type="radio" name="gender" value="女" />女 <br/>
		<input type="button" value="取值" id="pickBtn" />
		<input type="button" value="设值" id="setBtn" />
	</form>
</body>
</html>