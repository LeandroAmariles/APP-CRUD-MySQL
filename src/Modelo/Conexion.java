package Modelo;
import java.io.IOException;
import java.sql.*;

public class Conexion {
	
	public Conexion() {
		
	}
	
	public Connection getConexion() {
		Connection miConexion=null;
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3305/salvadora","root","2301");
	
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return miConexion;
	}
}
