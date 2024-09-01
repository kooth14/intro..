package Arraylis;

import java.util.Scanner;

public class A_c {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		
		String Student1 = null, Student2 = null;
		int Nota1 = 0, Nota2 = 0;
		
		System.out.print("Nombres:  " + Student1);
		Student1 = leer.nextLine();
		
		System.out.print("Nombres:  " + Student2);
		Student2 = leer.nextLine();
		
		System.out.print("nota:  " + Nota1);
		Nota1 = leer.nextInt();
		while(Nota1 < 0) {
			 System.out.print("nota:  " + Nota1);
			 Nota1 = leer.nextInt();
			 if (Nota1 < 0 || Nota1 <= 10) {
				 System.out.println("Nota valida");
			 }else
			 {
				 System.out.println("Nota invalida");
			 }
		}
		
		System.out.print("nota:  " + Nota2);
		Nota2 = leer.nextInt();
		while(Nota2 < 0) {
			 System.out.print("nota:  " + Nota2);
			 Nota2 = leer.nextInt();
			 if (Nota2 < 0 || Nota2 <= 10) {
				 System.out.println("Nota valida");
			 }else
			 {
				 System.out.println("Nota invalida");
			 }
		}
	}
}
