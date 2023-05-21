<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
<title>Current visit count</title>
</head>
<body>
<div class="container py-5">
<div class="row py-5"></div>
<div class="col-12 ">
	<p class="h3">You have visited <a href="/your_server">http:/your_server</a> <c:out value="${contador}"></c:out> times</p>
	<a class="h4" href="/your_server/other">Test another visit?</a>
</div>
<div class="col-12 py-5">
	<a class="btn btn-primary" href="/your_server/reset" role="button">Reset Counter</a>
</div>
</div>

	<script src="/webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
</body>
</html>