package Number;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double Num;
		
		System.out.println("Cuantos valores va a introducir?");
		Num = Double.parseDouble(leer.nextLine());
		
		System.out.print("Introduce el  numero 1: ");
		Num = leer.nextInt();
	    System.out.print("Introduce el numero 2: ");
	    Num = leer.nextInt();
	    
		prueba m = new prueba();
		m.numeros();
		}
		public void numeros(){
		int a,b,res = 0;
		a= -1;
		b= -2;
		if(a>b){
		System.err.println("el resultado es: "+res);
		    System.err.println("A es mayor que B");
		}else{
		System.err.println("el resultado es: "+res);
		    System.err.println("B es mayor que A");
		}
	}
		if (Num > 0 ) {
			int cp;
			int i;
			double[] positivos;
			double valor;
			int ci;
			double[] negativos;
			if (cp < i++) {
				System.out.println("El valor "+ valor + "pertenece al grupo de los positivos.");
				positivos [cp] = valor;
				cp++;
			}else if (ci < i++) {
				System.out.println("El valor " + valor + "pertenece al grupo de los negativos.");
				negativos[ci] = valor;
				ci++;
			}
		}
	}
}
