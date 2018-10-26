<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>表格隔行变色和高亮</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<style type="text/css">
			table {
				border: 1px red solid;
				width: 500px;
				margin: auto;
			}
			
			td {
				border: 1px blue solid;
				margin: 10px;
				padding: 10px;
				text-align: center;
			}
			
			th {
				background-color: maroon;
			}
			
			.one {
				background-color: blue;
			}
			
			.two {
				background-color: green;
			}
			
			.over {
				background-color: aqua;
			}
		</style>
		<script src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(function(){
				//需求1: 表格隔行变色, 奇数行: 蓝色, 偶数行: 绿色

                //奇数行: 蓝色
				$("table tr:odd").addClass("one");

				//偶数行: 绿色
                $("table tr:even").addClass("two");

				//需求2: 高亮
				//分解版
				/*//鼠标悬浮事件
				$("table tr").mouseover(function () {
                    $(this).addClass("over");
                });
				//鼠标移出事件
                $("table tr").mouseout(function () {
                    $(this).removeClass("over");
                });*/

				//合并版
				$("table tr").hover(
                    function () {
                        $(this).addClass("over");
                    },
                    function () {
                        $(this).removeClass("over");
                    }
				);
			});
		</script>
	</head>

	<body>
		<table>
			<tr>
				<th>分类ID</th>
				<th>分类名称</th>
				<th>分类描述</th>
				<th>操作</th>
			</tr>
			<tr class="one">
				<td>1</td>
				<td>手机数码</td>
				<td>手机数码类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr class="two">
				<td>2</td>
				<td>电脑办公</td>
				<td>电脑办公类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>3</td>
				<td>鞋靴箱包</td>
				<td>鞋靴箱包类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>4</td>
				<td>家居饰品</td>
				<td>家居饰品类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>5</td>
				<td>鞋靴箱包</td>
				<td>鞋靴箱包类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>6</td>
				<td>家居饰品</td>
				<td>家居饰品类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>7</td>
				<td>鞋靴箱包</td>
				<td>鞋靴箱包类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>8</td>
				<td>家居饰品</td>
				<td>家居饰品类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>9</td>
				<td>家居饰品</td>
				<td>家居饰品类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
			<tr>
				<td>10</td>
				<td>家居饰品</td>
				<td>家居饰品类商品</td>
				<td><a href="">修改</a>|<a href="">删除</a></td>
			</tr>
		</table>

	</body>

</html>