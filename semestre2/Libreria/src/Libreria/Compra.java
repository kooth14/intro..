package Libreria;
import java.util.Scanner;
public class Compra extends CompraVenta{
	
	private String nombre;
	private String marca;
	Scanner leer =new Scanner(System.in);
	public Compra( String marca, String nombre, int cantidad, double precio, double total) {
		super(precio, cantidad, total);
	}
	
		public void Compra() {
			System.out.println("***Libreria G&A***");
			
			this.cantidad = -1;
			while (this.cantidad == -1) {
				System.out.print("Ingrese la cantidad de productos que desea comprar: ");

				try {
					this.cantidad = Integer.parseInt(leer.nextLine());
				} catch (NumberFormatException exception) {
					System.out.println("ERROR, el valor d cantidad es incorrecto, favor vuelva a ingresarlo " );
				}
			}
			
			System.out.print("Ingrese el nombre del productos: " );
			this.setNombre(leer.nextLine());
			
			System.out.print("Ingrese el precio del producto: ");
			setPrecio(Double.parseDouble(leer.nextLine()));
			while (this.getPrecio() < 0) {
		          System.out.println("ERROR, Su precio  no puede ser negativo, favor volver a ingresarlo");
		          System.out.print("Ingrese el precio del producto:  ");
		          this.precio = Double.parseDouble(leer.nextLine());
		        }
			System.out.print("Ingrese la marca del producto: " );
			this.setMarca(leer.nextLine());
				
			this.settotal( this.gettotal() + this.precio);
			System.out.print("El total es: " + this.precio);
			this.precio = Double.parseDouble(leer.nextLine());
				
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
			
	}

	
		
	