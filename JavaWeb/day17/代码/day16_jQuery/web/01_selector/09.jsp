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
	//需求1: 观察只读和不可用标签的联系和区别
	// 联系: 只能看,不能修改
	// 区别: 
			// 只读虽然不能修改,但是可以随表单一起提交
			// 不可用不仅不能修改, 还不能表单一起提交
	//需求2: 点击button 打印radio checkbox select 中选中项的值
	$(":button").click(function () {

		//打印 radio
		var _gender = $("input[name='gender']:checked").val();
		console.info("_gender: " + _gender)

        //打印 checkbox
		var _hobby = "";
		$("input[name='hobby']:checked").each(function () {
			_hobby += (this.value + "  ");
        });
        console.info("_hobby: " + _hobby)
		//打印  select
		//var _city = $("select").val();
		//var _city = $("select[name='city']").val();
		var _city = $("select[name='city'] option:selected").val();

        console.info("_city: " + _city)

    });
});
</script>
</head>
<body>
	<form>
		<%--
			只读和不可用的区别:
				相同点: 都不能修改里边的数据.
				不同点:
					只读: 会随着表单提交.
					不可用; 不会随着表单提交.
		--%>
		用户名(只读): <input type="text" readonly="readonly" name="username" value="zhangsan"/> <br/>
		密码(不可用): <input type="text" disabled="disabled" name="password" value="123"/> <br/>
		性别 
		<input type="radio" value="男" name="gender"/>男
		<input type="radio" value="女" name="gender"/>女 <br/>
		爱好
		<input type="checkbox" value="体育" name="hobby"/> 体育
		<input type="checkbox" value="读书" name="hobby" /> 读书
		<input type="checkbox" value="音乐" name="hobby" /> 音乐
		<input type="checkbox" value="绘画" name="hobby" /> 绘画 <br/>
		城市
		<select name="city">
			<option value="">请选择</option>
			<option value="北京">北京</option>
			<option value="上海">上海</option>
			<option value="天津">天津</option>
		</select> <br/>
		<input type="button" value="打印" />
		<input type="submit" value="点我提交">
	</form>
</body>
</html>