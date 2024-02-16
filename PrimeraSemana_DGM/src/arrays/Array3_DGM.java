package arrays;

import java.util.Scanner;

public class Array3_DGM {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		// caracteres.
		
	String frase ;
	char [] letra; 
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digita tu frase :");
	frase = entrada.nextLine();
	letra = frase.toCharArray();
	
	for (int i = 0; i < letra.length; i++) {
		System.out.println(letra[i]);
	}
	}

}
