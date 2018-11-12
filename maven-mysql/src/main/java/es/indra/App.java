package es.indra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		Connection conn1 = null;
		String url1 = "jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2265155";
		String user = "sql2265155";
		String password = "nC2!qL8%";

		try {
			conn1 = DriverManager.getConnection(url1, user, password);
			if (conn1 != null) {
				System.out.println("Conectado a sql2265155");
			}

			// Crea un registro
			String query = " insert into categorias values (?, ?)";
			PreparedStatement preparedStmt = conn1.prepareStatement(query);
			preparedStmt.setInt(1, 4);
			preparedStmt.setString(2, "Alimentacion");
			preparedStmt.execute();

			// Visualiza todos los registros de la tabla
			query = "SELECT * FROM categorias";
			Statement st = conn1.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				System.out.format("%s, %s \n", id, nombre);
			}

		} catch (SQLException ex) {
			System.out.println("Error en la conexion,usuario /password incorrecto");
			ex.printStackTrace();
		} finally {
			try {
				conn1.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar la conexion");

			}

		}
    }
}
