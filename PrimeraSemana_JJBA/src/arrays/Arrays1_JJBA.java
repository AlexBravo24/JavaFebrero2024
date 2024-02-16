package arrays;

import java.util.Scanner;

public class Arrays1_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio1 - Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		
		int [] numeros = new int [10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un valor: ");
			Scanner input = new Scanner(System.in);
			numeros [i] = input.nextInt();
			
		}
		
		for(int j = 0; j<numeros.length; j++) {
			System.out.println("La posicion: " + j + " vale " + numeros[j]);
		}


	}

}
