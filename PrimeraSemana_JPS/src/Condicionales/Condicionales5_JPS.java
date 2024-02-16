package Condicionales;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Condicionales5_JPS {

	public static void main(String[] args) {
		
		// Ejercicio 5 
		
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo.
         * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
         * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
         * Otros casos -> NO ACEPTADA
		 */
		
		// iniciamos declarando las variables donde queremos guardar los valores
		
		int nota;
		int edad;
		int sex;
		
			
		//Declarar una variable de la clase Scanner "
		Scanner main = new Scanner(System.in);
		
		//Lo que tecleamos lo vamos a guardar en la variable
		//Agregamos un titulo
		System.out.println("Hola envianos tu solicitud simulador");
		System.out.println(" ");
		System.out.println("Introduce tu notas sin decimales");
		nota = main.nextInt();
				
		//Una vez almacenado el valor de la nota, puedo hacer con 
		//ella lo ue necesite, una operacion,etc
		System.out.println("Tu nota es : " + (nota));
		
		//Ahora necesito solicitar la edad
		//Podemos usar el mismo objeto Scaner
		System.out.println("Introduce tu edad");
		edad = main.nextInt();
		
		System.out.println("Tu Edad es : " + (edad));
				
		//Ahora necesito solicitar el sexo
				//Podemos usar el mismo objeto Scaner
	    System.out.println("Selecciona tu sexo, teclea 1 para femenino o 2 para masculino y 0 para otros"); 
	    sex=main.nextInt();
	    
		int x = (sex);	
		
		if(x==1) {
			System.out.println("Su sexo es femenino");
		}else {
			System.out.println(" ");
		}
		if(x==2) {
			System.out.println("Su sexo es masculino");
		}else {
			System.out.println(" ");
		}
		
		 System.out.println("% de aceptacion");

				 
		  int v=2;{
			
			switch (sex) { 
			case 2:
			System.out.println(" 50% serias aceptado");
		    break;
			
		    case 1:
			System.out.println(" 80% si seras aceptado");
			break;
			
		    case 0:
		    	System.out.println("0% No serias aceptado");
			}

		  }
	}
}
