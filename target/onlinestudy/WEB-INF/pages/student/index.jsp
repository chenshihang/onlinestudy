<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 24834
  Date: 2018/7/29
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <style>
        body{
            background: #e6e6e6;
        }
        .iniline-block{
            display: inline-block;
        }
        .page-style{
            margin-top: 20px;
        }

    </style>
</head>
<body>
<script src="/static/js/jquery-3.3.1.js"></script>
<script src="/static/js/bootstrap.js"></script>

<div class="container">
    <jsp:include page="header.jsp"/>
    <c:forEach items="${videos}" var="video">
        <div class="card iniline-block" style="width: 22.5rem;">
            <a href="/to_video_play?videoId=${video.id}">
                <img class="card-img-top" src="${video.imgSrc}" alt="Card image cap">
            </a>
            <div class="card-footer">
                <p class="card-text">${video.title}</p>
            </div>
        </div>
    </c:forEach>

    <nav class="page-style" aria-label="Page navigation example ">
        <ul class="pagination">
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                    <span class="sr-only">Previous</span>
                </a>
            </li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item">
                <a class="page-link" href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                    <span class="sr-only">Next</span>
                </a>
            </li>
        </ul>
    </nav>
</div>
</body>
</html>
