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
	var _html = $("div").html();		//文本, 标签
	var _text = $("div").text();		//文本
	console.info("_html: " + _html)
	console.info("_text: " + _text)

	// 2．单击pickBtn 使用val() 获得文本框、下拉框、单选框选中的value
	$("#pickBtn").click(function () {
		//获取文本框, 用户名
		var _username = $("input[name='username']").val();
		console.info("_username: " + _username);

		//获取下拉框, 城市
		//var _city = $("select").val();
		var _city = $("select option:selected").val();
        console.info("_city: " + _city);

        //获取复选框, 选中的value
		var _hobby = "";
		$("input[name='hobby']:checked").each(function () {
			_hobby += (this.value + "  " );
        });
        console.info("_hobby: " + _hobby);

        //获取单选框, 选中的value
        var _gender = $("input[name='gender']:checked").val();
        console.info("_gender: " + _gender);
    })

	// 3．单击setBtn 测试能否通过 val() 设置单选框、下拉框的选中效果 ？ 
	$("#setBtn").click(function () {
		//设置文本框的值.
		$("input[name='username']").val("zhangsanLove李四");

		//设置下拉列表
		$("select").val("北京");

		//设置爱好
		$("input[name='hobby']").val(["足球","乒乓球"]);

		//设置性别:
		$("input[name='gender']").val(["女"]);
    });
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