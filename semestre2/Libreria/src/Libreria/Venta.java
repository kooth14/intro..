package Libreria;

public class Venta extends Compra{

	public Venta(int cantidad, String marca, String nombre, double precio, double total) {
		super(cantidad, nombre, nombre, total, total);
		
	}

	public void muestra() {
		
		System.out.println("se realizo una venta de " + cantidad + "productos");
		System.out.println("dinero registrado " + gettotal());
	}

}
