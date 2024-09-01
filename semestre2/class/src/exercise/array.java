package exercise;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = 0;
		System.out.print("ingrese la cantidad de numeros que desee: ");
		n = leer.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("valor " + (i + 1) + ": ");
			 n = leer.nextInt();
		}
		int mayor = 0;
		for(int i = 0; i < array.length; i++) {
			if(array [i] < mayor) {
				mayor = array[i];
			}
		}
		System.out.print("el valor maximo es: " + mayor);
	}

}
