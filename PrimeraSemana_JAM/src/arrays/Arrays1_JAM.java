package arrays;

import java.util.Scanner;

public class Arrays1_JAM {

	public static void main(String[] args) {
		
		/*
		 * Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.

		 */

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
	
		
		for (int i = 0; i <10; i++) {
			System.out.print("Ingrese un valor:");
			numeros[i] = input.nextInt();	
		}
		for (int i = 0; i <10; i++) {
			System.out.println("En la posicion:"+i+", esta el numero:"+numeros[i]);
		}
	}
}
