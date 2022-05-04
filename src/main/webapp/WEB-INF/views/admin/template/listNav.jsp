<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/asset/css/admin/nav.css">
</head>
<body>
	<div id="list-nav">
		<div class="head-list">
            <h1 class="">dash board</h1>
        </div>
		<ul class="nav">
			<li>Species
				<ul class="sub-nav">
					<a href="${pageContext.request.contextPath }/admin/species" class=""><li>List</li></a>
					<a href="${pageContext.request.contextPath }/admin/species/new" class=""><li>New</li></a>
				</ul>
			</li>
			<li>cats
				<ul class="sub-nav">
					<a href="${pageContext.request.contextPath }/admin/cats" class=""><li>List</li></a>
					<a href="${pageContext.request.contextPath }/admin/cats/new" class=""><li>New</li></a>
				</ul>
			</li>
			<li>store
				<ul class="sub-nav">
					<a href="${pageContext.request.contextPath }/admin/stores" class=""><li>List</li></a>
					<a href="${pageContext.request.contextPath }/admin/stores/new" class=""><li>New</li></a>
				</ul>
			</li>
		</ul>
	</div>
	<script
		src="${pageContext.request.contextPath }/resources/asset/js/listNav.js">
	</script>
</body>
</html>