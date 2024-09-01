package Empresa;
import java.util.*;

public class cuan {

	public static void main(String[] args) 
	{
		int salir = 0;
		Scanner leeer = new Scanner(System.in);

		do
		{

			try 
			{
				Scanner leer = new Scanner(System.in);
				System.out.println("---------------------------------------------------------------");

				//Pide la cantidad de personas
				System.out.print("Ingrese la cantidad de empleados: ");
				int cantidad = leer.nextInt();
				
				System.out.println("---------------------------------------------------------------");

				//declaras tus arrays
				String[] empleados = new String[cantidad];
				double[] sueldos = new double[cantidad];
				double[] inns = new double[cantidad];
				double[] salario = new double[cantidad];
				double[] ir = new double[cantidad];
				
				double inss = 0.07;
				
				System.out.println("---------------------------------------------------------------");
				for(int i = 0; i < cantidad; i ++)
				{
					System.out.print("Nombre del empleado " + (i +1) + ": ");
					empleados[i] = leer.next();
					
					System.out.print("Sueldo empleado " + (i +1) + ": ");
					sueldos[i] = leer.nextDouble();
					
					if (sueldos[i]*12 <= 100000)
					{
						ir[i] = 0.0;salario[i] = sueldos[i] - salario[i]* ir[i] - inns[i];
					}
					else if (sueldos[i]*12 >= 100001 && sueldos[i]*12 <= 200000)
					{
						ir[i] = 0.15;
						salario[i] = sueldos[i] - salario[i]* ir[i] - inns[i];
					}else if (sueldos[i]*12 >= 200001 && sueldos[i]*12 <= 350000)
					{
						ir[i] = 0.20;
						salario[i] = sueldos[i] - salario[i]* ir[i] - 15000/12 - inns[i];
					}
					else if (sueldos[i]*12 >= 350001 && sueldos[i] <= 500000)
					{
						ir[i] = 0.25;
						salario[i] = sueldos[i] - salario[i]* ir[i] - 25000/12- inns[i];
						
					}else if (sueldos[i] > 500000.1)
					{
						salario[i] = sueldos[i] - salario[i]* ir[i] - 45000/12- inns[i];
						ir[i] = 0.30;
					}
					
					inns[i] = sueldos[i]*inss;
	
					System.out.println("");

				}
				
				leer.close();
				
				System.out.println("Nombre  -    Sueldo     -    Inss    -     Ir     -     Salario Neto");
				for (int i = 0; i < salario.length; i++)
				{
					System.out.println(empleados[i] + "    -     " + sueldos[i] + "    -     " + inns[i] + "    -     " + ir[i]*sueldos[i] + "     -      "  + salario[i]);
				}
				System.out.println("---------------------------------------------------------------");

			} 
			catch (Exception e) 
			{
				// TODO Auto-generated catch block
				System.out.println("Ingrese numeros");
				System.out.print("Desea salir del programa: ");
				salir = leeer.nextInt();
			}

			//leer.close();
			
		}while (salir != 0);
		
		leeer.close();
	}
	
}
