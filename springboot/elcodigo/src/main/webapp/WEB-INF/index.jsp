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
<title>title-page</title>

</head>
<body>
	<div class="container py-5">
		<div class="row py-5">
			<div class="col py-5">
			  	<p class="text-center fs-4 text-danger"><c:out value="${error }" /></p>
			
				<form method="POST" action="/code">
					<div class="row mb-3 text-center">
						<label for="inputPassword3" class="form-label"><p class="fs-5">What
							is the code?</p></label>
						<input type="password" class="form-control" id="inputPassword3" name="secret">
					</div>
					<div class="d-grid gap-2 col-4 mx-auto">
					  <button class="btn btn-primary" type="submit">Try Code</button>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="/js/app.js"></script>
</body>
</html>