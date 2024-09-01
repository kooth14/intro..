package Empresa;
import java.util.*;

public class EmpresaCont {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String[] empleados = new String[2];
        double[] sueldos = new double[2];
        String Trabajador;
        double mayorSueldo;
        int ir, inss_men, salario_neto, i = 0, i_b, porcentaje;
           
        System.out.println("LECTURA DE NOMBRES Y SUELDOS DE LOS EMPLEADOS"); 
        
        
        mayorSueldo = sueldos[i];
        Trabajador = empleados[i];
        
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = leer.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = leer.nextDouble();
        
        for (i = 1; i < empleados.length; i++) {
            leer.nextLine(); 
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = leer.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = leer.nextDouble();
            if (sueldos[i] > mayorSueldo) 
            {
                mayorSueldo = sueldos[i];
                Trabajador = empleados[i];
           }
       }
        System.out.println("Empleado con mayor sueldo es : " + Trabajador);                                         
        System.out.println("Con un sueldo de: " + mayorSueldo);
        
        System.out.println("IR " + (i + 1) + ":" );
        System.out.println("Inss mensual " + (i + 1) + ":");
	}

}
