<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<%@ include file="../Plantilla/header.jsp"%>
<% session.setAttribute("Usuario", null); %>
<body>
	<form name="login" method="POST" action="../ServletDemo">
		Usuario: <input id="login" type=text name="login" size="25" />
		Contraseña: <input id="password" type=password name="password" size="25" />
		<select name="idioma">
			<option value="spa">Español</option>
			<option value="ing">ingles</option>
		</select>
		<input type="submit" value="Iniciar sesion" />
	</form>
</body>
<%@ include file="../Plantilla/footer.jsp"%>
</html>