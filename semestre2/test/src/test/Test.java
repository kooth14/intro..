package test;
import java.util.Scanner;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int s = 0, r = 0, d = 0, p = 0, a = 0, num = 0;
		
		System.out.println("--CALCULADORA--");
		System.out.println("Escoja que operacion aritmetica realizara");
		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-division");
		System.out.println("4-Producto");
		
		System.out.print("Escoja su opcion: ");
		int th;
		th = leer.nextInt();
		
		switch(th) {
		case 1:{
			System.out.println("ingrese los numeros que quiere sumar");
			num = leer.nextInt();
			if(num > 1) {
				for(int i = 0; i < num; i ++) {
					System.out.println("escriba los numeros " + ( i +1) + ": ");
					num = leer.nextInt();
					s = s + num;
				}
			}
			System.out.print("la suma es: " + s);
			
			break;
		}
		case 2:{
			System.out.println("ingrese la cantidad que quiere restar");
			num = leer.nextInt();
		
					r = r - num;
					System.out.print("la resta es: " + r);
				}
			
			break;
		
		
		case 3:{
			System.out.println("ingrese la cantidad que quiere dividir");
			num = leer.nextInt();
			if(num > 1) {
				for(int i = 0; i < num; i ++) {
					System.out.println("escriba los numeros " + ( i + 1) + ": ");
					num = leer.nextInt();
					d = d / num;
				}
			}
			System.out.print("la division es: " + d);
			
			break;
		}
		case 4:{
			System.out.println("ingrese la cantidad que va a multiplicar");
			num = leer.nextInt();
			p = p * num;
			System.out.print("la multiplicacion es: " + p);
			
			break;
		}
		
		}
	}
		
	}

