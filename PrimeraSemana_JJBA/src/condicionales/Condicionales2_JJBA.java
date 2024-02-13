package condicionales;

import java.util.Scanner;

public class Condicionales2_JJBA {

	public static void main(String[] args) {
		
		
		// Ejercicio2 - 2.Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar
		
		int valor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un valor");
		valor = input.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("El valor es par");
		}else {
			System.out.println("El valor es impar");
		}
		

	}

}
