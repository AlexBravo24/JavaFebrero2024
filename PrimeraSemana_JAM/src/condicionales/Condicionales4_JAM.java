package condicionales;

import java.util.Scanner;

public class Condicionales4_JAM {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que lea una cadena por teclado y compruebe si
		 * contiene letras mayúsculas.
		 */
		
		Scanner input = new Scanner(System.in);
		String cadena;
		
		System.out.println("Ingrese la cadena de caracteres: ");
		cadena = input.nextLine();
		
		if(cadena.toLowerCase() != cadena) { //Si la cadena la paso a minusculas Y es diferente a la cadena origial 
			System.out.println("Contiene letras mayúsculas"); //Pensando que la cadena origial contiene mayúsculas, entonces es porque
		}                                     // se están utilizando letras mayúsculas
		else {
			System.out.println("Todo son letras minúsculas"); //En cambio, si la cadena to lowe case coincide con la original es porque
		}                                     // solo se están utilizando minúsculas

	}

}
