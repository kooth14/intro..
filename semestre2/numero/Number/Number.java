package Number;
import java.util.Scanner;

public class Number {

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
		for (int i = 0; i < valor i++) {
	    System.out.print("Introduce primer numero: ");
		numero1= leer.nextInt();
	    System.out.print("Introduce segundo numero: ");
	    numero2= leer.nextInt();
		}

	if (numero1 == numero2);
	System.out.printf("%d == %d%n", numero1, numero2);

	 

	}

}
