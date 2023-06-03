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
<title>New Person</title>

</head>
<body>
	<div class="container py-5">
		<div class="row justify-content-center w-50">
			<div class="col ">
				<h1>New Person</h1>
				<form:form action="/persons/new" method="post" modelAttribute="person">
					<div class="row mb-3">
						<form:errors class="text-danger" path="firstName"></form:errors>
					</div>
					<div class="form-outline mb-4">
						<form:label path="firstName" class="form-label" for="firstName">First Name:</form:label>
						<form:input path="firstName" type="text" id="firstName"
							class="form-control" />
					</div>
					<div class="row mb-3">
						<form:errors class="text-danger" path="lastName"></form:errors>
					</div>
					<div class="form-outline mb-4">
						<form:label path="lastName" class="form-label" for="lastName">Last Name:</form:label>
						<form:input path="lastName" type="text" id="lastName"
							class="form-control" />
					</div>
					<button type="submit" class="btn btn-primary btn-block mb-4">Create</button>
				</form:form>
			</div>
		</div>
	</div>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>