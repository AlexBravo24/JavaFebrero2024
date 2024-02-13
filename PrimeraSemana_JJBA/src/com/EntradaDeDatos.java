package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Introducir valores por teclado
		
		//Primero declaramos la variable en la cual queremos guardar
		//un valor
		int edad;
		
		//Declarar una variable de la clase Scanner
		Scanner input = new Scanner(System.in);
		
		//Lo que tecleamos lo vamos a guardar en la variable edad
		System.out.println("Introduce tu edad");
		edad = input.nextInt();
		
		//Una vez almacenado el valor de la edad, puedo hacer con ella
		//lo que necesite, una operación, etc.
		
		System.out.println("Tu edad es: " + edad);
		
		//Ahora quiero solicitar la estatura
		//Podemos utilizar el mismo objeto Scanner
		System.out.println("Introduce tu estatura");
		double estatura = input.nextDouble();
		
		System.out.println("Tu estatura es " + estatura);
		
		
		
		

	}

}
