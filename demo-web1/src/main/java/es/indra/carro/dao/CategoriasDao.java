package es.indra.carro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.indra.carro.beans.Categoria;
import es.indra.carro.conexion.mysql;

public class CategoriasDao {

	mysql conexion = new mysql();
	
	public void crearCategoria(Categoria cat) {		
		 try {			 	
				Class.forName("com.mysql.jdbc.Driver");				 
				conexion.abrirConexion();
				String query = " insert into categorias values (?, ?)";
				PreparedStatement preparedStmt = conexion.getConn1().prepareStatement(query);
				preparedStmt.setInt(1, cat.getId());
				preparedStmt.setString(2, cat.getNombre());
				preparedStmt.execute();				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}finally {
				try {
					conexion.cerraConexion();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				
				}
			}
	}
	
	public List<Categoria> mostrarCategorias(){
		List<Categoria> lista = new ArrayList<>();
		try {		
			Class.forName("com.mysql.jdbc.Driver");			
			conexion.abrirConexion();
			String query = "SELECT * FROM categorias";
			Statement st = conexion.getConn1().createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				Categoria cat = new Categoria();
				cat.setId(rs.getInt("id"));
				cat.setNombre(rs.getString("nombre"));
				lista.add(cat);				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				conexion.cerraConexion();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			
			}
		}		
		return lista;
	}
}
