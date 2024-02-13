package ciclos;

import java.util.Scanner;

public class Ciclos3_DEOR {

	public static void main(String[] args) {
	
		//3. Realiza un programa para determinar si un String es palíndromo.
		
		String palabra, inv;
		boolean t;
		System.out.println("Escribe una palabra u oracion");
		Scanner input = new Scanner (System.in);
		palabra = input.nextLine().toLowerCase();
		palabra = palabra.replace(" ", "");
		
		inv = new StringBuilder(palabra).reverse().toString();
		System.out.println(inv);
		t = palabra.equals(inv);
		System.out.println(t);
		
		
	}
}
