<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    width: 200px;
    background-color: #f1f1f1;
}

li a {
    display: block;
    color: #000;
    padding: 8px 16px;
    text-decoration: none;
}

li a.active {
    background-color: #4CAF50;
    color: white;
}

li a:hover:not(.active) {
    background-color: #555;
    color: white;
}
div ul{
	margin: 20px 10px;
}
</style>
<div>
	<ul>
	 	<li><a class="active" href="index.jsp">Home</a></li>
		<li><a href="crearCategoria.jsp">Crear Categoria</a></li>
		<li><a href="Servlet?action=verCategoria">Ver Categoria</a></li>
	</ul>
</div>

