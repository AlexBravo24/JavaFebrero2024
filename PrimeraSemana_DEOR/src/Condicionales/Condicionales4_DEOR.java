package Condicionales;

import java.util.Scanner;

public class Condicionales4_DEOR {

	public static void main(String[] args) {
		//4. Realiza un programa que lea una cadena por teclado y compruebe si contiene 
		//letras mayúsculas.
		
		String cadena, rev;
		System.out.println("Teclea unas palabras");
		Scanner input = new Scanner(System.in);
		cadena = input.nextLine();
		
		rev=cadena.toLowerCase();
				
		if (cadena == rev) {
			System.out.println("no tiene letras mayusculas");
		}
		else {
			System.out.println("Tiene letras mayusculas");
		}
	}
}
