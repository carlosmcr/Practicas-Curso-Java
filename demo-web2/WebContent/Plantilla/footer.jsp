
<style>
h1 {
	color: blue;
	background-color: yellow;
	text-align: center;
}

h3 {
	text-align: center;
	color: white;
	background-color: gray;
	padding: 100px;
	margin-top: 400px;
}

body {
	background-color: aqua;
}
</style>
<footer>
	<h3>Carlos Javier Alcalde Benítez ©</h3>
	<h1>
		<%
	out.print("Idioma: " + session.getAttribute("idioma"));
	%>
	</h1>
</footer>


