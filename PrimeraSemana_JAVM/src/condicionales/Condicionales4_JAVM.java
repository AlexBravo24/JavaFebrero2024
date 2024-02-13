package condicionales;

import java.util.Scanner;

public class Condicionales4_JAVM {

	public static void main(String[] args) {
		//4. Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		Scanner scanner = new Scanner (System.in);
	    String Palabra;
	
	   
	    System.out.print("Introduce la palabra que desees: ");
	    Palabra = scanner.nextLine();
	    
	
	   if (Palabra.toLowerCase().equals(Palabra )){
	   
	      System.out.println("La palabra no contiene  letras mayúscula");
	   
	    }else {
	        System.out.println("La palabra  contiene letras mayúscula.");
	 		  }
											}		
								 }


