<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 24834
  Date: 2018/7/28
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页测试</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>

<c:forEach items="${categories}" var="category">
    <div class="alert alert-primary" role="alert">
        分类名：${category.id} 创建时间${category.createTime.toString()}
    </div>
</c:forEach>





</body>
</html>
