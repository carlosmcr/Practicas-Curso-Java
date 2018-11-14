<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList"%>
<%@ page import="es.indra.carro.beans.Categoria"%>
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
		<%	ArrayList<Categoria> listaCategorias = (ArrayList<Categoria>) request.getAttribute("listaCategorias");
			for (Categoria categoria : listaCategorias) {
		%>
		<tr>
			<td><%=categoria.getId()%></td>
			<td><%=categoria.getNombre()%></td>
		</tr>
		<%	}	%>

	</table>

</body>
<%@ include file="Plantilla/header.jsp"%>
</html>