package Modelo;
import java.sql.*;
import java.util.ArrayList;

public class MP_DAO {
	
	Conexion conexion;
	
	public MP_DAO() {
		conexion =new Conexion();	
	}
	
	public String insertMP(int codigo, String nombre, String info, String proveedor, double concentracion, int stock ) {
		
		String rptaRegistro=null;
		
		try {
			Connection accesoBBDD=conexion.getConexion(); 
			
			CallableStatement consulta= accesoBBDD.prepareCall("{call insertaMP(?,?,?,?,?,?)}");
			consulta.setInt(1, codigo);
			consulta.setString(2, nombre);
			consulta.setString(3, info);
			consulta.setString(4, proveedor);
			consulta.setDouble(5, concentracion);
			consulta.setInt(6, stock);
			
			int numFAfectadas=consulta.executeUpdate();
			
			if(numFAfectadas>0) {
				rptaRegistro="Registro Exitoso";
			}
			
			
		}catch(Exception e) {
			
		}
						
		return rptaRegistro;		
	}
	public ArrayList<MateriaPrima> listaMP(){
		ArrayList listaMP=new ArrayList();
		MateriaPrima mp;
		try {
			Connection accBBDD=conexion.getConexion();
			PreparedStatement ps= accBBDD.prepareStatement("SELECT * FROM MP_PRODUCCION");
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				mp=new MateriaPrima();
				mp.setCodigo(rs.getInt(1));
				mp.setNombre(rs.getString(2));
				mp.setInfo(rs.getString(3));
				mp.setProveedor(rs.getString(4));
				mp.setConcentracion(rs.getDouble(5));
				mp.setStock(rs.getInt(6));
				listaMP.add(mp);
			}
		}catch(Exception e) {
			
		}
		
		
		return listaMP;
		
	}

}
