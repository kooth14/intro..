package Libreria;

public class CompraVenta {
	
	protected double precio;
	protected String nombre;
	protected int cantidad;
	protected String marca;
	protected double total;
	
	public CompraVenta(int cantidad, String marca, String nombre, double precio, double total) {
		this.cantidad=cantidad;
		this.marca=marca;
		this.nombre=nombre;
		this.precio=precio;
		this.total=total;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double gettotal() {
		return this.total;
	}
	public void settotal(double total) {
		this.total=total;
	}
	
	
}
