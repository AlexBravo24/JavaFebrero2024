package arrays;

import java.util.Scanner;

public class Arrays2_DGM {

	public static void main(String[] args) {
		// 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
	int [] numeros = new int [100];
	int suma = 0;
	int x;
	double media = 0;
    
	Scanner entrada = new Scanner(System.in);
	
	for ( x = 1; x <= 100; x++) {
	System.out.println(x);
	suma = suma + x;
	media = suma / 100;
	}
	System.out.println("la suma es :" +suma);
	System.out.println("la media es de :" +media);
	}

}
