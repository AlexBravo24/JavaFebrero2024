package condicionales;

import java.util.Scanner;

public class Condicionales3_JJBA {

	public static void main(String[] args) {
		
		
		// Ejercicio3 - .Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int valor1;
		int valor2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe un valor");
		valor1 = input.nextInt();
		
		System.out.println("Escribe un segundo valor");
		valor2 = input.nextInt();
		
		
		if (valor2 == 0) {
			System.out.println("Error");
		}else {
			System.out.println("El resultado de su división es: " + valor1 / valor2);
		}


	}

}
