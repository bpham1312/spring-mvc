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
				<h1>edit stores</h1>
			</div>
		<form method= "post" action="${pageContext.request.contextPath }/admin/stores/update">
				<div class="form-container">
					<div class="form-input">
						<label for="idCats">Cat:</label>
						<button type="button" class="btn-new" >New</button>
						<select name="selectCats" id="idSCats" class="input JS-fade">
							<option value="${stores.cats.id}">${stores.cats.name}</option>
							<c:forEach var="cats" items="${catsListByStores}">
							<c:if test = "${cats.id != stores.cats.id}">
								<option value="${cats.id}">${cats.name}</option>
							</c:if>
							</c:forEach>
						</select>
						<input type="text" id="description" class="new" name="new" placeholder="New cat">
					</div>
					<div class="form-input">
						<label for="quantity">Quantity:</label> <input class="JS-fade" type="number" min="1" id="quantity"
							name="quantity" value="${stores.quantity}">
					</div>
					<div class="form-input">
						<label for="price">Price:</label> <input class="JS-fade" type="number" min="1" id="price"
							name="Price" value="${stores.price}">
					</div>
					<div class="btn-container">
						<a class="btn-back"
							href="${pageContext.request.contextPath }/admin/stores">cancel</a>
						<button class="btn-submit" name="id" value="${stores.id}" type="submit">Submit</button>
					</div>
				</div>
		</form>
		</div>
	</div>
<script src="${pageContext.request.contextPath }/resources/asset/js/form.js"></script>
</body>
</html>