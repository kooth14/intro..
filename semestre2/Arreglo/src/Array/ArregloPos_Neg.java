package Array;
import java.util.*;
public class ArregloPos_Neg {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int cant;
		System.out.print("Introduzca la cantidad de valores: ");
		cant = leer.nextInt();
		int [] valores = new int [cant];
		for (int i = 0; i < valores.length; i++) {
			System.out.print("valor" + (i +1) + ": ");
			valores[i] = leer.nextInt();
		}
		System.out.println("valores del array unidimencional");
		System.out.print("[ ");
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + ",");
		}
		System.out.print(" ]");
	}

}
