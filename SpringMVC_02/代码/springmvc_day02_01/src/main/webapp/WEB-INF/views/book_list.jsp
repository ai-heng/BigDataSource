<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${bookList}" var="book">
        ${book.id} ${book.name} ${book.price} <br/>
    </c:forEach>
</body>
</html>
