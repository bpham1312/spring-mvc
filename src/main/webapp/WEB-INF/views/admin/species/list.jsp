<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<h1>List species</h1>
		</div>
		<div class="new-icon">
			<a href="${pageContext.request.contextPath }/admin/species/new" class=""><i class="ti-plus">New</i></a>
		</div>
		<table>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>Action</th>
			</tr>
			<c:forEach var="species" items="${speciesList}">
			<tr>
				<td>${species.id}</td>
				<td>${species.name}</td>
				<td><a href="${pageContext.request.contextPath }/admin/species/delete?id=${species.id}" class=""><i class="ti-trash">Delete</i></a>
					<a href="${pageContext.request.contextPath }/admin/species/edit?id=${species.id}" class=""><i class="ti-pencil">Edit</i></a>
				</td>
			</tr>
			</c:forEach> 
		</table>
	</div>
	</div>

</body>
</html>