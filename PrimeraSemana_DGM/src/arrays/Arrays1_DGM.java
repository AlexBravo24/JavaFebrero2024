package arrays;

import java.util.Scanner;

public class Arrays1_DGM {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.

		int [] numeros = new int [10];
		int x;
		int pos = 0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros");
		for (x = 0; x < numeros.length; x++) {
			System.out.print("Digite el N°"+(x+1)+":");
			numeros[x] = entrada.nextInt();
			
			 if (numeros[x] == numeros[x]) {
				 pos = x;
				 
			 }
			 System.out.println("el N° " +numeros[x]+ " es la Posicion N° " +pos);	
		}
		
		
	}

}
