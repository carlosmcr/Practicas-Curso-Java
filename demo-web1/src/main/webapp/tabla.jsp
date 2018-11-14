<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="Plantilla/header.jsp"%>
<body>
	<%@ include file="Plantilla/menu.jsp"%>

		<table>
			<c:forEach items="${listaCategorias}" var="categoria">
				<tr>
					<td>${categoria.id}</td>
					<td>${categoria.nombre}</td>
				</tr>
			</c:forEach>
		</table>

</body>
<%@ include file="Plantilla/header.jsp"%>
</html>