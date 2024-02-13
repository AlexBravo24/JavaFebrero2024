package arrays;

import java.util.Scanner;

public class array3_JAVM {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		Scanner input = new Scanner (System.in);

        
        System.out.print("Ingresa una frase: ");
        String frase = input.nextLine();

     
        char[] caracteres = frase.toCharArray();

   System.out.println(caracteres);
        System.out.println("Los caracteres de la frase son:");
        for (char c : caracteres) {
            System.out.println(c);
        }
    }


	}


