package condicionales;

import java.util.Scanner;

public class Condicionales4_JAM {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que lea una cadena por teclado y compruebe si
		 * contiene letras may�sculas.
		 */
		
		Scanner input = new Scanner(System.in);
		String cadena;
		
		System.out.println("Ingrese la cadena de caracteres: ");
		cadena = input.nextLine();
		
		if(cadena.toLowerCase() != cadena) { //Si la cadena la paso a minusculas Y es diferente a la cadena origial 
			System.out.println("Contiene letras may�sculas"); //Pensando que la cadena origial contiene may�sculas, entonces es porque
		}                                     // se est�n utilizando letras may�sculas
		else {
			System.out.println("Todo son letras min�sculas"); //En cambio, si la cadena to lowe case coincide con la original es porque
		}                                     // solo se est�n utilizando min�sculas

	}

}
