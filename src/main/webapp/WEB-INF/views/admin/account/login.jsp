<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/css/admin/account.css">
<title>Login</title>
</head>
<body>
		<div id="form">
            <div class="head-form">Wellcome to Catshop</div>
            <div class="body-form">
                <form action="${pageContext.request.contextPath }/account/login" method="post">
                	<c:if test="${error != null}">
                		<label>${error}</label>
                	</c:if>
                	<input type="text" style="display:none" name="url" value="${URL}">
                    <input type="text" class="user-name" name="userName" placeholder="User name" required>
                    <input type="password" class="password" name="password" placeholder="Pass word" required>
                    <input type="submit" class="submit" value="Login">
                </form>
            </div>
            <div class="footer-form">Not a member? <a href="${pageContext.request.contextPath }/account/register">Sign up Now</a></div>
        </div>
</body>
</html>