package arrays;

import java.util.Scanner;

public class Arrays3_IGV {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y 
		// pasa sus caracteres a un array de caracteres.
		
		String frase;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		frase = input.nextLine();
		frase = frase.replace(" ", "");
		frase = frase.toUpperCase();
		
		int ar = frase.length();
		
		char [] caracter = new char [frase.length()];
		for (int i = 0; i < ar; i++) {
			caracter[i] = frase.charAt(i);
			System.out.print(caracter[i] + ".");
			
		}
		
frase.replace(" ", "");
	}

}
