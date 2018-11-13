package es.indra.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletDemo
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletDemo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//Redireccion normal
	//response.sendRedirect("index.jsp");
	
	//Reenvia a una pagina pasando parametros
//	 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
//	 dispatcher.forward(request, response);
	 
		
	// request.getRequestDispatcher("/hola.jsp").forward(request, response);
	 
	 HttpSession session = request.getSession();
	 String idioma = request.getParameter("idioma");
	 Cookie miCookie = new Cookie("Idioma", idioma);
	 response.addCookie(miCookie);
	 
	 Cookie [] cookies = request.getCookies();
	 for(int i=0; i<cookies.length; i++)
	 {
		 Cookie cookieActual = cookies[i];		 
		 if(cookieActual.getName().equals("idioma")) {
			 String valor = cookieActual.getValue();
			 session.setAttribute("idioma", valor);
		 }	 
		
	 }
	 
	 String nombre = request.getParameter("login");
	 session.setAttribute("Usuario", nombre);
	 request.getRequestDispatcher("/login/bienvenida.jsp").forward(request, response);

	 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
