package work1;
import java.util.Scanner;
public class numero {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero1;
	    int numero2;
		double valor;
		
	    System.out.println("Cuantos valores va a introducir?");
		valor = Double.parseDouble(leer.nextLine());
		while (valor < 0) {
	          System.out.println("ERROR, Su valor  no puede ser negativo, favor volver a ingresarlo");
	          System.out.println("Cuantos valores va a introducir?");
	          valor = Double.parseDouble(leer.nextLine());
		}


	if (numero1 == numero2);
	System.out.printf("%d == %d%n", numero1, numero2);

	 
		}

	}


