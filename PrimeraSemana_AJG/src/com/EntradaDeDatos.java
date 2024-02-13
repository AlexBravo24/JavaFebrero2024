package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		/*
		 * Introducir valores por teclado
		 * 
		 * Primero declaramos la variable en la cual queremos 
		 * guardar un valor
		 * 		 */
		int edad;
		
		//declara una variable de la clase Scanner
		Scanner entrada = new Scanner(System.in);
		//Lo que tecleamos lo vamos a guardar en la variable edad
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		
		/*
		 * Una vez almacenado el valor de edad, puede hacer con ellaa lo
		 * que necesite, una operacion, etc.
		 */
		System.out.println("Tu edad es: " + edad);
		
		//Solicitar la Estatura
		//Podemosutilizar el mismo objeto Scanner
	
		System.out.println("Introduce tu estatura");
		double estatura = entrada.nextDouble();
		
		System.out.println("Tu estatura es: " + estatura);
	}

}
