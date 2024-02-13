package ciclos;

import java.util.Scanner;

public class Ciclos2_JAM {

	public static void main(String[] args) {
		
		/*
		 * Programa un algoritmo que realice la tabla de multiplicar de un numero
		 * introducido desde teclado, hasta la iteración deseada por el usuario.
		 * 
		 * Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 */

		Scanner input = new Scanner(System.in);
		int x,y;
		
		System.out.print("Ingrese el número a multiplicar: ");
		x = input.nextInt();
		System.out.print("Ingrese el número de iteraciones: ");
		y = input.nextInt();
	
		for (int i = 1; i <= y; i++) {
			System.out.println(x+"x"+i+"="+(x*i));
		}
	}

}
