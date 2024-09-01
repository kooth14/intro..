package Test;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		int fila = 0;
		int columna = 0;
	
		System.out.print(" Introduzca la cantidad de  fila: ");
		fila = leer.nextInt();
		
		System.out.print(" Introduzca la cantidad de  columna: ");
		columna = leer.nextInt();
		
		int v [][] = new int [fila] [columna];
		
		for(int i = 0; i < fila ; i++) {
			for (int j = 0; j < columna ; j++) {
				
				System.out.println( " Ingrese los datos de la posicion " + (i + 1) + " , " + (j + 1));
				
			    v[i][j] = leer.nextInt();
				
			}
			
		}
		
		for(int i = 0; i < fila ; i++) {
			for (int j = 0; j < columna ; j++) {
				
				
				System.out.print( v [i][j] + " ");
				
				
			}
			System.out.println();
		}
		
		Metodos JK = new Metodos ();
		
		int SumasFila = 0;
		System.out.println(" El resultado de las sumas de las filas es " + SumasFila);
		SumasFila = JK.SumaColuma(fila, columna, v);
		
		int SumaColum = 0;
		System.out.println(" El resultado de la sumas de las columnas es "+ SumaColum);
		SumaColum = JK.SumaColuma(fila, columna, v);
		
		int SumaAB = 0;
		System.out.println(" El resultado de la sumas de a y b es " + SumaAB);
		SumaAB = JK.SumaAB(SumasFila, SumaColum);
		
		int [] MediaCom = null; 
		System.out.println(" El resultado de la sumas de las medias de las columnas es " + MediaCom);
		MediaCom = JK.MediaCom(SumasFila, SumaColum, v);
	
	}

}

