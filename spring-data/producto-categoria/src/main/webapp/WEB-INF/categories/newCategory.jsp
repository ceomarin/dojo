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
<title>Template-Bootstrap</title>

</head>
<body>
	<div class="container">
		<div class="row py-5 w-25">
			<div class="col">
				<h1>New Category</h1>
				<form:form action="/categories/new" method="post"
					modelAttribute="category">
					<form:errors class="text-danger" path="name" />
					<div class="form-group">
						<form:label path="name">Name</form:label>
						<form:input class="form-control" path="name" />
					</div>
					<button class="btn btn-primary my-4" type="submit">Create</button>
				</form:form>
			</div>
		</div>
	</div>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>