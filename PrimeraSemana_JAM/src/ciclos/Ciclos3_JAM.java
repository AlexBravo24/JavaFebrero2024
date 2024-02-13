package ciclos;

import java.util.Scanner;

public class Ciclos3_JAM {

	public static void main(String[] args) {
		
		/*
		 * Realiza un programa para determinar si un String es palíndromo.
		 */
		
		Scanner input = new Scanner(System.in);
		String palabra,inversion;
		
		System.out.println("Ingrese la palabra: ");
		palabra = input.next().toLowerCase();
		inversion = "";
		
		for (int i = palabra.length()-1; i >= 0; i--) {
			
			inversion = inversion + palabra.charAt(i);
		}
		
		if (palabra.equals(inversion)){
			System.out.println("La palabra es un palíndromo");
		}else {
			System.out.println("La palabra no es un palíndromo");
		}
	}

}
