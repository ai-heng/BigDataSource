<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 回顾在jsp中嵌入java代码的三种方式 -->
	<h3>脚本表达式</h3>
	<%="abc" %>  <br>
	<%=true %>	<br>
	<%=10 %>

	<hr/>
	<h3>脚本片段</h3>
	<%--需求: 打印1~10的数字, 奇数蓝色, 偶数红色--%>
	<%
		for (int i = 1; i <= 10 ; i++) {
			if (i % 2 == 0) {
			    //偶数
	%>
			<font color="red"><%=i %></font>
	<%
			} else {
			    //奇数
	%>
			<font color="blue"><%=i %></font>
	<%
			}
		}
	%>

	<hr/>
	<h3>脚本声明</h3>
	<%!
		String name = "郭达";
		int age= 55;

		//定义方法, 求两个数的最大值
		public int getMax(int a,int b){
		    return a > b ? a : b;
		}
	%>
	name: <%=name %>					<br>
	age: <%=age %>						<br>
	3和5的最大值是: <%=getMax(3, 5)%>




</body>
</html>