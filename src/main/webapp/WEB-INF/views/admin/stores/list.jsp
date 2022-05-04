<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png" href="${pageContext.request.contextPath }/resources/asset/images/logo/cat.png">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/css/admin/body-content.css">
<title>Nguyên Shop</title>
</head>
<body>
	<div id="container">
		<%@include file="../template/header.jsp"%>
		<%@include file="../template/listNav.jsp"%>
		<div id="content">
		<div class="content-header">
			<h1>List stores</h1>
		</div>
		<div class="new-icon">
			<a href="${pageContext.request.contextPath }/admin/stores/new" class=""><i class="ti-plus">New</i></a>
		</div>
		<table>
			<tr>
				<th>ID</th>
				<th>Cat name</th>
				<th>Quantity</th>
				<th>price</th>
				<th>Action</th>
			</tr>
			<c:forEach var="stores" items="${storesList}">
			<tr>
				<td>${stores.id}</td>
				<td>${stores.cats.name}</td>
				<td>${stores.quantity}</td>
				<td><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${stores.price}"/>VND</td>
				<td><a href="${pageContext.request.contextPath }/admin/stores/delete?id=${stores.id}" class=""><i class="ti-trash">Delete</i></a>
					<a href="${pageContext.request.contextPath }/admin/stores/edit?id=${stores.id}" class=""><i class="ti-pencil">Edit</i></a>
				</td>
			</tr>
			</c:forEach> 
		</table>
	</div>
	</div>

</body>
</html>