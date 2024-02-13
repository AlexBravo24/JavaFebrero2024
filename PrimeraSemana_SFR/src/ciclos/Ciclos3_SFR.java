package ciclos;

import java.util.Scanner;

public class Ciclos3_SFR {

	
	public static void main(String[] args) {

		
		//3. Realiza un programa para determinar si un String es palíndromo.
		
		Scanner input = new Scanner(System.in);
		  System.out.print("Ingresa una palabra o frase: ");
	        String palabra = input.nextLine();
	        input.close();

	        
	        palabra = palabra.replaceAll("\\s+", "").toLowerCase();

	        
	        boolean esPalindromo = esPalindromo(palabra);

	        
	        if (esPalindromo) {
	            System.out.println("La palabra/frase es un palíndromo.");
	        } else {
	            System.out.println("La palabra/frase NO es un palíndromo.");
	        }
	    }

	    
	    public static boolean esPalindromo(String palabra) {
	        int longitud = palabra.length();
	        for (int i = 0; i < longitud / 2; i++) {
	            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
	                return false;
	            }
	        }
	        return true;
		
	
		
	}
	
}
