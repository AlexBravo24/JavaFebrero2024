package arrays;

import java.util.Scanner;

public class Arrays2_SFR {

	public static void main(String[] args) {
		
		//2. Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.

		int [] numeros = new int[100];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			numeros [i] = i+1;
			
		}
		int suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma+= numeros[i];
		}
		double media = (double) suma / numeros.length;
		 System.out.println("La suma de los números del 1 al 100 es: " + suma);
	        System.out.println("La media de los números del 1 al 100 es: " + media);
		
		
	}

}
