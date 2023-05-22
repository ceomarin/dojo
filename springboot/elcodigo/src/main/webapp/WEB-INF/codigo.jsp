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
<!-- <link rel="stylesheet" href="/css/style.css" /> -->
<title>title-page</title>

</head>
<body>
	<div class="container py-5">
		<div class="row py-5">
			<div class="col py-5 text-center">
				<ul class="list-group">
					<li class="list-group-item">Loyalty</li>
					<li class="list-group-item">Courage</li>
					<li class="list-group-item">Veracity</li>
					<li class="list-group-item">Compassion</li>
					<li class="list-group-item">Honor</li>
				</ul>
			</div>
		</div>
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- 	<script src="/js/app.js"></script> -->
</body>
</html>