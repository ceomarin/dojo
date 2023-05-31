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
<!--<link rel="stylesheet" href="/css/style.css" /> -->
<title>${language.name}</title>

</head>
<body>
	<div class="container py-5">
	<div class="row w-50">
	<div class="col">
		<a href="/languages" class="d-block text-end">Dashboard</a>
		<p class="mb-5">${language.name}</p>
		<p class="mb-5">${language.creator}</p>
		<p class="mb-5">${language.currentVersion}</p>

		<form action="/languages/${language.id}" method="post">
			<input type="hidden" name="_method" value="delete">
			<button type="submit" class="btn btn-link d-block">Delete</button>
			<!--<a href="/languages/${language.id}/edit" class="btn btn-link">Edit</a>-->
		</form>
		<form action="/languages/${language.id}/edit" method="post">
			<input type="hidden" name="_method" value="put">
			<!-- <a href="/languages/${language.id}/edit" class="btn btn-link">Edit</a> -->
			<button type="submit" class="btn btn-link d-block">Edit</button>
		</form>
	
	</div>
	</div>
	</div>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>