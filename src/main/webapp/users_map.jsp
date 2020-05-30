<%--
  Created by IntelliJ IDEA.
  User: 26411
  Date: 2020/5/27
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/map" method="post">
        用户1的id:<input type="text" name="users['a'].id"><br>
        用户1的姓名:<input type="text" name="users['a'].name"><br>
        用户2的id:<input type="text" name="users['b'].id"><br>
        用户2的姓名:<input type="text" name="users['b'].name"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
