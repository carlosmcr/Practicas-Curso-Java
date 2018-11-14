<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="Plantilla/header.jsp"%>
<body>
<%@ include file="Plantilla/menu.jsp"%>
	<form name="formularioCategorias" method="POST" action="Servlet?action=crearCategoria">
		ID: <input id="id" type=text name="id" size="10" /> 
		Nombre: <input id="nombre" type=text name="nombre" size="25" /> <input type="submit"
			value="Enviar" />
	</form>
</body>
<%@ include file="Plantilla/header.jsp"%>
</html>