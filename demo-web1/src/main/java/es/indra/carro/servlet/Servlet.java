package es.indra.carro.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.indra.carro.beans.Categoria;
import es.indra.carro.dao.CategoriasDao;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    CategoriasDao consultaCat = new CategoriasDao();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		switch (action) {
		case "crearCategoria":
			Categoria cat = new Categoria();
			cat.setId(Integer.parseInt(request.getParameter("id")));
			cat.setNombre(request.getParameter("nombre"));			
			consultaCat.crearCategoria(cat);
		case "verCategoria":
			request.setAttribute("listaCategorias", consultaCat.mostrarCategorias());
			request.getRequestDispatcher("/tabla.jsp").forward(request, response);
			break;
		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
