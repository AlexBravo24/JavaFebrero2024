package Condicionales;

import java.util.Scanner;

public class Condiciones_3JPS {

	public static void main(String[] args) {
		
		// Ejercicio 3 
		 /*
		  * .Crea un programa que pida al usuario dos números y muestre 
		  * el resultado de su división. Si el
		  * segundo número es 0, debe mostrar un mensaje de error.
		  */

		// Introducir valores por teclado
		
		//Primero declaramos la variable en la cual queremos 
		//guardar un valor
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Introduce el numerador");
		double numerador = input.nextDouble();
	
		System.out.println("El numerador es: " + (numerador));
		
		
		System.out.println("Introduce el denominador");
		double denominador  = input.nextDouble();
		
		System.out.println("El denominador es : " + (denominador));
		
		if(denominador > 0) {
			System.out.println("Resultado de la divicion : " + (numerador)/(denominador));
			
		} else {
			System.out.println("Error");
			
		}
		
		
		
		
	
		
	}

}
