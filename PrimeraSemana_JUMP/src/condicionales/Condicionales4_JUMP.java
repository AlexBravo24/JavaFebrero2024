package condicionales;

import java.util.Scanner;

public class Condicionales4_JUMP {

	public static void main(String[] args) {
		
		// 4. Realiza un programa que lea una cadena 
		//por teclado y compruebe si contiene letras mayúsculas.

		 Scanner scanner = new Scanner(System.in);


	        System.out.print("Ingrese una cadena: ");
	        String cadena = scanner.nextLine();

            boolean contieneMayusculas = contieneMayusculas(cadena);

	        
	        if (contieneMayusculas) {
	            System.out.println("La cadena contiene letras mayúsculas.");
	        } else {
	            System.out.println("La cadena no contiene letras mayúsculas.");
	        }

	        scanner.close();
	    }

	    public static boolean contieneMayusculas(String cadena) {
	      
	        for (int i = 0; i < cadena.length(); i++) {
	            
	            if (Character.isUpperCase(cadena.charAt(i))) {
	                return true; 
	            }
	        }
	        return false; 

	}

}
