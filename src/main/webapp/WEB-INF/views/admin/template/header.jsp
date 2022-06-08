<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/asset/fonts/themify-icons/themify-icons.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/asset/css/admin/header.css">
</head>
<body>
	 <div id="header">
        <img src="${pageContext.request.contextPath }/resources/asset/images/logo/cat.png" alt="logo" class="logo">
        <lable class="user-name"><i class="ti-user"></i>${user}<i class="ti-angle-down"></i>
            <div class="sub-nav-menu">
                <a href="#" class=""></a>
                <a href="${pageContext.request.contextPath }/" class="">Index</a>
                <a href="${pageContext.request.contextPath }/account/login" class="">Logout</a>
            </div>
        </lable>
    </div>
</body>
</html>