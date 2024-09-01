package Number;
import java.util.Scanner;
import java.math.*;

public class WORK {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double valor;
		double num = 0;
		private static final int Pi =(int) 3.1416;

		String seguir = "si";
	  while  (seguir.equals("si")) {
		
		System.out.println("Cuantos valores va a introducir?");
		valor = Double.parseDouble(leer.nextLine());
		
		while (num < 0) {
	          System.out.println("ERROR, Su precio  no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Ingrese el precio del producto:  ");
	          num = Double.parseDouble(leer.nextLine());
		}
		for (int i = 0; i < valor.length() i++) {
			x=
		}
		
		System.out.println("¿Quiere intentarlo de nuevo?");
	      seguir = leer.nextLine();
	    }
		 System.out.println("Take care, Thanks");
		    leer.close();
	}

}
