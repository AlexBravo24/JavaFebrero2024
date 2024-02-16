package Ciclos;

import java.util.Scanner;

public class Ciclos3_JPS {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		/*
		 * 3. Realiza un programa para determinar si un String es pal�ndromo.
		 */
		String palabra;

		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase para verificar si es un pal�ndromo:");
        String input = scanner.nextLine();
        
        if (esPalindromo(input)) {
            System.out.println("La palabra/frase es un pal�ndromo.");
        } else {
            System.out.println("La palabra/frase no es un pal�ndromo.");
        }
        
        
	}

	private static boolean esPalindromo(String str) {
		// TODO Auto-generated method stub
		 // Eliminamos los espacios en blanco y convertimos todo a min�sculas
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
        	
         if (str.charAt(i) != str.charAt(j)) {
		return false;
	}
         i++;
         j--;
        }
         return true;
	}
}