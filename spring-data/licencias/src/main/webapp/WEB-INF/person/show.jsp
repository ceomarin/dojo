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
	<div class="container py-5 w-50">
		<div class="card-body bg-light">
			<div class="row mt-3">
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h1 class="card-text">${person}</h1>
						</div>
					</div>
				</div>
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">License Number</h5>
							<p class="card-text">${ person.getLicense().getNumber() }</p>
						</div>
					</div>
				</div>
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">State</h5>
							<p class="card-text">${ person.getLicense().getState() }</p>
						</div>
					</div>
				</div>
				<div class="col-12">
					<div class="card">
						<div class="card-body">
							<h5 class="card-title">Expiration Date</h5>
							<p class="card-text"><fmt:formatDate value="${person.license.expirationDate}" pattern="yyyy-MM-dd " /></p>
							

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>