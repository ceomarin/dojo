<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!--libreria core jstl-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- formating -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- formularios -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Error Page Directive -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />
<title>Dojo Survey Index</title>

</head>
<body>
	<div class="container py-5">
		<div class="row  py-3 position-relative card w-50 py-5">
			
				<h3>
					<u>Submitted Info</u>
				</h3>
				<p>Name: <c:out value="${ name}"></c:out></p>
				<p>Dojo Location: <c:out value="${ dojo}"></c:out></p>
				<p>Favorite Language: <c:out value="${ language}"></c:out></p>
				<p>Comment: <c:out value="${ comment}"></c:out></p>
			
			<div class="position-absolute bottom-0 end-0 py-4 ">
				<a href="/" class="btn btn-primary" tabindex="-1" role="button"
					aria-disabled="true">Go Back</a>
			</div>

		</div>
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="/js/app.js"></script>
</body>
</html>