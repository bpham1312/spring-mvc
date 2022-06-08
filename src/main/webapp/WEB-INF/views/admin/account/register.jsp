<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/css/admin/account.css">
<title>Register</title>
</head>
<body>
	<div id="form">
            <div class="head-form">Sign up</div>
            <div class="body-form">
                <form action="${pageContext.request.contextPath }/account/register" method="post">
                	<c:if test="${error != null}">
                		<label>${error}</label>
                	</c:if>
                    <input type="text" class="user-name" name="userName" placeholder="User name" required>
                    <input type="password" class="password" name="password" placeholder="Pass word" required>
                    <input type="submit" class="submit" value="Submit">
                </form>
            </div>
            <div class="footer-form">Already a member? <a href="${pageContext.request.contextPath }/account/login">Login Now</a></div>
        </div>
</body>
</html>