package condicionales;

import java.util.Scanner;

public class Condicionales4_JJBA {

	public static void main(String[] args) {
		
		// Ejercicio3 - 4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.
		
Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba un enunciado: ");
		
		String enunciado, rev;
		
		enunciado = input.nextLine();
		
		rev = enunciado.toLowerCase();
		
		
		
		if ( enunciado == rev) {
			System.out.println("El enunciado tiene letras mayúsculas");
		} else {
			System.out.println("El enunciado no contiene letras mayúsculas.");
		}	
	}

}
