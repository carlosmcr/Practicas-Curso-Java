<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Ejemplo : Mi primera p�gina</title>
</head>

<%@ include file="Plantilla/header.jsp"%>
<body>
	<div>
		<form name="FORM1" method="POST" action="ServletDemo">
			Nombre: <input id="nombre" type=text name="nombre" size="25" /> <input
				type="submit" value="Enviar" />
		</form>
	</div>

</body>
<%@ include file="Plantilla/footer.jsp"%>
</html>
