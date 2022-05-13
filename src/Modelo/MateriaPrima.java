package Modelo;

public class MateriaPrima {
	
	int codigo;
	String nombre;
	String info;
	String proveedor;
	double concentracion;
	int stock;
	
	public MateriaPrima() {
		codigo=0;
		nombre="";
		info="";
		proveedor="";
		concentracion=0.0;
		stock=0;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public double getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(double concentracion) {
		this.concentracion = concentracion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	

}
