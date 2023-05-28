<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--libreria core jstl-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- formating -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!-- formularios -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Error Page Directive -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<title>Hola... Human</title>

</head>
<body>

	<h1>Hola
	<c:if test="${name == null}">
		Human
	</c:if> 
	<c:out value="${name}"></c:out>
	<c:out value="${ apellido}"></c:out>
	!
	</h1>
	<p>Welcome to SpringBoot!</p>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="/js/app.js"></script>
</body>
</html>