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
<!-- <link rel="stylesheet" href="/css/style.css" /> -->
<title>title-page</title>

</head>
<body>
	<div class="container">
		<h1>Hello wolrd</h1>
		<div class="row">
		<div class="col">
		<p><c:out value="${error }" /></p>
			<form method="POST" action="/login">
			    <label>Username: <input type="text" name="username"></label>
			    <label>Password: <input type="password" name="password"></label>
			    <button>Login</button>
			</form>
		</div>
		</div>
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<!-- 	<script src="/js/app.js"></script> -->
</body>
</html>