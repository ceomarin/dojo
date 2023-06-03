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
<title>New License</title>

</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-6">
				<h2>New License</h2>
				<form:form action="/licenses/new" method="post"
					modelAttribute="license">
					<div class="row mb-3">
						<form:errors class="text-danger" path="person"></form:errors>
						<form:errors class="text-danger" path="state"></form:errors>
						<form:errors class="text-danger" path="expirationDate"></form:errors>
					</div>
					<div class="form-outline mb-4">
						<form:label path="person" class="form-label" for="person">Person</form:label>
						<form:select path="person" class="form-control">
							<c:forEach items="${personas}" var="persona">
								<form:option value="${persona.id}">${persona}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-outline mb-4">
						<form:label path="state" class="form-label" for="state">State</form:label>
						<form:input path="state" type="text" id="state"
							class="form-control" />
					</div>
					<div class="form-outline mb-4">
						<form:label path="expirationDate" class="form-label"
							for="expirationDate">Expiration Date</form:label>
						<form:input path="expirationDate" type="date" id="expirationDate"
							class="form-control"/>
							
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