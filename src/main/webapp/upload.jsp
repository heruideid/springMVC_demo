<%--
  Created by IntelliJ IDEA.
  User: 26411
  Date: 2020/5/28
  Time: 6:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/file/upload" method="post" enctype="multipart/form-data">
        上传图片:<input type="file" name="img"><br>
        <input type="submit" value="上传">
    </form>
    <img src="${path}">
</body>
</html>
