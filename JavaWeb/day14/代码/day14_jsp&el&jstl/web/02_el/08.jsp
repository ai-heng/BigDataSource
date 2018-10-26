<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 需求: 获取域容器中的复杂数据(数组, list, map), EL表达式没有循环-->
	<%
		//创建数组
		int[] arr = {11,22,33};
		//将其设置到: request域容器中.
		request.setAttribute("arr1",arr);
	%>
		数组对象: ${arr1 }	<br>
		数组中的元素:
			${arr1[0] }  ${arr1[1] }  ${arr1[2] }  ${arr1[222] }

	<hr/>
	<%
		//创建集合
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		//将其设置到: request域容器中.
		request.setAttribute("list1",list);
	%>
		集合对象: ${list1 }	<br>
		集合中的元素:
			${list1[0] }  ${list1[1] }  ${list1[2] }  ${list1[222] }

	<hr/>
	<%
		//创建集合
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("风女", 36);
		hm.put("亚索", 33);
		hm.put("盲僧", 23);

		//将其设置到: request域容器中.
		request.setAttribute("hm1",hm);
	%>
		集合对象: ${hm1 }	<br>
		集合中的元素:	  <br>
		&nbsp;&nbsp;&nbsp;&nbsp;风女...${hm1.风女 }		<br>
		&nbsp;&nbsp;&nbsp;&nbsp;亚索...${hm1.亚索 }		<br>
		&nbsp;&nbsp;&nbsp;&nbsp;盲僧...${hm1.盲僧 }


</body>
</html>