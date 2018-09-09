<%--
  Created by IntelliJ IDEA.
  User: 24834
  Date: 2018/7/29
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>视频播放</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <style>
        body{
            background: #eaf2fa;
        }
        .video{
            padding-left: 20px;
        }
        .video img{
            width: 20px;
            height: 20px;
        }
        .iniline-block{
            display: inline-block;
        }
        .video_play{

        }
        .video_comment{

            background: #e2f0fd;
            margin-bottom: 10px;
        }
        .comment_date{
            text-align: right;
        }

    </style>
</head>
<body>
<script src="/static/js/jquery-3.3.1.js"></script>
<script src="/static/js/bootstrap.js"></script>

<div class="container">

    <jsp:include page="header.jsp"/>
    <div class="video">
        <h3>视频的名字</h3>
        <hr>
        <p>类别：${video.categoryId}&nbsp;&nbsp;发布时间：${video.createTime}&nbsp;&nbsp; by：admin</p>
        <div class="iniline-block">
            <div class="iniline-block">
                <img  src="/static/img/video.svg"><span>&nbsp;&nbsp;${video.viewAmount}&nbsp;&nbsp;</span>
            </div>
            <div class="iniline-block">
                <a href="#comment">
                    <img src="/static/img/pinglun.svg">
                </a>
                <span>&nbsp;&nbsp;${video.commentAmount}&nbsp;&nbsp;</span>
            </div>
            <div class="iniline-block">
                <a href="#">
                    <img  src="/static/img/shoucang.svg">
                </a>
                <span>&nbsp;&nbsp;收藏：${video.collectAmount}&nbsp;&nbsp;</span>
            </div>
            <div class="iniline-block">
                <a href="#">
                    <img  src="/static/img/like.svg">
                </a>
                <span>&nbsp;&nbsp;喜欢：${video.likeAmount}&nbsp;&nbsp;</span>
            </div>
        </div>
        <div class="video_play">
            <video  width="100%" height="436" controls="controls">
                <source src="${video.path}" type="video/mp4">
                Your browser does not support the video tag.
            </video>
        </div>

        <hr>
        <div class="video_introduction">
            <p>视频简介：${video.introduction}</p>

        </div>
        <hr>

        <c:forEach items="${comments}" var="comment">
            <div class="video_comment">
                <div>
                    <a href="#">${comment.stuId}：</a>
                    <span>${comment.content}</span>
                </div>
                <div class="comment_date">
                    <span>${comment.createTime}</span>
                    <a href="#">回复</a>
                </div>
            </div>
        </c:forEach>

        <div id="comment" class="input-group mb-3">
            <input type="text" class="form-control" placeholder="发表评论" aria-label="Recipient's username" aria-describedby="button-addon2">
            <div class="input-group-append">
                <button class="btn btn-outline-secondary" type="button" id="button-addon2">发表评论</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
