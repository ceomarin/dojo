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
		<div class="row py-5 position-relative card">
			<form action="/result" method="post">
				<div class="row mb-3">
					<label for="name" class="col-sm-2 col-form-label">Your
						Name:</label>
					<div class="col-sm-10">
						<input type="text" name="name" class="form-control" id="name">
					</div>
				</div>
				<div class="row mb-3">
					<label class="col-sm-2 col-form-label" for="autoSizingSelect">Dojo
						Location:</label>
					<div class="col-sm-10">
						<select class="form-select" id="autoSizingSelect" name="dojo">
							<option selected>Choose...</option>
							<option value="San Jose">San Jose</option>
							<option value="Chile">Chile</option>
							<option value="EE.UU">EE.UU</option>
						</select>
					</div>
				</div>
				<div class="row mb-3">
					<label class="col-sm-2 col-form-label" for="autoSizingSelect">Favorite
						Language:</label>
					<div class="col-sm-10">
						<select class="form-select" id="autoSizingSelect" name="language" >
							<option selected>Choose...</option>
							<option value="Python">Python</option>
							<option value="Java">Java</option>
							<option value="C#">C#</option>
						</select>
					</div>
				</div>
				<div class="input-group py-3">
					<span class="input-group-text">Comment (optional)</span>
					<textarea name="comment" class="form-control" aria-label="With textarea"></textarea>
				</div>
				<div class="position-absolute bottom-0 end-0 mx-2 pb-2">
				<button type="submit" class="btn btn-primary">Button</button>
				</div>
			</form>
		</div>
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="/js/app.js"></script>
</body>
</html>