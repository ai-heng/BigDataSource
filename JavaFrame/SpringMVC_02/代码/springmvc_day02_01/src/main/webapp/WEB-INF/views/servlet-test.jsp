<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3 style="color:red">${requestScope.msg1}</h3>
    <h3 style="color:green">${requestScope.msg2}</h3>
    <h3 style="color:blue">${sessionScope.msg3}</h3>
    <hr/>
    <h3 style="color:green">${requestScope.msg}</h3>
    <h3 style="color:green">${msg}</h3>


</body>
</html>
