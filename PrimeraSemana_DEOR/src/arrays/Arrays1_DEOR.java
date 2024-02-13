package arrays;

import java.util.Scanner;

public class Arrays1_DEOR {

	public static void main(String[] args) {

		//1. Crea un array de 10 posiciones de números con valores pedidos 
		//por teclado. Muestra por consola el índice y el valor al que 
		//corresponde.
		
		int [] arreglo = new int[10];
		Scanner input = new Scanner (System.in);
		System.out.println("Digita 10 numeros");
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = input.nextInt();
		}
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("[" + i + "] = " + arreglo[i]);
		}
	}

}
