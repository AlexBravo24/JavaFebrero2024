package arrays;

import java.util.Scanner;

public class Arrays3_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio3 - Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.

		Scanner input = new Scanner(System.in);
		
		String frase;

		System.out.println("Introduce la frase");
		
		frase = input.nextLine();
		
		char[] letras = frase.toCharArray();

		for (int i = 0; i <letras.length; i++) {
			System.out.println(letras[i]);
		}

	}

}
