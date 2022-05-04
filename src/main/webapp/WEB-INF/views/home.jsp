<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<c:forEach var="stores" items="${storesList}">
		<span>${stores.cats.name}</span>
		<span>${stores.quantity}</span>
		<span>${stores.price}</span>
	</c:forEach>
</body>
</html>
