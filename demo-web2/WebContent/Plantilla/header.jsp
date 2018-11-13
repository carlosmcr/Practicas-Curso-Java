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
<header>
	<h1>
	<%if (session.getAttribute("Usuario") != null){
		out.print("Bienvenido: " + session.getAttribute("Usuario"));	
	}
	%>
	</h1>
</header>
