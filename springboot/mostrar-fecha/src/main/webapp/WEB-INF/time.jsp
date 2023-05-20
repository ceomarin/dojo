<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- for Bootstrap CSS -->
<link rel="stylesheet"
	href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css" />

<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container py-5">
		<div class="row py-5">
			<h1 class="text-center py-5 time">
				<c:out value="${hora}"/>
			</h1>
		</div>

	</div>


	<script type="text/javascript" src="/js/time.js"></script>

</body>
</html>