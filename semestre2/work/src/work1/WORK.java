package work1;
import java.util.Scanner;
import java.math.*;

public class WORK {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double valor;
		double num = 0;
		private static final int Pi =(int) 3.1416;
		
		System.out.println("Cuantos valores va a introducir?");
		valor = Double.parseDouble(leer.nextLine());
		
		while (num < 0) {
	          System.out.println("ERROR, Su precio  no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Ingrese el precio del producto:  ");
	          num = Double.parseDouble(leer.nextLine());
		}
		for (int x = 1; x < counter ;x++) {
			inputNum = NumScanner.nextInt();
			sum = sum + inputNum;
			System.out.pritnln();
		}
	}
}
