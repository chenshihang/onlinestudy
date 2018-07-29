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
    <nav class="navbar navbar-expand-lg navbar-light ">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="#">最新视频 <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">热门推荐</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        分类
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <c:forEach items="${categories}" var="category">
                            <a class="dropdown-item" href="#">${category.name}</a>
                            <div class="dropdown-divider"></div>
                        </c:forEach>
                    </div>
                </li>
                <li class="nav-item">
                    <c:choose>
                        <c:when test="${empty current_stu}">
                            <a class="nav-link" href="#">${current_guest}</a>
                        </c:when>
                        <c:otherwise>
                            <a class="nav-link" href="#">${current_stu.name}</a>
                        </c:otherwise>
                    </c:choose>
                </li>
            </ul>

            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
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
