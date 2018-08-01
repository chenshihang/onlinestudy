<%--
  Created by IntelliJ IDEA.
  User: 24834
  Date: 2018/8/1
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>

<div class="container">
    <h3 class="text-center">online-study登录</h3>
    <form action="/do_login">
        <div class="form-group">
            <label for="stuNum">学号</label>
            <input name="stuNum" type="text" class="form-control" id="stuNum"  placeholder="enter you studentNumber">
        </div>
        <div class="form-group">
            <label for="password">密码</label>
            <input name="password" type="password" class="form-control" id="password" placeholder="Password">
        </div>

        <button type="submit" class="btn btn-primary">登录</button>
    </form>
</div>
</body>
</html>
