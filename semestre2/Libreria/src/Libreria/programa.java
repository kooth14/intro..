package Libreria;

public class programa {

	public static void main(String[] args) {
		
		inventario uno= new inventario(0, null, null, 0, 0);
		Compra dos= new Compra(0, null, null, 0, 0);
		Venta tres= new Venta(0, null, null, 0, 0);
		
		uno.lista();
		dos.Compra();
		dos.gettotal();
		tres.muestra();
		
		
		

	}

}