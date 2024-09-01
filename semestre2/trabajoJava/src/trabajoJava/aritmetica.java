package trabajoJava;
import java.util.*;
public class aritmetica{

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double valor;
		double num = 0;
		
		System.out.println("Cuantos valores va a introducir?");
		num = Double.parseDouble(leer.nextLine());
		
		while (num < 0) {
	          System.out.println("ERROR, Su valor  no puede ser negativo, favor volver a ingresarlo");
	          System.out.print("Ingrese el valor del producto:  ");
	          num = Double.parseDouble(leer.nextLine());
		}
        /*for (int i = 0; i < num; i++){
        	double g;
			num++;
			System.out.println("Ingrese el numero #"+num);
			g = leer.nextDouble();                                                   
            total = total + numeroIntermedio;                 
}*/ 
		int sum = 0, inputNum;
	      int counter = 0;
	      float mean;
	      Scanner NumScanner = new Scanner(System.in);
	      System.out.print("Por favor ingresa el número" +  counter);
	      counter = NumScanner.nextInt();
	      
	      for(int x = 1; x<=counter ;x++){          
	          inputNum = NumScanner.nextInt();
	          sum = sum + inputNum;
	          System.out.println();
	      }
	      
	      mean = sum / counter;
	      System.out.println("La media de " + counter + " los números que ingresaste es " + mean);
	    }

}
