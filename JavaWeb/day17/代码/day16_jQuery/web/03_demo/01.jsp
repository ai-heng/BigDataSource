<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/j	query-1.11.0.min.js"></script>

		<script type="text/javascript">
			$(function() {
				// 全选
				$("#checkall").click(function () {
					$("input[name='items']").prop("checked",true)
                });

				//全不选
                $("#checkallNo").click(function () {
                    $("input[name='items']").prop("checked",false)
                });

                //全选/全不选
				$("#checkAllOrNot").click(function () {
					//1. 获取id为 checkAllOrNot 的选中状态
					//console.info($(this).prop("checked"))

					//2. 设置 name="items"的复选框的状态 和 id为 checkAllOrNot 的选中状态 一致.
                    $("input[name='items']").prop("checked",$(this).prop("checked"))
                })
				
				//反选
				$("#check_revsern").click(function () {
					//核心思路: 以前是false, 现在变为true, 以前是true, 现在变为false.

					//1. 获取到每个复选框的选中状态, 设置取反即可.
					$("input[name='items']").each(function () {
						//获取当前的选中状态
						//console.info($(this).prop("checked"))
						var chk = $(this).prop("checked");

                        $(this).prop("checked", !chk)
                    });
                })
			});
		</script>
	</head>

<body>
		您的爱好很广泛!!!
		<br>
		<input type="checkbox" id="checkAllOrNot" />全选/全不选<br/>

		<input type="checkbox" name="items" value="足球" />足球
		<input type="checkbox" name="items" value="篮球" />篮球
		<input type="checkbox" name="items" value="游泳" />游泳
		<input type="checkbox" name="items" value="唱歌" />唱歌
		<br>
		<input type="button" name="checkall" id="checkall" value="全选" />
		<input type="button" name="checkall" id="checkallNo" value="全不选" />
		<input type="button" name="checkall" id="check_revsern" value="反选" />
	</body>

</html>