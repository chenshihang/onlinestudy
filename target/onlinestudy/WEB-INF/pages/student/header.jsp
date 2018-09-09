<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<link rel="stylesheet" href="/static/css/bootstrap.css">--%>
<%--<script src="/static/js/jquery-3.3.1.js"></script>--%>
<%--<script src="/static/js/bootstrap.js"></script>--%>
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
						<a class="nav-link" href="/to_login">${current_guest},去登陆</a>
					</c:when>
					<c:otherwise>
						<a class="nav-link" href="/to_stu_info">${current_stu.name}</a>
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
	
    
