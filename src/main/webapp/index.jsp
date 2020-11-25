<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 20.11.24
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>欢迎整合入门。。。</h2>
    <a href="account/findAll">测试</a>

    <h1> 测试保存方法....</h1>

    <form action="account/save" method="post">
        姓名：<input type="text" name="name" /><br/>
        金额：<input type="text" name="money" /><br/>
        <input type="submit" value="save"><br/>
    </form>
</body>
</html>
