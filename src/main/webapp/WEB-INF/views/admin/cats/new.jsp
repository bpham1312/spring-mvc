<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<h1>new cat</h1>
			</div>
			<form method="post"
				action="${pageContext.request.contextPath }/admin/cats/add" enctype="multipart/form-data">
				<div class="form-container">
					<div class="form-input">
						<label for="name">Cat name:</label> <input class="JS-fade" type="text" id="name"
							name="name" placeholder="Name">
					</div>
					<div class="form-input">
						<label for="image">Image:</label> <input class="JS-fade" type="file" id="image" required="required" accept="image/png, image/jpeg"
							name="file">
					</div>
					<div class="form-input">
						<label for="description">Description:</label>
						<textarea id="description" class="JS-fade" name="description" rows="5"></textarea>
					</div>
					<div class="form-input">
						<label for="idSpecies">Species name:</label> 
						<button type="button" class="btn-new" >New</button>
						<select name="selectSpecies" class="input JS-fade" id="idSpecies">
							<c:forEach var="species" items="${speciesList}">
							<option value="${species.id}">${species.name}</option>
							</c:forEach> 
						</select>
						<input type="text" id="description" class="new" name="new" placeholder="New species">
					</div>
					<div class="btn-container">
						<a class="btn-back"
							href="${pageContext.request.contextPath }/admin/cats">cancel</a>
						<button class="btn-submit" type="submit">Submit</button>
					</div>
				</div>
			</form>

		</div>
	</div>
	<script src="${pageContext.request.contextPath }/resources/asset/js/form.js"></script>
</body>
</html>