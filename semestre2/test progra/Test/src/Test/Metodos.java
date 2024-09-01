package Test;
import java.util.*;

public class Metodos {

	public static int main(String[] args) {

		int sumar = 0 ;
		
		int fila = 0;
		for (int i = 0; i<fila; i++) {
			int colum = 0;
			for (int j = 0; j<colum; j++) {
				if(  i % 2 != 0 ) {	
					int[][] V = null;
					sumar = sumar + V [i][j];
				}
			}
		}
		return sumar;	
	}
	
	public int SumaColuma ( int  fila , int colum , int ñ [][]) {
		
		int sumar = 0;
		
		for(int i = 0; i < fila; i++ ){
             	for(int j = 0; j<colum; j++) {
             		
             		if(  j % 2 == 0 ) {
    					
    					sumar = sumar + ñ [i][j];
    					
    				}
             				
             	}
		}
		return sumar;
	}
	
	public int SumaAB ( int a , int b ) {
		int sumar = 0;
		
			sumar = a + b;
		
		return sumar;
	}
	
	public int [] MediaCom ( int fila, int colum, int SG [][] ) {
		int sumar = 0;
		int media [] = new int [colum];
		
		for(int i = 0; i < fila; i++ ){
             	for(int j = 0; j<colum; j++) {
             			
    					sumar = sumar + SG [i][j];
    					media [j] = sumar / fila;
    				}
             				
             	}
		
		
		return media;
	}
}

