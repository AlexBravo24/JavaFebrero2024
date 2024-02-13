package ciclos;

import java.util.Scanner;

public class Ciclos3_IGV {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palindromo
		
		String palabra, inv;
		boolean i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una frase o una oracion");
		palabra = input.nextLine().toLowerCase();
		
		palabra = palabra.replace(" ", "");
		
		inv = new StringBuilder(palabra).reverse().toString();
		i = palabra.equals(inv);
		System.out.println(i);
	}

}
