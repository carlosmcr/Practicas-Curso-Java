package es.indra.carro.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql {
	
	
	private Connection conn1 = null;
	private String url1 = "jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2265155";
	private String user = "sql2265155";
	private String password = "nC2!qL8%";
	
	public void abrirConexion()  throws SQLException{
		conn1 = DriverManager.getConnection(url1, user, password);
		if (conn1 != null) {
			System.out.println("Conectado a sql2265155");
		}
	}

	public void cerraConexion() throws SQLException{
		conn1.close();
		System.out.println("Desconectado");
	}

	public Connection getConn1() {
		return conn1;
	}

	public void setConn1(Connection conn1) {
		this.conn1 = conn1;
		
	}
	
	

}
