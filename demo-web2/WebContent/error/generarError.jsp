<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="ShowError.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Handling</title>
</head>
<body>

	<%
		int x = 1;
		if (x == 1) {
			throw new RuntimeException("Error intencionado!!!");
		}
	%>

</body>
</html>