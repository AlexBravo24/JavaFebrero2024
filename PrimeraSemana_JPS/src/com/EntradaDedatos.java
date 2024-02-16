/**
 * 
 */
package com;

import java.util.Scanner;

/**
 * @author LENOVO
 *
 */
public class EntradaDedatos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Introducir valores por teclado
		
		//Primero declaramos la variable en la cual queremos 
		//guardar un valor
		int edad;
		
		//Declarar una variable de la clase Scanner 
		Scanner input = new Scanner(System.in);
		
		//Lo que tecleamos lo vamos a guardar en la variable edad
		System.out.println("Introduce tu edad");
		edad = input.nextInt();
		
		
			
		//Una vez almacenado el valor de la edad, puedo hacer con 
		//ella lo ue necesite, una operacion,etc
		System.out.println("Tu edad es: " + (edad));
		
		//Ahora necesito solicitar la estatura
		//Podemos usar el mismo objeto Scaner
		System.out.println("Introduce tu estatura en metros");
		double estatura = input.nextDouble();
		
		System.out.println("Tu estatura en metros es: " + estatura);
		

	}// cierre de main

}
