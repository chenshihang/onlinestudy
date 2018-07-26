<%--
  Created by IntelliJ IDEA.
  User: 24834
  Date: 2018/7/26
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小视频上传</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
    <script src="/static/js/jquery-3.3.1.js"></script>
    <script src="/static/js/bootstrap.js"></script>
    <div class="container">
        <form  action="/do_video_upload" method="post" enctype="multipart/form-data">
            <div class="form-group">
                <label for="video_title">视频名字</label>
                <input id="video_title" name="title" class="form-control" type="text"  >
            </div>
            <div class="form-group">
                <label for="video_introduction">视频简介</label>
                <input id="video_introduction" name="introduction" class="form-control" type="text"  >
            </div>
            <div class="form-group">
                <label for="video_file">选择视频文件</label>
                <input type="file" id="video_file" name="video_file" class="form-control">
            </div>
            <button type="submit" class="btn btn-primary">上传</button>
        </form>
    </div>
</body>
</html>
