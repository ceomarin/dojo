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
<title>Category Page</title>
</head>
<body>

	<div class="container">
		<div class="row py-5">
			<h1>${categoria.name }</h1>
			<div class="col-6">
				<h3>Products</h3>
				<ul>
				<c:forEach items="${category.products}" var="product" >
					<li><c:out value="${product.name}"></c:out></li>
				</c:forEach>
				</ul>
			</div>
			<div class="col-6">
					<form:form action="" method="post" modelAttribute="category" class="row g-3">
					
					<form:label class="form-label" path="products" for="products">Add Category</form:label>
					<form:select name="products" path="products"
						class="form-select form-select-lg mb-3" id="products"
						multiple="false">
					    <option value="" disabled selected>--Please choose an option--</option>
						<c:forEach items="${productos}" var="producto">
							<form:option value="${producto.id}" label=" ${producto.name}" />
						</c:forEach>
					</form:select>
				<form:button class="btn btn-outline-success mt-4">Add</form:button>
				</form:form>
			</div>
		</div>
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>