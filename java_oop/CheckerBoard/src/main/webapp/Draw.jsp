<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CheckerBoard</title>
<link rel="stylesheet" href="app.css">
</head>
<body>
	<h1>Tablero de Damas</h1>
	<%
	String width = request.getParameter("ancho");
	String height = request.getParameter("alto");
	int ancho = Integer.parseInt(width);
	int alto = Integer.parseInt(height);
	%>

	<%!public String getColor(int x, int y) {
		if (x % 2 == 0) {
			return y % 2 == 0 ? "black" : "red";
		}
		return y % 2 == 0 ? "red" : "black";
	}%>

	<div>
		<%
		for (int fila = 0; fila < alto; fila++) {
		%>
		<div class="fila">
			<%
			for (int columna = 0; columna < ancho; columna++) {
			%>
			<div data=<%= columna %> class="cuadrado <%=getColor(fila, columna)%>"></div>
			<%
			}
			%>
		</div>
			<%
			}
			%>
	</div>
</body>
</html>