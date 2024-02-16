package Arrays;

import java.util.Scanner;

public class Arrays3_JPS {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.
		
		 Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario que ingrese una frase
	        System.out.println("Ingrese una frase:");
	        String frase = scanner.nextLine();

	        // Convertir la frase en un array de caracteres
	        char[] caracteres = frase.toCharArray();

	        // Mostrar el array de caracteres por consola
	        System.out.println("La frase convertida en un array de caracteres es:");
	        for (int i = 0; i < caracteres.length; i++) {
	            System.out.print(caracteres[i] + " ");
	        }

	        scanner.close();
	    }

	}


