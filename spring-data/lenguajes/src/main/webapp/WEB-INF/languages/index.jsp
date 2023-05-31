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
<title>Languages</title>

</head>
<body>
	<div class="container py-5">
		<div class="row">

			<div class="col">
				<table class="table mt-5">
					<thead>
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Creator</th>
							<th scope="col">Version</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="language" items="${languages}">
							<tr>
								<td><a href="/languages/${language.id}">${language.name}</a></td>
								<td>${language.creator}</td>
								<td>${language.currentVersion}</td>
								<td class="d-flex">
									<form action="/languages/${language.id}" method="post">
										<input type="hidden" name="_method" value="delete">
										<button type="submit" class="btn btn-link">Delete</button>
										<!--<a href="languages/${language.id}/edit" class="btn btn-link">Edit</a>-->
									</form>
									<form action="/languages/${language.id}/edit" method="post">
										<input type="hidden" name="_method" value="put">
										<!-- <a href="/languages/${language.id}/edit" class="btn btn-link">Edit</a> -->
										<button type="submit" class="btn btn-link d-block">Edit</button>
									</form>

								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>

		<div class="row w-75 align-middle">
			<div class="col ">
				<form:form action="/languages" method="post"
					modelAttribute="lenguaje" class="mt-5 p-3">
					<div class="mb-3">
						<div class="">
							<form:errors path="name" cssClass="text-danger"/>
						</div>
						<div class="d-flex justify-content-between">
							<form:label for="name" class="fs-4" path="name">Name</form:label>
							<form:input type="text" class="w-50" path="name" />
						</div>
					</div>
					<div class="mb-3">
						<div class="">
							<form:errors path="creator" cssClass="text-danger" />
						</div>
						<div class="d-flex justify-content-between">
							<form:label for="creator" class="fs-4" path="creator">Creator</form:label>
							<form:input type="text" class="w-50" path="creator" />
						</div>
					</div>
					<div class="mb-3">
						<div class="">
							<form:errors path="currentVersion" cssClass="text-danger" />
						</div>
						<div class="d-flex justify-content-between">
							<form:label for="currentVersion" class="fs-4" path="currentVersion">Version</form:label>
							<form:input type="text" class="w-50" path="currentVersion" />
						</div>
					</div>

					<div class="mb'3 d-flex justify-content-end">
						<button type="submit" class="btn btn-lg btn-primary w-25">Submit</button>
					</div>
				</form:form>

			</div>
		</div>

	</div>
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>