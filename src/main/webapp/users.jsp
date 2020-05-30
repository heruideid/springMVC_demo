<%--
  Created by IntelliJ IDEA.
  User: 26411
  Date: 2020/5/27
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/list" method="post">
        用户1的id<input type="text" name="users[0].id">
        用户1的姓名<input type="text" name="users[0].name">
        用户2的id<input type="text" name="users[1].id">
        用户2的姓名<input type="text" name="users[1].name">
        <input type="submit" value="提交">
    </form>

</body>
</html>
