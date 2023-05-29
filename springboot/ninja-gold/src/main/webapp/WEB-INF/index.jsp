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
<title>Ninja Gold Game</title>

</head>
<body>
	<div class="container py-3">
		<h2>Your Gold: <span class="badge bg-primary"><c:out value="${gold }"></c:out></span></h2>
		<a href="/reset" class="btn btn-outline-warning" role="button">Reset</a>
		<div class="row py-5">
		<div class="col">
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			    <h5 class="card-title">Farm</h5>
			    <p class="card-text">(earns 10-20 gold)</p>
			    <form action="/gold" method="post">
			    	 <input type="hidden" name="find" value="farm">
			    	 <button type="submit" class="btn btn-primary">Find Gold!</button>
			    </form>
			  </div>
			</div>
		</div>
		
		<div class="col">
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			    <h5 class="card-title">Cave</h5>
			    <p class="card-text">(earns 5-10 gold)</p>
			    <form action="/gold" method="post">
			    	 <input type="hidden" name="find" value="cave">
			    	 <button type="submit" class="btn btn-primary">Find Gold!</button>
			    </form>
			  </div>
			</div>
		</div>
		
		<div class="col">
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			    <h5 class="card-title">House</h5>
			    <p class="card-text">(earns 2-5 gold)</p>
			    <form action="/gold" method="post">
			    	 <input type="hidden" name="find" value="house">
			    	 <button type="submit" class="btn btn-primary">Find Gold!</button>
			    </form>
			  </div>
			</div>
		</div>
		
		<div class="col">
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			    <h5 class="card-title">Casino</h5>
			    <p class="card-text">(earns/takes 0-50 gold)</p>
			    <form action="/gold" method="post">
			    	 <input type="hidden" name="find" value="casino">
			    	 <button type="submit" class="btn btn-primary">Find Gold!</button>
			    </form>
			  </div>
			</div>
		</div>
		
		</div>
		<div class="row ">
			<h3>Activities:</h3>		
			<div class="col box">
			<c:forEach var="actividad" items="${actividades}">
					<c:choose>
						<c:when test="${actividad.contains('lost')}">
							<p class="text-danger m-0 fs-2">${actividad}</p>
						</c:when>
						<c:otherwise>
							<p class="m-0 fs-2 text-success">${actividad}</p>
						</c:otherwise>
					</c:choose>
	
				</c:forEach>
			
			</div>
		
		</div>	
	</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<!-- <script src="/js/app.js"></script> -->
</body>
</html>