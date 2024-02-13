package arrays;

import java.util.Scanner;

public class Arrays3_DEOR {

	public static void main(String[] args) {
		
		//3. Pide al usuario por teclado una frase y pasa sus caracteres a 
		//un array de caracteres.
		
		int numero;
		String frase;
		System.out.println("Teclea una frase");
		Scanner input = new Scanner (System.in);
		frase = input.nextLine();
		char [] arreglo =frase.toCharArray();
		System.out.println("Teclea un numero");
		numero = input.nextInt();
		System.out.println(arreglo[numero-1]);
	
		
		
		
	}
}
