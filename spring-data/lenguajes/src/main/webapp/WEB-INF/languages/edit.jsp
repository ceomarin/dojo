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
	<div class="container mt-5">
		<div class="row w-75">
		<div class="d-flex justify-content-end">
			<form action="/languages/${language.id}" method="post">
				<input type="hidden" name="_method" value="delete">
				<button type="submit" class="btn btn-link">Delete</button>
				<a href="/languages" class="btn btn-link"> Dashboard </a>
			</form>
		</div>
		<form:form action="/languages/${language.id}" method="post"
			modelAttribute="language" class="mt-5 p-3">
			<input type="hidden" name="_method" value="put">
			<div class="mb-3">
				<div>
					<form:errors path="name" />
				</div>
				<div class="d-flex justify-content-between">
					<form:label for="name" class="" path="name">Name</form:label>
					<form:input type="text" class="w-50" path="name" />
				</div>
			</div>
			<div class="mb-3">
				<div>
					<form:errors path="creator" />
				</div>
				<div class="d-flex justify-content-between">
					<form:label for="creator" class="" path="creator">Creator</form:label>
					<form:input type="text" class="w-50" path="creator" />
				</div>
			</div>
			<div class="mb-3">
				<div>
					<form:errors path="currentVersion" />
				</div>
				<div class="d-flex justify-content-between">
					<form:label for="currentVersion" class="" path="currentVersion">Version</form:label>
					<form:input type="text" class="w-50" path="currentVersion" />
				</div>
			</div>

			<div class="mb-3 d-flex justify-content-end">
				<button type="submit" class="btn btn-lg btn-primary w-25">Submit</button>
			</div>
		</form:form>
		
		</div>
	</div>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>