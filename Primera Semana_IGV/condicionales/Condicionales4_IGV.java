package condicionales;

import java.util.Scanner;

public class Condicionales4_IGV {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y 
		// compruebe si es una letra mayúscula.
		
		String letra;
		String rev;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una letra y te dire si contiene letras mayusculas");
		letra = input.nextLine();
		rev = letra.toLowerCase();
	
		if (letra == rev) {
			System.out.println("No contiene mayusculas");
		} else {
			System.out.println("Contiene mayusculas");
		}

	}

}
