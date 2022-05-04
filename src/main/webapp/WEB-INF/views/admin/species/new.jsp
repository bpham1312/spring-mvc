<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath }/resources/asset/images/logo/cat.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/asset/css/admin/body-content.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/asset/css/admin/form.css">
<title>Nguyên Shop</title>
</head>
<body>
	<div id="container">
		<%@include file="../template/header.jsp"%>
		<%@include file="../template/listNav.jsp"%>
		<div id="content">
			<div class="content-header">
				<h1>new species</h1>
			</div>
		<form method= "post" action="${pageContext.request.contextPath }/admin/species/add">
			<div class="form-container">
				<div class="form-input">
					<label for="name">Species name:</label>
					<input type="text" id="name" class="JS-fade" name="name" placeholder="Name">
				</div>
				<div class="btn-container">
					<a class="btn-back" href="${pageContext.request.contextPath }/admin/species">cancel</a>
					<button class="btn-submit" type="submit">Submit</button>
				</div>
			</div>
		</form>

		</div>
	</div>

</body>
</html>