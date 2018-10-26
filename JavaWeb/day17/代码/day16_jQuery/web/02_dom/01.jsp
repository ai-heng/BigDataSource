<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/j	query-1.11.0.min.js"></script>
<script type="text/javascript">
$(function(){
	/*
		设置属性的方式:
			attr();	 既可以设置(元素)没有的属性, 也可以设置(元素)有的属性.
			prop();  只能设置(元素)有的属性.

			总结:  //记忆
				关于选中的操作(单选, 复选, 下拉列表)都用prop(), 其他用attr().
	 */
	$("#btn1").click(function () {
		//$("a").attr("href","http://www.itheima.com");
		$("a").prop("href","http://www.itheima.com");
    });

    $("#btn2").click(function () {
        //$("a").attr("aaaa123","itcast");
        $("a").prop("aaaa123","itcast");
    });

    //实际开发中我们不用这种方式.
    $("#btn3").click(function () {
       $("input[name='sex']").each(function () {
           var _chk = $(this).attr("checked");
           console.info(_chk)
       })
    });

    $("#btn4").click(function () {
        $("input[name='sex']").each(function () {
            var _chk = $(this).prop("checked");
            console.info(_chk)
        })
    });
});
</script>
</head>
<body>
	<a>黑马程序员</a> <br/>
	<input type="button" id="btn1" value="设置标签存在的属性"/> <br/>
	<input type="button" id="btn2" value="设置标签不存在的属性"/> <br/>
	<hr/>
	
	<input type="radio" name="sex" value="女"/>女
	<input type="radio" name="sex" value="男" checked="checked"/>男 <br/>
	<input type="button" id="btn3" value="通过attr获取选中状态"/> <br/>
	<input type="button" id="btn4" value="通过prop获取选中状态"/>
</body>
</html>