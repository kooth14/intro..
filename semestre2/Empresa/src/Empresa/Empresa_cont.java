package Empresa;
import java.util.*;

public class Empresa_cont {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("LECTURA DE NOMBRES Y SUELDOS DE LOS EMPLEADOS");
		
		int cant;
		System.out.print("Introduzca la cantida de trabajadores: ");
		cant = Integer.parseInt(leer.nextLine());
		
		String [] workers = new String [cant];
		int[]  salario_neto = new int[cant];
		for (int i = 0; i < workers.length; i++) {
			System.out.print("worker " + (i + 1) + ": ");
			workers[i] = leer.nextLine();
			System.out.print("salario neto " + (i + 1)+ ": " );
			salario_neto[i] = leer.nextInt();
		}
		
		int IR, inss, porcentaje, impuesto_base;
		
		
	}

}
//int cantidad = integer.parseInt(leer.nextLine());