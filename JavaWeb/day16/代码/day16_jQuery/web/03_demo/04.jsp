<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>test01.html</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<script src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/03_demo/cities.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
	$(function(){
		
	});
    </script>
  </head>
  <body>
     <select id="province" name="province">
       <option value="none">--请选择省--</option>
     </select>
     
	 <select id="city" name="city">
	 	<option value="none">--请选择市--</option>
	 </select>
  
  </body>
  
</html>
