<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 20.11.24
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有账户执行成功</h2>
<c:forEach items="${accounts}" var="account">
    ${account.name}
</c:forEach>



</body>
</html>
