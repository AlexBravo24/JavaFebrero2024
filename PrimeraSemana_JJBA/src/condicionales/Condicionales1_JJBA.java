package condicionales;

import java.util.Scanner;

public class Condicionales1_JJBA {

	public static void main(String[] args) {
		
		// Ejercicio1 - .Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		
		int valor1;
		int valor2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Primer valor");
		valor1 = input.nextInt();
		
		System.out.println("Segundo valor");
		valor2 = input.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("El primer valor es mayor");
		}if (valor1 < valor2) {
			System.out.println("El segundo valor es mayor");
		}else {
			System.out.println("Los valores son iguales");
		}
		

	}

}
