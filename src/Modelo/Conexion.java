package Modelo;
import java.io.IOException;
import java.sql.*;

public class Conexion {
	
	public Conexion() {
		
	}
	
	public Connection getConexion() {
		Connection miConexion=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3305/materias_primas","root","2301");
	
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return miConexion;
	}
}
