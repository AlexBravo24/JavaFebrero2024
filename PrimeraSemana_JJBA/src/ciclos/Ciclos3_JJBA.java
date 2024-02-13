package ciclos;

import java.util.Scanner;

public class Ciclos3_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio3 - Realiza un programa para determinar si un String es palíndromo.

		Scanner input = new Scanner(System.in);
		
		System.out.println("Escriba una palabra o frase");
		
		String palabra, inv;
		boolean t;
		palabra = input.nextLine().toLowerCase();
		palabra = palabra.replace(" ", "");
		inv = new StringBuilder(palabra).reverse().toString();
		
		System.out.println(inv);
		
		t=palabra.equals(inv);
		
		System.out.println(t);
	

	
	}

}
