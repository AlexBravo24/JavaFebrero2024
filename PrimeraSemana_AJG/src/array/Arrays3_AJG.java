package array;

import java.util.Scanner;

public class Arrays3_AJG {
    public static void main(String[] args) {
//    	. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//    	caracteres
    	
    	
        // Pide al usuario por teclado una frase
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = input.nextLine();

        // Pasa los caracteres de la frase a un array de caracteres
        char[] caracteres = frase.toCharArray();

        // Mostrar el array de caracteres
        System.out.println("Los caracteres de la frase son:");
        for (char c : caracteres) {
            System.out.println(c);
        }
    }
}
