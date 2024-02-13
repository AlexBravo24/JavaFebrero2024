package arrays;

import java.util.Scanner;

public class Arrays1_IGV {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		
		int [] numeros = new int [10];
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Escribe los daatos del Array");
			numeros[i] = input.nextInt();
			System.out.println((i+1) + ". " + numeros[i]);
		}
		

	}

}
